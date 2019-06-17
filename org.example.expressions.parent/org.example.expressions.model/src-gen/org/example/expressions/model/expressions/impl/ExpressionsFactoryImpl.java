/**
 */
package org.example.expressions.model.expressions.impl;

import java.util.Map;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.example.expressions.model.expressions.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpressionsFactoryImpl extends EFactoryImpl implements ExpressionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExpressionsFactory init() {
		try {
			ExpressionsFactory theExpressionsFactory = (ExpressionsFactory) EPackage.Registry.INSTANCE
					.getEFactory(ExpressionsPackage.eNS_URI);
			if (theExpressionsFactory != null) {
				return theExpressionsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExpressionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ExpressionsPackage.EXPRESSIONS_MODEL:
			return createExpressionsModel();
		case ExpressionsPackage.STATEMENTS:
			return createStatements();
		case ExpressionsPackage.ABSTRACT_ELEMENT:
			return createAbstractElement();
		case ExpressionsPackage.LOOP:
			return createLoop();
		case ExpressionsPackage.CONDITION:
			return createCondition();
		case ExpressionsPackage.BLOCK:
			return createBlock();
		case ExpressionsPackage.FUN_DEFINITION:
			return createFunDefinition();
		case ExpressionsPackage.INLINE_FUNCTION:
			return createInlineFunction();
		case ExpressionsPackage.COMPLEX_FUNCTION:
			return createComplexFunction();
		case ExpressionsPackage.VAR_OR_PARAM:
			return createVarOrParam();
		case ExpressionsPackage.PARAMETER:
			return createParameter();
		case ExpressionsPackage.VARIABLE:
			return createVariable();
		case ExpressionsPackage.EVAL_EXPRESSION:
			return createEvalExpression();
		case ExpressionsPackage.EXPRESSION:
			return createExpression();
		case ExpressionsPackage.FUN_PARAM:
			return createFunParam();
		case ExpressionsPackage.FUN_CALL:
			return createFunCall();
		case ExpressionsPackage.OR:
			return createOr();
		case ExpressionsPackage.AND:
			return createAnd();
		case ExpressionsPackage.EQUALITY:
			return createEquality();
		case ExpressionsPackage.COMPARISON:
			return createComparison();
		case ExpressionsPackage.PLUS:
			return createPlus();
		case ExpressionsPackage.MINUS:
			return createMinus();
		case ExpressionsPackage.MUL_OR_DIV:
			return createMulOrDiv();
		case ExpressionsPackage.NOT:
			return createNot();
		case ExpressionsPackage.INT_CONSTANT:
			return createIntConstant();
		case ExpressionsPackage.STRING_CONSTANT:
			return createStringConstant();
		case ExpressionsPackage.BOOL_CONSTANT:
			return createBoolConstant();
		case ExpressionsPackage.VAR_OR_PARAM_REF:
			return createVarOrParamRef();
		case ExpressionsPackage.FUN_PARAM_EXP:
			return createFunParamExp();
		case ExpressionsPackage.FUN_PARAM_CAPTURE:
			return createFunParamCapture();
		case ExpressionsPackage.CONTEXT:
			return createContext();
		case ExpressionsPackage.STRING_TO_EOBJECT_BINDING_MAP:
			return (EObject) createStringToEObjectBindingMap();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionsModel createExpressionsModel() {
		ExpressionsModelImpl expressionsModel = new ExpressionsModelImpl();
		return expressionsModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statements createStatements() {
		StatementsImpl statements = new StatementsImpl();
		return statements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractElement createAbstractElement() {
		AbstractElementImpl abstractElement = new AbstractElementImpl();
		return abstractElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Loop createLoop() {
		LoopImpl loop = new LoopImpl();
		return loop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block createBlock() {
		BlockImpl block = new BlockImpl();
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunDefinition createFunDefinition() {
		FunDefinitionImpl funDefinition = new FunDefinitionImpl();
		return funDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InlineFunction createInlineFunction() {
		InlineFunctionImpl inlineFunction = new InlineFunctionImpl();
		return inlineFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexFunction createComplexFunction() {
		ComplexFunctionImpl complexFunction = new ComplexFunctionImpl();
		return complexFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarOrParam createVarOrParam() {
		VarOrParamImpl varOrParam = new VarOrParamImpl();
		return varOrParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvalExpression createEvalExpression() {
		EvalExpressionImpl evalExpression = new EvalExpressionImpl();
		return evalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunParam createFunParam() {
		FunParamImpl funParam = new FunParamImpl();
		return funParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunCall createFunCall() {
		FunCallImpl funCall = new FunCallImpl();
		return funCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Or createOr() {
		OrImpl or = new OrImpl();
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public And createAnd() {
		AndImpl and = new AndImpl();
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equality createEquality() {
		EqualityImpl equality = new EqualityImpl();
		return equality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comparison createComparison() {
		ComparisonImpl comparison = new ComparisonImpl();
		return comparison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plus createPlus() {
		PlusImpl plus = new PlusImpl();
		return plus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Minus createMinus() {
		MinusImpl minus = new MinusImpl();
		return minus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MulOrDiv createMulOrDiv() {
		MulOrDivImpl mulOrDiv = new MulOrDivImpl();
		return mulOrDiv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Not createNot() {
		NotImpl not = new NotImpl();
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntConstant createIntConstant() {
		IntConstantImpl intConstant = new IntConstantImpl();
		return intConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringConstant createStringConstant() {
		StringConstantImpl stringConstant = new StringConstantImpl();
		return stringConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolConstant createBoolConstant() {
		BoolConstantImpl boolConstant = new BoolConstantImpl();
		return boolConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarOrParamRef createVarOrParamRef() {
		VarOrParamRefImpl varOrParamRef = new VarOrParamRefImpl();
		return varOrParamRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunParamExp createFunParamExp() {
		FunParamExpImpl funParamExp = new FunParamExpImpl();
		return funParamExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunParamCapture createFunParamCapture() {
		FunParamCaptureImpl funParamCapture = new FunParamCaptureImpl();
		return funParamCapture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context createContext() {
		ContextImpl context = new ContextImpl();
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, EObject> createStringToEObjectBindingMap() {
		StringToEObjectBindingMapImpl stringToEObjectBindingMap = new StringToEObjectBindingMapImpl();
		return stringToEObjectBindingMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionsPackage getExpressionsPackage() {
		return (ExpressionsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExpressionsPackage getPackage() {
		return ExpressionsPackage.eINSTANCE;
	}

} //ExpressionsFactoryImpl
