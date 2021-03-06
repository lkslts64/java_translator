
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

import java_cup.runtime.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\036\000\002\002\004\000\002\002\004\000\002\003" +
    "\004\000\002\003\002\000\002\004\004\000\002\004\002" +
    "\000\002\005\005\000\002\014\003\000\002\017\004\000" +
    "\002\006\005\000\002\012\005\000\002\012\004\000\002" +
    "\013\005\000\002\013\003\000\002\007\005\000\002\007" +
    "\005\000\002\007\004\000\002\010\005\000\002\010\005" +
    "\000\002\010\003\000\002\021\005\000\002\021\003\000" +
    "\002\021\003\000\002\021\003\000\002\015\003\000\002" +
    "\015\003\000\002\011\005\000\002\011\005\000\002\016" +
    "\007\000\002\020\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\072\000\006\002\ufffe\017\ufffe\001\002\000\006\002" +
    "\ufffc\017\010\001\002\000\004\002\006\001\002\000\004" +
    "\002\001\001\002\000\006\002\ufffc\017\073\001\002\000" +
    "\004\012\016\001\002\000\004\002\000\001\002\000\006" +
    "\002\ufffa\017\ufffa\001\002\000\006\002\uffff\017\uffff\001" +
    "\002\000\004\014\067\001\002\000\024\002\ufff9\005\ufff9" +
    "\006\ufff9\007\ufff9\010\ufff9\011\ufff9\013\ufff9\015\ufff9\017" +
    "\ufff9\001\002\000\012\004\026\011\020\016\024\017\017" +
    "\001\002\000\012\010\uffe8\011\063\012\047\015\062\001" +
    "\002\000\010\002\ufff1\014\ufff6\017\ufff1\001\002\000\020" +
    "\005\uffea\006\uffea\007\uffea\010\uffea\011\uffea\013\uffea\015" +
    "\uffea\001\002\000\020\005\uffeb\006\uffeb\007\uffeb\010\uffeb" +
    "\011\uffeb\013\uffeb\015\uffeb\001\002\000\010\010\uffe9\011" +
    "\053\015\052\001\002\000\020\005\uffec\006\uffec\007\uffec" +
    "\010\uffec\011\uffec\013\uffec\015\uffec\001\002\000\004\010" +
    "\034\001\002\000\004\012\027\001\002\000\010\004\026" +
    "\016\024\017\030\001\002\000\022\005\uffe8\006\uffe8\007" +
    "\uffe8\010\uffe8\011\uffe8\012\047\013\uffe8\015\uffe8\001\002" +
    "\000\004\011\042\001\002\000\020\005\uffe9\006\uffe9\007" +
    "\uffe9\010\uffe9\011\uffe9\013\uffe9\015\uffe9\001\002\000\010" +
    "\006\035\007\036\010\034\001\002\000\010\004\026\016" +
    "\024\017\030\001\002\000\010\004\026\016\024\017\030" +
    "\001\002\000\010\004\026\016\024\017\030\001\002\000" +
    "\006\010\034\011\uffe6\001\002\000\006\010\034\011\uffe7" +
    "\001\002\000\020\005\uffed\006\uffed\007\uffed\010\uffed\011" +
    "\uffed\013\uffed\015\uffed\001\002\000\010\004\026\016\024" +
    "\017\030\001\002\000\006\005\045\010\034\001\002\000" +
    "\020\005\uffe5\006\uffe5\007\uffe5\010\uffe5\011\uffe5\013\uffe5" +
    "\015\uffe5\001\002\000\010\004\026\016\024\017\030\001" +
    "\002\000\020\005\uffe4\006\uffe4\007\uffe4\010\034\011\uffe4" +
    "\013\uffe4\015\uffe4\001\002\000\012\004\026\011\051\016" +
    "\024\017\050\001\002\000\012\010\uffe8\011\053\012\047" +
    "\015\052\001\002\000\024\002\ufff1\005\ufff1\006\ufff1\007" +
    "\ufff1\010\ufff1\011\ufff1\013\ufff1\015\ufff1\017\ufff1\001\002" +
    "\000\010\004\026\016\024\017\055\001\002\000\024\002" +
    "\uffee\005\uffee\006\uffee\007\uffee\010\uffee\011\uffee\013\uffee" +
    "\015\uffee\017\uffee\001\002\000\024\002\ufff2\005\ufff2\006" +
    "\ufff2\007\ufff2\010\ufff2\011\ufff2\013\ufff2\015\ufff2\017\ufff2" +
    "\001\002\000\012\010\uffe8\011\053\012\047\015\052\001" +
    "\002\000\010\010\uffe9\011\053\015\052\001\002\000\024" +
    "\002\ufff0\005\ufff0\006\ufff0\007\ufff0\010\ufff0\011\ufff0\013" +
    "\ufff0\015\ufff0\017\ufff0\001\002\000\024\002\uffef\005\uffef" +
    "\006\uffef\007\uffef\010\uffef\011\uffef\013\uffef\015\uffef\017" +
    "\uffef\001\002\000\024\002\ufff3\005\ufff3\006\ufff3\007\ufff3" +
    "\010\ufff3\011\ufff3\013\ufff3\015\ufff3\017\ufff3\001\002\000" +
    "\010\004\026\016\024\017\065\001\002\000\010\002\uffee" +
    "\014\ufff4\017\uffee\001\002\000\004\014\ufff7\001\002\000" +
    "\012\010\uffe8\011\063\012\047\015\062\001\002\000\004" +
    "\014\ufff5\001\002\000\010\004\026\016\024\017\030\001" +
    "\002\000\006\002\ufffb\017\ufffb\001\002\000\006\010\034" +
    "\013\072\001\002\000\006\002\ufff8\017\ufff8\001\002\000" +
    "\004\012\047\001\002\000\004\002\ufffd\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\072\000\006\002\004\003\003\001\001\000\012\004" +
    "\010\005\012\014\006\017\011\001\001\000\002\001\001" +
    "\000\002\001\001\000\010\004\073\014\006\017\011\001" +
    "\001\000\006\007\014\012\013\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\006\067\001" +
    "\001\000\002\001\001\000\012\015\024\016\020\017\021" +
    "\021\022\001\001\000\010\007\014\010\053\013\063\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\010\060\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\014\011\030\015\032\016\020" +
    "\017\021\021\031\001\001\000\004\007\014\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\012" +
    "\015\040\016\020\017\021\021\031\001\001\000\012\015" +
    "\037\016\020\017\021\021\031\001\001\000\012\015\036" +
    "\016\020\017\021\021\031\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\014\015\042\016\020" +
    "\017\021\020\043\021\031\001\001\000\002\001\001\000" +
    "\002\001\001\000\012\015\045\016\020\017\021\021\031" +
    "\001\001\000\002\001\001\000\012\015\024\016\020\017" +
    "\021\021\022\001\001\000\006\007\014\010\053\001\001" +
    "\000\002\001\001\000\012\015\024\016\020\017\021\021" +
    "\055\001\001\000\002\001\001\000\002\001\001\000\006" +
    "\007\014\010\057\001\001\000\004\010\056\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\012" +
    "\015\024\016\020\017\021\021\055\001\001\000\002\001" +
    "\001\000\002\001\001\000\010\007\014\010\057\013\065" +
    "\001\001\000\002\001\001\000\012\015\070\016\020\017" +
    "\021\021\031\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\007\014\001\001\000\002\001" +
    "\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  /** Scan to get the next Symbol. */
  public java_cup.runtime.Symbol scan()
    throws java.lang.Exception
    {
 return s.next_token(); 
    }


    // Connect this parser to a scanner!
    Scanner s;
	Parser(Scanner s){ this.s=s; }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action_part00000000(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= program EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String start_val = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // program ::= defs calls 
            {
              String RESULT =null;
		int d1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int d1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String d1 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int c1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int c1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String c1 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = "public class Main {\n" + "\tpublic static void main(String []args) {\n" + c1 + "\t}\n" + d1 +  "\n}";System.out.println(RESULT); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("program",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // defs ::= defs def 
            {
              String RESULT =null;
		int def1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int def1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String def1 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int def2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int def2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String def2 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = def1 + def2; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("defs",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // defs ::= 
            {
              String RESULT =null;
		 RESULT = ""; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("defs",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // calls ::= call_print calls 
            {
              String RESULT =null;
		int c1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int c1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String c1 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int c2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int c2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String c2 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = c1 + c2; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("calls",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // calls ::= 
            {
              String RESULT =null;
		 RESULT = "";	
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("calls",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // def ::= ID arg_list_d block 
            {
              String RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int argleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int argright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String arg = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int blckleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int blckright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String blck = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = "\tpublic static String " + id + arg + blck + "\n"; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("def",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // call_print ::= call 
            {
              String RESULT =null;
		int c1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int c1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String c1 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = "\t\tSystem.out.println( " + c1 + ");\n"; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("call_print",10, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // call ::= ID arg_list 
            {
              String RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int argleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int argright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String arg = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = id + arg ; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("call",13, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // block ::= LBRACK expr RBRACK 
            {
              String RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String e1 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 RESULT =" {\n\t\treturn " + e1 + ";\n\t}"; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("block",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // arg_list_d ::= LPAREN ID arg_list2_d 
            {
              String RESULT =null;
		int identleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int identright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String ident = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int argleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int argright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String arg = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = "(String" + " " + ident + arg  ; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("arg_list_d",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // arg_list_d ::= LPAREN RPAREN 
            {
              String RESULT =null;
		 RESULT = "()"; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("arg_list_d",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // arg_list2_d ::= COMMA ID arg_list2_d 
            {
              String RESULT =null;
		int identleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int identright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String ident = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int argleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int argright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String arg = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = "," + "String" + " " + ident + arg; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("arg_list2_d",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // arg_list2_d ::= RPAREN 
            {
              String RESULT =null;
		 RESULT =  ")"; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("arg_list2_d",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // arg_list ::= LPAREN expr_without_ID arg_list2 
            {
              String RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String e1 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int argleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int argright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String arg = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = "(" + e1 + arg ; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("arg_list",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // arg_list ::= LPAREN ID arg_list2 
            {
              String RESULT =null;
		int identleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int identright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String ident = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int argleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int argright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String arg = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = "(" + ident + arg; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("arg_list",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // arg_list ::= LPAREN RPAREN 
            {
              String RESULT =null;
		 RESULT = "()"; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("arg_list",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // arg_list2 ::= COMMA expr_without_ID arg_list2 
            {
              String RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String e1 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int argleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int argright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String arg = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT =  "," + e1 + arg; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("arg_list2",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // arg_list2 ::= COMMA ID arg_list2 
            {
              String RESULT =null;
		int identleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int identright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String ident = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int argleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int argright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String arg = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT =  "," + ident + arg; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("arg_list2",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // arg_list2 ::= RPAREN 
            {
              String RESULT =null;
		 RESULT = ")"; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("arg_list2",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // expr_without_ID ::= expr PLUS expr 
            {
              String RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		String e1 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String e2 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = e1  + " + " + e2; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr_without_ID",15, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // expr_without_ID ::= STRING_LITERAL 
            {
              String RESULT =null;
		int strleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int strright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String str = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = '\"' + str + '\"'; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr_without_ID",15, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // expr_without_ID ::= call 
            {
              String RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = c ; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr_without_ID",15, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // expr_without_ID ::= if_else 
            {
              String RESULT =null;
		int ieleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int ieright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String ie = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT =  "(" + ie + ")"   ; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr_without_ID",15, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // expr ::= expr_without_ID 
            {
              String RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String e1 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = e1; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",11, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // expr ::= ID 
            {
              String RESULT =null;
		int identleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int identright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String ident = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = ident; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",11, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // logical ::= expr PREFIX expr 
            {
              String RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		String e1 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String e2 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = "(" + e2 +  ")" + ".startsWith(" + e1 + ")"; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("logical",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // logical ::= expr SUFFIX expr 
            {
              String RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		String e1 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String e2 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT =  "(" + e2 +  ")" + ".endsWith(" + e1 + ")" ; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("logical",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // if_else ::= IF LPAREN logical RPAREN else 
            {
              String RESULT =null;
		int logleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int logright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		String log = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int elleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int elright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String el = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT =  "(" + log + ") ?" + el  ; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("if_else",12, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // else ::= expr ELSE expr 
            {
              String RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		String e1 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String e2 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = e1 + ":" + e2 ; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("else",14, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
              return CUP$Parser$do_action_part00000000(
                               CUP$Parser$act_num,
                               CUP$Parser$parser,
                               CUP$Parser$stack,
                               CUP$Parser$top);
    }
}

}
