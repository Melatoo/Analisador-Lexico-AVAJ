// Generated from /home/thiago/Documentos/UFLA/compiladores/Analisador-Lexico-AVAJ/src/Avaj.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class AvajParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

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

	@SuppressWarnings("CheckReturnValue")
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1040432L) != 0)) {
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1040416L) != 0)) {
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1040416L) != 0)) {
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

	@SuppressWarnings("CheckReturnValue")
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1040416L) != 0)) {
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

	@SuppressWarnings("CheckReturnValue")
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1040416L) != 0)) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStmtContext extends ParserRuleContext {
		public TerminalNode RET() { return getToken(AvajParser.RET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
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

	@SuppressWarnings("CheckReturnValue")
	public static class OutStmtContext extends ParserRuleContext {
		public TerminalNode OUT() { return getToken(AvajParser.OUT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public OutStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outStmt; }
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

	@SuppressWarnings("CheckReturnValue")
	public static class InStmtContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(AvajParser.IN, 0); }
		public TerminalNode ID() { return getToken(AvajParser.ID, 0); }
		public InStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inStmt; }
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

	@SuppressWarnings("CheckReturnValue")
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
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 786464L) != 0)) {
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

	@SuppressWarnings("CheckReturnValue")
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
		"\u0004\u0001\u0015\u00ab\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0005\u0000\u001f"+
		"\b\u0000\n\u0000\f\u0000\"\t\u0000\u0001\u0001\u0001\u0001\u0004\u0001"+
		"&\b\u0001\u000b\u0001\f\u0001\'\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u00034\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u00039\b\u0003\n\u0003\f\u0003<\t\u0003\u0001\u0003\u0005\u0003?\b\u0003"+
		"\n\u0003\f\u0003B\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004K\b\u0004\n\u0004\f\u0004"+
		"N\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005V\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"`\b\u0006\n\u0006\f\u0006c\t\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"g\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007l\b\u0007\n\u0007"+
		"\f\u0007o\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0005\by\b\b\n\b\f\b|\t\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0090"+
		"\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0099"+
		"\b\f\u0001\f\u0001\f\u0001\f\u0005\f\u009e\b\f\n\f\f\f\u00a1\t\f\u0001"+
		"\r\u0001\r\u0001\r\u0005\r\u00a6\b\r\n\r\f\r\u00a9\t\r\u0001\r\u0000\u0001"+
		"\u0018\u000e\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u0000\u0001\u0002\u0000\u0005\u0005\u0012\u0012\u00b5\u0000"+
		" \u0001\u0000\u0000\u0000\u0002%\u0001\u0000\u0000\u0000\u0004)\u0001"+
		"\u0000\u0000\u0000\u0006/\u0001\u0000\u0000\u0000\bE\u0001\u0000\u0000"+
		"\u0000\nU\u0001\u0000\u0000\u0000\fY\u0001\u0000\u0000\u0000\u000eh\u0001"+
		"\u0000\u0000\u0000\u0010r\u0001\u0000\u0000\u0000\u0012\u007f\u0001\u0000"+
		"\u0000\u0000\u0014\u0082\u0001\u0000\u0000\u0000\u0016\u0085\u0001\u0000"+
		"\u0000\u0000\u0018\u0098\u0001\u0000\u0000\u0000\u001a\u00a2\u0001\u0000"+
		"\u0000\u0000\u001c\u001f\u0003\u0002\u0001\u0000\u001d\u001f\u0003\n\u0005"+
		"\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001e\u001d\u0001\u0000\u0000"+
		"\u0000\u001f\"\u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000"+
		" !\u0001\u0000\u0000\u0000!\u0001\u0001\u0000\u0000\u0000\" \u0001\u0000"+
		"\u0000\u0000#&\u0003\u0004\u0002\u0000$&\u0003\u0006\u0003\u0000%#\u0001"+
		"\u0000\u0000\u0000%$\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000"+
		"\'%\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000(\u0003\u0001\u0000"+
		"\u0000\u0000)*\u0005\u0004\u0000\u0000*+\u0005\u0013\u0000\u0000+,\u0005"+
		"\u0006\u0000\u0000,-\u0007\u0000\u0000\u0000-.\u0005\u0001\u0000\u0000"+
		".\u0005\u0001\u0000\u0000\u0000/0\u0005\u0004\u0000\u000001\u0005\u0013"+
		"\u0000\u000013\u0005\u0007\u0000\u000024\u0003\b\u0004\u000032\u0001\u0000"+
		"\u0000\u000034\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000056\u0005"+
		"\b\u0000\u00006:\u0005\t\u0000\u000079\u0003\u0004\u0002\u000087\u0001"+
		"\u0000\u0000\u00009<\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000"+
		":;\u0001\u0000\u0000\u0000;@\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000"+
		"\u0000=?\u0003\n\u0005\u0000>=\u0001\u0000\u0000\u0000?B\u0001\u0000\u0000"+
		"\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000AC\u0001\u0000"+
		"\u0000\u0000B@\u0001\u0000\u0000\u0000CD\u0005\n\u0000\u0000D\u0007\u0001"+
		"\u0000\u0000\u0000EF\u0005\u0004\u0000\u0000FL\u0005\u0013\u0000\u0000"+
		"GH\u0005\u0002\u0000\u0000HI\u0005\u0004\u0000\u0000IK\u0005\u0013\u0000"+
		"\u0000JG\u0001\u0000\u0000\u0000KN\u0001\u0000\u0000\u0000LJ\u0001\u0000"+
		"\u0000\u0000LM\u0001\u0000\u0000\u0000M\t\u0001\u0000\u0000\u0000NL\u0001"+
		"\u0000\u0000\u0000OV\u0003\u0018\f\u0000PV\u0003\f\u0006\u0000QV\u0003"+
		"\u0010\b\u0000RV\u0003\u0012\t\u0000SV\u0003\u0014\n\u0000TV\u0003\u0016"+
		"\u000b\u0000UO\u0001\u0000\u0000\u0000UP\u0001\u0000\u0000\u0000UQ\u0001"+
		"\u0000\u0000\u0000UR\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000"+
		"UT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WX\u0005\u0001\u0000"+
		"\u0000X\u000b\u0001\u0000\u0000\u0000YZ\u0005\u0010\u0000\u0000Z[\u0005"+
		"\u0007\u0000\u0000[\\\u0003\u0018\f\u0000\\]\u0005\b\u0000\u0000]a\u0005"+
		"\t\u0000\u0000^`\u0003\n\u0005\u0000_^\u0001\u0000\u0000\u0000`c\u0001"+
		"\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000"+
		"bd\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000df\u0005\n\u0000\u0000"+
		"eg\u0003\u000e\u0007\u0000fe\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000"+
		"\u0000g\r\u0001\u0000\u0000\u0000hi\u0005\u0003\u0000\u0000im\u0005\t"+
		"\u0000\u0000jl\u0003\n\u0005\u0000kj\u0001\u0000\u0000\u0000lo\u0001\u0000"+
		"\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000np\u0001"+
		"\u0000\u0000\u0000om\u0001\u0000\u0000\u0000pq\u0005\n\u0000\u0000q\u000f"+
		"\u0001\u0000\u0000\u0000rs\u0005\u0011\u0000\u0000st\u0005\u0007\u0000"+
		"\u0000tu\u0003\u0018\f\u0000uv\u0005\b\u0000\u0000vz\u0005\t\u0000\u0000"+
		"wy\u0003\n\u0005\u0000xw\u0001\u0000\u0000\u0000y|\u0001\u0000\u0000\u0000"+
		"zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{}\u0001\u0000\u0000"+
		"\u0000|z\u0001\u0000\u0000\u0000}~\u0005\n\u0000\u0000~\u0011\u0001\u0000"+
		"\u0000\u0000\u007f\u0080\u0005\u000f\u0000\u0000\u0080\u0081\u0003\u0018"+
		"\f\u0000\u0081\u0013\u0001\u0000\u0000\u0000\u0082\u0083\u0005\u000e\u0000"+
		"\u0000\u0083\u0084\u0003\u0018\f\u0000\u0084\u0015\u0001\u0000\u0000\u0000"+
		"\u0085\u0086\u0005\r\u0000\u0000\u0086\u0087\u0005\u0013\u0000\u0000\u0087"+
		"\u0017\u0001\u0000\u0000\u0000\u0088\u0089\u0006\f\uffff\uffff\u0000\u0089"+
		"\u008a\u0005\u0013\u0000\u0000\u008a\u008b\u0005\u0006\u0000\u0000\u008b"+
		"\u0099\u0003\u0018\f\u0007\u008c\u008d\u0005\u0013\u0000\u0000\u008d\u008f"+
		"\u0005\u0007\u0000\u0000\u008e\u0090\u0003\u001a\r\u0000\u008f\u008e\u0001"+
		"\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0091\u0001"+
		"\u0000\u0000\u0000\u0091\u0099\u0005\b\u0000\u0000\u0092\u0093\u0005\u0013"+
		"\u0000\u0000\u0093\u0094\u0005\f\u0000\u0000\u0094\u0099\u0005\u0013\u0000"+
		"\u0000\u0095\u0099\u0005\u0013\u0000\u0000\u0096\u0099\u0005\u0012\u0000"+
		"\u0000\u0097\u0099\u0005\u0005\u0000\u0000\u0098\u0088\u0001\u0000\u0000"+
		"\u0000\u0098\u008c\u0001\u0000\u0000\u0000\u0098\u0092\u0001\u0000\u0000"+
		"\u0000\u0098\u0095\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000"+
		"\u0000\u0098\u0097\u0001\u0000\u0000\u0000\u0099\u009f\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\n\u0005\u0000\u0000\u009b\u009c\u0005\u000b\u0000\u0000"+
		"\u009c\u009e\u0003\u0018\f\u0006\u009d\u009a\u0001\u0000\u0000\u0000\u009e"+
		"\u00a1\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u009f"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a0\u0019\u0001\u0000\u0000\u0000\u00a1"+
		"\u009f\u0001\u0000\u0000\u0000\u00a2\u00a7\u0003\u0018\f\u0000\u00a3\u00a4"+
		"\u0005\u0002\u0000\u0000\u00a4\u00a6\u0003\u0018\f\u0000\u00a5\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a9\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u001b\u0001"+
		"\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u0011\u001e %\'"+
		"3:@LUafmz\u008f\u0098\u009f\u00a7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}