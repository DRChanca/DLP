package visor;

import ast.AST;
import ast.Argumento;
import ast.Declaracion;
import ast.Program;
import ast.VariablesLocales;
import ast.declaraciones.Declaracionfuncion;
import ast.declaraciones.Declaracionglobales;
import ast.declaraciones.Declaracionstructs;
import ast.expression.AccessoArrayExpresion;
import ast.expression.AcederCap;
import ast.expression.ArithmeticExpresion;
import ast.expression.CastExpresion;
import ast.expression.CharExpresion;
import ast.expression.FuncionExpresion;
import ast.expression.IdentificadorExpresion;
import ast.expression.IntExpresion;
import ast.expression.LogicExpression;
import ast.expression.NegacionExpresion;
import ast.expression.ParentesisExpresion;
import ast.expression.RealExpresion;
import ast.sentencia.AsignacionSentencia;
import ast.sentencia.FuncionSentencia;
import ast.sentencia.IfSentencia;
import ast.sentencia.PrintSentencia;
import ast.sentencia.PrintlnSentencia;
import ast.sentencia.PrintspSentencia;
import ast.sentencia.ReadSentencia;
import ast.sentencia.ReturnSentencia;
import ast.sentencia.WhileSentencia;
import ast.tipo.ArrayTipo;
import ast.tipo.CharTipo;
import ast.tipo.FloatTipo;
import ast.tipo.IntTipo;
import ast.tipo.StringTipo;
import visitor.DefaultVisitor;

public class Visor extends DefaultVisitor {

    public void process(AST ast) {
        ast.accept(this, null);
    }

    // Visit Methods --------------------------------------------------------------

	// class Program(List<Declaraciones> declaracioneses)
	@Override
	public Object visit(Program program, Object param) {

		// program.getDeclaracioneses().forEach(declaraciones -> declaraciones.accept(this, param));
		super.visit(program, param);

		return null;
	}

	// class Declaracionstructs(String nombre, List<Declaracion> declaracions)
	@Override
	public Object visit(Declaracionstructs declaracionstructs, Object param) {

		// declaracionstructs.getDeclaracions().forEach(declaracion -> declaracion.accept(this, param));
		super.visit(declaracionstructs, param);

		return null;
	}

	// class Declaracionglobales(Declaracion declaracion)
	@Override
	public Object visit(Declaracionglobales declaracionglobales, Object param) {

		// declaracionglobales.getDeclaracion().accept(this, param);
		super.visit(declaracionglobales, param);

		return null;
	}

	// class Declaracionfuncion(String nombre, List<Argumento> argumento, Optional<Tipo> tipo, List<VariablesLocales> variablesLocales, List<Sentencia> sentencias)
	@Override
	public Object visit(Declaracionfuncion declaracionfuncion, Object param) {

		// declaracionfuncion.getArgumento().forEach(argumento -> argumento.accept(this, param));
		// declaracionfuncion.getTipo().ifPresent(tipo -> tipo.accept(this, param));
		// declaracionfuncion.getVariablesLocales().forEach(variablesLocales -> variablesLocales.accept(this, param));
		// declaracionfuncion.getSentencias().forEach(sentencia -> sentencia.accept(this, param));
		super.visit(declaracionfuncion, param);

		return null;
	}

	// class VariablesLocales(String IDENT, Tipo tipo)
	@Override
	public Object visit(VariablesLocales variablesLocales, Object param) {

		// variablesLocales.getTipo().accept(this, param);
		super.visit(variablesLocales, param);

		return null;
	}

	// class Argumento(String IDENT, Tipo tipo)
	@Override
	public Object visit(Argumento argumento, Object param) {

		// argumento.getTipo().accept(this, param);
		super.visit(argumento, param);

		return null;
	}

	// class Declaracion(String IDENT, Tipo tipo)
	@Override
	public Object visit(Declaracion declaracion, Object param) {

		// declaracion.getTipo().accept(this, param);
		super.visit(declaracion, param);

		return null;
	}

	// class PrintSentencia(List<Expression> expressions)
	@Override
	public Object visit(PrintSentencia printSentencia, Object param) {

		// printSentencia.getExpressions().forEach(expression -> expression.accept(this, param));
		super.visit(printSentencia, param);

		return null;
	}

	// class ReadSentencia(List<Expression> expressions)
	@Override
	public Object visit(ReadSentencia readSentencia, Object param) {

		// readSentencia.getExpressions().forEach(expression -> expression.accept(this, param));
		super.visit(readSentencia, param);

		return null;
	}

	// class PrintspSentencia(List<Expression> expressions)
	@Override
	public Object visit(PrintspSentencia printspSentencia, Object param) {

		// printspSentencia.getExpressions().forEach(expression -> expression.accept(this, param));
		super.visit(printspSentencia, param);

		return null;
	}

	// class PrintlnSentencia(List<Expression> expressions)
	@Override
	public Object visit(PrintlnSentencia printlnSentencia, Object param) {

		// printlnSentencia.getExpressions().forEach(expression -> expression.accept(this, param));
		super.visit(printlnSentencia, param);

		return null;
	}

	// class FuncionSentencia(String nombre, List<Expression> argumento)
	@Override
	public Object visit(FuncionSentencia funcionSentencia, Object param) {

		// funcionSentencia.getArgumento().forEach(expression -> expression.accept(this, param));
		super.visit(funcionSentencia, param);

		return null;
	}

	// class AsignacionSentencia(Expression left, Expression expression)
	@Override
	public Object visit(AsignacionSentencia asignacionSentencia, Object param) {

		// asignacionSentencia.getLeft().accept(this, param);
		// asignacionSentencia.getExpression().accept(this, param);
		super.visit(asignacionSentencia, param);

		return null;
	}

	// class ReturnSentencia(Optional<Expression> expression)
	@Override
	public Object visit(ReturnSentencia returnSentencia, Object param) {

		// returnSentencia.getExpression().ifPresent(expression -> expression.accept(this, param));
		super.visit(returnSentencia, param);

		return null;
	}

	// class IfSentencia(Expression condicion, List<Sentencia> entonces, List<Sentencia> otro)
	@Override
	public Object visit(IfSentencia ifSentencia, Object param) {

		// ifSentencia.getCondicion().accept(this, param);
		// ifSentencia.getEntonces().forEach(sentencia -> sentencia.accept(this, param));
		// ifSentencia.getOtro().forEach(sentencia -> sentencia.accept(this, param));
		super.visit(ifSentencia, param);

		return null;
	}

	// class WhileSentencia(Expression condicion, List<Sentencia> entonces)
	@Override
	public Object visit(WhileSentencia whileSentencia, Object param) {

		// whileSentencia.getCondicion().accept(this, param);
		// whileSentencia.getEntonces().forEach(sentencia -> sentencia.accept(this, param));
		super.visit(whileSentencia, param);

		return null;
	}

	// class IntExpresion(int intValue)
	@Override
	public Object visit(IntExpresion intExpresion, Object param) {

		return null;
	}

	// class RealExpresion(double doubleValue)
	@Override
	public Object visit(RealExpresion realExpresion, Object param) {

		return null;
	}

	// class IdentificadorExpresion(String name)
	@Override
	public Object visit(IdentificadorExpresion identificadorExpresion, Object param) {

		return null;
	}

	// class CharExpresion(char charValue)
	@Override
	public Object visit(CharExpresion charExpresion, Object param) {

		return null;
	}

	// class AccessoArrayExpresion(Expression acceso, Expression indice)
	@Override
	public Object visit(AccessoArrayExpresion accessoArrayExpresion, Object param) {

		// accessoArrayExpresion.getAcceso().accept(this, param);
		// accessoArrayExpresion.getIndice().accept(this, param);
		super.visit(accessoArrayExpresion, param);

		return null;
	}

	// class ParentesisExpresion(Expression expression)
	@Override
	public Object visit(ParentesisExpresion parentesisExpresion, Object param) {

		// parentesisExpresion.getExpression().accept(this, param);
		super.visit(parentesisExpresion, param);

		return null;
	}

	// class CastExpresion(Tipo tipo, Expression expression)
	@Override
	public Object visit(CastExpresion castExpresion, Object param) {

		// castExpresion.getTipo().accept(this, param);
		// castExpresion.getExpression().accept(this, param);
		super.visit(castExpresion, param);

		return null;
	}

	// class NegacionExpresion(Expression expression)
	@Override
	public Object visit(NegacionExpresion negacionExpresion, Object param) {

		// negacionExpresion.getExpression().accept(this, param);
		super.visit(negacionExpresion, param);

		return null;
	}

	// class ArithmeticExpresion(Expression left, String operator, Expression right)
	@Override
	public Object visit(ArithmeticExpresion arithmeticExpresion, Object param) {

		// arithmeticExpresion.getLeft().accept(this, param);
		// arithmeticExpresion.getRight().accept(this, param);
		super.visit(arithmeticExpresion, param);

		return null;
	}

	// class LogicExpression(Expression left, String operator, Expression right)
	@Override
	public Object visit(LogicExpression logicExpression, Object param) {

		// logicExpression.getLeft().accept(this, param);
		// logicExpression.getRight().accept(this, param);
		super.visit(logicExpression, param);

		return null;
	}

	// class AcederCap(Expression left, String right)
	@Override
	public Object visit(AcederCap acederCap, Object param) {

		// acederCap.getLeft().accept(this, param);
		super.visit(acederCap, param);

		return null;
	}

	// class FuncionExpresion(String nombre, List<Expression> argumentos)
	@Override
	public Object visit(FuncionExpresion funcionExpresion, Object param) {

		// funcionExpresion.getArgumentos().forEach(expression -> expression.accept(this, param));
		super.visit(funcionExpresion, param);

		return null;
	}

	// class IntTipo(String name)
	@Override
	public Object visit(IntTipo intTipo, Object param) {

		return null;
	}

	// class FloatTipo(String name)
	@Override
	public Object visit(FloatTipo floatTipo, Object param) {

		return null;
	}

	// class CharTipo(String name)
	@Override
	public Object visit(CharTipo charTipo, Object param) {

		return null;
	}

	// class ArrayTipo(int tamArray, Tipo tipo)
	@Override
	public Object visit(ArrayTipo arrayTipo, Object param) {

		// arrayTipo.getTipo().accept(this, param);
		super.visit(arrayTipo, param);

		return null;
	}

	// class StringTipo(String name)
	@Override
	public Object visit(StringTipo stringTipo, Object param) {

		return null;
	}

}
