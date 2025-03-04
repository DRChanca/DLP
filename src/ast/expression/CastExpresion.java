// Generated with VGen 2.0.0

package ast.expression;

import ast.tipo.*;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	castExpresion: expression -> tipo:tipo expression:expression
	expression -> 
*/
public class CastExpresion extends AbstractExpression  {

    // ----------------------------------
    // Instance Variables

	// castExpresion: expression -> tipo expression
	private Tipo tipo;
	private Expression expression;

    // ----------------------------------
    // Constructors

	public CastExpresion(Tipo tipo, Expression expression) {
		super();

		if (tipo == null)
			throw new IllegalArgumentException("Parameter 'tipo' can't be null. Pass a non-null value or use 'tipo?' in the abstract grammar");
		this.tipo = tipo;

		if (expression == null)
			throw new IllegalArgumentException("Parameter 'expression' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.expression = expression;

		updatePositions(tipo, expression);
	}

	public CastExpresion(Object tipo, Object expression) {
		super();

        if (tipo == null)
            throw new IllegalArgumentException("Parameter 'tipo' can't be null. Pass a non-null value or use 'tipo?' in the abstract grammar");
		this.tipo = (Tipo) tipo;

        if (expression == null)
            throw new IllegalArgumentException("Parameter 'expression' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.expression = (Expression) expression;

		updatePositions(tipo, expression);
	}


    // ----------------------------------
    // castExpresion: expression -> tipo expression

	// Child 'tipo' 

	public void setTipo(Tipo tipo) {
		if (tipo == null)
			throw new IllegalArgumentException("Parameter 'tipo' can't be null. Pass a non-null value or use 'tipo?' in the abstract grammar");
		this.tipo = tipo;

	}

    public Tipo getTipo() {
        return tipo;
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
        return "CastExpresion{" + " tipo=" + this.getTipo() + " expression=" + this.getExpression() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
