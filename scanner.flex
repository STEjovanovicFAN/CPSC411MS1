import java.io.FileInputStream;
import java.io.Reader;
import java.io.InputStreamReader;

//to run code do this 
//jflex scanner.flex ; javac *.java ; java Yylex tests/test1.txt 

%%

%{
  private String m_accum;
  private int error_counter = 0;

  public static void main(String argv[]) {
    if (argv.length == 0) {
      System.out.println("Usage : java Yylex [ --encoding <name> ] <inputfile(s)>");
    }
    else {
      int firstFilePos = 0;
      String encodingName = "UTF-8";
      if (argv[0].equals("--encoding")) {
        firstFilePos = 2;
        encodingName = argv[1];
        try {
          java.nio.charset.Charset.forName(encodingName); // Side-effect: is encodingName valid? 
        } catch (Exception e) {
          System.out.println("Invalid encoding '" + encodingName + "'");
          return;
        }
      }
      for (int i = firstFilePos; i < argv.length; i++) {
        Yylex scanner = null;
        try {
          java.io.FileInputStream stream = new java.io.FileInputStream(argv[i]);
          java.io.Reader reader = new java.io.InputStreamReader(stream, encodingName);
          scanner = new Yylex(reader);
          do {
            System.out.println(scanner.yylex());
          } while (!scanner.zzAtEOF);

        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }

//create token with a default value of ""
private Token token(TokenType type) {
	return new Token(type, "", yyline);
}

//overloaded Token method that creates a token with a specified value 
private Token token(TokenType type, String val) {
	return new Token(type, val, yyline);
}

//prints out error message and specifies at what line it found it at
private void error(String msg) {
  System.out.println("Error: " + msg + " at line " + Integer.toString(yyline));
  if(error_counter >= 10){
    System.out.println("Error: Too many errors at line " + Integer.toString(yyline) + ". Exiting program");
    System.exit(1);
  }

  error_counter++;
}

private void error(String msg, boolean exit) {
	System.out.println("Error: " + msg + " at line " + Integer.toString(yyline));
  if(exit){
     System.exit(1);
  }
  System.exit(0);
}

%}

%init{
	yyline = 1;
%init}

%type Token //defining return token type that yylex returns 

%line
%xstate STRING, STATE2, STATE3

ALPHA = [a-zA-Z] //Alphabetical letters (including both lowercase and uppercase) 
DIGIT = [0-9] //digit
UNDERSCORE = "_" //underscore character
%%

"//".* { /* comment, everything after till the end of line is  considered a comment*/}

"+"  {return token(TokenType.PLUS, yytext()); }
"-"  {return token(TokenType.MINUS, yytext());}
"*"  {return token(TokenType.MULT, yytext()); }
"/"  {return token(TokenType.DIV, yytext()); }
"%"  {return token(TokenType.MOD, yytext()); }
"<"  {return token(TokenType.LT, yytext()); }
">"  { return token(TokenType.GT, yytext());  }
"<=" {return token(TokenType.LE, yytext()); }
">=" { return token(TokenType.GE, yytext());  }
"="  { return token(TokenType.ASSIGN, yytext()); }
"==" { return token(TokenType.EQTO, yytext());  }
"!=" { return token(TokenType.NOTEQTO, yytext());  }
"!"  { return token(TokenType.NOT, yytext());  }
"&&" { return token(TokenType.AND, yytext());  }
"||" { return token(TokenType.OR, yytext());  }


"(" { return token(TokenType.RPAR, yytext());  }
")" { return token(TokenType.LPAR, yytext());  }
"{" { return token(TokenType.LBRACE, yytext());  }
"}" { return token(TokenType.RBRACE, yytext());  }
";" { return token(TokenType.SEMICOLON, yytext());  }
"," { return token(TokenType.COMMA, yytext());  }
"." { return token(TokenType.DOT, yytext()); }

"true" { return token(TokenType.TRUE, yytext()); }
"false" { return token(TokenType.FALSE, yytext()); }
"boolean" { return token(TokenType.BOOL, yytext()); }
"int" { return token(TokenType.INT, yytext()); }
"void" { return token(TokenType.VOID, yytext()); }
"if" { return token(TokenType.IF, yytext()); }
"else" { return token(TokenType.ELSE, yytext()); }
"while" { return token(TokenType.WHILE, yytext()); }
"break" { return token(TokenType.BREAK, yytext()); }
"return" { return token(TokenType.RETURN, yytext()); }

\s   {/* \s is a special character to match whitespace */}

({ALPHA}|{UNDERSCORE})({ALPHA}|{DIGIT}|{UNDERSCORE})*  { 
	return token(TokenType.ID, yytext());
}

{DIGIT}({DIGIT})* {
  return token(TokenType.NUMBER, yytext());
}

"\"" { 
  m_accum = ""; 
  yybegin(STRING); /* switch into state STRING */ 
}

<STRING>{
  [^\n\"]   { m_accum = m_accum + yytext(); }

  \n        { error("string missing closing quote before newline", true); }
  \r\n      { error("string missing closing quote before newline", true); }
  <<EOF>>   { error("string missing closing quote before End Of File", true); }

  "\""      { 
    yybegin(YYINITIAL);
    return token(TokenType.STRING, m_accum); 
  }

  \\b       {
    m_accum = m_accum + "\\b";
  }

  \\f       {
    m_accum = m_accum + "\\f"; 
  }

  \\t       {
    m_accum = m_accum + "\\t"; 
  }

  \\r       {
    m_accum = m_accum + "\\r"; 
  }

  \\n       {
    m_accum = m_accum + "\\n"; 
  }

  \\\'       {
    m_accum = m_accum + "\\\'"; 
  }

  \\\"       {
    m_accum = m_accum + "\\\""; 
  }

  \\\\       {
    m_accum = m_accum + "\\\\"; 
  }

}

[^]  { error("Unknown character '" + yytext() + "'"); }