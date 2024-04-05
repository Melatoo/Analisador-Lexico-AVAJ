// Generated from c://Users//User//Documents//Git//Clone//Analisador-Lexico-AVAJ//src//Avaj.g4 by ANTLR 4.13.1
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
		OUT=11, RET=12, COND=13, WHILE=14, NUM=15, ID=16, WS=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TYPE", "STRING", "ATRIB", "AP", "FP", "AC", "FC", "OP", "OPR", "IN", 
			"OUT", "RET", "COND", "WHILE", "NUM", "ID", "WS", "CHAR", "DIGIT"
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
			"IN", "OUT", "RET", "COND", "WHILE", "NUM", "ID", "WS"
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
		"\u0004\u0000\u0011\u009f\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0003\u0000:\b\u0000\u0001\u0001\u0001\u0001"+
		"\u0005\u0001>\b\u0001\n\u0001\f\u0001A\t\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\bZ\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0003\f|\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0004\u000e\u0087\b\u000e"+
		"\u000b\u000e\f\u000e\u0088\u0003\u000e\u008b\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0005\u000f\u0090\b\u000f\n\u000f\f\u000f\u0093\t\u000f"+
		"\u0001\u0010\u0004\u0010\u0096\b\u0010\u000b\u0010\f\u0010\u0097\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"?\u0000\u0013\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0000%\u0000\u0001\u0000"+
		"\u0005\u0003\u0000*+--//\u0002\u0000<<>>\u0003\u0000\t\n\r\r  \u0002\u0000"+
		"AZaz\u0001\u000009\u00ab\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u00019\u0001\u0000\u0000\u0000"+
		"\u0003;\u0001\u0000\u0000\u0000\u0005D\u0001\u0000\u0000\u0000\u0007F"+
		"\u0001\u0000\u0000\u0000\tH\u0001\u0000\u0000\u0000\u000bJ\u0001\u0000"+
		"\u0000\u0000\rL\u0001\u0000\u0000\u0000\u000fN\u0001\u0000\u0000\u0000"+
		"\u0011Y\u0001\u0000\u0000\u0000\u0013[\u0001\u0000\u0000\u0000\u0015a"+
		"\u0001\u0000\u0000\u0000\u0017g\u0001\u0000\u0000\u0000\u0019{\u0001\u0000"+
		"\u0000\u0000\u001b}\u0001\u0000\u0000\u0000\u001d\u0083\u0001\u0000\u0000"+
		"\u0000\u001f\u008c\u0001\u0000\u0000\u0000!\u0095\u0001\u0000\u0000\u0000"+
		"#\u009b\u0001\u0000\u0000\u0000%\u009d\u0001\u0000\u0000\u0000\'(\u0005"+
		"t\u0000\u0000()\u0005n\u0000\u0000):\u0005i\u0000\u0000*+\u0005t\u0000"+
		"\u0000+,\u0005a\u0000\u0000,-\u0005o\u0000\u0000-.\u0005l\u0000\u0000"+
		".:\u0005f\u0000\u0000/0\u0005g\u0000\u000001\u0005n\u0000\u000012\u0005"+
		"i\u0000\u000023\u0005r\u0000\u000034\u0005t\u0000\u00004:\u0005s\u0000"+
		"\u000056\u0005l\u0000\u000067\u0005o\u0000\u000078\u0005o\u0000\u0000"+
		"8:\u0005b\u0000\u00009\'\u0001\u0000\u0000\u00009*\u0001\u0000\u0000\u0000"+
		"9/\u0001\u0000\u0000\u000095\u0001\u0000\u0000\u0000:\u0002\u0001\u0000"+
		"\u0000\u0000;?\u0005\"\u0000\u0000<>\t\u0000\u0000\u0000=<\u0001\u0000"+
		"\u0000\u0000>A\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000?=\u0001"+
		"\u0000\u0000\u0000@B\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000"+
		"BC\u0005\"\u0000\u0000C\u0004\u0001\u0000\u0000\u0000DE\u0005=\u0000\u0000"+
		"E\u0006\u0001\u0000\u0000\u0000FG\u0005(\u0000\u0000G\b\u0001\u0000\u0000"+
		"\u0000HI\u0005)\u0000\u0000I\n\u0001\u0000\u0000\u0000JK\u0005{\u0000"+
		"\u0000K\f\u0001\u0000\u0000\u0000LM\u0005}\u0000\u0000M\u000e\u0001\u0000"+
		"\u0000\u0000NO\u0007\u0000\u0000\u0000O\u0010\u0001\u0000\u0000\u0000"+
		"PQ\u0005=\u0000\u0000QZ\u0005=\u0000\u0000RS\u0005!\u0000\u0000SZ\u0005"+
		"=\u0000\u0000TZ\u0007\u0001\u0000\u0000UV\u0005<\u0000\u0000VZ\u0005="+
		"\u0000\u0000WX\u0005>\u0000\u0000XZ\u0005=\u0000\u0000YP\u0001\u0000\u0000"+
		"\u0000YR\u0001\u0000\u0000\u0000YT\u0001\u0000\u0000\u0000YU\u0001\u0000"+
		"\u0000\u0000YW\u0001\u0000\u0000\u0000Z\u0012\u0001\u0000\u0000\u0000"+
		"[\\\u0005t\u0000\u0000\\]\u0005u\u0000\u0000]^\u0005p\u0000\u0000^_\u0005"+
		"n\u0000\u0000_`\u0005i\u0000\u0000`\u0014\u0001\u0000\u0000\u0000ab\u0005"+
		"t\u0000\u0000bc\u0005n\u0000\u0000cd\u0005i\u0000\u0000de\u0005r\u0000"+
		"\u0000ef\u0005p\u0000\u0000f\u0016\u0001\u0000\u0000\u0000gh\u0005n\u0000"+
		"\u0000hi\u0005r\u0000\u0000ij\u0005u\u0000\u0000jk\u0005t\u0000\u0000"+
		"kl\u0005e\u0000\u0000lm\u0005r\u0000\u0000m\u0018\u0001\u0000\u0000\u0000"+
		"no\u0005f\u0000\u0000o|\u0005i\u0000\u0000pq\u0005e\u0000\u0000qr\u0005"+
		"s\u0000\u0000rs\u0005l\u0000\u0000s|\u0005e\u0000\u0000tu\u0005e\u0000"+
		"\u0000uv\u0005s\u0000\u0000vw\u0005l\u0000\u0000wx\u0005e\u0000\u0000"+
		"xy\u0005 \u0000\u0000yz\u0005f\u0000\u0000z|\u0005i\u0000\u0000{n\u0001"+
		"\u0000\u0000\u0000{p\u0001\u0000\u0000\u0000{t\u0001\u0000\u0000\u0000"+
		"|\u001a\u0001\u0000\u0000\u0000}~\u0005e\u0000\u0000~\u007f\u0005l\u0000"+
		"\u0000\u007f\u0080\u0005i\u0000\u0000\u0080\u0081\u0005h\u0000\u0000\u0081"+
		"\u0082\u0005w\u0000\u0000\u0082\u001c\u0001\u0000\u0000\u0000\u0083\u008a"+
		"\u0003%\u0012\u0000\u0084\u0086\u0005.\u0000\u0000\u0085\u0087\u0003%"+
		"\u0012\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000"+
		"\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000"+
		"\u0000\u0000\u0089\u008b\u0001\u0000\u0000\u0000\u008a\u0084\u0001\u0000"+
		"\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u001e\u0001\u0000"+
		"\u0000\u0000\u008c\u0091\u0003#\u0011\u0000\u008d\u0090\u0003#\u0011\u0000"+
		"\u008e\u0090\u0003%\u0012\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f"+
		"\u008e\u0001\u0000\u0000\u0000\u0090\u0093\u0001\u0000\u0000\u0000\u0091"+
		"\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092"+
		" \u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0094\u0096"+
		"\u0007\u0002\u0000\u0000\u0095\u0094\u0001\u0000\u0000\u0000\u0096\u0097"+
		"\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0097\u0098"+
		"\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009a"+
		"\u0006\u0010\u0000\u0000\u009a\"\u0001\u0000\u0000\u0000\u009b\u009c\u0007"+
		"\u0003\u0000\u0000\u009c$\u0001\u0000\u0000\u0000\u009d\u009e\u0007\u0004"+
		"\u0000\u0000\u009e&\u0001\u0000\u0000\u0000\n\u00009?Y{\u0088\u008a\u008f"+
		"\u0091\u0097\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}