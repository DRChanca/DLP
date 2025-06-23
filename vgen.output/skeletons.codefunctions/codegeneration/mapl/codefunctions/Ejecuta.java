// Generated with VGen 2.0.0

package codegeneration.mapl.codefunctions;

import ast.sentencia.*;
import codegeneration.mapl.*;


public class Ejecuta extends AbstractCodeFunction {

    public Ejecuta(MaplCodeSpecification specification) {
        super(specification);
    }


	// class PrintSentencia(List<Expression> expressions)
	// phase Identification { Declaracionfuncion declafuncion }
	@Override
	public Object visit(PrintSentencia printSentencia, Object param) {

		// valor(printSentencia.expressions());
		// direccion(printSentencia.expressions());

		out("<instruction>");

		return null;
	}

	// class ReadSentencia(List<Expression> expressions)
	// phase Identification { Declaracionfuncion declafuncion }
	@Override
	public Object visit(ReadSentencia readSentencia, Object param) {

		// valor(readSentencia.expressions());
		// direccion(readSentencia.expressions());

		out("<instruction>");

		return null;
	}

	// class PrintspSentencia(List<Expression> expressions)
	// phase Identification { Declaracionfuncion declafuncion }
	@Override
	public Object visit(PrintspSentencia printspSentencia, Object param) {

		// valor(printspSentencia.expressions());
		// direccion(printspSentencia.expressions());

		out("<instruction>");

		return null;
	}

	// class PrintlnSentencia(List<Expression> expressions)
	// phase Identification { Declaracionfuncion declafuncion }
	@Override
	public Object visit(PrintlnSentencia printlnSentencia, Object param) {

		// valor(printlnSentencia.expressions());
		// direccion(printlnSentencia.expressions());

		out("<instruction>");

		return null;
	}

	// class FuncionSentencia(String nombre, List<Expression> argumento)
	// phase Identification { Declaracionfuncion declaracionfuncion, Declaracionfuncion declafuncion }
	// phase TypeChecking { Tipo tipofunc }
	@Override
	public Object visit(FuncionSentencia funcionSentencia, Object param) {

		// valor(funcionSentencia.argumento());
		// direccion(funcionSentencia.argumento());

		out("<instruction>");

		return null;
	}

	// class AsignacionSentencia(Expression left, Expression expression)
	// phase Identification { Declaracionfuncion declafuncion }
	@Override
	public Object visit(AsignacionSentencia asignacionSentencia, Object param) {

		// valor(asignacionSentencia.getLeft());
		// direccion(asignacionSentencia.getLeft());

		// valor(asignacionSentencia.getExpression());
		// direccion(asignacionSentencia.getExpression());

		out("<instruction>");

		return null;
	}

	// class ReturnSentencia(Optional<Expression> expression)
	// phase Identification { Declaracionfuncion declafuncion }
	@Override
	public Object visit(ReturnSentencia returnSentencia, Object param) {

		// valor(returnSentencia.getExpression());
		// direccion(returnSentencia.getExpression());

		out("<instruction>");

		return null;
	}

	// class IfSentencia(Expression condicion, List<Sentencia> entonces, List<Sentencia> otro)
	// phase Identification { Declaracionfuncion declafuncion }
	@Override
	public Object visit(IfSentencia ifSentencia, Object param) {

		// valor(ifSentencia.getCondicion());
		// direccion(ifSentencia.getCondicion());

		// ejecuta(ifSentencia.entonces());

		// ejecuta(ifSentencia.otro());

		out("<instruction>");

		return null;
	}

	// class WhileSentencia(Expression condicion, List<Sentencia> entonces)
	// phase Identification { Declaracionfuncion declafuncion }
	@Override
	public Object visit(WhileSentencia whileSentencia, Object param) {

		// valor(whileSentencia.getCondicion());
		// direccion(whileSentencia.getCondicion());

		// ejecuta(whileSentencia.entonces());

		out("<instruction>");

		return null;
	}

}
