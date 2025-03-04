// Generated with VGen 2.0.0

package ast.sentencia;

import ast.expression.*;
import java.util.Optional;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	returnSentencia: sentencia -> expression:expression?
	sentencia -> 
*/
public class ReturnSentencia extends AbstractSentencia  {

    // ----------------------------------
    // Instance Variables

	// returnSentencia: sentencia -> expression?
	private Optional<Expression> expression;

    // ----------------------------------
    // Constructors

	public ReturnSentencia(Optional<Expression> expression) {
		super();

		if (expression == null)
			expression = Optional.empty();
		this.expression = expression;

		updatePositions(expression);
	}

	public ReturnSentencia(Object expression) {
		super();

        this.expression = castOptional(expression, Expression.class);
		updatePositions(expression);
	}


    // ----------------------------------
    // returnSentencia: sentencia -> expression?

	// Child 'expression?' 

	public void setExpression(Optional<Expression> expression) {
		if (expression == null)
			expression = Optional.empty();
		this.expression = expression;

	}

    public Optional<Expression> getExpression() {
        return expression;
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "ReturnSentencia{" + " expression=" + this.getExpression() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
