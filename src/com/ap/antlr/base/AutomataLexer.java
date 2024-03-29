// Generated from C:/School/Antlr/src/com/ap/antlr/grammars\AutomataLexer.g4 by ANTLR 4.9.1
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
		DOT=18, COMMA=19, SEMICOLON=20, EXCLAMATION_MARK=21, VALUE_TYPE_NUMBER=22, 
		VALUE_TYPE_BOOLEAN=23, TYPE_VOID=24, RETURN=25, PRINT=26, IF=27, THEN=28, 
		FI=29, ELSE=30, WHILE=31, ELIHW=32, NUMBER=33, BOOLEAN=34, IDENTIFIER=35, 
		COMMENT=36, WS=37;
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
			"DOT", "COMMA", "SEMICOLON", "EXCLAMATION_MARK", "VALUE_TYPE_NUMBER", 
			"VALUE_TYPE_BOOLEAN", "TYPE_VOID", "RETURN", "PRINT", "IF", "THEN", "FI", 
			"ELSE", "WHILE", "ELIHW", "NUMBER", "BOOLEAN", "IDENTIFIER", "COMMENT", 
			"WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u00ec\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		" \3 \3!\3!\3!\3!\3!\3!\3\"\5\"\u00b8\n\"\3\"\6\"\u00bb\n\"\r\"\16\"\u00bc"+
		"\3\"\3\"\6\"\u00c1\n\"\r\"\16\"\u00c2\5\"\u00c5\n\"\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\5#\u00d0\n#\3$\3$\7$\u00d4\n$\f$\16$\u00d7\13$\3%\3%\3%\3%\6"+
		"%\u00dd\n%\r%\16%\u00de\3%\5%\u00e2\n%\3%\3%\3&\6&\u00e7\n&\r&\16&\u00e8"+
		"\3&\3&\3\u00de\2\'\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'\3\2\7\3\2\62;\5\2C\\aac|\6\2\62"+
		";C\\aac|\3\3\f\f\5\2\13\f\17\17\"\"\2\u00f3\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\3"+
		"M\3\2\2\2\5O\3\2\2\2\7Q\3\2\2\2\tS\3\2\2\2\13U\3\2\2\2\rW\3\2\2\2\17Y"+
		"\3\2\2\2\21[\3\2\2\2\23^\3\2\2\2\25a\3\2\2\2\27d\3\2\2\2\31g\3\2\2\2\33"+
		"j\3\2\2\2\35l\3\2\2\2\37n\3\2\2\2!p\3\2\2\2#r\3\2\2\2%t\3\2\2\2\'v\3\2"+
		"\2\2)x\3\2\2\2+z\3\2\2\2-|\3\2\2\2/\u0083\3\2\2\2\61\u0088\3\2\2\2\63"+
		"\u008d\3\2\2\2\65\u0094\3\2\2\2\67\u009a\3\2\2\29\u009d\3\2\2\2;\u00a2"+
		"\3\2\2\2=\u00a5\3\2\2\2?\u00aa\3\2\2\2A\u00b0\3\2\2\2C\u00b7\3\2\2\2E"+
		"\u00cf\3\2\2\2G\u00d1\3\2\2\2I\u00d8\3\2\2\2K\u00e6\3\2\2\2MN\7-\2\2N"+
		"\4\3\2\2\2OP\7,\2\2P\6\3\2\2\2QR\7\61\2\2R\b\3\2\2\2ST\7/\2\2T\n\3\2\2"+
		"\2UV\7`\2\2V\f\3\2\2\2WX\7@\2\2X\16\3\2\2\2YZ\7>\2\2Z\20\3\2\2\2[\\\7"+
		"@\2\2\\]\7?\2\2]\22\3\2\2\2^_\7>\2\2_`\7?\2\2`\24\3\2\2\2ab\7?\2\2bc\7"+
		"?\2\2c\26\3\2\2\2de\7(\2\2ef\7(\2\2f\30\3\2\2\2gh\7~\2\2hi\7~\2\2i\32"+
		"\3\2\2\2jk\7?\2\2k\34\3\2\2\2lm\7*\2\2m\36\3\2\2\2no\7+\2\2o \3\2\2\2"+
		"pq\7}\2\2q\"\3\2\2\2rs\7\177\2\2s$\3\2\2\2tu\7\60\2\2u&\3\2\2\2vw\7.\2"+
		"\2w(\3\2\2\2xy\7=\2\2y*\3\2\2\2z{\7#\2\2{,\3\2\2\2|}\7p\2\2}~\7w\2\2~"+
		"\177\7o\2\2\177\u0080\7d\2\2\u0080\u0081\7g\2\2\u0081\u0082\7t\2\2\u0082"+
		".\3\2\2\2\u0083\u0084\7d\2\2\u0084\u0085\7q\2\2\u0085\u0086\7q\2\2\u0086"+
		"\u0087\7n\2\2\u0087\60\3\2\2\2\u0088\u0089\7x\2\2\u0089\u008a\7q\2\2\u008a"+
		"\u008b\7k\2\2\u008b\u008c\7f\2\2\u008c\62\3\2\2\2\u008d\u008e\7t\2\2\u008e"+
		"\u008f\7g\2\2\u008f\u0090\7v\2\2\u0090\u0091\7w\2\2\u0091\u0092\7t\2\2"+
		"\u0092\u0093\7p\2\2\u0093\64\3\2\2\2\u0094\u0095\7R\2\2\u0095\u0096\7"+
		"t\2\2\u0096\u0097\7k\2\2\u0097\u0098\7p\2\2\u0098\u0099\7v\2\2\u0099\66"+
		"\3\2\2\2\u009a\u009b\7k\2\2\u009b\u009c\7h\2\2\u009c8\3\2\2\2\u009d\u009e"+
		"\7v\2\2\u009e\u009f\7j\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1\7p\2\2\u00a1"+
		":\3\2\2\2\u00a2\u00a3\7h\2\2\u00a3\u00a4\7k\2\2\u00a4<\3\2\2\2\u00a5\u00a6"+
		"\7g\2\2\u00a6\u00a7\7n\2\2\u00a7\u00a8\7u\2\2\u00a8\u00a9\7g\2\2\u00a9"+
		">\3\2\2\2\u00aa\u00ab\7y\2\2\u00ab\u00ac\7j\2\2\u00ac\u00ad\7k\2\2\u00ad"+
		"\u00ae\7n\2\2\u00ae\u00af\7g\2\2\u00af@\3\2\2\2\u00b0\u00b1\7g\2\2\u00b1"+
		"\u00b2\7n\2\2\u00b2\u00b3\7k\2\2\u00b3\u00b4\7j\2\2\u00b4\u00b5\7y\2\2"+
		"\u00b5B\3\2\2\2\u00b6\u00b8\5\t\5\2\u00b7\u00b6\3\2\2\2\u00b7\u00b8\3"+
		"\2\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00bb\t\2\2\2\u00ba\u00b9\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00c4\3\2"+
		"\2\2\u00be\u00c0\5%\23\2\u00bf\u00c1\t\2\2\2\u00c0\u00bf\3\2\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2"+
		"\2\2\u00c4\u00be\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5D\3\2\2\2\u00c6\u00c7"+
		"\7v\2\2\u00c7\u00c8\7t\2\2\u00c8\u00c9\7w\2\2\u00c9\u00d0\7g\2\2\u00ca"+
		"\u00cb\7h\2\2\u00cb\u00cc\7c\2\2\u00cc\u00cd\7n\2\2\u00cd\u00ce\7u\2\2"+
		"\u00ce\u00d0\7g\2\2\u00cf\u00c6\3\2\2\2\u00cf\u00ca\3\2\2\2\u00d0F\3\2"+
		"\2\2\u00d1\u00d5\t\3\2\2\u00d2\u00d4\t\4\2\2\u00d3\u00d2\3\2\2\2\u00d4"+
		"\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6H\3\2\2\2"+
		"\u00d7\u00d5\3\2\2\2\u00d8\u00d9\7\61\2\2\u00d9\u00da\7\61\2\2\u00da\u00dc"+
		"\3\2\2\2\u00db\u00dd\13\2\2\2\u00dc\u00db\3\2\2\2\u00dd\u00de\3\2\2\2"+
		"\u00de\u00df\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0\u00e2"+
		"\t\5\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\b%\2\2\u00e4"+
		"J\3\2\2\2\u00e5\u00e7\t\6\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2"+
		"\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb"+
		"\b&\2\2\u00ebL\3\2\2\2\f\2\u00b7\u00bc\u00c2\u00c4\u00cf\u00d5\u00de\u00e1"+
		"\u00e8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}