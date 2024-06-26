// Generated from c://Users//User//Documents//Git//Clone//Analisador-Lexico-AVAJ//src//.antlr//Avaj.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class AvajLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TYPE=1, NUM=2, ATRIB=3, AP=4, FP=5, AC=6, FC=7, RET=8, OP=9, OPR=10, IN=11, 
		ID=12, OUT=13, STRING=14, COND=15, WHILE=16, WS=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TYPE", "NUM", "ATRIB", "AP", "FP", "AC", "FC", "RET", "OP", "OPR", "IN", 
			"ID", "OUT", "STRING", "COND", "WHILE", "WS", "CHAR", "DIGIT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'='", "'('", "')'", "'{'", "'}'", "'nruter'", null, 
			null, null, null, "'tnirp'", null, null, "'elihw'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TYPE", "NUM", "ATRIB", "AP", "FP", "AC", "FC", "RET", "OP", "OPR", 
			"IN", "ID", "OUT", "STRING", "COND", "WHILE", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public AvajLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Avaj.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0011\u00a1\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0003\u0000:\b\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0004\u0001?\b\u0001\u000b\u0001\f\u0001@\u0003\u0001C\b"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\ta\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000bn\b"+
		"\u000b\n\u000b\f\u000bq\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0005\r{\b\r\n\r\f\r~\t\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u008f\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0004\u0010\u0098\b\u0010\u000b"+
		"\u0010\f\u0010\u0099\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001|\u0000\u0013\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0000"+
		"%\u0000\u0001\u0000\u0005\u0003\u0000*+--//\u0002\u0000<<>>\u0003\u0000"+
		"\t\n\r\r  \u0002\u0000AZaz\u0001\u000009\u00ad\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0001"+
		"9\u0001\u0000\u0000\u0000\u0003;\u0001\u0000\u0000\u0000\u0005D\u0001"+
		"\u0000\u0000\u0000\u0007F\u0001\u0000\u0000\u0000\tH\u0001\u0000\u0000"+
		"\u0000\u000bJ\u0001\u0000\u0000\u0000\rL\u0001\u0000\u0000\u0000\u000f"+
		"N\u0001\u0000\u0000\u0000\u0011U\u0001\u0000\u0000\u0000\u0013`\u0001"+
		"\u0000\u0000\u0000\u0015b\u0001\u0000\u0000\u0000\u0017j\u0001\u0000\u0000"+
		"\u0000\u0019r\u0001\u0000\u0000\u0000\u001bx\u0001\u0000\u0000\u0000\u001d"+
		"\u008e\u0001\u0000\u0000\u0000\u001f\u0090\u0001\u0000\u0000\u0000!\u0097"+
		"\u0001\u0000\u0000\u0000#\u009d\u0001\u0000\u0000\u0000%\u009f\u0001\u0000"+
		"\u0000\u0000\'(\u0005t\u0000\u0000()\u0005n\u0000\u0000):\u0005i\u0000"+
		"\u0000*+\u0005t\u0000\u0000+,\u0005a\u0000\u0000,-\u0005o\u0000\u0000"+
		"-.\u0005l\u0000\u0000.:\u0005f\u0000\u0000/0\u0005g\u0000\u000001\u0005"+
		"n\u0000\u000012\u0005i\u0000\u000023\u0005r\u0000\u000034\u0005t\u0000"+
		"\u00004:\u0005s\u0000\u000056\u0005l\u0000\u000067\u0005o\u0000\u0000"+
		"78\u0005o\u0000\u00008:\u0005b\u0000\u00009\'\u0001\u0000\u0000\u0000"+
		"9*\u0001\u0000\u0000\u00009/\u0001\u0000\u0000\u000095\u0001\u0000\u0000"+
		"\u0000:\u0002\u0001\u0000\u0000\u0000;B\u0003%\u0012\u0000<>\u0005.\u0000"+
		"\u0000=?\u0003%\u0012\u0000>=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000"+
		"\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000AC\u0001\u0000"+
		"\u0000\u0000B<\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000C\u0004"+
		"\u0001\u0000\u0000\u0000DE\u0005=\u0000\u0000E\u0006\u0001\u0000\u0000"+
		"\u0000FG\u0005(\u0000\u0000G\b\u0001\u0000\u0000\u0000HI\u0005)\u0000"+
		"\u0000I\n\u0001\u0000\u0000\u0000JK\u0005{\u0000\u0000K\f\u0001\u0000"+
		"\u0000\u0000LM\u0005}\u0000\u0000M\u000e\u0001\u0000\u0000\u0000NO\u0005"+
		"n\u0000\u0000OP\u0005r\u0000\u0000PQ\u0005u\u0000\u0000QR\u0005t\u0000"+
		"\u0000RS\u0005e\u0000\u0000ST\u0005r\u0000\u0000T\u0010\u0001\u0000\u0000"+
		"\u0000UV\u0007\u0000\u0000\u0000V\u0012\u0001\u0000\u0000\u0000WX\u0005"+
		"=\u0000\u0000Xa\u0005=\u0000\u0000YZ\u0005!\u0000\u0000Za\u0005=\u0000"+
		"\u0000[a\u0007\u0001\u0000\u0000\\]\u0005<\u0000\u0000]a\u0005=\u0000"+
		"\u0000^_\u0005>\u0000\u0000_a\u0005=\u0000\u0000`W\u0001\u0000\u0000\u0000"+
		"`Y\u0001\u0000\u0000\u0000`[\u0001\u0000\u0000\u0000`\\\u0001\u0000\u0000"+
		"\u0000`^\u0001\u0000\u0000\u0000a\u0014\u0001\u0000\u0000\u0000bc\u0005"+
		"t\u0000\u0000cd\u0005u\u0000\u0000de\u0005p\u0000\u0000ef\u0005n\u0000"+
		"\u0000fg\u0005i\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0003\u0017\u000b"+
		"\u0000i\u0016\u0001\u0000\u0000\u0000jo\u0003#\u0011\u0000kn\u0003#\u0011"+
		"\u0000ln\u0003%\u0012\u0000mk\u0001\u0000\u0000\u0000ml\u0001\u0000\u0000"+
		"\u0000nq\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000"+
		"\u0000\u0000p\u0018\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000"+
		"rs\u0005t\u0000\u0000st\u0005n\u0000\u0000tu\u0005i\u0000\u0000uv\u0005"+
		"r\u0000\u0000vw\u0005p\u0000\u0000w\u001a\u0001\u0000\u0000\u0000x|\u0005"+
		"\"\u0000\u0000y{\t\u0000\u0000\u0000zy\u0001\u0000\u0000\u0000{~\u0001"+
		"\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000"+
		"}\u007f\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0005\"\u0000\u0000\u0080\u001c\u0001\u0000\u0000\u0000\u0081\u0082\u0005"+
		"f\u0000\u0000\u0082\u008f\u0005i\u0000\u0000\u0083\u0084\u0005e\u0000"+
		"\u0000\u0084\u0085\u0005s\u0000\u0000\u0085\u0086\u0005l\u0000\u0000\u0086"+
		"\u008f\u0005e\u0000\u0000\u0087\u0088\u0005e\u0000\u0000\u0088\u0089\u0005"+
		"s\u0000\u0000\u0089\u008a\u0005l\u0000\u0000\u008a\u008b\u0005e\u0000"+
		"\u0000\u008b\u008c\u0005 \u0000\u0000\u008c\u008d\u0005f\u0000\u0000\u008d"+
		"\u008f\u0005i\u0000\u0000\u008e\u0081\u0001\u0000\u0000\u0000\u008e\u0083"+
		"\u0001\u0000\u0000\u0000\u008e\u0087\u0001\u0000\u0000\u0000\u008f\u001e"+
		"\u0001\u0000\u0000\u0000\u0090\u0091\u0005e\u0000\u0000\u0091\u0092\u0005"+
		"l\u0000\u0000\u0092\u0093\u0005i\u0000\u0000\u0093\u0094\u0005h\u0000"+
		"\u0000\u0094\u0095\u0005w\u0000\u0000\u0095 \u0001\u0000\u0000\u0000\u0096"+
		"\u0098\u0007\u0002\u0000\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0098"+
		"\u0099\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099"+
		"\u009a\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b"+
		"\u009c\u0006\u0010\u0000\u0000\u009c\"\u0001\u0000\u0000\u0000\u009d\u009e"+
		"\u0007\u0003\u0000\u0000\u009e$\u0001\u0000\u0000\u0000\u009f\u00a0\u0007"+
		"\u0004\u0000\u0000\u00a0&\u0001\u0000\u0000\u0000\n\u00009@B`mo|\u008e"+
		"\u0099\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}