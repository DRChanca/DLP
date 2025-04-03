// Generated with VGen 2.0.0

/**
* Este interfaz es el resultado de la aplicación del patrón Visitor a los nodos del AST.
*/

package visitor;

import ast.*;
import ast.declaraciones.*;
import ast.sentencia.*;
import ast.expression.*;
import ast.tipo.*;




public interface Visitor {
	public Object visit(Program program, Object param);

	public Object visit(Declaracionstructs declaracionstructs, Object param);

	public Object visit(Declaracionglobales declaracionglobales, Object param);

	public Object visit(Declaracionfuncion declaracionfuncion, Object param);

	public Object visit(Definicion definicion, Object param);

	public Object visit(PrintSentencia printSentencia, Object param);

	public Object visit(ReadSentencia readSentencia, Object param);

	public Object visit(PrintspSentencia printspSentencia, Object param);

	public Object visit(PrintlnSentencia printlnSentencia, Object param);

	public Object visit(FuncionSentencia funcionSentencia, Object param);

	public Object visit(AsignacionSentencia asignacionSentencia, Object param);

	public Object visit(ReturnSentencia returnSentencia, Object param);

	public Object visit(IfSentencia ifSentencia, Object param);

	public Object visit(WhileSentencia whileSentencia, Object param);

	public Object visit(IntExpresion intExpresion, Object param);

	public Object visit(RealExpresion realExpresion, Object param);

	public Object visit(IdentificadorExpresion identificadorExpresion, Object param);

	public Object visit(CharExpresion charExpresion, Object param);

	public Object visit(AccessoArrayExpresion accessoArrayExpresion, Object param);

	public Object visit(ParentesisExpresion parentesisExpresion, Object param);

	public Object visit(CastExpresion castExpresion, Object param);

	public Object visit(NegacionExpresion negacionExpresion, Object param);

	public Object visit(ArithmeticExpresion arithmeticExpresion, Object param);

	public Object visit(LogicExpression logicExpression, Object param);

	public Object visit(BoolExpression boolExpression, Object param);

	public Object visit(AcederCap acederCap, Object param);

	public Object visit(FuncionExpresion funcionExpresion, Object param);

	public Object visit(IntTipo intTipo, Object param);

	public Object visit(FloatTipo floatTipo, Object param);

	public Object visit(CharTipo charTipo, Object param);

	public Object visit(ArrayTipo arrayTipo, Object param);

	public Object visit(StringTipo stringTipo, Object param);

	public Object visit(VoidTipo voidTipo, Object param);


}
