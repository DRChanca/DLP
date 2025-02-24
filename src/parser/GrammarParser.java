// Generated from java-escape by ANTLR 4.11.1
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, INT_LITERAL=33, CHAR_LITERAL=34, REAL_LITERAL=35, IDENT=36, 
		LINE_COMMENT=37, MULTILINE_COMMENT=38, WHITESPACE=39;
	public static final int
		RULE_program = 0, RULE_declaraciones = 1, RULE_declaracionstructs = 2, 
		RULE_declaracionglobales = 3, RULE_declaracionfuncion = 4, RULE_variablesLocales = 5, 
		RULE_argumento = 6, RULE_declaracion = 7, RULE_sentencia = 8, RULE_expr = 9, 
		RULE_asignacion = 10, RULE_tipo = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declaraciones", "declaracionstructs", "declaracionglobales", 
			"declaracionfuncion", "variablesLocales", "argumento", "declaracion", 
			"sentencia", "expr", "asignacion", "tipo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'struct'", "'{'", "'}'", "'var'", "'('", "','", "')'", "':'", 
			"'['", "']'", "';'", "'print'", "'read'", "'printsp'", "'println'", "'.'", 
			"'<'", "'>'", "'!'", "'*'", "'/'", "'+'", "'-'", "'<='", "'>='", "'=='", 
			"'&&'", "'||'", "'='", "'int'", "'float'", "'char'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "INT_LITERAL", 
			"CHAR_LITERAL", "REAL_LITERAL", "IDENT", "LINE_COMMENT", "MULTILINE_COMMENT", 
			"WHITESPACE"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public DeclaracionesContext declaraciones() {
			return getRuleContext(DeclaracionesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GrammarParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			declaraciones();
			setState(25);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionesContext extends ParserRuleContext {
		public List<DeclaracionstructsContext> declaracionstructs() {
			return getRuleContexts(DeclaracionstructsContext.class);
		}
		public DeclaracionstructsContext declaracionstructs(int i) {
			return getRuleContext(DeclaracionstructsContext.class,i);
		}
		public List<DeclaracionglobalesContext> declaracionglobales() {
			return getRuleContexts(DeclaracionglobalesContext.class);
		}
		public DeclaracionglobalesContext declaracionglobales(int i) {
			return getRuleContext(DeclaracionglobalesContext.class,i);
		}
		public List<DeclaracionfuncionContext> declaracionfuncion() {
			return getRuleContexts(DeclaracionfuncionContext.class);
		}
		public DeclaracionfuncionContext declaracionfuncion(int i) {
			return getRuleContext(DeclaracionfuncionContext.class,i);
		}
		public DeclaracionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaraciones; }
	}

	public final DeclaracionesContext declaraciones() throws RecognitionException {
		DeclaracionesContext _localctx = new DeclaracionesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaraciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(30);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(27);
					declaracionstructs();
					}
					break;
				case T__3:
					{
					setState(28);
					declaracionglobales();
					}
					break;
				case IDENT:
					{
					setState(29);
					declaracionfuncion();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(32); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 68719476754L) != 0 );
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionstructsContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public List<DeclaracionContext> declaracion() {
			return getRuleContexts(DeclaracionContext.class);
		}
		public DeclaracionContext declaracion(int i) {
			return getRuleContext(DeclaracionContext.class,i);
		}
		public DeclaracionstructsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionstructs; }
	}

	public final DeclaracionstructsContext declaracionstructs() throws RecognitionException {
		DeclaracionstructsContext _localctx = new DeclaracionstructsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracionstructs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(T__0);
			setState(35);
			match(IDENT);
			setState(36);
			match(T__1);
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(37);
				declaracion();
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionglobalesContext extends ParserRuleContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public DeclaracionglobalesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionglobales; }
	}

	public final DeclaracionglobalesContext declaracionglobales() throws RecognitionException {
		DeclaracionglobalesContext _localctx = new DeclaracionglobalesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracionglobales);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(T__3);
			setState(46);
			declaracion();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionfuncionContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public List<ArgumentoContext> argumento() {
			return getRuleContexts(ArgumentoContext.class);
		}
		public ArgumentoContext argumento(int i) {
			return getRuleContext(ArgumentoContext.class,i);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<VariablesLocalesContext> variablesLocales() {
			return getRuleContexts(VariablesLocalesContext.class);
		}
		public VariablesLocalesContext variablesLocales(int i) {
			return getRuleContext(VariablesLocalesContext.class,i);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public DeclaracionfuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionfuncion; }
	}

	public final DeclaracionfuncionContext declaracionfuncion() throws RecognitionException {
		DeclaracionfuncionContext _localctx = new DeclaracionfuncionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaracionfuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(IDENT);
			setState(49);
			match(T__4);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(50);
				argumento();
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(51);
					match(T__5);
					setState(52);
					argumento();
					}
					}
					setState(57);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			match(T__6);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(64);
				match(T__7);
				setState(65);
				tipo();
				}
			}

			setState(68);
			match(T__1);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(69);
				variablesLocales();
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 128849735712L) != 0) {
				{
				{
				setState(75);
				sentencia();
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariablesLocalesContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(GrammarParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(GrammarParser.IDENT, i);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<TerminalNode> INT_LITERAL() { return getTokens(GrammarParser.INT_LITERAL); }
		public TerminalNode INT_LITERAL(int i) {
			return getToken(GrammarParser.INT_LITERAL, i);
		}
		public VariablesLocalesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variablesLocales; }
	}

	public final VariablesLocalesContext variablesLocales() throws RecognitionException {
		VariablesLocalesContext _localctx = new VariablesLocalesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variablesLocales);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(T__3);
			setState(84);
			match(IDENT);
			setState(85);
			match(T__7);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(86);
				match(T__8);
				setState(87);
				match(INT_LITERAL);
				setState(88);
				match(T__9);
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
			case T__30:
			case T__31:
				{
				setState(94);
				tipo();
				}
				break;
			case IDENT:
				{
				setState(95);
				match(IDENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(98);
			match(T__10);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentoContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(GrammarParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(GrammarParser.IDENT, i);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ArgumentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumento; }
	}

	public final ArgumentoContext argumento() throws RecognitionException {
		ArgumentoContext _localctx = new ArgumentoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_argumento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(IDENT);
			setState(101);
			match(T__7);
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
			case T__30:
			case T__31:
				{
				setState(102);
				tipo();
				}
				break;
			case IDENT:
				{
				setState(103);
				match(IDENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(GrammarParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(GrammarParser.IDENT, i);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<TerminalNode> INT_LITERAL() { return getTokens(GrammarParser.INT_LITERAL); }
		public TerminalNode INT_LITERAL(int i) {
			return getToken(GrammarParser.INT_LITERAL, i);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declaracion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(IDENT);
			setState(107);
			match(T__7);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(108);
				match(T__8);
				setState(109);
				match(INT_LITERAL);
				setState(110);
				match(T__9);
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
			case T__30:
			case T__31:
				{
				setState(116);
				tipo();
				}
				break;
			case IDENT:
				{
				setState(117);
				match(IDENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(120);
			match(T__10);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_sentencia);
		int _la;
		try {
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				match(T__11);
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 128849674272L) != 0) {
					{
					setState(123);
					expr(0);
					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__5) {
						{
						{
						setState(124);
						match(T__5);
						setState(125);
						expr(0);
						}
						}
						setState(130);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(133);
				match(T__10);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(T__12);
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 128849674272L) != 0) {
					{
					setState(135);
					expr(0);
					setState(140);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__5) {
						{
						{
						setState(136);
						match(T__5);
						setState(137);
						expr(0);
						}
						}
						setState(142);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(145);
				match(T__10);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				match(T__13);
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 128849674272L) != 0) {
					{
					setState(147);
					expr(0);
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__5) {
						{
						{
						setState(148);
						match(T__5);
						setState(149);
						expr(0);
						}
						}
						setState(154);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(157);
				match(T__10);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(158);
				match(T__14);
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 128849674272L) != 0) {
					{
					setState(159);
					expr(0);
					setState(164);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__5) {
						{
						{
						setState(160);
						match(T__5);
						setState(161);
						expr(0);
						}
						}
						setState(166);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(169);
				match(T__10);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(170);
				match(IDENT);
				setState(171);
				match(T__4);
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 128849674272L) != 0) {
					{
					{
					setState(172);
					expr(0);
					setState(177);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__5) {
						{
						{
						setState(173);
						match(T__5);
						setState(174);
						expr(0);
						}
						}
						setState(179);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(184);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(185);
				match(T__6);
				setState(186);
				match(T__10);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(187);
				asignacion();
				setState(188);
				match(T__10);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public List<TerminalNode> INT_LITERAL() { return getTokens(GrammarParser.INT_LITERAL); }
		public TerminalNode INT_LITERAL(int i) {
			return getToken(GrammarParser.INT_LITERAL, i);
		}
		public TerminalNode REAL_LITERAL() { return getToken(GrammarParser.REAL_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(GrammarParser.CHAR_LITERAL, 0); }
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_LITERAL:
				{
				setState(193);
				match(INT_LITERAL);
				}
				break;
			case REAL_LITERAL:
				{
				setState(194);
				match(REAL_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				{
				setState(195);
				match(CHAR_LITERAL);
				}
				break;
			case IDENT:
				{
				setState(196);
				match(IDENT);
				setState(202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(197);
						match(T__8);
						setState(198);
						match(INT_LITERAL);
						setState(199);
						match(T__9);
						}
						} 
					}
					setState(204);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				}
				break;
			case T__4:
				{
				setState(205);
				match(T__4);
				setState(206);
				expr(0);
				setState(207);
				match(T__6);
				}
				break;
			case T__16:
				{
				setState(209);
				match(T__16);
				setState(210);
				tipo();
				setState(211);
				match(T__17);
				setState(212);
				match(T__4);
				setState(213);
				expr(0);
				setState(214);
				match(T__6);
				}
				break;
			case T__18:
				{
				setState(216);
				match(T__18);
				setState(217);
				expr(8);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(246);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(244);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(220);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(221);
						_la = _input.LA(1);
						if ( !(_la==T__19 || _la==T__20) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(222);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(223);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(224);
						_la = _input.LA(1);
						if ( !(_la==T__21 || _la==T__22) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(225);
						expr(7);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(226);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(227);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 50724864L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(228);
						expr(6);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(229);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(230);
						match(T__25);
						setState(231);
						expr(5);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(232);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(233);
						match(T__26);
						setState(234);
						expr(4);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(235);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(236);
						match(T__27);
						setState(237);
						expr(3);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(238);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(239);
						match(T__15);
						setState(240);
						expr(2);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(241);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(242);
						match(T__15);
						setState(243);
						match(IDENT);
						}
						break;
					}
					} 
				}
				setState(248);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AsignacionContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			expr(0);
			setState(250);
			match(T__28);
			setState(251);
			expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 7516192768L) != 0) ) {
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
		case 9:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		case 6:
			return precpred(_ctx, 1);
		case 7:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\'\u0100\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0004"+
		"\u0001\u001f\b\u0001\u000b\u0001\f\u0001 \u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u0002\'\b\u0002\n\u0002\f\u0002*\t\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u00046\b\u0004\n\u0004"+
		"\f\u00049\t\u0004\u0005\u0004;\b\u0004\n\u0004\f\u0004>\t\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004C\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004G\b\u0004\n\u0004\f\u0004J\t\u0004\u0001\u0004\u0005"+
		"\u0004M\b\u0004\n\u0004\f\u0004P\t\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005Z\b\u0005\n\u0005\f\u0005]\t\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005a\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006i\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007p\b\u0007\n\u0007\f\u0007s\t"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007w\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u007f\b\b\n\b\f\b\u0082"+
		"\t\b\u0003\b\u0084\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b"+
		"\u008b\b\b\n\b\f\b\u008e\t\b\u0003\b\u0090\b\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0005\b\u0097\b\b\n\b\f\b\u009a\t\b\u0003\b\u009c\b\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00a3\b\b\n\b\f\b\u00a6"+
		"\t\b\u0003\b\u00a8\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0005\b\u00b0\b\b\n\b\f\b\u00b3\t\b\u0005\b\u00b5\b\b\n\b\f\b\u00b8\t"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00bf\b\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00c9\b\t\n"+
		"\t\f\t\u00cc\t\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00db\b\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00f5\b\t\n\t\f\t\u00f8"+
		"\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0000\u0001\u0012\f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0000\u0004\u0001\u0000\u0014\u0015\u0001\u0000\u0016\u0017\u0002"+
		"\u0000\u0011\u0012\u0018\u0019\u0001\u0000\u001e \u011f\u0000\u0018\u0001"+
		"\u0000\u0000\u0000\u0002\u001e\u0001\u0000\u0000\u0000\u0004\"\u0001\u0000"+
		"\u0000\u0000\u0006-\u0001\u0000\u0000\u0000\b0\u0001\u0000\u0000\u0000"+
		"\nS\u0001\u0000\u0000\u0000\fd\u0001\u0000\u0000\u0000\u000ej\u0001\u0000"+
		"\u0000\u0000\u0010\u00be\u0001\u0000\u0000\u0000\u0012\u00da\u0001\u0000"+
		"\u0000\u0000\u0014\u00f9\u0001\u0000\u0000\u0000\u0016\u00fd\u0001\u0000"+
		"\u0000\u0000\u0018\u0019\u0003\u0002\u0001\u0000\u0019\u001a\u0005\u0000"+
		"\u0000\u0001\u001a\u0001\u0001\u0000\u0000\u0000\u001b\u001f\u0003\u0004"+
		"\u0002\u0000\u001c\u001f\u0003\u0006\u0003\u0000\u001d\u001f\u0003\b\u0004"+
		"\u0000\u001e\u001b\u0001\u0000\u0000\u0000\u001e\u001c\u0001\u0000\u0000"+
		"\u0000\u001e\u001d\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000"+
		" \u001e\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000!\u0003\u0001"+
		"\u0000\u0000\u0000\"#\u0005\u0001\u0000\u0000#$\u0005$\u0000\u0000$(\u0005"+
		"\u0002\u0000\u0000%\'\u0003\u000e\u0007\u0000&%\u0001\u0000\u0000\u0000"+
		"\'*\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000"+
		"\u0000)+\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000+,\u0005\u0003"+
		"\u0000\u0000,\u0005\u0001\u0000\u0000\u0000-.\u0005\u0004\u0000\u0000"+
		"./\u0003\u000e\u0007\u0000/\u0007\u0001\u0000\u0000\u000001\u0005$\u0000"+
		"\u00001<\u0005\u0005\u0000\u000027\u0003\f\u0006\u000034\u0005\u0006\u0000"+
		"\u000046\u0003\f\u0006\u000053\u0001\u0000\u0000\u000069\u0001\u0000\u0000"+
		"\u000075\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u00008;\u0001\u0000"+
		"\u0000\u000097\u0001\u0000\u0000\u0000:2\u0001\u0000\u0000\u0000;>\u0001"+
		"\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000"+
		"=?\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000?B\u0005\u0007\u0000"+
		"\u0000@A\u0005\b\u0000\u0000AC\u0003\u0016\u000b\u0000B@\u0001\u0000\u0000"+
		"\u0000BC\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DH\u0005\u0002"+
		"\u0000\u0000EG\u0003\n\u0005\u0000FE\u0001\u0000\u0000\u0000GJ\u0001\u0000"+
		"\u0000\u0000HF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IN\u0001"+
		"\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000KM\u0003\u0010\b\u0000LK\u0001"+
		"\u0000\u0000\u0000MP\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000"+
		"NO\u0001\u0000\u0000\u0000OQ\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000"+
		"\u0000QR\u0005\u0003\u0000\u0000R\t\u0001\u0000\u0000\u0000ST\u0005\u0004"+
		"\u0000\u0000TU\u0005$\u0000\u0000U[\u0005\b\u0000\u0000VW\u0005\t\u0000"+
		"\u0000WX\u0005!\u0000\u0000XZ\u0005\n\u0000\u0000YV\u0001\u0000\u0000"+
		"\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000"+
		"\u0000\u0000\\`\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000^a\u0003"+
		"\u0016\u000b\u0000_a\u0005$\u0000\u0000`^\u0001\u0000\u0000\u0000`_\u0001"+
		"\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u0005\u000b\u0000\u0000"+
		"c\u000b\u0001\u0000\u0000\u0000de\u0005$\u0000\u0000eh\u0005\b\u0000\u0000"+
		"fi\u0003\u0016\u000b\u0000gi\u0005$\u0000\u0000hf\u0001\u0000\u0000\u0000"+
		"hg\u0001\u0000\u0000\u0000i\r\u0001\u0000\u0000\u0000jk\u0005$\u0000\u0000"+
		"kq\u0005\b\u0000\u0000lm\u0005\t\u0000\u0000mn\u0005!\u0000\u0000np\u0005"+
		"\n\u0000\u0000ol\u0001\u0000\u0000\u0000ps\u0001\u0000\u0000\u0000qo\u0001"+
		"\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rv\u0001\u0000\u0000\u0000"+
		"sq\u0001\u0000\u0000\u0000tw\u0003\u0016\u000b\u0000uw\u0005$\u0000\u0000"+
		"vt\u0001\u0000\u0000\u0000vu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000"+
		"\u0000xy\u0005\u000b\u0000\u0000y\u000f\u0001\u0000\u0000\u0000z\u0083"+
		"\u0005\f\u0000\u0000{\u0080\u0003\u0012\t\u0000|}\u0005\u0006\u0000\u0000"+
		"}\u007f\u0003\u0012\t\u0000~|\u0001\u0000\u0000\u0000\u007f\u0082\u0001"+
		"\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000"+
		"\u0000\u0000\u0081\u0084\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000"+
		"\u0000\u0000\u0083{\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000"+
		"\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u00bf\u0005\u000b\u0000"+
		"\u0000\u0086\u008f\u0005\r\u0000\u0000\u0087\u008c\u0003\u0012\t\u0000"+
		"\u0088\u0089\u0005\u0006\u0000\u0000\u0089\u008b\u0003\u0012\t\u0000\u008a"+
		"\u0088\u0001\u0000\u0000\u0000\u008b\u008e\u0001\u0000\u0000\u0000\u008c"+
		"\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d"+
		"\u0090\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008f"+
		"\u0087\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090"+
		"\u0091\u0001\u0000\u0000\u0000\u0091\u00bf\u0005\u000b\u0000\u0000\u0092"+
		"\u009b\u0005\u000e\u0000\u0000\u0093\u0098\u0003\u0012\t\u0000\u0094\u0095"+
		"\u0005\u0006\u0000\u0000\u0095\u0097\u0003\u0012\t\u0000\u0096\u0094\u0001"+
		"\u0000\u0000\u0000\u0097\u009a\u0001\u0000\u0000\u0000\u0098\u0096\u0001"+
		"\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009c\u0001"+
		"\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009b\u0093\u0001"+
		"\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009d\u0001"+
		"\u0000\u0000\u0000\u009d\u00bf\u0005\u000b\u0000\u0000\u009e\u00a7\u0005"+
		"\u000f\u0000\u0000\u009f\u00a4\u0003\u0012\t\u0000\u00a0\u00a1\u0005\u0006"+
		"\u0000\u0000\u00a1\u00a3\u0003\u0012\t\u0000\u00a2\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a6\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a8\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a7\u009f\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000"+
		"\u0000\u00a9\u00bf\u0005\u000b\u0000\u0000\u00aa\u00ab\u0005$\u0000\u0000"+
		"\u00ab\u00b6\u0005\u0005\u0000\u0000\u00ac\u00b1\u0003\u0012\t\u0000\u00ad"+
		"\u00ae\u0005\u0006\u0000\u0000\u00ae\u00b0\u0003\u0012\t\u0000\u00af\u00ad"+
		"\u0001\u0000\u0000\u0000\u00b0\u00b3\u0001\u0000\u0000\u0000\u00b1\u00af"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b5"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b4\u00ac"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b8\u0001\u0000\u0000\u0000\u00b6\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b9"+
		"\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b9\u00ba"+
		"\u0005\u0007\u0000\u0000\u00ba\u00bf\u0005\u000b\u0000\u0000\u00bb\u00bc"+
		"\u0003\u0014\n\u0000\u00bc\u00bd\u0005\u000b\u0000\u0000\u00bd\u00bf\u0001"+
		"\u0000\u0000\u0000\u00bez\u0001\u0000\u0000\u0000\u00be\u0086\u0001\u0000"+
		"\u0000\u0000\u00be\u0092\u0001\u0000\u0000\u0000\u00be\u009e\u0001\u0000"+
		"\u0000\u0000\u00be\u00aa\u0001\u0000\u0000\u0000\u00be\u00bb\u0001\u0000"+
		"\u0000\u0000\u00bf\u0011\u0001\u0000\u0000\u0000\u00c0\u00c1\u0006\t\uffff"+
		"\uffff\u0000\u00c1\u00db\u0005!\u0000\u0000\u00c2\u00db\u0005#\u0000\u0000"+
		"\u00c3\u00db\u0005\"\u0000\u0000\u00c4\u00ca\u0005$\u0000\u0000\u00c5"+
		"\u00c6\u0005\t\u0000\u0000\u00c6\u00c7\u0005!\u0000\u0000\u00c7\u00c9"+
		"\u0005\n\u0000\u0000\u00c8\u00c5\u0001\u0000\u0000\u0000\u00c9\u00cc\u0001"+
		"\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001"+
		"\u0000\u0000\u0000\u00cb\u00db\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001"+
		"\u0000\u0000\u0000\u00cd\u00ce\u0005\u0005\u0000\u0000\u00ce\u00cf\u0003"+
		"\u0012\t\u0000\u00cf\u00d0\u0005\u0007\u0000\u0000\u00d0\u00db\u0001\u0000"+
		"\u0000\u0000\u00d1\u00d2\u0005\u0011\u0000\u0000\u00d2\u00d3\u0003\u0016"+
		"\u000b\u0000\u00d3\u00d4\u0005\u0012\u0000\u0000\u00d4\u00d5\u0005\u0005"+
		"\u0000\u0000\u00d5\u00d6\u0003\u0012\t\u0000\u00d6\u00d7\u0005\u0007\u0000"+
		"\u0000\u00d7\u00db\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005\u0013\u0000"+
		"\u0000\u00d9\u00db\u0003\u0012\t\b\u00da\u00c0\u0001\u0000\u0000\u0000"+
		"\u00da\u00c2\u0001\u0000\u0000\u0000\u00da\u00c3\u0001\u0000\u0000\u0000"+
		"\u00da\u00c4\u0001\u0000\u0000\u0000\u00da\u00cd\u0001\u0000\u0000\u0000"+
		"\u00da\u00d1\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000\u0000\u0000"+
		"\u00db\u00f6\u0001\u0000\u0000\u0000\u00dc\u00dd\n\u0007\u0000\u0000\u00dd"+
		"\u00de\u0007\u0000\u0000\u0000\u00de\u00f5\u0003\u0012\t\b\u00df\u00e0"+
		"\n\u0006\u0000\u0000\u00e0\u00e1\u0007\u0001\u0000\u0000\u00e1\u00f5\u0003"+
		"\u0012\t\u0007\u00e2\u00e3\n\u0005\u0000\u0000\u00e3\u00e4\u0007\u0002"+
		"\u0000\u0000\u00e4\u00f5\u0003\u0012\t\u0006\u00e5\u00e6\n\u0004\u0000"+
		"\u0000\u00e6\u00e7\u0005\u001a\u0000\u0000\u00e7\u00f5\u0003\u0012\t\u0005"+
		"\u00e8\u00e9\n\u0003\u0000\u0000\u00e9\u00ea\u0005\u001b\u0000\u0000\u00ea"+
		"\u00f5\u0003\u0012\t\u0004\u00eb\u00ec\n\u0002\u0000\u0000\u00ec\u00ed"+
		"\u0005\u001c\u0000\u0000\u00ed\u00f5\u0003\u0012\t\u0003\u00ee\u00ef\n"+
		"\u0001\u0000\u0000\u00ef\u00f0\u0005\u0010\u0000\u0000\u00f0\u00f5\u0003"+
		"\u0012\t\u0002\u00f1\u00f2\n\n\u0000\u0000\u00f2\u00f3\u0005\u0010\u0000"+
		"\u0000\u00f3\u00f5\u0005$\u0000\u0000\u00f4\u00dc\u0001\u0000\u0000\u0000"+
		"\u00f4\u00df\u0001\u0000\u0000\u0000\u00f4\u00e2\u0001\u0000\u0000\u0000"+
		"\u00f4\u00e5\u0001\u0000\u0000\u0000\u00f4\u00e8\u0001\u0000\u0000\u0000"+
		"\u00f4\u00eb\u0001\u0000\u0000\u0000\u00f4\u00ee\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f1\u0001\u0000\u0000\u0000\u00f5\u00f8\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000"+
		"\u00f7\u0013\u0001\u0000\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000"+
		"\u00f9\u00fa\u0003\u0012\t\u0000\u00fa\u00fb\u0005\u001d\u0000\u0000\u00fb"+
		"\u00fc\u0003\u0012\t\u0000\u00fc\u0015\u0001\u0000\u0000\u0000\u00fd\u00fe"+
		"\u0007\u0003\u0000\u0000\u00fe\u0017\u0001\u0000\u0000\u0000\u001c\u001e"+
		" (7<BHN[`hqv\u0080\u0083\u008c\u008f\u0098\u009b\u00a4\u00a7\u00b1\u00b6"+
		"\u00be\u00ca\u00da\u00f4\u00f6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}