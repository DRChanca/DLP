// Generated with VGen 2.0.0

package ast.expression;

import org.antlr.v4.runtime.Token;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	realExpresion: expression -> doubleValue:double
	expression -> 
*/
public class RealExpresion extends AbstractExpression  {

    // ----------------------------------
    // Instance Variables

	// realExpresion: expression -> double
	private double doubleValue;

    // ----------------------------------
    // Constructors

	public RealExpresion(double doubleValue) {
		super();

		this.doubleValue = doubleValue;

		updatePositions(doubleValue);
	}

	public RealExpresion(Object doubleValue) {
		super();

        if (doubleValue == null)
            throw new IllegalArgumentException("Parameter 'doubleValue' can't be null. Pass a non-null value or use 'double?' in the abstract grammar");
        var doubleValue_temp = doubleValue;
        if (doubleValue_temp instanceof Token)
            doubleValue_temp = ((Token) doubleValue_temp).getText();
        if (doubleValue_temp instanceof String)
            doubleValue_temp = Double.valueOf((String) doubleValue_temp);
        this.doubleValue = (double) doubleValue_temp;

		updatePositions(doubleValue);
	}


    // ----------------------------------
    // realExpresion: expression -> double

	// Child 'double' 

	public void setDoubleValue(double doubleValue) {
		this.doubleValue = doubleValue;

	}

    public double getDoubleValue() {
        return doubleValue;
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "RealExpresion{" + " doubleValue=" + this.getDoubleValue() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
