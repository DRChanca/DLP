// Generated with VGen 2.0.0

package ast;

import ast.tipo.*;
import org.antlr.v4.runtime.Token;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	definicion -> IDENT:string tipo:tipo
	
	PHASE MemoryAllocation
	definicion -> address:int
*/
public class Definicion extends AbstractAST  {

    // ----------------------------------
    // Instance Variables

	// definicion -> IDENT:string tipo
	private String IDENT;
	private Tipo tipo;

    // PHASE MemoryAllocation
	private int address;

    // ----------------------------------
    // Constructors

	public Definicion(String IDENT, Tipo tipo) {
		super();

		if (IDENT == null)
			throw new IllegalArgumentException("Parameter 'IDENT' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.IDENT = IDENT;

		if (tipo == null)
			throw new IllegalArgumentException("Parameter 'tipo' can't be null. Pass a non-null value or use 'tipo?' in the abstract grammar");
		this.tipo = tipo;

		updatePositions(IDENT, tipo);
	}

	public Definicion(Object IDENT, Object tipo) {
		super();

        if (IDENT == null)
            throw new IllegalArgumentException("Parameter 'IDENT' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.IDENT = (IDENT instanceof Token) ? ((Token) IDENT).getText() : (String) IDENT;

        if (tipo == null)
            throw new IllegalArgumentException("Parameter 'tipo' can't be null. Pass a non-null value or use 'tipo?' in the abstract grammar");
		this.tipo = (Tipo) tipo;

		updatePositions(IDENT, tipo);
	}


    // ----------------------------------
    // definicion -> IDENT:string tipo

	// Child 'IDENT:string' 

	public void setIDENT(String IDENT) {
		if (IDENT == null)
			throw new IllegalArgumentException("Parameter 'IDENT' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.IDENT = IDENT;

	}

    public String getIDENT() {
        return IDENT;
    }


	// Child 'tipo' 

	public void setTipo(Tipo tipo) {
		if (tipo == null)
			throw new IllegalArgumentException("Parameter 'tipo' can't be null. Pass a non-null value or use 'tipo?' in the abstract grammar");
		this.tipo = tipo;

	}

    public Tipo getTipo() {
        return tipo;
    }



    // --------------------------------
    // PHASE MemoryAllocation

	// Attribute 'address:int' 

	public void setAddress(int address) {
		this.address = address;

	}

    public int getAddress() {
        return address;
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "Definicion{" + " IDENT=" + this.getIDENT() + " tipo=" + this.getTipo() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
