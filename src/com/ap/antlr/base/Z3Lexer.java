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
		GREATER_THAN_OR_EQUAL=8, LESS_THAN_OR_EQUAL=9, EXLAMATION_MARK=10, AND=11, 
		IF_ELSE=12, FUNC=13, INT=14, IDENTIFIER=15, NUMBER=16, WS=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SAT", "MODEL", "LPAREN", "RPAREN", "EQUALS", "GREATER_THAN", "LESS_THAN", 
			"GREATER_THAN_OR_EQUAL", "LESS_THAN_OR_EQUAL", "EXLAMATION_MARK", "AND", 
			"IF_ELSE", "FUNC", "INT", "IDENTIFIER", "NUMBER", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'sat'", "'model'", "'('", "')'", "'='", "'>'", "'<'", "'>='", 
			"'<='", "'!'", "'and'", "'ite'", "'define-fun'", "'Int'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SAT", "MODEL", "LPAREN", "RPAREN", "EQUALS", "GREATER_THAN", "LESS_THAN", 
			"GREATER_THAN_OR_EQUAL", "LESS_THAN_OR_EQUAL", "EXLAMATION_MARK", "AND", 
			"IF_ELSE", "FUNC", "INT", "IDENTIFIER", "NUMBER", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23q\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\7\20[\n\20\f\20\16\20^\13\20\3\20\7\20a\n\20\f\20"+
		"\16\20d\13\20\3\21\6\21g\n\21\r\21\16\21h\3\22\6\22l\n\22\r\22\16\22m"+
		"\3\22\3\22\2\2\23\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23\3\2\7\5\2C\\aac|\3\2##\6\2\62;C\\aac|\3"+
		"\2\62;\5\2\13\f\17\17\"\"\2t\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5)\3\2\2\2\7/\3\2\2\2\t\61\3"+
		"\2\2\2\13\63\3\2\2\2\r\65\3\2\2\2\17\67\3\2\2\2\219\3\2\2\2\23<\3\2\2"+
		"\2\25?\3\2\2\2\27A\3\2\2\2\31E\3\2\2\2\33I\3\2\2\2\35T\3\2\2\2\37X\3\2"+
		"\2\2!f\3\2\2\2#k\3\2\2\2%&\7u\2\2&\'\7c\2\2\'(\7v\2\2(\4\3\2\2\2)*\7o"+
		"\2\2*+\7q\2\2+,\7f\2\2,-\7g\2\2-.\7n\2\2.\6\3\2\2\2/\60\7*\2\2\60\b\3"+
		"\2\2\2\61\62\7+\2\2\62\n\3\2\2\2\63\64\7?\2\2\64\f\3\2\2\2\65\66\7@\2"+
		"\2\66\16\3\2\2\2\678\7>\2\28\20\3\2\2\29:\7@\2\2:;\7?\2\2;\22\3\2\2\2"+
		"<=\7>\2\2=>\7?\2\2>\24\3\2\2\2?@\7#\2\2@\26\3\2\2\2AB\7c\2\2BC\7p\2\2"+
		"CD\7f\2\2D\30\3\2\2\2EF\7k\2\2FG\7v\2\2GH\7g\2\2H\32\3\2\2\2IJ\7f\2\2"+
		"JK\7g\2\2KL\7h\2\2LM\7k\2\2MN\7p\2\2NO\7g\2\2OP\7/\2\2PQ\7h\2\2QR\7w\2"+
		"\2RS\7p\2\2S\34\3\2\2\2TU\7K\2\2UV\7p\2\2VW\7v\2\2W\36\3\2\2\2X\\\t\2"+
		"\2\2Y[\t\3\2\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]b\3\2\2\2^\\"+
		"\3\2\2\2_a\t\4\2\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2c \3\2\2\2d"+
		"b\3\2\2\2eg\t\5\2\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\"\3\2\2\2"+
		"jl\t\6\2\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2no\3\2\2\2op\b\22\2"+
		"\2p$\3\2\2\2\7\2\\bhm\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}