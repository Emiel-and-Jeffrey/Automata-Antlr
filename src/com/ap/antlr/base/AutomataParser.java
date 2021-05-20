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
		NUMBER=1, ADD=2, TIMES=3, DIVISION=4, MINUS=5, FACTORIAL=6, POWER=7, LEFT_PARANTHESIS=8, 
		RIGHT_PARANTHESIS=9, WS=10;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_expression = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'+'", "'*'", "'/'", "'-'", "'!'", "'^'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NUMBER", "ADD", "TIMES", "DIVISION", "MINUS", "FACTORIAL", "POWER", 
			"LEFT_PARANTHESIS", "RIGHT_PARANTHESIS", "WS"
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
			setState(9);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMBER || _la==LEFT_PARANTHESIS) {
				{
				{
				setState(6);
				statement();
				}
				}
				setState(11);
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

	public static class StatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MathExpressionSumContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(AutomataParser.ADD, 0); }
		public MathExpressionSumContext(ExpressionContext ctx) { copyFrom(ctx); }
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
	public static class MathExpressionBasicNumberContext extends ExpressionContext {
		public TerminalNode NUMBER() { return getToken(AutomataParser.NUMBER, 0); }
		public MathExpressionBasicNumberContext(ExpressionContext ctx) { copyFrom(ctx); }
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
	public static class MathExpressionTimesContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TIMES() { return getToken(AutomataParser.TIMES, 0); }
		public MathExpressionTimesContext(ExpressionContext ctx) { copyFrom(ctx); }
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
	public static class MathExpressionMinusContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(AutomataParser.MINUS, 0); }
		public MathExpressionMinusContext(ExpressionContext ctx) { copyFrom(ctx); }
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
	public static class MathExpressionFactorialContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FACTORIAL() { return getToken(AutomataParser.FACTORIAL, 0); }
		public MathExpressionFactorialContext(ExpressionContext ctx) { copyFrom(ctx); }
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
	public static class MathExpressionParanthesisContext extends ExpressionContext {
		public TerminalNode LEFT_PARANTHESIS() { return getToken(AutomataParser.LEFT_PARANTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PARANTHESIS() { return getToken(AutomataParser.RIGHT_PARANTHESIS, 0); }
		public MathExpressionParanthesisContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterMathExpressionParanthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitMathExpressionParanthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitMathExpressionParanthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MathExpressionPowerContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode POWER() { return getToken(AutomataParser.POWER, 0); }
		public MathExpressionPowerContext(ExpressionContext ctx) { copyFrom(ctx); }
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
	public static class MathExpressionDivisionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DIVISION() { return getToken(AutomataParser.DIVISION, 0); }
		public MathExpressionDivisionContext(ExpressionContext ctx) { copyFrom(ctx); }
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

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				_localctx = new MathExpressionBasicNumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(15);
				match(NUMBER);
				}
				break;
			case LEFT_PARANTHESIS:
				{
				_localctx = new MathExpressionParanthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(16);
				match(LEFT_PARANTHESIS);
				setState(17);
				expression(0);
				setState(18);
				match(RIGHT_PARANTHESIS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(41);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(39);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new MathExpressionPowerContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(22);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(23);
						match(POWER);
						setState(24);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new MathExpressionTimesContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(25);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(26);
						match(TIMES);
						setState(27);
						expression(5);
						}
						break;
					case 3:
						{
						_localctx = new MathExpressionDivisionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(28);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(29);
						match(DIVISION);
						setState(30);
						expression(4);
						}
						break;
					case 4:
						{
						_localctx = new MathExpressionSumContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(31);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(32);
						match(ADD);
						setState(33);
						expression(3);
						}
						break;
					case 5:
						{
						_localctx = new MathExpressionMinusContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(34);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(35);
						match(MINUS);
						setState(36);
						expression(2);
						}
						break;
					case 6:
						{
						_localctx = new MathExpressionFactorialContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(37);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(38);
						match(FACTORIAL);
						}
						break;
					}
					} 
				}
				setState(43);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\f/\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\7\2\n\n\2\f\2\16\2\r\13\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\5\4\27\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\7\4*\n\4\f\4\16\4-\13\4\3\4\2\3\6\5\2\4\6\2\2\2\63\2\13\3"+
		"\2\2\2\4\16\3\2\2\2\6\26\3\2\2\2\b\n\5\4\3\2\t\b\3\2\2\2\n\r\3\2\2\2\13"+
		"\t\3\2\2\2\13\f\3\2\2\2\f\3\3\2\2\2\r\13\3\2\2\2\16\17\5\6\4\2\17\5\3"+
		"\2\2\2\20\21\b\4\1\2\21\27\7\3\2\2\22\23\7\n\2\2\23\24\5\6\4\2\24\25\7"+
		"\13\2\2\25\27\3\2\2\2\26\20\3\2\2\2\26\22\3\2\2\2\27+\3\2\2\2\30\31\f"+
		"\7\2\2\31\32\7\t\2\2\32*\5\6\4\b\33\34\f\6\2\2\34\35\7\5\2\2\35*\5\6\4"+
		"\7\36\37\f\5\2\2\37 \7\6\2\2 *\5\6\4\6!\"\f\4\2\2\"#\7\4\2\2#*\5\6\4\5"+
		"$%\f\3\2\2%&\7\7\2\2&*\5\6\4\4\'(\f\b\2\2(*\7\b\2\2)\30\3\2\2\2)\33\3"+
		"\2\2\2)\36\3\2\2\2)!\3\2\2\2)$\3\2\2\2)\'\3\2\2\2*-\3\2\2\2+)\3\2\2\2"+
		"+,\3\2\2\2,\7\3\2\2\2-+\3\2\2\2\6\13\26)+";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}