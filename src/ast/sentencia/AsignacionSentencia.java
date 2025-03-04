// Generated with VGen 2.0.0

package ast.sentencia;

import ast.expression.*;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	asignacionSentencia: sentencia -> left:expression expression:expression
	sentencia -> 
*/
public class AsignacionSentencia extends AbstractSentencia  {

    // ----------------------------------
    // Instance Variables

	// asignacionSentencia: sentencia -> left:expression expression
	private Expression left;
	private Expression expression;

    // ----------------------------------
    // Constructors

	public AsignacionSentencia(Expression left, Expression expression) {
		super();

		if (left == null)
			throw new IllegalArgumentException("Parameter 'left' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.left = left;

		if (expression == null)
			throw new IllegalArgumentException("Parameter 'expression' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.expression = expression;

		updatePositions(left, expression);
	}

	public AsignacionSentencia(Object left, Object expression) {
		super();

        if (left == null)
            throw new IllegalArgumentException("Parameter 'left' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.left = (Expression) left;

        if (expression == null)
            throw new IllegalArgumentException("Parameter 'expression' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.expression = (Expression) expression;

		updatePositions(left, expression);
	}


    // ----------------------------------
    // asignacionSentencia: sentencia -> left:expression expression

	// Child 'left:expression' 

	public void setLeft(Expression left) {
		if (left == null)
			throw new IllegalArgumentException("Parameter 'left' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.left = left;

	}

    public Expression getLeft() {
        return left;
    }


	// Child 'expression' 

	public void setExpression(Expression expression) {
		if (expression == null)
			throw new IllegalArgumentException("Parameter 'expression' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.expression = expression;

	}

    public Expression getExpression() {
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
        return "AsignacionSentencia{" + " left=" + this.getLeft() + " expression=" + this.getExpression() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
