// Generated from C:/Users/emiel/Desktop/semester 4/automata/Automata-Antlr/src/com/ap/antlr/grammars\RuleSetGrammar.g4 by ANTLR 4.9.1
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
public class RuleSetGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, THEN=2, AND=3, OR=4, TRUE=5, FALSE=6, MULT=7, DIV=8, PLUS=9, MIN=10, 
		GT=11, LT=12, GE=13, LE=14, EQ=15, LPAREN=16, RPAREN=17, SEMI=18, DECIMAL=19, 
		IDENTIFIER=20, COMMENT=21, WS=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IF", "THEN", "AND", "OR", "TRUE", "FALSE", "MULT", "DIV", "PLUS", "MIN", 
			"GT", "LT", "GE", "LE", "EQ", "LPAREN", "RPAREN", "SEMI", "DECIMAL", 
			"IDENTIFIER", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'then'", "'and'", "'or'", "'true'", "'false'", "'*'", 
			"'/'", "'+'", "'-'", "'>'", "'<'", "'>='", "'<='", "'='", "'('", "')'", 
			"';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "THEN", "AND", "OR", "TRUE", "FALSE", "MULT", "DIV", "PLUS", 
			"MIN", "GT", "LT", "GE", "LE", "EQ", "LPAREN", "RPAREN", "SEMI", "DECIMAL", 
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


	public RuleSetGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RuleSetGrammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u008e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\24\5\24e\n\24\3\24\6\24h\n\24\r\24\16\24i\3\24\3\24\6\24n\n\24\r\24"+
		"\16\24o\5\24r\n\24\3\25\3\25\7\25v\n\25\f\25\16\25y\13\25\3\26\3\26\3"+
		"\26\3\26\6\26\177\n\26\r\26\16\26\u0080\3\26\5\26\u0084\n\26\3\26\3\26"+
		"\3\27\6\27\u0089\n\27\r\27\16\27\u008a\3\27\3\27\3\u0080\2\30\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30\3\2\7\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\3\3"+
		"\f\f\5\2\13\f\17\17\"\"\2\u0094\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\62\3\2\2\2\7\67\3\2\2\2\t;\3\2\2\2"+
		"\13>\3\2\2\2\rC\3\2\2\2\17I\3\2\2\2\21K\3\2\2\2\23M\3\2\2\2\25O\3\2\2"+
		"\2\27Q\3\2\2\2\31S\3\2\2\2\33U\3\2\2\2\35X\3\2\2\2\37[\3\2\2\2!]\3\2\2"+
		"\2#_\3\2\2\2%a\3\2\2\2\'d\3\2\2\2)s\3\2\2\2+z\3\2\2\2-\u0088\3\2\2\2/"+
		"\60\7k\2\2\60\61\7h\2\2\61\4\3\2\2\2\62\63\7v\2\2\63\64\7j\2\2\64\65\7"+
		"g\2\2\65\66\7p\2\2\66\6\3\2\2\2\678\7c\2\289\7p\2\29:\7f\2\2:\b\3\2\2"+
		"\2;<\7q\2\2<=\7t\2\2=\n\3\2\2\2>?\7v\2\2?@\7t\2\2@A\7w\2\2AB\7g\2\2B\f"+
		"\3\2\2\2CD\7h\2\2DE\7c\2\2EF\7n\2\2FG\7u\2\2GH\7g\2\2H\16\3\2\2\2IJ\7"+
		",\2\2J\20\3\2\2\2KL\7\61\2\2L\22\3\2\2\2MN\7-\2\2N\24\3\2\2\2OP\7/\2\2"+
		"P\26\3\2\2\2QR\7@\2\2R\30\3\2\2\2ST\7>\2\2T\32\3\2\2\2UV\7@\2\2VW\7?\2"+
		"\2W\34\3\2\2\2XY\7>\2\2YZ\7?\2\2Z\36\3\2\2\2[\\\7?\2\2\\ \3\2\2\2]^\7"+
		"*\2\2^\"\3\2\2\2_`\7+\2\2`$\3\2\2\2ab\7=\2\2b&\3\2\2\2ce\7/\2\2dc\3\2"+
		"\2\2de\3\2\2\2eg\3\2\2\2fh\t\2\2\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2"+
		"\2\2jq\3\2\2\2km\7\60\2\2ln\t\2\2\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3"+
		"\2\2\2pr\3\2\2\2qk\3\2\2\2qr\3\2\2\2r(\3\2\2\2sw\t\3\2\2tv\t\4\2\2ut\3"+
		"\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x*\3\2\2\2yw\3\2\2\2z{\7\61\2\2{|"+
		"\7\61\2\2|~\3\2\2\2}\177\13\2\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0080~\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0084\t\5\2\2\u0083"+
		"\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\b\26\2\2\u0086,\3\2\2\2"+
		"\u0087\u0089\t\6\2\2\u0088\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088"+
		"\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\b\27\2\2"+
		"\u008d.\3\2\2\2\13\2dioqw\u0080\u0083\u008a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}