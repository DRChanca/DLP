/**
 * MLang. Programming Language Design Tutorial
 * @author Raúl Izquierdo (raul@uniovi.es)
 */

package semantic;

import java.lang.reflect.AccessibleObject;

import ast.*;
import ast.declaraciones.Declaracionfuncion;
import ast.declaraciones.Declaracionglobales;
import ast.declaraciones.Declaracionstructs;
import ast.expression.AccessoArrayExpresion;
import ast.expression.AcederCap;
import ast.expression.ArithmeticExpresion;
import ast.expression.BoolExpression;
import ast.expression.CastExpresion;
import ast.expression.CharExpresion;
import ast.expression.Expression;
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
import ast.tipo.Tipo;
import main.ErrorManager;
import visitor.DefaultVisitor;

// This class will be implemented in type checking phase

public class TypeChecking extends DefaultVisitor {

    private ErrorManager errorManager;
    private ContextMap<String, Tipo> variables = new ContextMap<String, Tipo>();  

    public TypeChecking(ErrorManager errorManager) {
        this.errorManager = errorManager;
    }

    public void process(AST ast) {
        ast.accept(this, null);
    }

    // # ----------------------------------------------------------
    /*
    * Implement visit methods here.
    */



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

		 declaracionfuncion.getArgumento().forEach(definicion -> {
			var aux = tipoSimple(definicion.getTipo()); 
			if(predicate(aux, "El tipo del parametro debe ser simple", declaracionfuncion))
				definicion.accept(this, param); 
		 });
		 declaracionfuncion.getTipo().ifPresent(tipo -> {
		 	var aux = tipoSimple(tipo);  
			if(predicate(aux, "El tipo de retorno debe ser simple o vacio", declaracionfuncion))
				tipo.accept(this, param); 
		 });
		 declaracionfuncion.getVariablesLocales().forEach(definicion -> definicion.accept(this, param));
		 declaracionfuncion.getSentencias().forEach(sentencia -> sentencia.accept(this, param));
		//super.visit(declaracionfuncion, param);

		return null;
	}

	// class Definicion(String IDENT, Tipo tipo)
	@Override
	public Object visit(Definicion definicion, Object param) {

		// definicion.getTipo().accept(this, param);
		super.visit(definicion, param);
		if(definicion.getTipo().getClass() == ArrayTipo.class) {
			ArrayTipo aux = (ArrayTipo) definicion.getTipo(); 
			variables.put(definicion.getIDENT(), aux.getTipo());
		}
		return null;
	}

	// class PrintSentencia(List<Expression> expressions)
	// phase Identification { Declaracionfuncion declafuncion }
	@Override
	public Object visit(PrintSentencia printSentencia, Object param) {

		printSentencia.getExpressions().forEach(expression -> {
		expression.accept(this, param);
		var cond = tipoSimple(expression.getTipoexpresion()); 
		predicate(cond, "print debe tener como argumento tipos basicos", printSentencia); 
	 }); 
		//super.visit(printSentencia, param);

		return null;
	}

	// class ReadSentencia(List<Expression> expressions)
	// phase Identification { Declaracionfuncion declafuncion }
	@Override
	public Object visit(ReadSentencia readSentencia, Object param) {

		// readSentencia.getExpressions().forEach(expression -> expression.accept(this, param));
		super.visit(readSentencia, param);

		return null;
	}

	// class PrintspSentencia(List<Expression> expressions)
	// phase Identification { Declaracionfuncion declafuncion }
	@Override
	public Object visit(PrintspSentencia printspSentencia, Object param) {

		 printspSentencia.getExpressions().forEach(expression -> {
			 var cond = expression.getTipoexpresion(); 
		
			 expression.accept(this, param);
		 }); 
		//super.visit(printspSentencia, param);

		return null;
	}

	// class PrintlnSentencia(List<Expression> expressions)
	// phase Identification { Declaracionfuncion declafuncion }
	@Override
	public Object visit(PrintlnSentencia printlnSentencia, Object param) {

		// printlnSentencia.getExpressions().forEach(expression -> expression.accept(this, param));
		super.visit(printlnSentencia, param);

		return null;
	}

	// class FuncionSentencia(String nombre, List<Expression> argumento)
	// phase Identification { Declaracionfuncion declaracionfuncion, Declaracionfuncion declafuncion }
	@Override
	public Object visit(FuncionSentencia funcionSentencia, Object param) {

		// funcionSentencia.getArgumento().forEach(expression -> expression.accept(this, param));
		super.visit(funcionSentencia, param);

		return null;
	}

	// class AsignacionSentencia(Expression left, Expression expression)
	// phase Identification { Declaracionfuncion declafuncion }
	@Override
	public Object visit(AsignacionSentencia asignacionSentencia, Object param) {

		// asignacionSentencia.getLeft().accept(this, param);
		// asignacionSentencia.getExpression().accept(this, param);
		super.visit(asignacionSentencia, param);

		return null;
	}

	// class ReturnSentencia(Optional<Expression> expression)
	// phase Identification { Declaracionfuncion declafuncion }
	@Override
	public Object visit(ReturnSentencia returnSentencia, Object param) {

		// returnSentencia.getExpression().ifPresent(expression -> expression.accept(this, param));
		super.visit(returnSentencia, param);

		return null;
	}

	// class IfSentencia(Expression condicion, List<Sentencia> entonces, List<Sentencia> otro)
	// phase Identification { Declaracionfuncion declafuncion }
	@Override
	public Object visit(IfSentencia ifSentencia, Object param) {

		// ifSentencia.getCondicion().accept(this, param);
		// ifSentencia.getEntonces().forEach(sentencia -> sentencia.accept(this, param));
		// ifSentencia.getOtro().forEach(sentencia -> sentencia.accept(this, param));
		super.visit(ifSentencia, param);

		return null;
	}

	// class WhileSentencia(Expression condicion, List<Sentencia> entonces)
	// phase Identification { Declaracionfuncion declafuncion }
	@Override
	public Object visit(WhileSentencia whileSentencia, Object param) {

		// whileSentencia.getCondicion().accept(this, param);
		// whileSentencia.getEntonces().forEach(sentencia -> sentencia.accept(this, param));
		super.visit(whileSentencia, param);

		return null;
	}

	// class IntExpresion(int intValue)
	// phase TypeChecking { Tipo tipoexpresion, boolean lvalue }
	@Override
	public Object visit(IntExpresion intExpresion, Object param) {

		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// intExpresion.setTipoexpresion(?);
		intExpresion.setTipoexpresion(new IntTipo(intExpresion.getIntValue()+""));
		// intExpresion.setLvalue(?);
		return null;
	}

	// class RealExpresion(double doubleValue)
	// phase TypeChecking { Tipo tipoexpresion, boolean lvalue }
	@Override
	public Object visit(RealExpresion realExpresion, Object param) {

		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// realExpresion.setTipoexpresion(?);
		realExpresion.setTipoexpresion(new FloatTipo(realExpresion.getDoubleValue()+""));
		// realExpresion.setLvalue(?);
		return null;
	}

	// class IdentificadorExpresion(String name)
	// phase Identification { Definicion definicion }
	// phase TypeChecking { Tipo tipoexpresion, boolean lvalue }
	@Override
	public Object visit(IdentificadorExpresion identificadorExpresion, Object param) {

		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// identificadorExpresion.setTipoexpresion(?);

		
		identificadorExpresion.setTipoexpresion(identificadorExpresion.getDefinicion().getTipo());
		// identificadorExpresion.setLvalue(?);
		identificadorExpresion.setLvalue(true);
		return null;
	}

	// class CharExpresion(char charValue)
	// phase TypeChecking { Tipo tipoexpresion, boolean lvalue }
	@Override
	public Object visit(CharExpresion charExpresion, Object param) {

		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// charExpresion.setTipoexpresion(?);
		charExpresion.setTipoexpresion(new CharTipo(charExpresion.toString()));
		// charExpresion.setLvalue(?);
		return null;
	}

	// class AccessoArrayExpresion(Expression acceso, Expression indice)
	// phase TypeChecking { Tipo tipoexpresion, boolean lvalue }
	@Override
	public Object visit(AccessoArrayExpresion accessoArrayExpresion, Object param) {

		// accessoArrayExpresion.getAcceso().accept(this, param);
		// accessoArrayExpresion.getIndice().accept(this, param);
		
		super.visit(accessoArrayExpresion, param);
		var left = accessoArrayExpresion.getAcceso().getTipoexpresion(); 
		var right = accessoArrayExpresion.getIndice().getTipoexpresion();
		var aux = predicate(left.getClass() == ArrayTipo.class, "Acesso a un NO-ARRAY", accessoArrayExpresion); 
		var aux2 = predicate(right.getClass() == IntTipo.class, "Acesso a array con indice no entero", accessoArrayExpresion); 
		
		
		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// accessoArrayExpresion.setTipoexpresion(?);
		if( aux && aux2) {			
			ArrayTipo tipoArray = (ArrayTipo) left; 
			accessoArrayExpresion.setTipoexpresion(tipoArray.getTipo());
			accessoArrayExpresion.setLvalue(true);
		}
		// accessoArrayExpresion.setLvalue(?);
		return null;
	}

	// class ParentesisExpresion(Expression expression)
	// phase TypeChecking { Tipo tipoexpresion, boolean lvalue }
	@Override
	public Object visit(ParentesisExpresion parentesisExpresion, Object param) {

		// parentesisExpresion.getExpression().accept(this, param);
		super.visit(parentesisExpresion, param);

		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// parentesisExpresion.setTipoexpresion(?);
		parentesisExpresion.setTipoexpresion(parentesisExpresion.getExpression().getTipoexpresion());
		// parentesisExpresion.setLvalue(?);
		return null;
	}

	// class CastExpresion(Tipo tipo, Expression expression)
	// phase TypeChecking { Tipo tipoexpresion, boolean lvalue }
	@Override
	public Object visit(CastExpresion castExpresion, Object param) {

		// castExpresion.getTipo().accept(this, param);
		// castExpresion.getExpression().accept(this, param);
		super.visit(castExpresion, param);

		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// castExpresion.setTipoexpresion(?);
		// castExpresion.setLvalue(?);
		return null;
	}

	// class NegacionExpresion(Expression expression)
	// phase TypeChecking { Tipo tipoexpresion, boolean lvalue }
	@Override
	public Object visit(NegacionExpresion negacionExpresion, Object param) {

		// negacionExpresion.getExpression().accept(this, param);
		super.visit(negacionExpresion, param);

		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// negacionExpresion.setTipoexpresion(?);
		// negacionExpresion.setLvalue(?);
		return null;
	}

	// class ArithmeticExpresion(Expression left, String operator, Expression right)
	// phase TypeChecking { Tipo tipoexpresion, boolean lvalue }
	@Override
	public Object visit(ArithmeticExpresion arithmeticExpresion, Object param) {

		// arithmeticExpresion.getLeft().accept(this, param);
		// arithmeticExpresion.getRight().accept(this, param);
		super.visit(arithmeticExpresion, param);
		
		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		var valor = arithmeticExpresion.getLeft().getTipoexpresion() == null || arithmeticExpresion.getRight().getTipoexpresion() == null;
		if(!valor) {
			var cond = sameType(arithmeticExpresion.getLeft(), arithmeticExpresion.getRight());
			var condEntero = arithmeticExpresion.getLeft().getTipoexpresion().getClass() == IntTipo.class || arithmeticExpresion.getRight().getTipoexpresion().getClass() == IntTipo.class; 
			predicate(cond, "ambos operandos tiene quer ser del mismo tipo", arithmeticExpresion); 
			predicate(condEntero, "ambos operandos tienen que ser enteros",arithmeticExpresion); 		
			if(arithmeticExpresion.getOperator().contentEquals("%"))
				predicate(true,"ambos operandos tienen que ser enteros", arithmeticExpresion);
			arithmeticExpresion.setTipoexpresion(arithmeticExpresion.getLeft().getTipoexpresion());
			
		}else {
			predicate(!valor, "la funcion no devuelve nada", arithmeticExpresion); 
		}
			
		arithmeticExpresion.setLvalue(false);
		
		// arithmeticExpresion.setTipoexpresion(?);
		// arithmeticExpresion.setLvalue(?);
		return null;
	}

	// class LogicExpression(Expression left, String operator, Expression right)
	// phase TypeChecking { Tipo tipoexpresion, boolean lvalue }
	@Override
	public Object visit(LogicExpression logicExpression, Object param) {

		// logicExpression.getLeft().accept(this, param);
		// logicExpression.getRight().accept(this, param);
		super.visit(logicExpression, param);

		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// logicExpression.setTipoexpresion(?);
		// logicExpression.setLvalue(?);
		return null;
	}

	// class BoolExpression(Expression left, String operator, Expression right)
	// phase TypeChecking { Tipo tipoexpresion, boolean lvalue }
	@Override
	public Object visit(BoolExpression boolExpression, Object param) {

		// boolExpression.getLeft().accept(this, param);
		// boolExpression.getRight().accept(this, param);
		super.visit(boolExpression, param);

		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// boolExpression.setTipoexpresion(?);
		// boolExpression.setLvalue(?);
		return null;
	}

	// class AcederCap(Expression left, String right)
	// phase TypeChecking { Tipo tipoexpresion, boolean lvalue }
	@Override
	public Object visit(AcederCap acederCap, Object param) {

		// acederCap.getLeft().accept(this, param);
		super.visit(acederCap, param);

		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// acederCap.setTipoexpresion(?);
		// acederCap.setLvalue(?);
		return null;
	}

	// class FuncionExpresion(String nombre, List<Expression> argumentos)
	// phase Identification { Declaracionfuncion declaracionfuncion }
	// phase TypeChecking { Tipo tipoexpresion, boolean lvalue }
	@Override
	public Object visit(FuncionExpresion funcionExpresion, Object param) {

		// funcionExpresion.getArgumentos().forEach(expression -> expression.accept(this, param));
		super.visit(funcionExpresion, param);

		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// funcionExpresion.setTipoexpresion(?);
		// funcionExpresion.setLvalue(?);
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

    //# ----------------------------------------------------------
    //# Auxiliary methods (optional)

    private void notifyError(String errorMessage, Position position) {
        errorManager.notify("Type Checking", errorMessage, position);
    }

    private void notifyError(String msg) {
        errorManager.notify("Type Checking", msg);
    }

    /**
     * predicate. Auxiliary method to implement predicates. Delete if not needed.
     *
     * Usage examples:
     *
     *    predicate(expr.type != null), "Type cannot be null", expr.start());
     *
     *    predicate(expr.type != null), "Type cannot be null", expr);       // expr.start() is assumed
     *
     * The start() method (example 1) indicates the position in the file where the node was. If VGen is used, this method
     * will have been generated in all AST nodes.
     *
     * @param condition     Must be met to avoid an error
     * @param errorMessage  Printed if the condition is not met
     * @param errorPosition Row and column in the file where the error occurred.
     * @return true if the condition is met
     */

    private boolean predicate(boolean condition, String errorMessage, Position position) {
        if (!condition) {
            notifyError(errorMessage, position);
            return false;
        }

        return true;
    }

    private boolean sameType(Expression a, Expression b) {
    	return (a.getTipoexpresion().getClass() == b.getTipoexpresion().getClass()); 
    }
    private boolean predicate(boolean condition, String errorMessage, AST node) {
        return predicate(condition, errorMessage, node.start());
    }
    private boolean tipoSimple(Tipo a) {
    	if(a == null)
    		return false; 
    	return a.getClass().equals(IntTipo.class) || a.getClass().equals(FloatTipo.class) || a.getClass().equals(CharTipo.class); 
    }

}
