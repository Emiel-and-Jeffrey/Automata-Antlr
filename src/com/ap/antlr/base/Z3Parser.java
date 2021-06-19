// Generated from C:/School/Antlr/src/com/ap/antlr/grammars\Z3Parser.g4 by ANTLR 4.9.1
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
		GREATER_THAN_OR_EQUAL=8, LESS_THAN_OR_EQUAL=9, DOT=10, MINUS=11, ADD=12, 
		AND=13, OR=14, NOT=15, IF_ELSE=16, FUNC=17, LET=18, INT=19, STRING=20, 
		BOOL=21, IDENTIFIER=22, STRING_LITERAL=23, NUMBER=24, WS=25;
	public static final int
		RULE_result = 0, RULE_statement = 1, RULE_value = 2, RULE_function = 3, 
		RULE_parameter = 4, RULE_function_call = 5, RULE_variable = 6, RULE_logical_expression = 7, 
		RULE_numeric_expression = 8, RULE_comparison_expression = 9, RULE_types = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"result", "statement", "value", "function", "parameter", "function_call", 
			"variable", "logical_expression", "numeric_expression", "comparison_expression", 
			"types"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'sat'", "'model'", "'('", "')'", "'='", "'>'", "'<'", "'>='", 
			"'<='", "'.'", "'-'", "'+'", "'and'", "'or'", "'not'", "'ite'", "'define-fun'", 
			"'let'", "'Int'", "'String'", "'Bool'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SAT", "MODEL", "LPAREN", "RPAREN", "EQUALS", "GREATER_THAN", "LESS_THAN", 
			"GREATER_THAN_OR_EQUAL", "LESS_THAN_OR_EQUAL", "DOT", "MINUS", "ADD", 
			"AND", "OR", "NOT", "IF_ELSE", "FUNC", "LET", "INT", "STRING", "BOOL", 
			"IDENTIFIER", "STRING_LITERAL", "NUMBER", "WS"
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
			setState(22);
			match(SAT);
			setState(23);
			match(LPAREN);
			setState(24);
			match(MODEL);
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << IDENTIFIER) | (1L << STRING_LITERAL) | (1L << NUMBER))) != 0)) {
				{
				{
				setState(25);
				statement();
				}
				}
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(31);
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StatementVariableDeclarationContext extends StatementContext {
		public TerminalNode LPAREN() { return getToken(Z3Parser.LPAREN, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Z3Parser.RPAREN, 0); }
		public StatementVariableDeclarationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Z3ParserListener ) ((Z3ParserListener)listener).enterStatementVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Z3ParserListener ) ((Z3ParserListener)listener).exitStatementVariableDeclaration(this);
		}
	}
	public static class StatementValueContext extends StatementContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public StatementValueContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Z3ParserListener ) ((Z3ParserListener)listener).enterStatementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Z3ParserListener ) ((Z3ParserListener)listener).exitStatementValue(this);
		}
	}
	public static class StatementFunctionContext extends StatementContext {
		public TerminalNode LPAREN() { return getToken(Z3Parser.LPAREN, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Z3Parser.RPAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Z3ParserListener ) ((Z3ParserListener)listener).enterStatementFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Z3ParserListener ) ((Z3ParserListener)listener).exitStatementFunction(this);
		}
	}
	public static class StatementIfElseContext extends StatementContext {
		public TerminalNode LPAREN() { return getToken(Z3Parser.LPAREN, 0); }
		public TerminalNode IF_ELSE() { return getToken(Z3Parser.IF_ELSE, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(Z3Parser.RPAREN, 0); }
		public StatementIfElseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Z3ParserListener ) ((Z3ParserListener)listener).enterStatementIfElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Z3ParserListener ) ((Z3ParserListener)listener).exitStatementIfElse(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new StatementFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				match(LPAREN);
				setState(34);
				function();
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << IDENTIFIER) | (1L << STRING_LITERAL) | (1L << NUMBER))) != 0)) {
					{
					{
					setState(35);
					statement();
					}
					}
					setState(40);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(41);
				match(RPAREN);
				}
				break;
			case 2:
				_localctx = new StatementIfElseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				match(LPAREN);
				setState(44);
				match(IF_ELSE);
				setState(45);
				value();
				setState(46);
				statement();
				setState(47);
				statement();
				setState(48);
				match(RPAREN);
				}
				break;
			case 3:
				_localctx = new StatementVariableDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				match(LPAREN);
				setState(51);
				variable();
				setState(52);
				match(RPAREN);
				}
				break;
			case 4:
				_localctx = new StatementValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(54);
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
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValueBasicNumberContext extends ValueContext {
		public TerminalNode NUMBER() { return getToken(Z3Parser.NUMBER, 0); }
		public ValueBasicNumberContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Z3ParserListener ) ((Z3ParserListener)listener).enterValueBasicNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Z3ParserListener ) ((Z3ParserListener)listener).exitValueBasicNumber(this);
		}
	}
	public static class ValueVariableContext extends ValueContext {
		public TerminalNode IDENTIFIER() { return getToken(Z3Parser.IDENTIFIER, 0); }
		public ValueVariableContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Z3ParserListener ) ((Z3ParserListener)listener).enterValueVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Z3ParserListener ) ((Z3ParserListener)listener).exitValueVariable(this);
		}
	}
	public static class ValueFunctionCallContext extends ValueContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public ValueFunctionCallContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Z3ParserListener ) ((Z3ParserListener)listener).enterValueFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Z3ParserListener ) ((Z3ParserListener)listener).exitValueFunctionCall(this);
		}
	}
	public static class ValueLogicalExpressionContext extends ValueContext {
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
		}
		public ValueLogicalExpressionContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Z3ParserListener ) ((Z3ParserListener)listener).enterValueLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Z3ParserListener ) ((Z3ParserListener)listener).exitValueLogicalExpression(this);
		}
	}
	public static class ValueNumericExpressionContext extends ValueContext {
		public Numeric_expressionContext numeric_expression() {
			return getRuleContext(Numeric_expressionContext.class,0);
		}
		public ValueNumericExpressionContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Z3ParserListener ) ((Z3ParserListener)listener).enterValueNumericExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Z3ParserListener ) ((Z3ParserListener)listener).exitValueNumericExpression(this);
		}
	}
	public static class ValueComparisonExpresssionContext extends ValueContext {
		public Comparison_expressionContext comparison_expression() {
			return getRuleContext(Comparison_expressionContext.class,0);
		}
		public ValueComparisonExpresssionContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Z3ParserListener ) ((Z3ParserListener)listener).enterValueComparisonExpresssion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Z3ParserListener ) ((Z3ParserListener)listener).exitValueComparisonExpresssion(this);
		}
	}
	public static class ValueStringContext extends ValueContext {
		public TerminalNode STRING_LITERAL() { return getToken(Z3Parser.STRING_LITERAL, 0); }
		public ValueStringContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Z3ParserListener ) ((Z3ParserListener)listener).enterValueString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Z3ParserListener ) ((Z3ParserListener)listener).exitValueString(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_value);
		try {
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new ValueVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new ValueStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				match(STRING_LITERAL);
				}
				break;
			case 3:
				_localctx = new ValueBasicNumberContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				match(NUMBER);
				}
				break;
			case 4:
				_localctx = new ValueComparisonExpresssionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(60);
				comparison_expression();
				}
				break;
			case 5:
				_localctx = new ValueFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(61);
				function_call();
				}
				break;
			case 6:
				_localctx = new ValueLogicalExpressionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(62);
				logical_expression();
				}
				break;
			case 7:
				_localctx = new ValueNumericExpressionContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(63);
				numeric_expression();
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
		enterRule(_localctx, 6, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(FUNC);
			setState(67);
			match(IDENTIFIER);
			setState(68);
			match(LPAREN);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAREN) {
				{
				{
				setState(69);
				parameter();
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
			match(RPAREN);
			setState(76);
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
		enterRule(_localctx, 8, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(LPAREN);
			setState(79);
			match(IDENTIFIER);
			setState(80);
			types();
			setState(81);
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

	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Z3Parser.LPAREN, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(Z3Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Z3Parser.IDENTIFIER, i);
		}
		public TerminalNode RPAREN() { return getToken(Z3Parser.RPAREN, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Z3ParserListener ) ((Z3ParserListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Z3ParserListener ) ((Z3ParserListener)listener).exitFunction_call(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function_call);
		int _la;
		try {
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				match(LPAREN);
				setState(84);
				match(IDENTIFIER);
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << IDENTIFIER) | (1L << STRING_LITERAL) | (1L << NUMBER))) != 0)) {
					{
					{
					setState(85);
					value();
					}
					}
					setState(90);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(91);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				match(LPAREN);
				setState(93);
				match(IDENTIFIER);
				setState(94);
				matchWildcard();
				setState(95);
				match(IDENTIFIER);
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << IDENTIFIER) | (1L << STRING_LITERAL) | (1L << NUMBER))) != 0)) {
					{
					{
					setState(96);
					value();
					}
					}
					setState(101);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(102);
				match(RPAREN);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(Z3Parser.LET, 0); }
		public TerminalNode LPAREN() { return getToken(Z3Parser.LPAREN, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Z3ParserListener ) ((Z3ParserListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Z3ParserListener ) ((Z3ParserListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(LET);
			setState(106);
			match(LPAREN);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << IDENTIFIER) | (1L << STRING_LITERAL) | (1L << NUMBER))) != 0)) {
				{
				{
				setState(107);
				value();
				}
				}
				setState(112);
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
	public static class LogicalExpressionAndContext extends Logical_expressionContext {
		public TerminalNode LPAREN() { return getToken(Z3Parser.LPAREN, 0); }
		public TerminalNode AND() { return getToken(Z3Parser.AND, 0); }
		public TerminalNode RPAREN() { return getToken(Z3Parser.RPAREN, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
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
	public static class LogicalExpressionOrContext extends Logical_expressionContext {
		public TerminalNode LPAREN() { return getToken(Z3Parser.LPAREN, 0); }
		public TerminalNode OR() { return getToken(Z3Parser.OR, 0); }
		public TerminalNode RPAREN() { return getToken(Z3Parser.RPAREN, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public LogicalExpressionOrContext(Logical_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Z3ParserListener ) ((Z3ParserListener)listener).enterLogicalExpressionOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Z3ParserListener ) ((Z3ParserListener)listener).exitLogicalExpressionOr(this);
		}
	}
	public static class LogicalExpressionNotContext extends Logical_expressionContext {
		public TerminalNode LPAREN() { return getToken(Z3Parser.LPAREN, 0); }
		public TerminalNode NOT() { return getToken(Z3Parser.NOT, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Z3Parser.RPAREN, 0); }
		public LogicalExpressionNotContext(Logical_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Z3ParserListener ) ((Z3ParserListener)listener).enterLogicalExpressionNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Z3ParserListener ) ((Z3ParserListener)listener).exitLogicalExpressionNot(this);
		}
	}

	public final Logical_expressionContext logical_expression() throws RecognitionException {
		Logical_expressionContext _localctx = new Logical_expressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_logical_expression);
		int _la;
		try {
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new LogicalExpressionAndContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				match(LPAREN);
				setState(114);
				match(AND);
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << IDENTIFIER) | (1L << STRING_LITERAL) | (1L << NUMBER))) != 0)) {
					{
					{
					setState(115);
					value();
					}
					}
					setState(120);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(121);
				match(RPAREN);
				}
				break;
			case 2:
				_localctx = new LogicalExpressionOrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				match(LPAREN);
				setState(123);
				match(OR);
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << IDENTIFIER) | (1L << STRING_LITERAL) | (1L << NUMBER))) != 0)) {
					{
					{
					setState(124);
					value();
					}
					}
					setState(129);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(130);
				match(RPAREN);
				}
				break;
			case 3:
				_localctx = new LogicalExpressionNotContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				match(LPAREN);
				setState(132);
				match(NOT);
				setState(133);
				value();
				setState(134);
				match(RPAREN);
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
	public static class NumericExpressionAddContext extends Numeric_expressionContext {
		public TerminalNode LPAREN() { return getToken(Z3Parser.LPAREN, 0); }
		public TerminalNode ADD() { return getToken(Z3Parser.ADD, 0); }
		public TerminalNode RPAREN() { return getToken(Z3Parser.RPAREN, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public NumericExpressionAddContext(Numeric_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Z3ParserListener ) ((Z3ParserListener)listener).enterNumericExpressionAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Z3ParserListener ) ((Z3ParserListener)listener).exitNumericExpressionAdd(this);
		}
	}
	public static class NumericExpressionMinusContext extends Numeric_expressionContext {
		public TerminalNode LPAREN() { return getToken(Z3Parser.LPAREN, 0); }
		public TerminalNode MINUS() { return getToken(Z3Parser.MINUS, 0); }
		public TerminalNode RPAREN() { return getToken(Z3Parser.RPAREN, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public NumericExpressionMinusContext(Numeric_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Z3ParserListener ) ((Z3ParserListener)listener).enterNumericExpressionMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Z3ParserListener ) ((Z3ParserListener)listener).exitNumericExpressionMinus(this);
		}
	}

	public final Numeric_expressionContext numeric_expression() throws RecognitionException {
		Numeric_expressionContext _localctx = new Numeric_expressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_numeric_expression);
		int _la;
		try {
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new NumericExpressionAddContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(LPAREN);
				setState(139);
				match(ADD);
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << IDENTIFIER) | (1L << STRING_LITERAL) | (1L << NUMBER))) != 0)) {
					{
					{
					setState(140);
					value();
					}
					}
					setState(145);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(146);
				match(RPAREN);
				}
				break;
			case 2:
				_localctx = new NumericExpressionMinusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				match(LPAREN);
				setState(148);
				match(MINUS);
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << IDENTIFIER) | (1L << STRING_LITERAL) | (1L << NUMBER))) != 0)) {
					{
					{
					setState(149);
					value();
					}
					}
					setState(154);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(155);
				match(RPAREN);
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
		public TerminalNode LPAREN() { return getToken(Z3Parser.LPAREN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(Z3Parser.GREATER_THAN, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(Z3Parser.RPAREN, 0); }
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
		public TerminalNode LPAREN() { return getToken(Z3Parser.LPAREN, 0); }
		public TerminalNode LESS_THAN() { return getToken(Z3Parser.LESS_THAN, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(Z3Parser.RPAREN, 0); }
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
		public TerminalNode LPAREN() { return getToken(Z3Parser.LPAREN, 0); }
		public TerminalNode LESS_THAN_OR_EQUAL() { return getToken(Z3Parser.LESS_THAN_OR_EQUAL, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(Z3Parser.RPAREN, 0); }
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
		public TerminalNode LPAREN() { return getToken(Z3Parser.LPAREN, 0); }
		public TerminalNode EQUALS() { return getToken(Z3Parser.EQUALS, 0); }
		public TerminalNode RPAREN() { return getToken(Z3Parser.RPAREN, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
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
		public TerminalNode LPAREN() { return getToken(Z3Parser.LPAREN, 0); }
		public TerminalNode GREATER_THAN_OR_EQUAL() { return getToken(Z3Parser.GREATER_THAN_OR_EQUAL, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(Z3Parser.RPAREN, 0); }
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

	public final Comparison_expressionContext comparison_expression() throws RecognitionException {
		Comparison_expressionContext _localctx = new Comparison_expressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_comparison_expression);
		int _la;
		try {
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new ComparisonExpressionGreaterThanContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				match(LPAREN);
				setState(159);
				match(GREATER_THAN);
				setState(160);
				value();
				setState(161);
				value();
				setState(162);
				match(RPAREN);
				}
				break;
			case 2:
				_localctx = new ComparisonExpressionGreaterThanOrEqualContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				match(LPAREN);
				setState(165);
				match(GREATER_THAN_OR_EQUAL);
				setState(166);
				value();
				setState(167);
				value();
				setState(168);
				match(RPAREN);
				}
				break;
			case 3:
				_localctx = new ComparisonExpressionLessThanContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				match(LPAREN);
				setState(171);
				match(LESS_THAN);
				setState(172);
				value();
				setState(173);
				value();
				setState(174);
				match(RPAREN);
				}
				break;
			case 4:
				_localctx = new ComparisonExpressionLessThanOrEqualContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(176);
				match(LPAREN);
				setState(177);
				match(LESS_THAN_OR_EQUAL);
				setState(178);
				value();
				setState(179);
				value();
				setState(180);
				match(RPAREN);
				}
				break;
			case 5:
				_localctx = new ComparisonExpressionEqualToContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(182);
				match(LPAREN);
				setState(183);
				match(EQUALS);
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << IDENTIFIER) | (1L << STRING_LITERAL) | (1L << NUMBER))) != 0)) {
					{
					{
					setState(184);
					value();
					}
					}
					setState(189);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(190);
				match(RPAREN);
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

	public static class TypesContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(Z3Parser.INT, 0); }
		public TerminalNode STRING() { return getToken(Z3Parser.STRING, 0); }
		public TerminalNode BOOL() { return getToken(Z3Parser.BOOL, 0); }
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
		enterRule(_localctx, 20, RULE_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << BOOL))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33\u00c6\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\3\2\3\2\7\2\35\n\2\f\2\16\2 \13\2\3\2\3\2\3\3\3"+
		"\3\3\3\7\3\'\n\3\f\3\16\3*\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\5\3:\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4C\n\4\3\5\3"+
		"\5\3\5\3\5\7\5I\n\5\f\5\16\5L\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\7\7Y\n\7\f\7\16\7\\\13\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7d\n\7\f\7"+
		"\16\7g\13\7\3\7\5\7j\n\7\3\b\3\b\3\b\7\bo\n\b\f\b\16\br\13\b\3\t\3\t\3"+
		"\t\7\tw\n\t\f\t\16\tz\13\t\3\t\3\t\3\t\3\t\7\t\u0080\n\t\f\t\16\t\u0083"+
		"\13\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u008b\n\t\3\n\3\n\3\n\7\n\u0090\n\n"+
		"\f\n\16\n\u0093\13\n\3\n\3\n\3\n\3\n\7\n\u0099\n\n\f\n\16\n\u009c\13\n"+
		"\3\n\5\n\u009f\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\7\13\u00bc\n\13\f\13\16\13\u00bf\13\13\3\13\5\13\u00c2\n"+
		"\13\3\f\3\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\3\3\2\25\27\2\u00d6"+
		"\2\30\3\2\2\2\49\3\2\2\2\6B\3\2\2\2\bD\3\2\2\2\nP\3\2\2\2\fi\3\2\2\2\16"+
		"k\3\2\2\2\20\u008a\3\2\2\2\22\u009e\3\2\2\2\24\u00c1\3\2\2\2\26\u00c3"+
		"\3\2\2\2\30\31\7\3\2\2\31\32\7\5\2\2\32\36\7\4\2\2\33\35\5\4\3\2\34\33"+
		"\3\2\2\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37!\3\2\2\2 \36\3\2\2"+
		"\2!\"\7\6\2\2\"\3\3\2\2\2#$\7\5\2\2$(\5\b\5\2%\'\5\4\3\2&%\3\2\2\2\'*"+
		"\3\2\2\2(&\3\2\2\2()\3\2\2\2)+\3\2\2\2*(\3\2\2\2+,\7\6\2\2,:\3\2\2\2-"+
		".\7\5\2\2./\7\22\2\2/\60\5\6\4\2\60\61\5\4\3\2\61\62\5\4\3\2\62\63\7\6"+
		"\2\2\63:\3\2\2\2\64\65\7\5\2\2\65\66\5\16\b\2\66\67\7\6\2\2\67:\3\2\2"+
		"\28:\5\6\4\29#\3\2\2\29-\3\2\2\29\64\3\2\2\298\3\2\2\2:\5\3\2\2\2;C\7"+
		"\30\2\2<C\7\31\2\2=C\7\32\2\2>C\5\24\13\2?C\5\f\7\2@C\5\20\t\2AC\5\22"+
		"\n\2B;\3\2\2\2B<\3\2\2\2B=\3\2\2\2B>\3\2\2\2B?\3\2\2\2B@\3\2\2\2BA\3\2"+
		"\2\2C\7\3\2\2\2DE\7\23\2\2EF\7\30\2\2FJ\7\5\2\2GI\5\n\6\2HG\3\2\2\2IL"+
		"\3\2\2\2JH\3\2\2\2JK\3\2\2\2KM\3\2\2\2LJ\3\2\2\2MN\7\6\2\2NO\5\26\f\2"+
		"O\t\3\2\2\2PQ\7\5\2\2QR\7\30\2\2RS\5\26\f\2ST\7\6\2\2T\13\3\2\2\2UV\7"+
		"\5\2\2VZ\7\30\2\2WY\5\6\4\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2["+
		"]\3\2\2\2\\Z\3\2\2\2]j\7\6\2\2^_\7\5\2\2_`\7\30\2\2`a\13\2\2\2ae\7\30"+
		"\2\2bd\5\6\4\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ge\3\2"+
		"\2\2hj\7\6\2\2iU\3\2\2\2i^\3\2\2\2j\r\3\2\2\2kl\7\24\2\2lp\7\5\2\2mo\5"+
		"\6\4\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\17\3\2\2\2rp\3\2\2\2s"+
		"t\7\5\2\2tx\7\17\2\2uw\5\6\4\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2"+
		"y{\3\2\2\2zx\3\2\2\2{\u008b\7\6\2\2|}\7\5\2\2}\u0081\7\20\2\2~\u0080\5"+
		"\6\4\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u008b\7\6\2\2\u0085"+
		"\u0086\7\5\2\2\u0086\u0087\7\21\2\2\u0087\u0088\5\6\4\2\u0088\u0089\7"+
		"\6\2\2\u0089\u008b\3\2\2\2\u008as\3\2\2\2\u008a|\3\2\2\2\u008a\u0085\3"+
		"\2\2\2\u008b\21\3\2\2\2\u008c\u008d\7\5\2\2\u008d\u0091\7\16\2\2\u008e"+
		"\u0090\5\6\4\2\u008f\u008e\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2"+
		"\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094"+
		"\u009f\7\6\2\2\u0095\u0096\7\5\2\2\u0096\u009a\7\r\2\2\u0097\u0099\5\6"+
		"\4\2\u0098\u0097\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009f\7\6"+
		"\2\2\u009e\u008c\3\2\2\2\u009e\u0095\3\2\2\2\u009f\23\3\2\2\2\u00a0\u00a1"+
		"\7\5\2\2\u00a1\u00a2\7\b\2\2\u00a2\u00a3\5\6\4\2\u00a3\u00a4\5\6\4\2\u00a4"+
		"\u00a5\7\6\2\2\u00a5\u00c2\3\2\2\2\u00a6\u00a7\7\5\2\2\u00a7\u00a8\7\n"+
		"\2\2\u00a8\u00a9\5\6\4\2\u00a9\u00aa\5\6\4\2\u00aa\u00ab\7\6\2\2\u00ab"+
		"\u00c2\3\2\2\2\u00ac\u00ad\7\5\2\2\u00ad\u00ae\7\t\2\2\u00ae\u00af\5\6"+
		"\4\2\u00af\u00b0\5\6\4\2\u00b0\u00b1\7\6\2\2\u00b1\u00c2\3\2\2\2\u00b2"+
		"\u00b3\7\5\2\2\u00b3\u00b4\7\13\2\2\u00b4\u00b5\5\6\4\2\u00b5\u00b6\5"+
		"\6\4\2\u00b6\u00b7\7\6\2\2\u00b7\u00c2\3\2\2\2\u00b8\u00b9\7\5\2\2\u00b9"+
		"\u00bd\7\7\2\2\u00ba\u00bc\5\6\4\2\u00bb\u00ba\3\2\2\2\u00bc\u00bf\3\2"+
		"\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00c0\u00c2\7\6\2\2\u00c1\u00a0\3\2\2\2\u00c1\u00a6\3\2"+
		"\2\2\u00c1\u00ac\3\2\2\2\u00c1\u00b2\3\2\2\2\u00c1\u00b8\3\2\2\2\u00c2"+
		"\25\3\2\2\2\u00c3\u00c4\t\2\2\2\u00c4\27\3\2\2\2\23\36(9BJZeipx\u0081"+
		"\u008a\u0091\u009a\u009e\u00bd\u00c1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}