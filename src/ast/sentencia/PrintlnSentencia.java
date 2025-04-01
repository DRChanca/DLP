// Generated with VGen 2.0.0

package ast.sentencia;

import ast.expression.*;
import ast.declaraciones.*;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	printlnSentencia: sentencia -> expressions:expression*
	sentencia -> 
	
	PHASE Identification
	sentencia -> declafuncion:declaracionfuncion
*/
public class PrintlnSentencia extends AbstractSentencia  {

    // ----------------------------------
    // Instance Variables

	// printlnSentencia: sentencia -> expression*
	private List<Expression> expressions;

    // ----------------------------------
    // Constructors

	public PrintlnSentencia(List<Expression> expressions) {
		super();

		if (expressions == null)
			expressions = new ArrayList<>();
		this.expressions = expressions;

		updatePositions(expressions);
	}

	public PrintlnSentencia(Object expressions) {
		super();

        this.expressions = castList(expressions, unwrapIfContext.andThen(Expression.class::cast));
		updatePositions(expressions);
	}


    // ----------------------------------
    // printlnSentencia: sentencia -> expression*

	// Child 'expression*' 

	public void setExpressions(List<Expression> expressions) {
		if (expressions == null)
			expressions = new ArrayList<>();
		this.expressions = expressions;

	}

    public List<Expression> getExpressions() {
        return expressions;
    }

    public Stream<Expression> expressions() {
        return expressions.stream();
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "PrintlnSentencia{" + " expressions=" + this.getExpressions() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
