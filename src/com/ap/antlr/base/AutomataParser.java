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
		DOT=18, COMMA=19, SEMICOLON=20, EXCLAMATION_MARK=21, VALUE_TYPE_NUMBER=22, 
		VALUE_TYPE_BOOLEAN=23, TYPE_VOID=24, RETURN=25, PRINT=26, IF=27, THEN=28, 
		FI=29, ELSE=30, WHILE=31, ELIHW=32, NUMBER=33, BOOLEAN=34, IDENTIFIER=35, 
		COMMENT=36, WS=37;
	public static final int
		RULE_program = 0, RULE_statement_block = 1, RULE_statement = 2, RULE_print_call = 3, 
		RULE_loop_structure = 4, RULE_conditional_structure = 5, RULE_function_declaration = 6, 
		RULE_parameters = 7, RULE_parameter = 8, RULE_function_call = 9, RULE_variable_declaration = 10, 
		RULE_variable_assignment = 11, RULE_expression = 12, RULE_value = 13, 
		RULE_value_type = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement_block", "statement", "print_call", "loop_structure", 
			"conditional_structure", "function_declaration", "parameters", "parameter", 
			"function_call", "variable_declaration", "variable_assignment", "expression", 
			"value", "value_type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'*'", "'/'", "'-'", "'^'", "'>'", "'<'", "'>='", "'<='", 
			"'=='", "'&&'", "'||'", "'='", "'('", "')'", "'{'", "'}'", "'.'", "','", 
			"';'", "'!'", "'number'", "'bool'", "'void'", "'return'", "'Print'", 
			"'if'", "'then'", "'fi'", "'else'", "'while'", "'elihw'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ADD", "TIMES", "DIVISION", "MINUS", "POWER", "GREATER_THAN", "LESS_THAN", 
			"GREATER_THAN_OR_EQUAL", "LESS_THAN_OR_EQUAL", "EQUAL_TO", "AND", "OR", 
			"EQUALS", "LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", "LEFT_BRACE", "RIGHT_BRACE", 
			"DOT", "COMMA", "SEMICOLON", "EXCLAMATION_MARK", "VALUE_TYPE_NUMBER", 
			"VALUE_TYPE_BOOLEAN", "TYPE_VOID", "RETURN", "PRINT", "IF", "THEN", "FI", 
			"ELSE", "WHILE", "ELIHW", "NUMBER", "BOOLEAN", "IDENTIFIER", "COMMENT", 
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
			setState(30);
			statement_block();
			setState(31);
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
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VALUE_TYPE_NUMBER) | (1L << VALUE_TYPE_BOOLEAN) | (1L << TYPE_VOID) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(33);
				statement();
				}
				}
				setState(38);
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
		public Print_callContext print_call() {
			return getRuleContext(Print_callContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AutomataParser.SEMICOLON, 0); }
		public Loop_structureContext loop_structure() {
			return getRuleContext(Loop_structureContext.class,0);
		}
		public Conditional_structureContext conditional_structure() {
			return getRuleContext(Conditional_structureContext.class,0);
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
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				print_call();
				setState(40);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				loop_structure();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				conditional_structure();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(44);
				function_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(45);
				function_call();
				setState(46);
				match(SEMICOLON);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(48);
				variable_declaration();
				setState(49);
				match(SEMICOLON);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(51);
				variable_assignment();
				setState(52);
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

	public static class Print_callContext extends ParserRuleContext {
		public Print_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_call; }
	 
		public Print_callContext() { }
		public void copyFrom(Print_callContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintCallContext extends Print_callContext {
		public TerminalNode PRINT() { return getToken(AutomataParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintCallContext(Print_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterPrintCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitPrintCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitPrintCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_callContext print_call() throws RecognitionException {
		Print_callContext _localctx = new Print_callContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_print_call);
		try {
			_localctx = new PrintCallContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(PRINT);
			setState(57);
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

	public static class Loop_structureContext extends ParserRuleContext {
		public Loop_structureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_structure; }
	 
		public Loop_structureContext() { }
		public void copyFrom(Loop_structureContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LoopStructureWhileContext extends Loop_structureContext {
		public TerminalNode WHILE() { return getToken(AutomataParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(AutomataParser.THEN, 0); }
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public TerminalNode ELIHW() { return getToken(AutomataParser.ELIHW, 0); }
		public LoopStructureWhileContext(Loop_structureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterLoopStructureWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitLoopStructureWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitLoopStructureWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_structureContext loop_structure() throws RecognitionException {
		Loop_structureContext _localctx = new Loop_structureContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_loop_structure);
		try {
			_localctx = new LoopStructureWhileContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(WHILE);
			setState(60);
			expression(0);
			setState(61);
			match(THEN);
			setState(62);
			statement_block();
			setState(63);
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

	public static class Conditional_structureContext extends ParserRuleContext {
		public Conditional_structureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_structure; }
	 
		public Conditional_structureContext() { }
		public void copyFrom(Conditional_structureContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConditionalStructureIfContext extends Conditional_structureContext {
		public List<TerminalNode> IF() { return getTokens(AutomataParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(AutomataParser.IF, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
		public ConditionalStructureIfContext(Conditional_structureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterConditionalStructureIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitConditionalStructureIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitConditionalStructureIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_structureContext conditional_structure() throws RecognitionException {
		Conditional_structureContext _localctx = new Conditional_structureContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_conditional_structure);
		int _la;
		try {
			int _alt;
			_localctx = new ConditionalStructureIfContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(IF);
			setState(66);
			expression(0);
			setState(67);
			match(THEN);
			setState(68);
			statement_block();
			setState(77);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(69);
					match(ELSE);
					setState(70);
					match(IF);
					setState(71);
					expression(0);
					setState(72);
					match(THEN);
					setState(73);
					statement_block();
					}
					} 
				}
				setState(79);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(80);
				match(ELSE);
				setState(81);
				statement_block();
				}
			}

			setState(84);
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
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(AutomataParser.RIGHT_BRACE, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
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
		public Value_typeContext value_type() {
			return getRuleContext(Value_typeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(AutomataParser.IDENTIFIER, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(AutomataParser.LEFT_PARENTHESIS, 0); }
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(AutomataParser.RIGHT_PARENTHESIS, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(AutomataParser.LEFT_BRACE, 0); }
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(AutomataParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AutomataParser.SEMICOLON, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(AutomataParser.RIGHT_BRACE, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
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
		enterRule(_localctx, 12, RULE_function_declaration);
		int _la;
		try {
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUE_TYPE_NUMBER:
			case VALUE_TYPE_BOOLEAN:
				_localctx = new FunctionDeclarationReturnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				value_type();
				setState(87);
				match(IDENTIFIER);
				setState(88);
				match(LEFT_PARENTHESIS);
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VALUE_TYPE_NUMBER || _la==VALUE_TYPE_BOOLEAN) {
					{
					setState(89);
					parameters();
					}
				}

				setState(92);
				match(RIGHT_PARENTHESIS);
				setState(93);
				match(LEFT_BRACE);
				setState(94);
				statement_block();
				setState(95);
				match(RETURN);
				setState(96);
				expression(0);
				setState(97);
				match(SEMICOLON);
				setState(98);
				match(RIGHT_BRACE);
				}
				break;
			case TYPE_VOID:
				_localctx = new FunctionDeclarationVoidContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				match(TYPE_VOID);
				setState(101);
				match(IDENTIFIER);
				setState(102);
				match(LEFT_PARENTHESIS);
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VALUE_TYPE_NUMBER || _la==VALUE_TYPE_BOOLEAN) {
					{
					setState(103);
					parameters();
					}
				}

				setState(106);
				match(RIGHT_PARENTHESIS);
				setState(107);
				match(LEFT_BRACE);
				setState(108);
				statement_block();
				setState(109);
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

	public static class ParametersContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AutomataParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AutomataParser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			parameter();
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(114);
				match(COMMA);
				setState(115);
				parameter();
				}
				}
				setState(120);
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

	public static class ParameterContext extends ParserRuleContext {
		public Value_typeContext value_type() {
			return getRuleContext(Value_typeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(AutomataParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 16, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			value_type();
			setState(122);
			match(IDENTIFIER);
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
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
	 
		public Function_callContext() { }
		public void copyFrom(Function_callContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionCallContext extends Function_callContext {
		public TerminalNode IDENTIFIER() { return getToken(AutomataParser.IDENTIFIER, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(AutomataParser.LEFT_PARENTHESIS, 0); }
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(AutomataParser.RIGHT_PARENTHESIS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AutomataParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AutomataParser.COMMA, i);
		}
		public FunctionCallContext(Function_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_function_call);
		int _la;
		try {
			_localctx = new FunctionCallContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(IDENTIFIER);
			setState(125);
			match(LEFT_PARENTHESIS);
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << LEFT_PARENTHESIS) | (1L << EXCLAMATION_MARK) | (1L << NUMBER) | (1L << BOOLEAN) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(126);
				expression(0);
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(127);
					match(COMMA);
					setState(128);
					expression(0);
					}
					}
					setState(133);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(136);
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
	public static class VariableDeclarationDefaultContext extends Variable_declarationContext {
		public Value_typeContext value_type() {
			return getRuleContext(Value_typeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(AutomataParser.IDENTIFIER, 0); }
		public VariableDeclarationDefaultContext(Variable_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterVariableDeclarationDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitVariableDeclarationDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitVariableDeclarationDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableDeclarationContext extends Variable_declarationContext {
		public Value_typeContext value_type() {
			return getRuleContext(Value_typeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(AutomataParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(AutomataParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationContext(Variable_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variable_declaration);
		try {
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new VariableDeclarationDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				value_type();
				setState(139);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new VariableDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				value_type();
				setState(142);
				match(IDENTIFIER);
				setState(143);
				match(EQUALS);
				setState(144);
				expression(0);
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
	public static class VariableAssignmentContext extends Variable_assignmentContext {
		public TerminalNode IDENTIFIER() { return getToken(AutomataParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(AutomataParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableAssignmentContext(Variable_assignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterVariableAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitVariableAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitVariableAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_assignmentContext variable_assignment() throws RecognitionException {
		Variable_assignmentContext _localctx = new Variable_assignmentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variable_assignment);
		try {
			_localctx = new VariableAssignmentContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(IDENTIFIER);
			setState(149);
			match(EQUALS);
			setState(150);
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
	public static class BooleanExpressionLessThanOrEqualContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LESS_THAN_OR_EQUAL() { return getToken(AutomataParser.LESS_THAN_OR_EQUAL, 0); }
		public BooleanExpressionLessThanOrEqualContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterBooleanExpressionLessThanOrEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitBooleanExpressionLessThanOrEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitBooleanExpressionLessThanOrEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericExpressionDivisionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DIVISION() { return getToken(AutomataParser.DIVISION, 0); }
		public NumericExpressionDivisionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterNumericExpressionDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitNumericExpressionDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitNumericExpressionDivision(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericExpressionTimesContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TIMES() { return getToken(AutomataParser.TIMES, 0); }
		public NumericExpressionTimesContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterNumericExpressionTimes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitNumericExpressionTimes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitNumericExpressionTimes(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericExpressionAddContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(AutomataParser.ADD, 0); }
		public NumericExpressionAddContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterNumericExpressionAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitNumericExpressionAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitNumericExpressionAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericExpressionMinusContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(AutomataParser.MINUS, 0); }
		public NumericExpressionMinusContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterNumericExpressionMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitNumericExpressionMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitNumericExpressionMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanExpressionNegateContext extends ExpressionContext {
		public TerminalNode EXCLAMATION_MARK() { return getToken(AutomataParser.EXCLAMATION_MARK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BooleanExpressionNegateContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterBooleanExpressionNegate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitBooleanExpressionNegate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitBooleanExpressionNegate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanExpressionGreaterThanOrEqualContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GREATER_THAN_OR_EQUAL() { return getToken(AutomataParser.GREATER_THAN_OR_EQUAL, 0); }
		public BooleanExpressionGreaterThanOrEqualContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterBooleanExpressionGreaterThanOrEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitBooleanExpressionGreaterThanOrEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitBooleanExpressionGreaterThanOrEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanExpressionOrContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(AutomataParser.OR, 0); }
		public BooleanExpressionOrContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterBooleanExpressionOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitBooleanExpressionOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitBooleanExpressionOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericExpressionPowerContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode POWER() { return getToken(AutomataParser.POWER, 0); }
		public NumericExpressionPowerContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterNumericExpressionPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitNumericExpressionPower(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitNumericExpressionPower(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericExpressionFactorialContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EXCLAMATION_MARK() { return getToken(AutomataParser.EXCLAMATION_MARK, 0); }
		public NumericExpressionFactorialContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterNumericExpressionFactorial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitNumericExpressionFactorial(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitNumericExpressionFactorial(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionValueContext extends ExpressionContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ExpressionValueContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterExpressionValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitExpressionValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitExpressionValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericExpressionNegateContext extends ExpressionContext {
		public TerminalNode MINUS() { return getToken(AutomataParser.MINUS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NumericExpressionNegateContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterNumericExpressionNegate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitNumericExpressionNegate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitNumericExpressionNegate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionParenthesesContext extends ExpressionContext {
		public TerminalNode LEFT_PARENTHESIS() { return getToken(AutomataParser.LEFT_PARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(AutomataParser.RIGHT_PARENTHESIS, 0); }
		public ExpressionParenthesesContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterExpressionParentheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitExpressionParentheses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitExpressionParentheses(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanExpressionGreaterThanContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GREATER_THAN() { return getToken(AutomataParser.GREATER_THAN, 0); }
		public BooleanExpressionGreaterThanContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterBooleanExpressionGreaterThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitBooleanExpressionGreaterThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitBooleanExpressionGreaterThan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanExpressionEqualToContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQUAL_TO() { return getToken(AutomataParser.EQUAL_TO, 0); }
		public BooleanExpressionEqualToContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterBooleanExpressionEqualTo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitBooleanExpressionEqualTo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitBooleanExpressionEqualTo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionFunctionCallContext extends ExpressionContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public ExpressionFunctionCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterExpressionFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitExpressionFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitExpressionFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanExpressionAndContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(AutomataParser.AND, 0); }
		public BooleanExpressionAndContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterBooleanExpressionAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitBooleanExpressionAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitBooleanExpressionAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanExpressionLessThanContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LESS_THAN() { return getToken(AutomataParser.LESS_THAN, 0); }
		public BooleanExpressionLessThanContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterBooleanExpressionLessThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitBooleanExpressionLessThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitBooleanExpressionLessThan(this);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new ExpressionValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(153);
				value();
				}
				break;
			case 2:
				{
				_localctx = new ExpressionFunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(154);
				function_call();
				}
				break;
			case 3:
				{
				_localctx = new ExpressionParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(155);
				match(LEFT_PARENTHESIS);
				setState(156);
				expression(0);
				setState(157);
				match(RIGHT_PARENTHESIS);
				}
				break;
			case 4:
				{
				_localctx = new NumericExpressionNegateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(159);
				match(MINUS);
				setState(160);
				expression(9);
				}
				break;
			case 5:
				{
				_localctx = new BooleanExpressionNegateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(161);
				match(EXCLAMATION_MARK);
				setState(162);
				expression(6);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(203);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new NumericExpressionAddContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(165);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(166);
						match(ADD);
						setState(167);
						expression(16);
						}
						break;
					case 2:
						{
						_localctx = new NumericExpressionMinusContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(168);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(169);
						match(MINUS);
						setState(170);
						expression(15);
						}
						break;
					case 3:
						{
						_localctx = new NumericExpressionTimesContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(171);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(172);
						match(TIMES);
						setState(173);
						expression(14);
						}
						break;
					case 4:
						{
						_localctx = new NumericExpressionDivisionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(174);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(175);
						match(DIVISION);
						setState(176);
						expression(13);
						}
						break;
					case 5:
						{
						_localctx = new NumericExpressionPowerContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(177);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(178);
						match(POWER);
						setState(179);
						expression(12);
						}
						break;
					case 6:
						{
						_localctx = new BooleanExpressionAndContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(180);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(181);
						match(AND);
						setState(182);
						expression(9);
						}
						break;
					case 7:
						{
						_localctx = new BooleanExpressionOrContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(183);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(184);
						match(OR);
						setState(185);
						expression(8);
						}
						break;
					case 8:
						{
						_localctx = new BooleanExpressionGreaterThanContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(186);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(187);
						match(GREATER_THAN);
						setState(188);
						expression(6);
						}
						break;
					case 9:
						{
						_localctx = new BooleanExpressionGreaterThanOrEqualContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(189);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(190);
						match(GREATER_THAN_OR_EQUAL);
						setState(191);
						expression(5);
						}
						break;
					case 10:
						{
						_localctx = new BooleanExpressionLessThanContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(192);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(193);
						match(LESS_THAN);
						setState(194);
						expression(4);
						}
						break;
					case 11:
						{
						_localctx = new BooleanExpressionLessThanOrEqualContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(195);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(196);
						match(LESS_THAN_OR_EQUAL);
						setState(197);
						expression(3);
						}
						break;
					case 12:
						{
						_localctx = new BooleanExpressionEqualToContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(198);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(199);
						match(EQUAL_TO);
						setState(200);
						expression(2);
						}
						break;
					case 13:
						{
						_localctx = new NumericExpressionFactorialContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(201);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(202);
						match(EXCLAMATION_MARK);
						}
						break;
					}
					} 
				}
				setState(207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
	public static class ValueVariableContext extends ValueContext {
		public TerminalNode IDENTIFIER() { return getToken(AutomataParser.IDENTIFIER, 0); }
		public ValueVariableContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterValueVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitValueVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitValueVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValueBooleanContext extends ValueContext {
		public TerminalNode BOOLEAN() { return getToken(AutomataParser.BOOLEAN, 0); }
		public ValueBooleanContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterValueBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitValueBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitValueBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValueNumberContext extends ValueContext {
		public TerminalNode NUMBER() { return getToken(AutomataParser.NUMBER, 0); }
		public ValueNumberContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterValueNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitValueNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitValueNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_value);
		try {
			setState(211);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new ValueVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				match(IDENTIFIER);
				}
				break;
			case BOOLEAN:
				_localctx = new ValueBooleanContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				match(BOOLEAN);
				}
				break;
			case NUMBER:
				_localctx = new ValueNumberContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(210);
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

	public static class Value_typeContext extends ParserRuleContext {
		public TerminalNode VALUE_TYPE_NUMBER() { return getToken(AutomataParser.VALUE_TYPE_NUMBER, 0); }
		public TerminalNode VALUE_TYPE_BOOLEAN() { return getToken(AutomataParser.VALUE_TYPE_BOOLEAN, 0); }
		public Value_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).enterValue_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataParserListener ) ((AutomataParserListener)listener).exitValue_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomataParserVisitor ) return ((AutomataParserVisitor<? extends T>)visitor).visitValue_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_typeContext value_type() throws RecognitionException {
		Value_typeContext _localctx = new Value_typeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_value_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_la = _input.LA(1);
			if ( !(_la==VALUE_TYPE_NUMBER || _la==VALUE_TYPE_BOOLEAN) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 15);
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 4);
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		case 11:
			return precpred(_ctx, 1);
		case 12:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u00da\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\3\7\3"+
		"%\n\3\f\3\16\3(\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\5\49\n\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7N\n\7\f\7\16\7Q\13\7\3\7\3\7\5\7U\n\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\5\b]\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\5\bk\n\b\3\b\3\b\3\b\3\b\3\b\5\br\n\b\3\t\3\t\3\t\7\tw\n\t"+
		"\f\t\16\tz\13\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\7\13\u0084\n\13\f"+
		"\13\16\13\u0087\13\13\5\13\u0089\n\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\5\f\u0095\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u00a6\n\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\7\16\u00ce\n\16\f\16\16\16\u00d1\13\16\3\17\3\17"+
		"\3\17\5\17\u00d6\n\17\3\20\3\20\3\20\2\3\32\21\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36\2\3\3\2\30\31\2\u00ed\2 \3\2\2\2\4&\3\2\2\2\68\3\2\2\2"+
		"\b:\3\2\2\2\n=\3\2\2\2\fC\3\2\2\2\16q\3\2\2\2\20s\3\2\2\2\22{\3\2\2\2"+
		"\24~\3\2\2\2\26\u0094\3\2\2\2\30\u0096\3\2\2\2\32\u00a5\3\2\2\2\34\u00d5"+
		"\3\2\2\2\36\u00d7\3\2\2\2 !\5\4\3\2!\"\7\2\2\3\"\3\3\2\2\2#%\5\6\4\2$"+
		"#\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'\5\3\2\2\2(&\3\2\2\2)*\5\b\5"+
		"\2*+\7\26\2\2+9\3\2\2\2,9\5\n\6\2-9\5\f\7\2.9\5\16\b\2/\60\5\24\13\2\60"+
		"\61\7\26\2\2\619\3\2\2\2\62\63\5\26\f\2\63\64\7\26\2\2\649\3\2\2\2\65"+
		"\66\5\30\r\2\66\67\7\26\2\2\679\3\2\2\28)\3\2\2\28,\3\2\2\28-\3\2\2\2"+
		"8.\3\2\2\28/\3\2\2\28\62\3\2\2\28\65\3\2\2\29\7\3\2\2\2:;\7\34\2\2;<\5"+
		"\32\16\2<\t\3\2\2\2=>\7!\2\2>?\5\32\16\2?@\7\36\2\2@A\5\4\3\2AB\7\"\2"+
		"\2B\13\3\2\2\2CD\7\35\2\2DE\5\32\16\2EF\7\36\2\2FO\5\4\3\2GH\7 \2\2HI"+
		"\7\35\2\2IJ\5\32\16\2JK\7\36\2\2KL\5\4\3\2LN\3\2\2\2MG\3\2\2\2NQ\3\2\2"+
		"\2OM\3\2\2\2OP\3\2\2\2PT\3\2\2\2QO\3\2\2\2RS\7 \2\2SU\5\4\3\2TR\3\2\2"+
		"\2TU\3\2\2\2UV\3\2\2\2VW\7\37\2\2W\r\3\2\2\2XY\5\36\20\2YZ\7%\2\2Z\\\7"+
		"\20\2\2[]\5\20\t\2\\[\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^_\7\21\2\2_`\7\22\2"+
		"\2`a\5\4\3\2ab\7\33\2\2bc\5\32\16\2cd\7\26\2\2de\7\23\2\2er\3\2\2\2fg"+
		"\7\32\2\2gh\7%\2\2hj\7\20\2\2ik\5\20\t\2ji\3\2\2\2jk\3\2\2\2kl\3\2\2\2"+
		"lm\7\21\2\2mn\7\22\2\2no\5\4\3\2op\7\23\2\2pr\3\2\2\2qX\3\2\2\2qf\3\2"+
		"\2\2r\17\3\2\2\2sx\5\22\n\2tu\7\25\2\2uw\5\22\n\2vt\3\2\2\2wz\3\2\2\2"+
		"xv\3\2\2\2xy\3\2\2\2y\21\3\2\2\2zx\3\2\2\2{|\5\36\20\2|}\7%\2\2}\23\3"+
		"\2\2\2~\177\7%\2\2\177\u0088\7\20\2\2\u0080\u0085\5\32\16\2\u0081\u0082"+
		"\7\25\2\2\u0082\u0084\5\32\16\2\u0083\u0081\3\2\2\2\u0084\u0087\3\2\2"+
		"\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085"+
		"\3\2\2\2\u0088\u0080\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u008b\7\21\2\2\u008b\25\3\2\2\2\u008c\u008d\5\36\20\2\u008d\u008e\7%"+
		"\2\2\u008e\u0095\3\2\2\2\u008f\u0090\5\36\20\2\u0090\u0091\7%\2\2\u0091"+
		"\u0092\7\17\2\2\u0092\u0093\5\32\16\2\u0093\u0095\3\2\2\2\u0094\u008c"+
		"\3\2\2\2\u0094\u008f\3\2\2\2\u0095\27\3\2\2\2\u0096\u0097\7%\2\2\u0097"+
		"\u0098\7\17\2\2\u0098\u0099\5\32\16\2\u0099\31\3\2\2\2\u009a\u009b\b\16"+
		"\1\2\u009b\u00a6\5\34\17\2\u009c\u00a6\5\24\13\2\u009d\u009e\7\20\2\2"+
		"\u009e\u009f\5\32\16\2\u009f\u00a0\7\21\2\2\u00a0\u00a6\3\2\2\2\u00a1"+
		"\u00a2\7\6\2\2\u00a2\u00a6\5\32\16\13\u00a3\u00a4\7\27\2\2\u00a4\u00a6"+
		"\5\32\16\b\u00a5\u009a\3\2\2\2\u00a5\u009c\3\2\2\2\u00a5\u009d\3\2\2\2"+
		"\u00a5\u00a1\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00cf\3\2\2\2\u00a7\u00a8"+
		"\f\21\2\2\u00a8\u00a9\7\3\2\2\u00a9\u00ce\5\32\16\22\u00aa\u00ab\f\20"+
		"\2\2\u00ab\u00ac\7\6\2\2\u00ac\u00ce\5\32\16\21\u00ad\u00ae\f\17\2\2\u00ae"+
		"\u00af\7\4\2\2\u00af\u00ce\5\32\16\20\u00b0\u00b1\f\16\2\2\u00b1\u00b2"+
		"\7\5\2\2\u00b2\u00ce\5\32\16\17\u00b3\u00b4\f\r\2\2\u00b4\u00b5\7\7\2"+
		"\2\u00b5\u00ce\5\32\16\16\u00b6\u00b7\f\n\2\2\u00b7\u00b8\7\r\2\2\u00b8"+
		"\u00ce\5\32\16\13\u00b9\u00ba\f\t\2\2\u00ba\u00bb\7\16\2\2\u00bb\u00ce"+
		"\5\32\16\n\u00bc\u00bd\f\7\2\2\u00bd\u00be\7\b\2\2\u00be\u00ce\5\32\16"+
		"\b\u00bf\u00c0\f\6\2\2\u00c0\u00c1\7\n\2\2\u00c1\u00ce\5\32\16\7\u00c2"+
		"\u00c3\f\5\2\2\u00c3\u00c4\7\t\2\2\u00c4\u00ce\5\32\16\6\u00c5\u00c6\f"+
		"\4\2\2\u00c6\u00c7\7\13\2\2\u00c7\u00ce\5\32\16\5\u00c8\u00c9\f\3\2\2"+
		"\u00c9\u00ca\7\f\2\2\u00ca\u00ce\5\32\16\4\u00cb\u00cc\f\f\2\2\u00cc\u00ce"+
		"\7\27\2\2\u00cd\u00a7\3\2\2\2\u00cd\u00aa\3\2\2\2\u00cd\u00ad\3\2\2\2"+
		"\u00cd\u00b0\3\2\2\2\u00cd\u00b3\3\2\2\2\u00cd\u00b6\3\2\2\2\u00cd\u00b9"+
		"\3\2\2\2\u00cd\u00bc\3\2\2\2\u00cd\u00bf\3\2\2\2\u00cd\u00c2\3\2\2\2\u00cd"+
		"\u00c5\3\2\2\2\u00cd\u00c8\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00d1\3\2"+
		"\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\33\3\2\2\2\u00d1\u00cf"+
		"\3\2\2\2\u00d2\u00d6\7%\2\2\u00d3\u00d6\7$\2\2\u00d4\u00d6\7#\2\2\u00d5"+
		"\u00d2\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d4\3\2\2\2\u00d6\35\3\2\2"+
		"\2\u00d7\u00d8\t\2\2\2\u00d8\37\3\2\2\2\21&8OT\\jqx\u0085\u0088\u0094"+
		"\u00a5\u00cd\u00cf\u00d5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}