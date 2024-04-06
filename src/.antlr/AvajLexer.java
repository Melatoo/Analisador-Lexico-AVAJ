// Generated from c:/Users/davi/programming/compiladores/Analisador-Lexico-AVAJ/src/Avaj.g4 by ANTLR 4.13.1
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
		TYPE=1, STRING=2, ATRIB=3, AP=4, FP=5, AC=6, FC=7, OP=8, OPR=9, IN=10, 
		OUT=11, RET=12, COND=13, WHILE=14, NUM=15, ID=16, WS=17, ERROR=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TYPE", "STRING", "ATRIB", "AP", "FP", "AC", "FC", "OP", "OPR", "IN", 
			"OUT", "RET", "COND", "WHILE", "NUM", "ID", "WS", "ERROR", "CHAR", "DIGIT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'='", "'('", "')'", "'{'", "'}'", null, null, "'tupni'", 
			"'tnirp'", "'nruter'", null, "'elihw'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TYPE", "STRING", "ATRIB", "AP", "FP", "AC", "FC", "OP", "OPR", 
			"IN", "OUT", "RET", "COND", "WHILE", "NUM", "ID", "WS", "ERROR"
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
		"\u0004\u0000\u0012\u00a3\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000<\b\u0000"+
		"\u0001\u0001\u0001\u0001\u0005\u0001@\b\u0001\n\u0001\f\u0001C\t\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\b\\\b\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f~\b\f\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0004"+
		"\u000e\u0089\b\u000e\u000b\u000e\f\u000e\u008a\u0003\u000e\u008d\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0092\b\u000f\n\u000f"+
		"\f\u000f\u0095\t\u000f\u0001\u0010\u0004\u0010\u0098\b\u0010\u000b\u0010"+
		"\f\u0010\u0099\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001A\u0000\u0014\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0000\'\u0000\u0001\u0000\u0005\u0003\u0000*+--//\u0002"+
		"\u0000<<>>\u0003\u0000\t\n\r\r  \u0002\u0000AZaz\u0001\u000009\u00af\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0001;\u0001\u0000\u0000"+
		"\u0000\u0003=\u0001\u0000\u0000\u0000\u0005F\u0001\u0000\u0000\u0000\u0007"+
		"H\u0001\u0000\u0000\u0000\tJ\u0001\u0000\u0000\u0000\u000bL\u0001\u0000"+
		"\u0000\u0000\rN\u0001\u0000\u0000\u0000\u000fP\u0001\u0000\u0000\u0000"+
		"\u0011[\u0001\u0000\u0000\u0000\u0013]\u0001\u0000\u0000\u0000\u0015c"+
		"\u0001\u0000\u0000\u0000\u0017i\u0001\u0000\u0000\u0000\u0019}\u0001\u0000"+
		"\u0000\u0000\u001b\u007f\u0001\u0000\u0000\u0000\u001d\u0085\u0001\u0000"+
		"\u0000\u0000\u001f\u008e\u0001\u0000\u0000\u0000!\u0097\u0001\u0000\u0000"+
		"\u0000#\u009d\u0001\u0000\u0000\u0000%\u009f\u0001\u0000\u0000\u0000\'"+
		"\u00a1\u0001\u0000\u0000\u0000)*\u0005t\u0000\u0000*+\u0005n\u0000\u0000"+
		"+<\u0005i\u0000\u0000,-\u0005t\u0000\u0000-.\u0005a\u0000\u0000./\u0005"+
		"o\u0000\u0000/0\u0005l\u0000\u00000<\u0005f\u0000\u000012\u0005g\u0000"+
		"\u000023\u0005n\u0000\u000034\u0005i\u0000\u000045\u0005r\u0000\u0000"+
		"56\u0005t\u0000\u00006<\u0005s\u0000\u000078\u0005l\u0000\u000089\u0005"+
		"o\u0000\u00009:\u0005o\u0000\u0000:<\u0005b\u0000\u0000;)\u0001\u0000"+
		"\u0000\u0000;,\u0001\u0000\u0000\u0000;1\u0001\u0000\u0000\u0000;7\u0001"+
		"\u0000\u0000\u0000<\u0002\u0001\u0000\u0000\u0000=A\u0005\"\u0000\u0000"+
		">@\t\u0000\u0000\u0000?>\u0001\u0000\u0000\u0000@C\u0001\u0000\u0000\u0000"+
		"AB\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000BD\u0001\u0000\u0000"+
		"\u0000CA\u0001\u0000\u0000\u0000DE\u0005\"\u0000\u0000E\u0004\u0001\u0000"+
		"\u0000\u0000FG\u0005=\u0000\u0000G\u0006\u0001\u0000\u0000\u0000HI\u0005"+
		"(\u0000\u0000I\b\u0001\u0000\u0000\u0000JK\u0005)\u0000\u0000K\n\u0001"+
		"\u0000\u0000\u0000LM\u0005{\u0000\u0000M\f\u0001\u0000\u0000\u0000NO\u0005"+
		"}\u0000\u0000O\u000e\u0001\u0000\u0000\u0000PQ\u0007\u0000\u0000\u0000"+
		"Q\u0010\u0001\u0000\u0000\u0000RS\u0005=\u0000\u0000S\\\u0005=\u0000\u0000"+
		"TU\u0005!\u0000\u0000U\\\u0005=\u0000\u0000V\\\u0007\u0001\u0000\u0000"+
		"WX\u0005<\u0000\u0000X\\\u0005=\u0000\u0000YZ\u0005>\u0000\u0000Z\\\u0005"+
		"=\u0000\u0000[R\u0001\u0000\u0000\u0000[T\u0001\u0000\u0000\u0000[V\u0001"+
		"\u0000\u0000\u0000[W\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000"+
		"\\\u0012\u0001\u0000\u0000\u0000]^\u0005t\u0000\u0000^_\u0005u\u0000\u0000"+
		"_`\u0005p\u0000\u0000`a\u0005n\u0000\u0000ab\u0005i\u0000\u0000b\u0014"+
		"\u0001\u0000\u0000\u0000cd\u0005t\u0000\u0000de\u0005n\u0000\u0000ef\u0005"+
		"i\u0000\u0000fg\u0005r\u0000\u0000gh\u0005p\u0000\u0000h\u0016\u0001\u0000"+
		"\u0000\u0000ij\u0005n\u0000\u0000jk\u0005r\u0000\u0000kl\u0005u\u0000"+
		"\u0000lm\u0005t\u0000\u0000mn\u0005e\u0000\u0000no\u0005r\u0000\u0000"+
		"o\u0018\u0001\u0000\u0000\u0000pq\u0005f\u0000\u0000q~\u0005i\u0000\u0000"+
		"rs\u0005e\u0000\u0000st\u0005s\u0000\u0000tu\u0005l\u0000\u0000u~\u0005"+
		"e\u0000\u0000vw\u0005e\u0000\u0000wx\u0005s\u0000\u0000xy\u0005l\u0000"+
		"\u0000yz\u0005e\u0000\u0000z{\u0005 \u0000\u0000{|\u0005f\u0000\u0000"+
		"|~\u0005i\u0000\u0000}p\u0001\u0000\u0000\u0000}r\u0001\u0000\u0000\u0000"+
		"}v\u0001\u0000\u0000\u0000~\u001a\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0005e\u0000\u0000\u0080\u0081\u0005l\u0000\u0000\u0081\u0082\u0005i"+
		"\u0000\u0000\u0082\u0083\u0005h\u0000\u0000\u0083\u0084\u0005w\u0000\u0000"+
		"\u0084\u001c\u0001\u0000\u0000\u0000\u0085\u008c\u0003\'\u0013\u0000\u0086"+
		"\u0088\u0005.\u0000\u0000\u0087\u0089\u0003\'\u0013\u0000\u0088\u0087"+
		"\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u0088"+
		"\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008d"+
		"\u0001\u0000\u0000\u0000\u008c\u0086\u0001\u0000\u0000\u0000\u008c\u008d"+
		"\u0001\u0000\u0000\u0000\u008d\u001e\u0001\u0000\u0000\u0000\u008e\u0093"+
		"\u0003%\u0012\u0000\u008f\u0092\u0003%\u0012\u0000\u0090\u0092\u0003\'"+
		"\u0013\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0090\u0001\u0000"+
		"\u0000\u0000\u0092\u0095\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000"+
		"\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094 \u0001\u0000\u0000"+
		"\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0096\u0098\u0007\u0002\u0000"+
		"\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000"+
		"\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009c\u0006\u0010\u0000"+
		"\u0000\u009c\"\u0001\u0000\u0000\u0000\u009d\u009e\t\u0000\u0000\u0000"+
		"\u009e$\u0001\u0000\u0000\u0000\u009f\u00a0\u0007\u0003\u0000\u0000\u00a0"+
		"&\u0001\u0000\u0000\u0000\u00a1\u00a2\u0007\u0004\u0000\u0000\u00a2(\u0001"+
		"\u0000\u0000\u0000\n\u0000;A[}\u008a\u008c\u0091\u0093\u0099\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}