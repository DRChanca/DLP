// Generated with VGen 2.0.0

package codegeneration.mapl.codefunctions;

import ast.expression.*;
import codegeneration.mapl.*;


public class Valor extends AbstractCodeFunction {

    public Valor(MaplCodeSpecification specification) {
        super(specification);
    }


	// class IntExpresion(int intValue)
	// phase TypeChecking { Tipo tipoexpresion, boolean lvalue }
	@Override
	public Object visit(IntExpresion intExpresion, Object param) {

		out("pushi "+intExpresion.getIntValue());

		return null;
	}

	// class RealExpresion(double doubleValue)
	// phase TypeChecking { Tipo tipoexpresion, boolean lvalue }
	@Override
	public Object visit(RealExpresion realExpresion, Object param) {

		out("pushf "+realExpresion.getDoubleValue());

		return null;
	}

	// class IdentificadorExpresion(String name)
	// phase Identification { Definicion definicion }
	// phase TypeChecking { Tipo tipoexpresion, boolean lvalue }
	@Override
	public Object visit(IdentificadorExpresion identificadorExpresion, Object param) {

		direccion(identificadorExpresion); 
		out("load"+identificadorExpresion.getTipoexpresion().sufijo()); 

		return null;
	}

	// class CharExpresion(char charValue)
	// phase TypeChecking { Tipo tipoexpresion, boolean lvalue }
	@Override
	public Object visit(CharExpresion charExpresion, Object param) {
		int charValor = charExpresion.getName().charAt(0);
		out("pushb "+charValor);

		return null;
	}

	// class AccessoArrayExpresion(Expression acceso, Expression indice)
	// phase TypeChecking { Tipo tipoexpresion, boolean lvalue }
	@Override
	public Object visit(AccessoArrayExpresion accessoArrayExpresion, Object param) {

		// valor(accessoArrayExpresion.getAcceso());
		 direccion(accessoArrayExpresion);
		 out("load"+accessoArrayExpresion.getTipoexpresion().sufijo()); 

		// valor(accessoArrayExpresion.getIndice());
		// direccion(accessoArrayExpresion.getIndice());

		

		return null;
	}

	// class ParentesisExpresion(Expression expression)
	// phase TypeChecking { Tipo tipoexpresion, boolean lvalue }
	@Override
	public Object visit(ParentesisExpresion parentesisExpresion, Object param) {

		// valor(parentesisExpresion.getExpression());
		// direccion(parentesisExpresion.getExpression());

		out("<instruction>");

		return null;
	}

	// class CastExpresion(Tipo tipo, Expression expression)
	// phase TypeChecking { Tipo tipoexpresion, boolean lvalue }
	@Override
	public Object visit(CastExpresion castExpresion, Object param) {

		valor(castExpresion.getExpression());
		// direccion(castExpresion.getExpression());

		var desde = castExpresion.getExpression().getTipoexpresion().sufijo(); 
		var hacia =  castExpresion.getTipoexpresion().sufijo();
		
		out(desde+"2"+hacia); 

		return null;
	}

	// class NegacionExpresion(Expression expression)
	// phase TypeChecking { Tipo tipoexpresion, boolean lvalue }
	@Override
	public Object visit(NegacionExpresion negacionExpresion, Object param) {

		valor(negacionExpresion.getExpression());
		// direccion(negacionExpresion.getExpression());
		out("not"); 
	

		return null;
	}

	// class ArithmeticExpresion(Expression left, String operator, Expression right)
	// phase TypeChecking { Tipo tipoexpresion, boolean lvalue }
	@Override
	public Object visit(ArithmeticExpresion arithmeticExpresion, Object param) {

		valor(arithmeticExpresion.getLeft());
		// direccion(arithmeticExpresion.getLeft());

		 valor(arithmeticExpresion.getRight());
		// direccion(arithmeticExpresion.getRight());
		 String ins = ""; 
		 String operator = arithmeticExpresion.getOperator(); 
		 switch (operator) {
		 case "+": {
			 ins = "add"; break; 
		 }
		 case "-": {
			 ins = "sub"; break; 
		 }
		 case "*": {
			 ins = "mul"; break; 
		 }
		 case "/": {
			 ins = "div"; break; 
		 }
		 case "%": {
			 ins = "mod"; break; 
		 }
		 }
		out(ins+arithmeticExpresion.getTipoexpresion().sufijo()); 

		return null;
	}

	// class LogicExpression(Expression left, String operator, Expression right)
	// phase TypeChecking { Tipo tipoexpresion, boolean lvalue }
	@Override
	public Object visit(LogicExpression logicExpression, Object param) {

		 valor(logicExpression.getLeft());
		// direccion(logicExpression.getLeft());

		 valor(logicExpression.getRight());
		// direccion(logicExpression.getRight());

		var op = logicExpression.getOperator(); 
		String inst = ""; 
		
		switch (op) {
		case "<":{ 
			inst = "lt";break;  
		}
		case ">": {
			inst = "gt"; break; 
		}
		case "<=": {
			inst = "le"; break; 
		}
		case ">=": {
			inst = "ge"; break; 
		}
		case "==":{
			inst = "eq"; break; 
		}
		case "!=":{
			inst = "ne"; break; 
		}
	}
		out(inst+logicExpression.getTipoexpresion().sufijo()); 

		return null;
	}

	// class BoolExpression(Expression left, String operator, Expression right)
	// phase TypeChecking { Tipo tipoexpresion, boolean lvalue }
	@Override
	public Object visit(BoolExpression boolExpression, Object param) {

		 valor(boolExpression.getLeft());
		// direccion(boolExpression.getLeft());

		 valor(boolExpression.getRight());
		// direccion(boolExpression.getRight());

		String operator = boolExpression.getOperator(); 
		
		
		switch(operator) {
		case "&&":{
			out("and"); break; 
		}
		case "||":{
			out("or"); break; 
		}
		}
		

		return null;
	}

	// class AcederCap(Expression left, String right)
	// phase TypeChecking { Tipo tipoexpresion, boolean lvalue }
	@Override
	public Object visit(AcederCap acederCap, Object param) {

		// valor(acederCap.getLeft());
		direccion(acederCap);
		out("load"+ acederCap.getTipoexpresion().sufijo());

		return null;
	}

	// class FuncionExpresion(String nombre, List<Expression> argumentos)
	// phase Identification { Declaracionfuncion declaracionfuncion }
	// phase TypeChecking { Tipo tipoexpresion, boolean lvalue }
	@Override
	public Object visit(FuncionExpresion funcionExpresion, Object param) {

		// valor(funcionExpresion.argumentos());
		// direccion(funcionExpresion.argumentos());

		funcionExpresion.getArgumentos().forEach(p -> {
			valor(p); 
		});

		return null;
	}

}
