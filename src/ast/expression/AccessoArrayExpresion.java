// Generated with VGen 2.0.0

package ast.expression;

import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	accessoArrayExpresion: expression -> acceso:expression indice:expression
	expression -> 
*/
public class AccessoArrayExpresion extends AbstractExpression  {

    // ----------------------------------
    // Instance Variables

	// accessoArrayExpresion: expression -> acceso:expression indice:expression
	private Expression acceso;
	private Expression indice;

    // ----------------------------------
    // Constructors

	public AccessoArrayExpresion(Expression acceso, Expression indice) {
		super();

		if (acceso == null)
			throw new IllegalArgumentException("Parameter 'acceso' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.acceso = acceso;

		if (indice == null)
			throw new IllegalArgumentException("Parameter 'indice' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.indice = indice;

		updatePositions(acceso, indice);
	}

	public AccessoArrayExpresion(Object acceso, Object indice) {
		super();

        if (acceso == null)
            throw new IllegalArgumentException("Parameter 'acceso' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.acceso = (Expression) acceso;

        if (indice == null)
            throw new IllegalArgumentException("Parameter 'indice' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.indice = (Expression) indice;

		updatePositions(acceso, indice);
	}


    // ----------------------------------
    // accessoArrayExpresion: expression -> acceso:expression indice:expression

	// Child 'acceso:expression' 

	public void setAcceso(Expression acceso) {
		if (acceso == null)
			throw new IllegalArgumentException("Parameter 'acceso' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.acceso = acceso;

	}

    public Expression getAcceso() {
        return acceso;
    }


	// Child 'indice:expression' 

	public void setIndice(Expression indice) {
		if (indice == null)
			throw new IllegalArgumentException("Parameter 'indice' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.indice = indice;

	}

    public Expression getIndice() {
        return indice;
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "AccessoArrayExpresion{" + " acceso=" + this.getAcceso() + " indice=" + this.getIndice() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
