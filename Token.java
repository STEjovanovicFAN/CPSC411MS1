public class Token {
	TokenType type;
	String val;
	int lineno;
	
	Token(TokenType t, String v, int l) {
		this.type = t;
		this.val = v;
		this.lineno = l;
	}

	// Required to token printing
	public String toString() {
		return "Token(" + type.name() + ", " + Integer.toString(lineno) + ", " + val + ")";
	}
}
