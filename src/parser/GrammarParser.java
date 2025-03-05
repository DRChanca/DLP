// Generated from java-escape by ANTLR 4.11.1
package parser;

	    import ast.declaraciones.*;
	    import ast.tipo.*;
	    import ast.sentencia.*;
	    import ast.expression.*;
	    import ast.*;

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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, INT_LITERAL=38, 
		CHAR_LITERAL=39, REAL_LITERAL=40, IDENT=41, LINE_COMMENT=42, MULTILINE_COMMENT=43, 
		WHITESPACE=44;
	public static final int
		RULE_program = 0, RULE_declaraciones = 1, RULE_declaracionstructs = 2, 
		RULE_declaracionglobales = 3, RULE_declaracionfuncion = 4, RULE_variablesLocales = 5, 
		RULE_listaVariablesLocales = 6, RULE_argumento = 7, RULE_argumentos = 8, 
		RULE_declaracion = 9, RULE_listdeclaraciones = 10, RULE_sentencia = 11, 
		RULE_sentencias = 12, RULE_expresiones = 13, RULE_expr = 14, RULE_tipo = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declaraciones", "declaracionstructs", "declaracionglobales", 
			"declaracionfuncion", "variablesLocales", "listaVariablesLocales", "argumento", 
			"argumentos", "declaracion", "listdeclaraciones", "sentencia", "sentencias", 
			"expresiones", "expr", "tipo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'struct'", "'{'", "'}'", "'var'", "'('", "')'", "':'", "';'", 
			"','", "'print'", "'read'", "'printsp'", "'println'", "'='", "'return'", 
			"'if'", "'else'", "'while'", "'.'", "'['", "']'", "'<'", "'>'", "'!'", 
			"'*'", "'/'", "'+'", "'-'", "'<='", "'>='", "'=='", "'!='", "'&&'", "'||'", 
			"'int'", "'float'", "'char'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "INT_LITERAL", "CHAR_LITERAL", "REAL_LITERAL", "IDENT", "LINE_COMMENT", 
			"MULTILINE_COMMENT", "WHITESPACE"
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
		public Program ast;
		public DeclaracionesContext declaraciones;
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
			setState(32);
			((ProgramContext)_localctx).declaraciones = declaraciones();
			setState(33);
			match(EOF);
			 ((ProgramContext)_localctx).ast =  new Program(((ProgramContext)_localctx).declaraciones.list); 
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
		public List<Declaraciones> list = new ArrayList<Declaraciones>();
		public DeclaracionstructsContext declaracionstructs;
		public DeclaracionglobalesContext declaracionglobales;
		public DeclaracionfuncionContext declaracionfuncion;
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
			setState(45); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(45);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(36);
					((DeclaracionesContext)_localctx).declaracionstructs = declaracionstructs();
					 _localctx.list.add( ((DeclaracionesContext)_localctx).declaracionstructs.ast); 
					}
					break;
				case T__3:
					{
					setState(39);
					((DeclaracionesContext)_localctx).declaracionglobales = declaracionglobales();
					 _localctx.list.add( ((DeclaracionesContext)_localctx).declaracionglobales.ast); 
					}
					break;
				case IDENT:
					{
					setState(42);
					((DeclaracionesContext)_localctx).declaracionfuncion = declaracionfuncion();
					 _localctx.list.add( ((DeclaracionesContext)_localctx).declaracionfuncion.ast); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(47); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 2199023255570L) != 0 );
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
		public Declaraciones ast;
		public Token IDENT;
		public ListdeclaracionesContext listdeclaraciones;
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public ListdeclaracionesContext listdeclaraciones() {
			return getRuleContext(ListdeclaracionesContext.class,0);
		}
		public DeclaracionstructsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionstructs; }
	}

	public final DeclaracionstructsContext declaracionstructs() throws RecognitionException {
		DeclaracionstructsContext _localctx = new DeclaracionstructsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracionstructs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(T__0);
			setState(50);
			((DeclaracionstructsContext)_localctx).IDENT = match(IDENT);
			setState(51);
			match(T__1);
			setState(52);
			((DeclaracionstructsContext)_localctx).listdeclaraciones = listdeclaraciones();
			setState(53);
			match(T__2);
			 ((DeclaracionstructsContext)_localctx).ast =  new Declaracionstructs((((DeclaracionstructsContext)_localctx).IDENT!=null?((DeclaracionstructsContext)_localctx).IDENT.getText():null), ((DeclaracionstructsContext)_localctx).listdeclaraciones.list); 
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
		public Declaraciones ast;
		public DeclaracionContext declaracion;
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
			setState(56);
			match(T__3);
			setState(57);
			((DeclaracionglobalesContext)_localctx).declaracion = declaracion();
			 ((DeclaracionglobalesContext)_localctx).ast =  new Declaracionglobales(((DeclaracionglobalesContext)_localctx).declaracion.ast); 
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
		public Declaraciones ast;
		public Token IDENT;
		public ArgumentosContext argumentos;
		public TipoContext tipo;
		public ListaVariablesLocalesContext listaVariablesLocales;
		public SentenciasContext sentencias;
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public ListaVariablesLocalesContext listaVariablesLocales() {
			return getRuleContext(ListaVariablesLocalesContext.class,0);
		}
		public SentenciasContext sentencias() {
			return getRuleContext(SentenciasContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
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
			setState(60);
			((DeclaracionfuncionContext)_localctx).IDENT = match(IDENT);
			setState(61);
			match(T__4);
			setState(62);
			((DeclaracionfuncionContext)_localctx).argumentos = argumentos();
			setState(63);
			match(T__5);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(64);
				match(T__6);
				setState(65);
				((DeclaracionfuncionContext)_localctx).tipo = tipo();
				}
			}

			setState(68);
			match(T__1);
			setState(69);
			((DeclaracionfuncionContext)_localctx).listaVariablesLocales = listaVariablesLocales();
			setState(70);
			((DeclaracionfuncionContext)_localctx).sentencias = sentencias();
			setState(71);
			match(T__2);
			 ((DeclaracionfuncionContext)_localctx).ast =  new Declaracionfuncion((((DeclaracionfuncionContext)_localctx).IDENT!=null?((DeclaracionfuncionContext)_localctx).IDENT.getText():null), ((DeclaracionfuncionContext)_localctx).argumentos.list, (((DeclaracionfuncionContext)_localctx).tipo == null) ? null : ((DeclaracionfuncionContext)_localctx).tipo.ast, ((DeclaracionfuncionContext)_localctx).listaVariablesLocales.list, ((DeclaracionfuncionContext)_localctx).sentencias.list); 
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
		public VariablesLocales ast;
		public Token IDENT;
		public TipoContext tipo;
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public VariablesLocalesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variablesLocales; }
	}

	public final VariablesLocalesContext variablesLocales() throws RecognitionException {
		VariablesLocalesContext _localctx = new VariablesLocalesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variablesLocales);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(T__3);
			setState(75);
			((VariablesLocalesContext)_localctx).IDENT = match(IDENT);
			setState(76);
			match(T__6);
			setState(77);
			((VariablesLocalesContext)_localctx).tipo = tipo();
			setState(78);
			match(T__7);
			 ((VariablesLocalesContext)_localctx).ast =  new VariablesLocales((((VariablesLocalesContext)_localctx).IDENT!=null?((VariablesLocalesContext)_localctx).IDENT.getText():null), ((VariablesLocalesContext)_localctx).tipo.ast); 
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
	public static class ListaVariablesLocalesContext extends ParserRuleContext {
		public List<VariablesLocales> list = new ArrayList<VariablesLocales>();
		public VariablesLocalesContext variablesLocales;
		public List<VariablesLocalesContext> variablesLocales() {
			return getRuleContexts(VariablesLocalesContext.class);
		}
		public VariablesLocalesContext variablesLocales(int i) {
			return getRuleContext(VariablesLocalesContext.class,i);
		}
		public ListaVariablesLocalesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaVariablesLocales; }
	}

	public final ListaVariablesLocalesContext listaVariablesLocales() throws RecognitionException {
		ListaVariablesLocalesContext _localctx = new ListaVariablesLocalesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_listaVariablesLocales);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(81);
				((ListaVariablesLocalesContext)_localctx).variablesLocales = variablesLocales();
				_localctx.list.add(((ListaVariablesLocalesContext)_localctx).variablesLocales.ast);
				}
				}
				setState(88);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentoContext extends ParserRuleContext {
		public Argumento ast;
		public Token IDENT;
		public TipoContext tipo;
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
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
		enterRule(_localctx, 14, RULE_argumento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			((ArgumentoContext)_localctx).IDENT = match(IDENT);
			setState(90);
			match(T__6);
			setState(91);
			((ArgumentoContext)_localctx).tipo = tipo();
			 ((ArgumentoContext)_localctx).ast =  new Argumento((((ArgumentoContext)_localctx).IDENT!=null?((ArgumentoContext)_localctx).IDENT.getText():null), ((ArgumentoContext)_localctx).tipo.ast); 
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
	public static class ArgumentosContext extends ParserRuleContext {
		public List<Argumento> list = new ArrayList<Argumento>();
		public ArgumentoContext argumento;
		public List<ArgumentoContext> argumento() {
			return getRuleContexts(ArgumentoContext.class);
		}
		public ArgumentoContext argumento(int i) {
			return getRuleContext(ArgumentoContext.class,i);
		}
		public ArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos; }
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_argumentos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(94);
				((ArgumentosContext)_localctx).argumento = argumento();
				_localctx.list.add(((ArgumentosContext)_localctx).argumento.ast);
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(96);
					match(T__8);
					setState(97);
					((ArgumentosContext)_localctx).argumento = argumento();
					_localctx.list.add(((ArgumentosContext)_localctx).argumento.ast);
					}
					}
					setState(104);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(109);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionContext extends ParserRuleContext {
		public Declaracion ast;
		public Token IDENT;
		public TipoContext tipo;
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			((DeclaracionContext)_localctx).IDENT = match(IDENT);
			setState(111);
			match(T__6);
			setState(112);
			((DeclaracionContext)_localctx).tipo = tipo();
			setState(113);
			match(T__7);
			 ((DeclaracionContext)_localctx).ast =  new Declaracion((((DeclaracionContext)_localctx).IDENT!=null?((DeclaracionContext)_localctx).IDENT.getText():null), ((DeclaracionContext)_localctx).tipo.ast); 
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
	public static class ListdeclaracionesContext extends ParserRuleContext {
		public List<Declaracion> list = new ArrayList<Declaracion>();
		public DeclaracionContext declaracion;
		public List<DeclaracionContext> declaracion() {
			return getRuleContexts(DeclaracionContext.class);
		}
		public DeclaracionContext declaracion(int i) {
			return getRuleContext(DeclaracionContext.class,i);
		}
		public ListdeclaracionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listdeclaraciones; }
	}

	public final ListdeclaracionesContext listdeclaraciones() throws RecognitionException {
		ListdeclaracionesContext _localctx = new ListdeclaracionesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_listdeclaraciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(116);
				((ListdeclaracionesContext)_localctx).declaracion = declaracion();
				_localctx.list.add(((ListdeclaracionesContext)_localctx).declaracion.ast);
				}
				}
				setState(123);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaContext extends ParserRuleContext {
		public Sentencia ast;
		public ExpresionesContext expresiones;
		public Token IDENT;
		public ExprContext left;
		public ExprContext right;
		public ExprContext expr;
		public SentenciasContext entonces;
		public SentenciasContext otro;
		public ExpresionesContext expresiones() {
			return getRuleContext(ExpresionesContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<SentenciasContext> sentencias() {
			return getRuleContexts(SentenciasContext.class);
		}
		public SentenciasContext sentencias(int i) {
			return getRuleContext(SentenciasContext.class,i);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_sentencia);
		int _la;
		try {
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(T__9);
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 4123189575712L) != 0) {
					{
					setState(125);
					((SentenciaContext)_localctx).expresiones = expresiones();
					}
				}

				setState(128);
				match(T__7);
				 ((SentenciaContext)_localctx).ast =  new PrintSentencia(((SentenciaContext)_localctx).expresiones == null ? new ArrayList<Expression>() : ((SentenciaContext)_localctx).expresiones.list); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				match(T__10);
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 4123189575712L) != 0) {
					{
					setState(131);
					((SentenciaContext)_localctx).expresiones = expresiones();
					}
				}

				setState(134);
				match(T__7);
				 ((SentenciaContext)_localctx).ast =  new ReadSentencia(((SentenciaContext)_localctx).expresiones == null ? new ArrayList<Expression>() : ((SentenciaContext)_localctx).expresiones.list); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				match(T__11);
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 4123189575712L) != 0) {
					{
					setState(137);
					((SentenciaContext)_localctx).expresiones = expresiones();
					}
				}

				setState(140);
				match(T__7);
				 ((SentenciaContext)_localctx).ast =  new PrintspSentencia(((SentenciaContext)_localctx).expresiones == null ? new ArrayList<Expression>() : ((SentenciaContext)_localctx).expresiones.list); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
				match(T__12);
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 4123189575712L) != 0) {
					{
					setState(143);
					((SentenciaContext)_localctx).expresiones = expresiones();
					}
				}

				setState(146);
				match(T__7);
				 ((SentenciaContext)_localctx).ast =  new PrintlnSentencia(((SentenciaContext)_localctx).expresiones == null ? new ArrayList<Expression>() : ((SentenciaContext)_localctx).expresiones.list); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(148);
				((SentenciaContext)_localctx).IDENT = match(IDENT);
				setState(149);
				match(T__4);
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 4123189575712L) != 0) {
					{
					setState(150);
					((SentenciaContext)_localctx).expresiones = expresiones();
					}
				}

				setState(153);
				match(T__5);
				setState(154);
				match(T__7);
				 ((SentenciaContext)_localctx).ast =  new FuncionSentencia((((SentenciaContext)_localctx).IDENT!=null?((SentenciaContext)_localctx).IDENT.getText():null), ((SentenciaContext)_localctx).expresiones == null ? new ArrayList<Expression>() : ((SentenciaContext)_localctx).expresiones.list); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(156);
				((SentenciaContext)_localctx).left = expr(0);
				setState(157);
				match(T__13);
				setState(158);
				((SentenciaContext)_localctx).right = expr(0);
				setState(159);
				match(T__7);
				 ((SentenciaContext)_localctx).ast =  new AsignacionSentencia(((SentenciaContext)_localctx).left.ast, ((SentenciaContext)_localctx).right.ast);  
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(162);
				match(T__14);
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 4123189575712L) != 0) {
					{
					setState(163);
					((SentenciaContext)_localctx).expr = expr(0);
					}
				}

				setState(166);
				match(T__7);
				 ((SentenciaContext)_localctx).ast =  new ReturnSentencia((((SentenciaContext)_localctx).expr == null) ? null : ((SentenciaContext)_localctx).expr.ast); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(168);
				match(T__15);
				setState(169);
				match(T__4);
				setState(170);
				((SentenciaContext)_localctx).expr = expr(0);
				setState(171);
				match(T__5);
				setState(172);
				match(T__1);
				setState(173);
				((SentenciaContext)_localctx).entonces = sentencias();
				setState(174);
				match(T__2);
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__16) {
					{
					setState(175);
					match(T__16);
					setState(176);
					match(T__1);
					setState(177);
					((SentenciaContext)_localctx).otro = sentencias();
					setState(178);
					match(T__2);
					}
				}

				 ((SentenciaContext)_localctx).ast =  new IfSentencia(((SentenciaContext)_localctx).expr.ast, ((SentenciaContext)_localctx).entonces == null ? new ArrayList<Sentencia>() : ((SentenciaContext)_localctx).entonces.list, ((SentenciaContext)_localctx).otro == null ? new ArrayList<Sentencia>() : ((SentenciaContext)_localctx).otro.list); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(184);
				match(T__17);
				setState(185);
				match(T__4);
				setState(186);
				((SentenciaContext)_localctx).expr = expr(0);
				setState(187);
				match(T__5);
				setState(188);
				match(T__1);
				setState(189);
				((SentenciaContext)_localctx).entonces = sentencias();
				setState(190);
				match(T__2);
				 ((SentenciaContext)_localctx).ast =  new WhileSentencia(((SentenciaContext)_localctx).expr.ast, ((SentenciaContext)_localctx).entonces == null ? new ArrayList<Sentencia>() : ((SentenciaContext)_localctx).entonces.list); 
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
	public static class SentenciasContext extends ParserRuleContext {
		public List<Sentencia> list = new ArrayList<Sentencia>();
		public SentenciaContext sentencia;
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public SentenciasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencias; }
	}

	public final SentenciasContext sentencias() throws RecognitionException {
		SentenciasContext _localctx = new SentenciasContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_sentencias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 4123189951520L) != 0) {
				{
				{
				setState(195);
				((SentenciasContext)_localctx).sentencia = sentencia();
				_localctx.list.add(((SentenciasContext)_localctx).sentencia.ast);
				}
				}
				setState(202);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionesContext extends ParserRuleContext {
		public List<Expression> list = new ArrayList<Expression>();
		public ExprContext expr;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExpresionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresiones; }
	}

	public final ExpresionesContext expresiones() throws RecognitionException {
		ExpresionesContext _localctx = new ExpresionesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expresiones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			((ExpresionesContext)_localctx).expr = expr(0);
			_localctx.list.add(((ExpresionesContext)_localctx).expr.ast);
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(205);
				match(T__8);
				setState(206);
				((ExpresionesContext)_localctx).expr = expr(0);
				_localctx.list.add(((ExpresionesContext)_localctx).expr.ast);
				}
				}
				setState(213);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public Expression ast;
		public ExprContext left;
		public ExprContext acceso;
		public Token INT_LITERAL;
		public Token REAL_LITERAL;
		public Token IDENT;
		public Token CHAR_LITERAL;
		public ExprContext expr;
		public TipoContext tipo;
		public ExpresionesContext expresiones;
		public Token operator;
		public ExprContext right;
		public ExprContext indice;
		public TerminalNode INT_LITERAL() { return getToken(GrammarParser.INT_LITERAL, 0); }
		public TerminalNode REAL_LITERAL() { return getToken(GrammarParser.REAL_LITERAL, 0); }
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(GrammarParser.CHAR_LITERAL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ExpresionesContext expresiones() {
			return getRuleContext(ExpresionesContext.class,0);
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(215);
				((ExprContext)_localctx).INT_LITERAL = match(INT_LITERAL);
				 ((ExprContext)_localctx).ast =  new IntExpresion(((ExprContext)_localctx).INT_LITERAL); 
				}
				break;
			case 2:
				{
				setState(217);
				((ExprContext)_localctx).REAL_LITERAL = match(REAL_LITERAL);
				 ((ExprContext)_localctx).ast =  new RealExpresion(((ExprContext)_localctx).REAL_LITERAL); 
				}
				break;
			case 3:
				{
				setState(219);
				((ExprContext)_localctx).IDENT = match(IDENT);
				 ((ExprContext)_localctx).ast =  new IdentificadorExpresion(((ExprContext)_localctx).IDENT); 
				}
				break;
			case 4:
				{
				setState(221);
				((ExprContext)_localctx).CHAR_LITERAL = match(CHAR_LITERAL);
				 ((ExprContext)_localctx).ast =  new CharExpresion(((ExprContext)_localctx).CHAR_LITERAL); 
				}
				break;
			case 5:
				{
				setState(223);
				match(T__4);
				setState(224);
				((ExprContext)_localctx).expr = expr(0);
				setState(225);
				match(T__5);
				 ((ExprContext)_localctx).ast =  new ParentesisExpresion(((ExprContext)_localctx).expr.ast); 
				}
				break;
			case 6:
				{
				setState(228);
				match(T__21);
				setState(229);
				((ExprContext)_localctx).tipo = tipo();
				setState(230);
				match(T__22);
				setState(231);
				match(T__4);
				setState(232);
				((ExprContext)_localctx).expr = expr(0);
				setState(233);
				match(T__5);
				 ((ExprContext)_localctx).ast =  new CastExpresion(((ExprContext)_localctx).tipo.ast, ((ExprContext)_localctx).expr.ast); 
				}
				break;
			case 7:
				{
				setState(236);
				match(T__23);
				setState(237);
				((ExprContext)_localctx).expr = expr(8);
				 ((ExprContext)_localctx).ast =  new NegacionExpresion(((ExprContext)_localctx).expr.ast); 
				}
				break;
			case 8:
				{
				setState(240);
				((ExprContext)_localctx).IDENT = match(IDENT);
				setState(241);
				match(T__4);
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 4123189575712L) != 0) {
					{
					setState(242);
					((ExprContext)_localctx).expresiones = expresiones();
					}
				}

				setState(245);
				match(T__5);
				 ((ExprContext)_localctx).ast =  new FuncionExpresion((((ExprContext)_localctx).IDENT!=null?((ExprContext)_localctx).IDENT.getText():null), ((ExprContext)_localctx).expresiones == null ? null : ((ExprContext)_localctx).expresiones.list); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(291);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(289);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(249);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(250);
						((ExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__24 || _la==T__25) ) {
							((ExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(251);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(8);
						 ((ExprContext)_localctx).ast =  new ArithmeticExpresion(((ExprContext)_localctx).left.ast, (((ExprContext)_localctx).operator!=null?((ExprContext)_localctx).operator.getText():null), ((ExprContext)_localctx).right.ast); 
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(254);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(255);
						((ExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__26 || _la==T__27) ) {
							((ExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(256);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(7);
						 ((ExprContext)_localctx).ast =  new ArithmeticExpresion(((ExprContext)_localctx).left.ast, (((ExprContext)_localctx).operator!=null?((ExprContext)_localctx).operator.getText():null), ((ExprContext)_localctx).right.ast); 
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(259);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(260);
						((ExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 1623195648L) != 0) ) {
							((ExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(261);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(6);
						 ((ExprContext)_localctx).ast =  new LogicExpression(((ExprContext)_localctx).left.ast, (((ExprContext)_localctx).operator!=null?((ExprContext)_localctx).operator.getText():null), ((ExprContext)_localctx).right.ast); 
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(264);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(265);
						((ExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__30 || _la==T__31) ) {
							((ExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(266);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(5);
						 ((ExprContext)_localctx).ast =  new LogicExpression(((ExprContext)_localctx).left.ast, (((ExprContext)_localctx).operator!=null?((ExprContext)_localctx).operator.getText():null), ((ExprContext)_localctx).right.ast); 
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(269);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(270);
						((ExprContext)_localctx).operator = match(T__32);
						setState(271);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(4);
						 ((ExprContext)_localctx).ast =  new LogicExpression(((ExprContext)_localctx).left.ast, (((ExprContext)_localctx).operator!=null?((ExprContext)_localctx).operator.getText():null), ((ExprContext)_localctx).right.ast); 
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(274);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(275);
						((ExprContext)_localctx).operator = match(T__33);
						setState(276);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(3);
						 ((ExprContext)_localctx).ast =  new LogicExpression(((ExprContext)_localctx).left.ast, (((ExprContext)_localctx).operator!=null?((ExprContext)_localctx).operator.getText():null), ((ExprContext)_localctx).right.ast); 
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(279);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(280);
						match(T__18);
						setState(281);
						((ExprContext)_localctx).IDENT = match(IDENT);
						 ((ExprContext)_localctx).ast =  new AcederCap(((ExprContext)_localctx).left.ast, (((ExprContext)_localctx).IDENT!=null?((ExprContext)_localctx).IDENT.getText():null));
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.acceso = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(283);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(284);
						match(T__19);
						setState(285);
						((ExprContext)_localctx).indice = ((ExprContext)_localctx).expr = expr(0);
						setState(286);
						match(T__20);
						 ((ExprContext)_localctx).ast =  new AccessoArrayExpresion(((ExprContext)_localctx).acceso.ast, ((ExprContext)_localctx).indice.ast); 
						}
						break;
					}
					} 
				}
				setState(293);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
	public static class TipoContext extends ParserRuleContext {
		public Tipo ast;
		public Token var;
		public Token INT_LITERAL;
		public TipoContext tipo;
		public Token IDENT;
		public TerminalNode INT_LITERAL() { return getToken(GrammarParser.INT_LITERAL, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_tipo);
		try {
			setState(308);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				((TipoContext)_localctx).var = match(T__34);
				 ((TipoContext)_localctx).ast =  new IntTipo(((TipoContext)_localctx).var); 
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				((TipoContext)_localctx).var = match(T__35);
				 ((TipoContext)_localctx).ast =  new FloatTipo(((TipoContext)_localctx).var); 
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 3);
				{
				setState(298);
				((TipoContext)_localctx).var = match(T__36);
				 ((TipoContext)_localctx).ast =  new CharTipo(((TipoContext)_localctx).var); 
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 4);
				{
				setState(300);
				match(T__19);
				setState(301);
				((TipoContext)_localctx).INT_LITERAL = match(INT_LITERAL);
				setState(302);
				match(T__20);
				setState(303);
				((TipoContext)_localctx).tipo = tipo();
				 ((TipoContext)_localctx).ast =  new ArrayTipo(((TipoContext)_localctx).INT_LITERAL, ((TipoContext)_localctx).tipo.ast); 
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(306);
				((TipoContext)_localctx).IDENT = match(IDENT);
				 ((TipoContext)_localctx).ast =  new StringTipo((((TipoContext)_localctx).IDENT!=null?((TipoContext)_localctx).IDENT.getText():null)); 
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		case 14:
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
			return precpred(_ctx, 12);
		case 7:
			return precpred(_ctx, 11);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001,\u0137\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0004\u0001.\b\u0001\u000b\u0001\f\u0001/\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004C\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006U\b\u0006\n\u0006"+
		"\f\u0006X\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\be\b\b\n"+
		"\b\f\bh\t\b\u0005\bj\b\b\n\b\f\bm\t\b\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0005\nx\b\n\n\n\f\n{\t\n\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u007f\b\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u0085\b\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u008b\b\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u0091\b\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0098\b\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00a5\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u00b5\b\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00c2\b\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0005\f\u00c7\b\f\n\f\f\f\u00ca\t\f\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0005\r\u00d2\b\r\n\r\f\r\u00d5\t\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00f4\b\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u00f8\b\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0005\u000e\u0122\b\u000e\n\u000e\f\u000e\u0125"+
		"\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0135\b\u000f\u0001\u000f\u0000"+
		"\u0001\u001c\u0010\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e\u0000\u0004\u0001\u0000\u0019\u001a\u0001"+
		"\u0000\u001b\u001c\u0002\u0000\u0016\u0017\u001d\u001e\u0001\u0000\u001f"+
		" \u0153\u0000 \u0001\u0000\u0000\u0000\u0002-\u0001\u0000\u0000\u0000"+
		"\u00041\u0001\u0000\u0000\u0000\u00068\u0001\u0000\u0000\u0000\b<\u0001"+
		"\u0000\u0000\u0000\nJ\u0001\u0000\u0000\u0000\fV\u0001\u0000\u0000\u0000"+
		"\u000eY\u0001\u0000\u0000\u0000\u0010k\u0001\u0000\u0000\u0000\u0012n"+
		"\u0001\u0000\u0000\u0000\u0014y\u0001\u0000\u0000\u0000\u0016\u00c1\u0001"+
		"\u0000\u0000\u0000\u0018\u00c8\u0001\u0000\u0000\u0000\u001a\u00cb\u0001"+
		"\u0000\u0000\u0000\u001c\u00f7\u0001\u0000\u0000\u0000\u001e\u0134\u0001"+
		"\u0000\u0000\u0000 !\u0003\u0002\u0001\u0000!\"\u0005\u0000\u0000\u0001"+
		"\"#\u0006\u0000\uffff\uffff\u0000#\u0001\u0001\u0000\u0000\u0000$%\u0003"+
		"\u0004\u0002\u0000%&\u0006\u0001\uffff\uffff\u0000&.\u0001\u0000\u0000"+
		"\u0000\'(\u0003\u0006\u0003\u0000()\u0006\u0001\uffff\uffff\u0000).\u0001"+
		"\u0000\u0000\u0000*+\u0003\b\u0004\u0000+,\u0006\u0001\uffff\uffff\u0000"+
		",.\u0001\u0000\u0000\u0000-$\u0001\u0000\u0000\u0000-\'\u0001\u0000\u0000"+
		"\u0000-*\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/-\u0001\u0000"+
		"\u0000\u0000/0\u0001\u0000\u0000\u00000\u0003\u0001\u0000\u0000\u0000"+
		"12\u0005\u0001\u0000\u000023\u0005)\u0000\u000034\u0005\u0002\u0000\u0000"+
		"45\u0003\u0014\n\u000056\u0005\u0003\u0000\u000067\u0006\u0002\uffff\uffff"+
		"\u00007\u0005\u0001\u0000\u0000\u000089\u0005\u0004\u0000\u00009:\u0003"+
		"\u0012\t\u0000:;\u0006\u0003\uffff\uffff\u0000;\u0007\u0001\u0000\u0000"+
		"\u0000<=\u0005)\u0000\u0000=>\u0005\u0005\u0000\u0000>?\u0003\u0010\b"+
		"\u0000?B\u0005\u0006\u0000\u0000@A\u0005\u0007\u0000\u0000AC\u0003\u001e"+
		"\u000f\u0000B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CD\u0001"+
		"\u0000\u0000\u0000DE\u0005\u0002\u0000\u0000EF\u0003\f\u0006\u0000FG\u0003"+
		"\u0018\f\u0000GH\u0005\u0003\u0000\u0000HI\u0006\u0004\uffff\uffff\u0000"+
		"I\t\u0001\u0000\u0000\u0000JK\u0005\u0004\u0000\u0000KL\u0005)\u0000\u0000"+
		"LM\u0005\u0007\u0000\u0000MN\u0003\u001e\u000f\u0000NO\u0005\b\u0000\u0000"+
		"OP\u0006\u0005\uffff\uffff\u0000P\u000b\u0001\u0000\u0000\u0000QR\u0003"+
		"\n\u0005\u0000RS\u0006\u0006\uffff\uffff\u0000SU\u0001\u0000\u0000\u0000"+
		"TQ\u0001\u0000\u0000\u0000UX\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000"+
		"\u0000VW\u0001\u0000\u0000\u0000W\r\u0001\u0000\u0000\u0000XV\u0001\u0000"+
		"\u0000\u0000YZ\u0005)\u0000\u0000Z[\u0005\u0007\u0000\u0000[\\\u0003\u001e"+
		"\u000f\u0000\\]\u0006\u0007\uffff\uffff\u0000]\u000f\u0001\u0000\u0000"+
		"\u0000^_\u0003\u000e\u0007\u0000_f\u0006\b\uffff\uffff\u0000`a\u0005\t"+
		"\u0000\u0000ab\u0003\u000e\u0007\u0000bc\u0006\b\uffff\uffff\u0000ce\u0001"+
		"\u0000\u0000\u0000d`\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000\u0000"+
		"fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gj\u0001\u0000\u0000"+
		"\u0000hf\u0001\u0000\u0000\u0000i^\u0001\u0000\u0000\u0000jm\u0001\u0000"+
		"\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000l\u0011"+
		"\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000no\u0005)\u0000\u0000"+
		"op\u0005\u0007\u0000\u0000pq\u0003\u001e\u000f\u0000qr\u0005\b\u0000\u0000"+
		"rs\u0006\t\uffff\uffff\u0000s\u0013\u0001\u0000\u0000\u0000tu\u0003\u0012"+
		"\t\u0000uv\u0006\n\uffff\uffff\u0000vx\u0001\u0000\u0000\u0000wt\u0001"+
		"\u0000\u0000\u0000x{\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000"+
		"yz\u0001\u0000\u0000\u0000z\u0015\u0001\u0000\u0000\u0000{y\u0001\u0000"+
		"\u0000\u0000|~\u0005\n\u0000\u0000}\u007f\u0003\u001a\r\u0000~}\u0001"+
		"\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000"+
		"\u0000\u0000\u0080\u0081\u0005\b\u0000\u0000\u0081\u00c2\u0006\u000b\uffff"+
		"\uffff\u0000\u0082\u0084\u0005\u000b\u0000\u0000\u0083\u0085\u0003\u001a"+
		"\r\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000"+
		"\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0087\u0005\b\u0000\u0000"+
		"\u0087\u00c2\u0006\u000b\uffff\uffff\u0000\u0088\u008a\u0005\f\u0000\u0000"+
		"\u0089\u008b\u0003\u001a\r\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008a"+
		"\u008b\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c"+
		"\u008d\u0005\b\u0000\u0000\u008d\u00c2\u0006\u000b\uffff\uffff\u0000\u008e"+
		"\u0090\u0005\r\u0000\u0000\u008f\u0091\u0003\u001a\r\u0000\u0090\u008f"+
		"\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0092"+
		"\u0001\u0000\u0000\u0000\u0092\u0093\u0005\b\u0000\u0000\u0093\u00c2\u0006"+
		"\u000b\uffff\uffff\u0000\u0094\u0095\u0005)\u0000\u0000\u0095\u0097\u0005"+
		"\u0005\u0000\u0000\u0096\u0098\u0003\u001a\r\u0000\u0097\u0096\u0001\u0000"+
		"\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000"+
		"\u0000\u0000\u0099\u009a\u0005\u0006\u0000\u0000\u009a\u009b\u0005\b\u0000"+
		"\u0000\u009b\u00c2\u0006\u000b\uffff\uffff\u0000\u009c\u009d\u0003\u001c"+
		"\u000e\u0000\u009d\u009e\u0005\u000e\u0000\u0000\u009e\u009f\u0003\u001c"+
		"\u000e\u0000\u009f\u00a0\u0005\b\u0000\u0000\u00a0\u00a1\u0006\u000b\uffff"+
		"\uffff\u0000\u00a1\u00c2\u0001\u0000\u0000\u0000\u00a2\u00a4\u0005\u000f"+
		"\u0000\u0000\u00a3\u00a5\u0003\u001c\u000e\u0000\u00a4\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a7\u0005\b\u0000\u0000\u00a7\u00c2\u0006\u000b\uffff"+
		"\uffff\u0000\u00a8\u00a9\u0005\u0010\u0000\u0000\u00a9\u00aa\u0005\u0005"+
		"\u0000\u0000\u00aa\u00ab\u0003\u001c\u000e\u0000\u00ab\u00ac\u0005\u0006"+
		"\u0000\u0000\u00ac\u00ad\u0005\u0002\u0000\u0000\u00ad\u00ae\u0003\u0018"+
		"\f\u0000\u00ae\u00b4\u0005\u0003\u0000\u0000\u00af\u00b0\u0005\u0011\u0000"+
		"\u0000\u00b0\u00b1\u0005\u0002\u0000\u0000\u00b1\u00b2\u0003\u0018\f\u0000"+
		"\u00b2\u00b3\u0005\u0003\u0000\u0000\u00b3\u00b5\u0001\u0000\u0000\u0000"+
		"\u00b4\u00af\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b7\u0006\u000b\uffff\uffff"+
		"\u0000\u00b7\u00c2\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005\u0012\u0000"+
		"\u0000\u00b9\u00ba\u0005\u0005\u0000\u0000\u00ba\u00bb\u0003\u001c\u000e"+
		"\u0000\u00bb\u00bc\u0005\u0006\u0000\u0000\u00bc\u00bd\u0005\u0002\u0000"+
		"\u0000\u00bd\u00be\u0003\u0018\f\u0000\u00be\u00bf\u0005\u0003\u0000\u0000"+
		"\u00bf\u00c0\u0006\u000b\uffff\uffff\u0000\u00c0\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c1|\u0001\u0000\u0000\u0000\u00c1\u0082\u0001\u0000\u0000\u0000"+
		"\u00c1\u0088\u0001\u0000\u0000\u0000\u00c1\u008e\u0001\u0000\u0000\u0000"+
		"\u00c1\u0094\u0001\u0000\u0000\u0000\u00c1\u009c\u0001\u0000\u0000\u0000"+
		"\u00c1\u00a2\u0001\u0000\u0000\u0000\u00c1\u00a8\u0001\u0000\u0000\u0000"+
		"\u00c1\u00b8\u0001\u0000\u0000\u0000\u00c2\u0017\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c4\u0003\u0016\u000b\u0000\u00c4\u00c5\u0006\f\uffff\uffff\u0000"+
		"\u00c5\u00c7\u0001\u0000\u0000\u0000\u00c6\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c7\u00ca\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000"+
		"\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u0019\u0001\u0000\u0000\u0000"+
		"\u00ca\u00c8\u0001\u0000\u0000\u0000\u00cb\u00cc\u0003\u001c\u000e\u0000"+
		"\u00cc\u00d3\u0006\r\uffff\uffff\u0000\u00cd\u00ce\u0005\t\u0000\u0000"+
		"\u00ce\u00cf\u0003\u001c\u000e\u0000\u00cf\u00d0\u0006\r\uffff\uffff\u0000"+
		"\u00d0\u00d2\u0001\u0000\u0000\u0000\u00d1\u00cd\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d5\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u001b\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d6\u00d7\u0006\u000e\uffff\uffff"+
		"\u0000\u00d7\u00d8\u0005&\u0000\u0000\u00d8\u00f8\u0006\u000e\uffff\uffff"+
		"\u0000\u00d9\u00da\u0005(\u0000\u0000\u00da\u00f8\u0006\u000e\uffff\uffff"+
		"\u0000\u00db\u00dc\u0005)\u0000\u0000\u00dc\u00f8\u0006\u000e\uffff\uffff"+
		"\u0000\u00dd\u00de\u0005\'\u0000\u0000\u00de\u00f8\u0006\u000e\uffff\uffff"+
		"\u0000\u00df\u00e0\u0005\u0005\u0000\u0000\u00e0\u00e1\u0003\u001c\u000e"+
		"\u0000\u00e1\u00e2\u0005\u0006\u0000\u0000\u00e2\u00e3\u0006\u000e\uffff"+
		"\uffff\u0000\u00e3\u00f8\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005\u0016"+
		"\u0000\u0000\u00e5\u00e6\u0003\u001e\u000f\u0000\u00e6\u00e7\u0005\u0017"+
		"\u0000\u0000\u00e7\u00e8\u0005\u0005\u0000\u0000\u00e8\u00e9\u0003\u001c"+
		"\u000e\u0000\u00e9\u00ea\u0005\u0006\u0000\u0000\u00ea\u00eb\u0006\u000e"+
		"\uffff\uffff\u0000\u00eb\u00f8\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005"+
		"\u0018\u0000\u0000\u00ed\u00ee\u0003\u001c\u000e\b\u00ee\u00ef\u0006\u000e"+
		"\uffff\uffff\u0000\u00ef\u00f8\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005"+
		")\u0000\u0000\u00f1\u00f3\u0005\u0005\u0000\u0000\u00f2\u00f4\u0003\u001a"+
		"\r\u0000\u00f3\u00f2\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005\u0006\u0000"+
		"\u0000\u00f6\u00f8\u0006\u000e\uffff\uffff\u0000\u00f7\u00d6\u0001\u0000"+
		"\u0000\u0000\u00f7\u00d9\u0001\u0000\u0000\u0000\u00f7\u00db\u0001\u0000"+
		"\u0000\u0000\u00f7\u00dd\u0001\u0000\u0000\u0000\u00f7\u00df\u0001\u0000"+
		"\u0000\u0000\u00f7\u00e4\u0001\u0000\u0000\u0000\u00f7\u00ec\u0001\u0000"+
		"\u0000\u0000\u00f7\u00f0\u0001\u0000\u0000\u0000\u00f8\u0123\u0001\u0000"+
		"\u0000\u0000\u00f9\u00fa\n\u0007\u0000\u0000\u00fa\u00fb\u0007\u0000\u0000"+
		"\u0000\u00fb\u00fc\u0003\u001c\u000e\b\u00fc\u00fd\u0006\u000e\uffff\uffff"+
		"\u0000\u00fd\u0122\u0001\u0000\u0000\u0000\u00fe\u00ff\n\u0006\u0000\u0000"+
		"\u00ff\u0100\u0007\u0001\u0000\u0000\u0100\u0101\u0003\u001c\u000e\u0007"+
		"\u0101\u0102\u0006\u000e\uffff\uffff\u0000\u0102\u0122\u0001\u0000\u0000"+
		"\u0000\u0103\u0104\n\u0005\u0000\u0000\u0104\u0105\u0007\u0002\u0000\u0000"+
		"\u0105\u0106\u0003\u001c\u000e\u0006\u0106\u0107\u0006\u000e\uffff\uffff"+
		"\u0000\u0107\u0122\u0001\u0000\u0000\u0000\u0108\u0109\n\u0004\u0000\u0000"+
		"\u0109\u010a\u0007\u0003\u0000\u0000\u010a\u010b\u0003\u001c\u000e\u0005"+
		"\u010b\u010c\u0006\u000e\uffff\uffff\u0000\u010c\u0122\u0001\u0000\u0000"+
		"\u0000\u010d\u010e\n\u0003\u0000\u0000\u010e\u010f\u0005!\u0000\u0000"+
		"\u010f\u0110\u0003\u001c\u000e\u0004\u0110\u0111\u0006\u000e\uffff\uffff"+
		"\u0000\u0111\u0122\u0001\u0000\u0000\u0000\u0112\u0113\n\u0002\u0000\u0000"+
		"\u0113\u0114\u0005\"\u0000\u0000\u0114\u0115\u0003\u001c\u000e\u0003\u0115"+
		"\u0116\u0006\u000e\uffff\uffff\u0000\u0116\u0122\u0001\u0000\u0000\u0000"+
		"\u0117\u0118\n\f\u0000\u0000\u0118\u0119\u0005\u0013\u0000\u0000\u0119"+
		"\u011a\u0005)\u0000\u0000\u011a\u0122\u0006\u000e\uffff\uffff\u0000\u011b"+
		"\u011c\n\u000b\u0000\u0000\u011c\u011d\u0005\u0014\u0000\u0000\u011d\u011e"+
		"\u0003\u001c\u000e\u0000\u011e\u011f\u0005\u0015\u0000\u0000\u011f\u0120"+
		"\u0006\u000e\uffff\uffff\u0000\u0120\u0122\u0001\u0000\u0000\u0000\u0121"+
		"\u00f9\u0001\u0000\u0000\u0000\u0121\u00fe\u0001\u0000\u0000\u0000\u0121"+
		"\u0103\u0001\u0000\u0000\u0000\u0121\u0108\u0001\u0000\u0000\u0000\u0121"+
		"\u010d\u0001\u0000\u0000\u0000\u0121\u0112\u0001\u0000\u0000\u0000\u0121"+
		"\u0117\u0001\u0000\u0000\u0000\u0121\u011b\u0001\u0000\u0000\u0000\u0122"+
		"\u0125\u0001\u0000\u0000\u0000\u0123\u0121\u0001\u0000\u0000\u0000\u0123"+
		"\u0124\u0001\u0000\u0000\u0000\u0124\u001d\u0001\u0000\u0000\u0000\u0125"+
		"\u0123\u0001\u0000\u0000\u0000\u0126\u0127\u0005#\u0000\u0000\u0127\u0135"+
		"\u0006\u000f\uffff\uffff\u0000\u0128\u0129\u0005$\u0000\u0000\u0129\u0135"+
		"\u0006\u000f\uffff\uffff\u0000\u012a\u012b\u0005%\u0000\u0000\u012b\u0135"+
		"\u0006\u000f\uffff\uffff\u0000\u012c\u012d\u0005\u0014\u0000\u0000\u012d"+
		"\u012e\u0005&\u0000\u0000\u012e\u012f\u0005\u0015\u0000\u0000\u012f\u0130"+
		"\u0003\u001e\u000f\u0000\u0130\u0131\u0006\u000f\uffff\uffff\u0000\u0131"+
		"\u0135\u0001\u0000\u0000\u0000\u0132\u0133\u0005)\u0000\u0000\u0133\u0135"+
		"\u0006\u000f\uffff\uffff\u0000\u0134\u0126\u0001\u0000\u0000\u0000\u0134"+
		"\u0128\u0001\u0000\u0000\u0000\u0134\u012a\u0001\u0000\u0000\u0000\u0134"+
		"\u012c\u0001\u0000\u0000\u0000\u0134\u0132\u0001\u0000\u0000\u0000\u0135"+
		"\u001f\u0001\u0000\u0000\u0000\u0016-/BVfky~\u0084\u008a\u0090\u0097\u00a4"+
		"\u00b4\u00c1\u00c8\u00d3\u00f3\u00f7\u0121\u0123\u0134";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}