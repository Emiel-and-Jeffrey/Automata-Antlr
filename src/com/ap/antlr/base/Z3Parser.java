// Generated from B:/Code/School/Jaar 2/Semester 4/Automata/src/com/ap/antlr/grammars\Z3Parser.g4 by ANTLR 4.9.1
package com.ap.antlr.base;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Z3Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SAT=1, MODEL=2, LPAREN=3, RPAREN=4, EQUALS=5, GREATER_THAN=6, LESS_THAN=7, 
		GREATER_THAN_OR_EQUAL=8, LESS_THAN_OR_EQUAL=9, EXLAMATION_MARK=10, AND=11, 
		IF_ELSE=12, FUNC=13, INT=14, IDENTIFIER=15, NUMBER=16, WS=17;
	public static final int
		RULE_result = 0, RULE_statement = 1, RULE_function = 2, RULE_parameter = 3, 
		RULE_logical_expression = 4, RULE_numeric_expression = 5, RULE_comparison_expression = 6, 
		RULE_types = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"result", "statement", "function", "parameter", "logical_expression", 
			"numeric_expression", "comparison_expression", "types"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'sat'", "'model'", "'('", "')'", "'='", "'>'", "'<'", "'>='", 
			"'<='", "'!'", "'and'", "'ite'", "'define-fun'", "'Int'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SAT", "MODEL", "LPAREN", "RPAREN", "EQUALS", "GREATER_THAN", "LESS_THAN", 
			"GREATER_THAN_OR_EQUAL", "LESS_THAN_OR_EQUAL", "EXLAMATION_MARK", "AND", 
			"IF_ELSE", "FUNC", "INT", "IDENTIFIER", "NUMBER", "WS"
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
	public String getGrammarFileName() { return "Z3Parser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Z3Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ResultContext extends ParserRuleContext {
		public TerminalNode SAT() { return getToken(Z3Parser.SAT, 0); }
		public TerminalNode LPAREN() { return getToken(Z3Parser.LPAREN, 0); }
		public TerminalNode MODEL() { return getToken(Z3Parser.MODEL, 0); }
		public TerminalNode RPAREN() { return getToken(Z3Parser.RPAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Z3ParserListener ) ((Z3ParserListener)listener).enterResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Z3ParserListener ) ((Z3ParserListener)listener).exitResult(this);
		}
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_result);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(SAT);
			setState(17);
			match(LPAREN);
			setState(18);
			match(MODEL);
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAREN || _la==NUMBER) {
				{
				{
				setState(19);
				statement();
				}
				}
				setState(24);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(25);
			match(RPAREN);
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

	public static class StatementContext extends ParserRuleContext {
		public List<TerminalNode> LPAREN() { return getTokens(Z3Parser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(Z3Parser.LPAREN, i);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(Z3Parser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(Z3Parser.RPAREN, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode IF_ELSE() { return getToken(Z3Parser.IF_ELSE, 0); }
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(Z3Parser.NUMBER, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Z3ParserListener ) ((Z3ParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Z3ParserListener ) ((Z3ParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				match(LPAREN);
				setState(28);
				function();
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LPAREN || _la==NUMBER) {
					{
					{
					setState(29);
					statement();
					}
					}
					setState(34);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(35);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				match(LPAREN);
				setState(38);
				match(IF_ELSE);
				setState(39);
				match(LPAREN);
				setState(40);
				logical_expression();
				setState(41);
				match(RPAREN);
				setState(42);
				statement();
				setState(43);
				statement();
				setState(44);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				match(NUMBER);
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(Z3Parser.FUNC, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Z3Parser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(Z3Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Z3Parser.RPAREN, 0); }
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Z3ParserListener ) ((Z3ParserListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Z3ParserListener ) ((Z3ParserListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(FUNC);
			setState(50);
			match(IDENTIFIER);
			setState(51);
			match(LPAREN);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAREN) {
				{
				{
				setState(52);
				parameter();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
			match(RPAREN);
			setState(59);
			types();
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

	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Z3Parser.LPAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Z3Parser.IDENTIFIER, 0); }
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Z3Parser.RPAREN, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Z3ParserListener ) ((Z3ParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Z3ParserListener ) ((Z3ParserListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(LPAREN);
			setState(62);
			match(IDENTIFIER);
			setState(63);
			types();
			setState(64);
			match(RPAREN);
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

	public static class Logical_expressionContext extends ParserRuleContext {
		public Logical_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_expression; }
	 
		public Logical_expressionContext() { }
		public void copyFrom(Logical_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalExpressionComparisonContext extends Logical_expressionContext {
		public Comparison_expressionContext comparison_expression() {
			return getRuleContext(Comparison_expressionContext.class,0);
		}
		public LogicalExpressionComparisonContext(Logical_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Z3ParserListener ) ((Z3ParserListener)listener).enterLogicalExpressionComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Z3ParserListener ) ((Z3ParserListener)listener).exitLogicalExpressionComparison(this);
		}
	}
	public static class LogicalExpressionAndContext extends Logical_expressionContext {
		public TerminalNode AND() { return getToken(Z3Parser.AND, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(Z3Parser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(Z3Parser.LPAREN, i);
		}
		public List<Logical_expressionContext> logical_expression() {
			return getRuleContexts(Logical_expressionContext.class);
		}
		public Logical_expressionContext logical_expression(int i) {
			return getRuleContext(Logical_expressionContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(Z3Parser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(Z3Parser.RPAREN, i);
		}
		public LogicalExpressionAndContext(Logical_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Z3ParserListener ) ((Z3ParserListener)listener).enterLogicalExpressionAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Z3ParserListener ) ((Z3ParserListener)listener).exitLogicalExpressionAnd(this);
		}
	}

	public final Logical_expressionContext logical_expression() throws RecognitionException {
		Logical_expressionContext _localctx = new Logical_expressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_logical_expression);
		try {
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				_localctx = new LogicalExpressionAndContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				match(AND);
				setState(67);
				match(LPAREN);
				setState(68);
				logical_expression();
				setState(69);
				match(RPAREN);
				setState(70);
				match(LPAREN);
				setState(71);
				logical_expression();
				setState(72);
				match(RPAREN);
				}
				break;
			case EQUALS:
			case GREATER_THAN:
			case LESS_THAN:
			case GREATER_THAN_OR_EQUAL:
			case LESS_THAN_OR_EQUAL:
			case IDENTIFIER:
				_localctx = new LogicalExpressionComparisonContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				comparison_expression();
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

	public static class Numeric_expressionContext extends ParserRuleContext {
		public Numeric_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_expression; }
	 
		public Numeric_expressionContext() { }
		public void copyFrom(Numeric_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MathExpressionBasicNumberContext extends Numeric_expressionContext {
		public TerminalNode NUMBER() { return getToken(Z3Parser.NUMBER, 0); }
		public MathExpressionBasicNumberContext(Numeric_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Z3ParserListener ) ((Z3ParserListener)listener).enterMathExpressionBasicNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Z3ParserListener ) ((Z3ParserListener)listener).exitMathExpressionBasicNumber(this);
		}
	}
	public static class MathExpressionVariableContext extends Numeric_expressionContext {
		public TerminalNode IDENTIFIER() { return getToken(Z3Parser.IDENTIFIER, 0); }
		public MathExpressionVariableContext(Numeric_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Z3ParserListener ) ((Z3ParserListener)listener).enterMathExpressionVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Z3ParserListener ) ((Z3ParserListener)listener).exitMathExpressionVariable(this);
		}
	}

	public final Numeric_expressionContext numeric_expression() throws RecognitionException {
		Numeric_expressionContext _localctx = new Numeric_expressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_numeric_expression);
		try {
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new MathExpressionVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				match(IDENTIFIER);
				}
				break;
			case NUMBER:
				_localctx = new MathExpressionBasicNumberContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				match(NUMBER);
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

	public static class Comparison_expressionContext extends ParserRuleContext {
		public Comparison_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_expression; }
	 
		public Comparison_expressionContext() { }
		public void copyFrom(Comparison_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComparisonExpressionGreaterThanContext extends Comparison_expressionContext {
		public TerminalNode GREATER_THAN() { return getToken(Z3Parser.GREATER_THAN, 0); }
		public List<Numeric_expressionContext> numeric_expression() {
			return getRuleContexts(Numeric_expressionContext.class);
		}
		public Numeric_expressionContext numeric_expression(int i) {
			return getRuleContext(Numeric_expressionContext.class,i);
		}
		public ComparisonExpressionGreaterThanContext(Comparison_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Z3ParserListener ) ((Z3ParserListener)listener).enterComparisonExpressionGreaterThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Z3ParserListener ) ((Z3ParserListener)listener).exitComparisonExpressionGreaterThan(this);
		}
	}
	public static class ComparisonExpressionLessThanContext extends Comparison_expressionContext {
		public TerminalNode LESS_THAN() { return getToken(Z3Parser.LESS_THAN, 0); }
		public List<Numeric_expressionContext> numeric_expression() {
			return getRuleContexts(Numeric_expressionContext.class);
		}
		public Numeric_expressionContext numeric_expression(int i) {
			return getRuleContext(Numeric_expressionContext.class,i);
		}
		public ComparisonExpressionLessThanContext(Comparison_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Z3ParserListener ) ((Z3ParserListener)listener).enterComparisonExpressionLessThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Z3ParserListener ) ((Z3ParserListener)listener).exitComparisonExpressionLessThan(this);
		}
	}
	public static class ComparisonExpressionLessThanOrEqualContext extends Comparison_expressionContext {
		public TerminalNode LESS_THAN_OR_EQUAL() { return getToken(Z3Parser.LESS_THAN_OR_EQUAL, 0); }
		public List<Numeric_expressionContext> numeric_expression() {
			return getRuleContexts(Numeric_expressionContext.class);
		}
		public Numeric_expressionContext numeric_expression(int i) {
			return getRuleContext(Numeric_expressionContext.class,i);
		}
		public ComparisonExpressionLessThanOrEqualContext(Comparison_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Z3ParserListener ) ((Z3ParserListener)listener).enterComparisonExpressionLessThanOrEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Z3ParserListener ) ((Z3ParserListener)listener).exitComparisonExpressionLessThanOrEqual(this);
		}
	}
	public static class ComparisonExpressionEqualToContext extends Comparison_expressionContext {
		public TerminalNode EQUALS() { return getToken(Z3Parser.EQUALS, 0); }
		public List<Numeric_expressionContext> numeric_expression() {
			return getRuleContexts(Numeric_expressionContext.class);
		}
		public Numeric_expressionContext numeric_expression(int i) {
			return getRuleContext(Numeric_expressionContext.class,i);
		}
		public ComparisonExpressionEqualToContext(Comparison_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Z3ParserListener ) ((Z3ParserListener)listener).enterComparisonExpressionEqualTo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Z3ParserListener ) ((Z3ParserListener)listener).exitComparisonExpressionEqualTo(this);
		}
	}
	public static class ComparisonExpressionGreaterThanOrEqualContext extends Comparison_expressionContext {
		public TerminalNode GREATER_THAN_OR_EQUAL() { return getToken(Z3Parser.GREATER_THAN_OR_EQUAL, 0); }
		public List<Numeric_expressionContext> numeric_expression() {
			return getRuleContexts(Numeric_expressionContext.class);
		}
		public Numeric_expressionContext numeric_expression(int i) {
			return getRuleContext(Numeric_expressionContext.class,i);
		}
		public ComparisonExpressionGreaterThanOrEqualContext(Comparison_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Z3ParserListener ) ((Z3ParserListener)listener).enterComparisonExpressionGreaterThanOrEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Z3ParserListener ) ((Z3ParserListener)listener).exitComparisonExpressionGreaterThanOrEqual(this);
		}
	}
	public static class ComparisonExpressionVariableContext extends Comparison_expressionContext {
		public TerminalNode IDENTIFIER() { return getToken(Z3Parser.IDENTIFIER, 0); }
		public ComparisonExpressionVariableContext(Comparison_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Z3ParserListener ) ((Z3ParserListener)listener).enterComparisonExpressionVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Z3ParserListener ) ((Z3ParserListener)listener).exitComparisonExpressionVariable(this);
		}
	}

	public final Comparison_expressionContext comparison_expression() throws RecognitionException {
		Comparison_expressionContext _localctx = new Comparison_expressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_comparison_expression);
		try {
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new ComparisonExpressionVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				match(IDENTIFIER);
				}
				break;
			case GREATER_THAN:
				_localctx = new ComparisonExpressionGreaterThanContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				match(GREATER_THAN);
				setState(83);
				numeric_expression();
				setState(84);
				numeric_expression();
				}
				break;
			case GREATER_THAN_OR_EQUAL:
				_localctx = new ComparisonExpressionGreaterThanOrEqualContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				match(GREATER_THAN_OR_EQUAL);
				setState(87);
				numeric_expression();
				setState(88);
				numeric_expression();
				}
				break;
			case LESS_THAN:
				_localctx = new ComparisonExpressionLessThanContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(90);
				match(LESS_THAN);
				setState(91);
				numeric_expression();
				setState(92);
				numeric_expression();
				}
				break;
			case LESS_THAN_OR_EQUAL:
				_localctx = new ComparisonExpressionLessThanOrEqualContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(94);
				match(LESS_THAN_OR_EQUAL);
				setState(95);
				numeric_expression();
				setState(96);
				numeric_expression();
				}
				break;
			case EQUALS:
				_localctx = new ComparisonExpressionEqualToContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(98);
				match(EQUALS);
				setState(99);
				numeric_expression();
				setState(100);
				numeric_expression();
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

	public static class TypesContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(Z3Parser.INT, 0); }
		public TypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Z3ParserListener ) ((Z3ParserListener)listener).enterTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Z3ParserListener ) ((Z3ParserListener)listener).exitTypes(this);
		}
	}

	public final TypesContext types() throws RecognitionException {
		TypesContext _localctx = new TypesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_types);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(INT);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23m\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2\7\2"+
		"\27\n\2\f\2\16\2\32\13\2\3\2\3\2\3\3\3\3\3\3\7\3!\n\3\f\3\16\3$\13\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\62\n\3\3\4\3\4\3\4"+
		"\3\4\7\48\n\4\f\4\16\4;\13\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6N\n\6\3\7\3\7\5\7R\n\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"i\n\b\3\t\3\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\2\2p\2\22\3\2\2\2\4\61\3\2"+
		"\2\2\6\63\3\2\2\2\b?\3\2\2\2\nM\3\2\2\2\fQ\3\2\2\2\16h\3\2\2\2\20j\3\2"+
		"\2\2\22\23\7\3\2\2\23\24\7\5\2\2\24\30\7\4\2\2\25\27\5\4\3\2\26\25\3\2"+
		"\2\2\27\32\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\33\3\2\2\2\32\30\3\2"+
		"\2\2\33\34\7\6\2\2\34\3\3\2\2\2\35\36\7\5\2\2\36\"\5\6\4\2\37!\5\4\3\2"+
		" \37\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#%\3\2\2\2$\"\3\2\2\2%&\7"+
		"\6\2\2&\62\3\2\2\2\'(\7\5\2\2()\7\16\2\2)*\7\5\2\2*+\5\n\6\2+,\7\6\2\2"+
		",-\5\4\3\2-.\5\4\3\2./\7\6\2\2/\62\3\2\2\2\60\62\7\22\2\2\61\35\3\2\2"+
		"\2\61\'\3\2\2\2\61\60\3\2\2\2\62\5\3\2\2\2\63\64\7\17\2\2\64\65\7\21\2"+
		"\2\659\7\5\2\2\668\5\b\5\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2"+
		"\2:<\3\2\2\2;9\3\2\2\2<=\7\6\2\2=>\5\20\t\2>\7\3\2\2\2?@\7\5\2\2@A\7\21"+
		"\2\2AB\5\20\t\2BC\7\6\2\2C\t\3\2\2\2DE\7\r\2\2EF\7\5\2\2FG\5\n\6\2GH\7"+
		"\6\2\2HI\7\5\2\2IJ\5\n\6\2JK\7\6\2\2KN\3\2\2\2LN\5\16\b\2MD\3\2\2\2ML"+
		"\3\2\2\2N\13\3\2\2\2OR\7\21\2\2PR\7\22\2\2QO\3\2\2\2QP\3\2\2\2R\r\3\2"+
		"\2\2Si\7\21\2\2TU\7\b\2\2UV\5\f\7\2VW\5\f\7\2Wi\3\2\2\2XY\7\n\2\2YZ\5"+
		"\f\7\2Z[\5\f\7\2[i\3\2\2\2\\]\7\t\2\2]^\5\f\7\2^_\5\f\7\2_i\3\2\2\2`a"+
		"\7\13\2\2ab\5\f\7\2bc\5\f\7\2ci\3\2\2\2de\7\7\2\2ef\5\f\7\2fg\5\f\7\2"+
		"gi\3\2\2\2hS\3\2\2\2hT\3\2\2\2hX\3\2\2\2h\\\3\2\2\2h`\3\2\2\2hd\3\2\2"+
		"\2i\17\3\2\2\2jk\7\20\2\2k\21\3\2\2\2\t\30\"\619MQh";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}