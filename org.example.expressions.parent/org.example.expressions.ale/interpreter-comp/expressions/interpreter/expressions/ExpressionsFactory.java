package expressions.interpreter.expressions;

import expressions.interpreter.expressions.impl.ExpressionsFactoryImpl;
import org.eclipse.emf.ecore.EFactory;

public interface ExpressionsFactory extends EFactory {
	ExpressionsFactory eINSTANCE = ExpressionsFactoryImpl.init();

	ExpressionsModel createExpressionsModel();

	Statements createStatements();

	AbstractElement createAbstractElement();

	Loop createLoop();

	Condition createCondition();

	Block createBlock();

	FunDefinition createFunDefinition();

	InlineFunction createInlineFunction();

	ComplexFunction createComplexFunction();

	VarOrParam createVarOrParam();

	Parameter createParameter();

	Variable createVariable();

	EvalExpression createEvalExpression();

	Expression createExpression();

	FunParam createFunParam();

	FunCall createFunCall();

	Or createOr();

	And createAnd();

	Equality createEquality();

	Comparison createComparison();

	Plus createPlus();

	Minus createMinus();

	MulOrDiv createMulOrDiv();

	Not createNot();

	IntConstant createIntConstant();

	StringConstant createStringConstant();

	BoolConstant createBoolConstant();

	VarOrParamRef createVarOrParamRef();

	FunParamExp createFunParamExp();

	FunParamCapture createFunParamCapture();

	Context createContext();

	IntValue createIntValue();

	BoolValue createBoolValue();

	StringValue createStringValue();

	ExpressionsPackage getExpressionsPackage();
}
