/* The following code was generated by JFlex 1.6.1 */

import java.io.FileInputStream;
import java.io.Reader;
import java.io.InputStreamReader;

//to run code do this 
//jflex scanner.flex ; javac *.java ; java Yylex tests/test1.txt 


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>scanner.flex</tt>
 */
class Yylex {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int STRING = 2;
  public static final int STATE2 = 4;
  public static final int STATE3 = 6;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  2, 2
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\51\1\4\1\6\1\6\1\5\22\0\1\51\1\16\1\52"+
    "\2\0\1\12\1\17\1\54\1\21\1\22\1\11\1\7\1\26\1\10"+
    "\1\27\1\3\12\2\1\0\1\25\1\13\1\15\1\14\2\0\32\1"+
    "\1\0\1\53\2\0\1\1\1\0\1\35\1\40\1\1\1\45\1\33"+
    "\1\34\1\1\1\47\1\43\1\1\1\50\1\36\1\1\1\42\1\41"+
    "\2\1\1\31\1\37\1\30\1\32\1\44\1\46\3\1\1\23\1\20"+
    "\1\24\7\0\1\6\32\0\1\51\u15df\0\1\51\u097f\0\13\51\35\0"+
    "\1\6\1\6\5\0\1\51\57\0\1\51\u0fa0\0\1\51\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\ud00f\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\2\1\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\10\2\1\25"+
    "\1\26\1\27\1\26\1\30\1\26\1\31\1\32\1\33"+
    "\1\34\1\35\1\36\1\37\6\2\1\40\3\2\1\41"+
    "\1\42\1\43\1\44\1\45\1\46\1\47\1\50\6\2"+
    "\1\51\2\2\1\52\1\2\1\53\3\2\1\54\2\2"+
    "\1\55\1\56\1\2\1\57\1\60\1\2\1\61";

  private static int [] zzUnpackAction() {
    int [] result = new int[89];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\55\0\132\0\132\0\207\0\264\0\341\0\132"+
    "\0\132\0\132\0\132\0\132\0\u010e\0\u013b\0\u0168\0\u0195"+
    "\0\u01c2\0\u01ef\0\132\0\132\0\132\0\132\0\132\0\132"+
    "\0\132\0\u021c\0\u0249\0\u0276\0\u02a3\0\u02d0\0\u02fd\0\u032a"+
    "\0\u0357\0\132\0\132\0\132\0\u0384\0\132\0\u03b1\0\u03de"+
    "\0\132\0\132\0\132\0\132\0\132\0\132\0\u040b\0\u0438"+
    "\0\u0465\0\u0492\0\u04bf\0\u04ec\0\207\0\u0519\0\u0546\0\u0573"+
    "\0\132\0\132\0\132\0\132\0\132\0\132\0\132\0\132"+
    "\0\u05a0\0\u05cd\0\u05fa\0\u0627\0\u0654\0\u0681\0\207\0\u06ae"+
    "\0\u06db\0\207\0\u0708\0\207\0\u0735\0\u0762\0\u078f\0\207"+
    "\0\u07bc\0\u07e9\0\207\0\207\0\u0816\0\207\0\207\0\u0843"+
    "\0\207";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[89];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\4\1\5\1\6\1\7\3\10\1\11\1\12\1\13"+
    "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23"+
    "\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
    "\1\5\1\34\1\35\3\5\1\36\2\5\1\37\1\40"+
    "\1\5\1\41\2\5\1\10\1\42\2\4\4\43\1\44"+
    "\1\45\44\43\1\46\1\47\1\43\56\0\2\5\25\0"+
    "\21\5\6\0\1\6\55\0\1\50\66\0\1\51\54\0"+
    "\1\52\54\0\1\53\54\0\1\54\56\0\1\55\55\0"+
    "\1\56\35\0\2\5\25\0\1\5\1\57\17\5\5\0"+
    "\2\5\25\0\3\5\1\60\15\5\5\0\2\5\25\0"+
    "\6\5\1\61\12\5\5\0\2\5\25\0\5\5\1\62"+
    "\13\5\5\0\2\5\25\0\1\5\1\63\7\5\1\64"+
    "\7\5\5\0\2\5\25\0\4\5\1\65\5\5\1\66"+
    "\6\5\5\0\2\5\25\0\11\5\1\67\7\5\5\0"+
    "\2\5\25\0\17\5\1\70\1\5\10\0\1\44\100\0"+
    "\1\71\1\72\2\0\1\73\3\0\1\74\1\0\1\75"+
    "\7\0\1\76\1\77\1\100\4\50\3\0\46\50\1\0"+
    "\2\5\25\0\2\5\1\101\16\5\5\0\2\5\25\0"+
    "\1\102\20\5\5\0\2\5\25\0\7\5\1\103\11\5"+
    "\5\0\2\5\25\0\6\5\1\104\12\5\5\0\2\5"+
    "\25\0\3\5\1\105\15\5\5\0\2\5\25\0\11\5"+
    "\1\106\7\5\5\0\2\5\25\0\1\107\20\5\5\0"+
    "\2\5\25\0\13\5\1\110\5\5\5\0\2\5\25\0"+
    "\13\5\1\111\5\5\5\0\2\5\25\0\3\5\1\112"+
    "\15\5\5\0\2\5\25\0\2\5\1\113\16\5\5\0"+
    "\2\5\25\0\3\5\1\114\15\5\5\0\2\5\25\0"+
    "\7\5\1\115\11\5\5\0\2\5\25\0\5\5\1\116"+
    "\13\5\5\0\2\5\25\0\6\5\1\117\12\5\5\0"+
    "\2\5\25\0\15\5\1\120\3\5\5\0\2\5\25\0"+
    "\6\5\1\121\12\5\5\0\2\5\25\0\1\5\1\122"+
    "\17\5\5\0\2\5\25\0\3\5\1\123\15\5\5\0"+
    "\2\5\25\0\20\5\1\124\5\0\2\5\25\0\3\5"+
    "\1\125\15\5\5\0\2\5\25\0\3\5\1\126\15\5"+
    "\5\0\2\5\25\0\12\5\1\127\6\5\5\0\2\5"+
    "\25\0\5\5\1\130\13\5\5\0\2\5\25\0\12\5"+
    "\1\131\6\5\4\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2160];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\1\10\1\11\3\1\5\11\6\1\7\11\10\1"+
    "\3\11\1\1\1\11\2\1\6\11\12\1\10\11\31\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[89];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
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



  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Yylex(java.io.Reader in) {
  	yyline = 1;
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 190) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Token yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            switch (zzLexicalState) {
            case STRING: {
              error("string missing closing quote before End Of File", true);
            }
            case 90: break;
            default:
        return null;
        }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { error("Unknown character '" + yytext() + "'");
            }
          case 50: break;
          case 2: 
            { return token(TokenType.ID, yytext());
            }
          case 51: break;
          case 3: 
            { return token(TokenType.NUMBER, yytext());
            }
          case 52: break;
          case 4: 
            { return token(TokenType.DIV, yytext());
            }
          case 53: break;
          case 5: 
            { /* \s is a special character to match whitespace */
            }
          case 54: break;
          case 6: 
            { return token(TokenType.PLUS, yytext());
            }
          case 55: break;
          case 7: 
            { return token(TokenType.MINUS, yytext());
            }
          case 56: break;
          case 8: 
            { return token(TokenType.MULT, yytext());
            }
          case 57: break;
          case 9: 
            { return token(TokenType.MOD, yytext());
            }
          case 58: break;
          case 10: 
            { return token(TokenType.LT, yytext());
            }
          case 59: break;
          case 11: 
            { return token(TokenType.GT, yytext());
            }
          case 60: break;
          case 12: 
            { return token(TokenType.ASSIGN, yytext());
            }
          case 61: break;
          case 13: 
            { return token(TokenType.NOT, yytext());
            }
          case 62: break;
          case 14: 
            { return token(TokenType.RPAR, yytext());
            }
          case 63: break;
          case 15: 
            { return token(TokenType.LPAR, yytext());
            }
          case 64: break;
          case 16: 
            { return token(TokenType.LBRACE, yytext());
            }
          case 65: break;
          case 17: 
            { return token(TokenType.RBRACE, yytext());
            }
          case 66: break;
          case 18: 
            { return token(TokenType.SEMICOLON, yytext());
            }
          case 67: break;
          case 19: 
            { return token(TokenType.COMMA, yytext());
            }
          case 68: break;
          case 20: 
            { return token(TokenType.DOT, yytext());
            }
          case 69: break;
          case 21: 
            { m_accum = ""; 
  yybegin(STRING); /* switch into state STRING */
            }
          case 70: break;
          case 22: 
            { m_accum = m_accum + yytext();
            }
          case 71: break;
          case 23: 
            { error("string missing closing quote before newline", true);
            }
          case 72: break;
          case 24: 
            { yybegin(YYINITIAL);
    return token(TokenType.STRING, m_accum);
            }
          case 73: break;
          case 25: 
            { /* comment, everything after till the end of line is  considered a comment*/
            }
          case 74: break;
          case 26: 
            { return token(TokenType.LE, yytext());
            }
          case 75: break;
          case 27: 
            { return token(TokenType.GE, yytext());
            }
          case 76: break;
          case 28: 
            { return token(TokenType.EQTO, yytext());
            }
          case 77: break;
          case 29: 
            { return token(TokenType.NOTEQTO, yytext());
            }
          case 78: break;
          case 30: 
            { return token(TokenType.AND, yytext());
            }
          case 79: break;
          case 31: 
            { return token(TokenType.OR, yytext());
            }
          case 80: break;
          case 32: 
            { return token(TokenType.IF, yytext());
            }
          case 81: break;
          case 33: 
            { m_accum = m_accum + "\\t";
            }
          case 82: break;
          case 34: 
            { m_accum = m_accum + "\\r";
            }
          case 83: break;
          case 35: 
            { m_accum = m_accum + "\\f";
            }
          case 84: break;
          case 36: 
            { m_accum = m_accum + "\\b";
            }
          case 85: break;
          case 37: 
            { m_accum = m_accum + "\\n";
            }
          case 86: break;
          case 38: 
            { m_accum = m_accum + "\\\"";
            }
          case 87: break;
          case 39: 
            { m_accum = m_accum + "\\\\";
            }
          case 88: break;
          case 40: 
            { m_accum = m_accum + "\\\'";
            }
          case 89: break;
          case 41: 
            { return token(TokenType.INT, yytext());
            }
          case 90: break;
          case 42: 
            { return token(TokenType.TRUE, yytext());
            }
          case 91: break;
          case 43: 
            { return token(TokenType.ELSE, yytext());
            }
          case 92: break;
          case 44: 
            { return token(TokenType.VOID, yytext());
            }
          case 93: break;
          case 45: 
            { return token(TokenType.FALSE, yytext());
            }
          case 94: break;
          case 46: 
            { return token(TokenType.BREAK, yytext());
            }
          case 95: break;
          case 47: 
            { return token(TokenType.WHILE, yytext());
            }
          case 96: break;
          case 48: 
            { return token(TokenType.RETURN, yytext());
            }
          case 97: break;
          case 49: 
            { return token(TokenType.BOOL, yytext());
            }
          case 98: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
