// Generated from B:/Code/School/Jaar 2/Semester 4/Automata/src/com/ap/antlr/grammars\Z3Lexer.g4 by ANTLR 4.9.1
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
public class Z3Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SAT=1, MODEL=2, LPAREN=3, RPAREN=4, EQUALS=5, GREATER_THAN=6, LESS_THAN=7, 
		GREATER_THAN_OR_EQUAL=8, LESS_THAN_OR_EQUAL=9, EXLAMATION_MARK=10, DOT=11, 
		MINUS=12, ADD=13, AND=14, OR=15, NOT=16, IF_ELSE=17, FUNC=18, LET=19, 
		INT=20, STRING=21, BOOL=22, IDENTIFIER=23, STRING_LITERAL=24, NUMBER=25, 
		WS=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SAT", "MODEL", "LPAREN", "RPAREN", "EQUALS", "GREATER_THAN", "LESS_THAN", 
			"GREATER_THAN_OR_EQUAL", "LESS_THAN_OR_EQUAL", "EXLAMATION_MARK", "DOT", 
			"MINUS", "ADD", "AND", "OR", "NOT", "IF_ELSE", "FUNC", "LET", "INT", 
			"STRING", "BOOL", "IDENTIFIER", "STRING_LITERAL", "NUMBER", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'sat'", "'model'", "'('", "')'", "'='", "'>'", "'<'", "'>='", 
			"'<='", "'!'", "'.'", "'-'", "'+'", "'and'", "'or'", "'not'", "'ite'", 
			"'define-fun'", "'let'", "'Int'", "'String'", "'Bool'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SAT", "MODEL", "LPAREN", "RPAREN", "EQUALS", "GREATER_THAN", "LESS_THAN", 
			"GREATER_THAN_OR_EQUAL", "LESS_THAN_OR_EQUAL", "EXLAMATION_MARK", "DOT", 
			"MINUS", "ADD", "AND", "OR", "NOT", "IF_ELSE", "FUNC", "LET", "INT", 
			"STRING", "BOOL", "IDENTIFIER", "STRING_LITERAL", "NUMBER", "WS"
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


	public Z3Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Z3Lexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u00a9\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\7\30\u008a\n\30"+
		"\f\30\16\30\u008d\13\30\3\30\7\30\u0090\n\30\f\30\16\30\u0093\13\30\3"+
		"\31\3\31\7\31\u0097\n\31\f\31\16\31\u009a\13\31\3\31\3\31\3\32\6\32\u009f"+
		"\n\32\r\32\16\32\u00a0\3\33\6\33\u00a4\n\33\r\33\16\33\u00a5\3\33\3\33"+
		"\2\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\3\2\b"+
		"\5\2C\\aac|\3\2##\6\2\62;C\\aac|\3\2$$\3\2\62;\5\2\13\f\17\17\"\"\2\u00ad"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3\67\3\2\2\2\5;\3\2\2\2\7A\3"+
		"\2\2\2\tC\3\2\2\2\13E\3\2\2\2\rG\3\2\2\2\17I\3\2\2\2\21K\3\2\2\2\23N\3"+
		"\2\2\2\25Q\3\2\2\2\27S\3\2\2\2\31U\3\2\2\2\33W\3\2\2\2\35Y\3\2\2\2\37"+
		"]\3\2\2\2!`\3\2\2\2#d\3\2\2\2%h\3\2\2\2\'s\3\2\2\2)w\3\2\2\2+{\3\2\2\2"+
		"-\u0082\3\2\2\2/\u0087\3\2\2\2\61\u0094\3\2\2\2\63\u009e\3\2\2\2\65\u00a3"+
		"\3\2\2\2\678\7u\2\289\7c\2\29:\7v\2\2:\4\3\2\2\2;<\7o\2\2<=\7q\2\2=>\7"+
		"f\2\2>?\7g\2\2?@\7n\2\2@\6\3\2\2\2AB\7*\2\2B\b\3\2\2\2CD\7+\2\2D\n\3\2"+
		"\2\2EF\7?\2\2F\f\3\2\2\2GH\7@\2\2H\16\3\2\2\2IJ\7>\2\2J\20\3\2\2\2KL\7"+
		"@\2\2LM\7?\2\2M\22\3\2\2\2NO\7>\2\2OP\7?\2\2P\24\3\2\2\2QR\7#\2\2R\26"+
		"\3\2\2\2ST\7\60\2\2T\30\3\2\2\2UV\7/\2\2V\32\3\2\2\2WX\7-\2\2X\34\3\2"+
		"\2\2YZ\7c\2\2Z[\7p\2\2[\\\7f\2\2\\\36\3\2\2\2]^\7q\2\2^_\7t\2\2_ \3\2"+
		"\2\2`a\7p\2\2ab\7q\2\2bc\7v\2\2c\"\3\2\2\2de\7k\2\2ef\7v\2\2fg\7g\2\2"+
		"g$\3\2\2\2hi\7f\2\2ij\7g\2\2jk\7h\2\2kl\7k\2\2lm\7p\2\2mn\7g\2\2no\7/"+
		"\2\2op\7h\2\2pq\7w\2\2qr\7p\2\2r&\3\2\2\2st\7n\2\2tu\7g\2\2uv\7v\2\2v"+
		"(\3\2\2\2wx\7K\2\2xy\7p\2\2yz\7v\2\2z*\3\2\2\2{|\7U\2\2|}\7v\2\2}~\7t"+
		"\2\2~\177\7k\2\2\177\u0080\7p\2\2\u0080\u0081\7i\2\2\u0081,\3\2\2\2\u0082"+
		"\u0083\7D\2\2\u0083\u0084\7q\2\2\u0084\u0085\7q\2\2\u0085\u0086\7n\2\2"+
		"\u0086.\3\2\2\2\u0087\u008b\t\2\2\2\u0088\u008a\t\3\2\2\u0089\u0088\3"+
		"\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u0091\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u0090\t\4\2\2\u008f\u008e\3\2"+
		"\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\60\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0098\7$\2\2\u0095\u0097\n\5\2\2"+
		"\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099"+
		"\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009c\7$\2\2\u009c"+
		"\62\3\2\2\2\u009d\u009f\t\6\2\2\u009e\u009d\3\2\2\2\u009f\u00a0\3\2\2"+
		"\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\64\3\2\2\2\u00a2\u00a4"+
		"\t\7\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\b\33\2\2\u00a8\66\3\2\2"+
		"\2\b\2\u008b\u0091\u0098\u00a0\u00a5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}