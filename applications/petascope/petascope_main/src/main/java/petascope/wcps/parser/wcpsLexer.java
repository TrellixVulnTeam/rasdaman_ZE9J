// Generated from wcps.g4 by ANTLR 4.1
package petascope.wcps.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class wcpsLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FOR=1, ABSOLUTE_VALUE=2, ADD=3, ALL=4, AND=5, ARCSIN=6, ARCCOS=7, ARCTAN=8, 
		AVG=9, BIT=10, CASE=11, COLON=12, COMMA=13, CONDENSE=14, COS=15, COSH=16, 
		COUNT=17, COVERAGE=18, COVERAGE_VARIABLE_NAME_PREFIX=19, CRS_TRANSFORM=20, 
		DECODE=21, DEFAULT=22, DESCRIBE_COVERAGE=23, DIVISION=24, DOT=25, ENCODE=26, 
		EQUAL=27, EXP=28, EXTEND=29, FALSE=30, GREATER_THAN=31, GREATER_OR_EQUAL_THAN=32, 
		IMAGINARY_PART=33, IDENTIFIER=34, CRSSET=35, IMAGECRSDOMAIN=36, IMAGECRS=37, 
		IS=38, DOMAIN=39, IN=40, LEFT_BRACE=41, LEFT_BRACKET=42, LEFT_PARENTHESIS=43, 
		LN=44, LIST=45, LOG=46, LOWER_THAN=47, LOWER_OR_EQUAL_THAN=48, MAX=49, 
		MIN=50, MINUS=51, MULTIPLICATION=52, NOT=53, NOT_EQUAL=54, NAN_NUMBER_CONSTANT=55, 
		NULL=56, OR=57, OVER=58, OVERLAY=59, QUOTE=60, ESCAPED_QUOTE=61, PLUS=62, 
		POWER=63, REAL_PART=64, ROUND=65, RETURN=66, RIGHT_BRACE=67, RIGHT_BRACKET=68, 
		RIGHT_PARENTHESIS=69, SCALE=70, SCALE_FACTOR=71, SCALE_AXES=72, SCALE_SIZE=73, 
		SCALE_EXTENT=74, SEMICOLON=75, SIN=76, SINH=77, SLICE=78, SOME=79, SQUARE_ROOT=80, 
		STRUCT=81, SWITCH=82, TAN=83, TANH=84, TRIM=85, TRUE=86, USING=87, VALUE=88, 
		VALUES=89, WHERE=90, XOR=91, REAL_NUMBER_CONSTANT=92, SCIENTIFIC_NUMBER_CONSTANT=93, 
		COVERAGE_VARIABLE_NAME=94, NAME=95, FORMAT_NAME=96, STRING_LITERAL=97, 
		EXTRA_PARAMS=98, WS=99;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"FOR", "ABSOLUTE_VALUE", "ADD", "ALL", "AND", "ARCSIN", "ARCCOS", "ARCTAN", 
		"AVG", "BIT", "CASE", "':'", "','", "CONDENSE", "COS", "COSH", "COUNT", 
		"COVERAGE", "'$'", "CRS_TRANSFORM", "DECODE", "DEFAULT", "DESCRIBE_COVERAGE", 
		"'/'", "'.'", "ENCODE", "'='", "EXP", "EXTEND", "FALSE", "'>'", "'>='", 
		"IMAGINARY_PART", "IDENTIFIER", "CRSSET", "IMAGECRSDOMAIN", "IMAGECRS", 
		"IS", "DOMAIN", "IN", "'{'", "'['", "'('", "LN", "LIST", "LOG", "'<'", 
		"'<='", "MAX", "MIN", "'-'", "'*'", "NOT", "'!='", "NAN_NUMBER_CONSTANT", 
		"NULL", "OR", "OVER", "OVERLAY", "'\"'", "'\\\"'", "'+'", "POWER", "REAL_PART", 
		"ROUND", "RETURN", "'}'", "']'", "')'", "SCALE", "SCALE_FACTOR", "SCALE_AXES", 
		"SCALE_SIZE", "SCALE_EXTENT", "';'", "SIN", "SINH", "SLICE", "SOME", "SQUARE_ROOT", 
		"STRUCT", "SWITCH", "TAN", "TANH", "TRIM", "TRUE", "USING", "VALUE", "VALUES", 
		"WHERE", "XOR", "REAL_NUMBER_CONSTANT", "SCIENTIFIC_NUMBER_CONSTANT", 
		"COVERAGE_VARIABLE_NAME", "NAME", "FORMAT_NAME", "STRING_LITERAL", "EXTRA_PARAMS", 
		"WS"
	};
	public static final String[] ruleNames = {
		"FOR", "ABSOLUTE_VALUE", "ADD", "ALL", "AND", "ARCSIN", "ARCCOS", "ARCTAN", 
		"AVG", "BIT", "CASE", "COLON", "COMMA", "CONDENSE", "COS", "COSH", "COUNT", 
		"COVERAGE", "COVERAGE_VARIABLE_NAME_PREFIX", "CRS_TRANSFORM", "DECODE", 
		"DEFAULT", "DESCRIBE_COVERAGE", "DIVISION", "DOT", "ENCODE", "EQUAL", 
		"EXP", "EXTEND", "FALSE", "GREATER_THAN", "GREATER_OR_EQUAL_THAN", "IMAGINARY_PART", 
		"IDENTIFIER", "CRSSET", "IMAGECRSDOMAIN", "IMAGECRS", "IS", "DOMAIN", 
		"IN", "LEFT_BRACE", "LEFT_BRACKET", "LEFT_PARENTHESIS", "LN", "LIST", 
		"LOG", "LOWER_THAN", "LOWER_OR_EQUAL_THAN", "MAX", "MIN", "MINUS", "MULTIPLICATION", 
		"NOT", "NOT_EQUAL", "NAN_NUMBER_CONSTANT", "NULL", "OR", "OVER", "OVERLAY", 
		"QUOTE", "ESCAPED_QUOTE", "PLUS", "POWER", "REAL_PART", "ROUND", "RETURN", 
		"RIGHT_BRACE", "RIGHT_BRACKET", "RIGHT_PARENTHESIS", "SCALE", "SCALE_FACTOR", 
		"SCALE_AXES", "SCALE_SIZE", "SCALE_EXTENT", "SEMICOLON", "SIN", "SINH", 
		"SLICE", "SOME", "SQUARE_ROOT", "STRUCT", "SWITCH", "TAN", "TANH", "TRIM", 
		"TRUE", "USING", "VALUE", "VALUES", "WHERE", "XOR", "REAL_NUMBER_CONSTANT", 
		"SCIENTIFIC_NUMBER_CONSTANT", "COVERAGE_VARIABLE_NAME", "NAME", "FORMAT_NAME", 
		"STRING_LITERAL", "EXTRA_PARAMS", "WS"
	};


	public wcpsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "wcps.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 98: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2e\u02f0\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3"+
		"\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'"+
		"\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3-\3.\3.\3.\3."+
		"\3.\3/\3/\3/\3/\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63"+
		"\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67\38\3"+
		"8\38\38\39\39\39\39\39\3:\3:\3:\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3"+
		"<\3=\3=\3>\3>\3>\3?\3?\3@\3@\3@\3@\3A\3A\3A\3B\3B\3B\3B\3B\3B\3C\3C\3"+
		"C\3C\3C\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3H\3"+
		"H\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3J\3J\3J\3J\3J\3J\3J\3"+
		"J\3J\3J\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3L\3L\3M\3M\3M\3M\3N\3N\3"+
		"N\3N\3N\3O\3O\3O\3O\3O\3O\3P\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3"+
		"R\3R\3R\3S\3S\3S\3S\3S\3S\3S\3T\3T\3T\3T\3U\3U\3U\3U\3U\3V\3V\3V\3V\3"+
		"V\3W\3W\3W\3W\3W\3X\3X\3X\3X\3X\3X\3Y\3Y\3Y\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3"+
		"Z\3Z\3[\3[\3[\3[\3[\3[\3\\\3\\\3\\\3\\\3]\6]\u02a1\n]\r]\16]\u02a2\3]"+
		"\3]\7]\u02a7\n]\f]\16]\u02aa\13]\5]\u02ac\n]\3^\6^\u02af\n^\r^\16^\u02b0"+
		"\3^\3^\7^\u02b5\n^\f^\16^\u02b8\13^\5^\u02ba\n^\3^\3^\5^\u02be\n^\3^\6"+
		"^\u02c1\n^\r^\16^\u02c2\3_\6_\u02c6\n_\r_\16_\u02c7\3`\6`\u02cb\n`\r`"+
		"\16`\u02cc\3a\3a\6a\u02d1\na\ra\16a\u02d2\3a\3a\3b\3b\6b\u02d9\nb\rb\16"+
		"b\u02da\3b\3b\3c\3c\3c\3c\7c\u02e3\nc\fc\16c\u02e6\13c\3c\3c\3d\6d\u02eb"+
		"\nd\rd\16d\u02ec\3d\3d\2e\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1"+
		"\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23"+
		"\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35"+
		"\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\1K\'\1M(\1O)\1Q*\1S+\1U,\1W"+
		"-\1Y.\1[/\1]\60\1_\61\1a\62\1c\63\1e\64\1g\65\1i\66\1k\67\1m8\1o9\1q:"+
		"\1s;\1u<\1w=\1y>\1{?\1}@\1\177A\1\u0081B\1\u0083C\1\u0085D\1\u0087E\1"+
		"\u0089F\1\u008bG\1\u008dH\1\u008fI\1\u0091J\1\u0093K\1\u0095L\1\u0097"+
		"M\1\u0099N\1\u009bO\1\u009dP\1\u009fQ\1\u00a1R\1\u00a3S\1\u00a5T\1\u00a7"+
		"U\1\u00a9V\1\u00abW\1\u00adX\1\u00afY\1\u00b1Z\1\u00b3[\1\u00b5\\\1\u00b7"+
		"]\1\u00b9^\1\u00bb_\1\u00bd`\1\u00bfa\1\u00c1b\1\u00c3c\1\u00c5d\1\u00c7"+
		"e\2\3\2!\4\2HHhh\4\2QQqq\4\2TTtt\4\2CCcc\4\2DDdd\4\2UUuu\4\2FFff\4\2N"+
		"Nnn\4\2PPpp\4\2EEee\4\2KKkk\4\2VVvv\4\2XXxx\4\2IIii\4\2GGgg\4\2JJjj\4"+
		"\2WWww\4\2OOoo\4\2ZZzz\4\2RRrr\4\2[[{{\4\2YYyy\4\2SSss\3\2\62;\4\2--/"+
		"/\7\2&&\62;C\\aac|\5\2C\\c|~~\6\2\"\"\62;C\\c|\7\2\"#%&((-ac|\4\2$$^^"+
		"\5\2\13\f\17\17\"\"\u02fe\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]"+
		"\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2"+
		"\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2"+
		"\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2"+
		"\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2"+
		"\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093"+
		"\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2"+
		"\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5"+
		"\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2"+
		"\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7"+
		"\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2"+
		"\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2\2\2\u00c5\3\2\2\2\2\u00c7\3\2\2\2\3\u00c9"+
		"\3\2\2\2\5\u00cd\3\2\2\2\7\u00d1\3\2\2\2\t\u00d5\3\2\2\2\13\u00d9\3\2"+
		"\2\2\r\u00dd\3\2\2\2\17\u00e4\3\2\2\2\21\u00eb\3\2\2\2\23\u00f2\3\2\2"+
		"\2\25\u00f6\3\2\2\2\27\u00fa\3\2\2\2\31\u00ff\3\2\2\2\33\u0101\3\2\2\2"+
		"\35\u0103\3\2\2\2\37\u010c\3\2\2\2!\u0110\3\2\2\2#\u0115\3\2\2\2%\u011b"+
		"\3\2\2\2\'\u0124\3\2\2\2)\u0126\3\2\2\2+\u0133\3\2\2\2-\u013a\3\2\2\2"+
		"/\u0142\3\2\2\2\61\u0153\3\2\2\2\63\u0155\3\2\2\2\65\u0157\3\2\2\2\67"+
		"\u015e\3\2\2\29\u0160\3\2\2\2;\u0164\3\2\2\2=\u016b\3\2\2\2?\u0171\3\2"+
		"\2\2A\u0173\3\2\2\2C\u0176\3\2\2\2E\u0179\3\2\2\2G\u0184\3\2\2\2I\u018b"+
		"\3\2\2\2K\u019a\3\2\2\2M\u01a3\3\2\2\2O\u01a6\3\2\2\2Q\u01ad\3\2\2\2S"+
		"\u01b0\3\2\2\2U\u01b2\3\2\2\2W\u01b4\3\2\2\2Y\u01b6\3\2\2\2[\u01b9\3\2"+
		"\2\2]\u01be\3\2\2\2_\u01c2\3\2\2\2a\u01c4\3\2\2\2c\u01c7\3\2\2\2e\u01cb"+
		"\3\2\2\2g\u01cf\3\2\2\2i\u01d1\3\2\2\2k\u01d3\3\2\2\2m\u01d7\3\2\2\2o"+
		"\u01da\3\2\2\2q\u01de\3\2\2\2s\u01e3\3\2\2\2u\u01e6\3\2\2\2w\u01eb\3\2"+
		"\2\2y\u01f3\3\2\2\2{\u01f5\3\2\2\2}\u01f8\3\2\2\2\177\u01fa\3\2\2\2\u0081"+
		"\u01fe\3\2\2\2\u0083\u0201\3\2\2\2\u0085\u0207\3\2\2\2\u0087\u020e\3\2"+
		"\2\2\u0089\u0210\3\2\2\2\u008b\u0212\3\2\2\2\u008d\u0214\3\2\2\2\u008f"+
		"\u021a\3\2\2\2\u0091\u0226\3\2\2\2\u0093\u0230\3\2\2\2\u0095\u023a\3\2"+
		"\2\2\u0097\u0246\3\2\2\2\u0099\u0248\3\2\2\2\u009b\u024c\3\2\2\2\u009d"+
		"\u0251\3\2\2\2\u009f\u0257\3\2\2\2\u00a1\u025c\3\2\2\2\u00a3\u0261\3\2"+
		"\2\2\u00a5\u0268\3\2\2\2\u00a7\u026f\3\2\2\2\u00a9\u0273\3\2\2\2\u00ab"+
		"\u0278\3\2\2\2\u00ad\u027d\3\2\2\2\u00af\u0282\3\2\2\2\u00b1\u0288\3\2"+
		"\2\2\u00b3\u028e\3\2\2\2\u00b5\u0295\3\2\2\2\u00b7\u029b\3\2\2\2\u00b9"+
		"\u02a0\3\2\2\2\u00bb\u02ae\3\2\2\2\u00bd\u02c5\3\2\2\2\u00bf\u02ca\3\2"+
		"\2\2\u00c1\u02ce\3\2\2\2\u00c3\u02d6\3\2\2\2\u00c5\u02de\3\2\2\2\u00c7"+
		"\u02ea\3\2\2\2\u00c9\u00ca\t\2\2\2\u00ca\u00cb\t\3\2\2\u00cb\u00cc\t\4"+
		"\2\2\u00cc\4\3\2\2\2\u00cd\u00ce\t\5\2\2\u00ce\u00cf\t\6\2\2\u00cf\u00d0"+
		"\t\7\2\2\u00d0\6\3\2\2\2\u00d1\u00d2\t\5\2\2\u00d2\u00d3\t\b\2\2\u00d3"+
		"\u00d4\t\b\2\2\u00d4\b\3\2\2\2\u00d5\u00d6\t\5\2\2\u00d6\u00d7\t\t\2\2"+
		"\u00d7\u00d8\t\t\2\2\u00d8\n\3\2\2\2\u00d9\u00da\t\5\2\2\u00da\u00db\t"+
		"\n\2\2\u00db\u00dc\t\b\2\2\u00dc\f\3\2\2\2\u00dd\u00de\t\5\2\2\u00de\u00df"+
		"\t\4\2\2\u00df\u00e0\t\13\2\2\u00e0\u00e1\t\7\2\2\u00e1\u00e2\t\f\2\2"+
		"\u00e2\u00e3\t\n\2\2\u00e3\16\3\2\2\2\u00e4\u00e5\t\5\2\2\u00e5\u00e6"+
		"\t\4\2\2\u00e6\u00e7\t\13\2\2\u00e7\u00e8\t\13\2\2\u00e8\u00e9\t\3\2\2"+
		"\u00e9\u00ea\t\7\2\2\u00ea\20\3\2\2\2\u00eb\u00ec\t\5\2\2\u00ec\u00ed"+
		"\t\4\2\2\u00ed\u00ee\t\13\2\2\u00ee\u00ef\t\r\2\2\u00ef\u00f0\t\5\2\2"+
		"\u00f0\u00f1\t\n\2\2\u00f1\22\3\2\2\2\u00f2\u00f3\t\5\2\2\u00f3\u00f4"+
		"\t\16\2\2\u00f4\u00f5\t\17\2\2\u00f5\24\3\2\2\2\u00f6\u00f7\t\6\2\2\u00f7"+
		"\u00f8\t\f\2\2\u00f8\u00f9\t\r\2\2\u00f9\26\3\2\2\2\u00fa\u00fb\t\13\2"+
		"\2\u00fb\u00fc\t\5\2\2\u00fc\u00fd\t\7\2\2\u00fd\u00fe\t\20\2\2\u00fe"+
		"\30\3\2\2\2\u00ff\u0100\7<\2\2\u0100\32\3\2\2\2\u0101\u0102\7.\2\2\u0102"+
		"\34\3\2\2\2\u0103\u0104\t\13\2\2\u0104\u0105\t\3\2\2\u0105\u0106\t\n\2"+
		"\2\u0106\u0107\t\b\2\2\u0107\u0108\t\20\2\2\u0108\u0109\t\n\2\2\u0109"+
		"\u010a\t\7\2\2\u010a\u010b\t\20\2\2\u010b\36\3\2\2\2\u010c\u010d\t\13"+
		"\2\2\u010d\u010e\t\3\2\2\u010e\u010f\t\7\2\2\u010f \3\2\2\2\u0110\u0111"+
		"\t\13\2\2\u0111\u0112\t\3\2\2\u0112\u0113\t\7\2\2\u0113\u0114\t\21\2\2"+
		"\u0114\"\3\2\2\2\u0115\u0116\t\13\2\2\u0116\u0117\t\3\2\2\u0117\u0118"+
		"\t\22\2\2\u0118\u0119\t\n\2\2\u0119\u011a\t\r\2\2\u011a$\3\2\2\2\u011b"+
		"\u011c\t\13\2\2\u011c\u011d\t\3\2\2\u011d\u011e\t\16\2\2\u011e\u011f\t"+
		"\20\2\2\u011f\u0120\t\4\2\2\u0120\u0121\t\5\2\2\u0121\u0122\t\17\2\2\u0122"+
		"\u0123\t\20\2\2\u0123&\3\2\2\2\u0124\u0125\7&\2\2\u0125(\3\2\2\2\u0126"+
		"\u0127\t\13\2\2\u0127\u0128\t\4\2\2\u0128\u0129\t\7\2\2\u0129\u012a\t"+
		"\r\2\2\u012a\u012b\t\4\2\2\u012b\u012c\t\5\2\2\u012c\u012d\t\n\2\2\u012d"+
		"\u012e\t\7\2\2\u012e\u012f\t\2\2\2\u012f\u0130\t\3\2\2\u0130\u0131\t\4"+
		"\2\2\u0131\u0132\t\23\2\2\u0132*\3\2\2\2\u0133\u0134\t\b\2\2\u0134\u0135"+
		"\t\20\2\2\u0135\u0136\t\13\2\2\u0136\u0137\t\3\2\2\u0137\u0138\t\b\2\2"+
		"\u0138\u0139\t\20\2\2\u0139,\3\2\2\2\u013a\u013b\t\b\2\2\u013b\u013c\t"+
		"\20\2\2\u013c\u013d\t\2\2\2\u013d\u013e\t\5\2\2\u013e\u013f\t\22\2\2\u013f"+
		"\u0140\t\t\2\2\u0140\u0141\t\r\2\2\u0141.\3\2\2\2\u0142\u0143\t\b\2\2"+
		"\u0143\u0144\t\20\2\2\u0144\u0145\t\7\2\2\u0145\u0146\t\13\2\2\u0146\u0147"+
		"\t\4\2\2\u0147\u0148\t\f\2\2\u0148\u0149\t\6\2\2\u0149\u014a\t\20\2\2"+
		"\u014a\u014b\t\13\2\2\u014b\u014c\t\3\2\2\u014c\u014d\t\16\2\2\u014d\u014e"+
		"\t\20\2\2\u014e\u014f\t\4\2\2\u014f\u0150\t\5\2\2\u0150\u0151\t\17\2\2"+
		"\u0151\u0152\t\20\2\2\u0152\60\3\2\2\2\u0153\u0154\7\61\2\2\u0154\62\3"+
		"\2\2\2\u0155\u0156\7\60\2\2\u0156\64\3\2\2\2\u0157\u0158\t\20\2\2\u0158"+
		"\u0159\t\n\2\2\u0159\u015a\t\13\2\2\u015a\u015b\t\3\2\2\u015b\u015c\t"+
		"\b\2\2\u015c\u015d\t\20\2\2\u015d\66\3\2\2\2\u015e\u015f\7?\2\2\u015f"+
		"8\3\2\2\2\u0160\u0161\t\20\2\2\u0161\u0162\t\24\2\2\u0162\u0163\t\25\2"+
		"\2\u0163:\3\2\2\2\u0164\u0165\t\20\2\2\u0165\u0166\t\24\2\2\u0166\u0167"+
		"\t\r\2\2\u0167\u0168\t\20\2\2\u0168\u0169\t\n\2\2\u0169\u016a\t\b\2\2"+
		"\u016a<\3\2\2\2\u016b\u016c\t\2\2\2\u016c\u016d\t\5\2\2\u016d\u016e\t"+
		"\t\2\2\u016e\u016f\t\7\2\2\u016f\u0170\t\20\2\2\u0170>\3\2\2\2\u0171\u0172"+
		"\7@\2\2\u0172@\3\2\2\2\u0173\u0174\7@\2\2\u0174\u0175\7?\2\2\u0175B\3"+
		"\2\2\2\u0176\u0177\t\f\2\2\u0177\u0178\t\23\2\2\u0178D\3\2\2\2\u0179\u017a"+
		"\t\f\2\2\u017a\u017b\t\b\2\2\u017b\u017c\t\20\2\2\u017c\u017d\t\n\2\2"+
		"\u017d\u017e\t\r\2\2\u017e\u017f\4kk\2\u017f\u0180\t\2\2\2\u0180\u0181"+
		"\t\f\2\2\u0181\u0182\t\20\2\2\u0182\u0183\t\4\2\2\u0183F\3\2\2\2\u0184"+
		"\u0185\t\13\2\2\u0185\u0186\t\4\2\2\u0186\u0187\t\7\2\2\u0187\u0188\t"+
		"\7\2\2\u0188\u0189\t\20\2\2\u0189\u018a\t\r\2\2\u018aH\3\2\2\2\u018b\u018c"+
		"\t\f\2\2\u018c\u018d\t\23\2\2\u018d\u018e\t\5\2\2\u018e\u018f\t\17\2\2"+
		"\u018f\u0190\t\20\2\2\u0190\u0191\t\13\2\2\u0191\u0192\t\4\2\2\u0192\u0193"+
		"\t\7\2\2\u0193\u0194\t\b\2\2\u0194\u0195\t\3\2\2\u0195\u0196\t\23\2\2"+
		"\u0196\u0197\t\5\2\2\u0197\u0198\t\f\2\2\u0198\u0199\t\n\2\2\u0199J\3"+
		"\2\2\2\u019a\u019b\t\f\2\2\u019b\u019c\t\23\2\2\u019c\u019d\t\5\2\2\u019d"+
		"\u019e\t\17\2\2\u019e\u019f\t\20\2\2\u019f\u01a0\t\13\2\2\u01a0\u01a1"+
		"\t\4\2\2\u01a1\u01a2\t\7\2\2\u01a2L\3\2\2\2\u01a3\u01a4\t\f\2\2\u01a4"+
		"\u01a5\t\7\2\2\u01a5N\3\2\2\2\u01a6\u01a7\t\b\2\2\u01a7\u01a8\t\3\2\2"+
		"\u01a8\u01a9\t\23\2\2\u01a9\u01aa\t\5\2\2\u01aa\u01ab\t\f\2\2\u01ab\u01ac"+
		"\t\n\2\2\u01acP\3\2\2\2\u01ad\u01ae\t\f\2\2\u01ae\u01af\t\n\2\2\u01af"+
		"R\3\2\2\2\u01b0\u01b1\7}\2\2\u01b1T\3\2\2\2\u01b2\u01b3\7]\2\2\u01b3V"+
		"\3\2\2\2\u01b4\u01b5\7*\2\2\u01b5X\3\2\2\2\u01b6\u01b7\t\t\2\2\u01b7\u01b8"+
		"\t\n\2\2\u01b8Z\3\2\2\2\u01b9\u01ba\t\t\2\2\u01ba\u01bb\t\f\2\2\u01bb"+
		"\u01bc\t\7\2\2\u01bc\u01bd\t\r\2\2\u01bd\\\3\2\2\2\u01be\u01bf\t\t\2\2"+
		"\u01bf\u01c0\t\3\2\2\u01c0\u01c1\t\17\2\2\u01c1^\3\2\2\2\u01c2\u01c3\7"+
		">\2\2\u01c3`\3\2\2\2\u01c4\u01c5\7>\2\2\u01c5\u01c6\7?\2\2\u01c6b\3\2"+
		"\2\2\u01c7\u01c8\t\23\2\2\u01c8\u01c9\t\5\2\2\u01c9\u01ca\t\24\2\2\u01ca"+
		"d\3\2\2\2\u01cb\u01cc\t\23\2\2\u01cc\u01cd\t\f\2\2\u01cd\u01ce\t\n\2\2"+
		"\u01cef\3\2\2\2\u01cf\u01d0\7/\2\2\u01d0h\3\2\2\2\u01d1\u01d2\7,\2\2\u01d2"+
		"j\3\2\2\2\u01d3\u01d4\t\n\2\2\u01d4\u01d5\t\3\2\2\u01d5\u01d6\t\r\2\2"+
		"\u01d6l\3\2\2\2\u01d7\u01d8\7#\2\2\u01d8\u01d9\7?\2\2\u01d9n\3\2\2\2\u01da"+
		"\u01db\t\n\2\2\u01db\u01dc\t\5\2\2\u01dc\u01dd\t\n\2\2\u01ddp\3\2\2\2"+
		"\u01de\u01df\t\n\2\2\u01df\u01e0\t\22\2\2\u01e0\u01e1\t\t\2\2\u01e1\u01e2"+
		"\t\t\2\2\u01e2r\3\2\2\2\u01e3\u01e4\t\3\2\2\u01e4\u01e5\t\4\2\2\u01e5"+
		"t\3\2\2\2\u01e6\u01e7\t\3\2\2\u01e7\u01e8\t\16\2\2\u01e8\u01e9\t\20\2"+
		"\2\u01e9\u01ea\t\4\2\2\u01eav\3\2\2\2\u01eb\u01ec\t\3\2\2\u01ec\u01ed"+
		"\t\16\2\2\u01ed\u01ee\t\20\2\2\u01ee\u01ef\t\4\2\2\u01ef\u01f0\t\t\2\2"+
		"\u01f0\u01f1\t\5\2\2\u01f1\u01f2\t\26\2\2\u01f2x\3\2\2\2\u01f3\u01f4\7"+
		"$\2\2\u01f4z\3\2\2\2\u01f5\u01f6\7^\2\2\u01f6\u01f7\7$\2\2\u01f7|\3\2"+
		"\2\2\u01f8\u01f9\7-\2\2\u01f9~\3\2\2\2\u01fa\u01fb\t\25\2\2\u01fb\u01fc"+
		"\t\3\2\2\u01fc\u01fd\t\27\2\2\u01fd\u0080\3\2\2\2\u01fe\u01ff\t\4\2\2"+
		"\u01ff\u0200\t\20\2\2\u0200\u0082\3\2\2\2\u0201\u0202\t\4\2\2\u0202\u0203"+
		"\t\3\2\2\u0203\u0204\t\22\2\2\u0204\u0205\t\n\2\2\u0205\u0206\t\b\2\2"+
		"\u0206\u0084\3\2\2\2\u0207\u0208\t\4\2\2\u0208\u0209\t\20\2\2\u0209\u020a"+
		"\t\r\2\2\u020a\u020b\t\22\2\2\u020b\u020c\t\4\2\2\u020c\u020d\t\n\2\2"+
		"\u020d\u0086\3\2\2\2\u020e\u020f\7\177\2\2\u020f\u0088\3\2\2\2\u0210\u0211"+
		"\7_\2\2\u0211\u008a\3\2\2\2\u0212\u0213\7+\2\2\u0213\u008c\3\2\2\2\u0214"+
		"\u0215\t\7\2\2\u0215\u0216\t\13\2\2\u0216\u0217\t\5\2\2\u0217\u0218\t"+
		"\t\2\2\u0218\u0219\t\20\2\2\u0219\u008e\3\2\2\2\u021a\u021b\t\7\2\2\u021b"+
		"\u021c\t\13\2\2\u021c\u021d\t\5\2\2\u021d\u021e\t\t\2\2\u021e\u021f\t"+
		"\20\2\2\u021f\u0220\t\2\2\2\u0220\u0221\t\5\2\2\u0221\u0222\t\13\2\2\u0222"+
		"\u0223\t\r\2\2\u0223\u0224\t\3\2\2\u0224\u0225\t\4\2\2\u0225\u0090\3\2"+
		"\2\2\u0226\u0227\t\7\2\2\u0227\u0228\t\13\2\2\u0228\u0229\t\5\2\2\u0229"+
		"\u022a\t\t\2\2\u022a\u022b\t\20\2\2\u022b\u022c\t\5\2\2\u022c\u022d\t"+
		"\24\2\2\u022d\u022e\t\20\2\2\u022e\u022f\t\7\2\2\u022f\u0092\3\2\2\2\u0230"+
		"\u0231\t\7\2\2\u0231\u0232\t\13\2\2\u0232\u0233\t\5\2\2\u0233\u0234\t"+
		"\t\2\2\u0234\u0235\t\20\2\2\u0235\u0236\t\7\2\2\u0236\u0237\t\f\2\2\u0237"+
		"\u0238\4||\2\u0238\u0239\t\20\2\2\u0239\u0094\3\2\2\2\u023a\u023b\t\7"+
		"\2\2\u023b\u023c\t\13\2\2\u023c\u023d\t\5\2\2\u023d\u023e\t\t\2\2\u023e"+
		"\u023f\t\20\2\2\u023f\u0240\t\20\2\2\u0240\u0241\t\24\2\2\u0241\u0242"+
		"\t\r\2\2\u0242\u0243\t\20\2\2\u0243\u0244\t\n\2\2\u0244\u0245\t\r\2\2"+
		"\u0245\u0096\3\2\2\2\u0246\u0247\7=\2\2\u0247\u0098\3\2\2\2\u0248\u0249"+
		"\t\7\2\2\u0249\u024a\t\f\2\2\u024a\u024b\t\n\2\2\u024b\u009a\3\2\2\2\u024c"+
		"\u024d\t\7\2\2\u024d\u024e\t\f\2\2\u024e\u024f\t\n\2\2\u024f\u0250\t\21"+
		"\2\2\u0250\u009c\3\2\2\2\u0251\u0252\t\7\2\2\u0252\u0253\t\t\2\2\u0253"+
		"\u0254\t\f\2\2\u0254\u0255\t\13\2\2\u0255\u0256\t\20\2\2\u0256\u009e\3"+
		"\2\2\2\u0257\u0258\t\7\2\2\u0258\u0259\t\3\2\2\u0259\u025a\t\23\2\2\u025a"+
		"\u025b\t\20\2\2\u025b\u00a0\3\2\2\2\u025c\u025d\t\7\2\2\u025d\u025e\t"+
		"\30\2\2\u025e\u025f\t\4\2\2\u025f\u0260\t\r\2\2\u0260\u00a2\3\2\2\2\u0261"+
		"\u0262\t\7\2\2\u0262\u0263\t\r\2\2\u0263\u0264\t\4\2\2\u0264\u0265\t\22"+
		"\2\2\u0265\u0266\t\13\2\2\u0266\u0267\t\r\2\2\u0267\u00a4\3\2\2\2\u0268"+
		"\u0269\t\7\2\2\u0269\u026a\t\27\2\2\u026a\u026b\t\f\2\2\u026b\u026c\t"+
		"\r\2\2\u026c\u026d\t\13\2\2\u026d\u026e\t\21\2\2\u026e\u00a6\3\2\2\2\u026f"+
		"\u0270\t\r\2\2\u0270\u0271\t\5\2\2\u0271\u0272\t\n\2\2\u0272\u00a8\3\2"+
		"\2\2\u0273\u0274\t\r\2\2\u0274\u0275\t\5\2\2\u0275\u0276\t\n\2\2\u0276"+
		"\u0277\t\21\2\2\u0277\u00aa\3\2\2\2\u0278\u0279\t\r\2\2\u0279\u027a\t"+
		"\4\2\2\u027a\u027b\t\f\2\2\u027b\u027c\t\23\2\2\u027c\u00ac\3\2\2\2\u027d"+
		"\u027e\t\r\2\2\u027e\u027f\t\4\2\2\u027f\u0280\t\22\2\2\u0280\u0281\t"+
		"\20\2\2\u0281\u00ae\3\2\2\2\u0282\u0283\t\22\2\2\u0283\u0284\t\7\2\2\u0284"+
		"\u0285\t\f\2\2\u0285\u0286\t\n\2\2\u0286\u0287\t\17\2\2\u0287\u00b0\3"+
		"\2\2\2\u0288\u0289\t\16\2\2\u0289\u028a\t\5\2\2\u028a\u028b\t\t\2\2\u028b"+
		"\u028c\t\22\2\2\u028c\u028d\t\20\2\2\u028d\u00b2\3\2\2\2\u028e\u028f\t"+
		"\16\2\2\u028f\u0290\t\5\2\2\u0290\u0291\t\t\2\2\u0291\u0292\t\22\2\2\u0292"+
		"\u0293\t\20\2\2\u0293\u0294\t\7\2\2\u0294\u00b4\3\2\2\2\u0295\u0296\t"+
		"\27\2\2\u0296\u0297\t\21\2\2\u0297\u0298\t\20\2\2\u0298\u0299\t\4\2\2"+
		"\u0299\u029a\t\20\2\2\u029a\u00b6\3\2\2\2\u029b\u029c\t\24\2\2\u029c\u029d"+
		"\t\3\2\2\u029d\u029e\t\4\2\2\u029e\u00b8\3\2\2\2\u029f\u02a1\t\31\2\2"+
		"\u02a0\u029f\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a2\u02a3"+
		"\3\2\2\2\u02a3\u02ab\3\2\2\2\u02a4\u02a8\7\60\2\2\u02a5\u02a7\t\31\2\2"+
		"\u02a6\u02a5\3\2\2\2\u02a7\u02aa\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a8\u02a9"+
		"\3\2\2\2\u02a9\u02ac\3\2\2\2\u02aa\u02a8\3\2\2\2\u02ab\u02a4\3\2\2\2\u02ab"+
		"\u02ac\3\2\2\2\u02ac\u00ba\3\2\2\2\u02ad\u02af\t\31\2\2\u02ae\u02ad\3"+
		"\2\2\2\u02af\u02b0\3\2\2\2\u02b0\u02ae\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1"+
		"\u02b9\3\2\2\2\u02b2\u02b6\7\60\2\2\u02b3\u02b5\t\31\2\2\u02b4\u02b3\3"+
		"\2\2\2\u02b5\u02b8\3\2\2\2\u02b6\u02b4\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7"+
		"\u02ba\3\2\2\2\u02b8\u02b6\3\2\2\2\u02b9\u02b2\3\2\2\2\u02b9\u02ba\3\2"+
		"\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02bd\t\20\2\2\u02bc\u02be\t\32\2\2\u02bd"+
		"\u02bc\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\u02c0\3\2\2\2\u02bf\u02c1\t\31"+
		"\2\2\u02c0\u02bf\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c2"+
		"\u02c3\3\2\2\2\u02c3\u00bc\3\2\2\2\u02c4\u02c6\t\33\2\2\u02c5\u02c4\3"+
		"\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02c5\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8"+
		"\u00be\3\2\2\2\u02c9\u02cb\t\34\2\2\u02ca\u02c9\3\2\2\2\u02cb\u02cc\3"+
		"\2\2\2\u02cc\u02ca\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd\u00c0\3\2\2\2\u02ce"+
		"\u02d0\5y=\2\u02cf\u02d1\t\35\2\2\u02d0\u02cf\3\2\2\2\u02d1\u02d2\3\2"+
		"\2\2\u02d2\u02d0\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4"+
		"\u02d5\5y=\2\u02d5\u00c2\3\2\2\2\u02d6\u02d8\7$\2\2\u02d7\u02d9\t\36\2"+
		"\2\u02d8\u02d7\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02d8\3\2\2\2\u02da\u02db"+
		"\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02dd\7$\2\2\u02dd\u00c4\3\2\2\2\u02de"+
		"\u02e4\7$\2\2\u02df\u02e3\n\37\2\2\u02e0\u02e1\7^\2\2\u02e1\u02e3\t\37"+
		"\2\2\u02e2\u02df\3\2\2\2\u02e2\u02e0\3\2\2\2\u02e3\u02e6\3\2\2\2\u02e4"+
		"\u02e2\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02e7\3\2\2\2\u02e6\u02e4\3\2"+
		"\2\2\u02e7\u02e8\7$\2\2\u02e8\u00c6\3\2\2\2\u02e9\u02eb\t \2\2\u02ea\u02e9"+
		"\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02ea\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed"+
		"\u02ee\3\2\2\2\u02ee\u02ef\bd\2\2\u02ef\u00c8\3\2\2\2\22\2\u02a2\u02a8"+
		"\u02ab\u02b0\u02b6\u02b9\u02bd\u02c2\u02c7\u02cc\u02d2\u02da\u02e2\u02e4"+
		"\u02ec";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}