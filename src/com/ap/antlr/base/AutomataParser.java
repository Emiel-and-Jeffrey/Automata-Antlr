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
<<<<<<< HEAD
		EQUALS=13, LEFT_PARENTHESIS=14, RIGHT_PARENTHESIS=15, DOT=16, SEMICOLON=17, 
		EXLAMATION_MARK=18, VARIABLE_TYPE_NUMBER=19, VARIABLE_TYPE_BOOLEAN=20, 
		VARIABLE_TYPE_STRING=21, PRINT=22, IF=23, THEN=24, FI=25, ELSE=26, WHILE=27, 
		ELIHW=28, NUMBER=29, BOOLEAN=30, IDENTIFIER=31, WS=32, COMMENT=33;
=======
		EQUALS=13, LEFT_PARENTHESIS=14, RIGHT_PARENTHESIS=15, LEFT_BRACE=16, RIGHT_BRACE=17, 
		DOT=18, COMMA=19, SEMICOLON=20, EXLAMATION_MARK=21, VARIABLE_TYPE_NUMBER=22, 
		VARIABLE_TYPE_BOOLEAN=23, VARIABLE_TYPE_STRING=24, TYPE_VOID=25, RETURN=26, 
		PRINT=27, IF=28, THEN=29, FI=30, ELSE=31, WHILE=32, ELIHW=33, NUMBER=34, 
<<<<<<< HEAD
		BOOLEAN=35, IDENTIFIER=36, WS=37;
>>>>>>> Add rules for functions
=======
		BOOLEAN=35, IDENTIFIER=36, COMMENT=37, WS=38;
>>>>>>> Implement basic functions
	public static final int
		RULE_program = 0, RULE_statement_block = 1, RULE_statement = 2, RULE_function = 3, 
		RULE_function_call = 4, RULE_parameter_declaration = 5, RULE_parameter = 6, 
		RULE_function_return_types = 7, RULE_print_expression = 8, RULE_conditional_expression = 9, 
		RULE_conditional_loop_expression = 10, RULE_logical_expression = 11, RULE_comparison_expression = 12, 
		RULE_variable_declaration = 13, RULE_variable_assignment = 14, RULE_numeric_expression = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement_block", "statement", "function", "function_call", 
			"parameter_declaration", "parameter", "function_return_types", "print_expression", 
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
<<<<<<< HEAD
			"IDENTIFIER", "WS", "COMMENT"
=======
			"IDENTIFIER", "COMMENT", "WS"
>>>>>>> Implement basic functions
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
			setState(32);
			statement_block();
			setState(33);
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
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARIABLE_TYPE_NUMBER) | (1L << VARIABLE_TYPE_BOOLEAN) | (1L << VARIABLE_TYPE_STRING) | (1L << TYPE_VOID) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << IDENTIFIER))) != 0)) {
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
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
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
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				print_expression();
				setState(42);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				conditional_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				conditional_loop_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(46);
				function();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(47);
				function_call();
				setState(48);
				match(SEMICOLON);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(50);
				variable_declaration();
				setState(51);
				match(SEMICOLON);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(53);
				variable_assignment();
				setState(54);
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

	public static class FunctionContext extends ParserRuleContext {
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	 
		public FunctionContext() { }
		public void copyFrom(FunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionDeclarationContext extends FunctionContext {
		public Function_return_typesContext function_return_types() {
			return getRuleContext(Function_return_typesContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(AutomataParser.IDENTIFIER, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(AutomataParser.LEFT_PARENTHESIS, 0); }
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(AutomataParser.RIGHT_PARENTHESIS, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(AutomataParser.LEFT_BRACE, 0); }
		public TerminalNode RETURN() { return getToken(AutomataParser.RETURN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(AutomataParser.RIGHT_BRACE, 0); }
		public Parameter_declarationContext parameter_declaration() {
			return getRuleContext(Parameter_declarationContext.class,0);
		}
		public FunctionDeclarationContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionDeclarationVoidContext extends FunctionContext {
		public TerminalNode TYPE_VOID() { return getToken(AutomataParser.TYPE_VOID, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AutomataParser.IDENTIFIER, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(AutomataParser.LEFT_PARENTHESIS, 0); }
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(AutomataParser.RIGHT_PARENTHESIS, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(AutomataParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(AutomataParser.RIGHT_BRACE, 0); }
		public Parameter_declarationContext parameter_declaration() {
			return getRuleContext(Parameter_declarationContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionDeclarationVoidContext(FunctionContext ctx) { copyFrom(ctx); }
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

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function);
		int _la;
		try {
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE_TYPE_NUMBER:
			case VARIABLE_TYPE_BOOLEAN:
			case VARIABLE_TYPE_STRING:
				_localctx = new FunctionDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				function_return_types();
				setState(59);
				match(IDENTIFIER);
				setState(60);
				match(LEFT_PARENTHESIS);
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VARIABLE_TYPE_NUMBER || _la==VARIABLE_TYPE_BOOLEAN) {
					{
					setState(61);
					parameter_declaration();
					}
				}

				setState(64);
				match(RIGHT_PARENTHESIS);
				setState(65);
				match(LEFT_BRACE);
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARIABLE_TYPE_NUMBER) | (1L << VARIABLE_TYPE_BOOLEAN) | (1L << VARIABLE_TYPE_STRING) | (1L << TYPE_VOID) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(66);
					statement();
					}
					}
					setState(71);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(72);
				match(RETURN);
				setState(73);
				statement();
				setState(74);
				match(RIGHT_BRACE);
				}
				break;
			case TYPE_VOID:
				_localctx = new FunctionDeclarationVoidContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				match(TYPE_VOID);
				setState(77);
				match(IDENTIFIER);
				setState(78);
				match(LEFT_PARENTHESIS);
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VARIABLE_TYPE_NUMBER || _la==VARIABLE_TYPE_BOOLEAN) {
					{
					setState(79);
					parameter_declaration();
					}
				}

				setState(82);
				match(RIGHT_PARENTHESIS);
				setState(83);
				match(LEFT_BRACE);
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARIABLE_TYPE_NUMBER) | (1L << VARIABLE_TYPE_BOOLEAN) | (1L << VARIABLE_TYPE_STRING) | (1L << TYPE_VOID) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(84);
					statement();
					}
					}
					setState(89);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(90);
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
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
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
			setState(93);
			match(IDENTIFIER);
			setState(94);
			match(LEFT_PARENTHESIS);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(95);
				parameter();
				}
			}

			setState(98);
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

	public static class Parameter_declarationContext extends ParserRuleContext {
		public Parameter_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_declaration; }
	 
		public Parameter_declarationContext() { }
		public void copyFrom(Parameter_declarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionParameterDeclarationBasicContext extends Parameter_declarationContext {
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public FunctionParameterDeclarationBasicContext(Parameter_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterFunctionParameterDeclarationBasic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitFunctionParameterDeclarationBasic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitFunctionParameterDeclarationBasic(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionParameterDeclarationContext extends Parameter_declarationContext {
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(AutomataParser.COMMA, 0); }
		public Parameter_declarationContext parameter_declaration() {
			return getRuleContext(Parameter_declarationContext.class,0);
		}
		public FunctionParameterDeclarationContext(Parameter_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterFunctionParameterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitFunctionParameterDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitFunctionParameterDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_declarationContext parameter_declaration() throws RecognitionException {
		Parameter_declarationContext _localctx = new Parameter_declarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameter_declaration);
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new FunctionParameterDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				variable_declaration();
				setState(101);
				match(COMMA);
				setState(102);
				parameter_declaration();
				}
				break;
			case 2:
				_localctx = new FunctionParameterDeclarationBasicContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				variable_declaration();
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
		public TerminalNode IDENTIFIER() { return getToken(AutomataParser.IDENTIFIER, 0); }
		public TerminalNode COMMA() { return getToken(AutomataParser.COMMA, 0); }
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
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
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(IDENTIFIER);
				setState(108);
				match(COMMA);
				setState(109);
				parameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
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

	public static class Function_return_typesContext extends ParserRuleContext {
		public TerminalNode VARIABLE_TYPE_NUMBER() { return getToken(AutomataParser.VARIABLE_TYPE_NUMBER, 0); }
		public TerminalNode VARIABLE_TYPE_BOOLEAN() { return getToken(AutomataParser.VARIABLE_TYPE_BOOLEAN, 0); }
		public TerminalNode VARIABLE_TYPE_STRING() { return getToken(AutomataParser.VARIABLE_TYPE_STRING, 0); }
		public Function_return_typesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_return_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterFunction_return_types(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitFunction_return_types(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitFunction_return_types(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_return_typesContext function_return_types() throws RecognitionException {
		Function_return_typesContext _localctx = new Function_return_typesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_function_return_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
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
		enterRule(_localctx, 16, RULE_print_expression);
		try {
			_localctx = new PrintExpressionNumericContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(PRINT);
			setState(116);
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
		enterRule(_localctx, 18, RULE_conditional_expression);
		int _la;
		try {
			int _alt;
			_localctx = new ConditionalExpressionIfContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(IF);
			setState(119);
			logical_expression(0);
			setState(120);
			match(THEN);
			setState(121);
			statement_block();
			setState(130);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(122);
					match(ELSE);
					setState(123);
					match(IF);
					setState(124);
					logical_expression(0);
					setState(125);
					match(THEN);
					setState(126);
					statement_block();
					}
					} 
				}
				setState(132);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(133);
				match(ELSE);
				setState(134);
				statement_block();
				}
			}

			setState(137);
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
		enterRule(_localctx, 20, RULE_conditional_loop_expression);
		try {
			_localctx = new ConditionalExpressionWhileContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(WHILE);
			setState(140);
			logical_expression(0);
			setState(141);
			match(THEN);
			setState(142);
			statement_block();
			setState(143);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_logical_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				_localctx = new LogicalExpressionVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(146);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				_localctx = new LogicalExpressionBooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(147);
				match(BOOLEAN);
				}
				break;
			case 3:
				{
				_localctx = new LogicalExpressionParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(148);
				match(LEFT_PARENTHESIS);
				setState(149);
				logical_expression(0);
				setState(150);
				match(RIGHT_PARENTHESIS);
				}
				break;
			case 4:
				{
				_localctx = new LogicalExpressionComparisonContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(152);
				comparison_expression();
				}
				break;
			case 5:
				{
				_localctx = new LogicalExpressionNegationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(153);
				match(EXLAMATION_MARK);
				setState(154);
				logical_expression(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(165);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(163);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalExpressionAndContext(new Logical_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logical_expression);
						setState(157);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(158);
						match(AND);
						setState(159);
						logical_expression(5);
						}
						break;
					case 2:
						{
						_localctx = new LogicalExpressionOrContext(new Logical_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logical_expression);
						setState(160);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(161);
						match(OR);
						setState(162);
						logical_expression(4);
						}
						break;
					}
					} 
				}
				setState(167);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		enterRule(_localctx, 24, RULE_comparison_expression);
		try {
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new ComparisonExpressionGreaterThanContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				numeric_expression(0);
				setState(169);
				match(GREATER_THAN);
				setState(170);
				numeric_expression(0);
				}
				break;
			case 2:
				_localctx = new ComparisonExpressionGreaterThanOrEqualContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				numeric_expression(0);
				setState(173);
				match(GREATER_THAN_OR_EQUAL);
				setState(174);
				numeric_expression(0);
				}
				break;
			case 3:
				_localctx = new ComparisonExpressionLessThanContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(176);
				numeric_expression(0);
				setState(177);
				match(LESS_THAN);
				setState(178);
				numeric_expression(0);
				}
				break;
			case 4:
				_localctx = new ComparisonExpressionLessThanOrEqualContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(180);
				numeric_expression(0);
				setState(181);
				match(LESS_THAN_OR_EQUAL);
				setState(182);
				numeric_expression(0);
				}
				break;
			case 5:
				_localctx = new ComparisonExpressionEqualToContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(184);
				numeric_expression(0);
				setState(185);
				match(EQUAL_TO);
				setState(186);
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
		enterRule(_localctx, 26, RULE_variable_declaration);
		try {
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new VariableNumericDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				match(VARIABLE_TYPE_NUMBER);
				setState(191);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new VariableNumericInitializationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				match(VARIABLE_TYPE_NUMBER);
				setState(193);
				match(IDENTIFIER);
				setState(194);
				match(EQUALS);
				setState(195);
				numeric_expression(0);
				}
				break;
			case 3:
				_localctx = new VariableBooleanDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(196);
				match(VARIABLE_TYPE_BOOLEAN);
				setState(197);
				match(IDENTIFIER);
				}
				break;
			case 4:
				_localctx = new VariableBooleanInitializationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(198);
				match(VARIABLE_TYPE_BOOLEAN);
				setState(199);
				match(IDENTIFIER);
				setState(200);
				match(EQUALS);
				setState(201);
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
		enterRule(_localctx, 28, RULE_variable_assignment);
		try {
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new VariableNumericAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				match(IDENTIFIER);
				setState(205);
				match(EQUALS);
				setState(206);
				numeric_expression(0);
				}
				break;
			case 2:
				_localctx = new VariableBooleanAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				match(IDENTIFIER);
				setState(208);
				match(EQUALS);
				setState(209);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_numeric_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				_localctx = new MathExpressionVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(213);
				match(IDENTIFIER);
				}
				break;
			case NUMBER:
				{
				_localctx = new MathExpressionBasicNumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(214);
				match(NUMBER);
				}
				break;
			case LEFT_PARENTHESIS:
				{
				_localctx = new MathExpressionParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(215);
				match(LEFT_PARENTHESIS);
				setState(216);
				numeric_expression(0);
				setState(217);
				match(RIGHT_PARENTHESIS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(240);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(238);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new MathExpressionPowerContext(new Numeric_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_numeric_expression);
						setState(221);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(222);
						match(POWER);
						setState(223);
						numeric_expression(6);
						}
						break;
					case 2:
						{
						_localctx = new MathExpressionTimesContext(new Numeric_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_numeric_expression);
						setState(224);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(225);
						match(TIMES);
						setState(226);
						numeric_expression(5);
						}
						break;
					case 3:
						{
						_localctx = new MathExpressionDivisionContext(new Numeric_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_numeric_expression);
						setState(227);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(228);
						match(DIVISION);
						setState(229);
						numeric_expression(4);
						}
						break;
					case 4:
						{
						_localctx = new MathExpressionSumContext(new Numeric_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_numeric_expression);
						setState(230);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(231);
						match(ADD);
						setState(232);
						numeric_expression(3);
						}
						break;
					case 5:
						{
						_localctx = new MathExpressionMinusContext(new Numeric_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_numeric_expression);
						setState(233);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(234);
						match(MINUS);
						setState(235);
						numeric_expression(2);
						}
						break;
					case 6:
						{
						_localctx = new MathExpressionFactorialContext(new Numeric_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_numeric_expression);
						setState(236);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(237);
						match(EXLAMATION_MARK);
						}
						break;
					}
					} 
				}
				setState(242);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		case 11:
			return logical_expression_sempred((Logical_expressionContext)_localctx, predIndex);
		case 15:
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
<<<<<<< HEAD
<<<<<<< HEAD
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00af\4\2\t\2\4"+
=======
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u00e2\4\2\t\2\4"+
>>>>>>> Add rules for functions
=======
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u00f6\4\2\t\2\4"+
>>>>>>> Implement basic functions
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\3\7\3\'\n\3\f\3\16\3*\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\5\4;\n\4\3\5\3\5\3\5\3\5\5\5A\n\5\3\5\3\5\3\5\7"+
		"\5F\n\5\f\5\16\5I\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5S\n\5\3\5\3"+
		"\5\3\5\7\5X\n\5\f\5\16\5[\13\5\3\5\5\5^\n\5\3\6\3\6\3\6\5\6c\n\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\5\7l\n\7\3\b\3\b\3\b\3\b\5\br\n\b\3\t\3\t\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0083\n"+
		"\13\f\13\16\13\u0086\13\13\3\13\3\13\5\13\u008a\n\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u009e\n\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00a6\n\r\f\r\16\r\u00a9\13\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\5\16\u00bf\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u00cd\n\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u00d5\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00de\n\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\7\21\u00f1\n\21\f\21\16\21\u00f4\13\21\3\21\2\4\30 \22\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\3\3\2\30\32\2\u010c\2\"\3\2\2"+
		"\2\4(\3\2\2\2\6:\3\2\2\2\b]\3\2\2\2\n_\3\2\2\2\fk\3\2\2\2\16q\3\2\2\2"+
		"\20s\3\2\2\2\22u\3\2\2\2\24x\3\2\2\2\26\u008d\3\2\2\2\30\u009d\3\2\2\2"+
		"\32\u00be\3\2\2\2\34\u00cc\3\2\2\2\36\u00d4\3\2\2\2 \u00dd\3\2\2\2\"#"+
		"\5\4\3\2#$\7\2\2\3$\3\3\2\2\2%\'\5\6\4\2&%\3\2\2\2\'*\3\2\2\2(&\3\2\2"+
		"\2()\3\2\2\2)\5\3\2\2\2*(\3\2\2\2+,\5\22\n\2,-\7\26\2\2-;\3\2\2\2.;\5"+
		"\24\13\2/;\5\26\f\2\60;\5\b\5\2\61\62\5\n\6\2\62\63\7\26\2\2\63;\3\2\2"+
		"\2\64\65\5\34\17\2\65\66\7\26\2\2\66;\3\2\2\2\678\5\36\20\289\7\26\2\2"+
		"9;\3\2\2\2:+\3\2\2\2:.\3\2\2\2:/\3\2\2\2:\60\3\2\2\2:\61\3\2\2\2:\64\3"+
		"\2\2\2:\67\3\2\2\2;\7\3\2\2\2<=\5\20\t\2=>\7&\2\2>@\7\20\2\2?A\5\f\7\2"+
		"@?\3\2\2\2@A\3\2\2\2AB\3\2\2\2BC\7\21\2\2CG\7\22\2\2DF\5\6\4\2ED\3\2\2"+
		"\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JK\7\34\2\2KL\5\6"+
		"\4\2LM\7\23\2\2M^\3\2\2\2NO\7\33\2\2OP\7&\2\2PR\7\20\2\2QS\5\f\7\2RQ\3"+
		"\2\2\2RS\3\2\2\2ST\3\2\2\2TU\7\21\2\2UY\7\22\2\2VX\5\6\4\2WV\3\2\2\2X"+
		"[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\^\7\23\2\2]<\3\2\2"+
		"\2]N\3\2\2\2^\t\3\2\2\2_`\7&\2\2`b\7\20\2\2ac\5\16\b\2ba\3\2\2\2bc\3\2"+
		"\2\2cd\3\2\2\2de\7\21\2\2e\13\3\2\2\2fg\5\34\17\2gh\7\25\2\2hi\5\f\7\2"+
		"il\3\2\2\2jl\5\34\17\2kf\3\2\2\2kj\3\2\2\2l\r\3\2\2\2mn\7&\2\2no\7\25"+
		"\2\2or\5\16\b\2pr\7&\2\2qm\3\2\2\2qp\3\2\2\2r\17\3\2\2\2st\t\2\2\2t\21"+
		"\3\2\2\2uv\7\35\2\2vw\5 \21\2w\23\3\2\2\2xy\7\36\2\2yz\5\30\r\2z{\7\37"+
		"\2\2{\u0084\5\4\3\2|}\7!\2\2}~\7\36\2\2~\177\5\30\r\2\177\u0080\7\37\2"+
		"\2\u0080\u0081\5\4\3\2\u0081\u0083\3\2\2\2\u0082|\3\2\2\2\u0083\u0086"+
		"\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0089\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0087\u0088\7!\2\2\u0088\u008a\5\4\3\2\u0089\u0087\3\2"+
		"\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\7 \2\2\u008c"+
		"\25\3\2\2\2\u008d\u008e\7\"\2\2\u008e\u008f\5\30\r\2\u008f\u0090\7\37"+
		"\2\2\u0090\u0091\5\4\3\2\u0091\u0092\7#\2\2\u0092\27\3\2\2\2\u0093\u0094"+
		"\b\r\1\2\u0094\u009e\7&\2\2\u0095\u009e\7%\2\2\u0096\u0097\7\20\2\2\u0097"+
		"\u0098\5\30\r\2\u0098\u0099\7\21\2\2\u0099\u009e\3\2\2\2\u009a\u009e\5"+
		"\32\16\2\u009b\u009c\7\27\2\2\u009c\u009e\5\30\r\3\u009d\u0093\3\2\2\2"+
		"\u009d\u0095\3\2\2\2\u009d\u0096\3\2\2\2\u009d\u009a\3\2\2\2\u009d\u009b"+
		"\3\2\2\2\u009e\u00a7\3\2\2\2\u009f\u00a0\f\6\2\2\u00a0\u00a1\7\r\2\2\u00a1"+
		"\u00a6\5\30\r\7\u00a2\u00a3\f\5\2\2\u00a3\u00a4\7\16\2\2\u00a4\u00a6\5"+
		"\30\r\6\u00a5\u009f\3\2\2\2\u00a5\u00a2\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7"+
		"\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\31\3\2\2\2\u00a9\u00a7\3\2\2"+
		"\2\u00aa\u00ab\5 \21\2\u00ab\u00ac\7\b\2\2\u00ac\u00ad\5 \21\2\u00ad\u00bf"+
		"\3\2\2\2\u00ae\u00af\5 \21\2\u00af\u00b0\7\n\2\2\u00b0\u00b1\5 \21\2\u00b1"+
		"\u00bf\3\2\2\2\u00b2\u00b3\5 \21\2\u00b3\u00b4\7\t\2\2\u00b4\u00b5\5 "+
		"\21\2\u00b5\u00bf\3\2\2\2\u00b6\u00b7\5 \21\2\u00b7\u00b8\7\13\2\2\u00b8"+
		"\u00b9\5 \21\2\u00b9\u00bf\3\2\2\2\u00ba\u00bb\5 \21\2\u00bb\u00bc\7\f"+
		"\2\2\u00bc\u00bd\5 \21\2\u00bd\u00bf\3\2\2\2\u00be\u00aa\3\2\2\2\u00be"+
		"\u00ae\3\2\2\2\u00be\u00b2\3\2\2\2\u00be\u00b6\3\2\2\2\u00be\u00ba\3\2"+
		"\2\2\u00bf\33\3\2\2\2\u00c0\u00c1\7\30\2\2\u00c1\u00cd\7&\2\2\u00c2\u00c3"+
		"\7\30\2\2\u00c3\u00c4\7&\2\2\u00c4\u00c5\7\17\2\2\u00c5\u00cd\5 \21\2"+
		"\u00c6\u00c7\7\31\2\2\u00c7\u00cd\7&\2\2\u00c8\u00c9\7\31\2\2\u00c9\u00ca"+
		"\7&\2\2\u00ca\u00cb\7\17\2\2\u00cb\u00cd\5\30\r\2\u00cc\u00c0\3\2\2\2"+
		"\u00cc\u00c2\3\2\2\2\u00cc\u00c6\3\2\2\2\u00cc\u00c8\3\2\2\2\u00cd\35"+
		"\3\2\2\2\u00ce\u00cf\7&\2\2\u00cf\u00d0\7\17\2\2\u00d0\u00d5\5 \21\2\u00d1"+
		"\u00d2\7&\2\2\u00d2\u00d3\7\17\2\2\u00d3\u00d5\5\30\r\2\u00d4\u00ce\3"+
		"\2\2\2\u00d4\u00d1\3\2\2\2\u00d5\37\3\2\2\2\u00d6\u00d7\b\21\1\2\u00d7"+
		"\u00de\7&\2\2\u00d8\u00de\7$\2\2\u00d9\u00da\7\20\2\2\u00da\u00db\5 \21"+
		"\2\u00db\u00dc\7\21\2\2\u00dc\u00de\3\2\2\2\u00dd\u00d6\3\2\2\2\u00dd"+
		"\u00d8\3\2\2\2\u00dd\u00d9\3\2\2\2\u00de\u00f2\3\2\2\2\u00df\u00e0\f\7"+
		"\2\2\u00e0\u00e1\7\7\2\2\u00e1\u00f1\5 \21\b\u00e2\u00e3\f\6\2\2\u00e3"+
		"\u00e4\7\4\2\2\u00e4\u00f1\5 \21\7\u00e5\u00e6\f\5\2\2\u00e6\u00e7\7\5"+
		"\2\2\u00e7\u00f1\5 \21\6\u00e8\u00e9\f\4\2\2\u00e9\u00ea\7\3\2\2\u00ea"+
		"\u00f1\5 \21\5\u00eb\u00ec\f\3\2\2\u00ec\u00ed\7\6\2\2\u00ed\u00f1\5 "+
		"\21\4\u00ee\u00ef\f\b\2\2\u00ef\u00f1\7\27\2\2\u00f0\u00df\3\2\2\2\u00f0"+
		"\u00e2\3\2\2\2\u00f0\u00e5\3\2\2\2\u00f0\u00e8\3\2\2\2\u00f0\u00eb\3\2"+
		"\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2"+
		"\u00f3\3\2\2\2\u00f3!\3\2\2\2\u00f4\u00f2\3\2\2\2\27(:@GRY]bkq\u0084\u0089"+
		"\u009d\u00a5\u00a7\u00be\u00cc\u00d4\u00dd\u00f0\u00f2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}