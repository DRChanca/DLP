// Generated with VGen 2.0.0

package ast.expression;

import org.antlr.v4.runtime.Token;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	charExpresion: expression -> charValue:char
	expression -> 
*/
public class CharExpresion extends AbstractExpression  {

    // ----------------------------------
    // Instance Variables

	// charExpresion: expression -> char
	private char charValue;

    // ----------------------------------
    // Constructors

	public CharExpresion(char charValue) {
		super();

		this.charValue = charValue;

		updatePositions(charValue);
	}

	public CharExpresion(Object charValue) {
		super();

        if (charValue == null)
            throw new IllegalArgumentException("Parameter 'charValue' can't be null. Pass a non-null value or use 'char?' in the abstract grammar");
        var charValue_temp = charValue;
        if (charValue_temp instanceof Token)
            charValue_temp = ((Token) charValue_temp).getText();
        if (charValue_temp instanceof String)
            charValue_temp = ((String) charValue_temp).charAt(0);
        this.charValue = (char) charValue_temp;

		updatePositions(charValue);
	}


    // ----------------------------------
    // charExpresion: expression -> char

	// Child 'char' 

	public void setCharValue(char charValue) {
		this.charValue = charValue;

	}

    public char getCharValue() {
        return charValue;
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "CharExpresion{" + " charValue=" + this.getCharValue() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
