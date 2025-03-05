// Generated with VGen 2.0.0

/**
* El objetivo de esta clase DefaultVisitor es ser la implementación base de la que
* deriven todos los demás visitor.
*
* Sus métodos visit recorren los hijos del nodo que se está visitando. Por tanto,
* todo visitor que derive de este ya tendrá implementado todo el código de
* recorrido del AST.
*
* Para crear nuevos visitor, en vez de modificar esta clase, se recomienda copiar
* 'SkeletonForNewVisitors.java' o, mejor aún, definir una nueva PHASE en la gramática
* y usar el visitor generado para la misma.
*/

package visitor;

import ast.*;
import ast.declaraciones.*;
import ast.sentencia.*;
import ast.expression.*;
import ast.tipo.*;




public class DefaultVisitor implements Visitor {
	@Override
	public Object visit(Program program, Object param) {

		program.getDeclaracioneses().forEach(declaraciones -> declaraciones.accept(this, param));
		return null;
	}

	@Override
	public Object visit(Declaracionstructs declaracionstructs, Object param) {

		declaracionstructs.getDeclaracions().forEach(declaracion -> declaracion.accept(this, param));
		return null;
	}

	@Override
	public Object visit(Declaracionglobales declaracionglobales, Object param) {

		declaracionglobales.getDeclaracion().accept(this, param);
		return null;
	}

	@Override
	public Object visit(Declaracionfuncion declaracionfuncion, Object param) {

		declaracionfuncion.getArgumento().forEach(argumento -> argumento.accept(this, param));
		declaracionfuncion.getTipo().ifPresent(tipo -> tipo.accept(this, param));
		declaracionfuncion.getVariablesLocales().forEach(variablesLocales -> variablesLocales.accept(this, param));
		declaracionfuncion.getSentencias().forEach(sentencia -> sentencia.accept(this, param));
		return null;
	}

	@Override
	public Object visit(VariablesLocales variablesLocales, Object param) {

		variablesLocales.getTipo().accept(this, param);
		return null;
	}

	@Override
	public Object visit(Argumento argumento, Object param) {

		argumento.getTipo().accept(this, param);
		return null;
	}

	@Override
	public Object visit(Declaracion declaracion, Object param) {

		declaracion.getTipo().accept(this, param);
		return null;
	}

	@Override
	public Object visit(PrintSentencia printSentencia, Object param) {

		printSentencia.getExpressions().forEach(expression -> expression.accept(this, param));
		return null;
	}

	@Override
	public Object visit(ReadSentencia readSentencia, Object param) {

		readSentencia.getExpressions().forEach(expression -> expression.accept(this, param));
		return null;
	}

	@Override
	public Object visit(PrintspSentencia printspSentencia, Object param) {

		printspSentencia.getExpressions().forEach(expression -> expression.accept(this, param));
		return null;
	}

	@Override
	public Object visit(PrintlnSentencia printlnSentencia, Object param) {

		printlnSentencia.getExpressions().forEach(expression -> expression.accept(this, param));
		return null;
	}

	@Override
	public Object visit(FuncionSentencia funcionSentencia, Object param) {

		funcionSentencia.getArgumento().forEach(expression -> expression.accept(this, param));
		return null;
	}

	@Override
	public Object visit(AsignacionSentencia asignacionSentencia, Object param) {

		asignacionSentencia.getLeft().accept(this, param);
		asignacionSentencia.getExpression().accept(this, param);
		return null;
	}

	@Override
	public Object visit(ReturnSentencia returnSentencia, Object param) {

		returnSentencia.getExpression().ifPresent(expression -> expression.accept(this, param));
		return null;
	}

	@Override
	public Object visit(IfSentencia ifSentencia, Object param) {

		ifSentencia.getCondicion().accept(this, param);
		ifSentencia.getEntonces().forEach(sentencia -> sentencia.accept(this, param));
		ifSentencia.getOtro().forEach(sentencia -> sentencia.accept(this, param));
		return null;
	}

	@Override
	public Object visit(WhileSentencia whileSentencia, Object param) {

		whileSentencia.getCondicion().accept(this, param);
		whileSentencia.getEntonces().forEach(sentencia -> sentencia.accept(this, param));
		return null;
	}

	@Override
	public Object visit(IntExpresion intExpresion, Object param) {

		return null;
	}

	@Override
	public Object visit(RealExpresion realExpresion, Object param) {

		return null;
	}

	@Override
	public Object visit(IdentificadorExpresion identificadorExpresion, Object param) {

		return null;
	}

	@Override
	public Object visit(CharExpresion charExpresion, Object param) {

		return null;
	}

	@Override
	public Object visit(AccessoArrayExpresion accessoArrayExpresion, Object param) {

		accessoArrayExpresion.getAcceso().accept(this, param);
		accessoArrayExpresion.getIndice().accept(this, param);
		return null;
	}

	@Override
	public Object visit(ParentesisExpresion parentesisExpresion, Object param) {

		parentesisExpresion.getExpression().accept(this, param);
		return null;
	}

	@Override
	public Object visit(CastExpresion castExpresion, Object param) {

		castExpresion.getTipo().accept(this, param);
		castExpresion.getExpression().accept(this, param);
		return null;
	}

	@Override
	public Object visit(NegacionExpresion negacionExpresion, Object param) {

		negacionExpresion.getExpression().accept(this, param);
		return null;
	}

	@Override
	public Object visit(ArithmeticExpresion arithmeticExpresion, Object param) {

		arithmeticExpresion.getLeft().accept(this, param);
		arithmeticExpresion.getRight().accept(this, param);
		return null;
	}

	@Override
	public Object visit(LogicExpression logicExpression, Object param) {

		logicExpression.getLeft().accept(this, param);
		logicExpression.getRight().accept(this, param);
		return null;
	}

	@Override
	public Object visit(AcederCap acederCap, Object param) {

		acederCap.getLeft().accept(this, param);
		return null;
	}

	@Override
	public Object visit(FuncionExpresion funcionExpresion, Object param) {

		funcionExpresion.getArgumentos().forEach(expression -> expression.accept(this, param));
		return null;
	}

	@Override
	public Object visit(IntTipo intTipo, Object param) {

		return null;
	}

	@Override
	public Object visit(FloatTipo floatTipo, Object param) {

		return null;
	}

	@Override
	public Object visit(CharTipo charTipo, Object param) {

		return null;
	}

	@Override
	public Object visit(ArrayTipo arrayTipo, Object param) {

		arrayTipo.getTipo().accept(this, param);
		return null;
	}

	@Override
	public Object visit(StringTipo stringTipo, Object param) {

		return null;
	}


}
