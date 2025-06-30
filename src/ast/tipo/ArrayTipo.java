// Generated with VGen 2.0.0

package ast.tipo;

import org.antlr.v4.runtime.Token;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	arrayTipo: tipo -> tamArray:int tipo:tipo
	tipo -> 
*/
public class ArrayTipo extends AbstractTipo  {

    // ----------------------------------
    // Instance Variables

	// arrayTipo: tipo -> tamArray:int tipo
	private int tamArray;
	private Tipo tipo;

    // ----------------------------------
    // Constructors

	public ArrayTipo(int tamArray, Tipo tipo) {
		super();

		this.tamArray = tamArray;

		if (tipo == null)
			throw new IllegalArgumentException("Parameter 'tipo' can't be null. Pass a non-null value or use 'tipo?' in the abstract grammar");
		this.tipo = tipo;

		updatePositions(tamArray, tipo);
	}

	public ArrayTipo(Object tamArray, Object tipo) {
		super();

        if (tamArray == null)
            throw new IllegalArgumentException("Parameter 'tamArray' can't be null. Pass a non-null value or use 'int?' in the abstract grammar");
        var tamArray_temp = tamArray;
        if (tamArray_temp instanceof Token)
            tamArray_temp = ((Token) tamArray_temp).getText();
        if (tamArray_temp instanceof String)
            tamArray_temp = Integer.valueOf((String) tamArray_temp);
        this.tamArray = (int) tamArray_temp;

        if (tipo == null)
            throw new IllegalArgumentException("Parameter 'tipo' can't be null. Pass a non-null value or use 'tipo?' in the abstract grammar");
		this.tipo = (Tipo) tipo;

		updatePositions(tamArray, tipo);
	}


    // ----------------------------------
    // arrayTipo: tipo -> tamArray:int tipo

	// Child 'tamArray:int' 

	public void setTamArray(int tamArray) {
		this.tamArray = tamArray;

	}

    public int getTamArray() {
        return tamArray;
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


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "ArrayTipo{" + " tamArray=" + this.getTamArray() + " tipo=" + this.getTipo() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed
    @Override
    public boolean mismoTipo(Tipo a) {
    	if(a == null || a.getClass() != this.getClass())
    		return false;
    	ArrayTipo otro = (ArrayTipo) a; 
    	return this.getTipo().getClass() == otro.getTipo().getClass();
    	
    	
    }
	@Override 
	public int getSize() {
		return this.tamArray*this.getTipo().getSize(); 
	}
	@Override
	public char sufijo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String tipoMapl() {
		var aux= this.tamArray + " * "+this.getTipo().tipoMapl(); 
		return aux;
	}

    // %% --------------------------------------
}
