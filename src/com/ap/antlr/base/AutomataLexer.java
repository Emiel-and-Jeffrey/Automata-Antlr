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
		ADD=1, TIMES=2, DIVISION=3, MINUS=4, POWER=5, GREATER_THAN=6, LESS_THAN=7, 
		GREATER_THAN_OR_EQUAL=8, LESS_THAN_OR_EQUAL=9, EQUAL_TO=10, AND=11, OR=12, 
		EQUALS=13, LEFT_PARENTHESIS=14, RIGHT_PARENTHESIS=15, LEFT_BRACE=16, RIGHT_BRACE=17, 
		DOT=18, COMMA=19, SEMICOLON=20, EXLAMATION_MARK=21, VARIABLE_TYPE_NUMBER=22, 
		VARIABLE_TYPE_BOOLEAN=23, VARIABLE_TYPE_STRING=24, TYPE_VOID=25, RETURN=26, 
		PRINT=27, IF=28, THEN=29, FI=30, ELSE=31, WHILE=32, ELIHW=33, NUMBER=34, 
		BOOLEAN=35, IDENTIFIER=36, WS=37;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ADD", "TIMES", "DIVISION", "MINUS", "POWER", "GREATER_THAN", "LESS_THAN", 
			"GREATER_THAN_OR_EQUAL", "LESS_THAN_OR_EQUAL", "EQUAL_TO", "AND", "OR", 
			"EQUALS", "LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", "LEFT_BRACE", "RIGHT_BRACE", 
			"DOT", "COMMA", "SEMICOLON", "EXLAMATION_MARK", "VARIABLE_TYPE_NUMBER", 
			"VARIABLE_TYPE_BOOLEAN", "VARIABLE_TYPE_STRING", "TYPE_VOID", "RETURN", 
			"PRINT", "IF", "THEN", "FI", "ELSE", "WHILE", "ELIHW", "NUMBER", "BOOLEAN", 
			"IDENTIFIER", "WS"
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
			"IDENTIFIER", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u00e6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3"+
		" \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\5#\u00bf\n#\3"+
		"#\6#\u00c2\n#\r#\16#\u00c3\3#\3#\6#\u00c8\n#\r#\16#\u00c9\5#\u00cc\n#"+
		"\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u00d7\n$\3%\3%\7%\u00db\n%\f%\16%\u00de"+
		"\13%\3&\6&\u00e1\n&\r&\16&\u00e2\3&\3&\2\2\'\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'\3\2\6\3"+
		"\2\62;\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\2\u00ec\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2K\3\2\2\2\3M\3\2\2\2\5O\3\2\2\2\7Q\3\2\2\2\tS\3\2\2\2\13U\3\2\2\2"+
		"\rW\3\2\2\2\17Y\3\2\2\2\21[\3\2\2\2\23^\3\2\2\2\25a\3\2\2\2\27d\3\2\2"+
		"\2\31g\3\2\2\2\33j\3\2\2\2\35l\3\2\2\2\37n\3\2\2\2!p\3\2\2\2#r\3\2\2\2"+
		"%t\3\2\2\2\'v\3\2\2\2)x\3\2\2\2+z\3\2\2\2-|\3\2\2\2/\u0083\3\2\2\2\61"+
		"\u0088\3\2\2\2\63\u008f\3\2\2\2\65\u0094\3\2\2\2\67\u009b\3\2\2\29\u00a1"+
		"\3\2\2\2;\u00a4\3\2\2\2=\u00a9\3\2\2\2?\u00ac\3\2\2\2A\u00b1\3\2\2\2C"+
		"\u00b7\3\2\2\2E\u00be\3\2\2\2G\u00d6\3\2\2\2I\u00d8\3\2\2\2K\u00e0\3\2"+
		"\2\2MN\7-\2\2N\4\3\2\2\2OP\7,\2\2P\6\3\2\2\2QR\7\61\2\2R\b\3\2\2\2ST\7"+
		"/\2\2T\n\3\2\2\2UV\7`\2\2V\f\3\2\2\2WX\7@\2\2X\16\3\2\2\2YZ\7>\2\2Z\20"+
		"\3\2\2\2[\\\7@\2\2\\]\7?\2\2]\22\3\2\2\2^_\7>\2\2_`\7?\2\2`\24\3\2\2\2"+
		"ab\7?\2\2bc\7?\2\2c\26\3\2\2\2de\7(\2\2ef\7(\2\2f\30\3\2\2\2gh\7~\2\2"+
		"hi\7~\2\2i\32\3\2\2\2jk\7?\2\2k\34\3\2\2\2lm\7*\2\2m\36\3\2\2\2no\7+\2"+
		"\2o \3\2\2\2pq\7}\2\2q\"\3\2\2\2rs\7\177\2\2s$\3\2\2\2tu\7\60\2\2u&\3"+
		"\2\2\2vw\7.\2\2w(\3\2\2\2xy\7=\2\2y*\3\2\2\2z{\7#\2\2{,\3\2\2\2|}\7p\2"+
		"\2}~\7w\2\2~\177\7o\2\2\177\u0080\7d\2\2\u0080\u0081\7g\2\2\u0081\u0082"+
		"\7t\2\2\u0082.\3\2\2\2\u0083\u0084\7d\2\2\u0084\u0085\7q\2\2\u0085\u0086"+
		"\7q\2\2\u0086\u0087\7n\2\2\u0087\60\3\2\2\2\u0088\u0089\7u\2\2\u0089\u008a"+
		"\7v\2\2\u008a\u008b\7t\2\2\u008b\u008c\7k\2\2\u008c\u008d\7p\2\2\u008d"+
		"\u008e\7i\2\2\u008e\62\3\2\2\2\u008f\u0090\7x\2\2\u0090\u0091\7q\2\2\u0091"+
		"\u0092\7k\2\2\u0092\u0093\7f\2\2\u0093\64\3\2\2\2\u0094\u0095\7t\2\2\u0095"+
		"\u0096\7g\2\2\u0096\u0097\7v\2\2\u0097\u0098\7w\2\2\u0098\u0099\7t\2\2"+
		"\u0099\u009a\7p\2\2\u009a\66\3\2\2\2\u009b\u009c\7R\2\2\u009c\u009d\7"+
		"t\2\2\u009d\u009e\7k\2\2\u009e\u009f\7p\2\2\u009f\u00a0\7v\2\2\u00a08"+
		"\3\2\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3\7h\2\2\u00a3:\3\2\2\2\u00a4\u00a5"+
		"\7v\2\2\u00a5\u00a6\7j\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8\7p\2\2\u00a8"+
		"<\3\2\2\2\u00a9\u00aa\7h\2\2\u00aa\u00ab\7k\2\2\u00ab>\3\2\2\2\u00ac\u00ad"+
		"\7g\2\2\u00ad\u00ae\7n\2\2\u00ae\u00af\7u\2\2\u00af\u00b0\7g\2\2\u00b0"+
		"@\3\2\2\2\u00b1\u00b2\7y\2\2\u00b2\u00b3\7j\2\2\u00b3\u00b4\7k\2\2\u00b4"+
		"\u00b5\7n\2\2\u00b5\u00b6\7g\2\2\u00b6B\3\2\2\2\u00b7\u00b8\7g\2\2\u00b8"+
		"\u00b9\7n\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb\7j\2\2\u00bb\u00bc\7y\2\2"+
		"\u00bcD\3\2\2\2\u00bd\u00bf\5\t\5\2\u00be\u00bd\3\2\2\2\u00be\u00bf\3"+
		"\2\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00c2\t\2\2\2\u00c1\u00c0\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00cb\3\2"+
		"\2\2\u00c5\u00c7\5%\23\2\u00c6\u00c8\t\2\2\2\u00c7\u00c6\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2"+
		"\2\2\u00cb\u00c5\3\2\2\2\u00cb\u00cc\3\2\2\2\u00ccF\3\2\2\2\u00cd\u00ce"+
		"\7v\2\2\u00ce\u00cf\7t\2\2\u00cf\u00d0\7w\2\2\u00d0\u00d7\7g\2\2\u00d1"+
		"\u00d2\7h\2\2\u00d2\u00d3\7c\2\2\u00d3\u00d4\7n\2\2\u00d4\u00d5\7u\2\2"+
		"\u00d5\u00d7\7g\2\2\u00d6\u00cd\3\2\2\2\u00d6\u00d1\3\2\2\2\u00d7H\3\2"+
		"\2\2\u00d8\u00dc\t\3\2\2\u00d9\u00db\t\4\2\2\u00da\u00d9\3\2\2\2\u00db"+
		"\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00ddJ\3\2\2\2"+
		"\u00de\u00dc\3\2\2\2\u00df\u00e1\t\5\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e2"+
		"\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u00e5\b&\2\2\u00e5L\3\2\2\2\n\2\u00be\u00c3\u00c9\u00cb\u00d6\u00dc\u00e2"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}