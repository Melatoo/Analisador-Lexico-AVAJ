// Generated from src/Avaj.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AvajParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, TYPE=4, STRING=5, ATRIB=6, AP=7, FP=8, AC=9, FC=10, 
		OP=11, OPR=12, IN=13, OUT=14, RET=15, COND=16, WHILE=17, NUM=18, ID=19, 
		WS=20, ERROR=21;
	public static final int
		RULE_start = 0, RULE_decl = 1, RULE_varDecl = 2, RULE_funDecl = 3, RULE_params = 4, 
		RULE_stmt = 5, RULE_ifStmt = 6, RULE_elseStmt = 7, RULE_whileStmt = 8, 
		RULE_returnStmt = 9, RULE_outStmt = 10, RULE_inStmt = 11, RULE_expr = 12, 
		RULE_args = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "decl", "varDecl", "funDecl", "params", "stmt", "ifStmt", "elseStmt", 
			"whileStmt", "returnStmt", "outStmt", "inStmt", "expr", "args"
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

	@Override
	public String getGrammarFileName() { return "Avaj.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AvajParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE) | (1L << STRING) | (1L << IN) | (1L << OUT) | (1L << RET) | (1L << COND) | (1L << WHILE) | (1L << NUM) | (1L << ID))) != 0)) {
				{
				setState(30);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TYPE:
					{
					setState(28);
					decl();
					}
					break;
				case STRING:
				case IN:
				case OUT:
				case RET:
				case COND:
				case WHILE:
				case NUM:
				case ID:
					{
					setState(29);
					stmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclContext extends ParserRuleContext {
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<FunDeclContext> funDecl() {
			return getRuleContexts(FunDeclContext.class);
		}
		public FunDeclContext funDecl(int i) {
			return getRuleContext(FunDeclContext.class,i);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(37); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(37);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						setState(35);
						varDecl();
						}
						break;
					case 2:
						{
						setState(36);
						funDecl();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(39); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(AvajParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(AvajParser.ID, 0); }
		public TerminalNode ATRIB() { return getToken(AvajParser.ATRIB, 0); }
		public TerminalNode STRING() { return getToken(AvajParser.STRING, 0); }
		public TerminalNode NUM() { return getToken(AvajParser.NUM, 0); }
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).exitVarDecl(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(TYPE);
			setState(42);
			match(ID);
			setState(43);
			match(ATRIB);
			setState(44);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==NUM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(45);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunDeclContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(AvajParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(AvajParser.ID, 0); }
		public TerminalNode AP() { return getToken(AvajParser.AP, 0); }
		public TerminalNode FP() { return getToken(AvajParser.FP, 0); }
		public TerminalNode AC() { return getToken(AvajParser.AC, 0); }
		public TerminalNode FC() { return getToken(AvajParser.FC, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public FunDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).enterFunDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).exitFunDecl(this);
		}
	}

	public final FunDeclContext funDecl() throws RecognitionException {
		FunDeclContext _localctx = new FunDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(TYPE);
			setState(48);
			match(ID);
			setState(49);
			match(AP);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(50);
				params();
				}
			}

			setState(53);
			match(FP);
			setState(54);
			match(AC);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(55);
				varDecl();
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << IN) | (1L << OUT) | (1L << RET) | (1L << COND) | (1L << WHILE) | (1L << NUM) | (1L << ID))) != 0)) {
				{
				{
				setState(61);
				stmt();
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			match(FC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsContext extends ParserRuleContext {
		public List<TerminalNode> TYPE() { return getTokens(AvajParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(AvajParser.TYPE, i);
		}
		public List<TerminalNode> ID() { return getTokens(AvajParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AvajParser.ID, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(TYPE);
			setState(70);
			match(ID);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(71);
				match(T__1);
				setState(72);
				match(TYPE);
				setState(73);
				match(ID);
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public OutStmtContext outStmt() {
			return getRuleContext(OutStmtContext.class,0);
		}
		public InStmtContext inStmt() {
			return getRuleContext(InStmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case NUM:
			case ID:
				{
				setState(79);
				expr(0);
				}
				break;
			case COND:
				{
				setState(80);
				ifStmt();
				}
				break;
			case WHILE:
				{
				setState(81);
				whileStmt();
				}
				break;
			case RET:
				{
				setState(82);
				returnStmt();
				}
				break;
			case OUT:
				{
				setState(83);
				outStmt();
				}
				break;
			case IN:
				{
				setState(84);
				inStmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(87);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStmtContext extends ParserRuleContext {
		public TerminalNode COND() { return getToken(AvajParser.COND, 0); }
		public TerminalNode AP() { return getToken(AvajParser.AP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FP() { return getToken(AvajParser.FP, 0); }
		public TerminalNode AC() { return getToken(AvajParser.AC, 0); }
		public TerminalNode FC() { return getToken(AvajParser.FC, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ElseStmtContext elseStmt() {
			return getRuleContext(ElseStmtContext.class,0);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).exitIfStmt(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(COND);
			setState(90);
			match(AP);
			setState(91);
			expr(0);
			setState(92);
			match(FP);
			setState(93);
			match(AC);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << IN) | (1L << OUT) | (1L << RET) | (1L << COND) | (1L << WHILE) | (1L << NUM) | (1L << ID))) != 0)) {
				{
				{
				setState(94);
				stmt();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
			match(FC);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(101);
				elseStmt();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseStmtContext extends ParserRuleContext {
		public TerminalNode AC() { return getToken(AvajParser.AC, 0); }
		public TerminalNode FC() { return getToken(AvajParser.FC, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ElseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).enterElseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).exitElseStmt(this);
		}
	}

	public final ElseStmtContext elseStmt() throws RecognitionException {
		ElseStmtContext _localctx = new ElseStmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_elseStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(T__2);
			setState(105);
			match(AC);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << IN) | (1L << OUT) | (1L << RET) | (1L << COND) | (1L << WHILE) | (1L << NUM) | (1L << ID))) != 0)) {
				{
				{
				setState(106);
				stmt();
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
			match(FC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(AvajParser.WHILE, 0); }
		public TerminalNode AP() { return getToken(AvajParser.AP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FP() { return getToken(AvajParser.FP, 0); }
		public TerminalNode AC() { return getToken(AvajParser.AC, 0); }
		public TerminalNode FC() { return getToken(AvajParser.FC, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).exitWhileStmt(this);
		}
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_whileStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(WHILE);
			setState(115);
			match(AP);
			setState(116);
			expr(0);
			setState(117);
			match(FP);
			setState(118);
			match(AC);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << IN) | (1L << OUT) | (1L << RET) | (1L << COND) | (1L << WHILE) | (1L << NUM) | (1L << ID))) != 0)) {
				{
				{
				setState(119);
				stmt();
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125);
			match(FC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStmtContext extends ParserRuleContext {
		public TerminalNode RET() { return getToken(AvajParser.RET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).exitReturnStmt(this);
		}
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_returnStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(RET);
			setState(128);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutStmtContext extends ParserRuleContext {
		public TerminalNode OUT() { return getToken(AvajParser.OUT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public OutStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).enterOutStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).exitOutStmt(this);
		}
	}

	public final OutStmtContext outStmt() throws RecognitionException {
		OutStmtContext _localctx = new OutStmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_outStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(OUT);
			setState(131);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InStmtContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(AvajParser.IN, 0); }
		public TerminalNode ID() { return getToken(AvajParser.ID, 0); }
		public InStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).enterInStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).exitInStmt(this);
		}
	}

	public final InStmtContext inStmt() throws RecognitionException {
		InStmtContext _localctx = new InStmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_inStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(IN);
			setState(134);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(AvajParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AvajParser.ID, i);
		}
		public TerminalNode ATRIB() { return getToken(AvajParser.ATRIB, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AP() { return getToken(AvajParser.AP, 0); }
		public TerminalNode FP() { return getToken(AvajParser.FP, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode OPR() { return getToken(AvajParser.OPR, 0); }
		public TerminalNode NUM() { return getToken(AvajParser.NUM, 0); }
		public TerminalNode STRING() { return getToken(AvajParser.STRING, 0); }
		public TerminalNode OP() { return getToken(AvajParser.OP, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(137);
				match(ID);
				setState(138);
				match(ATRIB);
				setState(139);
				expr(7);
				}
				break;
			case 2:
				{
				setState(140);
				match(ID);
				setState(141);
				match(AP);
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << NUM) | (1L << ID))) != 0)) {
					{
					setState(142);
					args();
					}
				}

				setState(145);
				match(FP);
				}
				break;
			case 3:
				{
				setState(146);
				match(ID);
				setState(147);
				match(OPR);
				setState(148);
				match(ID);
				}
				break;
			case 4:
				{
				setState(149);
				match(ID);
				}
				break;
			case 5:
				{
				setState(150);
				match(NUM);
				}
				break;
			case 6:
				{
				setState(151);
				match(STRING);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(159);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(154);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(155);
					match(OP);
					setState(156);
					expr(6);
					}
					} 
				}
				setState(161);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArgsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).exitArgs(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			expr(0);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(163);
				match(T__1);
				setState(164);
				expr(0);
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27\u00ad\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\7\2!\n\2\f\2\16\2$\13"+
		"\2\3\3\3\3\6\3(\n\3\r\3\16\3)\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\5\5\66\n\5\3\5\3\5\3\5\7\5;\n\5\f\5\16\5>\13\5\3\5\7\5A\n\5\f\5\16\5"+
		"D\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\7\6M\n\6\f\6\16\6P\13\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\5\7X\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\7\bb\n\b\f\b\16"+
		"\be\13\b\3\b\3\b\5\bi\n\b\3\t\3\t\3\t\7\tn\n\t\f\t\16\tq\13\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\7\n{\n\n\f\n\16\n~\13\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0092"+
		"\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u009b\n\16\3\16\3\16\3\16"+
		"\7\16\u00a0\n\16\f\16\16\16\u00a3\13\16\3\17\3\17\3\17\7\17\u00a8\n\17"+
		"\f\17\16\17\u00ab\13\17\3\17\2\3\32\20\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\2\3\4\2\7\7\24\24\2\u00b7\2\"\3\2\2\2\4\'\3\2\2\2\6+\3\2\2\2\b\61"+
		"\3\2\2\2\nG\3\2\2\2\fW\3\2\2\2\16[\3\2\2\2\20j\3\2\2\2\22t\3\2\2\2\24"+
		"\u0081\3\2\2\2\26\u0084\3\2\2\2\30\u0087\3\2\2\2\32\u009a\3\2\2\2\34\u00a4"+
		"\3\2\2\2\36!\5\4\3\2\37!\5\f\7\2 \36\3\2\2\2 \37\3\2\2\2!$\3\2\2\2\" "+
		"\3\2\2\2\"#\3\2\2\2#\3\3\2\2\2$\"\3\2\2\2%(\5\6\4\2&(\5\b\5\2\'%\3\2\2"+
		"\2\'&\3\2\2\2()\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*\5\3\2\2\2+,\7\6\2\2,-\7"+
		"\25\2\2-.\7\b\2\2./\t\2\2\2/\60\7\3\2\2\60\7\3\2\2\2\61\62\7\6\2\2\62"+
		"\63\7\25\2\2\63\65\7\t\2\2\64\66\5\n\6\2\65\64\3\2\2\2\65\66\3\2\2\2\66"+
		"\67\3\2\2\2\678\7\n\2\28<\7\13\2\29;\5\6\4\2:9\3\2\2\2;>\3\2\2\2<:\3\2"+
		"\2\2<=\3\2\2\2=B\3\2\2\2><\3\2\2\2?A\5\f\7\2@?\3\2\2\2AD\3\2\2\2B@\3\2"+
		"\2\2BC\3\2\2\2CE\3\2\2\2DB\3\2\2\2EF\7\f\2\2F\t\3\2\2\2GH\7\6\2\2HN\7"+
		"\25\2\2IJ\7\4\2\2JK\7\6\2\2KM\7\25\2\2LI\3\2\2\2MP\3\2\2\2NL\3\2\2\2N"+
		"O\3\2\2\2O\13\3\2\2\2PN\3\2\2\2QX\5\32\16\2RX\5\16\b\2SX\5\22\n\2TX\5"+
		"\24\13\2UX\5\26\f\2VX\5\30\r\2WQ\3\2\2\2WR\3\2\2\2WS\3\2\2\2WT\3\2\2\2"+
		"WU\3\2\2\2WV\3\2\2\2XY\3\2\2\2YZ\7\3\2\2Z\r\3\2\2\2[\\\7\22\2\2\\]\7\t"+
		"\2\2]^\5\32\16\2^_\7\n\2\2_c\7\13\2\2`b\5\f\7\2a`\3\2\2\2be\3\2\2\2ca"+
		"\3\2\2\2cd\3\2\2\2df\3\2\2\2ec\3\2\2\2fh\7\f\2\2gi\5\20\t\2hg\3\2\2\2"+
		"hi\3\2\2\2i\17\3\2\2\2jk\7\5\2\2ko\7\13\2\2ln\5\f\7\2ml\3\2\2\2nq\3\2"+
		"\2\2om\3\2\2\2op\3\2\2\2pr\3\2\2\2qo\3\2\2\2rs\7\f\2\2s\21\3\2\2\2tu\7"+
		"\23\2\2uv\7\t\2\2vw\5\32\16\2wx\7\n\2\2x|\7\13\2\2y{\5\f\7\2zy\3\2\2\2"+
		"{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0080\7\f\2"+
		"\2\u0080\23\3\2\2\2\u0081\u0082\7\21\2\2\u0082\u0083\5\32\16\2\u0083\25"+
		"\3\2\2\2\u0084\u0085\7\20\2\2\u0085\u0086\5\32\16\2\u0086\27\3\2\2\2\u0087"+
		"\u0088\7\17\2\2\u0088\u0089\7\25\2\2\u0089\31\3\2\2\2\u008a\u008b\b\16"+
		"\1\2\u008b\u008c\7\25\2\2\u008c\u008d\7\b\2\2\u008d\u009b\5\32\16\t\u008e"+
		"\u008f\7\25\2\2\u008f\u0091\7\t\2\2\u0090\u0092\5\34\17\2\u0091\u0090"+
		"\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u009b\7\n\2\2\u0094"+
		"\u0095\7\25\2\2\u0095\u0096\7\16\2\2\u0096\u009b\7\25\2\2\u0097\u009b"+
		"\7\25\2\2\u0098\u009b\7\24\2\2\u0099\u009b\7\7\2\2\u009a\u008a\3\2\2\2"+
		"\u009a\u008e\3\2\2\2\u009a\u0094\3\2\2\2\u009a\u0097\3\2\2\2\u009a\u0098"+
		"\3\2\2\2\u009a\u0099\3\2\2\2\u009b\u00a1\3\2\2\2\u009c\u009d\f\7\2\2\u009d"+
		"\u009e\7\r\2\2\u009e\u00a0\5\32\16\b\u009f\u009c\3\2\2\2\u00a0\u00a3\3"+
		"\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\33\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a4\u00a9\5\32\16\2\u00a5\u00a6\7\4\2\2\u00a6\u00a8\5"+
		"\32\16\2\u00a7\u00a5\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\35\3\2\2\2\u00ab\u00a9\3\2\2\2\23 \"\')\65<BNWch"+
		"o|\u0091\u009a\u00a1\u00a9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}