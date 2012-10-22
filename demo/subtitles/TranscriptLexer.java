/* The following code was generated by JFlex 1.4.3 on 10/11/12 3:41 PM */

/**
 * Lexer for generation of transcript json from transcripts.
 */

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 10/11/12 3:41 PM from the specification file
 * <tt>TranscriptLexer.jflex</tt>
 */
class TranscriptLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int INTERVIEW = 4;
  public static final int FINISHED = 6;
  public static final int DATE = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3, 3
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\2\1\0\1\3\1\1\22\0\1\3\17\0\12\5"+
    "\1\7\6\0\32\4\6\0\32\4\57\0\1\4\12\0\1\4\4\0"+
    "\1\4\5\0\27\4\1\0\37\4\1\0\u013f\4\31\0\162\4\4\0"+
    "\14\4\16\0\5\4\11\0\1\4\213\0\1\4\13\0\1\4\1\0"+
    "\3\4\1\0\1\4\1\0\24\4\1\0\54\4\1\0\46\4\1\0"+
    "\5\4\4\0\202\4\10\0\105\4\1\0\46\4\2\0\2\4\6\0"+
    "\20\4\41\0\46\4\2\0\1\4\7\0\47\4\110\0\33\4\5\0"+
    "\3\4\56\0\32\4\5\0\13\4\25\0\12\6\4\0\2\4\1\0"+
    "\143\4\1\0\1\4\17\0\2\4\7\0\2\4\12\6\3\4\2\0"+
    "\1\4\20\0\1\4\1\0\36\4\35\0\3\4\60\0\46\4\13\0"+
    "\1\4\u0152\0\66\4\3\0\1\4\22\0\1\4\7\0\12\4\4\0"+
    "\12\6\25\0\10\4\2\0\2\4\2\0\26\4\1\0\7\4\1\0"+
    "\1\4\3\0\4\4\3\0\1\4\36\0\2\4\1\0\3\4\4\0"+
    "\12\6\2\4\23\0\6\4\4\0\2\4\2\0\26\4\1\0\7\4"+
    "\1\0\2\4\1\0\2\4\1\0\2\4\37\0\4\4\1\0\1\4"+
    "\7\0\12\6\2\0\3\4\20\0\11\4\1\0\3\4\1\0\26\4"+
    "\1\0\7\4\1\0\2\4\1\0\5\4\3\0\1\4\22\0\1\4"+
    "\17\0\2\4\4\0\12\6\25\0\10\4\2\0\2\4\2\0\26\4"+
    "\1\0\7\4\1\0\2\4\1\0\5\4\3\0\1\4\36\0\2\4"+
    "\1\0\3\4\4\0\12\6\1\0\1\4\21\0\1\4\1\0\6\4"+
    "\3\0\3\4\1\0\4\4\3\0\2\4\1\0\1\4\1\0\2\4"+
    "\3\0\2\4\3\0\3\4\3\0\10\4\1\0\3\4\55\0\11\6"+
    "\25\0\10\4\1\0\3\4\1\0\27\4\1\0\12\4\1\0\5\4"+
    "\46\0\2\4\4\0\12\6\25\0\10\4\1\0\3\4\1\0\27\4"+
    "\1\0\12\4\1\0\5\4\3\0\1\4\40\0\1\4\1\0\2\4"+
    "\4\0\12\6\25\0\10\4\1\0\3\4\1\0\27\4\1\0\20\4"+
    "\46\0\2\4\4\0\12\6\25\0\22\4\3\0\30\4\1\0\11\4"+
    "\1\0\1\4\2\0\7\4\72\0\60\4\1\0\2\4\14\0\7\4"+
    "\11\0\12\6\47\0\2\4\1\0\1\4\2\0\2\4\1\0\1\4"+
    "\2\0\1\4\6\0\4\4\1\0\7\4\1\0\3\4\1\0\1\4"+
    "\1\0\1\4\2\0\2\4\1\0\4\4\1\0\2\4\11\0\1\4"+
    "\2\0\5\4\1\0\1\4\11\0\12\6\2\0\2\4\42\0\1\4"+
    "\37\0\12\6\26\0\10\4\1\0\42\4\35\0\4\4\164\0\42\4"+
    "\1\0\5\4\1\0\2\4\25\0\12\6\6\0\6\4\112\0\46\4"+
    "\12\0\51\4\7\0\132\4\5\0\104\4\5\0\122\4\6\0\7\4"+
    "\1\0\77\4\1\0\1\4\1\0\4\4\2\0\7\4\1\0\1\4"+
    "\1\0\4\4\2\0\47\4\1\0\1\4\1\0\4\4\2\0\37\4"+
    "\1\0\1\4\1\0\4\4\2\0\7\4\1\0\1\4\1\0\4\4"+
    "\2\0\7\4\1\0\7\4\1\0\27\4\1\0\37\4\1\0\1\4"+
    "\1\0\4\4\2\0\7\4\1\0\47\4\1\0\23\4\16\0\11\6"+
    "\56\0\125\4\14\0\u026c\4\2\0\10\4\12\0\32\4\5\0\113\4"+
    "\25\0\15\4\1\0\4\4\16\0\22\4\16\0\22\4\16\0\15\4"+
    "\1\0\3\4\17\0\64\4\43\0\1\4\4\0\1\4\3\0\12\6"+
    "\46\0\12\6\6\0\130\4\10\0\51\4\127\0\35\4\51\0\12\6"+
    "\36\4\2\0\5\4\u038b\0\154\4\224\0\234\4\4\0\132\4\6\0"+
    "\26\4\2\0\6\4\2\0\46\4\2\0\6\4\2\0\10\4\1\0"+
    "\1\4\1\0\1\4\1\0\1\4\1\0\37\4\2\0\65\4\1\0"+
    "\7\4\1\0\1\4\3\0\3\4\1\0\7\4\3\0\4\4\2\0"+
    "\6\4\4\0\15\4\5\0\3\4\1\0\7\4\164\0\1\4\15\0"+
    "\1\4\202\0\1\4\4\0\1\4\2\0\12\4\1\0\1\4\3\0"+
    "\5\4\6\0\1\4\1\0\1\4\1\0\1\4\1\0\4\4\1\0"+
    "\3\4\1\0\7\4\3\0\3\4\5\0\5\4\u0ebb\0\2\4\52\0"+
    "\5\4\5\0\2\4\4\0\126\4\6\0\3\4\1\0\132\4\1\0"+
    "\4\4\5\0\50\4\4\0\136\4\21\0\30\4\70\0\20\4\u0200\0"+
    "\u19b6\4\112\0\u51a6\4\132\0\u048d\4\u0773\0\u2ba4\4\u215c\0\u012e\4\2\0"+
    "\73\4\225\0\7\4\14\0\5\4\5\0\1\4\1\0\12\4\1\0"+
    "\15\4\1\0\5\4\1\0\1\4\1\0\2\4\1\0\2\4\1\0"+
    "\154\4\41\0\u016b\4\22\0\100\4\2\0\66\4\50\0\14\4\164\0"+
    "\5\4\1\0\207\4\23\0\12\6\7\0\32\4\6\0\32\4\13\0"+
    "\131\4\3\0\6\4\2\0\6\4\2\0\6\4\2\0\3\4\43\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\4\0\1\1\2\2\1\3\1\4\1\3\1\5\1\3"+
    "\1\5\1\6\1\5\1\7\1\0\1\10\1\0\1\5"+
    "\1\0\1\5\1\0\1\5\1\0\1\5\1\0\1\5"+
    "\1\0\1\5\2\11";

  private static int [] zzUnpackAction() {
    int [] result = new int[32];
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
    "\0\0\0\10\0\20\0\30\0\40\0\50\0\60\0\40"+
    "\0\70\0\70\0\100\0\60\0\110\0\120\0\130\0\60"+
    "\0\100\0\100\0\140\0\150\0\160\0\170\0\200\0\210"+
    "\0\220\0\230\0\240\0\250\0\260\0\270\0\60\0\100";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[32];
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
    "\1\5\1\6\1\7\1\10\4\5\1\11\1\6\1\7"+
    "\1\12\4\11\1\13\1\6\1\7\1\14\1\15\1\16"+
    "\1\17\1\13\10\20\1\5\2\0\5\5\2\0\1\7"+
    "\15\0\1\11\2\0\5\11\1\13\2\0\1\21\5\13"+
    "\2\0\1\21\1\22\3\13\5\0\2\23\1\0\1\13"+
    "\2\0\1\21\1\13\2\24\1\13\7\0\1\25\1\13"+
    "\2\0\1\21\3\13\1\26\5\0\2\27\1\0\1\13"+
    "\2\0\1\21\1\13\2\30\1\13\5\0\2\31\1\0"+
    "\1\13\2\0\1\21\1\13\2\32\1\13\7\0\1\33"+
    "\1\13\2\0\1\21\3\13\1\34\5\0\2\35\1\0"+
    "\1\13\2\0\1\21\1\13\2\36\1\13\5\0\2\37"+
    "\1\0\1\13\2\0\1\21\1\13\2\40\1\13";

  private static int [] zzUnpackTrans() {
    int [] result = new int[192];
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
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\4\0\2\1\1\11\4\1\1\11\3\1\1\11\1\0"+
    "\1\1\1\0\1\1\1\0\1\1\1\0\1\1\1\0"+
    "\1\1\1\0\1\1\1\0\1\1\1\11\1\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[32];
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

  /* user code: */
    // This is verbatim code for the TranscriptLexer class.
    public static class Utterance {
        public Utterance(String speaker, String timestamp) {
            this.speaker = speaker;
            this.timestamp = timestamp;
            this.utterance = null;
        }

        public void appendUtterance(String utterance) {
            if (this.utterance == null) {
                this.utterance = utterance;
            } else {
                this.utterance = this.utterance + " " + utterance;
            }
        }

        public String speaker;
        public String timestamp;
        public String utterance;
    };
    public static final String INDENT = "    ";

    public String title;
    public String date;
    public List<Utterance> interview = new ArrayList<Utterance>();

    private String currentSpeaker = null;
    private Utterance currentUtterance = null;

    private void printField(PrintStream out, int indent, String label, String value) {
        printIndent(out, indent);
        printFieldLabel(out, label);
        printFieldValue(out, value);
    }

    private void printFieldC(PrintStream out, int indent, String label, String value) {
        printField(out, indent, label, value);
        printObjectComma(out);
    }

    private void printIndent(PrintStream out, int indent) {
        for (int i = 0; i < indent; i++) out.print(INDENT);
    }

    private void printFieldLabel(PrintStream out, String label) {
        out.printf("\"%s\": ", label);
    }

    private void printFieldValue(PrintStream out, String value) {
        out.printf("\"%s\"", value);
    }

    private void printObjectComma(PrintStream out) {
        out.println(",");
    }

    private void printJson(PrintStream out) {
        out.println("{");
        printFieldC(out, 1, "title", title);
        printFieldC(out, 1, "date", date);
        printIndent(out, 1);
        printFieldLabel(out, "exchanges");
        out.println("[");
        boolean isFirst = true;
        for (Utterance utterance : interview) {
            if (isFirst) {
                isFirst = false;
            } else {
                printObjectComma(out);
            }
            printIndent(out, 2);
            out.println("{");
            printFieldC(out, 3, "speaker", utterance.speaker);
            printFieldC(out, 3, "time", utterance.timestamp);
            printField(out, 3, "transcript", utterance.utterance);
            out.println("");
            printIndent(out, 2);
            out.print("}");
        }
        out.println("");
        printIndent(out, 1);
        out.println("]");
        out.println("}");
    }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  TranscriptLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  TranscriptLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 1200) {
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
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
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
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
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
  public int yylex() throws java.io.IOException {
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
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
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


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
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
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 5: 
          { if (yytext().trim().equals("END OF TRANSCRIPT")) {
                                yybegin(FINISHED);
                            } else {
                                String utterance = yytext().trim();
                                utterance = utterance.replace("\"", "\\\"");
                                utterance = utterance.replace("\\s\\s*", " ");
                                currentUtterance.appendUtterance(utterance);
                            }
          }
        case 10: break;
        case 4: 
          { yybegin(INTERVIEW);
                            date = yytext();
          }
        case 11: break;
        case 7: 
          { /* Ignore everything, we are finished. */
          }
        case 12: break;
        case 9: 
          { if (currentSpeaker == null)
                                throw new IllegalStateException("Error at line " + yyline +
                                    ": Utterance without current speaker");

                            if (currentUtterance != null && currentUtterance.utterance == null)
                                throw new IllegalStateException("Error at line " + yyline +
                                    "(" + yytext() + ")" +
                                    ": New utterance detected before old utterance completed");

                            currentUtterance = new Utterance(currentSpeaker, yytext().trim());
                            interview.add(currentUtterance);
          }
        case 13: break;
        case 3: 
          { /* Ignore whitespace */
          }
        case 14: break;
        case 6: 
          { throw new IllegalStateException("No interview found at line " +
                                yyline + ", column " + yycolumn);
          }
        case 15: break;
        case 8: 
          { currentSpeaker = yytext();
          }
        case 16: break;
        case 1: 
          { yybegin(DATE);
                            title = yytext();
          }
        case 17: break;
        case 2: 
          { /* Ignore line endings */
          }
        case 18: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            switch (zzLexicalState) {
            case INTERVIEW: {
              printJson(System.out);
                            System.out.flush();
                            System.exit(0);
            }
            case 33: break;
            case FINISHED: {
              printJson(System.out);
                            System.out.flush();
                            System.exit(0);
            }
            case 34: break;
            default:
            return YYEOF;
            }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }

  /**
   * Runs the scanner on input files.
   *
   * This is a standalone scanner, it will print any unmatched
   * text to System.out unchanged.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String argv[]) {
    if (argv.length == 0) {
      System.out.println("Usage : java TranscriptLexer <inputfile>");
    }
    else {
      for (int i = 0; i < argv.length; i++) {
        TranscriptLexer scanner = null;
        try {
          scanner = new TranscriptLexer( new java.io.FileReader(argv[i]) );
          while ( !scanner.zzAtEOF ) scanner.yylex();
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


}
