// Generated with VGen 2.0.0


/*

Este fichero es un esqueleto para facilitar la creación de una clase visitor. Para
usarlo hay que realizar dos pasos:
1. Ubicar este código.
2. Completar cada método visit.

## Paso 1. Ubicación de este Código

Este esqueleto será SOBREESCRITO la próxima vez que se ejecuta VGen. Por ello, se debe
copiar su contenido antes de hacer cualquier cambio.

Hay dos opciones:

1) Si ya se tiene hecha una clase para el visitor, basta con copiar a dicha clase los
   métodos visit de este esqueleto (y los import) ignorando el resto.

2) Si no se tiene hecha aún la clase, este esqueleto vale como tal si se mueve a la
   carpeta deseada del proyecto y se le pone el package correspondiente a dicha ubicación.

Una vez hecho esto, ya se tendría un visitor que compilaría sin errores y que, al
ejecutarlo, recorrería todo el árbol (aunque sin hacer nada en cada nodo).


## Paso 2 Completar cada Método Visit

El visit generado para cada nodo se limita a recorrer sus hijos. El código de recorrido
se encuentra en la llamada a 'super.visit'. Los 'accept' comentados encima de cada
'super.visit' son sólo un recordatorio de lo que hace dicho método (son una copia de su
implementación, que se hereda de DefaultVisitor).

Por tanto, hay tres opciones a la hora de implementar cada visit:

1. Si en el visit de un nodo SÓLO SE NECESITA RECORRER sus hijos, se puede borrar
   completamente dicho visit de esta clase. Al no estar el método, se heredará de
   DefaultVisitor la misma implementación que se acaba de borrar. Es decir, en esta
   clase sólo será necesario dejar los visit que tengan alguna acción que realizar.

2. Si se necesita hacer alguna tarea adicional ANTES o DESPUÉS de recorrer todos
   los hijos, se debe añadir su código antes o después de la llamada a 'super.visit' (y
   se pueden borrar los 'accept' comentados).

3. Y, finalmente, si se necesita hacer alguna tarea INTERCALADA en el recorrido de los
   hijos (por ejemplo, comprobar su tipo), se debe borrar el 'super.visit' y descomentar
   los 'accept'. Así se tendría ya implementado el recorrido de los hijos, que es la
   estructura donde se intecalará el código de las acciones adicionales.

*/

// TODO: write package name
// package ...;

import visitor.DefaultVisitor;
import ast.*;
import ast.declaraciones.*;
import ast.sentencia.*;
import ast.expression.*;
import ast.tipo.*;


public class SkeletonForNewVisitors extends DefaultVisitor {

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

	// class Declaracionstructs(String nombre, List<Definicion> definicions)
	@Override
	public Object visit(Declaracionstructs declaracionstructs, Object param) {

		// declaracionstructs.getDefinicions().forEach(definicion -> definicion.accept(this, param));
		super.visit(declaracionstructs, param);

		return null;
	}

	// class Declaracionglobales(Definicion definicion)
	@Override
	public Object visit(Declaracionglobales declaracionglobales, Object param) {

		// declaracionglobales.getDefinicion().accept(this, param);
		super.visit(declaracionglobales, param);

		return null;
	}

	// class Declaracionfuncion(String nombre, List<Definicion> argumento, Optional<Tipo> tipo, List<Definicion> variablesLocales, List<Sentencia> sentencias)
	@Override
	public Object visit(Declaracionfuncion declaracionfuncion, Object param) {

		// declaracionfuncion.getArgumento().forEach(definicion -> definicion.accept(this, param));
		// declaracionfuncion.getTipo().ifPresent(tipo -> tipo.accept(this, param));
		// declaracionfuncion.getVariablesLocales().forEach(definicion -> definicion.accept(this, param));
		// declaracionfuncion.getSentencias().forEach(sentencia -> sentencia.accept(this, param));
		super.visit(declaracionfuncion, param);

		return null;
	}

	// class Definicion(String IDENT, Tipo tipo)
	@Override
	public Object visit(Definicion definicion, Object param) {

		// definicion.getTipo().accept(this, param);
		super.visit(definicion, param);

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
	// phase Identification { Declaracionfuncion declaracionfuncion }
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
	// phase Identification { Definicion definicion }
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
	// phase Identification { Declaracionfuncion declaracionfuncion }
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
