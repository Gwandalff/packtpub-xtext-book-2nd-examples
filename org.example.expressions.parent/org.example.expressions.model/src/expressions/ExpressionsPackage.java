/**
 */
package expressions;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see expressions.ExpressionsFactory
 * @model kind="package"
 * @generated
 */
public interface ExpressionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "expressions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/expressions/Expressions";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "expressions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExpressionsPackage eINSTANCE = expressions.impl.ExpressionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link expressions.impl.ExpressionsModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expressions.impl.ExpressionsModelImpl
	 * @see expressions.impl.ExpressionsPackageImpl#getExpressionsModel()
	 * @generated
	 */
	int EXPRESSIONS_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSIONS_MODEL__STATEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSIONS_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSIONS_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link expressions.impl.StatementsImpl <em>Statements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expressions.impl.StatementsImpl
	 * @see expressions.impl.ExpressionsPackageImpl#getStatements()
	 * @generated
	 */
	int STATEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENTS__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Statements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Statements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link expressions.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expressions.impl.AbstractElementImpl
	 * @see expressions.impl.ExpressionsPackageImpl#getAbstractElement()
	 * @generated
	 */
	int ABSTRACT_ELEMENT = 2;

	/**
	 * The number of structural features of the '<em>Abstract Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abstract Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link expressions.impl.LoopImpl <em>Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expressions.impl.LoopImpl
	 * @see expressions.impl.ExpressionsPackageImpl#getLoop()
	 * @generated
	 */
	int LOOP = 3;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__EXPRESSION = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__BODY = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OPERATION_COUNT = ABSTRACT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link expressions.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expressions.impl.ConditionImpl
	 * @see expressions.impl.ExpressionsPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 4;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__EXPRESSION = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ifz</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__IFZ = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Elsez</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__ELSEZ = ABSTRACT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = ABSTRACT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link expressions.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expressions.impl.BlockImpl
	 * @see expressions.impl.ExpressionsPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 5;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__STATEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link expressions.impl.FunDefinitionImpl <em>Fun Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expressions.impl.FunDefinitionImpl
	 * @see expressions.impl.ExpressionsPackageImpl#getFunDefinition()
	 * @generated
	 */
	int FUN_DEFINITION = 6;

	/**
	 * The feature id for the '<em><b>Var Names</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_DEFINITION__VAR_NAMES = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_DEFINITION__NAME = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fun Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_DEFINITION_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Fun Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_DEFINITION_OPERATION_COUNT = ABSTRACT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link expressions.impl.InlineFunctionImpl <em>Inline Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expressions.impl.InlineFunctionImpl
	 * @see expressions.impl.ExpressionsPackageImpl#getInlineFunction()
	 * @generated
	 */
	int INLINE_FUNCTION = 7;

	/**
	 * The feature id for the '<em><b>Var Names</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_FUNCTION__VAR_NAMES = FUN_DEFINITION__VAR_NAMES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_FUNCTION__NAME = FUN_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_FUNCTION__EXPRESSION = FUN_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Inline Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_FUNCTION_FEATURE_COUNT = FUN_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Inline Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_FUNCTION_OPERATION_COUNT = FUN_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link expressions.impl.ComplexFunctionImpl <em>Complex Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expressions.impl.ComplexFunctionImpl
	 * @see expressions.impl.ExpressionsPackageImpl#getComplexFunction()
	 * @generated
	 */
	int COMPLEX_FUNCTION = 8;

	/**
	 * The feature id for the '<em><b>Var Names</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_FUNCTION__VAR_NAMES = FUN_DEFINITION__VAR_NAMES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_FUNCTION__NAME = FUN_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_FUNCTION__BODY = FUN_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Complex Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_FUNCTION_FEATURE_COUNT = FUN_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Complex Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_FUNCTION_OPERATION_COUNT = FUN_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link expressions.impl.VarOrParamImpl <em>Var Or Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expressions.impl.VarOrParamImpl
	 * @see expressions.impl.ExpressionsPackageImpl#getVarOrParam()
	 * @generated
	 */
	int VAR_OR_PARAM = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_OR_PARAM__NAME = 0;

	/**
	 * The number of structural features of the '<em>Var Or Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_OR_PARAM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Var Or Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_OR_PARAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link expressions.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expressions.impl.ParameterImpl
	 * @see expressions.impl.ExpressionsPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = VAR_OR_PARAM__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = VAR_OR_PARAM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = VAR_OR_PARAM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = VAR_OR_PARAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link expressions.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expressions.impl.VariableImpl
	 * @see expressions.impl.ExpressionsPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__EXPRESSION = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = ABSTRACT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link expressions.impl.EvalExpressionImpl <em>Eval Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expressions.impl.EvalExpressionImpl
	 * @see expressions.impl.ExpressionsPackageImpl#getEvalExpression()
	 * @generated
	 */
	int EVAL_EXPRESSION = 12;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVAL_EXPRESSION__EXPRESSION = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Eval Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVAL_EXPRESSION_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Eval Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVAL_EXPRESSION_OPERATION_COUNT = ABSTRACT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link expressions.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expressions.impl.ExpressionImpl
	 * @see expressions.impl.ExpressionsPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 13;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link expressions.impl.FunParamImpl <em>Fun Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expressions.impl.FunParamImpl
	 * @see expressions.impl.ExpressionsPackageImpl#getFunParam()
	 * @generated
	 */
	int FUN_PARAM = 14;

	/**
	 * The number of structural features of the '<em>Fun Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_PARAM_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Fun Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_PARAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link expressions.impl.FunCallImpl <em>Fun Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expressions.impl.FunCallImpl
	 * @see expressions.impl.ExpressionsPackageImpl#getFunCall()
	 * @generated
	 */
	int FUN_CALL = 15;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_CALL__FUNCTION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_CALL__PARAMS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fun Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_CALL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Fun Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_CALL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link expressions.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expressions.impl.OrImpl
	 * @see expressions.impl.ExpressionsPackageImpl#getOr()
	 * @generated
	 */
	int OR = 16;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link expressions.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expressions.impl.AndImpl
	 * @see expressions.impl.ExpressionsPackageImpl#getAnd()
	 * @generated
	 */
	int AND = 17;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link expressions.impl.EqualityImpl <em>Equality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expressions.impl.EqualityImpl
	 * @see expressions.impl.ExpressionsPackageImpl#getEquality()
	 * @generated
	 */
	int EQUALITY = 18;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY__OP = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Equality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Equality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link expressions.impl.ComparisonImpl <em>Comparison</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expressions.impl.ComparisonImpl
	 * @see expressions.impl.ExpressionsPackageImpl#getComparison()
	 * @generated
	 */
	int COMPARISON = 19;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__OP = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link expressions.impl.PlusImpl <em>Plus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expressions.impl.PlusImpl
	 * @see expressions.impl.ExpressionsPackageImpl#getPlus()
	 * @generated
	 */
	int PLUS = 20;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link expressions.impl.MinusImpl <em>Minus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expressions.impl.MinusImpl
	 * @see expressions.impl.ExpressionsPackageImpl#getMinus()
	 * @generated
	 */
	int MINUS = 21;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Minus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Minus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link expressions.impl.MulOrDivImpl <em>Mul Or Div</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expressions.impl.MulOrDivImpl
	 * @see expressions.impl.ExpressionsPackageImpl#getMulOrDiv()
	 * @generated
	 */
	int MUL_OR_DIV = 22;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_OR_DIV__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_OR_DIV__OP = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_OR_DIV__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Mul Or Div</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_OR_DIV_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Mul Or Div</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_OR_DIV_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link expressions.impl.NotImpl <em>Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expressions.impl.NotImpl
	 * @see expressions.impl.ExpressionsPackageImpl#getNot()
	 * @generated
	 */
	int NOT = 23;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link expressions.impl.IntConstantImpl <em>Int Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expressions.impl.IntConstantImpl
	 * @see expressions.impl.ExpressionsPackageImpl#getIntConstant()
	 * @generated
	 */
	int INT_CONSTANT = 24;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_CONSTANT__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Int Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_CONSTANT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Int Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_CONSTANT_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link expressions.impl.StringConstantImpl <em>String Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expressions.impl.StringConstantImpl
	 * @see expressions.impl.ExpressionsPackageImpl#getStringConstant()
	 * @generated
	 */
	int STRING_CONSTANT = 25;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONSTANT__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONSTANT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONSTANT_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link expressions.impl.BoolConstantImpl <em>Bool Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expressions.impl.BoolConstantImpl
	 * @see expressions.impl.ExpressionsPackageImpl#getBoolConstant()
	 * @generated
	 */
	int BOOL_CONSTANT = 26;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_CONSTANT__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bool Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_CONSTANT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bool Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_CONSTANT_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link expressions.impl.VarOrParamRefImpl <em>Var Or Param Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expressions.impl.VarOrParamRefImpl
	 * @see expressions.impl.ExpressionsPackageImpl#getVarOrParamRef()
	 * @generated
	 */
	int VAR_OR_PARAM_REF = 27;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_OR_PARAM_REF__VARIABLE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Var Or Param Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_OR_PARAM_REF_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Var Or Param Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_OR_PARAM_REF_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link expressions.impl.FunParamExpImpl <em>Fun Param Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expressions.impl.FunParamExpImpl
	 * @see expressions.impl.ExpressionsPackageImpl#getFunParamExp()
	 * @generated
	 */
	int FUN_PARAM_EXP = 28;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_PARAM_EXP__EXPR = FUN_PARAM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fun Param Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_PARAM_EXP_FEATURE_COUNT = FUN_PARAM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Fun Param Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_PARAM_EXP_OPERATION_COUNT = FUN_PARAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link expressions.impl.FunParamCaptureImpl <em>Fun Param Capture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expressions.impl.FunParamCaptureImpl
	 * @see expressions.impl.ExpressionsPackageImpl#getFunParamCapture()
	 * @generated
	 */
	int FUN_PARAM_CAPTURE = 29;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_PARAM_CAPTURE__VARIABLE = FUN_PARAM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fun Param Capture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_PARAM_CAPTURE_FEATURE_COUNT = FUN_PARAM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Fun Param Capture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_PARAM_CAPTURE_OPERATION_COUNT = FUN_PARAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link expressions.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expressions.impl.ContextImpl
	 * @see expressions.impl.ExpressionsPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 30;

	/**
	 * The feature id for the '<em><b>Values</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__VALUES = 0;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link expressions.impl.StringToValueBindingMapImpl <em>String To Value Binding Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expressions.impl.StringToValueBindingMapImpl
	 * @see expressions.impl.ExpressionsPackageImpl#getStringToValueBindingMap()
	 * @generated
	 */
	int STRING_TO_VALUE_BINDING_MAP = 31;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_VALUE_BINDING_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_VALUE_BINDING_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Value Binding Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_VALUE_BINDING_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To Value Binding Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_VALUE_BINDING_MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link expressions.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expressions.impl.ValueImpl
	 * @see expressions.impl.ExpressionsPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 32;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link expressions.impl.IntValueImpl <em>Int Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expressions.impl.IntValueImpl
	 * @see expressions.impl.ExpressionsPackageImpl#getIntValue()
	 * @generated
	 */
	int INT_VALUE = 33;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Int Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Int Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link expressions.impl.BoolValueImpl <em>Bool Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expressions.impl.BoolValueImpl
	 * @see expressions.impl.ExpressionsPackageImpl#getBoolValue()
	 * @generated
	 */
	int BOOL_VALUE = 34;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bool Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bool Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link expressions.impl.StringValueImpl <em>String Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expressions.impl.StringValueImpl
	 * @see expressions.impl.ExpressionsPackageImpl#getStringValue()
	 * @generated
	 */
	int STRING_VALUE = 35;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link expressions.ExpressionsModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see expressions.ExpressionsModel
	 * @generated
	 */
	EClass getExpressionsModel();

	/**
	 * Returns the meta object for the containment reference '{@link expressions.ExpressionsModel#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statements</em>'.
	 * @see expressions.ExpressionsModel#getStatements()
	 * @see #getExpressionsModel()
	 * @generated
	 */
	EReference getExpressionsModel_Statements();

	/**
	 * Returns the meta object for class '{@link expressions.Statements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statements</em>'.
	 * @see expressions.Statements
	 * @generated
	 */
	EClass getStatements();

	/**
	 * Returns the meta object for the containment reference list '{@link expressions.Statements#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see expressions.Statements#getElements()
	 * @see #getStatements()
	 * @generated
	 */
	EReference getStatements_Elements();

	/**
	 * Returns the meta object for class '{@link expressions.AbstractElement <em>Abstract Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Element</em>'.
	 * @see expressions.AbstractElement
	 * @generated
	 */
	EClass getAbstractElement();

	/**
	 * Returns the meta object for class '{@link expressions.Loop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop</em>'.
	 * @see expressions.Loop
	 * @generated
	 */
	EClass getLoop();

	/**
	 * Returns the meta object for the containment reference '{@link expressions.Loop#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see expressions.Loop#getExpression()
	 * @see #getLoop()
	 * @generated
	 */
	EReference getLoop_Expression();

	/**
	 * Returns the meta object for the containment reference '{@link expressions.Loop#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see expressions.Loop#getBody()
	 * @see #getLoop()
	 * @generated
	 */
	EReference getLoop_Body();

	/**
	 * Returns the meta object for class '{@link expressions.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see expressions.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the containment reference '{@link expressions.Condition#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see expressions.Condition#getExpression()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Expression();

	/**
	 * Returns the meta object for the containment reference '{@link expressions.Condition#getIfz <em>Ifz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ifz</em>'.
	 * @see expressions.Condition#getIfz()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Ifz();

	/**
	 * Returns the meta object for the containment reference '{@link expressions.Condition#getElsez <em>Elsez</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Elsez</em>'.
	 * @see expressions.Condition#getElsez()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Elsez();

	/**
	 * Returns the meta object for class '{@link expressions.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see expressions.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the containment reference '{@link expressions.Block#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statements</em>'.
	 * @see expressions.Block#getStatements()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Statements();

	/**
	 * Returns the meta object for class '{@link expressions.FunDefinition <em>Fun Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fun Definition</em>'.
	 * @see expressions.FunDefinition
	 * @generated
	 */
	EClass getFunDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link expressions.FunDefinition#getVarNames <em>Var Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Var Names</em>'.
	 * @see expressions.FunDefinition#getVarNames()
	 * @see #getFunDefinition()
	 * @generated
	 */
	EReference getFunDefinition_VarNames();

	/**
	 * Returns the meta object for the attribute '{@link expressions.FunDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see expressions.FunDefinition#getName()
	 * @see #getFunDefinition()
	 * @generated
	 */
	EAttribute getFunDefinition_Name();

	/**
	 * Returns the meta object for class '{@link expressions.InlineFunction <em>Inline Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inline Function</em>'.
	 * @see expressions.InlineFunction
	 * @generated
	 */
	EClass getInlineFunction();

	/**
	 * Returns the meta object for the containment reference '{@link expressions.InlineFunction#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see expressions.InlineFunction#getExpression()
	 * @see #getInlineFunction()
	 * @generated
	 */
	EReference getInlineFunction_Expression();

	/**
	 * Returns the meta object for class '{@link expressions.ComplexFunction <em>Complex Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Function</em>'.
	 * @see expressions.ComplexFunction
	 * @generated
	 */
	EClass getComplexFunction();

	/**
	 * Returns the meta object for the containment reference '{@link expressions.ComplexFunction#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see expressions.ComplexFunction#getBody()
	 * @see #getComplexFunction()
	 * @generated
	 */
	EReference getComplexFunction_Body();

	/**
	 * Returns the meta object for class '{@link expressions.VarOrParam <em>Var Or Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var Or Param</em>'.
	 * @see expressions.VarOrParam
	 * @generated
	 */
	EClass getVarOrParam();

	/**
	 * Returns the meta object for the attribute '{@link expressions.VarOrParam#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see expressions.VarOrParam#getName()
	 * @see #getVarOrParam()
	 * @generated
	 */
	EAttribute getVarOrParam_Name();

	/**
	 * Returns the meta object for class '{@link expressions.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see expressions.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link expressions.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see expressions.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Type();

	/**
	 * Returns the meta object for class '{@link expressions.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see expressions.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the containment reference '{@link expressions.Variable#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see expressions.Variable#getExpression()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Expression();

	/**
	 * Returns the meta object for class '{@link expressions.EvalExpression <em>Eval Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eval Expression</em>'.
	 * @see expressions.EvalExpression
	 * @generated
	 */
	EClass getEvalExpression();

	/**
	 * Returns the meta object for the containment reference '{@link expressions.EvalExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see expressions.EvalExpression#getExpression()
	 * @see #getEvalExpression()
	 * @generated
	 */
	EReference getEvalExpression_Expression();

	/**
	 * Returns the meta object for class '{@link expressions.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see expressions.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link expressions.FunParam <em>Fun Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fun Param</em>'.
	 * @see expressions.FunParam
	 * @generated
	 */
	EClass getFunParam();

	/**
	 * Returns the meta object for class '{@link expressions.FunCall <em>Fun Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fun Call</em>'.
	 * @see expressions.FunCall
	 * @generated
	 */
	EClass getFunCall();

	/**
	 * Returns the meta object for the reference '{@link expressions.FunCall#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function</em>'.
	 * @see expressions.FunCall#getFunction()
	 * @see #getFunCall()
	 * @generated
	 */
	EReference getFunCall_Function();

	/**
	 * Returns the meta object for the containment reference list '{@link expressions.FunCall#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Params</em>'.
	 * @see expressions.FunCall#getParams()
	 * @see #getFunCall()
	 * @generated
	 */
	EReference getFunCall_Params();

	/**
	 * Returns the meta object for class '{@link expressions.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or</em>'.
	 * @see expressions.Or
	 * @generated
	 */
	EClass getOr();

	/**
	 * Returns the meta object for the containment reference '{@link expressions.Or#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see expressions.Or#getLeft()
	 * @see #getOr()
	 * @generated
	 */
	EReference getOr_Left();

	/**
	 * Returns the meta object for the containment reference '{@link expressions.Or#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see expressions.Or#getRight()
	 * @see #getOr()
	 * @generated
	 */
	EReference getOr_Right();

	/**
	 * Returns the meta object for class '{@link expressions.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And</em>'.
	 * @see expressions.And
	 * @generated
	 */
	EClass getAnd();

	/**
	 * Returns the meta object for the containment reference '{@link expressions.And#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see expressions.And#getLeft()
	 * @see #getAnd()
	 * @generated
	 */
	EReference getAnd_Left();

	/**
	 * Returns the meta object for the containment reference '{@link expressions.And#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see expressions.And#getRight()
	 * @see #getAnd()
	 * @generated
	 */
	EReference getAnd_Right();

	/**
	 * Returns the meta object for class '{@link expressions.Equality <em>Equality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equality</em>'.
	 * @see expressions.Equality
	 * @generated
	 */
	EClass getEquality();

	/**
	 * Returns the meta object for the containment reference '{@link expressions.Equality#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see expressions.Equality#getLeft()
	 * @see #getEquality()
	 * @generated
	 */
	EReference getEquality_Left();

	/**
	 * Returns the meta object for the attribute '{@link expressions.Equality#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see expressions.Equality#getOp()
	 * @see #getEquality()
	 * @generated
	 */
	EAttribute getEquality_Op();

	/**
	 * Returns the meta object for the containment reference '{@link expressions.Equality#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see expressions.Equality#getRight()
	 * @see #getEquality()
	 * @generated
	 */
	EReference getEquality_Right();

	/**
	 * Returns the meta object for class '{@link expressions.Comparison <em>Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparison</em>'.
	 * @see expressions.Comparison
	 * @generated
	 */
	EClass getComparison();

	/**
	 * Returns the meta object for the containment reference '{@link expressions.Comparison#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see expressions.Comparison#getLeft()
	 * @see #getComparison()
	 * @generated
	 */
	EReference getComparison_Left();

	/**
	 * Returns the meta object for the attribute '{@link expressions.Comparison#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see expressions.Comparison#getOp()
	 * @see #getComparison()
	 * @generated
	 */
	EAttribute getComparison_Op();

	/**
	 * Returns the meta object for the containment reference '{@link expressions.Comparison#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see expressions.Comparison#getRight()
	 * @see #getComparison()
	 * @generated
	 */
	EReference getComparison_Right();

	/**
	 * Returns the meta object for class '{@link expressions.Plus <em>Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plus</em>'.
	 * @see expressions.Plus
	 * @generated
	 */
	EClass getPlus();

	/**
	 * Returns the meta object for the containment reference '{@link expressions.Plus#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see expressions.Plus#getLeft()
	 * @see #getPlus()
	 * @generated
	 */
	EReference getPlus_Left();

	/**
	 * Returns the meta object for the containment reference '{@link expressions.Plus#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see expressions.Plus#getRight()
	 * @see #getPlus()
	 * @generated
	 */
	EReference getPlus_Right();

	/**
	 * Returns the meta object for class '{@link expressions.Minus <em>Minus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minus</em>'.
	 * @see expressions.Minus
	 * @generated
	 */
	EClass getMinus();

	/**
	 * Returns the meta object for the containment reference '{@link expressions.Minus#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see expressions.Minus#getLeft()
	 * @see #getMinus()
	 * @generated
	 */
	EReference getMinus_Left();

	/**
	 * Returns the meta object for the containment reference '{@link expressions.Minus#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see expressions.Minus#getRight()
	 * @see #getMinus()
	 * @generated
	 */
	EReference getMinus_Right();

	/**
	 * Returns the meta object for class '{@link expressions.MulOrDiv <em>Mul Or Div</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mul Or Div</em>'.
	 * @see expressions.MulOrDiv
	 * @generated
	 */
	EClass getMulOrDiv();

	/**
	 * Returns the meta object for the containment reference '{@link expressions.MulOrDiv#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see expressions.MulOrDiv#getLeft()
	 * @see #getMulOrDiv()
	 * @generated
	 */
	EReference getMulOrDiv_Left();

	/**
	 * Returns the meta object for the attribute '{@link expressions.MulOrDiv#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see expressions.MulOrDiv#getOp()
	 * @see #getMulOrDiv()
	 * @generated
	 */
	EAttribute getMulOrDiv_Op();

	/**
	 * Returns the meta object for the containment reference '{@link expressions.MulOrDiv#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see expressions.MulOrDiv#getRight()
	 * @see #getMulOrDiv()
	 * @generated
	 */
	EReference getMulOrDiv_Right();

	/**
	 * Returns the meta object for class '{@link expressions.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not</em>'.
	 * @see expressions.Not
	 * @generated
	 */
	EClass getNot();

	/**
	 * Returns the meta object for the containment reference '{@link expressions.Not#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see expressions.Not#getExpression()
	 * @see #getNot()
	 * @generated
	 */
	EReference getNot_Expression();

	/**
	 * Returns the meta object for class '{@link expressions.IntConstant <em>Int Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Constant</em>'.
	 * @see expressions.IntConstant
	 * @generated
	 */
	EClass getIntConstant();

	/**
	 * Returns the meta object for the attribute '{@link expressions.IntConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see expressions.IntConstant#getValue()
	 * @see #getIntConstant()
	 * @generated
	 */
	EAttribute getIntConstant_Value();

	/**
	 * Returns the meta object for class '{@link expressions.StringConstant <em>String Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Constant</em>'.
	 * @see expressions.StringConstant
	 * @generated
	 */
	EClass getStringConstant();

	/**
	 * Returns the meta object for the attribute '{@link expressions.StringConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see expressions.StringConstant#getValue()
	 * @see #getStringConstant()
	 * @generated
	 */
	EAttribute getStringConstant_Value();

	/**
	 * Returns the meta object for class '{@link expressions.BoolConstant <em>Bool Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bool Constant</em>'.
	 * @see expressions.BoolConstant
	 * @generated
	 */
	EClass getBoolConstant();

	/**
	 * Returns the meta object for the attribute '{@link expressions.BoolConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see expressions.BoolConstant#getValue()
	 * @see #getBoolConstant()
	 * @generated
	 */
	EAttribute getBoolConstant_Value();

	/**
	 * Returns the meta object for class '{@link expressions.VarOrParamRef <em>Var Or Param Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var Or Param Ref</em>'.
	 * @see expressions.VarOrParamRef
	 * @generated
	 */
	EClass getVarOrParamRef();

	/**
	 * Returns the meta object for the reference '{@link expressions.VarOrParamRef#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see expressions.VarOrParamRef#getVariable()
	 * @see #getVarOrParamRef()
	 * @generated
	 */
	EReference getVarOrParamRef_Variable();

	/**
	 * Returns the meta object for class '{@link expressions.FunParamExp <em>Fun Param Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fun Param Exp</em>'.
	 * @see expressions.FunParamExp
	 * @generated
	 */
	EClass getFunParamExp();

	/**
	 * Returns the meta object for the containment reference '{@link expressions.FunParamExp#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see expressions.FunParamExp#getExpr()
	 * @see #getFunParamExp()
	 * @generated
	 */
	EReference getFunParamExp_Expr();

	/**
	 * Returns the meta object for class '{@link expressions.FunParamCapture <em>Fun Param Capture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fun Param Capture</em>'.
	 * @see expressions.FunParamCapture
	 * @generated
	 */
	EClass getFunParamCapture();

	/**
	 * Returns the meta object for the reference '{@link expressions.FunParamCapture#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see expressions.FunParamCapture#getVariable()
	 * @see #getFunParamCapture()
	 * @generated
	 */
	EReference getFunParamCapture_Variable();

	/**
	 * Returns the meta object for class '{@link expressions.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see expressions.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for the map '{@link expressions.Context#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Values</em>'.
	 * @see expressions.Context#getValues()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Values();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Value Binding Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Value Binding Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="expressions.Value" valueRequired="true"
	 * @generated
	 */
	EClass getStringToValueBindingMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToValueBindingMap()
	 * @generated
	 */
	EAttribute getStringToValueBindingMap_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToValueBindingMap()
	 * @generated
	 */
	EReference getStringToValueBindingMap_Value();

	/**
	 * Returns the meta object for class '{@link expressions.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see expressions.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for class '{@link expressions.IntValue <em>Int Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Value</em>'.
	 * @see expressions.IntValue
	 * @generated
	 */
	EClass getIntValue();

	/**
	 * Returns the meta object for the attribute '{@link expressions.IntValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see expressions.IntValue#getValue()
	 * @see #getIntValue()
	 * @generated
	 */
	EAttribute getIntValue_Value();

	/**
	 * Returns the meta object for class '{@link expressions.BoolValue <em>Bool Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bool Value</em>'.
	 * @see expressions.BoolValue
	 * @generated
	 */
	EClass getBoolValue();

	/**
	 * Returns the meta object for the attribute '{@link expressions.BoolValue#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see expressions.BoolValue#isValue()
	 * @see #getBoolValue()
	 * @generated
	 */
	EAttribute getBoolValue_Value();

	/**
	 * Returns the meta object for class '{@link expressions.StringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Value</em>'.
	 * @see expressions.StringValue
	 * @generated
	 */
	EClass getStringValue();

	/**
	 * Returns the meta object for the attribute '{@link expressions.StringValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see expressions.StringValue#getValue()
	 * @see #getStringValue()
	 * @generated
	 */
	EAttribute getStringValue_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExpressionsFactory getExpressionsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link expressions.impl.ExpressionsModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expressions.impl.ExpressionsModelImpl
		 * @see expressions.impl.ExpressionsPackageImpl#getExpressionsModel()
		 * @generated
		 */
		EClass EXPRESSIONS_MODEL = eINSTANCE.getExpressionsModel();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSIONS_MODEL__STATEMENTS = eINSTANCE.getExpressionsModel_Statements();

		/**
		 * The meta object literal for the '{@link expressions.impl.StatementsImpl <em>Statements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expressions.impl.StatementsImpl
		 * @see expressions.impl.ExpressionsPackageImpl#getStatements()
		 * @generated
		 */
		EClass STATEMENTS = eINSTANCE.getStatements();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENTS__ELEMENTS = eINSTANCE.getStatements_Elements();

		/**
		 * The meta object literal for the '{@link expressions.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expressions.impl.AbstractElementImpl
		 * @see expressions.impl.ExpressionsPackageImpl#getAbstractElement()
		 * @generated
		 */
		EClass ABSTRACT_ELEMENT = eINSTANCE.getAbstractElement();

		/**
		 * The meta object literal for the '{@link expressions.impl.LoopImpl <em>Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expressions.impl.LoopImpl
		 * @see expressions.impl.ExpressionsPackageImpl#getLoop()
		 * @generated
		 */
		EClass LOOP = eINSTANCE.getLoop();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP__EXPRESSION = eINSTANCE.getLoop_Expression();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP__BODY = eINSTANCE.getLoop_Body();

		/**
		 * The meta object literal for the '{@link expressions.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expressions.impl.ConditionImpl
		 * @see expressions.impl.ExpressionsPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__EXPRESSION = eINSTANCE.getCondition_Expression();

		/**
		 * The meta object literal for the '<em><b>Ifz</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__IFZ = eINSTANCE.getCondition_Ifz();

		/**
		 * The meta object literal for the '<em><b>Elsez</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__ELSEZ = eINSTANCE.getCondition_Elsez();

		/**
		 * The meta object literal for the '{@link expressions.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expressions.impl.BlockImpl
		 * @see expressions.impl.ExpressionsPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__STATEMENTS = eINSTANCE.getBlock_Statements();

		/**
		 * The meta object literal for the '{@link expressions.impl.FunDefinitionImpl <em>Fun Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expressions.impl.FunDefinitionImpl
		 * @see expressions.impl.ExpressionsPackageImpl#getFunDefinition()
		 * @generated
		 */
		EClass FUN_DEFINITION = eINSTANCE.getFunDefinition();

		/**
		 * The meta object literal for the '<em><b>Var Names</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUN_DEFINITION__VAR_NAMES = eINSTANCE.getFunDefinition_VarNames();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUN_DEFINITION__NAME = eINSTANCE.getFunDefinition_Name();

		/**
		 * The meta object literal for the '{@link expressions.impl.InlineFunctionImpl <em>Inline Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expressions.impl.InlineFunctionImpl
		 * @see expressions.impl.ExpressionsPackageImpl#getInlineFunction()
		 * @generated
		 */
		EClass INLINE_FUNCTION = eINSTANCE.getInlineFunction();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE_FUNCTION__EXPRESSION = eINSTANCE.getInlineFunction_Expression();

		/**
		 * The meta object literal for the '{@link expressions.impl.ComplexFunctionImpl <em>Complex Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expressions.impl.ComplexFunctionImpl
		 * @see expressions.impl.ExpressionsPackageImpl#getComplexFunction()
		 * @generated
		 */
		EClass COMPLEX_FUNCTION = eINSTANCE.getComplexFunction();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_FUNCTION__BODY = eINSTANCE.getComplexFunction_Body();

		/**
		 * The meta object literal for the '{@link expressions.impl.VarOrParamImpl <em>Var Or Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expressions.impl.VarOrParamImpl
		 * @see expressions.impl.ExpressionsPackageImpl#getVarOrParam()
		 * @generated
		 */
		EClass VAR_OR_PARAM = eINSTANCE.getVarOrParam();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR_OR_PARAM__NAME = eINSTANCE.getVarOrParam_Name();

		/**
		 * The meta object literal for the '{@link expressions.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expressions.impl.ParameterImpl
		 * @see expressions.impl.ExpressionsPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '{@link expressions.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expressions.impl.VariableImpl
		 * @see expressions.impl.ExpressionsPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__EXPRESSION = eINSTANCE.getVariable_Expression();

		/**
		 * The meta object literal for the '{@link expressions.impl.EvalExpressionImpl <em>Eval Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expressions.impl.EvalExpressionImpl
		 * @see expressions.impl.ExpressionsPackageImpl#getEvalExpression()
		 * @generated
		 */
		EClass EVAL_EXPRESSION = eINSTANCE.getEvalExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVAL_EXPRESSION__EXPRESSION = eINSTANCE.getEvalExpression_Expression();

		/**
		 * The meta object literal for the '{@link expressions.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expressions.impl.ExpressionImpl
		 * @see expressions.impl.ExpressionsPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link expressions.impl.FunParamImpl <em>Fun Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expressions.impl.FunParamImpl
		 * @see expressions.impl.ExpressionsPackageImpl#getFunParam()
		 * @generated
		 */
		EClass FUN_PARAM = eINSTANCE.getFunParam();

		/**
		 * The meta object literal for the '{@link expressions.impl.FunCallImpl <em>Fun Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expressions.impl.FunCallImpl
		 * @see expressions.impl.ExpressionsPackageImpl#getFunCall()
		 * @generated
		 */
		EClass FUN_CALL = eINSTANCE.getFunCall();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUN_CALL__FUNCTION = eINSTANCE.getFunCall_Function();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUN_CALL__PARAMS = eINSTANCE.getFunCall_Params();

		/**
		 * The meta object literal for the '{@link expressions.impl.OrImpl <em>Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expressions.impl.OrImpl
		 * @see expressions.impl.ExpressionsPackageImpl#getOr()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOr();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OR__LEFT = eINSTANCE.getOr_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OR__RIGHT = eINSTANCE.getOr_Right();

		/**
		 * The meta object literal for the '{@link expressions.impl.AndImpl <em>And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expressions.impl.AndImpl
		 * @see expressions.impl.ExpressionsPackageImpl#getAnd()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAnd();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND__LEFT = eINSTANCE.getAnd_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND__RIGHT = eINSTANCE.getAnd_Right();

		/**
		 * The meta object literal for the '{@link expressions.impl.EqualityImpl <em>Equality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expressions.impl.EqualityImpl
		 * @see expressions.impl.ExpressionsPackageImpl#getEquality()
		 * @generated
		 */
		EClass EQUALITY = eINSTANCE.getEquality();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUALITY__LEFT = eINSTANCE.getEquality_Left();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUALITY__OP = eINSTANCE.getEquality_Op();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUALITY__RIGHT = eINSTANCE.getEquality_Right();

		/**
		 * The meta object literal for the '{@link expressions.impl.ComparisonImpl <em>Comparison</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expressions.impl.ComparisonImpl
		 * @see expressions.impl.ExpressionsPackageImpl#getComparison()
		 * @generated
		 */
		EClass COMPARISON = eINSTANCE.getComparison();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARISON__LEFT = eINSTANCE.getComparison_Left();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARISON__OP = eINSTANCE.getComparison_Op();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARISON__RIGHT = eINSTANCE.getComparison_Right();

		/**
		 * The meta object literal for the '{@link expressions.impl.PlusImpl <em>Plus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expressions.impl.PlusImpl
		 * @see expressions.impl.ExpressionsPackageImpl#getPlus()
		 * @generated
		 */
		EClass PLUS = eINSTANCE.getPlus();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUS__LEFT = eINSTANCE.getPlus_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUS__RIGHT = eINSTANCE.getPlus_Right();

		/**
		 * The meta object literal for the '{@link expressions.impl.MinusImpl <em>Minus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expressions.impl.MinusImpl
		 * @see expressions.impl.ExpressionsPackageImpl#getMinus()
		 * @generated
		 */
		EClass MINUS = eINSTANCE.getMinus();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINUS__LEFT = eINSTANCE.getMinus_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINUS__RIGHT = eINSTANCE.getMinus_Right();

		/**
		 * The meta object literal for the '{@link expressions.impl.MulOrDivImpl <em>Mul Or Div</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expressions.impl.MulOrDivImpl
		 * @see expressions.impl.ExpressionsPackageImpl#getMulOrDiv()
		 * @generated
		 */
		EClass MUL_OR_DIV = eINSTANCE.getMulOrDiv();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MUL_OR_DIV__LEFT = eINSTANCE.getMulOrDiv_Left();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUL_OR_DIV__OP = eINSTANCE.getMulOrDiv_Op();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MUL_OR_DIV__RIGHT = eINSTANCE.getMulOrDiv_Right();

		/**
		 * The meta object literal for the '{@link expressions.impl.NotImpl <em>Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expressions.impl.NotImpl
		 * @see expressions.impl.ExpressionsPackageImpl#getNot()
		 * @generated
		 */
		EClass NOT = eINSTANCE.getNot();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT__EXPRESSION = eINSTANCE.getNot_Expression();

		/**
		 * The meta object literal for the '{@link expressions.impl.IntConstantImpl <em>Int Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expressions.impl.IntConstantImpl
		 * @see expressions.impl.ExpressionsPackageImpl#getIntConstant()
		 * @generated
		 */
		EClass INT_CONSTANT = eINSTANCE.getIntConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT_CONSTANT__VALUE = eINSTANCE.getIntConstant_Value();

		/**
		 * The meta object literal for the '{@link expressions.impl.StringConstantImpl <em>String Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expressions.impl.StringConstantImpl
		 * @see expressions.impl.ExpressionsPackageImpl#getStringConstant()
		 * @generated
		 */
		EClass STRING_CONSTANT = eINSTANCE.getStringConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_CONSTANT__VALUE = eINSTANCE.getStringConstant_Value();

		/**
		 * The meta object literal for the '{@link expressions.impl.BoolConstantImpl <em>Bool Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expressions.impl.BoolConstantImpl
		 * @see expressions.impl.ExpressionsPackageImpl#getBoolConstant()
		 * @generated
		 */
		EClass BOOL_CONSTANT = eINSTANCE.getBoolConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOL_CONSTANT__VALUE = eINSTANCE.getBoolConstant_Value();

		/**
		 * The meta object literal for the '{@link expressions.impl.VarOrParamRefImpl <em>Var Or Param Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expressions.impl.VarOrParamRefImpl
		 * @see expressions.impl.ExpressionsPackageImpl#getVarOrParamRef()
		 * @generated
		 */
		EClass VAR_OR_PARAM_REF = eINSTANCE.getVarOrParamRef();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAR_OR_PARAM_REF__VARIABLE = eINSTANCE.getVarOrParamRef_Variable();

		/**
		 * The meta object literal for the '{@link expressions.impl.FunParamExpImpl <em>Fun Param Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expressions.impl.FunParamExpImpl
		 * @see expressions.impl.ExpressionsPackageImpl#getFunParamExp()
		 * @generated
		 */
		EClass FUN_PARAM_EXP = eINSTANCE.getFunParamExp();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUN_PARAM_EXP__EXPR = eINSTANCE.getFunParamExp_Expr();

		/**
		 * The meta object literal for the '{@link expressions.impl.FunParamCaptureImpl <em>Fun Param Capture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expressions.impl.FunParamCaptureImpl
		 * @see expressions.impl.ExpressionsPackageImpl#getFunParamCapture()
		 * @generated
		 */
		EClass FUN_PARAM_CAPTURE = eINSTANCE.getFunParamCapture();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUN_PARAM_CAPTURE__VARIABLE = eINSTANCE.getFunParamCapture_Variable();

		/**
		 * The meta object literal for the '{@link expressions.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expressions.impl.ContextImpl
		 * @see expressions.impl.ExpressionsPackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__VALUES = eINSTANCE.getContext_Values();

		/**
		 * The meta object literal for the '{@link expressions.impl.StringToValueBindingMapImpl <em>String To Value Binding Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expressions.impl.StringToValueBindingMapImpl
		 * @see expressions.impl.ExpressionsPackageImpl#getStringToValueBindingMap()
		 * @generated
		 */
		EClass STRING_TO_VALUE_BINDING_MAP = eINSTANCE.getStringToValueBindingMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_VALUE_BINDING_MAP__KEY = eINSTANCE.getStringToValueBindingMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TO_VALUE_BINDING_MAP__VALUE = eINSTANCE.getStringToValueBindingMap_Value();

		/**
		 * The meta object literal for the '{@link expressions.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expressions.impl.ValueImpl
		 * @see expressions.impl.ExpressionsPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '{@link expressions.impl.IntValueImpl <em>Int Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expressions.impl.IntValueImpl
		 * @see expressions.impl.ExpressionsPackageImpl#getIntValue()
		 * @generated
		 */
		EClass INT_VALUE = eINSTANCE.getIntValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT_VALUE__VALUE = eINSTANCE.getIntValue_Value();

		/**
		 * The meta object literal for the '{@link expressions.impl.BoolValueImpl <em>Bool Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expressions.impl.BoolValueImpl
		 * @see expressions.impl.ExpressionsPackageImpl#getBoolValue()
		 * @generated
		 */
		EClass BOOL_VALUE = eINSTANCE.getBoolValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOL_VALUE__VALUE = eINSTANCE.getBoolValue_Value();

		/**
		 * The meta object literal for the '{@link expressions.impl.StringValueImpl <em>String Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expressions.impl.StringValueImpl
		 * @see expressions.impl.ExpressionsPackageImpl#getStringValue()
		 * @generated
		 */
		EClass STRING_VALUE = eINSTANCE.getStringValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_VALUE__VALUE = eINSTANCE.getStringValue_Value();

	}

} //ExpressionsPackage
