// Generated from C:/Users/emiel/Desktop/semester 4/automata/Automata-Antlr/src/com/ap/antlr/grammars\AutomataParser.g4 by ANTLR 4.9.1
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
		EQUALS=13, LEFT_PARENTHESIS=14, RIGHT_PARENTHESIS=15, LEFT_BRACE=16, RIGHT_BRACE=17, 
		DOT=18, COMMA=19, SEMICOLON=20, EXLAMATION_MARK=21, VARIABLE_TYPE_NUMBER=22, 
		VARIABLE_TYPE_BOOLEAN=23, VARIABLE_TYPE_STRING=24, TYPE_VOID=25, RETURN=26, 
		PRINT=27, IF=28, THEN=29, FI=30, ELSE=31, WHILE=32, ELIHW=33, NUMBER=34, 
		BOOLEAN=35, IDENTIFIER=36, COMMENT=37, WS=38;
	public static final int
		RULE_program = 0, RULE_statement_block = 1, RULE_statement = 2, RULE_function_declaration = 3, 
		RULE_function_call = 4, RULE_argument = 5, RULE_parameter = 6, RULE_value_types = 7, 
		RULE_return_expression = 8, RULE_print_expression = 9, RULE_conditional_expression = 10, 
		RULE_conditional_loop_expression = 11, RULE_logical_expression = 12, RULE_comparison_expression = 13, 
		RULE_variable_declaration = 14, RULE_variable_assignment = 15, RULE_numeric_expression = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement_block", "statement", "function_declaration", "function_call", 
			"argument", "parameter", "value_types", "return_expression", "print_expression", 
			"conditional_expression", "conditional_loop_expression", "logical_expression", 
			"comparison_expression", "variable_declaration", "variable_assignment", 
			"numeric_expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'*'", "'/'", "'-'", "'^'", "'>'", "'<'", "'>='", "'<='", 
			"'=='", "'&&'", "'||'", "'='", "'('", "')'", "'{'", "'}'", "'.'", "','", 
			"';'", "'!'", "'number'", "'bool'", "'string'", "'void'", "'return'", 
			"'Print'", "'if'", "'then'", "'fi'", "'else'", "'while'", "'elihw'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ADD", "TIMES", "DIVISION", "MINUS", "POWER", "GREATER_THAN", "LESS_THAN", 
			"GREATER_THAN_OR_EQUAL", "LESS_THAN_OR_EQUAL", "EQUAL_TO", "AND", "OR", 
			"EQUALS", "LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", "LEFT_BRACE", "RIGHT_BRACE", 
			"DOT", "COMMA", "SEMICOLON", "EXLAMATION_MARK", "VARIABLE_TYPE_NUMBER", 
			"VARIABLE_TYPE_BOOLEAN", "VARIABLE_TYPE_STRING", "TYPE_VOID", "RETURN", 
			"PRINT", "IF", "THEN", "FI", "ELSE", "WHILE", "ELIHW", "NUMBER", "BOOLEAN", 
			"IDENTIFIER", "COMMENT", "WS"
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
			setState(34);
			statement_block();
			setState(35);
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
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARIABLE_TYPE_NUMBER) | (1L << VARIABLE_TYPE_BOOLEAN) | (1L << VARIABLE_TYPE_STRING) | (1L << TYPE_VOID) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(37);
				statement();
				}
				}
				setState(42);
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
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
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
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				print_expression();
				setState(44);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				conditional_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				conditional_loop_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(48);
				function_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(49);
				function_call();
				setState(50);
				match(SEMICOLON);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(52);
				variable_declaration();
				setState(53);
				match(SEMICOLON);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(55);
				variable_assignment();
				setState(56);
				match(SEMICOLON);
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

	public static class Function_declarationContext extends ParserRuleContext {
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
	 
		public Function_declarationContext() { }
		public void copyFrom(Function_declarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionDeclarationVoidContext extends Function_declarationContext {
		public TerminalNode TYPE_VOID() { return getToken(AutomataParser.TYPE_VOID, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AutomataParser.IDENTIFIER, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(AutomataParser.LEFT_PARENTHESIS, 0); }
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(AutomataParser.RIGHT_PARENTHESIS, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(AutomataParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(AutomataParser.RIGHT_BRACE, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionDeclarationVoidContext(Function_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterFunctionDeclarationVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitFunctionDeclarationVoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitFunctionDeclarationVoid(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionDeclarationReturnContext extends Function_declarationContext {
		public Value_typesContext value_types() {
			return getRuleContext(Value_typesContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(AutomataParser.IDENTIFIER, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(AutomataParser.LEFT_PARENTHESIS, 0); }
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(AutomataParser.RIGHT_PARENTHESIS, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(AutomataParser.LEFT_BRACE, 0); }
		public TerminalNode RETURN() { return getToken(AutomataParser.RETURN, 0); }
		public Return_expressionContext return_expression() {
			return getRuleContext(Return_expressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AutomataParser.SEMICOLON, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(AutomataParser.RIGHT_BRACE, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionDeclarationReturnContext(Function_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterFunctionDeclarationReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitFunctionDeclarationReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitFunctionDeclarationReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function_declaration);
		int _la;
		try {
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE_TYPE_NUMBER:
			case VARIABLE_TYPE_BOOLEAN:
			case VARIABLE_TYPE_STRING:
				_localctx = new FunctionDeclarationReturnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				value_types();
				setState(61);
				match(IDENTIFIER);
				setState(62);
				match(LEFT_PARENTHESIS);
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARIABLE_TYPE_NUMBER) | (1L << VARIABLE_TYPE_BOOLEAN) | (1L << VARIABLE_TYPE_STRING))) != 0)) {
					{
					{
					setState(63);
					parameter();
					}
					}
					setState(68);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(69);
				match(RIGHT_PARENTHESIS);
				setState(70);
				match(LEFT_BRACE);
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARIABLE_TYPE_NUMBER) | (1L << VARIABLE_TYPE_BOOLEAN) | (1L << VARIABLE_TYPE_STRING) | (1L << TYPE_VOID) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(71);
					statement();
					}
					}
					setState(76);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(77);
				match(RETURN);
				setState(78);
				return_expression();
				setState(79);
				match(SEMICOLON);
				setState(80);
				match(RIGHT_BRACE);
				}
				break;
			case TYPE_VOID:
				_localctx = new FunctionDeclarationVoidContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				match(TYPE_VOID);
				setState(83);
				match(IDENTIFIER);
				setState(84);
				match(LEFT_PARENTHESIS);
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARIABLE_TYPE_NUMBER) | (1L << VARIABLE_TYPE_BOOLEAN) | (1L << VARIABLE_TYPE_STRING))) != 0)) {
					{
					{
					setState(85);
					parameter();
					}
					}
					setState(90);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(91);
				match(RIGHT_PARENTHESIS);
				setState(92);
				match(LEFT_BRACE);
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARIABLE_TYPE_NUMBER) | (1L << VARIABLE_TYPE_BOOLEAN) | (1L << VARIABLE_TYPE_STRING) | (1L << TYPE_VOID) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(93);
					statement();
					}
					}
					setState(98);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(99);
				match(RIGHT_BRACE);
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

	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AutomataParser.IDENTIFIER, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(AutomataParser.LEFT_PARENTHESIS, 0); }
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(AutomataParser.RIGHT_PARENTHESIS, 0); }
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(IDENTIFIER);
			setState(103);
			match(LEFT_PARENTHESIS);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_PARENTHESIS) | (1L << EXLAMATION_MARK) | (1L << NUMBER) | (1L << BOOLEAN) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(104);
				argument();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
			match(RIGHT_PARENTHESIS);
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

	public static class ArgumentContext extends ParserRuleContext {
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
	 
		public ArgumentContext() { }
		public void copyFrom(ArgumentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArgumentFunctionContext extends ArgumentContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(AutomataParser.COMMA, 0); }
		public ArgumentFunctionContext(ArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterArgumentFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitArgumentFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitArgumentFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArgumentVariableContext extends ArgumentContext {
		public TerminalNode IDENTIFIER() { return getToken(AutomataParser.IDENTIFIER, 0); }
		public TerminalNode COMMA() { return getToken(AutomataParser.COMMA, 0); }
		public ArgumentVariableContext(ArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterArgumentVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitArgumentVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitArgumentVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArgumentNumericExpressionContext extends ArgumentContext {
		public Numeric_expressionContext numeric_expression() {
			return getRuleContext(Numeric_expressionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(AutomataParser.COMMA, 0); }
		public ArgumentNumericExpressionContext(ArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterArgumentNumericExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitArgumentNumericExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitArgumentNumericExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArgumentLogicalExpressionContext extends ArgumentContext {
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(AutomataParser.COMMA, 0); }
		public ArgumentLogicalExpressionContext(ArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterArgumentLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitArgumentLogicalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitArgumentLogicalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArgumentNumberExpressionContext extends ArgumentContext {
		public TerminalNode NUMBER() { return getToken(AutomataParser.NUMBER, 0); }
		public TerminalNode COMMA() { return getToken(AutomataParser.COMMA, 0); }
		public ArgumentNumberExpressionContext(ArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterArgumentNumberExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitArgumentNumberExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitArgumentNumberExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArgumentBoolExpressionContext extends ArgumentContext {
		public TerminalNode BOOLEAN() { return getToken(AutomataParser.BOOLEAN, 0); }
		public TerminalNode COMMA() { return getToken(AutomataParser.COMMA, 0); }
		public ArgumentBoolExpressionContext(ArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterArgumentBoolExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitArgumentBoolExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitArgumentBoolExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_argument);
		try {
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new ArgumentNumberExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(NUMBER);
				setState(113);
				match(COMMA);
				}
				break;
			case 2:
				_localctx = new ArgumentBoolExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				match(BOOLEAN);
				setState(115);
				match(COMMA);
				}
				break;
			case 3:
				_localctx = new ArgumentVariableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				match(IDENTIFIER);
				setState(117);
				match(COMMA);
				}
				break;
			case 4:
				_localctx = new ArgumentFunctionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(118);
				function_call();
				setState(119);
				match(COMMA);
				}
				break;
			case 5:
				_localctx = new ArgumentNumericExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(121);
				numeric_expression(0);
				setState(122);
				match(COMMA);
				}
				break;
			case 6:
				_localctx = new ArgumentLogicalExpressionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(124);
				logical_expression(0);
				setState(125);
				match(COMMA);
				}
				break;
			case 7:
				_localctx = new ArgumentNumberExpressionContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(127);
				match(NUMBER);
				}
				break;
			case 8:
				_localctx = new ArgumentBoolExpressionContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(128);
				match(BOOLEAN);
				}
				break;
			case 9:
				_localctx = new ArgumentVariableContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(129);
				match(IDENTIFIER);
				}
				break;
			case 10:
				_localctx = new ArgumentFunctionContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(130);
				function_call();
				}
				break;
			case 11:
				_localctx = new ArgumentNumericExpressionContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(131);
				numeric_expression(0);
				}
				break;
			case 12:
				_localctx = new ArgumentLogicalExpressionContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(132);
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

	public static class ParameterContext extends ParserRuleContext {
		public Value_typesContext value_types() {
			return getRuleContext(Value_typesContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(AutomataParser.IDENTIFIER, 0); }
		public TerminalNode COMMA() { return getToken(AutomataParser.COMMA, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameter);
		try {
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				value_types();
				setState(136);
				match(IDENTIFIER);
				setState(137);
				match(COMMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				value_types();
				setState(140);
				match(IDENTIFIER);
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

	public static class Value_typesContext extends ParserRuleContext {
		public TerminalNode VARIABLE_TYPE_NUMBER() { return getToken(AutomataParser.VARIABLE_TYPE_NUMBER, 0); }
		public TerminalNode VARIABLE_TYPE_BOOLEAN() { return getToken(AutomataParser.VARIABLE_TYPE_BOOLEAN, 0); }
		public TerminalNode VARIABLE_TYPE_STRING() { return getToken(AutomataParser.VARIABLE_TYPE_STRING, 0); }
		public Value_typesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterValue_types(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitValue_types(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitValue_types(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_typesContext value_types() throws RecognitionException {
		Value_typesContext _localctx = new Value_typesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_value_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARIABLE_TYPE_NUMBER) | (1L << VARIABLE_TYPE_BOOLEAN) | (1L << VARIABLE_TYPE_STRING))) != 0)) ) {
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

	public static class Return_expressionContext extends ParserRuleContext {
		public Return_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_expression; }
	 
		public Return_expressionContext() { }
		public void copyFrom(Return_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReturnVariableContext extends Return_expressionContext {
		public TerminalNode IDENTIFIER() { return getToken(AutomataParser.IDENTIFIER, 0); }
		public ReturnVariableContext(Return_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterReturnVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitReturnVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitReturnVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnNumericExpressionContext extends Return_expressionContext {
		public Numeric_expressionContext numeric_expression() {
			return getRuleContext(Numeric_expressionContext.class,0);
		}
		public ReturnNumericExpressionContext(Return_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterReturnNumericExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitReturnNumericExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitReturnNumericExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnLogicExpressionContext extends Return_expressionContext {
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
		}
		public ReturnLogicExpressionContext(Return_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterReturnLogicExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitReturnLogicExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitReturnLogicExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnFunctionContext extends Return_expressionContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public ReturnFunctionContext(Return_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterReturnFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitReturnFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitReturnFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_expressionContext return_expression() throws RecognitionException {
		Return_expressionContext _localctx = new Return_expressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_return_expression);
		try {
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new ReturnVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new ReturnFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				function_call();
				}
				break;
			case 3:
				_localctx = new ReturnLogicExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				logical_expression(0);
				}
				break;
			case 4:
				_localctx = new ReturnNumericExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(149);
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
		enterRule(_localctx, 18, RULE_print_expression);
		try {
			_localctx = new PrintExpressionNumericContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(PRINT);
			setState(153);
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
		enterRule(_localctx, 20, RULE_conditional_expression);
		int _la;
		try {
			int _alt;
			_localctx = new ConditionalExpressionIfContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(IF);
			setState(156);
			logical_expression(0);
			setState(157);
			match(THEN);
			setState(158);
			statement_block();
			setState(167);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(159);
					match(ELSE);
					setState(160);
					match(IF);
					setState(161);
					logical_expression(0);
					setState(162);
					match(THEN);
					setState(163);
					statement_block();
					}
					} 
				}
				setState(169);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(170);
				match(ELSE);
				setState(171);
				statement_block();
				}
			}

			setState(174);
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
		enterRule(_localctx, 22, RULE_conditional_loop_expression);
		try {
			_localctx = new ConditionalExpressionWhileContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(WHILE);
			setState(177);
			logical_expression(0);
			setState(178);
			match(THEN);
			setState(179);
			statement_block();
			setState(180);
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
	public static class LogicalExpressionFunctionContext extends Logical_expressionContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public LogicalExpressionFunctionContext(Logical_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterLogicalExpressionFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitLogicalExpressionFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitLogicalExpressionFunction(this);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_logical_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				_localctx = new LogicalExpressionBooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(183);
				match(BOOLEAN);
				}
				break;
			case 2:
				{
				_localctx = new LogicalExpressionVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(184);
				match(IDENTIFIER);
				}
				break;
			case 3:
				{
				_localctx = new LogicalExpressionFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(185);
				function_call();
				}
				break;
			case 4:
				{
				_localctx = new LogicalExpressionParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(186);
				match(LEFT_PARENTHESIS);
				setState(187);
				logical_expression(0);
				setState(188);
				match(RIGHT_PARENTHESIS);
				}
				break;
			case 5:
				{
				_localctx = new LogicalExpressionComparisonContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(190);
				comparison_expression();
				}
				break;
			case 6:
				{
				_localctx = new LogicalExpressionNegationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(191);
				match(EXLAMATION_MARK);
				setState(192);
				logical_expression(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(203);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(201);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalExpressionAndContext(new Logical_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logical_expression);
						setState(195);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(196);
						match(AND);
						setState(197);
						logical_expression(5);
						}
						break;
					case 2:
						{
						_localctx = new LogicalExpressionOrContext(new Logical_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logical_expression);
						setState(198);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(199);
						match(OR);
						setState(200);
						logical_expression(4);
						}
						break;
					}
					} 
				}
				setState(205);
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
		enterRule(_localctx, 26, RULE_comparison_expression);
		try {
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new ComparisonExpressionGreaterThanContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				numeric_expression(0);
				setState(207);
				match(GREATER_THAN);
				setState(208);
				numeric_expression(0);
				}
				break;
			case 2:
				_localctx = new ComparisonExpressionGreaterThanOrEqualContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				numeric_expression(0);
				setState(211);
				match(GREATER_THAN_OR_EQUAL);
				setState(212);
				numeric_expression(0);
				}
				break;
			case 3:
				_localctx = new ComparisonExpressionLessThanContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
				numeric_expression(0);
				setState(215);
				match(LESS_THAN);
				setState(216);
				numeric_expression(0);
				}
				break;
			case 4:
				_localctx = new ComparisonExpressionLessThanOrEqualContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(218);
				numeric_expression(0);
				setState(219);
				match(LESS_THAN_OR_EQUAL);
				setState(220);
				numeric_expression(0);
				}
				break;
			case 5:
				_localctx = new ComparisonExpressionEqualToContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(222);
				numeric_expression(0);
				setState(223);
				match(EQUAL_TO);
				setState(224);
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
		enterRule(_localctx, 28, RULE_variable_declaration);
		try {
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new VariableNumericDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				match(VARIABLE_TYPE_NUMBER);
				setState(229);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new VariableNumericInitializationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				match(VARIABLE_TYPE_NUMBER);
				setState(231);
				match(IDENTIFIER);
				setState(232);
				match(EQUALS);
				setState(233);
				numeric_expression(0);
				}
				break;
			case 3:
				_localctx = new VariableBooleanDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
				match(VARIABLE_TYPE_BOOLEAN);
				setState(235);
				match(IDENTIFIER);
				}
				break;
			case 4:
				_localctx = new VariableBooleanInitializationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(236);
				match(VARIABLE_TYPE_BOOLEAN);
				setState(237);
				match(IDENTIFIER);
				setState(238);
				match(EQUALS);
				setState(239);
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
		enterRule(_localctx, 30, RULE_variable_assignment);
		try {
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new VariableNumericAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				match(IDENTIFIER);
				setState(243);
				match(EQUALS);
				setState(244);
				numeric_expression(0);
				}
				break;
			case 2:
				_localctx = new VariableBooleanAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				match(IDENTIFIER);
				setState(246);
				match(EQUALS);
				setState(247);
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
	public static class MathExpressionFunctionContext extends Numeric_expressionContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public MathExpressionFunctionContext(Numeric_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterMathExpressionFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitMathExpressionFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitMathExpressionFunction(this);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_numeric_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				_localctx = new MathExpressionVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(251);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				_localctx = new MathExpressionBasicNumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(252);
				match(NUMBER);
				}
				break;
			case 3:
				{
				_localctx = new MathExpressionFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(253);
				function_call();
				}
				break;
			case 4:
				{
				_localctx = new MathExpressionParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(254);
				match(LEFT_PARENTHESIS);
				setState(255);
				numeric_expression(0);
				setState(256);
				match(RIGHT_PARENTHESIS);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(279);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(277);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new MathExpressionPowerContext(new Numeric_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_numeric_expression);
						setState(260);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(261);
						match(POWER);
						setState(262);
						numeric_expression(6);
						}
						break;
					case 2:
						{
						_localctx = new MathExpressionTimesContext(new Numeric_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_numeric_expression);
						setState(263);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(264);
						match(TIMES);
						setState(265);
						numeric_expression(5);
						}
						break;
					case 3:
						{
						_localctx = new MathExpressionDivisionContext(new Numeric_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_numeric_expression);
						setState(266);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(267);
						match(DIVISION);
						setState(268);
						numeric_expression(4);
						}
						break;
					case 4:
						{
						_localctx = new MathExpressionSumContext(new Numeric_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_numeric_expression);
						setState(269);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(270);
						match(ADD);
						setState(271);
						numeric_expression(3);
						}
						break;
					case 5:
						{
						_localctx = new MathExpressionMinusContext(new Numeric_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_numeric_expression);
						setState(272);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(273);
						match(MINUS);
						setState(274);
						numeric_expression(2);
						}
						break;
					case 6:
						{
						_localctx = new MathExpressionFactorialContext(new Numeric_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_numeric_expression);
						setState(275);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(276);
						match(EXLAMATION_MARK);
						}
						break;
					}
					} 
				}
				setState(281);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
		case 12:
			return logical_expression_sempred((Logical_expressionContext)_localctx, predIndex);
		case 16:
			return numeric_expression_sempred((Numeric_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean logical_expression_sempred(Logical_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean numeric_expression_sempred(Numeric_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		case 6:
			return precpred(_ctx, 1);
		case 7:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u011d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\3\7\3)\n\3\f\3\16\3,\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4=\n\4\3\5\3\5\3\5\3\5\7\5C\n\5\f\5\16"+
		"\5F\13\5\3\5\3\5\3\5\7\5K\n\5\f\5\16\5N\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\7\5Y\n\5\f\5\16\5\\\13\5\3\5\3\5\3\5\7\5a\n\5\f\5\16\5d\13"+
		"\5\3\5\5\5g\n\5\3\6\3\6\3\6\7\6l\n\6\f\6\16\6o\13\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\5\7\u0088\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0091\n\b\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\5\n\u0099\n\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\7\f\u00a8\n\f\f\f\16\f\u00ab\13\f\3\f\3\f\5\f\u00af\n\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\5\16\u00c4\n\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16"+
		"\u00cc\n\16\f\16\16\16\u00cf\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u00e5\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u00f3\n\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00fb\n\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0105\n\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22"+
		"\u0118\n\22\f\22\16\22\u011b\13\22\3\22\2\4\32\"\23\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"\2\3\3\2\30\32\2\u0141\2$\3\2\2\2\4*\3\2\2\2\6"+
		"<\3\2\2\2\bf\3\2\2\2\nh\3\2\2\2\f\u0087\3\2\2\2\16\u0090\3\2\2\2\20\u0092"+
		"\3\2\2\2\22\u0098\3\2\2\2\24\u009a\3\2\2\2\26\u009d\3\2\2\2\30\u00b2\3"+
		"\2\2\2\32\u00c3\3\2\2\2\34\u00e4\3\2\2\2\36\u00f2\3\2\2\2 \u00fa\3\2\2"+
		"\2\"\u0104\3\2\2\2$%\5\4\3\2%&\7\2\2\3&\3\3\2\2\2\')\5\6\4\2(\'\3\2\2"+
		"\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+\5\3\2\2\2,*\3\2\2\2-.\5\24\13\2./\7"+
		"\26\2\2/=\3\2\2\2\60=\5\26\f\2\61=\5\30\r\2\62=\5\b\5\2\63\64\5\n\6\2"+
		"\64\65\7\26\2\2\65=\3\2\2\2\66\67\5\36\20\2\678\7\26\2\28=\3\2\2\29:\5"+
		" \21\2:;\7\26\2\2;=\3\2\2\2<-\3\2\2\2<\60\3\2\2\2<\61\3\2\2\2<\62\3\2"+
		"\2\2<\63\3\2\2\2<\66\3\2\2\2<9\3\2\2\2=\7\3\2\2\2>?\5\20\t\2?@\7&\2\2"+
		"@D\7\20\2\2AC\5\16\b\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2EG\3\2\2"+
		"\2FD\3\2\2\2GH\7\21\2\2HL\7\22\2\2IK\5\6\4\2JI\3\2\2\2KN\3\2\2\2LJ\3\2"+
		"\2\2LM\3\2\2\2MO\3\2\2\2NL\3\2\2\2OP\7\34\2\2PQ\5\22\n\2QR\7\26\2\2RS"+
		"\7\23\2\2Sg\3\2\2\2TU\7\33\2\2UV\7&\2\2VZ\7\20\2\2WY\5\16\b\2XW\3\2\2"+
		"\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\Z\3\2\2\2]^\7\21\2\2^b\7"+
		"\22\2\2_a\5\6\4\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2db"+
		"\3\2\2\2eg\7\23\2\2f>\3\2\2\2fT\3\2\2\2g\t\3\2\2\2hi\7&\2\2im\7\20\2\2"+
		"jl\5\f\7\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2"+
		"pq\7\21\2\2q\13\3\2\2\2rs\7$\2\2s\u0088\7\25\2\2tu\7%\2\2u\u0088\7\25"+
		"\2\2vw\7&\2\2w\u0088\7\25\2\2xy\5\n\6\2yz\7\25\2\2z\u0088\3\2\2\2{|\5"+
		"\"\22\2|}\7\25\2\2}\u0088\3\2\2\2~\177\5\32\16\2\177\u0080\7\25\2\2\u0080"+
		"\u0088\3\2\2\2\u0081\u0088\7$\2\2\u0082\u0088\7%\2\2\u0083\u0088\7&\2"+
		"\2\u0084\u0088\5\n\6\2\u0085\u0088\5\"\22\2\u0086\u0088\5\32\16\2\u0087"+
		"r\3\2\2\2\u0087t\3\2\2\2\u0087v\3\2\2\2\u0087x\3\2\2\2\u0087{\3\2\2\2"+
		"\u0087~\3\2\2\2\u0087\u0081\3\2\2\2\u0087\u0082\3\2\2\2\u0087\u0083\3"+
		"\2\2\2\u0087\u0084\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088"+
		"\r\3\2\2\2\u0089\u008a\5\20\t\2\u008a\u008b\7&\2\2\u008b\u008c\7\25\2"+
		"\2\u008c\u0091\3\2\2\2\u008d\u008e\5\20\t\2\u008e\u008f\7&\2\2\u008f\u0091"+
		"\3\2\2\2\u0090\u0089\3\2\2\2\u0090\u008d\3\2\2\2\u0091\17\3\2\2\2\u0092"+
		"\u0093\t\2\2\2\u0093\21\3\2\2\2\u0094\u0099\7&\2\2\u0095\u0099\5\n\6\2"+
		"\u0096\u0099\5\32\16\2\u0097\u0099\5\"\22\2\u0098\u0094\3\2\2\2\u0098"+
		"\u0095\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0097\3\2\2\2\u0099\23\3\2\2"+
		"\2\u009a\u009b\7\35\2\2\u009b\u009c\5\"\22\2\u009c\25\3\2\2\2\u009d\u009e"+
		"\7\36\2\2\u009e\u009f\5\32\16\2\u009f\u00a0\7\37\2\2\u00a0\u00a9\5\4\3"+
		"\2\u00a1\u00a2\7!\2\2\u00a2\u00a3\7\36\2\2\u00a3\u00a4\5\32\16\2\u00a4"+
		"\u00a5\7\37\2\2\u00a5\u00a6\5\4\3\2\u00a6\u00a8\3\2\2\2\u00a7\u00a1\3"+
		"\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00ae\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\7!\2\2\u00ad\u00af\5\4"+
		"\3\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\u00b1\7 \2\2\u00b1\27\3\2\2\2\u00b2\u00b3\7\"\2\2\u00b3\u00b4\5\32\16"+
		"\2\u00b4\u00b5\7\37\2\2\u00b5\u00b6\5\4\3\2\u00b6\u00b7\7#\2\2\u00b7\31"+
		"\3\2\2\2\u00b8\u00b9\b\16\1\2\u00b9\u00c4\7%\2\2\u00ba\u00c4\7&\2\2\u00bb"+
		"\u00c4\5\n\6\2\u00bc\u00bd\7\20\2\2\u00bd\u00be\5\32\16\2\u00be\u00bf"+
		"\7\21\2\2\u00bf\u00c4\3\2\2\2\u00c0\u00c4\5\34\17\2\u00c1\u00c2\7\27\2"+
		"\2\u00c2\u00c4\5\32\16\3\u00c3\u00b8\3\2\2\2\u00c3\u00ba\3\2\2\2\u00c3"+
		"\u00bb\3\2\2\2\u00c3\u00bc\3\2\2\2\u00c3\u00c0\3\2\2\2\u00c3\u00c1\3\2"+
		"\2\2\u00c4\u00cd\3\2\2\2\u00c5\u00c6\f\6\2\2\u00c6\u00c7\7\r\2\2\u00c7"+
		"\u00cc\5\32\16\7\u00c8\u00c9\f\5\2\2\u00c9\u00ca\7\16\2\2\u00ca\u00cc"+
		"\5\32\16\6\u00cb\u00c5\3\2\2\2\u00cb\u00c8\3\2\2\2\u00cc\u00cf\3\2\2\2"+
		"\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\33\3\2\2\2\u00cf\u00cd"+
		"\3\2\2\2\u00d0\u00d1\5\"\22\2\u00d1\u00d2\7\b\2\2\u00d2\u00d3\5\"\22\2"+
		"\u00d3\u00e5\3\2\2\2\u00d4\u00d5\5\"\22\2\u00d5\u00d6\7\n\2\2\u00d6\u00d7"+
		"\5\"\22\2\u00d7\u00e5\3\2\2\2\u00d8\u00d9\5\"\22\2\u00d9\u00da\7\t\2\2"+
		"\u00da\u00db\5\"\22\2\u00db\u00e5\3\2\2\2\u00dc\u00dd\5\"\22\2\u00dd\u00de"+
		"\7\13\2\2\u00de\u00df\5\"\22\2\u00df\u00e5\3\2\2\2\u00e0\u00e1\5\"\22"+
		"\2\u00e1\u00e2\7\f\2\2\u00e2\u00e3\5\"\22\2\u00e3\u00e5\3\2\2\2\u00e4"+
		"\u00d0\3\2\2\2\u00e4\u00d4\3\2\2\2\u00e4\u00d8\3\2\2\2\u00e4\u00dc\3\2"+
		"\2\2\u00e4\u00e0\3\2\2\2\u00e5\35\3\2\2\2\u00e6\u00e7\7\30\2\2\u00e7\u00f3"+
		"\7&\2\2\u00e8\u00e9\7\30\2\2\u00e9\u00ea\7&\2\2\u00ea\u00eb\7\17\2\2\u00eb"+
		"\u00f3\5\"\22\2\u00ec\u00ed\7\31\2\2\u00ed\u00f3\7&\2\2\u00ee\u00ef\7"+
		"\31\2\2\u00ef\u00f0\7&\2\2\u00f0\u00f1\7\17\2\2\u00f1\u00f3\5\32\16\2"+
		"\u00f2\u00e6\3\2\2\2\u00f2\u00e8\3\2\2\2\u00f2\u00ec\3\2\2\2\u00f2\u00ee"+
		"\3\2\2\2\u00f3\37\3\2\2\2\u00f4\u00f5\7&\2\2\u00f5\u00f6\7\17\2\2\u00f6"+
		"\u00fb\5\"\22\2\u00f7\u00f8\7&\2\2\u00f8\u00f9\7\17\2\2\u00f9\u00fb\5"+
		"\32\16\2\u00fa\u00f4\3\2\2\2\u00fa\u00f7\3\2\2\2\u00fb!\3\2\2\2\u00fc"+
		"\u00fd\b\22\1\2\u00fd\u0105\7&\2\2\u00fe\u0105\7$\2\2\u00ff\u0105\5\n"+
		"\6\2\u0100\u0101\7\20\2\2\u0101\u0102\5\"\22\2\u0102\u0103\7\21\2\2\u0103"+
		"\u0105\3\2\2\2\u0104\u00fc\3\2\2\2\u0104\u00fe\3\2\2\2\u0104\u00ff\3\2"+
		"\2\2\u0104\u0100\3\2\2\2\u0105\u0119\3\2\2\2\u0106\u0107\f\7\2\2\u0107"+
		"\u0108\7\7\2\2\u0108\u0118\5\"\22\b\u0109\u010a\f\6\2\2\u010a\u010b\7"+
		"\4\2\2\u010b\u0118\5\"\22\7\u010c\u010d\f\5\2\2\u010d\u010e\7\5\2\2\u010e"+
		"\u0118\5\"\22\6\u010f\u0110\f\4\2\2\u0110\u0111\7\3\2\2\u0111\u0118\5"+
		"\"\22\5\u0112\u0113\f\3\2\2\u0113\u0114\7\6\2\2\u0114\u0118\5\"\22\4\u0115"+
		"\u0116\f\b\2\2\u0116\u0118\7\27\2\2\u0117\u0106\3\2\2\2\u0117\u0109\3"+
		"\2\2\2\u0117\u010c\3\2\2\2\u0117\u010f\3\2\2\2\u0117\u0112\3\2\2\2\u0117"+
		"\u0115\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2"+
		"\2\2\u011a#\3\2\2\2\u011b\u0119\3\2\2\2\30*<DLZbfm\u0087\u0090\u0098\u00a9"+
		"\u00ae\u00c3\u00cb\u00cd\u00e4\u00f2\u00fa\u0104\u0117\u0119";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}