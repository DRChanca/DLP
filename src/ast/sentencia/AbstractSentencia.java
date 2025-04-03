// Generated with VGen 2.0.0

package ast.sentencia;

import ast.*;
import ast.declaraciones.*;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	sentencia -> 
	
	PHASE Identification
	sentencia -> declafuncion:declaracionfuncion
*/
public abstract class AbstractSentencia extends AbstractAST implements Sentencia {

    // ----------------------------------
    // Instance Variables


    // PHASE Identification
	private Declaracionfuncion declafuncion;



    // --------------------------------
    // PHASE Identification

	// Attribute 'declafuncion:declaracionfuncion' 

	public void setDeclafuncion(Declaracionfuncion declafuncion) {
		if (declafuncion == null)
			throw new IllegalArgumentException("Parameter 'declafuncion' can't be null. Pass a non-null value or use 'declaracionfuncion?' in the abstract grammar");
		this.declafuncion = declafuncion;

	}

    public Declaracionfuncion getDeclafuncion() {
        return declafuncion;
    }



    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
