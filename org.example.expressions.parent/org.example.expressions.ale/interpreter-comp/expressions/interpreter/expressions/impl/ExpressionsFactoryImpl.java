package expressions.interpreter.expressions.impl;

import expressions.interpreter.expressions.AbstractElement;
import expressions.interpreter.expressions.And;
import expressions.interpreter.expressions.Block;
import expressions.interpreter.expressions.BoolConstant;
import expressions.interpreter.expressions.BoolValue;
import expressions.interpreter.expressions.Comparison;
import expressions.interpreter.expressions.ComplexFunction;
import expressions.interpreter.expressions.Condition;
import expressions.interpreter.expressions.Context;
import expressions.interpreter.expressions.Equality;
import expressions.interpreter.expressions.EvalExpression;
import expressions.interpreter.expressions.Expression;
import expressions.interpreter.expressions.ExpressionsFactory;
import expressions.interpreter.expressions.ExpressionsModel;
import expressions.interpreter.expressions.ExpressionsPackage;
import expressions.interpreter.expressions.FunCall;
import expressions.interpreter.expressions.FunDefinition;
import expressions.interpreter.expressions.FunParam;
import expressions.interpreter.expressions.FunParamCapture;
import expressions.interpreter.expressions.FunParamExp;
import expressions.interpreter.expressions.InlineFunction;
import expressions.interpreter.expressions.IntConstant;
import expressions.interpreter.expressions.IntValue;
import expressions.interpreter.expressions.Loop;
import expressions.interpreter.expressions.Minus;
import expressions.interpreter.expressions.MulOrDiv;
import expressions.interpreter.expressions.Not;
import expressions.interpreter.expressions.Or;
import expressions.interpreter.expressions.Parameter;
import expressions.interpreter.expressions.Plus;
import expressions.interpreter.expressions.Statements;
import expressions.interpreter.expressions.StringConstant;
import expressions.interpreter.expressions.StringValue;
import expressions.interpreter.expressions.Value;
import expressions.interpreter.expressions.VarOrParam;
import expressions.interpreter.expressions.VarOrParamRef;
import expressions.interpreter.expressions.Variable;
import java.lang.Deprecated;
import java.lang.IllegalArgumentException;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

public class ExpressionsFactoryImpl extends EFactoryImpl implements ExpressionsFactory {
	public ExpressionsFactoryImpl() {
		super();
	}

	public static ExpressionsFactory init() {
		try {
			ExpressionsFactory theExpressionsFactory = (ExpressionsFactory) EPackage.Registry.INSTANCE.getEFactory(ExpressionsPackage.eNS_URI);
			if (theExpressionsFactory != null) {
				return theExpressionsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExpressionsFactoryImpl();
	}

	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ExpressionsPackage.EXPRESSIONS_MODEL :
				return createExpressionsModel();
			case ExpressionsPackage.STATEMENTS :
				return createStatements();
			case ExpressionsPackage.ABSTRACT_ELEMENT :
				return createAbstractElement();
			case ExpressionsPackage.LOOP :
				return createLoop();
			case ExpressionsPackage.CONDITION :
				return createCondition();
			case ExpressionsPackage.BLOCK :
				return createBlock();
			case ExpressionsPackage.FUN_DEFINITION :
				return createFunDefinition();
			case ExpressionsPackage.INLINE_FUNCTION :
				return createInlineFunction();
			case ExpressionsPackage.COMPLEX_FUNCTION :
				return createComplexFunction();
			case ExpressionsPackage.VAR_OR_PARAM :
				return createVarOrParam();
			case ExpressionsPackage.PARAMETER :
				return createParameter();
			case ExpressionsPackage.VARIABLE :
				return createVariable();
			case ExpressionsPackage.EVAL_EXPRESSION :
				return createEvalExpression();
			case ExpressionsPackage.EXPRESSION :
				return createExpression();
			case ExpressionsPackage.FUN_PARAM :
				return createFunParam();
			case ExpressionsPackage.FUN_CALL :
				return createFunCall();
			case ExpressionsPackage.OR :
				return createOr();
			case ExpressionsPackage.AND :
				return createAnd();
			case ExpressionsPackage.EQUALITY :
				return createEquality();
			case ExpressionsPackage.COMPARISON :
				return createComparison();
			case ExpressionsPackage.PLUS :
				return createPlus();
			case ExpressionsPackage.MINUS :
				return createMinus();
			case ExpressionsPackage.MUL_OR_DIV :
				return createMulOrDiv();
			case ExpressionsPackage.NOT :
				return createNot();
			case ExpressionsPackage.INT_CONSTANT :
				return createIntConstant();
			case ExpressionsPackage.STRING_CONSTANT :
				return createStringConstant();
			case ExpressionsPackage.BOOL_CONSTANT :
				return createBoolConstant();
			case ExpressionsPackage.VAR_OR_PARAM_REF :
				return createVarOrParamRef();
			case ExpressionsPackage.FUN_PARAM_EXP :
				return createFunParamExp();
			case ExpressionsPackage.FUN_PARAM_CAPTURE :
				return createFunParamCapture();
			case ExpressionsPackage.CONTEXT :
				return createContext();
			case ExpressionsPackage.STRING_TO_VALUE_BINDING_MAP :
				return (EObject) createStringToValueBindingMap();
			case ExpressionsPackage.INT_VALUE :
				return createIntValue();
			case ExpressionsPackage.BOOL_VALUE :
				return createBoolValue();
			case ExpressionsPackage.STRING_VALUE :
				return createStringValue();
			default :
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	public ExpressionsModel createExpressionsModel() {
		ExpressionsModelImpl expressionsModel = new ExpressionsModelImpl();
		return expressionsModel;
	}

	public Statements createStatements() {
		StatementsImpl statements = new StatementsImpl();
		return statements;
	}

	public AbstractElement createAbstractElement() {
		AbstractElementImpl abstractElement = new AbstractElementImpl();
		return abstractElement;
	}

	public Loop createLoop() {
		LoopImpl loop = new LoopImpl();
		return loop;
	}

	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	public Block createBlock() {
		BlockImpl block = new BlockImpl();
		return block;
	}

	public FunDefinition createFunDefinition() {
		FunDefinitionImpl funDefinition = new FunDefinitionImpl();
		return funDefinition;
	}

	public InlineFunction createInlineFunction() {
		InlineFunctionImpl inlineFunction = new InlineFunctionImpl();
		return inlineFunction;
	}

	public ComplexFunction createComplexFunction() {
		ComplexFunctionImpl complexFunction = new ComplexFunctionImpl();
		return complexFunction;
	}

	public VarOrParam createVarOrParam() {
		VarOrParamImpl varOrParam = new VarOrParamImpl();
		return varOrParam;
	}

	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	public EvalExpression createEvalExpression() {
		EvalExpressionImpl evalExpression = new EvalExpressionImpl();
		return evalExpression;
	}

	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	public FunParam createFunParam() {
		FunParamImpl funParam = new FunParamImpl();
		return funParam;
	}

	public FunCall createFunCall() {
		FunCallImpl funCall = new FunCallImpl();
		return funCall;
	}

	public Or createOr() {
		OrImpl or = new OrImpl();
		return or;
	}

	public And createAnd() {
		AndImpl and = new AndImpl();
		return and;
	}

	public Equality createEquality() {
		EqualityImpl equality = new EqualityImpl();
		return equality;
	}

	public Comparison createComparison() {
		ComparisonImpl comparison = new ComparisonImpl();
		return comparison;
	}

	public Plus createPlus() {
		PlusImpl plus = new PlusImpl();
		return plus;
	}

	public Minus createMinus() {
		MinusImpl minus = new MinusImpl();
		return minus;
	}

	public MulOrDiv createMulOrDiv() {
		MulOrDivImpl mulOrDiv = new MulOrDivImpl();
		return mulOrDiv;
	}

	public Not createNot() {
		NotImpl not = new NotImpl();
		return not;
	}

	public IntConstant createIntConstant() {
		IntConstantImpl intConstant = new IntConstantImpl();
		return intConstant;
	}

	public StringConstant createStringConstant() {
		StringConstantImpl stringConstant = new StringConstantImpl();
		return stringConstant;
	}

	public BoolConstant createBoolConstant() {
		BoolConstantImpl boolConstant = new BoolConstantImpl();
		return boolConstant;
	}

	public VarOrParamRef createVarOrParamRef() {
		VarOrParamRefImpl varOrParamRef = new VarOrParamRefImpl();
		return varOrParamRef;
	}

	public FunParamExp createFunParamExp() {
		FunParamExpImpl funParamExp = new FunParamExpImpl();
		return funParamExp;
	}

	public FunParamCapture createFunParamCapture() {
		FunParamCaptureImpl funParamCapture = new FunParamCaptureImpl();
		return funParamCapture;
	}

	public Context createContext() {
		ContextImpl context = new ContextImpl();
		return context;
	}

	public Map.Entry<String, Value> createStringToValueBindingMap() {
		StringToValueBindingMapImpl stringToValueBindingMap = new StringToValueBindingMapImpl();
		return stringToValueBindingMap;
	}

	public IntValue createIntValue() {
		IntValueImpl intValue = new IntValueImpl();
		return intValue;
	}

	public BoolValue createBoolValue() {
		BoolValueImpl boolValue = new BoolValueImpl();
		return boolValue;
	}

	public StringValue createStringValue() {
		StringValueImpl stringValue = new StringValueImpl();
		return stringValue;
	}

	public ExpressionsPackage getExpressionsPackage() {
		return (ExpressionsPackage) getEPackage();
	}

	@Deprecated
	public static ExpressionsPackage getPackage() {
		return ExpressionsPackage.eINSTANCE;
	}
}
