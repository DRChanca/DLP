// Generated with VGen 2.0.0

package ast.declaraciones;

import ast.*;
import ast.tipo.*;
import ast.sentencia.*;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.Optional;
import org.antlr.v4.runtime.Token;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	declaracionfuncion: declaraciones -> nombre:string argumento:argumento* tipo:tipo? variablesLocales:variablesLocales* sentencias:sentencia*
	declaraciones -> 
*/
public class Declaracionfuncion extends AbstractDeclaraciones  {

    // ----------------------------------
    // Instance Variables

	// declaracionfuncion: declaraciones -> nombre:string argumento:argumento* tipo? variablesLocales:variablesLocales* sentencia*
	private String nombre;
	private List<Argumento> argumento;
	private Optional<Tipo> tipo;
	private List<VariablesLocales> variablesLocales;
	private List<Sentencia> sentencias;

    // ----------------------------------
    // Constructors

	public Declaracionfuncion(String nombre, List<Argumento> argumento, Optional<Tipo> tipo, List<VariablesLocales> variablesLocales, List<Sentencia> sentencias) {
		super();

		if (nombre == null)
			throw new IllegalArgumentException("Parameter 'nombre' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.nombre = nombre;

		if (argumento == null)
			argumento = new ArrayList<>();
		this.argumento = argumento;

		if (tipo == null)
			tipo = Optional.empty();
		this.tipo = tipo;

		if (variablesLocales == null)
			variablesLocales = new ArrayList<>();
		this.variablesLocales = variablesLocales;

		if (sentencias == null)
			sentencias = new ArrayList<>();
		this.sentencias = sentencias;

		updatePositions(nombre, argumento, tipo, variablesLocales, sentencias);
	}

	public Declaracionfuncion(Object nombre, Object argumento, Object tipo, Object variablesLocales, Object sentencias) {
		super();

        if (nombre == null)
            throw new IllegalArgumentException("Parameter 'nombre' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.nombre = (nombre instanceof Token) ? ((Token) nombre).getText() : (String) nombre;

        this.argumento = castList(argumento, unwrapIfContext.andThen(Argumento.class::cast));
        this.tipo = castOptional(tipo, Tipo.class);
        this.variablesLocales = castList(variablesLocales, unwrapIfContext.andThen(VariablesLocales.class::cast));
        this.sentencias = castList(sentencias, unwrapIfContext.andThen(Sentencia.class::cast));
		updatePositions(nombre, argumento, tipo, variablesLocales, sentencias);
	}


    // ----------------------------------
    // declaracionfuncion: declaraciones -> nombre:string argumento:argumento* tipo? variablesLocales:variablesLocales* sentencia*

	// Child 'nombre:string' 

	public void setNombre(String nombre) {
		if (nombre == null)
			throw new IllegalArgumentException("Parameter 'nombre' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.nombre = nombre;

	}

    public String getNombre() {
        return nombre;
    }


	// Child 'argumento:argumento*' 

	public void setArgumento(List<Argumento> argumento) {
		if (argumento == null)
			argumento = new ArrayList<>();
		this.argumento = argumento;

	}

    public List<Argumento> getArgumento() {
        return argumento;
    }

    public Stream<Argumento> argumento() {
        return argumento.stream();
    }


	// Child 'tipo?' 

	public void setTipo(Optional<Tipo> tipo) {
		if (tipo == null)
			tipo = Optional.empty();
		this.tipo = tipo;

	}

    public Optional<Tipo> getTipo() {
        return tipo;
    }


	// Child 'variablesLocales:variablesLocales*' 

	public void setVariablesLocales(List<VariablesLocales> variablesLocales) {
		if (variablesLocales == null)
			variablesLocales = new ArrayList<>();
		this.variablesLocales = variablesLocales;

	}

    public List<VariablesLocales> getVariablesLocales() {
        return variablesLocales;
    }

    public Stream<VariablesLocales> variablesLocales() {
        return variablesLocales.stream();
    }


	// Child 'sentencia*' 

	public void setSentencias(List<Sentencia> sentencias) {
		if (sentencias == null)
			sentencias = new ArrayList<>();
		this.sentencias = sentencias;

	}

    public List<Sentencia> getSentencias() {
        return sentencias;
    }

    public Stream<Sentencia> sentencias() {
        return sentencias.stream();
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "Declaracionfuncion{" + " nombre=" + this.getNombre() + " argumento=" + this.getArgumento() + " tipo=" + this.getTipo() + " variablesLocales=" + this.getVariablesLocales() + " sentencias=" + this.getSentencias() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
