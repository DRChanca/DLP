// Generated with VGen 2.0.0

/**
 * AstPrinter. Utilidad que ayuda a validar un arbol AST:
 * - Muestra la estructura del árbol en HTML.
 * - Destaca los hijos/propiedades a null.
 * - Muestra a qué texto apuntan las posiciones de cada nodo (linea/columna)
 *   ayudando a decidir cual de ellas usar en los errores y generación de código.
 *
 * Esta clase se genera con VGen. El uso de esta clase es opcional (puede eliminarse del proyecto).
 *
 */

package visitor;

import ast.*;
import ast.declaraciones.*;
import ast.sentencia.*;
import ast.expression.*;
import ast.tipo.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class AstPrinter implements Visitor {

    // Css classes
    private static final String OMITTED_SOURCE_TEXT_CLASS = "omittedSourceText";
    private static final String POS_CLASS = "vgen-pos";
    private static final String DOTS_CLASS = "vgen-dots";
    private static final String VALUE_CLASS = "vgen-value";
    private static final String BODY_CLASS = "vgen-body";
    private static final String CHILD_NAME_CLASS = "vgen-child-name";
    private static final String TABS_CLASS = "vgen-tabs";
    private static final String TYPE_CLASS = "vgen-type";
    private static final String NON_NODE_SOURCE_TEXT_CLASS = "vgen-nonNodeSourceText";
    private static final String NODE_SOURCE_TEXT_CLASS = "vgen-nodeSourceText";
    private static final String SOURCE_TEXT_CLASS = "vgen-sourceText";
    private static final String NULL_CLASS = "vgen-null";

    /**
    * toHtml. Muestra la estructura del AST indicando qué hay en las posiciones
    * (línea y columna) de cada nodo.
    *
    * @param sourceFile El fichero del cual se ha obtenido el AST.
    * @param root       El AST creado a partir de sourceFile.
    * @param filename   Nombre del fichero HMTL a crear con la traza del AST.
    */

    public static void toHtml(String sourceFile, AST root, String filename) {
        try (PrintWriter writer = new PrintWriter(
                new FileWriter(filename.endsWith(".html") ? filename : filename + ".html"))) {

            writer.println(HEADER);

            if (root != null) {
                AstPrinter printer = new AstPrinter(writer, loadLines(sourceFile));
                printer.printNodes(root);
            } else
                writer.println("root == null");

            writer.println(FOOTER);

            System.err.println(ls + "AstPrinter: Fichero '" + filename + ".html' generado.");

        } catch (IOException e) {
            System.err.println(ls + "AstPrinter: No se ha podido crear el fichero " + filename);
            e.printStackTrace();
        }
    }

    private void printNodes(AST root) {
        writer.println("<div class=\"" + BODY_CLASS + "\">");

        writeDiv(span(CHILD_NAME_CLASS, root.getClass().getSimpleName()) + " = ");
        root.accept(this, Integer.valueOf(0));

        writer.println("</div>");

    }

    public static void toHtml(AST raiz, String filename) {
        toHtml(null, raiz, filename);
    }

    private AstPrinter(PrintWriter writer, List<String> sourceLines) {
        this(writer, sourceLines, 3);
    }

    private AstPrinter(PrintWriter writer, List<String> sourceLines, int tabSize) {
        this.writer = writer;
        this.sourceLines = sourceLines;
        this.tabSize = tabSize;

        tabulator = "&nbsp;".repeat(tabSize - 1);
    }

    //$ -------------------------------------------------------------------------------------
    // Aquí empiezan los 'visit' de los nodos


	@Override
	public Object visit(Program program, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)
        printListOfNodesChild(indent + 1, "declaracioneses", "List<Declaraciones>", program.getDeclaracioneses());

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
		printUnknownFields(indent + 1, program, "declaracioneses");
		return null;
	}

	@Override
	public Object visit(Declaracionstructs declaracionstructs, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)
        printNonNodeChild(indent + 1, "nombre", "String", declaracionstructs.getNombre());
        printListOfNodesChild(indent + 1, "definicions", "List<Definicion>", declaracionstructs.getDefinicions());

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
		printUnknownFields(indent + 1, declaracionstructs, "nombre", "definicions");
		return null;
	}

	@Override
	public Object visit(Declaracionglobales declaracionglobales, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)
        printNodeChild(indent + 1, "definicion", "Definicion", declaracionglobales.getDefinicion());

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
		printUnknownFields(indent + 1, declaracionglobales, "definicion");
		return null;
	}

	@Override
	public Object visit(Declaracionfuncion declaracionfuncion, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)
        printNonNodeChild(indent + 1, "nombre", "String", declaracionfuncion.getNombre());
        printListOfNodesChild(indent + 1, "argumento", "List<Definicion>", declaracionfuncion.getArgumento());
        printNodeChild(indent + 1, "tipo", "Optional<Tipo>", declaracionfuncion.getTipo().orElse(null));
        printListOfNodesChild(indent + 1, "variablesLocales", "List<Definicion>", declaracionfuncion.getVariablesLocales());
        printListOfNodesChild(indent + 1, "sentencias", "List<Sentencia>", declaracionfuncion.getSentencias());

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
        printToString(indent + 1, "vgen-attribute-phase-1", "tipofunc", "Tipo", declaracionfuncion.getTipofunc());
		printUnknownFields(indent + 1, declaracionfuncion, "nombre", "argumento", "tipo", "variablesLocales", "sentencias", "tipofunc");
		return null;
	}

	@Override
	public Object visit(Definicion definicion, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)
        printNonNodeChild(indent + 1, "IDENT", "String", definicion.getIDENT());
        printNodeChild(indent + 1, "tipo", "Tipo", definicion.getTipo());

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
        printToString(indent + 1, "vgen-attribute-phase-2", "address", "int", definicion.getAddress());
		printUnknownFields(indent + 1, definicion, "IDENT", "tipo", "address");
		return null;
	}

	@Override
	public Object visit(PrintSentencia printSentencia, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)
        printListOfNodesChild(indent + 1, "expressions", "List<Expression>", printSentencia.getExpressions());

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
        printToString(indent + 1, "vgen-attribute-phase-0", "declafuncion", "Declaracionfuncion", printSentencia.getDeclafuncion());
		printUnknownFields(indent + 1, printSentencia, "expressions", "declafuncion");
		return null;
	}

	@Override
	public Object visit(ReadSentencia readSentencia, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)
        printListOfNodesChild(indent + 1, "expressions", "List<Expression>", readSentencia.getExpressions());

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
        printToString(indent + 1, "vgen-attribute-phase-0", "declafuncion", "Declaracionfuncion", readSentencia.getDeclafuncion());
		printUnknownFields(indent + 1, readSentencia, "expressions", "declafuncion");
		return null;
	}

	@Override
	public Object visit(PrintspSentencia printspSentencia, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)
        printListOfNodesChild(indent + 1, "expressions", "List<Expression>", printspSentencia.getExpressions());

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
        printToString(indent + 1, "vgen-attribute-phase-0", "declafuncion", "Declaracionfuncion", printspSentencia.getDeclafuncion());
		printUnknownFields(indent + 1, printspSentencia, "expressions", "declafuncion");
		return null;
	}

	@Override
	public Object visit(PrintlnSentencia printlnSentencia, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)
        printListOfNodesChild(indent + 1, "expressions", "List<Expression>", printlnSentencia.getExpressions());

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
        printToString(indent + 1, "vgen-attribute-phase-0", "declafuncion", "Declaracionfuncion", printlnSentencia.getDeclafuncion());
		printUnknownFields(indent + 1, printlnSentencia, "expressions", "declafuncion");
		return null;
	}

	@Override
	public Object visit(FuncionSentencia funcionSentencia, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)
        printNonNodeChild(indent + 1, "nombre", "String", funcionSentencia.getNombre());
        printListOfNodesChild(indent + 1, "argumento", "List<Expression>", funcionSentencia.getArgumento());

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
        printToString(indent + 1, "vgen-attribute-phase-0", "declafuncion", "Declaracionfuncion", funcionSentencia.getDeclafuncion());
        printToString(indent + 1, "vgen-attribute-phase-0", "declaracionfuncion", "Declaracionfuncion", funcionSentencia.getDeclaracionfuncion());
        printToString(indent + 1, "vgen-attribute-phase-1", "tipofunc", "Tipo", funcionSentencia.getTipofunc());
		printUnknownFields(indent + 1, funcionSentencia, "nombre", "argumento", "declafuncion", "declaracionfuncion", "tipofunc");
		return null;
	}

	@Override
	public Object visit(AsignacionSentencia asignacionSentencia, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)
        printNodeChild(indent + 1, "left", "Expression", asignacionSentencia.getLeft());
        printNodeChild(indent + 1, "expression", "Expression", asignacionSentencia.getExpression());

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
        printToString(indent + 1, "vgen-attribute-phase-0", "declafuncion", "Declaracionfuncion", asignacionSentencia.getDeclafuncion());
		printUnknownFields(indent + 1, asignacionSentencia, "left", "expression", "declafuncion");
		return null;
	}

	@Override
	public Object visit(ReturnSentencia returnSentencia, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)
        printNodeChild(indent + 1, "expression", "Optional<Expression>", returnSentencia.getExpression().orElse(null));

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
        printToString(indent + 1, "vgen-attribute-phase-0", "declafuncion", "Declaracionfuncion", returnSentencia.getDeclafuncion());
		printUnknownFields(indent + 1, returnSentencia, "expression", "declafuncion");
		return null;
	}

	@Override
	public Object visit(IfSentencia ifSentencia, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)
        printNodeChild(indent + 1, "condicion", "Expression", ifSentencia.getCondicion());
        printListOfNodesChild(indent + 1, "entonces", "List<Sentencia>", ifSentencia.getEntonces());
        printListOfNodesChild(indent + 1, "otro", "List<Sentencia>", ifSentencia.getOtro());

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
        printToString(indent + 1, "vgen-attribute-phase-0", "declafuncion", "Declaracionfuncion", ifSentencia.getDeclafuncion());
		printUnknownFields(indent + 1, ifSentencia, "condicion", "entonces", "otro", "declafuncion");
		return null;
	}

	@Override
	public Object visit(WhileSentencia whileSentencia, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)
        printNodeChild(indent + 1, "condicion", "Expression", whileSentencia.getCondicion());
        printListOfNodesChild(indent + 1, "entonces", "List<Sentencia>", whileSentencia.getEntonces());

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
        printToString(indent + 1, "vgen-attribute-phase-0", "declafuncion", "Declaracionfuncion", whileSentencia.getDeclafuncion());
		printUnknownFields(indent + 1, whileSentencia, "condicion", "entonces", "declafuncion");
		return null;
	}

	@Override
	public Object visit(IntExpresion intExpresion, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)
        printNonNodeChild(indent + 1, "intValue", "int", intExpresion.getIntValue());

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
        printToString(indent + 1, "vgen-attribute-phase-1", "tipoexpresion", "Tipo", intExpresion.getTipoexpresion());
        printToString(indent + 1, "vgen-attribute-phase-1", "lvalue", "boolean", intExpresion.isLvalue());
		printUnknownFields(indent + 1, intExpresion, "intValue", "tipoexpresion", "lvalue");
		return null;
	}

	@Override
	public Object visit(RealExpresion realExpresion, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)
        printNonNodeChild(indent + 1, "doubleValue", "double", realExpresion.getDoubleValue());

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
        printToString(indent + 1, "vgen-attribute-phase-1", "tipoexpresion", "Tipo", realExpresion.getTipoexpresion());
        printToString(indent + 1, "vgen-attribute-phase-1", "lvalue", "boolean", realExpresion.isLvalue());
		printUnknownFields(indent + 1, realExpresion, "doubleValue", "tipoexpresion", "lvalue");
		return null;
	}

	@Override
	public Object visit(IdentificadorExpresion identificadorExpresion, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)
        printNonNodeChild(indent + 1, "name", "String", identificadorExpresion.getName());

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
        printToString(indent + 1, "vgen-attribute-phase-0", "definicion", "Definicion", identificadorExpresion.getDefinicion());
        printToString(indent + 1, "vgen-attribute-phase-1", "tipoexpresion", "Tipo", identificadorExpresion.getTipoexpresion());
        printToString(indent + 1, "vgen-attribute-phase-1", "lvalue", "boolean", identificadorExpresion.isLvalue());
		printUnknownFields(indent + 1, identificadorExpresion, "name", "tipoexpresion", "lvalue", "definicion");
		return null;
	}

	@Override
	public Object visit(CharExpresion charExpresion, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)
        printNonNodeChild(indent + 1, "name", "String", charExpresion.getName());

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
        printToString(indent + 1, "vgen-attribute-phase-1", "tipoexpresion", "Tipo", charExpresion.getTipoexpresion());
        printToString(indent + 1, "vgen-attribute-phase-1", "lvalue", "boolean", charExpresion.isLvalue());
		printUnknownFields(indent + 1, charExpresion, "name", "tipoexpresion", "lvalue");
		return null;
	}

	@Override
	public Object visit(AccessoArrayExpresion accessoArrayExpresion, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)
        printNodeChild(indent + 1, "acceso", "Expression", accessoArrayExpresion.getAcceso());
        printNodeChild(indent + 1, "indice", "Expression", accessoArrayExpresion.getIndice());

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
        printToString(indent + 1, "vgen-attribute-phase-1", "tipoexpresion", "Tipo", accessoArrayExpresion.getTipoexpresion());
        printToString(indent + 1, "vgen-attribute-phase-1", "lvalue", "boolean", accessoArrayExpresion.isLvalue());
		printUnknownFields(indent + 1, accessoArrayExpresion, "acceso", "indice", "tipoexpresion", "lvalue");
		return null;
	}

	@Override
	public Object visit(ParentesisExpresion parentesisExpresion, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)
        printNodeChild(indent + 1, "expression", "Expression", parentesisExpresion.getExpression());

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
        printToString(indent + 1, "vgen-attribute-phase-1", "tipoexpresion", "Tipo", parentesisExpresion.getTipoexpresion());
        printToString(indent + 1, "vgen-attribute-phase-1", "lvalue", "boolean", parentesisExpresion.isLvalue());
		printUnknownFields(indent + 1, parentesisExpresion, "expression", "tipoexpresion", "lvalue");
		return null;
	}

	@Override
	public Object visit(CastExpresion castExpresion, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)
        printNodeChild(indent + 1, "tipo", "Tipo", castExpresion.getTipo());
        printNodeChild(indent + 1, "expression", "Expression", castExpresion.getExpression());

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
        printToString(indent + 1, "vgen-attribute-phase-1", "tipoexpresion", "Tipo", castExpresion.getTipoexpresion());
        printToString(indent + 1, "vgen-attribute-phase-1", "lvalue", "boolean", castExpresion.isLvalue());
		printUnknownFields(indent + 1, castExpresion, "tipo", "expression", "tipoexpresion", "lvalue");
		return null;
	}

	@Override
	public Object visit(NegacionExpresion negacionExpresion, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)
        printNodeChild(indent + 1, "expression", "Expression", negacionExpresion.getExpression());

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
        printToString(indent + 1, "vgen-attribute-phase-1", "tipoexpresion", "Tipo", negacionExpresion.getTipoexpresion());
        printToString(indent + 1, "vgen-attribute-phase-1", "lvalue", "boolean", negacionExpresion.isLvalue());
		printUnknownFields(indent + 1, negacionExpresion, "expression", "tipoexpresion", "lvalue");
		return null;
	}

	@Override
	public Object visit(ArithmeticExpresion arithmeticExpresion, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)
        printNodeChild(indent + 1, "left", "Expression", arithmeticExpresion.getLeft());
        printNonNodeChild(indent + 1, "operator", "String", arithmeticExpresion.getOperator());
        printNodeChild(indent + 1, "right", "Expression", arithmeticExpresion.getRight());

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
        printToString(indent + 1, "vgen-attribute-phase-1", "tipoexpresion", "Tipo", arithmeticExpresion.getTipoexpresion());
        printToString(indent + 1, "vgen-attribute-phase-1", "lvalue", "boolean", arithmeticExpresion.isLvalue());
		printUnknownFields(indent + 1, arithmeticExpresion, "left", "operator", "right", "tipoexpresion", "lvalue");
		return null;
	}

	@Override
	public Object visit(LogicExpression logicExpression, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)
        printNodeChild(indent + 1, "left", "Expression", logicExpression.getLeft());
        printNonNodeChild(indent + 1, "operator", "String", logicExpression.getOperator());
        printNodeChild(indent + 1, "right", "Expression", logicExpression.getRight());

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
        printToString(indent + 1, "vgen-attribute-phase-1", "tipoexpresion", "Tipo", logicExpression.getTipoexpresion());
        printToString(indent + 1, "vgen-attribute-phase-1", "lvalue", "boolean", logicExpression.isLvalue());
		printUnknownFields(indent + 1, logicExpression, "left", "operator", "right", "tipoexpresion", "lvalue");
		return null;
	}

	@Override
	public Object visit(BoolExpression boolExpression, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)
        printNodeChild(indent + 1, "left", "Expression", boolExpression.getLeft());
        printNonNodeChild(indent + 1, "operator", "String", boolExpression.getOperator());
        printNodeChild(indent + 1, "right", "Expression", boolExpression.getRight());

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
        printToString(indent + 1, "vgen-attribute-phase-1", "tipoexpresion", "Tipo", boolExpression.getTipoexpresion());
        printToString(indent + 1, "vgen-attribute-phase-1", "lvalue", "boolean", boolExpression.isLvalue());
		printUnknownFields(indent + 1, boolExpression, "left", "operator", "right", "tipoexpresion", "lvalue");
		return null;
	}

	@Override
	public Object visit(AcederCap acederCap, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)
        printNodeChild(indent + 1, "left", "Expression", acederCap.getLeft());
        printNonNodeChild(indent + 1, "right", "String", acederCap.getRight());

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
        printToString(indent + 1, "vgen-attribute-phase-1", "tipoexpresion", "Tipo", acederCap.getTipoexpresion());
        printToString(indent + 1, "vgen-attribute-phase-1", "lvalue", "boolean", acederCap.isLvalue());
		printUnknownFields(indent + 1, acederCap, "left", "right", "tipoexpresion", "lvalue");
		return null;
	}

	@Override
	public Object visit(FuncionExpresion funcionExpresion, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)
        printNonNodeChild(indent + 1, "nombre", "String", funcionExpresion.getNombre());
        printListOfNodesChild(indent + 1, "argumentos", "List<Expression>", funcionExpresion.getArgumentos());

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
        printToString(indent + 1, "vgen-attribute-phase-0", "declaracionfuncion", "Declaracionfuncion", funcionExpresion.getDeclaracionfuncion());
        printToString(indent + 1, "vgen-attribute-phase-1", "tipoexpresion", "Tipo", funcionExpresion.getTipoexpresion());
        printToString(indent + 1, "vgen-attribute-phase-1", "lvalue", "boolean", funcionExpresion.isLvalue());
		printUnknownFields(indent + 1, funcionExpresion, "nombre", "argumentos", "tipoexpresion", "lvalue", "declaracionfuncion");
		return null;
	}

	@Override
	public Object visit(IntTipo intTipo, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)
        printNonNodeChild(indent + 1, "name", "String", intTipo.getName());

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
		printUnknownFields(indent + 1, intTipo, "name");
		return null;
	}

	@Override
	public Object visit(FloatTipo floatTipo, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)
        printNonNodeChild(indent + 1, "name", "String", floatTipo.getName());

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
		printUnknownFields(indent + 1, floatTipo, "name");
		return null;
	}

	@Override
	public Object visit(CharTipo charTipo, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)
        printNonNodeChild(indent + 1, "name", "String", charTipo.getName());

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
		printUnknownFields(indent + 1, charTipo, "name");
		return null;
	}

	@Override
	public Object visit(ArrayTipo arrayTipo, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)
        printNonNodeChild(indent + 1, "tamArray", "int", arrayTipo.getTamArray());
        printNodeChild(indent + 1, "tipo", "Tipo", arrayTipo.getTipo());

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
		printUnknownFields(indent + 1, arrayTipo, "tamArray", "tipo");
		return null;
	}

	@Override
	public Object visit(StringTipo stringTipo, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)
        printNonNodeChild(indent + 1, "name", "String", stringTipo.getName());

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
        printToString(indent + 1, "vgen-attribute-phase-0", "definicions", "List<Definicion>", stringTipo.getDefinicions());
		printUnknownFields(indent + 1, stringTipo, "name", "definicions");
		return null;
	}

	@Override
	public Object visit(VoidTipo voidTipo, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
		printUnknownFields(indent + 1, voidTipo, "");
		return null;
	}



    //$ -------------------------------------------------------------------------------------
    // Métodos invocados desde los métodos visit para imprimir los hijos

    /**
     * Método para imprimir aquel Child que sea un nodo del AST. Después de imprimirlo recorre sus hijos.
     */
    private void printNodeChild(int indent, String name, String type, AST node) {

        if (node == null) {
            writeDivWithTabs(indent,
                    span(CHILD_NAME_CLASS, name) + " = " + valueSpan(null) + "  " + span(TYPE_CLASS, type));
            return;
        }

        String text = name + " " + node.getClass().getSimpleName() + " ="; // Usado sólo para calcular tamaño sin tag 'span'
        String sourceText = getAlignedSourceText(indent, text.length(), node);

        writeDivWithTabs(indent, span(CHILD_NAME_CLASS, name) + " " + span(TYPE_CLASS, node.getClass().getSimpleName())
                + " =" + sourceText);

        node.accept(this, indent);
    }

    /**
     * Método para imprimir aquel Child que sea una lista de nodos del AST (pe, 'sentence*').
     * Imprime y recorre cada nodo de la lista.
     */
    private void printListOfNodesChild(int indent, String name, String type, List<? extends AST> nodes) {
        writeDivWithTabs(indent, span(CHILD_NAME_CLASS, name) + escapedSpan(TYPE_CLASS, " " + type) + " =");

        if (nodes != null)
            for (int i = 0; i < nodes.size(); i++) {
                AST node = nodes.get(i);

                String text = i + ": " + node.getClass().getSimpleName() + " ="; // Usado sólo para calcular tamaño sin tag 'span'
                String sourceText = getAlignedSourceText(indent + 1, text.length(), node);

                writeDivWithTabs(indent + 1, span(CHILD_NAME_CLASS, i + "") + ": "
                        + span(TYPE_CLASS, node.getClass().getSimpleName()) + " =" + sourceText);

                node.accept(this, indent + 1);
            }
        else
            writer.print(" " + valueSpan(null));
    }

    /**
     * Método para imprimir todo Child que no sea visitable, es decir, todo hijo que no sea un
     * nodo o lista de nodos.
     * Se limita a imprimir el 'toString()' de dicho hijo.
     */
    private void printNonNodeChild(int indent, String name, String type, Object value) {
        printToString(indent, CHILD_NAME_CLASS, name, type, value);
    }

    /**
     * Dado un nodo, busca e imprime todo aquel miembro que no se haya declarado en la Gramática Abstracta.
     * La razón por la que no se hace todo con Introspección es porque se quiere respetar el orden de
     * los hijos declarados en la Gramática Abstracta y, por ello, éstos se imprimen antes en el
     * 'visit'.
     * El parámetro knownFields son los miembros ya imprimidos del nodo y que no deben repetirse.
     */
    private void printUnknownFields(int indent, AST node, String... knownFields) {

        List<String> knownNames = new ArrayList<>(Arrays.asList(knownFields));
        knownNames.addAll(List.of("start", "end"));

        // Extraer todos las variables de instancia de la clase (propios o derivados)
        List<java.lang.reflect.Field> allFields = new ArrayList<>();
        Class<?> currentClass = node.getClass();
        while (currentClass != null && currentClass != Object.class) {
            java.util.Collections.addAll(allFields, currentClass.getDeclaredFields());
            currentClass = currentClass.getSuperclass();
        }

        // Imprimir el 'toString' de aquellas que no se hayan impreso ya y no sean static
        for (java.lang.reflect.Field field : allFields) {
            if ((!knownNames.contains(field.getName()))
                    && (!java.lang.reflect.Modifier.isStatic(field.getModifiers()))) {
                field.setAccessible(true);
                Object value;
                try {
                    value = field.get(node);
                } catch (IllegalArgumentException | IllegalAccessException e) {
                    value = "!!Error accesing value by introspection";
                }
                printToString(indent, "unknown-field", field.getName(), field.getType().getSimpleName(), value);
            }
        }
    }

    //$ -------------------------------------------------------------------------------------
    // Métodos auxiliares usados por los métodos anteriores

    // Imprime el 'toString()' del value que se le pase
    private void printToString(int indent, String cssClass, String name, String type, Object value) {

        if (type.equals("String"))
            type = "string"; // Queda mejor en minúsculas

        String typeText = escapedSpan(TYPE_CLASS, "  " + type);

        // No imprimir el tipo del miembro si es un AST y su valor es del mismo tipo (es decir, el
        // valor no es un tipo derivado y, por tanto, son iguales). Dicho tipo ya aparecerá en el
        // toString() del nodo.
        if (value instanceof AST && type.equals(value.getClass().getSimpleName()))
            typeText = "";

        writeDivWithTabs(indent, span(cssClass, name) + " = " + valueSpan(value) + typeText);
    }

    private void writeDiv(String text) {
        writer.println("<div>" + text + "</div>");
    }

    private void writeDivWithTabs(int indent, String text) {
        writeDiv(getTabuladores(indent) + text);
    }

    private String getTabuladores(int count) {
        var cadena = new StringBuilder();
        for (int i = 0; i < count; i++)
            cadena.append((i % 2 == 0 ? '|' : '.') + tabulator);
        return span(TABS_CLASS, cadena.toString());
    }

    private static String span(String cssClass, String text) {
        return "<span class=\"" + cssClass + "\">" + text + "</span>";
    }

    private static String escapedSpan(String cssClass, String text) {
        return span(cssClass, text.replace("<", "&lt;").replace(">", "&gt;"));
    }

    private static String valueSpan(Object value) {
        final int MAX_LENGTH = 46;

        if (value == null)
            return span(NULL_CLASS, "null");

        String text = value.toString();
        if (text.length() > MAX_LENGTH)
            text = text.substring(0, MAX_LENGTH) + "...";
        if (value instanceof String)
            text = '"' + text + '"';
        return escapedSpan(VALUE_CLASS, text);
    }

    // -----------------------------------------------------------------
    // Métodos para mostrar las Posiciones

    private String getAlignedSourceText(int indent, int textLength, AST node) {

        final int width = 75;

        int neededSpaces = width - (indent * tabSize) - textLength;
        var spaces = new StringBuilder();
        for (int i = 0; i < neededSpaces / 2; i++)
            spaces.append(" .");
        if (neededSpaces % 2 == 1)
            spaces.append(" ");

        return span(DOTS_CLASS, spaces.toString()) + getSourceText(node);
    }

    private String getSourceText(AST node) {

        String text = "[" + node.start() + " " + node.end() + "]";

        final int PADDING_LENGTH = 14;
        String paddedText = (text.length() < PADDING_LENGTH)
                ? text + "&nbsp;".repeat(PADDING_LENGTH - text.length())
                : text;

        text = span(POS_CLASS, paddedText);
        text = text.replace("null", "<span class=\"" + NULL_CLASS + "\">null</span>");
        String sourceText = findSourceText(node);
        if (sourceText != null)
            text = text + sourceText;
        return text;
    }


    private boolean isValidPosition(Position position) {
        return position != null && position.getLine() > 0 && position.getColumn() > 0;
    }

    private String findSourceText(AST node) {
        if (sourceLines.isEmpty())
            return null;

        Position start = node.start();
        Position end = node.end();

        var validPositions = isValidPosition(start) && isValidPosition(end) && start.lessThan(end);
        if (!validPositions)
            return null;

        // Single line source text
        if (start.getLine() == end.getLine()) {
            String line = sourceLines.get(start.getLine() - 1);

            var firstCharPosition = start.getColumn() - 1;
            var nextCharPosition = end.getColumn() - 1;

            var beforeText = line.substring(0, firstCharPosition);
            var text = line.substring(firstCharPosition, nextCharPosition);
            var afterText = line.substring(nextCharPosition);

            return span(SOURCE_TEXT_CLASS,
                    escapedSpan(NON_NODE_SOURCE_TEXT_CLASS, beforeText.stripLeading())
                            + escapedSpan(NODE_SOURCE_TEXT_CLASS, text)
                            + escapedSpan(NON_NODE_SOURCE_TEXT_CLASS, afterText.stripTrailing()));
        }

        // Multiline source text
        String firstLine = sourceLines.get(start.getLine() - 1);
        var firstCharPosition = start.getColumn() - 1;
        var beforeText = firstLine.substring(0, firstCharPosition);
        var firstLineText = firstLine.substring(firstCharPosition);

        String lastLine = sourceLines.get(end.getLine() - 1);
        var nextCharPosition = end.getColumn() - 1;
        var lastLineText = lastLine.substring(0, nextCharPosition);
        var afterText = lastLine.substring(nextCharPosition);

        return span(SOURCE_TEXT_CLASS,
                escapedSpan(NON_NODE_SOURCE_TEXT_CLASS, beforeText.stripLeading())
                        + escapedSpan(NODE_SOURCE_TEXT_CLASS, firstLineText.stripTrailing())
                        + span(OMITTED_SOURCE_TEXT_CLASS, " &bull;&bull;&bull; ")
                        + escapedSpan(NODE_SOURCE_TEXT_CLASS, lastLineText.stripLeading())
                        + escapedSpan(NON_NODE_SOURCE_TEXT_CLASS, afterText.stripTrailing()));
    }

    private static List<String> loadLines(String sourceFile) {
        if (sourceFile == null)
            return java.util.Collections.emptyList();

        var lines = new ArrayList<String>();
        try (BufferedReader br = new BufferedReader(new FileReader(sourceFile))) {
            String line;
            while ((line = br.readLine()) != null)
                lines.add(line);

        } catch (FileNotFoundException e) {
            System.out.println("Warning. No se pudo encontrar el fichero fuente '" + sourceFile
                    + "'. No se mostrará información de posición.");
        } catch (IOException e) {
            System.out.println("Warning. Error al leer del fichero fuente '" + sourceFile
                    + "'. No se mostrará información de posición.");
        }
        return lines;
    }

    //$ -------------------------------------------------------------------------------------
    // Texto literal

    private static final String HEADER = """
            <html>
            <!DOCTYPE html>
            <html lang="en">
            <head>
                <meta charset="UTF-8">
                <meta http-equiv="X-UA-Compatible" content="IE=edge">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>AstPrinter</title>
                <style type="text/css">
                    .vgen-body {
                        font-family: monospace;
                        color: #404040;
                    }
                    .vgen-div {
                        white-space: pre;
                    }
                    .vgen-tabs {
                        color: #96c0d9;
                    }
                    .vgen-child-name {
                        color: #2A5873;
                    }
                    .vgen-attribute-phase-0 {
                        color: #04ab04ff;
                    }
                    .vgen-attribute-phase-1 {
                        color: #ab0479ff;
                    }
                    .vgen-attribute-phase-2 {
                        color: #abab04ff;
                    }
                    .vgen-unknown-field {
                        color: grey;
                    }
                    .vgen-type {
                        color: #A7CADF;
                    }
                    .vgen-value {
                        color: #D6630E;
                    }
                    .vgen-dots {
                        color: #7BB0CF;
                    }
                    .vgen-pos {
                        color: #7BB0CF;
                    }
                    .vgen-nonNodeSourceText {
                    }
                    .vgen-nodeSourceText {
                        background-color: #d7f9d6;
                        border-radius: 4px;
                        padding-left: 3px;
                        padding-right: 3px;
                    }
                    .vgen-omittedSourceText {
                        color: #a6f2a4ff;
                    }
                    .vgen-null {
                        color: white;
                        background-color: #c7655b;
                        border-radius: 7px;
                        padding-left: 4px;
                        padding-right: 4px;
                    }
                </style>
            </head>
            <body>
            """;

    private static final String FOOTER = """

            </body>
            </html>
            """;

    //$ -----------------------------------------------------------------
    // Variables de instancia

    private List<String> sourceLines;
    private static String ls = System.getProperty("line.separator");
    private PrintWriter writer;

    private String tabulator;
    private int tabSize;


}
