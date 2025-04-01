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
public interface Sentencia extends AST {




    // --------------------------------
    // PHASE Identification

	// Attribute 'declafuncion:declaracionfuncion' 

	public void setDeclafuncion(Declaracionfuncion declafuncion);
	public Declaracionfuncion getDeclafuncion();


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
