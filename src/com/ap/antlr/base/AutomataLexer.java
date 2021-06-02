// Generated from B:/Code/School/Jaar 2/Semester 4/Automata/src/com/ap/antlr/grammars\AutomataLexer.g4 by ANTLR 4.9.1
package com.ap.antlr.base;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AutomataLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ADD=1, TIMES=2, DIVISION=3, MINUS=4, FACTORIAL=5, POWER=6, GREATER_THAN=7, 
		LESS_THAN=8, GREATER_THAN_OR_EQUAL=9, LESS_THAN_OR_EQUAL=10, AND=11, OR=12, 
		NEGATION=13, EQUALS=14, LEFT_PARENTHESIS=15, RIGHT_PARENTHESIS=16, DOT=17, 
		SEMICOLON=18, VARIABLE_TYPE_NUMBER=19, VARIABLE_TYPE_BOOLEAN=20, VARIABLE_TYPE_STRING=21, 
		PRINT=22, IF=23, THEN=24, FI=25, ELSE=26, WHILE=27, ELIHW=28, NUMBER=29, 
		IDENTIFIER=30, WS=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ADD", "TIMES", "DIVISION", "MINUS", "FACTORIAL", "POWER", "GREATER_THAN", 
			"LESS_THAN", "GREATER_THAN_OR_EQUAL", "LESS_THAN_OR_EQUAL", "AND", "OR", 
			"NEGATION", "EQUALS", "LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", "DOT", 
			"SEMICOLON", "VARIABLE_TYPE_NUMBER", "VARIABLE_TYPE_BOOLEAN", "VARIABLE_TYPE_STRING", 
			"PRINT", "IF", "THEN", "FI", "ELSE", "WHILE", "ELIHW", "NUMBER", "IDENTIFIER", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'*'", "'/'", "'-'", null, "'^'", "'>'", "'<'", "'>='", 
			"'<='", "'&&'", "'||'", null, "'='", "'('", "')'", "'.'", "';'", "'number'", 
			"'bool'", "'string'", "'Print'", "'if'", "'then'", "'fi'", "'else'", 
			"'while'", "'elihw'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ADD", "TIMES", "DIVISION", "MINUS", "FACTORIAL", "POWER", "GREATER_THAN", 
			"LESS_THAN", "GREATER_THAN_OR_EQUAL", "LESS_THAN_OR_EQUAL", "AND", "OR", 
			"NEGATION", "EQUALS", "LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", "DOT", 
			"SEMICOLON", "VARIABLE_TYPE_NUMBER", "VARIABLE_TYPE_BOOLEAN", "VARIABLE_TYPE_STRING", 
			"PRINT", "IF", "THEN", "FI", "ELSE", "WHILE", "ELIHW", "NUMBER", "IDENTIFIER", 
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


	public AutomataLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AutomataLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u00bc\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\36\5\36\u00a0\n\36\3\36\6\36\u00a3\n\36\r\36\16\36\u00a4"+
		"\3\36\3\36\6\36\u00a9\n\36\r\36\16\36\u00aa\5\36\u00ad\n\36\3\37\3\37"+
		"\7\37\u00b1\n\37\f\37\16\37\u00b4\13\37\3 \6 \u00b7\n \r \16 \u00b8\3"+
		" \3 \2\2!\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!\3\2\6\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17"+
		"\"\"\2\u00c1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3A\3\2\2\2\5C\3\2\2\2\7E\3\2\2"+
		"\2\tG\3\2\2\2\13I\3\2\2\2\rK\3\2\2\2\17M\3\2\2\2\21O\3\2\2\2\23Q\3\2\2"+
		"\2\25T\3\2\2\2\27W\3\2\2\2\31Z\3\2\2\2\33]\3\2\2\2\35_\3\2\2\2\37a\3\2"+
		"\2\2!c\3\2\2\2#e\3\2\2\2%g\3\2\2\2\'i\3\2\2\2)p\3\2\2\2+u\3\2\2\2-|\3"+
		"\2\2\2/\u0082\3\2\2\2\61\u0085\3\2\2\2\63\u008a\3\2\2\2\65\u008d\3\2\2"+
		"\2\67\u0092\3\2\2\29\u0098\3\2\2\2;\u009f\3\2\2\2=\u00ae\3\2\2\2?\u00b6"+
		"\3\2\2\2AB\7-\2\2B\4\3\2\2\2CD\7,\2\2D\6\3\2\2\2EF\7\61\2\2F\b\3\2\2\2"+
		"GH\7/\2\2H\n\3\2\2\2IJ\7#\2\2J\f\3\2\2\2KL\7`\2\2L\16\3\2\2\2MN\7@\2\2"+
		"N\20\3\2\2\2OP\7>\2\2P\22\3\2\2\2QR\7@\2\2RS\7?\2\2S\24\3\2\2\2TU\7>\2"+
		"\2UV\7?\2\2V\26\3\2\2\2WX\7(\2\2XY\7(\2\2Y\30\3\2\2\2Z[\7~\2\2[\\\7~\2"+
		"\2\\\32\3\2\2\2]^\7#\2\2^\34\3\2\2\2_`\7?\2\2`\36\3\2\2\2ab\7*\2\2b \3"+
		"\2\2\2cd\7+\2\2d\"\3\2\2\2ef\7\60\2\2f$\3\2\2\2gh\7=\2\2h&\3\2\2\2ij\7"+
		"p\2\2jk\7w\2\2kl\7o\2\2lm\7d\2\2mn\7g\2\2no\7t\2\2o(\3\2\2\2pq\7d\2\2"+
		"qr\7q\2\2rs\7q\2\2st\7n\2\2t*\3\2\2\2uv\7u\2\2vw\7v\2\2wx\7t\2\2xy\7k"+
		"\2\2yz\7p\2\2z{\7i\2\2{,\3\2\2\2|}\7R\2\2}~\7t\2\2~\177\7k\2\2\177\u0080"+
		"\7p\2\2\u0080\u0081\7v\2\2\u0081.\3\2\2\2\u0082\u0083\7k\2\2\u0083\u0084"+
		"\7h\2\2\u0084\60\3\2\2\2\u0085\u0086\7v\2\2\u0086\u0087\7j\2\2\u0087\u0088"+
		"\7g\2\2\u0088\u0089\7p\2\2\u0089\62\3\2\2\2\u008a\u008b\7h\2\2\u008b\u008c"+
		"\7k\2\2\u008c\64\3\2\2\2\u008d\u008e\7g\2\2\u008e\u008f\7n\2\2\u008f\u0090"+
		"\7u\2\2\u0090\u0091\7g\2\2\u0091\66\3\2\2\2\u0092\u0093\7y\2\2\u0093\u0094"+
		"\7j\2\2\u0094\u0095\7k\2\2\u0095\u0096\7n\2\2\u0096\u0097\7g\2\2\u0097"+
		"8\3\2\2\2\u0098\u0099\7g\2\2\u0099\u009a\7n\2\2\u009a\u009b\7k\2\2\u009b"+
		"\u009c\7j\2\2\u009c\u009d\7y\2\2\u009d:\3\2\2\2\u009e\u00a0\5\t\5\2\u009f"+
		"\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u00a3\t\2"+
		"\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4"+
		"\u00a5\3\2\2\2\u00a5\u00ac\3\2\2\2\u00a6\u00a8\5#\22\2\u00a7\u00a9\t\2"+
		"\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00a6\3\2\2\2\u00ac\u00ad\3\2"+
		"\2\2\u00ad<\3\2\2\2\u00ae\u00b2\t\3\2\2\u00af\u00b1\t\4\2\2\u00b0\u00af"+
		"\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		">\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b7\t\5\2\2\u00b6\u00b5\3\2\2\2"+
		"\u00b7\u00b8\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba"+
		"\3\2\2\2\u00ba\u00bb\b \2\2\u00bb@\3\2\2\2\t\2\u009f\u00a4\u00aa\u00ac"+
		"\u00b2\u00b8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}