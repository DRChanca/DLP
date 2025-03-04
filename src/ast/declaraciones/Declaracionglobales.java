// Generated with VGen 2.0.0

package ast.declaraciones;

import ast.*;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	declaracionglobales: declaraciones -> declaracion:declaracion
	declaraciones -> 
*/
public class Declaracionglobales extends AbstractDeclaraciones  {

    // ----------------------------------
    // Instance Variables

	// declaracionglobales: declaraciones -> declaracion
	private Declaracion declaracion;

    // ----------------------------------
    // Constructors

	public Declaracionglobales(Declaracion declaracion) {
		super();

		if (declaracion == null)
			throw new IllegalArgumentException("Parameter 'declaracion' can't be null. Pass a non-null value or use 'declaracion?' in the abstract grammar");
		this.declaracion = declaracion;

		updatePositions(declaracion);
	}

	public Declaracionglobales(Object declaracion) {
		super();

        if (declaracion == null)
            throw new IllegalArgumentException("Parameter 'declaracion' can't be null. Pass a non-null value or use 'declaracion?' in the abstract grammar");
		this.declaracion = (Declaracion) declaracion;

		updatePositions(declaracion);
	}


    // ----------------------------------
    // declaracionglobales: declaraciones -> declaracion

	// Child 'declaracion' 

	public void setDeclaracion(Declaracion declaracion) {
		if (declaracion == null)
			throw new IllegalArgumentException("Parameter 'declaracion' can't be null. Pass a non-null value or use 'declaracion?' in the abstract grammar");
		this.declaracion = declaracion;

	}

    public Declaracion getDeclaracion() {
        return declaracion;
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "Declaracionglobales{" + " declaracion=" + this.getDeclaracion() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
