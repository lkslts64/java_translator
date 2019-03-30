import java_cup.runtime.*;

%%

%class Scanner
%unicode
%cup
%line
%column


%{
      StringBuffer string = new StringBuffer();

      private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
      }
      private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
      }
%}

LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
WhiteSpace     = {LineTerminator} | [ \t\f]


/* comments */
Comment = {TraditionalComment} | {EndOfLineComment}

TraditionalComment   = "/*" [^*] ~"*/" | "/*" "*"+ "/"
// Comment can be the last line of the file, without line terminator.
EndOfLineComment     = "//" {InputCharacter}* {LineTerminator}?


Identifier = [:jletter:] [:jletterdigit:]*

%state STRING

%%


/* keywords */

<YYINITIAL> "if" 		{return symbol(sym.IF); }
<YYINITIAL> "else"		{return symbol(sym.ELSE);}	
<YYINITIAL> "prefix" 	{return symbol(sym.PREFIX); }
<YYINITIAL> "suffix"	{return symbol(sym.SUFFIX); }

<YYINITIAL> {

	{Identifier}		{return symbol(sym.ID,yytext());}


	/* operators */
	"+"					{return symbol(sym.PLUS); }
	")"					{return symbol(sym.RPAREN); }
	"("					{return symbol(sym.LPAREN); }	
	"}"					{return symbol(sym.RBRACK); }
	"{"					{return symbol(sym.LBRACK); }
	","					{return symbol(sym.COMMA); }
    \"                  { string.setLength(0); yybegin(STRING);}	//change to STRING state when you see '"' character.
	{Comment}			{ }

	{WhiteSpace}		{ }
}

<STRING> {
      \"                             { yybegin(YYINITIAL); 
                                       return symbol(sym.STRING_LITERAL, 
                                       string.toString()); }				//return to YYINITIAL state when you see the second " character ( means string is over).
      [^\"]+                   { string.append( yytext() ); }

	  /* we dont want to evaluate "\n" as '\' + 'n' so we stop and append it as one character e.g '\n'. Same thing happens with \t, \r , " and \ 
	  	
	
      \\t                            { string.append('\t'); }
      \\n                            { string.append('\n'); }

      \\r                            { string.append('\r'); }
      \\\"                           { string.append('\"'); }
      \\                             { string.append('\\'); }

	  */
}

    /* error fallback */
    [^]                              { throw new Error("Illegal character <"+
                                                        yytext()+">"); }

