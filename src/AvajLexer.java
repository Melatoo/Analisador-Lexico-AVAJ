// Generated from src/Avaj.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AvajLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, TYPE=4, STRING=5, ATRIB=6, AP=7, FP=8, AC=9, FC=10, 
		OP=11, OPR=12, IN=13, OUT=14, RET=15, COND=16, WHILE=17, NUM=18, ID=19, 
		WS=20, ERROR=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "TYPE", "STRING", "ATRIB", "AP", "FP", "AC", 
			"FC", "OP", "OPR", "IN", "OUT", "RET", "COND", "WHILE", "NUM", "ID", 
			"WS", "ERROR", "CHAR", "DIGIT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "','", "'esle'", null, null, "'='", "'('", "')'", "'{'", 
			"'}'", null, null, "'tupni'", "'tnirp'", "'nruter'", null, "'elihw'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "TYPE", "STRING", "ATRIB", "AP", "FP", "AC", 
			"FC", "OP", "OPR", "IN", "OUT", "RET", "COND", "WHILE", "NUM", "ID", 
			"WS", "ERROR"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u00b4\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5M\n\5\3\6\3\6\7\6Q\n\6\f\6\16\6"+
		"T\13\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\rm\n\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u008f"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\6\23\u009a\n\23\r\23"+
		"\16\23\u009b\5\23\u009e\n\23\3\24\3\24\3\24\7\24\u00a3\n\24\f\24\16\24"+
		"\u00a6\13\24\3\25\6\25\u00a9\n\25\r\25\16\25\u00aa\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3R\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\2/\2\3\2"+
		"\7\5\2,-//\61\61\4\2>>@@\5\2\13\f\17\17\"\"\4\2C\\c|\3\2\62;\2\u00c0\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3\61\3\2\2\2\5\63\3\2"+
		"\2\2\7\65\3\2\2\2\tL\3\2\2\2\13N\3\2\2\2\rW\3\2\2\2\17Y\3\2\2\2\21[\3"+
		"\2\2\2\23]\3\2\2\2\25_\3\2\2\2\27a\3\2\2\2\31l\3\2\2\2\33n\3\2\2\2\35"+
		"t\3\2\2\2\37z\3\2\2\2!\u008e\3\2\2\2#\u0090\3\2\2\2%\u0096\3\2\2\2\'\u009f"+
		"\3\2\2\2)\u00a8\3\2\2\2+\u00ae\3\2\2\2-\u00b0\3\2\2\2/\u00b2\3\2\2\2\61"+
		"\62\7=\2\2\62\4\3\2\2\2\63\64\7.\2\2\64\6\3\2\2\2\65\66\7g\2\2\66\67\7"+
		"u\2\2\678\7n\2\289\7g\2\29\b\3\2\2\2:;\7v\2\2;<\7p\2\2<M\7k\2\2=>\7v\2"+
		"\2>?\7c\2\2?@\7q\2\2@A\7n\2\2AM\7h\2\2BC\7i\2\2CD\7p\2\2DE\7k\2\2EF\7"+
		"t\2\2FG\7v\2\2GM\7u\2\2HI\7n\2\2IJ\7q\2\2JK\7q\2\2KM\7d\2\2L:\3\2\2\2"+
		"L=\3\2\2\2LB\3\2\2\2LH\3\2\2\2M\n\3\2\2\2NR\7$\2\2OQ\13\2\2\2PO\3\2\2"+
		"\2QT\3\2\2\2RS\3\2\2\2RP\3\2\2\2SU\3\2\2\2TR\3\2\2\2UV\7$\2\2V\f\3\2\2"+
		"\2WX\7?\2\2X\16\3\2\2\2YZ\7*\2\2Z\20\3\2\2\2[\\\7+\2\2\\\22\3\2\2\2]^"+
		"\7}\2\2^\24\3\2\2\2_`\7\177\2\2`\26\3\2\2\2ab\t\2\2\2b\30\3\2\2\2cd\7"+
		"?\2\2dm\7?\2\2ef\7#\2\2fm\7?\2\2gm\t\3\2\2hi\7>\2\2im\7?\2\2jk\7@\2\2"+
		"km\7?\2\2lc\3\2\2\2le\3\2\2\2lg\3\2\2\2lh\3\2\2\2lj\3\2\2\2m\32\3\2\2"+
		"\2no\7v\2\2op\7w\2\2pq\7r\2\2qr\7p\2\2rs\7k\2\2s\34\3\2\2\2tu\7v\2\2u"+
		"v\7p\2\2vw\7k\2\2wx\7t\2\2xy\7r\2\2y\36\3\2\2\2z{\7p\2\2{|\7t\2\2|}\7"+
		"w\2\2}~\7v\2\2~\177\7g\2\2\177\u0080\7t\2\2\u0080 \3\2\2\2\u0081\u0082"+
		"\7h\2\2\u0082\u008f\7k\2\2\u0083\u0084\7g\2\2\u0084\u0085\7u\2\2\u0085"+
		"\u0086\7n\2\2\u0086\u008f\7g\2\2\u0087\u0088\7g\2\2\u0088\u0089\7u\2\2"+
		"\u0089\u008a\7n\2\2\u008a\u008b\7g\2\2\u008b\u008c\7\"\2\2\u008c\u008d"+
		"\7h\2\2\u008d\u008f\7k\2\2\u008e\u0081\3\2\2\2\u008e\u0083\3\2\2\2\u008e"+
		"\u0087\3\2\2\2\u008f\"\3\2\2\2\u0090\u0091\7g\2\2\u0091\u0092\7n\2\2\u0092"+
		"\u0093\7k\2\2\u0093\u0094\7j\2\2\u0094\u0095\7y\2\2\u0095$\3\2\2\2\u0096"+
		"\u009d\5/\30\2\u0097\u0099\7\60\2\2\u0098\u009a\5/\30\2\u0099\u0098\3"+
		"\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009e\3\2\2\2\u009d\u0097\3\2\2\2\u009d\u009e\3\2\2\2\u009e&\3\2\2\2"+
		"\u009f\u00a4\5-\27\2\u00a0\u00a3\5-\27\2\u00a1\u00a3\5/\30\2\u00a2\u00a0"+
		"\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4"+
		"\u00a5\3\2\2\2\u00a5(\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a9\t\4\2\2"+
		"\u00a8\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab"+
		"\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\b\25\2\2\u00ad*\3\2\2\2\u00ae"+
		"\u00af\13\2\2\2\u00af,\3\2\2\2\u00b0\u00b1\t\5\2\2\u00b1.\3\2\2\2\u00b2"+
		"\u00b3\t\6\2\2\u00b3\60\3\2\2\2\f\2LRl\u008e\u009b\u009d\u00a2\u00a4\u00aa"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}