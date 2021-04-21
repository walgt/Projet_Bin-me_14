// Generated from C:/Users/famille meza/TEST/src\TEST.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TESTParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, INTcompil=11, FLOATcompil=12, STRINGcompil=13, SCANcompil=14, 
		PRINTcompil=15, START=16, IF=17, THEN=18, ELSE=19, WHILE=20, DO=21, PLUS=22, 
		MINUS=23, MULT=24, DIV=25, SUP=26, INF=27, PROGNAME=28, ID=29, INT=30, 
		FLOAT=31, COMMENT=32, TEXT=33, WS=34;
	public static final int
		RULE_start_rule = 0, RULE_declarations = 1, RULE_suite = 2, RULE_variables = 3, 
		RULE_identifier = 4, RULE_type = 5, RULE_instructions = 6, RULE_instAff = 7, 
		RULE_instIf = 8, RULE_instElse = 9, RULE_instScan = 10, RULE_instPrint = 11, 
		RULE_instWhile = 12, RULE_condition = 13, RULE_si = 14, RULE_expression = 15, 
		RULE_expression1 = 16, RULE_pm = 17, RULE_md = 18, RULE_expression2 = 19, 
		RULE_value = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"start_rule", "declarations", "suite", "variables", "identifier", "type", 
			"instructions", "instAff", "instIf", "instElse", "instScan", "instPrint", 
			"instWhile", "condition", "si", "expression", "expression1", "pm", "md", 
			"expression2", "value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'compil'", "'('", "')'", "'{'", "'}'", "';'", "','", "'='", "'=='", 
			"'!='", "'intCompil'", "'floatCompil'", "'stringCompil'", "'scancompil'", 
			"'printcompil'", "'start'", "'if'", "'then'", "'else'", "'while'", "'do'", 
			"'+'", "'-'", "'*'", "'/'", "'>'", "'<'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "INTcompil", 
			"FLOATcompil", "STRINGcompil", "SCANcompil", "PRINTcompil", "START", 
			"IF", "THEN", "ELSE", "WHILE", "DO", "PLUS", "MINUS", "MULT", "DIV", 
			"SUP", "INF", "PROGNAME", "ID", "INT", "FLOAT", "COMMENT", "TEXT", "WS"
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
	public String getGrammarFileName() { return "TEST.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TESTParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Start_ruleContext extends ParserRuleContext {
		public TerminalNode PROGNAME() { return getToken(TESTParser.PROGNAME, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public TerminalNode START() { return getToken(TESTParser.START, 0); }
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public Start_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TESTListener ) ((TESTListener)listener).enterStart_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TESTListener ) ((TESTListener)listener).exitStart_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TESTVisitor ) return ((TESTVisitor<? extends T>)visitor).visitStart_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Start_ruleContext start_rule() throws RecognitionException {
		Start_ruleContext _localctx = new Start_ruleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(T__0);
			setState(43);
			match(PROGNAME);
			setState(44);
			match(T__1);
			setState(45);
			match(T__2);
			setState(46);
			match(T__3);
			setState(47);
			declarations();
			setState(48);
			match(START);
			setState(49);
			instructions();
			setState(50);
			match(T__4);
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

	public static class DeclarationsContext extends ParserRuleContext {
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TESTListener ) ((TESTListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TESTListener ) ((TESTListener)listener).exitDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TESTVisitor ) return ((TESTVisitor<? extends T>)visitor).visitDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declarations);
		try {
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(52);
				suite();
				setState(53);
				declarations();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				suite();
				}
				break;
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

	public static class SuiteContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public SuiteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TESTListener ) ((TESTListener)listener).enterSuite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TESTListener ) ((TESTListener)listener).exitSuite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TESTVisitor ) return ((TESTVisitor<? extends T>)visitor).visitSuite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuiteContext suite() throws RecognitionException {
		SuiteContext _localctx = new SuiteContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_suite);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			type();
			setState(59);
			variables();
			setState(60);
			match(T__5);
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

	public static class VariablesContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TESTParser.ID, 0); }
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TESTListener ) ((TESTListener)listener).enterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TESTListener ) ((TESTListener)listener).exitVariables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TESTVisitor ) return ((TESTVisitor<? extends T>)visitor).visitVariables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variables);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				{
				setState(62);
				match(ID);
				setState(63);
				match(T__6);
				setState(64);
				variables();
				}
				}
				break;
			case 2:
				{
				setState(65);
				match(ID);
				}
				break;
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TESTParser.ID, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TESTListener ) ((TESTListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TESTListener ) ((TESTListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TESTVisitor ) return ((TESTVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INTcompil() { return getToken(TESTParser.INTcompil, 0); }
		public TerminalNode FLOATcompil() { return getToken(TESTParser.FLOATcompil, 0); }
		public TerminalNode STRINGcompil() { return getToken(TESTParser.STRINGcompil, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TESTListener ) ((TESTListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TESTListener ) ((TESTListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TESTVisitor ) return ((TESTVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTcompil) | (1L << FLOATcompil) | (1L << STRINGcompil))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class InstructionsContext extends ParserRuleContext {
		public InstAffContext instAff() {
			return getRuleContext(InstAffContext.class,0);
		}
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public InstIfContext instIf() {
			return getRuleContext(InstIfContext.class,0);
		}
		public InstScanContext instScan() {
			return getRuleContext(InstScanContext.class,0);
		}
		public InstPrintContext instPrint() {
			return getRuleContext(InstPrintContext.class,0);
		}
		public InstWhileContext instWhile() {
			return getRuleContext(InstWhileContext.class,0);
		}
		public InstructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TESTListener ) ((TESTListener)listener).enterInstructions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TESTListener ) ((TESTListener)listener).exitInstructions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TESTVisitor ) return ((TESTVisitor<? extends T>)visitor).visitInstructions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionsContext instructions() throws RecognitionException {
		InstructionsContext _localctx = new InstructionsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_instructions);
		try {
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				instAff();
				setState(73);
				match(T__5);
				setState(75);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(74);
					instructions();
					}
					break;
				}
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				instIf();
				setState(79);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(78);
					instructions();
					}
					break;
				}
				}
				break;
			case SCANcompil:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				instScan();
				setState(82);
				match(T__5);
				setState(84);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(83);
					instructions();
					}
					break;
				}
				}
				break;
			case PRINTcompil:
				enterOuterAlt(_localctx, 4);
				{
				setState(86);
				instPrint();
				setState(87);
				match(T__5);
				setState(89);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(88);
					instructions();
					}
					break;
				}
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 5);
				{
				setState(91);
				instWhile();
				setState(93);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(92);
					instructions();
					}
					break;
				}
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 6);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class InstAffContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InstAffContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instAff; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TESTListener ) ((TESTListener)listener).enterInstAff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TESTListener ) ((TESTListener)listener).exitInstAff(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TESTVisitor ) return ((TESTVisitor<? extends T>)visitor).visitInstAff(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstAffContext instAff() throws RecognitionException {
		InstAffContext _localctx = new InstAffContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_instAff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			identifier();
			setState(99);
			match(T__7);
			setState(100);
			expression(0);
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

	public static class InstIfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(TESTParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(TESTParser.THEN, 0); }
		public List<InstructionsContext> instructions() {
			return getRuleContexts(InstructionsContext.class);
		}
		public InstructionsContext instructions(int i) {
			return getRuleContext(InstructionsContext.class,i);
		}
		public InstElseContext instElse() {
			return getRuleContext(InstElseContext.class,0);
		}
		public InstIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TESTListener ) ((TESTListener)listener).enterInstIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TESTListener ) ((TESTListener)listener).exitInstIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TESTVisitor ) return ((TESTVisitor<? extends T>)visitor).visitInstIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstIfContext instIf() throws RecognitionException {
		InstIfContext _localctx = new InstIfContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_instIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(IF);
			setState(103);
			match(T__1);
			setState(104);
			condition();
			setState(105);
			match(T__2);
			setState(106);
			match(THEN);
			setState(107);
			match(T__3);
			setState(108);
			instructions();
			setState(109);
			match(T__4);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(110);
				instElse();
				setState(111);
				match(T__3);
				setState(112);
				instructions();
				setState(113);
				match(T__4);
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

	public static class InstElseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(TESTParser.ELSE, 0); }
		public InstElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instElse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TESTListener ) ((TESTListener)listener).enterInstElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TESTListener ) ((TESTListener)listener).exitInstElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TESTVisitor ) return ((TESTVisitor<? extends T>)visitor).visitInstElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstElseContext instElse() throws RecognitionException {
		InstElseContext _localctx = new InstElseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_instElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(ELSE);
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

	public static class InstScanContext extends ParserRuleContext {
		public TerminalNode SCANcompil() { return getToken(TESTParser.SCANcompil, 0); }
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public InstScanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instScan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TESTListener ) ((TESTListener)listener).enterInstScan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TESTListener ) ((TESTListener)listener).exitInstScan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TESTVisitor ) return ((TESTVisitor<? extends T>)visitor).visitInstScan(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstScanContext instScan() throws RecognitionException {
		InstScanContext _localctx = new InstScanContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_instScan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(SCANcompil);
			setState(120);
			match(T__1);
			setState(121);
			variables();
			setState(122);
			match(T__2);
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

	public static class InstPrintContext extends ParserRuleContext {
		public TerminalNode PRINTcompil() { return getToken(TESTParser.PRINTcompil, 0); }
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public TerminalNode TEXT() { return getToken(TESTParser.TEXT, 0); }
		public InstPrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instPrint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TESTListener ) ((TESTListener)listener).enterInstPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TESTListener ) ((TESTListener)listener).exitInstPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TESTVisitor ) return ((TESTVisitor<? extends T>)visitor).visitInstPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstPrintContext instPrint() throws RecognitionException {
		InstPrintContext _localctx = new InstPrintContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_instPrint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(PRINTcompil);
			setState(125);
			match(T__1);
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(126);
				variables();
				}
				break;
			case TEXT:
				{
				setState(127);
				match(TEXT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(130);
			match(T__2);
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

	public static class InstWhileContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(TESTParser.DO, 0); }
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(TESTParser.WHILE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public InstWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TESTListener ) ((TESTListener)listener).enterInstWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TESTListener ) ((TESTListener)listener).exitInstWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TESTVisitor ) return ((TESTVisitor<? extends T>)visitor).visitInstWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstWhileContext instWhile() throws RecognitionException {
		InstWhileContext _localctx = new InstWhileContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_instWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(DO);
			setState(133);
			match(T__3);
			setState(134);
			instructions();
			setState(135);
			match(T__4);
			setState(136);
			match(WHILE);
			setState(137);
			match(T__1);
			setState(138);
			condition();
			setState(139);
			match(T__2);
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

	public static class ConditionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SiContext si() {
			return getRuleContext(SiContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TESTListener ) ((TESTListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TESTListener ) ((TESTListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TESTVisitor ) return ((TESTVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			expression(0);
			setState(142);
			si();
			setState(143);
			expression(0);
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

	public static class SiContext extends ParserRuleContext {
		public TerminalNode SUP() { return getToken(TESTParser.SUP, 0); }
		public TerminalNode INF() { return getToken(TESTParser.INF, 0); }
		public SiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TESTListener ) ((TESTListener)listener).enterSi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TESTListener ) ((TESTListener)listener).exitSi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TESTVisitor ) return ((TESTVisitor<? extends T>)visitor).visitSi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SiContext si() throws RecognitionException {
		SiContext _localctx = new SiContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_si);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << SUP) | (1L << INF))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ExpressionContext extends ParserRuleContext {
		public Expression1Context expression1() {
			return getRuleContext(Expression1Context.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PmContext pm() {
			return getRuleContext(PmContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TESTListener ) ((TESTListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TESTListener ) ((TESTListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TESTVisitor ) return ((TESTVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(148);
			expression1(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(156);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(150);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(151);
					pm();
					setState(152);
					expression1(0);
					}
					} 
				}
				setState(158);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class Expression1Context extends ParserRuleContext {
		public Expression2Context expression2() {
			return getRuleContext(Expression2Context.class,0);
		}
		public Expression1Context expression1() {
			return getRuleContext(Expression1Context.class,0);
		}
		public MdContext md() {
			return getRuleContext(MdContext.class,0);
		}
		public Expression1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TESTListener ) ((TESTListener)listener).enterExpression1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TESTListener ) ((TESTListener)listener).exitExpression1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TESTVisitor ) return ((TESTVisitor<? extends T>)visitor).visitExpression1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression1Context expression1() throws RecognitionException {
		return expression1(0);
	}

	private Expression1Context expression1(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expression1Context _localctx = new Expression1Context(_ctx, _parentState);
		Expression1Context _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expression1, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(160);
			expression2();
			}
			_ctx.stop = _input.LT(-1);
			setState(168);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expression1Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression1);
					setState(162);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(163);
					md();
					setState(164);
					expression2();
					}
					} 
				}
				setState(170);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class PmContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(TESTParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(TESTParser.MINUS, 0); }
		public PmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TESTListener ) ((TESTListener)listener).enterPm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TESTListener ) ((TESTListener)listener).exitPm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TESTVisitor ) return ((TESTVisitor<? extends T>)visitor).visitPm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PmContext pm() throws RecognitionException {
		PmContext _localctx = new PmContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_pm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class MdContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(TESTParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(TESTParser.DIV, 0); }
		public MdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_md; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TESTListener ) ((TESTListener)listener).enterMd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TESTListener ) ((TESTListener)listener).exitMd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TESTVisitor ) return ((TESTVisitor<? extends T>)visitor).visitMd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MdContext md() throws RecognitionException {
		MdContext _localctx = new MdContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_md);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_la = _input.LA(1);
			if ( !(_la==MULT || _la==DIV) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Expression2Context extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Expression2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TESTListener ) ((TESTListener)listener).enterExpression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TESTListener ) ((TESTListener)listener).exitExpression2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TESTVisitor ) return ((TESTVisitor<? extends T>)visitor).visitExpression2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression2Context expression2() throws RecognitionException {
		Expression2Context _localctx = new Expression2Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_expression2);
		try {
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				match(T__1);
				setState(177);
				expression(0);
				setState(178);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				value();
				}
				break;
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(TESTParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(TESTParser.FLOAT, 0); }
		public TerminalNode TEXT() { return getToken(TESTParser.TEXT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TESTListener ) ((TESTListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TESTListener ) ((TESTListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TESTVisitor ) return ((TESTVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_value);
		try {
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				match(FLOAT);
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 3);
				{
				setState(185);
				match(TEXT);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(186);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		case 15:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 16:
			return expression1_sempred((Expression1Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expression1_sempred(Expression1Context _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u00c0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3;\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5"+
		"\5E\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\5\bN\n\b\3\b\3\b\5\bR\n\b\3\b\3\b"+
		"\3\b\5\bW\n\b\3\b\3\b\3\b\5\b\\\n\b\3\b\3\b\5\b`\n\b\3\b\5\bc\n\b\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nv"+
		"\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u0083\n\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u009d\n\21\f\21\16\21"+
		"\u00a0\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00a9\n\22\f\22\16"+
		"\22\u00ac\13\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25"+
		"\u00b8\n\25\3\26\3\26\3\26\3\26\5\26\u00be\n\26\3\26\2\4 \"\27\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\6\3\2\r\17\4\2\13\f\34\35\3\2"+
		"\30\31\3\2\32\33\2\u00bf\2,\3\2\2\2\4:\3\2\2\2\6<\3\2\2\2\bD\3\2\2\2\n"+
		"F\3\2\2\2\fH\3\2\2\2\16b\3\2\2\2\20d\3\2\2\2\22h\3\2\2\2\24w\3\2\2\2\26"+
		"y\3\2\2\2\30~\3\2\2\2\32\u0086\3\2\2\2\34\u008f\3\2\2\2\36\u0093\3\2\2"+
		"\2 \u0095\3\2\2\2\"\u00a1\3\2\2\2$\u00ad\3\2\2\2&\u00af\3\2\2\2(\u00b7"+
		"\3\2\2\2*\u00bd\3\2\2\2,-\7\3\2\2-.\7\36\2\2./\7\4\2\2/\60\7\5\2\2\60"+
		"\61\7\6\2\2\61\62\5\4\3\2\62\63\7\22\2\2\63\64\5\16\b\2\64\65\7\7\2\2"+
		"\65\3\3\2\2\2\66\67\5\6\4\2\678\5\4\3\28;\3\2\2\29;\5\6\4\2:\66\3\2\2"+
		"\2:9\3\2\2\2;\5\3\2\2\2<=\5\f\7\2=>\5\b\5\2>?\7\b\2\2?\7\3\2\2\2@A\7\37"+
		"\2\2AB\7\t\2\2BE\5\b\5\2CE\7\37\2\2D@\3\2\2\2DC\3\2\2\2E\t\3\2\2\2FG\7"+
		"\37\2\2G\13\3\2\2\2HI\t\2\2\2I\r\3\2\2\2JK\5\20\t\2KM\7\b\2\2LN\5\16\b"+
		"\2ML\3\2\2\2MN\3\2\2\2Nc\3\2\2\2OQ\5\22\n\2PR\5\16\b\2QP\3\2\2\2QR\3\2"+
		"\2\2Rc\3\2\2\2ST\5\26\f\2TV\7\b\2\2UW\5\16\b\2VU\3\2\2\2VW\3\2\2\2Wc\3"+
		"\2\2\2XY\5\30\r\2Y[\7\b\2\2Z\\\5\16\b\2[Z\3\2\2\2[\\\3\2\2\2\\c\3\2\2"+
		"\2]_\5\32\16\2^`\5\16\b\2_^\3\2\2\2_`\3\2\2\2`c\3\2\2\2ac\3\2\2\2bJ\3"+
		"\2\2\2bO\3\2\2\2bS\3\2\2\2bX\3\2\2\2b]\3\2\2\2ba\3\2\2\2c\17\3\2\2\2d"+
		"e\5\n\6\2ef\7\n\2\2fg\5 \21\2g\21\3\2\2\2hi\7\23\2\2ij\7\4\2\2jk\5\34"+
		"\17\2kl\7\5\2\2lm\7\24\2\2mn\7\6\2\2no\5\16\b\2ou\7\7\2\2pq\5\24\13\2"+
		"qr\7\6\2\2rs\5\16\b\2st\7\7\2\2tv\3\2\2\2up\3\2\2\2uv\3\2\2\2v\23\3\2"+
		"\2\2wx\7\25\2\2x\25\3\2\2\2yz\7\20\2\2z{\7\4\2\2{|\5\b\5\2|}\7\5\2\2}"+
		"\27\3\2\2\2~\177\7\21\2\2\177\u0082\7\4\2\2\u0080\u0083\5\b\5\2\u0081"+
		"\u0083\7#\2\2\u0082\u0080\3\2\2\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2"+
		"\2\2\u0084\u0085\7\5\2\2\u0085\31\3\2\2\2\u0086\u0087\7\27\2\2\u0087\u0088"+
		"\7\6\2\2\u0088\u0089\5\16\b\2\u0089\u008a\7\7\2\2\u008a\u008b\7\26\2\2"+
		"\u008b\u008c\7\4\2\2\u008c\u008d\5\34\17\2\u008d\u008e\7\5\2\2\u008e\33"+
		"\3\2\2\2\u008f\u0090\5 \21\2\u0090\u0091\5\36\20\2\u0091\u0092\5 \21\2"+
		"\u0092\35\3\2\2\2\u0093\u0094\t\3\2\2\u0094\37\3\2\2\2\u0095\u0096\b\21"+
		"\1\2\u0096\u0097\5\"\22\2\u0097\u009e\3\2\2\2\u0098\u0099\f\4\2\2\u0099"+
		"\u009a\5$\23\2\u009a\u009b\5\"\22\2\u009b\u009d\3\2\2\2\u009c\u0098\3"+
		"\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"!\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\b\22\1\2\u00a2\u00a3\5(\25\2"+
		"\u00a3\u00aa\3\2\2\2\u00a4\u00a5\f\4\2\2\u00a5\u00a6\5&\24\2\u00a6\u00a7"+
		"\5(\25\2\u00a7\u00a9\3\2\2\2\u00a8\u00a4\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab#\3\2\2\2\u00ac\u00aa\3\2\2\2"+
		"\u00ad\u00ae\t\4\2\2\u00ae%\3\2\2\2\u00af\u00b0\t\5\2\2\u00b0\'\3\2\2"+
		"\2\u00b1\u00b8\5\n\6\2\u00b2\u00b3\7\4\2\2\u00b3\u00b4\5 \21\2\u00b4\u00b5"+
		"\7\5\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b8\5*\26\2\u00b7\u00b1\3\2\2\2\u00b7"+
		"\u00b2\3\2\2\2\u00b7\u00b6\3\2\2\2\u00b8)\3\2\2\2\u00b9\u00be\7 \2\2\u00ba"+
		"\u00be\7!\2\2\u00bb\u00be\7#\2\2\u00bc\u00be\5\n\6\2\u00bd\u00b9\3\2\2"+
		"\2\u00bd\u00ba\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be+"+
		"\3\2\2\2\20:DMQV[_bu\u0082\u009e\u00aa\u00b7\u00bd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}