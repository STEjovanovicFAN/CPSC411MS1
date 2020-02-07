// Declare enum for Token identification
public enum TokenType {
    //Operators
    PLUS,
    MINUS,
    MULT,
    DIV,
    MOD,
    LT,
    GT,
    LE,
    GE,
    ASSIGN,
    EQTO,
    NOTEQTO,
    NOT,
    AND,
    OR,

    //Braces
    RPAR,
    LPAR,
    LBRACE,
    RBRACE,

    //Symbols 
    SEMICOLON,
    COMMA,
    DOT,

    //Reserved words
    TRUE,
    FALSE, 
    BOOL,
    INT, 
    VOID, 
    IF,
    ELSE, 
    WHILE,
    BREAK,
    RETURN,

    //Digits
    NUMBER,

	BEGIN,
	END,
	ID,
	STRING
}
