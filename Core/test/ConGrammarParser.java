// Generated from ../ConGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ConGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, NEWLINE=2, VAR=3, CONST=4, LINECOMMENT=5, BLOCKCOMMENT=6, WHILE=7, 
		ENDWHILE=8, IF=9, ELSE=10, ELSEIF=11, ENDIF=12, EQUAL=13, NOTEQUAL=14, 
		LESS=15, LESSEQUAL=16, GREATER=17, GREATEREQUAL=18, ASSIGN=19, INITIALIZER=20, 
		INCLUDE=21, RUN=22, RETURN=23, IDENTIFIER=24, STRING=25, NUMBER=26, WS=27;
	public static final int
		RULE_file = 0, RULE_block = 1, RULE_expression = 2, RULE_returnExp = 3, 
		RULE_commentExp = 4, RULE_includeExp = 5, RULE_runExp = 6, RULE_callExp = 7, 
		RULE_assignExp = 8, RULE_declarationExp = 9, RULE_declarationModifier = 10, 
		RULE_conditionalExp = 11, RULE_conditionalMultiExp = 12, RULE_whileExp = 13, 
		RULE_condition = 14, RULE_comparator = 15, RULE_literal = 16, RULE_vector = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "block", "expression", "returnExp", "commentExp", "includeExp", 
			"runExp", "callExp", "assignExp", "declarationExp", "declarationModifier", 
			"conditionalExp", "conditionalMultiExp", "whileExp", "condition", "comparator", 
			"literal", "vector"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'/'", null, "'var'", "'const'", null, null, "'while'", "'endWhile'", 
			"'if'", "'else'", "'elseIf'", "'endIf'", null, null, null, null, null, 
			null, "'->'", "'='", "'include'", "'run'", "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "NEWLINE", "VAR", "CONST", "LINECOMMENT", "BLOCKCOMMENT", 
			"WHILE", "ENDWHILE", "IF", "ELSE", "ELSEIF", "ENDIF", "EQUAL", "NOTEQUAL", 
			"LESS", "LESSEQUAL", "GREATER", "GREATEREQUAL", "ASSIGN", "INITIALIZER", 
			"INCLUDE", "RUN", "RETURN", "IDENTIFIER", "STRING", "NUMBER", "WS"
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
	public String getGrammarFileName() { return "ConGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ConGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FileContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ConGrammarParser.EOF, 0); }
		public TerminalNode NEWLINE() { return getToken(ConGrammarParser.NEWLINE, 0); }
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConGrammarListener ) ((ConGrammarListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConGrammarListener ) ((ConGrammarListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			block();
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(37);
				match(NEWLINE);
				}
			}

			setState(40);
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

	public static class BlockContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ConGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ConGrammarParser.NEWLINE, i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConGrammarListener ) ((ConGrammarListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConGrammarListener ) ((ConGrammarListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			int _alt;
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << CONST) | (1L << LINECOMMENT) | (1L << BLOCKCOMMENT) | (1L << WHILE) | (1L << IF) | (1L << INCLUDE) | (1L << RUN) | (1L << RETURN) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(42);
					expression();
					}
				}

				setState(49);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(45);
						match(NEWLINE);
						setState(46);
						expression();
						}
						} 
					}
					setState(51);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				match(NEWLINE);
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

	public static class ExpressionContext extends ParserRuleContext {
		public AssignExpContext assignExp() {
			return getRuleContext(AssignExpContext.class,0);
		}
		public CallExpContext callExp() {
			return getRuleContext(CallExpContext.class,0);
		}
		public DeclarationExpContext declarationExp() {
			return getRuleContext(DeclarationExpContext.class,0);
		}
		public ConditionalExpContext conditionalExp() {
			return getRuleContext(ConditionalExpContext.class,0);
		}
		public ConditionalMultiExpContext conditionalMultiExp() {
			return getRuleContext(ConditionalMultiExpContext.class,0);
		}
		public WhileExpContext whileExp() {
			return getRuleContext(WhileExpContext.class,0);
		}
		public CommentExpContext commentExp() {
			return getRuleContext(CommentExpContext.class,0);
		}
		public RunExpContext runExp() {
			return getRuleContext(RunExpContext.class,0);
		}
		public IncludeExpContext includeExp() {
			return getRuleContext(IncludeExpContext.class,0);
		}
		public ReturnExpContext returnExp() {
			return getRuleContext(ReturnExpContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConGrammarListener ) ((ConGrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConGrammarListener ) ((ConGrammarListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expression);
		try {
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				assignExp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				callExp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				declarationExp();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(58);
				conditionalExp();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(59);
				conditionalMultiExp();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(60);
				whileExp();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(61);
				commentExp();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(62);
				runExp();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(63);
				includeExp();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(64);
				returnExp();
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

	public static class ReturnExpContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(ConGrammarParser.RETURN, 0); }
		public ReturnExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConGrammarListener ) ((ConGrammarListener)listener).enterReturnExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConGrammarListener ) ((ConGrammarListener)listener).exitReturnExp(this);
		}
	}

	public final ReturnExpContext returnExp() throws RecognitionException {
		ReturnExpContext _localctx = new ReturnExpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_returnExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(RETURN);
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

	public static class CommentExpContext extends ParserRuleContext {
		public TerminalNode LINECOMMENT() { return getToken(ConGrammarParser.LINECOMMENT, 0); }
		public TerminalNode BLOCKCOMMENT() { return getToken(ConGrammarParser.BLOCKCOMMENT, 0); }
		public CommentExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commentExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConGrammarListener ) ((ConGrammarListener)listener).enterCommentExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConGrammarListener ) ((ConGrammarListener)listener).exitCommentExp(this);
		}
	}

	public final CommentExpContext commentExp() throws RecognitionException {
		CommentExpContext _localctx = new CommentExpContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_commentExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_la = _input.LA(1);
			if ( !(_la==LINECOMMENT || _la==BLOCKCOMMENT) ) {
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

	public static class IncludeExpContext extends ParserRuleContext {
		public TerminalNode INCLUDE() { return getToken(ConGrammarParser.INCLUDE, 0); }
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public IncludeExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_includeExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConGrammarListener ) ((ConGrammarListener)listener).enterIncludeExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConGrammarListener ) ((ConGrammarListener)listener).exitIncludeExp(this);
		}
	}

	public final IncludeExpContext includeExp() throws RecognitionException {
		IncludeExpContext _localctx = new IncludeExpContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_includeExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(INCLUDE);
			setState(72);
			literal();
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << STRING) | (1L << NUMBER))) != 0)) {
				{
				{
				setState(73);
				literal();
				}
				}
				setState(78);
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

	public static class RunExpContext extends ParserRuleContext {
		public TerminalNode RUN() { return getToken(ConGrammarParser.RUN, 0); }
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public RunExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_runExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConGrammarListener ) ((ConGrammarListener)listener).enterRunExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConGrammarListener ) ((ConGrammarListener)listener).exitRunExp(this);
		}
	}

	public final RunExpContext runExp() throws RecognitionException {
		RunExpContext _localctx = new RunExpContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_runExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(RUN);
			setState(80);
			literal();
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << STRING) | (1L << NUMBER))) != 0)) {
				{
				{
				setState(81);
				literal();
				}
				}
				setState(86);
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

	public static class CallExpContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ConGrammarParser.IDENTIFIER, 0); }
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public CallExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConGrammarListener ) ((ConGrammarListener)listener).enterCallExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConGrammarListener ) ((ConGrammarListener)listener).exitCallExp(this);
		}
	}

	public final CallExpContext callExp() throws RecognitionException {
		CallExpContext _localctx = new CallExpContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_callExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(IDENTIFIER);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << STRING) | (1L << NUMBER))) != 0)) {
				{
				{
				setState(88);
				literal();
				}
				}
				setState(93);
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

	public static class AssignExpContext extends ParserRuleContext {
		public CallExpContext callExp() {
			return getRuleContext(CallExpContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(ConGrammarParser.ASSIGN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ConGrammarParser.IDENTIFIER, 0); }
		public AssignExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConGrammarListener ) ((ConGrammarListener)listener).enterAssignExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConGrammarListener ) ((ConGrammarListener)listener).exitAssignExp(this);
		}
	}

	public final AssignExpContext assignExp() throws RecognitionException {
		AssignExpContext _localctx = new AssignExpContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			callExp();
			setState(95);
			match(ASSIGN);
			setState(96);
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

	public static class DeclarationExpContext extends ParserRuleContext {
		public DeclarationModifierContext declarationModifier() {
			return getRuleContext(DeclarationModifierContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ConGrammarParser.IDENTIFIER, 0); }
		public TerminalNode INITIALIZER() { return getToken(ConGrammarParser.INITIALIZER, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public DeclarationExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConGrammarListener ) ((ConGrammarListener)listener).enterDeclarationExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConGrammarListener ) ((ConGrammarListener)listener).exitDeclarationExp(this);
		}
	}

	public final DeclarationExpContext declarationExp() throws RecognitionException {
		DeclarationExpContext _localctx = new DeclarationExpContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declarationExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			declarationModifier();
			setState(99);
			match(IDENTIFIER);
			{
			setState(100);
			match(INITIALIZER);
			setState(101);
			literal();
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

	public static class DeclarationModifierContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(ConGrammarParser.VAR, 0); }
		public TerminalNode CONST() { return getToken(ConGrammarParser.CONST, 0); }
		public DeclarationModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConGrammarListener ) ((ConGrammarListener)listener).enterDeclarationModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConGrammarListener ) ((ConGrammarListener)listener).exitDeclarationModifier(this);
		}
	}

	public final DeclarationModifierContext declarationModifier() throws RecognitionException {
		DeclarationModifierContext _localctx = new DeclarationModifierContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declarationModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_la = _input.LA(1);
			if ( !(_la==VAR || _la==CONST) ) {
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

	public static class ConditionalExpContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ConGrammarParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ConGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ConGrammarParser.NEWLINE, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ENDIF() { return getToken(ConGrammarParser.ENDIF, 0); }
		public TerminalNode ELSE() { return getToken(ConGrammarParser.ELSE, 0); }
		public ConditionalExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConGrammarListener ) ((ConGrammarListener)listener).enterConditionalExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConGrammarListener ) ((ConGrammarListener)listener).exitConditionalExp(this);
		}
	}

	public final ConditionalExpContext conditionalExp() throws RecognitionException {
		ConditionalExpContext _localctx = new ConditionalExpContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_conditionalExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(IF);
			setState(106);
			condition();
			setState(107);
			match(NEWLINE);
			setState(108);
			block();
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(109);
				match(NEWLINE);
				setState(110);
				match(ELSE);
				setState(111);
				match(NEWLINE);
				setState(112);
				block();
				}
				break;
			}
			setState(115);
			match(NEWLINE);
			setState(116);
			match(ENDIF);
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

	public static class ConditionalMultiExpContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ConGrammarParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ConGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ConGrammarParser.NEWLINE, i);
		}
		public TerminalNode ENDIF() { return getToken(ConGrammarParser.ENDIF, 0); }
		public List<TerminalNode> ELSEIF() { return getTokens(ConGrammarParser.ELSEIF); }
		public TerminalNode ELSEIF(int i) {
			return getToken(ConGrammarParser.ELSEIF, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(ConGrammarParser.ELSE, 0); }
		public ConditionalMultiExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalMultiExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConGrammarListener ) ((ConGrammarListener)listener).enterConditionalMultiExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConGrammarListener ) ((ConGrammarListener)listener).exitConditionalMultiExp(this);
		}
	}

	public final ConditionalMultiExpContext conditionalMultiExp() throws RecognitionException {
		ConditionalMultiExpContext _localctx = new ConditionalMultiExpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_conditionalMultiExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(IF);
			setState(119);
			condition();
			setState(120);
			match(NEWLINE);
			setState(124); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(121);
				match(ELSEIF);
				setState(122);
				match(NEWLINE);
				setState(123);
				block();
				}
				}
				setState(126); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ELSEIF );
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(128);
				match(NEWLINE);
				setState(129);
				match(ELSE);
				setState(130);
				match(NEWLINE);
				setState(131);
				block();
				}
				break;
			}
			setState(134);
			match(NEWLINE);
			setState(135);
			match(ENDIF);
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

	public static class WhileExpContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(ConGrammarParser.WHILE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ConGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ConGrammarParser.NEWLINE, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ENDWHILE() { return getToken(ConGrammarParser.ENDWHILE, 0); }
		public WhileExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConGrammarListener ) ((ConGrammarListener)listener).enterWhileExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConGrammarListener ) ((ConGrammarListener)listener).exitWhileExp(this);
		}
	}

	public final WhileExpContext whileExp() throws RecognitionException {
		WhileExpContext _localctx = new WhileExpContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_whileExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(WHILE);
			setState(138);
			condition();
			setState(139);
			match(NEWLINE);
			setState(140);
			block();
			setState(141);
			match(NEWLINE);
			setState(142);
			match(ENDWHILE);
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

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ConGrammarParser.IDENTIFIER, 0); }
		public ComparatorContext comparator() {
			return getRuleContext(ComparatorContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConGrammarListener ) ((ConGrammarListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConGrammarListener ) ((ConGrammarListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(IDENTIFIER);
			setState(145);
			comparator();
			setState(146);
			literal();
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

	public static class ComparatorContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(ConGrammarParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(ConGrammarParser.NOTEQUAL, 0); }
		public TerminalNode GREATER() { return getToken(ConGrammarParser.GREATER, 0); }
		public TerminalNode GREATEREQUAL() { return getToken(ConGrammarParser.GREATEREQUAL, 0); }
		public TerminalNode LESSEQUAL() { return getToken(ConGrammarParser.LESSEQUAL, 0); }
		public ComparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConGrammarListener ) ((ConGrammarListener)listener).enterComparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConGrammarListener ) ((ConGrammarListener)listener).exitComparator(this);
		}
	}

	public final ComparatorContext comparator() throws RecognitionException {
		ComparatorContext _localctx = new ComparatorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_comparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NOTEQUAL) | (1L << LESSEQUAL) | (1L << GREATER) | (1L << GREATEREQUAL))) != 0)) ) {
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ConGrammarParser.STRING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ConGrammarParser.IDENTIFIER, 0); }
		public VectorContext vector() {
			return getRuleContext(VectorContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(ConGrammarParser.NUMBER, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConGrammarListener ) ((ConGrammarListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConGrammarListener ) ((ConGrammarListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_literal);
		try {
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(152);
				vector();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(153);
				match(NUMBER);
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

	public static class VectorContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(ConGrammarParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ConGrammarParser.NUMBER, i);
		}
		public VectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConGrammarListener ) ((ConGrammarListener)listener).enterVector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConGrammarListener ) ((ConGrammarListener)listener).exitVector(this);
		}
	}

	public final VectorContext vector() throws RecognitionException {
		VectorContext _localctx = new VectorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_vector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(NUMBER);
			setState(157);
			match(T__0);
			setState(158);
			match(NUMBER);
			setState(159);
			match(T__0);
			setState(160);
			match(NUMBER);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u00a5\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\5\2)\n\2\3\2\3\2\3\3\5\3.\n\3\3\3\3\3\7\3\62\n\3\f"+
		"\3\16\3\65\13\3\3\3\5\38\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5"+
		"\4D\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\7\7M\n\7\f\7\16\7P\13\7\3\b\3\b\3"+
		"\b\7\bU\n\b\f\b\16\bX\13\b\3\t\3\t\7\t\\\n\t\f\t\16\t_\13\t\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\5\rt\n\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\6\16\177\n\16\r"+
		"\16\16\16\u0080\3\16\3\16\3\16\3\16\5\16\u0087\n\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\5\22\u009d\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\2\2\24\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\5\3\2\7\b\3\2\5\6\4\2\17\20"+
		"\22\24\2\u00a8\2&\3\2\2\2\4\67\3\2\2\2\6C\3\2\2\2\bE\3\2\2\2\nG\3\2\2"+
		"\2\fI\3\2\2\2\16Q\3\2\2\2\20Y\3\2\2\2\22`\3\2\2\2\24d\3\2\2\2\26i\3\2"+
		"\2\2\30k\3\2\2\2\32x\3\2\2\2\34\u008b\3\2\2\2\36\u0092\3\2\2\2 \u0096"+
		"\3\2\2\2\"\u009c\3\2\2\2$\u009e\3\2\2\2&(\5\4\3\2\')\7\4\2\2(\'\3\2\2"+
		"\2()\3\2\2\2)*\3\2\2\2*+\7\2\2\3+\3\3\2\2\2,.\5\6\4\2-,\3\2\2\2-.\3\2"+
		"\2\2.\63\3\2\2\2/\60\7\4\2\2\60\62\5\6\4\2\61/\3\2\2\2\62\65\3\2\2\2\63"+
		"\61\3\2\2\2\63\64\3\2\2\2\648\3\2\2\2\65\63\3\2\2\2\668\7\4\2\2\67-\3"+
		"\2\2\2\67\66\3\2\2\28\5\3\2\2\29D\5\22\n\2:D\5\20\t\2;D\5\24\13\2<D\5"+
		"\30\r\2=D\5\32\16\2>D\5\34\17\2?D\5\n\6\2@D\5\16\b\2AD\5\f\7\2BD\5\b\5"+
		"\2C9\3\2\2\2C:\3\2\2\2C;\3\2\2\2C<\3\2\2\2C=\3\2\2\2C>\3\2\2\2C?\3\2\2"+
		"\2C@\3\2\2\2CA\3\2\2\2CB\3\2\2\2D\7\3\2\2\2EF\7\31\2\2F\t\3\2\2\2GH\t"+
		"\2\2\2H\13\3\2\2\2IJ\7\27\2\2JN\5\"\22\2KM\5\"\22\2LK\3\2\2\2MP\3\2\2"+
		"\2NL\3\2\2\2NO\3\2\2\2O\r\3\2\2\2PN\3\2\2\2QR\7\30\2\2RV\5\"\22\2SU\5"+
		"\"\22\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\17\3\2\2\2XV\3\2\2\2"+
		"Y]\7\32\2\2Z\\\5\"\22\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^\21\3"+
		"\2\2\2_]\3\2\2\2`a\5\20\t\2ab\7\25\2\2bc\7\32\2\2c\23\3\2\2\2de\5\26\f"+
		"\2ef\7\32\2\2fg\7\26\2\2gh\5\"\22\2h\25\3\2\2\2ij\t\3\2\2j\27\3\2\2\2"+
		"kl\7\13\2\2lm\5\36\20\2mn\7\4\2\2ns\5\4\3\2op\7\4\2\2pq\7\f\2\2qr\7\4"+
		"\2\2rt\5\4\3\2so\3\2\2\2st\3\2\2\2tu\3\2\2\2uv\7\4\2\2vw\7\16\2\2w\31"+
		"\3\2\2\2xy\7\13\2\2yz\5\36\20\2z~\7\4\2\2{|\7\r\2\2|}\7\4\2\2}\177\5\4"+
		"\3\2~{\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\u0086\3\2\2\2\u0082\u0083\7\4\2\2\u0083\u0084\7\f\2\2\u0084\u0085\7\4"+
		"\2\2\u0085\u0087\5\4\3\2\u0086\u0082\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\u0089\7\4\2\2\u0089\u008a\7\16\2\2\u008a\33\3\2\2"+
		"\2\u008b\u008c\7\t\2\2\u008c\u008d\5\36\20\2\u008d\u008e\7\4\2\2\u008e"+
		"\u008f\5\4\3\2\u008f\u0090\7\4\2\2\u0090\u0091\7\n\2\2\u0091\35\3\2\2"+
		"\2\u0092\u0093\7\32\2\2\u0093\u0094\5 \21\2\u0094\u0095\5\"\22\2\u0095"+
		"\37\3\2\2\2\u0096\u0097\t\4\2\2\u0097!\3\2\2\2\u0098\u009d\7\33\2\2\u0099"+
		"\u009d\7\32\2\2\u009a\u009d\5$\23\2\u009b\u009d\7\34\2\2\u009c\u0098\3"+
		"\2\2\2\u009c\u0099\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009b\3\2\2\2\u009d"+
		"#\3\2\2\2\u009e\u009f\7\34\2\2\u009f\u00a0\7\3\2\2\u00a0\u00a1\7\34\2"+
		"\2\u00a1\u00a2\7\3\2\2\u00a2\u00a3\7\34\2\2\u00a3%\3\2\2\2\16(-\63\67"+
		"CNV]s\u0080\u0086\u009c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}