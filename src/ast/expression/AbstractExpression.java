// Generated with VGen 2.0.0

package ast.expression;

import ast.*;
import ast.tipo.*;
import org.antlr.v4.runtime.Token;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	expression -> 
	
	PHASE TypeChecking
	expression -> tipoexpresion:tipo
	expression -> lvalue:boolean
*/
public abstract class AbstractExpression extends AbstractAST implements Expression {

    // ----------------------------------
    // Instance Variables


    // PHASE TypeChecking
	private Tipo tipoexpresion;
	private boolean lvalue;



    // --------------------------------
    // PHASE TypeChecking

	// Attribute 'tipoexpresion:tipo' 

	public void setTipoexpresion(Tipo tipoexpresion) {
		if (tipoexpresion == null)
			throw new IllegalArgumentException("Parameter 'tipoexpresion' can't be null. Pass a non-null value or use 'tipo?' in the abstract grammar");
		this.tipoexpresion = tipoexpresion;

	}

    public Tipo getTipoexpresion() {
        return tipoexpresion;
    }


	// Attribute 'lvalue:boolean' 

	public void setLvalue(boolean lvalue) {
		this.lvalue = lvalue;

	}

    public boolean isLvalue() {
        return lvalue;
    }



    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
