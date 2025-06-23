// Generated with VGen 2.0.0

package codegeneration.mapl.codefunctions;

import ast.expression.*;
import codegeneration.mapl.*;


public class Direccion extends AbstractCodeFunction {

    public Direccion(MaplCodeSpecification specification) {
        super(specification);
    }


	// class IntExpresion(int intValue)
	// phase TypeChecking { Tipo tipoexpresion, boolean lvalue }
	@Override
	public Object visit(IntExpresion intExpresion, Object param) {

		out("<instruction>");

		return null;
	}

	// class RealExpresion(double doubleValue)
	// phase TypeChecking { Tipo tipoexpresion, boolean lvalue }
	@Override
	public Object visit(RealExpresion realExpresion, Object param) {

		out("<instruction>");

		return null;
	}

	// class IdentificadorExpresion(String name)
	// phase Identification { Definicion definicion }
	// phase TypeChecking { Tipo tipoexpresion, boolean lvalue }
	@Override
	public Object visit(IdentificadorExpresion identificadorExpresion, Object param) {

		out("<instruction>");

		return null;
	}

	// class CharExpresion(String name)
	// phase TypeChecking { Tipo tipoexpresion, boolean lvalue }
	@Override
	public Object visit(CharExpresion charExpresion, Object param) {

		out("<instruction>");

		return null;
	}

	// class AccessoArrayExpresion(Expression acceso, Expression indice)
	// phase TypeChecking { Tipo tipoexpresion, boolean lvalue }
	@Override
	public Object visit(AccessoArrayExpresion accessoArrayExpresion, Object param) {

		// valor(accessoArrayExpresion.getAcceso());
		// direccion(accessoArrayExpresion.getAcceso());

		// valor(accessoArrayExpresion.getIndice());
		// direccion(accessoArrayExpresion.getIndice());

		out("<instruction>");

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

		// valor(castExpresion.getExpression());
		// direccion(castExpresion.getExpression());

		out("<instruction>");

		return null;
	}

	// class NegacionExpresion(Expression expression)
	// phase TypeChecking { Tipo tipoexpresion, boolean lvalue }
	@Override
	public Object visit(NegacionExpresion negacionExpresion, Object param) {

		// valor(negacionExpresion.getExpression());
		// direccion(negacionExpresion.getExpression());

		out("<instruction>");

		return null;
	}

	// class ArithmeticExpresion(Expression left, String operator, Expression right)
	// phase TypeChecking { Tipo tipoexpresion, boolean lvalue }
	@Override
	public Object visit(ArithmeticExpresion arithmeticExpresion, Object param) {

		// valor(arithmeticExpresion.getLeft());
		// direccion(arithmeticExpresion.getLeft());

		// valor(arithmeticExpresion.getRight());
		// direccion(arithmeticExpresion.getRight());

		out("<instruction>");

		return null;
	}

	// class LogicExpression(Expression left, String operator, Expression right)
	// phase TypeChecking { Tipo tipoexpresion, boolean lvalue }
	@Override
	public Object visit(LogicExpression logicExpression, Object param) {

		// valor(logicExpression.getLeft());
		// direccion(logicExpression.getLeft());

		// valor(logicExpression.getRight());
		// direccion(logicExpression.getRight());

		out("<instruction>");

		return null;
	}

	// class BoolExpression(Expression left, String operator, Expression right)
	// phase TypeChecking { Tipo tipoexpresion, boolean lvalue }
	@Override
	public Object visit(BoolExpression boolExpression, Object param) {

		// valor(boolExpression.getLeft());
		// direccion(boolExpression.getLeft());

		// valor(boolExpression.getRight());
		// direccion(boolExpression.getRight());

		out("<instruction>");

		return null;
	}

	// class AcederCap(Expression left, String right)
	// phase TypeChecking { Tipo tipoexpresion, boolean lvalue }
	@Override
	public Object visit(AcederCap acederCap, Object param) {

		// valor(acederCap.getLeft());
		// direccion(acederCap.getLeft());

		out("<instruction>");

		return null;
	}

	// class FuncionExpresion(String nombre, List<Expression> argumentos)
	// phase Identification { Declaracionfuncion declaracionfuncion }
	// phase TypeChecking { Tipo tipoexpresion, boolean lvalue }
	@Override
	public Object visit(FuncionExpresion funcionExpresion, Object param) {

		// valor(funcionExpresion.argumentos());
		// direccion(funcionExpresion.argumentos());

		out("<instruction>");

		return null;
	}

}
