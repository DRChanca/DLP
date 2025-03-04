// Generated with VGen 2.0.0

package ast.tipo;

import org.antlr.v4.runtime.Token;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	StringTipo: tipo -> valor:string
	tipo -> 
*/
public class StringTipo extends AbstractTipo  {

    // ----------------------------------
    // Instance Variables

	// StringTipo: tipo -> valor:string
	private String valor;

    // ----------------------------------
    // Constructors

	public StringTipo(String valor) {
		super();

		if (valor == null)
			throw new IllegalArgumentException("Parameter 'valor' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.valor = valor;

		updatePositions(valor);
	}

	public StringTipo(Object valor) {
		super();

        if (valor == null)
            throw new IllegalArgumentException("Parameter 'valor' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.valor = (valor instanceof Token) ? ((Token) valor).getText() : (String) valor;

		updatePositions(valor);
	}


    // ----------------------------------
    // StringTipo: tipo -> valor:string

	// Child 'valor:string' 

	public void setValor(String valor) {
		if (valor == null)
			throw new IllegalArgumentException("Parameter 'valor' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.valor = valor;

	}

    public String getValor() {
        return valor;
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "StringTipo{" + " valor=" + this.getValor() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
