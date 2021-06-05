// Generated from C:/Users/emiel/Desktop/semester 4/automata/Automata-Antlr/src/com/ap/antlr/grammars\z3SudokuAParser.g4 by ANTLR 4.9.1
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
public class z3SudokuAParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SAT=1, LPAREN=2, RPAREN=3, MODEL=4, FUNC=5, FIELD=6, INT=7, NUMBER=8, 
		WS=9;
	public static final int
		RULE_result = 0, RULE_value = 1, RULE_field = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"result", "value", "field"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'sat'", "'('", "')'", "'model'", "'define-fun'", "'a'", "'Int'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SAT", "LPAREN", "RPAREN", "MODEL", "FUNC", "FIELD", "INT", "NUMBER", 
			"WS"
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
	public String getGrammarFileName() { return "z3SudokuAParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public z3SudokuAParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ResultContext extends ParserRuleContext {
		public TerminalNode SAT() { return getToken(z3SudokuAParser.SAT, 0); }
		public TerminalNode LPAREN() { return getToken(z3SudokuAParser.LPAREN, 0); }
		public TerminalNode MODEL() { return getToken(z3SudokuAParser.MODEL, 0); }
		public TerminalNode RPAREN() { return getToken(z3SudokuAParser.RPAREN, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof z3SudokuAParserListener ) ((z3SudokuAParserListener)listener).enterResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof z3SudokuAParserListener ) ((z3SudokuAParserListener)listener).exitResult(this);
		}
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_result);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			match(SAT);
			setState(7);
			match(LPAREN);
			setState(8);
			match(MODEL);
			setState(10); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(9);
				value();
				}
				}
				setState(12); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LPAREN );
			setState(14);
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

	public static class ValueContext extends ParserRuleContext {
		public List<TerminalNode> LPAREN() { return getTokens(z3SudokuAParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(z3SudokuAParser.LPAREN, i);
		}
		public TerminalNode FUNC() { return getToken(z3SudokuAParser.FUNC, 0); }
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(z3SudokuAParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(z3SudokuAParser.RPAREN, i);
		}
		public TerminalNode INT() { return getToken(z3SudokuAParser.INT, 0); }
		public TerminalNode NUMBER() { return getToken(z3SudokuAParser.NUMBER, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof z3SudokuAParserListener ) ((z3SudokuAParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof z3SudokuAParserListener ) ((z3SudokuAParserListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(LPAREN);
			setState(17);
			match(FUNC);
			setState(18);
			field();
			setState(19);
			match(LPAREN);
			setState(20);
			match(RPAREN);
			setState(21);
			match(INT);
			setState(22);
			match(NUMBER);
			setState(23);
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

	public static class FieldContext extends ParserRuleContext {
		public TerminalNode FIELD() { return getToken(z3SudokuAParser.FIELD, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(z3SudokuAParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(z3SudokuAParser.NUMBER, i);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof z3SudokuAParserListener ) ((z3SudokuAParserListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof z3SudokuAParserListener ) ((z3SudokuAParserListener)listener).exitField(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(FIELD);
			setState(26);
			match(NUMBER);
			setState(27);
			match(NUMBER);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\13 \4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\3\2\3\2\3\2\6\2\r\n\2\r\2\16\2\16\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\2\2\5\2\4\6\2\2\2\35\2\b\3"+
		"\2\2\2\4\22\3\2\2\2\6\33\3\2\2\2\b\t\7\3\2\2\t\n\7\4\2\2\n\f\7\6\2\2\13"+
		"\r\5\4\3\2\f\13\3\2\2\2\r\16\3\2\2\2\16\f\3\2\2\2\16\17\3\2\2\2\17\20"+
		"\3\2\2\2\20\21\7\5\2\2\21\3\3\2\2\2\22\23\7\4\2\2\23\24\7\7\2\2\24\25"+
		"\5\6\4\2\25\26\7\4\2\2\26\27\7\5\2\2\27\30\7\t\2\2\30\31\7\n\2\2\31\32"+
		"\7\5\2\2\32\5\3\2\2\2\33\34\7\b\2\2\34\35\7\n\2\2\35\36\7\n\2\2\36\7\3"+
		"\2\2\2\3\16";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}