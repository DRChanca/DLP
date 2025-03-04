// Generated with VGen 2.0.0

package ast.sentencia;

import ast.expression.*;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	ifSentencia: sentencia -> condicion:expression entonces:sentencia* otro:sentencia*
	sentencia -> 
*/
public class IfSentencia extends AbstractSentencia  {

    // ----------------------------------
    // Instance Variables

	// ifSentencia: sentencia -> condicion:expression entonces:sentencia* otro:sentencia*
	private Expression condicion;
	private List<Sentencia> entonces;
	private List<Sentencia> otro;

    // ----------------------------------
    // Constructors

	public IfSentencia(Expression condicion, List<Sentencia> entonces, List<Sentencia> otro) {
		super();

		if (condicion == null)
			throw new IllegalArgumentException("Parameter 'condicion' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.condicion = condicion;

		if (entonces == null)
			entonces = new ArrayList<>();
		this.entonces = entonces;

		if (otro == null)
			otro = new ArrayList<>();
		this.otro = otro;

		updatePositions(condicion, entonces, otro);
	}

	public IfSentencia(Object condicion, Object entonces, Object otro) {
		super();

        if (condicion == null)
            throw new IllegalArgumentException("Parameter 'condicion' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.condicion = (Expression) condicion;

        this.entonces = castList(entonces, unwrapIfContext.andThen(Sentencia.class::cast));
        this.otro = castList(otro, unwrapIfContext.andThen(Sentencia.class::cast));
		updatePositions(condicion, entonces, otro);
	}


    // ----------------------------------
    // ifSentencia: sentencia -> condicion:expression entonces:sentencia* otro:sentencia*

	// Child 'condicion:expression' 

	public void setCondicion(Expression condicion) {
		if (condicion == null)
			throw new IllegalArgumentException("Parameter 'condicion' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.condicion = condicion;

	}

    public Expression getCondicion() {
        return condicion;
    }


	// Child 'entonces:sentencia*' 

	public void setEntonces(List<Sentencia> entonces) {
		if (entonces == null)
			entonces = new ArrayList<>();
		this.entonces = entonces;

	}

    public List<Sentencia> getEntonces() {
        return entonces;
    }

    public Stream<Sentencia> entonces() {
        return entonces.stream();
    }


	// Child 'otro:sentencia*' 

	public void setOtro(List<Sentencia> otro) {
		if (otro == null)
			otro = new ArrayList<>();
		this.otro = otro;

	}

    public List<Sentencia> getOtro() {
        return otro;
    }

    public Stream<Sentencia> otro() {
        return otro.stream();
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "IfSentencia{" + " condicion=" + this.getCondicion() + " entonces=" + this.getEntonces() + " otro=" + this.getOtro() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
