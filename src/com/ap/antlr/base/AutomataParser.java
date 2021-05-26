// Generated from B:/Code/School/Jaar 2/Semester 4/Automata/src/com/ap/antlr/grammars\AutomataParser.g4 by ANTLR 4.9.1
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
public class AutomataParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ADD=1, TIMES=2, DIVISION=3, MINUS=4, FACTORIAL=5, POWER=6, EQUALS=7, LEFT_PARENTHESIS=8, 
		RIGHT_PARENTHESIS=9, DOT=10, SEMICOLON=11, VARIABLE_TYPE_NUMBER=12, PRINT=13, 
		NUMBER=14, IDENTIFIER=15, WS=16;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_variable_declaration = 2, RULE_variable_assignment = 3, 
		RULE_numeric_expression = 4, RULE_print_expression = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "variable_declaration", "variable_assignment", 
			"numeric_expression", "print_expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'*'", "'/'", "'-'", "'!'", "'^'", "'='", "'('", "')'", 
			"'.'", "';'", "'number'", "'Print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ADD", "TIMES", "DIVISION", "MINUS", "FACTORIAL", "POWER", "EQUALS", 
			"LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", "DOT", "SEMICOLON", "VARIABLE_TYPE_NUMBER", 
			"PRINT", "NUMBER", "IDENTIFIER", "WS"
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
	public String getGrammarFileName() { return "AutomataParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AutomataParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(AutomataParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARIABLE_TYPE_NUMBER) | (1L << PRINT) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(12);
				statement();
				}
				}
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(18);
			match(EOF);
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
		public Print_expressionContext print_expression() {
			return getRuleContext(Print_expressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AutomataParser.SEMICOLON, 0); }
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Variable_assignmentContext variable_assignment() {
			return getRuleContext(Variable_assignmentContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(29);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				print_expression();
				setState(21);
				match(SEMICOLON);
				}
				break;
			case VARIABLE_TYPE_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				variable_declaration();
				setState(24);
				match(SEMICOLON);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(26);
				variable_assignment();
				setState(27);
				match(SEMICOLON);
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

	public static class Variable_declarationContext extends ParserRuleContext {
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
	 
		public Variable_declarationContext() { }
		public void copyFrom(Variable_declarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariableNumericDeclarationContext extends Variable_declarationContext {
		public TerminalNode VARIABLE_TYPE_NUMBER() { return getToken(AutomataParser.VARIABLE_TYPE_NUMBER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AutomataParser.IDENTIFIER, 0); }
		public VariableNumericDeclarationContext(Variable_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterVariableNumericDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitVariableNumericDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitVariableNumericDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableNumericInitializationContext extends Variable_declarationContext {
		public TerminalNode VARIABLE_TYPE_NUMBER() { return getToken(AutomataParser.VARIABLE_TYPE_NUMBER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AutomataParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(AutomataParser.EQUALS, 0); }
		public Numeric_expressionContext numeric_expression() {
			return getRuleContext(Numeric_expressionContext.class,0);
		}
		public VariableNumericInitializationContext(Variable_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterVariableNumericInitialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitVariableNumericInitialization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitVariableNumericInitialization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variable_declaration);
		try {
			setState(37);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new VariableNumericDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				match(VARIABLE_TYPE_NUMBER);
				setState(32);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new VariableNumericInitializationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				match(VARIABLE_TYPE_NUMBER);
				setState(34);
				match(IDENTIFIER);
				setState(35);
				match(EQUALS);
				setState(36);
				numeric_expression(0);
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

	public static class Variable_assignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AutomataParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(AutomataParser.EQUALS, 0); }
		public Numeric_expressionContext numeric_expression() {
			return getRuleContext(Numeric_expressionContext.class,0);
		}
		public Variable_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterVariable_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitVariable_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitVariable_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_assignmentContext variable_assignment() throws RecognitionException {
		Variable_assignmentContext _localctx = new Variable_assignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variable_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(IDENTIFIER);
			setState(40);
			match(EQUALS);
			setState(41);
			numeric_expression(0);
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
	public static class MathExpressionSumContext extends Numeric_expressionContext {
		public List<Numeric_expressionContext> numeric_expression() {
			return getRuleContexts(Numeric_expressionContext.class);
		}
		public Numeric_expressionContext numeric_expression(int i) {
			return getRuleContext(Numeric_expressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(AutomataParser.ADD, 0); }
		public MathExpressionSumContext(Numeric_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterMathExpressionSum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitMathExpressionSum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitMathExpressionSum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MathExpressionBasicNumberContext extends Numeric_expressionContext {
		public TerminalNode NUMBER() { return getToken(AutomataParser.NUMBER, 0); }
		public MathExpressionBasicNumberContext(Numeric_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterMathExpressionBasicNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitMathExpressionBasicNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitMathExpressionBasicNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MathExpressionTimesContext extends Numeric_expressionContext {
		public List<Numeric_expressionContext> numeric_expression() {
			return getRuleContexts(Numeric_expressionContext.class);
		}
		public Numeric_expressionContext numeric_expression(int i) {
			return getRuleContext(Numeric_expressionContext.class,i);
		}
		public TerminalNode TIMES() { return getToken(AutomataParser.TIMES, 0); }
		public MathExpressionTimesContext(Numeric_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterMathExpressionTimes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitMathExpressionTimes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitMathExpressionTimes(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MathExpressionMinusContext extends Numeric_expressionContext {
		public List<Numeric_expressionContext> numeric_expression() {
			return getRuleContexts(Numeric_expressionContext.class);
		}
		public Numeric_expressionContext numeric_expression(int i) {
			return getRuleContext(Numeric_expressionContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(AutomataParser.MINUS, 0); }
		public MathExpressionMinusContext(Numeric_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterMathExpressionMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitMathExpressionMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitMathExpressionMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MathExpressionFactorialContext extends Numeric_expressionContext {
		public Numeric_expressionContext numeric_expression() {
			return getRuleContext(Numeric_expressionContext.class,0);
		}
		public TerminalNode FACTORIAL() { return getToken(AutomataParser.FACTORIAL, 0); }
		public MathExpressionFactorialContext(Numeric_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterMathExpressionFactorial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitMathExpressionFactorial(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitMathExpressionFactorial(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MathExpressionVariableContext extends Numeric_expressionContext {
		public TerminalNode IDENTIFIER() { return getToken(AutomataParser.IDENTIFIER, 0); }
		public MathExpressionVariableContext(Numeric_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterMathExpressionVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitMathExpressionVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitMathExpressionVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MathExpressionParenthesesContext extends Numeric_expressionContext {
		public TerminalNode LEFT_PARENTHESIS() { return getToken(AutomataParser.LEFT_PARENTHESIS, 0); }
		public Numeric_expressionContext numeric_expression() {
			return getRuleContext(Numeric_expressionContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(AutomataParser.RIGHT_PARENTHESIS, 0); }
		public MathExpressionParenthesesContext(Numeric_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterMathExpressionParentheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitMathExpressionParentheses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitMathExpressionParentheses(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MathExpressionPowerContext extends Numeric_expressionContext {
		public List<Numeric_expressionContext> numeric_expression() {
			return getRuleContexts(Numeric_expressionContext.class);
		}
		public Numeric_expressionContext numeric_expression(int i) {
			return getRuleContext(Numeric_expressionContext.class,i);
		}
		public TerminalNode POWER() { return getToken(AutomataParser.POWER, 0); }
		public MathExpressionPowerContext(Numeric_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterMathExpressionPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitMathExpressionPower(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitMathExpressionPower(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MathExpressionDivisionContext extends Numeric_expressionContext {
		public List<Numeric_expressionContext> numeric_expression() {
			return getRuleContexts(Numeric_expressionContext.class);
		}
		public Numeric_expressionContext numeric_expression(int i) {
			return getRuleContext(Numeric_expressionContext.class,i);
		}
		public TerminalNode DIVISION() { return getToken(AutomataParser.DIVISION, 0); }
		public MathExpressionDivisionContext(Numeric_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterMathExpressionDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitMathExpressionDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitMathExpressionDivision(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numeric_expressionContext numeric_expression() throws RecognitionException {
		return numeric_expression(0);
	}

	private Numeric_expressionContext numeric_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Numeric_expressionContext _localctx = new Numeric_expressionContext(_ctx, _parentState);
		Numeric_expressionContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_numeric_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				_localctx = new MathExpressionVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(44);
				match(IDENTIFIER);
				}
				break;
			case NUMBER:
				{
				_localctx = new MathExpressionBasicNumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(45);
				match(NUMBER);
				}
				break;
			case LEFT_PARENTHESIS:
				{
				_localctx = new MathExpressionParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(46);
				match(LEFT_PARENTHESIS);
				setState(47);
				numeric_expression(0);
				setState(48);
				match(RIGHT_PARENTHESIS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(69);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new MathExpressionPowerContext(new Numeric_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_numeric_expression);
						setState(52);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(53);
						match(POWER);
						setState(54);
						numeric_expression(6);
						}
						break;
					case 2:
						{
						_localctx = new MathExpressionTimesContext(new Numeric_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_numeric_expression);
						setState(55);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(56);
						match(TIMES);
						setState(57);
						numeric_expression(5);
						}
						break;
					case 3:
						{
						_localctx = new MathExpressionDivisionContext(new Numeric_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_numeric_expression);
						setState(58);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(59);
						match(DIVISION);
						setState(60);
						numeric_expression(4);
						}
						break;
					case 4:
						{
						_localctx = new MathExpressionSumContext(new Numeric_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_numeric_expression);
						setState(61);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(62);
						match(ADD);
						setState(63);
						numeric_expression(3);
						}
						break;
					case 5:
						{
						_localctx = new MathExpressionMinusContext(new Numeric_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_numeric_expression);
						setState(64);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(65);
						match(MINUS);
						setState(66);
						numeric_expression(2);
						}
						break;
					case 6:
						{
						_localctx = new MathExpressionFactorialContext(new Numeric_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_numeric_expression);
						setState(67);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(68);
						match(FACTORIAL);
						}
						break;
					}
					} 
				}
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class Print_expressionContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(AutomataParser.PRINT, 0); }
		public Numeric_expressionContext numeric_expression() {
			return getRuleContext(Numeric_expressionContext.class,0);
		}
		public Print_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterPrint_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitPrint_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitPrint_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_expressionContext print_expression() throws RecognitionException {
		Print_expressionContext _localctx = new Print_expressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_print_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(PRINT);
			setState(75);
			numeric_expression(0);
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
		case 4:
			return numeric_expression_sempred((Numeric_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean numeric_expression_sempred(Numeric_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		case 5:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22P\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\7\2\20\n\2\f\2\16\2\23\13\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3 \n\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\5\4(\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\65\n\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6"+
		"H\n\6\f\6\16\6K\13\6\3\7\3\7\3\7\3\7\2\3\n\b\2\4\6\b\n\f\2\2\2U\2\21\3"+
		"\2\2\2\4\37\3\2\2\2\6\'\3\2\2\2\b)\3\2\2\2\n\64\3\2\2\2\fL\3\2\2\2\16"+
		"\20\5\4\3\2\17\16\3\2\2\2\20\23\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22"+
		"\24\3\2\2\2\23\21\3\2\2\2\24\25\7\2\2\3\25\3\3\2\2\2\26\27\5\f\7\2\27"+
		"\30\7\r\2\2\30 \3\2\2\2\31\32\5\6\4\2\32\33\7\r\2\2\33 \3\2\2\2\34\35"+
		"\5\b\5\2\35\36\7\r\2\2\36 \3\2\2\2\37\26\3\2\2\2\37\31\3\2\2\2\37\34\3"+
		"\2\2\2 \5\3\2\2\2!\"\7\16\2\2\"(\7\21\2\2#$\7\16\2\2$%\7\21\2\2%&\7\t"+
		"\2\2&(\5\n\6\2\'!\3\2\2\2\'#\3\2\2\2(\7\3\2\2\2)*\7\21\2\2*+\7\t\2\2+"+
		",\5\n\6\2,\t\3\2\2\2-.\b\6\1\2.\65\7\21\2\2/\65\7\20\2\2\60\61\7\n\2\2"+
		"\61\62\5\n\6\2\62\63\7\13\2\2\63\65\3\2\2\2\64-\3\2\2\2\64/\3\2\2\2\64"+
		"\60\3\2\2\2\65I\3\2\2\2\66\67\f\7\2\2\678\7\b\2\28H\5\n\6\b9:\f\6\2\2"+
		":;\7\4\2\2;H\5\n\6\7<=\f\5\2\2=>\7\5\2\2>H\5\n\6\6?@\f\4\2\2@A\7\3\2\2"+
		"AH\5\n\6\5BC\f\3\2\2CD\7\6\2\2DH\5\n\6\4EF\f\b\2\2FH\7\7\2\2G\66\3\2\2"+
		"\2G9\3\2\2\2G<\3\2\2\2G?\3\2\2\2GB\3\2\2\2GE\3\2\2\2HK\3\2\2\2IG\3\2\2"+
		"\2IJ\3\2\2\2J\13\3\2\2\2KI\3\2\2\2LM\7\17\2\2MN\5\n\6\2N\r\3\2\2\2\b\21"+
		"\37\'\64GI";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}