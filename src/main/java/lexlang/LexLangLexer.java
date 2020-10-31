// Generated from LexLang.g4 by ANTLR 4.8

    package lexlang;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LexLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, WS=2, COMMENT=3, LINE_COMMENT=4, IF=5, ELSE=6, ITERATE=7, READ=8, 
		PRINT=9, RETURN=10, DATA=11, INT=12, CHAR=13, BOOL=14, FLOAT=15, NULL=16, 
		TRUE=17, FALSE=18, ID=19, INT_NUM=20, FLOAT_NUM=21, STRING=22, SET=23, 
		EQUALS=24, NOTEQ=25, NOT=26, PLUS=27, MINUS=28, MULTIPLY=29, DIVIDE=30, 
		MOD=31, SEMICOL=32, LESS_THAN=33, BIGGER_THAN=34, AND=35, PAR_OPEN=36, 
		PAR_CLOSE=37, BRACE_OPEN=38, BRACE_CLOSE=39, BRACKET_OPEN=40, BRACKET_CLOSE=41, 
		DOT=42, COMMA=43, TYPEDEF=44, RETURNDEF=45;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "DIGIT", "WS", "COMMENT", "LINE_COMMENT", "IF", "ELSE", "ITERATE", 
			"READ", "PRINT", "RETURN", "DATA", "INT", "CHAR", "BOOL", "FLOAT", "NULL", 
			"TRUE", "FALSE", "ID", "INT_NUM", "FLOAT_NUM", "STRING", "SET", "EQUALS", 
			"NOTEQ", "NOT", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "MOD", "SEMICOL", 
			"LESS_THAN", "BIGGER_THAN", "AND", "PAR_OPEN", "PAR_CLOSE", "BRACE_OPEN", 
			"BRACE_CLOSE", "BRACKET_OPEN", "BRACKET_CLOSE", "DOT", "COMMA", "TYPEDEF", 
			"RETURNDEF"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'new'", null, null, null, "'if'", "'else'", "'iterate'", "'read'", 
			"'print'", "'return'", "'data'", "'Int'", "'Char'", "'Bool'", "'Float'", 
			"'null'", "'true'", "'false'", null, null, null, null, "'='", "'=='", 
			"'!='", "'!'", "'+'", "'-'", "'*'", "'/'", "'%'", "';'", "'<'", "'>'", 
			"'&&'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'.'", "','", "'::'", 
			"':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "WS", "COMMENT", "LINE_COMMENT", "IF", "ELSE", "ITERATE", 
			"READ", "PRINT", "RETURN", "DATA", "INT", "CHAR", "BOOL", "FLOAT", "NULL", 
			"TRUE", "FALSE", "ID", "INT_NUM", "FLOAT_NUM", "STRING", "SET", "EQUALS", 
			"NOTEQ", "NOT", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "MOD", "SEMICOL", 
			"LESS_THAN", "BIGGER_THAN", "AND", "PAR_OPEN", "PAR_CLOSE", "BRACE_OPEN", 
			"BRACE_CLOSE", "BRACKET_OPEN", "BRACKET_CLOSE", "DOT", "COMMA", "TYPEDEF", 
			"RETURNDEF"
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


	public LexLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LexLang.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u012e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\2\3\3\3\3\3\4\6\4g\n\4\r\4\16\4h"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\7\5q\n\5\f\5\16\5t\13\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\7\6\177\n\6\f\6\16\6\u0082\13\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\7\25"+
		"\u00d5\n\25\f\25\16\25\u00d8\13\25\3\26\3\26\3\26\7\26\u00dd\n\26\f\26"+
		"\16\26\u00e0\13\26\5\26\u00e2\n\26\3\27\3\27\3\27\7\27\u00e7\n\27\f\27"+
		"\16\27\u00ea\13\27\5\27\u00ec\n\27\3\27\3\27\6\27\u00f0\n\27\r\27\16\27"+
		"\u00f1\3\30\3\30\7\30\u00f6\n\30\f\30\16\30\u00f9\13\30\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3(\3(\3)"+
		"\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3.\3/\3/\3r\2\60\3\3\5\2\7\4\t\5\13"+
		"\6\r\7\17\b\21\t\23\n\25\13\27\f\31\r\33\16\35\17\37\20!\21#\22%\23\'"+
		"\24)\25+\26-\27/\30\61\31\63\32\65\33\67\349\35;\36=\37? A!C\"E#G$I%K"+
		"&M\'O(Q)S*U+W,Y-[.]/\3\2\b\3\2\62;\5\2\13\f\17\17\"\"\4\2\f\f\17\17\3"+
		"\2c|\4\2\62;c|\3\2\63;\2\u0136\2\3\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\3_\3\2\2\2\5c\3\2\2\2\7f\3\2\2\2\tl\3\2\2\2\13z\3\2\2\2\r\u0087\3\2\2"+
		"\2\17\u008a\3\2\2\2\21\u008f\3\2\2\2\23\u0097\3\2\2\2\25\u009c\3\2\2\2"+
		"\27\u00a2\3\2\2\2\31\u00a9\3\2\2\2\33\u00ae\3\2\2\2\35\u00b2\3\2\2\2\37"+
		"\u00b7\3\2\2\2!\u00bc\3\2\2\2#\u00c2\3\2\2\2%\u00c7\3\2\2\2\'\u00cc\3"+
		"\2\2\2)\u00d2\3\2\2\2+\u00e1\3\2\2\2-\u00eb\3\2\2\2/\u00f3\3\2\2\2\61"+
		"\u00fc\3\2\2\2\63\u00fe\3\2\2\2\65\u0101\3\2\2\2\67\u0104\3\2\2\29\u0106"+
		"\3\2\2\2;\u0108\3\2\2\2=\u010a\3\2\2\2?\u010c\3\2\2\2A\u010e\3\2\2\2C"+
		"\u0110\3\2\2\2E\u0112\3\2\2\2G\u0114\3\2\2\2I\u0116\3\2\2\2K\u0119\3\2"+
		"\2\2M\u011b\3\2\2\2O\u011d\3\2\2\2Q\u011f\3\2\2\2S\u0121\3\2\2\2U\u0123"+
		"\3\2\2\2W\u0125\3\2\2\2Y\u0127\3\2\2\2[\u0129\3\2\2\2]\u012c\3\2\2\2_"+
		"`\7p\2\2`a\7g\2\2ab\7y\2\2b\4\3\2\2\2cd\t\2\2\2d\6\3\2\2\2eg\t\3\2\2f"+
		"e\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2ij\3\2\2\2jk\b\4\2\2k\b\3\2\2\2"+
		"lm\7}\2\2mn\7/\2\2nr\3\2\2\2oq\13\2\2\2po\3\2\2\2qt\3\2\2\2rs\3\2\2\2"+
		"rp\3\2\2\2su\3\2\2\2tr\3\2\2\2uv\7/\2\2vw\7\177\2\2wx\3\2\2\2xy\b\5\2"+
		"\2y\n\3\2\2\2z{\7/\2\2{|\7/\2\2|\u0080\3\2\2\2}\177\n\4\2\2~}\3\2\2\2"+
		"\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2"+
		"\2\2\u0082\u0080\3\2\2\2\u0083\u0084\t\4\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0086\b\6\2\2\u0086\f\3\2\2\2\u0087\u0088\7k\2\2\u0088\u0089\7h\2\2\u0089"+
		"\16\3\2\2\2\u008a\u008b\7g\2\2\u008b\u008c\7n\2\2\u008c\u008d\7u\2\2\u008d"+
		"\u008e\7g\2\2\u008e\20\3\2\2\2\u008f\u0090\7k\2\2\u0090\u0091\7v\2\2\u0091"+
		"\u0092\7g\2\2\u0092\u0093\7t\2\2\u0093\u0094\7c\2\2\u0094\u0095\7v\2\2"+
		"\u0095\u0096\7g\2\2\u0096\22\3\2\2\2\u0097\u0098\7t\2\2\u0098\u0099\7"+
		"g\2\2\u0099\u009a\7c\2\2\u009a\u009b\7f\2\2\u009b\24\3\2\2\2\u009c\u009d"+
		"\7r\2\2\u009d\u009e\7t\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7p\2\2\u00a0"+
		"\u00a1\7v\2\2\u00a1\26\3\2\2\2\u00a2\u00a3\7t\2\2\u00a3\u00a4\7g\2\2\u00a4"+
		"\u00a5\7v\2\2\u00a5\u00a6\7w\2\2\u00a6\u00a7\7t\2\2\u00a7\u00a8\7p\2\2"+
		"\u00a8\30\3\2\2\2\u00a9\u00aa\7f\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ac\7"+
		"v\2\2\u00ac\u00ad\7c\2\2\u00ad\32\3\2\2\2\u00ae\u00af\7K\2\2\u00af\u00b0"+
		"\7p\2\2\u00b0\u00b1\7v\2\2\u00b1\34\3\2\2\2\u00b2\u00b3\7E\2\2\u00b3\u00b4"+
		"\7j\2\2\u00b4\u00b5\7c\2\2\u00b5\u00b6\7t\2\2\u00b6\36\3\2\2\2\u00b7\u00b8"+
		"\7D\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba\7q\2\2\u00ba\u00bb\7n\2\2\u00bb"+
		" \3\2\2\2\u00bc\u00bd\7H\2\2\u00bd\u00be\7n\2\2\u00be\u00bf\7q\2\2\u00bf"+
		"\u00c0\7c\2\2\u00c0\u00c1\7v\2\2\u00c1\"\3\2\2\2\u00c2\u00c3\7p\2\2\u00c3"+
		"\u00c4\7w\2\2\u00c4\u00c5\7n\2\2\u00c5\u00c6\7n\2\2\u00c6$\3\2\2\2\u00c7"+
		"\u00c8\7v\2\2\u00c8\u00c9\7t\2\2\u00c9\u00ca\7w\2\2\u00ca\u00cb\7g\2\2"+
		"\u00cb&\3\2\2\2\u00cc\u00cd\7h\2\2\u00cd\u00ce\7c\2\2\u00ce\u00cf\7n\2"+
		"\2\u00cf\u00d0\7u\2\2\u00d0\u00d1\7g\2\2\u00d1(\3\2\2\2\u00d2\u00d6\t"+
		"\5\2\2\u00d3\u00d5\t\6\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7*\3\2\2\2\u00d8\u00d6\3\2\2\2"+
		"\u00d9\u00e2\7\62\2\2\u00da\u00de\t\7\2\2\u00db\u00dd\t\2\2\2\u00dc\u00db"+
		"\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df"+
		"\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00d9\3\2\2\2\u00e1\u00da\3\2"+
		"\2\2\u00e2,\3\2\2\2\u00e3\u00ec\7\62\2\2\u00e4\u00e8\t\7\2\2\u00e5\u00e7"+
		"\t\2\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8"+
		"\u00e9\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00e3\3\2"+
		"\2\2\u00eb\u00e4\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef\7\60\2\2\u00ee"+
		"\u00f0\5\5\3\2\u00ef\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00ef\3\2"+
		"\2\2\u00f1\u00f2\3\2\2\2\u00f2.\3\2\2\2\u00f3\u00f7\7$\2\2\u00f4\u00f6"+
		"\n\4\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb\7$"+
		"\2\2\u00fb\60\3\2\2\2\u00fc\u00fd\7?\2\2\u00fd\62\3\2\2\2\u00fe\u00ff"+
		"\7?\2\2\u00ff\u0100\7?\2\2\u0100\64\3\2\2\2\u0101\u0102\7#\2\2\u0102\u0103"+
		"\7?\2\2\u0103\66\3\2\2\2\u0104\u0105\7#\2\2\u01058\3\2\2\2\u0106\u0107"+
		"\7-\2\2\u0107:\3\2\2\2\u0108\u0109\7/\2\2\u0109<\3\2\2\2\u010a\u010b\7"+
		",\2\2\u010b>\3\2\2\2\u010c\u010d\7\61\2\2\u010d@\3\2\2\2\u010e\u010f\7"+
		"\'\2\2\u010fB\3\2\2\2\u0110\u0111\7=\2\2\u0111D\3\2\2\2\u0112\u0113\7"+
		">\2\2\u0113F\3\2\2\2\u0114\u0115\7@\2\2\u0115H\3\2\2\2\u0116\u0117\7("+
		"\2\2\u0117\u0118\7(\2\2\u0118J\3\2\2\2\u0119\u011a\7*\2\2\u011aL\3\2\2"+
		"\2\u011b\u011c\7+\2\2\u011cN\3\2\2\2\u011d\u011e\7}\2\2\u011eP\3\2\2\2"+
		"\u011f\u0120\7\177\2\2\u0120R\3\2\2\2\u0121\u0122\7]\2\2\u0122T\3\2\2"+
		"\2\u0123\u0124\7_\2\2\u0124V\3\2\2\2\u0125\u0126\7\60\2\2\u0126X\3\2\2"+
		"\2\u0127\u0128\7.\2\2\u0128Z\3\2\2\2\u0129\u012a\7<\2\2\u012a\u012b\7"+
		"<\2\2\u012b\\\3\2\2\2\u012c\u012d\7<\2\2\u012d^\3\2\2\2\r\2hr\u0080\u00d6"+
		"\u00de\u00e1\u00e8\u00eb\u00f1\u00f7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}