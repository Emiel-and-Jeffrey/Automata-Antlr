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
		ADD=1, TIMES=2, DIVISION=3, MINUS=4, POWER=5, GREATER_THAN=6, LESS_THAN=7, 
		GREATER_THAN_OR_EQUAL=8, LESS_THAN_OR_EQUAL=9, EQUAL_TO=10, AND=11, OR=12, 
		EQUALS=13, LEFT_PARENTHESIS=14, RIGHT_PARENTHESIS=15, DOT=16, SEMICOLON=17, 
		EXLAMATION_MARK=18, VARIABLE_TYPE_NUMBER=19, VARIABLE_TYPE_BOOLEAN=20, 
		VARIABLE_TYPE_STRING=21, PRINT=22, IF=23, THEN=24, FI=25, ELSE=26, WHILE=27, 
		ELIHW=28, NUMBER=29, BOOLEAN=30, IDENTIFIER=31, WS=32, COMMENT=33;
	public static final int
		RULE_program = 0, RULE_statement_block = 1, RULE_statement = 2, RULE_print_expression = 3, 
		RULE_conditional_expression = 4, RULE_conditional_loop_expression = 5, 
		RULE_variable_declaration = 6, RULE_variable_assignment = 7, RULE_numeric_expression = 8, 
		RULE_logical_expression = 9, RULE_comparison_expression = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement_block", "statement", "print_expression", "conditional_expression", 
			"conditional_loop_expression", "variable_declaration", "variable_assignment", 
			"numeric_expression", "logical_expression", "comparison_expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'*'", "'/'", "'-'", "'^'", "'>'", "'<'", "'>='", "'<='", 
			"'=='", "'&&'", "'||'", "'='", "'('", "')'", "'.'", "';'", "'!'", "'number'", 
			"'bool'", "'string'", "'Print'", "'if'", "'then'", "'fi'", "'else'", 
			"'while'", "'elihw'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ADD", "TIMES", "DIVISION", "MINUS", "POWER", "GREATER_THAN", "LESS_THAN", 
			"GREATER_THAN_OR_EQUAL", "LESS_THAN_OR_EQUAL", "EQUAL_TO", "AND", "OR", 
			"EQUALS", "LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", "DOT", "SEMICOLON", 
			"EXLAMATION_MARK", "VARIABLE_TYPE_NUMBER", "VARIABLE_TYPE_BOOLEAN", "VARIABLE_TYPE_STRING", 
			"PRINT", "IF", "THEN", "FI", "ELSE", "WHILE", "ELIHW", "NUMBER", "BOOLEAN", 
			"IDENTIFIER", "WS", "COMMENT"
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
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(AutomataParser.EOF, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			statement_block();
			setState(23);
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

	public static class Statement_blockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Statement_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterStatement_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitStatement_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitStatement_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_blockContext statement_block() throws RecognitionException {
		Statement_blockContext _localctx = new Statement_blockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARIABLE_TYPE_NUMBER) | (1L << VARIABLE_TYPE_BOOLEAN) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << IDENTIFIER))) != 0)) {
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
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public Conditional_loop_expressionContext conditional_loop_expression() {
			return getRuleContext(Conditional_loop_expressionContext.class,0);
		}
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
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(42);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				print_expression();
				setState(32);
				match(SEMICOLON);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				conditional_expression();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(35);
				conditional_loop_expression();
				}
				break;
			case VARIABLE_TYPE_NUMBER:
			case VARIABLE_TYPE_BOOLEAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(36);
				variable_declaration();
				setState(37);
				match(SEMICOLON);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 5);
				{
				setState(39);
				variable_assignment();
				setState(40);
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

	public static class Print_expressionContext extends ParserRuleContext {
		public Print_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_expression; }
	 
		public Print_expressionContext() { }
		public void copyFrom(Print_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintExpressionNumericContext extends Print_expressionContext {
		public TerminalNode PRINT() { return getToken(AutomataParser.PRINT, 0); }
		public Numeric_expressionContext numeric_expression() {
			return getRuleContext(Numeric_expressionContext.class,0);
		}
		public PrintExpressionNumericContext(Print_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterPrintExpressionNumeric(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitPrintExpressionNumeric(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitPrintExpressionNumeric(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_expressionContext print_expression() throws RecognitionException {
		Print_expressionContext _localctx = new Print_expressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_print_expression);
		try {
			_localctx = new PrintExpressionNumericContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(PRINT);
			setState(45);
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

	public static class Conditional_expressionContext extends ParserRuleContext {
		public Conditional_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_expression; }
	 
		public Conditional_expressionContext() { }
		public void copyFrom(Conditional_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConditionalExpressionIfContext extends Conditional_expressionContext {
		public List<TerminalNode> IF() { return getTokens(AutomataParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(AutomataParser.IF, i);
		}
		public List<Logical_expressionContext> logical_expression() {
			return getRuleContexts(Logical_expressionContext.class);
		}
		public Logical_expressionContext logical_expression(int i) {
			return getRuleContext(Logical_expressionContext.class,i);
		}
		public List<TerminalNode> THEN() { return getTokens(AutomataParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(AutomataParser.THEN, i);
		}
		public List<Statement_blockContext> statement_block() {
			return getRuleContexts(Statement_blockContext.class);
		}
		public Statement_blockContext statement_block(int i) {
			return getRuleContext(Statement_blockContext.class,i);
		}
		public TerminalNode FI() { return getToken(AutomataParser.FI, 0); }
		public List<TerminalNode> ELSE() { return getTokens(AutomataParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(AutomataParser.ELSE, i);
		}
		public ConditionalExpressionIfContext(Conditional_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterConditionalExpressionIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitConditionalExpressionIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitConditionalExpressionIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_expressionContext conditional_expression() throws RecognitionException {
		Conditional_expressionContext _localctx = new Conditional_expressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_conditional_expression);
		int _la;
		try {
			int _alt;
			_localctx = new ConditionalExpressionIfContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(IF);
			setState(48);
			logical_expression(0);
			setState(49);
			match(THEN);
			setState(50);
			statement_block();
			setState(59);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(51);
					match(ELSE);
					setState(52);
					match(IF);
					setState(53);
					logical_expression(0);
					setState(54);
					match(THEN);
					setState(55);
					statement_block();
					}
					} 
				}
				setState(61);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(62);
				match(ELSE);
				setState(63);
				statement_block();
				}
			}

			setState(66);
			match(FI);
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

	public static class Conditional_loop_expressionContext extends ParserRuleContext {
		public Conditional_loop_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_loop_expression; }
	 
		public Conditional_loop_expressionContext() { }
		public void copyFrom(Conditional_loop_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConditionalExpressionWhileContext extends Conditional_loop_expressionContext {
		public TerminalNode WHILE() { return getToken(AutomataParser.WHILE, 0); }
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(AutomataParser.THEN, 0); }
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public TerminalNode ELIHW() { return getToken(AutomataParser.ELIHW, 0); }
		public ConditionalExpressionWhileContext(Conditional_loop_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterConditionalExpressionWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitConditionalExpressionWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitConditionalExpressionWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_loop_expressionContext conditional_loop_expression() throws RecognitionException {
		Conditional_loop_expressionContext _localctx = new Conditional_loop_expressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_conditional_loop_expression);
		try {
			_localctx = new ConditionalExpressionWhileContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(WHILE);
			setState(69);
			logical_expression(0);
			setState(70);
			match(THEN);
			setState(71);
			statement_block();
			setState(72);
			match(ELIHW);
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
	public static class VariableBooleanInitializationContext extends Variable_declarationContext {
		public TerminalNode VARIABLE_TYPE_BOOLEAN() { return getToken(AutomataParser.VARIABLE_TYPE_BOOLEAN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AutomataParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(AutomataParser.EQUALS, 0); }
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
		}
		public VariableBooleanInitializationContext(Variable_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterVariableBooleanInitialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitVariableBooleanInitialization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitVariableBooleanInitialization(this);
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
	public static class VariableBooleanDeclarationContext extends Variable_declarationContext {
		public TerminalNode VARIABLE_TYPE_BOOLEAN() { return getToken(AutomataParser.VARIABLE_TYPE_BOOLEAN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AutomataParser.IDENTIFIER, 0); }
		public VariableBooleanDeclarationContext(Variable_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterVariableBooleanDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitVariableBooleanDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitVariableBooleanDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variable_declaration);
		try {
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new VariableNumericDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				match(VARIABLE_TYPE_NUMBER);
				setState(75);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new VariableNumericInitializationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				match(VARIABLE_TYPE_NUMBER);
				setState(77);
				match(IDENTIFIER);
				setState(78);
				match(EQUALS);
				setState(79);
				numeric_expression(0);
				}
				break;
			case 3:
				_localctx = new VariableBooleanDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				match(VARIABLE_TYPE_BOOLEAN);
				setState(81);
				match(IDENTIFIER);
				}
				break;
			case 4:
				_localctx = new VariableBooleanInitializationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(82);
				match(VARIABLE_TYPE_BOOLEAN);
				setState(83);
				match(IDENTIFIER);
				setState(84);
				match(EQUALS);
				setState(85);
				logical_expression(0);
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
		public Variable_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_assignment; }
	 
		public Variable_assignmentContext() { }
		public void copyFrom(Variable_assignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariableBooleanAssignmentContext extends Variable_assignmentContext {
		public TerminalNode IDENTIFIER() { return getToken(AutomataParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(AutomataParser.EQUALS, 0); }
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
		}
		public VariableBooleanAssignmentContext(Variable_assignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterVariableBooleanAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitVariableBooleanAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitVariableBooleanAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableNumericAssignmentContext extends Variable_assignmentContext {
		public TerminalNode IDENTIFIER() { return getToken(AutomataParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(AutomataParser.EQUALS, 0); }
		public Numeric_expressionContext numeric_expression() {
			return getRuleContext(Numeric_expressionContext.class,0);
		}
		public VariableNumericAssignmentContext(Variable_assignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterVariableNumericAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitVariableNumericAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitVariableNumericAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_assignmentContext variable_assignment() throws RecognitionException {
		Variable_assignmentContext _localctx = new Variable_assignmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variable_assignment);
		try {
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new VariableNumericAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				match(IDENTIFIER);
				setState(89);
				match(EQUALS);
				setState(90);
				numeric_expression(0);
				}
				break;
			case 2:
				_localctx = new VariableBooleanAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				match(IDENTIFIER);
				setState(92);
				match(EQUALS);
				setState(93);
				logical_expression(0);
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
		public TerminalNode EXLAMATION_MARK() { return getToken(AutomataParser.EXLAMATION_MARK, 0); }
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_numeric_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				_localctx = new MathExpressionVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(97);
				match(IDENTIFIER);
				}
				break;
			case NUMBER:
				{
				_localctx = new MathExpressionBasicNumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(98);
				match(NUMBER);
				}
				break;
			case LEFT_PARENTHESIS:
				{
				_localctx = new MathExpressionParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(99);
				match(LEFT_PARENTHESIS);
				setState(100);
				numeric_expression(0);
				setState(101);
				match(RIGHT_PARENTHESIS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(122);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new MathExpressionPowerContext(new Numeric_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_numeric_expression);
						setState(105);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(106);
						match(POWER);
						setState(107);
						numeric_expression(6);
						}
						break;
					case 2:
						{
						_localctx = new MathExpressionTimesContext(new Numeric_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_numeric_expression);
						setState(108);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(109);
						match(TIMES);
						setState(110);
						numeric_expression(5);
						}
						break;
					case 3:
						{
						_localctx = new MathExpressionDivisionContext(new Numeric_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_numeric_expression);
						setState(111);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(112);
						match(DIVISION);
						setState(113);
						numeric_expression(4);
						}
						break;
					case 4:
						{
						_localctx = new MathExpressionSumContext(new Numeric_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_numeric_expression);
						setState(114);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(115);
						match(ADD);
						setState(116);
						numeric_expression(3);
						}
						break;
					case 5:
						{
						_localctx = new MathExpressionMinusContext(new Numeric_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_numeric_expression);
						setState(117);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(118);
						match(MINUS);
						setState(119);
						numeric_expression(2);
						}
						break;
					case 6:
						{
						_localctx = new MathExpressionFactorialContext(new Numeric_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_numeric_expression);
						setState(120);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(121);
						match(EXLAMATION_MARK);
						}
						break;
					}
					} 
				}
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
	public static class LogicalExpressionParenthesesContext extends Logical_expressionContext {
		public TerminalNode LEFT_PARENTHESIS() { return getToken(AutomataParser.LEFT_PARENTHESIS, 0); }
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(AutomataParser.RIGHT_PARENTHESIS, 0); }
		public LogicalExpressionParenthesesContext(Logical_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterLogicalExpressionParentheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitLogicalExpressionParentheses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitLogicalExpressionParentheses(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalExpressionComparisonContext extends Logical_expressionContext {
		public Comparison_expressionContext comparison_expression() {
			return getRuleContext(Comparison_expressionContext.class,0);
		}
		public LogicalExpressionComparisonContext(Logical_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterLogicalExpressionComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitLogicalExpressionComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitLogicalExpressionComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalExpressionVariableContext extends Logical_expressionContext {
		public TerminalNode IDENTIFIER() { return getToken(AutomataParser.IDENTIFIER, 0); }
		public LogicalExpressionVariableContext(Logical_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterLogicalExpressionVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitLogicalExpressionVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitLogicalExpressionVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalExpressionAndContext extends Logical_expressionContext {
		public List<Logical_expressionContext> logical_expression() {
			return getRuleContexts(Logical_expressionContext.class);
		}
		public Logical_expressionContext logical_expression(int i) {
			return getRuleContext(Logical_expressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(AutomataParser.AND, 0); }
		public LogicalExpressionAndContext(Logical_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterLogicalExpressionAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitLogicalExpressionAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitLogicalExpressionAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalExpressionNegationContext extends Logical_expressionContext {
		public TerminalNode EXLAMATION_MARK() { return getToken(AutomataParser.EXLAMATION_MARK, 0); }
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
		}
		public LogicalExpressionNegationContext(Logical_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterLogicalExpressionNegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitLogicalExpressionNegation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitLogicalExpressionNegation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalExpressionBooleanContext extends Logical_expressionContext {
		public TerminalNode BOOLEAN() { return getToken(AutomataParser.BOOLEAN, 0); }
		public LogicalExpressionBooleanContext(Logical_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterLogicalExpressionBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitLogicalExpressionBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitLogicalExpressionBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalExpressionOrContext extends Logical_expressionContext {
		public List<Logical_expressionContext> logical_expression() {
			return getRuleContexts(Logical_expressionContext.class);
		}
		public Logical_expressionContext logical_expression(int i) {
			return getRuleContext(Logical_expressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(AutomataParser.OR, 0); }
		public LogicalExpressionOrContext(Logical_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterLogicalExpressionOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitLogicalExpressionOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitLogicalExpressionOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_expressionContext logical_expression() throws RecognitionException {
		return logical_expression(0);
	}

	private Logical_expressionContext logical_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Logical_expressionContext _localctx = new Logical_expressionContext(_ctx, _parentState);
		Logical_expressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_logical_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new LogicalExpressionVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(128);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				_localctx = new LogicalExpressionBooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(129);
				match(BOOLEAN);
				}
				break;
			case 3:
				{
				_localctx = new LogicalExpressionParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(130);
				match(LEFT_PARENTHESIS);
				setState(131);
				logical_expression(0);
				setState(132);
				match(RIGHT_PARENTHESIS);
				}
				break;
			case 4:
				{
				_localctx = new LogicalExpressionComparisonContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(134);
				comparison_expression();
				}
				break;
			case 5:
				{
				_localctx = new LogicalExpressionNegationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(135);
				match(EXLAMATION_MARK);
				setState(136);
				logical_expression(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(147);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(145);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalExpressionAndContext(new Logical_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logical_expression);
						setState(139);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(140);
						match(AND);
						setState(141);
						logical_expression(5);
						}
						break;
					case 2:
						{
						_localctx = new LogicalExpressionOrContext(new Logical_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logical_expression);
						setState(142);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(143);
						match(OR);
						setState(144);
						logical_expression(4);
						}
						break;
					}
					} 
				}
				setState(149);
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
		public List<Numeric_expressionContext> numeric_expression() {
			return getRuleContexts(Numeric_expressionContext.class);
		}
		public Numeric_expressionContext numeric_expression(int i) {
			return getRuleContext(Numeric_expressionContext.class,i);
		}
		public TerminalNode GREATER_THAN() { return getToken(AutomataParser.GREATER_THAN, 0); }
		public ComparisonExpressionGreaterThanContext(Comparison_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterComparisonExpressionGreaterThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitComparisonExpressionGreaterThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitComparisonExpressionGreaterThan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonExpressionLessThanContext extends Comparison_expressionContext {
		public List<Numeric_expressionContext> numeric_expression() {
			return getRuleContexts(Numeric_expressionContext.class);
		}
		public Numeric_expressionContext numeric_expression(int i) {
			return getRuleContext(Numeric_expressionContext.class,i);
		}
		public TerminalNode LESS_THAN() { return getToken(AutomataParser.LESS_THAN, 0); }
		public ComparisonExpressionLessThanContext(Comparison_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterComparisonExpressionLessThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitComparisonExpressionLessThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitComparisonExpressionLessThan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonExpressionLessThanOrEqualContext extends Comparison_expressionContext {
		public List<Numeric_expressionContext> numeric_expression() {
			return getRuleContexts(Numeric_expressionContext.class);
		}
		public Numeric_expressionContext numeric_expression(int i) {
			return getRuleContext(Numeric_expressionContext.class,i);
		}
		public TerminalNode LESS_THAN_OR_EQUAL() { return getToken(AutomataParser.LESS_THAN_OR_EQUAL, 0); }
		public ComparisonExpressionLessThanOrEqualContext(Comparison_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterComparisonExpressionLessThanOrEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitComparisonExpressionLessThanOrEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitComparisonExpressionLessThanOrEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonExpressionEqualToContext extends Comparison_expressionContext {
		public List<Numeric_expressionContext> numeric_expression() {
			return getRuleContexts(Numeric_expressionContext.class);
		}
		public Numeric_expressionContext numeric_expression(int i) {
			return getRuleContext(Numeric_expressionContext.class,i);
		}
		public TerminalNode EQUAL_TO() { return getToken(AutomataParser.EQUAL_TO, 0); }
		public ComparisonExpressionEqualToContext(Comparison_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterComparisonExpressionEqualTo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitComparisonExpressionEqualTo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitComparisonExpressionEqualTo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonExpressionGreaterThanOrEqualContext extends Comparison_expressionContext {
		public List<Numeric_expressionContext> numeric_expression() {
			return getRuleContexts(Numeric_expressionContext.class);
		}
		public Numeric_expressionContext numeric_expression(int i) {
			return getRuleContext(Numeric_expressionContext.class,i);
		}
		public TerminalNode GREATER_THAN_OR_EQUAL() { return getToken(AutomataParser.GREATER_THAN_OR_EQUAL, 0); }
		public ComparisonExpressionGreaterThanOrEqualContext(Comparison_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterComparisonExpressionGreaterThanOrEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitComparisonExpressionGreaterThanOrEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitComparisonExpressionGreaterThanOrEqual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comparison_expressionContext comparison_expression() throws RecognitionException {
		Comparison_expressionContext _localctx = new Comparison_expressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_comparison_expression);
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new ComparisonExpressionGreaterThanContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				numeric_expression(0);
				setState(151);
				match(GREATER_THAN);
				setState(152);
				numeric_expression(0);
				}
				break;
			case 2:
				_localctx = new ComparisonExpressionGreaterThanOrEqualContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				numeric_expression(0);
				setState(155);
				match(GREATER_THAN_OR_EQUAL);
				setState(156);
				numeric_expression(0);
				}
				break;
			case 3:
				_localctx = new ComparisonExpressionLessThanContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(158);
				numeric_expression(0);
				setState(159);
				match(LESS_THAN);
				setState(160);
				numeric_expression(0);
				}
				break;
			case 4:
				_localctx = new ComparisonExpressionLessThanOrEqualContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(162);
				numeric_expression(0);
				setState(163);
				match(LESS_THAN_OR_EQUAL);
				setState(164);
				numeric_expression(0);
				}
				break;
			case 5:
				_localctx = new ComparisonExpressionEqualToContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(166);
				numeric_expression(0);
				setState(167);
				match(EQUAL_TO);
				setState(168);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return numeric_expression_sempred((Numeric_expressionContext)_localctx, predIndex);
		case 9:
			return logical_expression_sempred((Logical_expressionContext)_localctx, predIndex);
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
	private boolean logical_expression_sempred(Logical_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 4);
		case 7:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00af\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\2\3\3\7\3\35\n\3\f\3\16\3 \13\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4-\n\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\7\6<\n\6\f\6\16\6?\13\6\3\6\3\6\5\6C\n\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\5\bY\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\ta\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\5\nj\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\7\n}\n\n\f\n\16\n\u0080\13\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\5\13\u008c\n\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13"+
		"\u0094\n\13\f\13\16\13\u0097\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00ad\n\f\3\f\2\4\22"+
		"\24\r\2\4\6\b\n\f\16\20\22\24\26\2\2\2\u00c0\2\30\3\2\2\2\4\36\3\2\2\2"+
		"\6,\3\2\2\2\b.\3\2\2\2\n\61\3\2\2\2\fF\3\2\2\2\16X\3\2\2\2\20`\3\2\2\2"+
		"\22i\3\2\2\2\24\u008b\3\2\2\2\26\u00ac\3\2\2\2\30\31\5\4\3\2\31\32\7\2"+
		"\2\3\32\3\3\2\2\2\33\35\5\6\4\2\34\33\3\2\2\2\35 \3\2\2\2\36\34\3\2\2"+
		"\2\36\37\3\2\2\2\37\5\3\2\2\2 \36\3\2\2\2!\"\5\b\5\2\"#\7\23\2\2#-\3\2"+
		"\2\2$-\5\n\6\2%-\5\f\7\2&\'\5\16\b\2\'(\7\23\2\2(-\3\2\2\2)*\5\20\t\2"+
		"*+\7\23\2\2+-\3\2\2\2,!\3\2\2\2,$\3\2\2\2,%\3\2\2\2,&\3\2\2\2,)\3\2\2"+
		"\2-\7\3\2\2\2./\7\30\2\2/\60\5\22\n\2\60\t\3\2\2\2\61\62\7\31\2\2\62\63"+
		"\5\24\13\2\63\64\7\32\2\2\64=\5\4\3\2\65\66\7\34\2\2\66\67\7\31\2\2\67"+
		"8\5\24\13\289\7\32\2\29:\5\4\3\2:<\3\2\2\2;\65\3\2\2\2<?\3\2\2\2=;\3\2"+
		"\2\2=>\3\2\2\2>B\3\2\2\2?=\3\2\2\2@A\7\34\2\2AC\5\4\3\2B@\3\2\2\2BC\3"+
		"\2\2\2CD\3\2\2\2DE\7\33\2\2E\13\3\2\2\2FG\7\35\2\2GH\5\24\13\2HI\7\32"+
		"\2\2IJ\5\4\3\2JK\7\36\2\2K\r\3\2\2\2LM\7\25\2\2MY\7!\2\2NO\7\25\2\2OP"+
		"\7!\2\2PQ\7\17\2\2QY\5\22\n\2RS\7\26\2\2SY\7!\2\2TU\7\26\2\2UV\7!\2\2"+
		"VW\7\17\2\2WY\5\24\13\2XL\3\2\2\2XN\3\2\2\2XR\3\2\2\2XT\3\2\2\2Y\17\3"+
		"\2\2\2Z[\7!\2\2[\\\7\17\2\2\\a\5\22\n\2]^\7!\2\2^_\7\17\2\2_a\5\24\13"+
		"\2`Z\3\2\2\2`]\3\2\2\2a\21\3\2\2\2bc\b\n\1\2cj\7!\2\2dj\7\37\2\2ef\7\20"+
		"\2\2fg\5\22\n\2gh\7\21\2\2hj\3\2\2\2ib\3\2\2\2id\3\2\2\2ie\3\2\2\2j~\3"+
		"\2\2\2kl\f\7\2\2lm\7\7\2\2m}\5\22\n\bno\f\6\2\2op\7\4\2\2p}\5\22\n\7q"+
		"r\f\5\2\2rs\7\5\2\2s}\5\22\n\6tu\f\4\2\2uv\7\3\2\2v}\5\22\n\5wx\f\3\2"+
		"\2xy\7\6\2\2y}\5\22\n\4z{\f\b\2\2{}\7\24\2\2|k\3\2\2\2|n\3\2\2\2|q\3\2"+
		"\2\2|t\3\2\2\2|w\3\2\2\2|z\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2"+
		"\2\177\23\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\b\13\1\2\u0082\u008c\7!\2"+
		"\2\u0083\u008c\7 \2\2\u0084\u0085\7\20\2\2\u0085\u0086\5\24\13\2\u0086"+
		"\u0087\7\21\2\2\u0087\u008c\3\2\2\2\u0088\u008c\5\26\f\2\u0089\u008a\7"+
		"\24\2\2\u008a\u008c\5\24\13\3\u008b\u0081\3\2\2\2\u008b\u0083\3\2\2\2"+
		"\u008b\u0084\3\2\2\2\u008b\u0088\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u0095"+
		"\3\2\2\2\u008d\u008e\f\6\2\2\u008e\u008f\7\r\2\2\u008f\u0094\5\24\13\7"+
		"\u0090\u0091\f\5\2\2\u0091\u0092\7\16\2\2\u0092\u0094\5\24\13\6\u0093"+
		"\u008d\3\2\2\2\u0093\u0090\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2"+
		"\2\2\u0095\u0096\3\2\2\2\u0096\25\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099"+
		"\5\22\n\2\u0099\u009a\7\b\2\2\u009a\u009b\5\22\n\2\u009b\u00ad\3\2\2\2"+
		"\u009c\u009d\5\22\n\2\u009d\u009e\7\n\2\2\u009e\u009f\5\22\n\2\u009f\u00ad"+
		"\3\2\2\2\u00a0\u00a1\5\22\n\2\u00a1\u00a2\7\t\2\2\u00a2\u00a3\5\22\n\2"+
		"\u00a3\u00ad\3\2\2\2\u00a4\u00a5\5\22\n\2\u00a5\u00a6\7\13\2\2\u00a6\u00a7"+
		"\5\22\n\2\u00a7\u00ad\3\2\2\2\u00a8\u00a9\5\22\n\2\u00a9\u00aa\7\f\2\2"+
		"\u00aa\u00ab\5\22\n\2\u00ab\u00ad\3\2\2\2\u00ac\u0098\3\2\2\2\u00ac\u009c"+
		"\3\2\2\2\u00ac\u00a0\3\2\2\2\u00ac\u00a4\3\2\2\2\u00ac\u00a8\3\2\2\2\u00ad"+
		"\27\3\2\2\2\17\36,=BX`i|~\u008b\u0093\u0095\u00ac";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}