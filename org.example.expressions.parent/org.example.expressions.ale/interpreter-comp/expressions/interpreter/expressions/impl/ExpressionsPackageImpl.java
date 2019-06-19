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
import java.util.Map.Entry;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

public class ExpressionsPackageImpl extends EPackageImpl implements ExpressionsPackage {
	private static boolean isInited = false;

	private EClass expressionsModelEClass = null;

	private EClass statementsEClass = null;

	private EClass abstractElementEClass = null;

	private EClass loopEClass = null;

	private EClass conditionEClass = null;

	private EClass blockEClass = null;

	private EClass funDefinitionEClass = null;

	private EClass inlineFunctionEClass = null;

	private EClass complexFunctionEClass = null;

	private EClass varOrParamEClass = null;

	private EClass parameterEClass = null;

	private EClass variableEClass = null;

	private EClass evalExpressionEClass = null;

	private EClass expressionEClass = null;

	private EClass funParamEClass = null;

	private EClass funCallEClass = null;

	private EClass orEClass = null;

	private EClass andEClass = null;

	private EClass equalityEClass = null;

	private EClass comparisonEClass = null;

	private EClass plusEClass = null;

	private EClass minusEClass = null;

	private EClass mulOrDivEClass = null;

	private EClass notEClass = null;

	private EClass intConstantEClass = null;

	private EClass stringConstantEClass = null;

	private EClass boolConstantEClass = null;

	private EClass varOrParamRefEClass = null;

	private EClass funParamExpEClass = null;

	private EClass funParamCaptureEClass = null;

	private EClass contextEClass = null;

	private EClass stringToValueBindingMapEClass = null;

	private EClass valueEClass = null;

	private EClass intValueEClass = null;

	private EClass boolValueEClass = null;

	private EClass stringValueEClass = null;

	private boolean isCreated = false;

	private boolean isInitialized = false;

	private ExpressionsPackageImpl() {
		super(eNS_URI, ExpressionsFactory.eINSTANCE);
	}

	public static ExpressionsPackage init() {
		if (isInited)
			return (ExpressionsPackage) EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredExpressionsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ExpressionsPackageImpl theExpressionsPackage = registeredExpressionsPackage instanceof ExpressionsPackageImpl
				? (ExpressionsPackageImpl) registeredExpressionsPackage
				: new ExpressionsPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theExpressionsPackage.createPackageContents();

		// Initialize created meta-data
		theExpressionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExpressionsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExpressionsPackage.eNS_URI, theExpressionsPackage);
		return theExpressionsPackage;
	}

	public EClass getExpressionsModel() {
		return expressionsModelEClass;
	}

	public EReference getExpressionsModel_Statements() {
		return (EReference) expressionsModelEClass.getEStructuralFeatures().get(0);
	}

	public EClass getStatements() {
		return statementsEClass;
	}

	public EReference getStatements_Elements() {
		return (EReference) statementsEClass.getEStructuralFeatures().get(0);
	}

	public EClass getAbstractElement() {
		return abstractElementEClass;
	}

	public EClass getLoop() {
		return loopEClass;
	}

	public EReference getLoop_Expression() {
		return (EReference) loopEClass.getEStructuralFeatures().get(0);
	}

	public EReference getLoop_Body() {
		return (EReference) loopEClass.getEStructuralFeatures().get(1);
	}

	public EClass getCondition() {
		return conditionEClass;
	}

	public EReference getCondition_Expression() {
		return (EReference) conditionEClass.getEStructuralFeatures().get(0);
	}

	public EReference getCondition_Ifz() {
		return (EReference) conditionEClass.getEStructuralFeatures().get(1);
	}

	public EReference getCondition_Elsez() {
		return (EReference) conditionEClass.getEStructuralFeatures().get(2);
	}

	public EClass getBlock() {
		return blockEClass;
	}

	public EReference getBlock_Statements() {
		return (EReference) blockEClass.getEStructuralFeatures().get(0);
	}

	public EClass getFunDefinition() {
		return funDefinitionEClass;
	}

	public EReference getFunDefinition_VarNames() {
		return (EReference) funDefinitionEClass.getEStructuralFeatures().get(0);
	}

	public EAttribute getFunDefinition_Name() {
		return (EAttribute) funDefinitionEClass.getEStructuralFeatures().get(1);
	}

	public EClass getInlineFunction() {
		return inlineFunctionEClass;
	}

	public EReference getInlineFunction_Expression() {
		return (EReference) inlineFunctionEClass.getEStructuralFeatures().get(0);
	}

	public EClass getComplexFunction() {
		return complexFunctionEClass;
	}

	public EReference getComplexFunction_Body() {
		return (EReference) complexFunctionEClass.getEStructuralFeatures().get(0);
	}

	public EClass getVarOrParam() {
		return varOrParamEClass;
	}

	public EAttribute getVarOrParam_Name() {
		return (EAttribute) varOrParamEClass.getEStructuralFeatures().get(0);
	}

	public EClass getParameter() {
		return parameterEClass;
	}

	public EAttribute getParameter_Type() {
		return (EAttribute) parameterEClass.getEStructuralFeatures().get(0);
	}

	public EClass getVariable() {
		return variableEClass;
	}

	public EReference getVariable_Expression() {
		return (EReference) variableEClass.getEStructuralFeatures().get(0);
	}

	public EClass getEvalExpression() {
		return evalExpressionEClass;
	}

	public EReference getEvalExpression_Expression() {
		return (EReference) evalExpressionEClass.getEStructuralFeatures().get(0);
	}

	public EClass getExpression() {
		return expressionEClass;
	}

	public EClass getFunParam() {
		return funParamEClass;
	}

	public EClass getFunCall() {
		return funCallEClass;
	}

	public EReference getFunCall_Function() {
		return (EReference) funCallEClass.getEStructuralFeatures().get(0);
	}

	public EReference getFunCall_Params() {
		return (EReference) funCallEClass.getEStructuralFeatures().get(1);
	}

	public EClass getOr() {
		return orEClass;
	}

	public EReference getOr_Left() {
		return (EReference) orEClass.getEStructuralFeatures().get(0);
	}

	public EReference getOr_Right() {
		return (EReference) orEClass.getEStructuralFeatures().get(1);
	}

	public EClass getAnd() {
		return andEClass;
	}

	public EReference getAnd_Left() {
		return (EReference) andEClass.getEStructuralFeatures().get(0);
	}

	public EReference getAnd_Right() {
		return (EReference) andEClass.getEStructuralFeatures().get(1);
	}

	public EClass getEquality() {
		return equalityEClass;
	}

	public EReference getEquality_Left() {
		return (EReference) equalityEClass.getEStructuralFeatures().get(0);
	}

	public EAttribute getEquality_Op() {
		return (EAttribute) equalityEClass.getEStructuralFeatures().get(1);
	}

	public EReference getEquality_Right() {
		return (EReference) equalityEClass.getEStructuralFeatures().get(2);
	}

	public EClass getComparison() {
		return comparisonEClass;
	}

	public EReference getComparison_Left() {
		return (EReference) comparisonEClass.getEStructuralFeatures().get(0);
	}

	public EAttribute getComparison_Op() {
		return (EAttribute) comparisonEClass.getEStructuralFeatures().get(1);
	}

	public EReference getComparison_Right() {
		return (EReference) comparisonEClass.getEStructuralFeatures().get(2);
	}

	public EClass getPlus() {
		return plusEClass;
	}

	public EReference getPlus_Left() {
		return (EReference) plusEClass.getEStructuralFeatures().get(0);
	}

	public EReference getPlus_Right() {
		return (EReference) plusEClass.getEStructuralFeatures().get(1);
	}

	public EClass getMinus() {
		return minusEClass;
	}

	public EReference getMinus_Left() {
		return (EReference) minusEClass.getEStructuralFeatures().get(0);
	}

	public EReference getMinus_Right() {
		return (EReference) minusEClass.getEStructuralFeatures().get(1);
	}

	public EClass getMulOrDiv() {
		return mulOrDivEClass;
	}

	public EReference getMulOrDiv_Left() {
		return (EReference) mulOrDivEClass.getEStructuralFeatures().get(0);
	}

	public EAttribute getMulOrDiv_Op() {
		return (EAttribute) mulOrDivEClass.getEStructuralFeatures().get(1);
	}

	public EReference getMulOrDiv_Right() {
		return (EReference) mulOrDivEClass.getEStructuralFeatures().get(2);
	}

	public EClass getNot() {
		return notEClass;
	}

	public EReference getNot_Expression() {
		return (EReference) notEClass.getEStructuralFeatures().get(0);
	}

	public EClass getIntConstant() {
		return intConstantEClass;
	}

	public EAttribute getIntConstant_Value() {
		return (EAttribute) intConstantEClass.getEStructuralFeatures().get(0);
	}

	public EClass getStringConstant() {
		return stringConstantEClass;
	}

	public EAttribute getStringConstant_Value() {
		return (EAttribute) stringConstantEClass.getEStructuralFeatures().get(0);
	}

	public EClass getBoolConstant() {
		return boolConstantEClass;
	}

	public EAttribute getBoolConstant_Value() {
		return (EAttribute) boolConstantEClass.getEStructuralFeatures().get(0);
	}

	public EClass getVarOrParamRef() {
		return varOrParamRefEClass;
	}

	public EReference getVarOrParamRef_Variable() {
		return (EReference) varOrParamRefEClass.getEStructuralFeatures().get(0);
	}

	public EClass getFunParamExp() {
		return funParamExpEClass;
	}

	public EReference getFunParamExp_Expr() {
		return (EReference) funParamExpEClass.getEStructuralFeatures().get(0);
	}

	public EClass getFunParamCapture() {
		return funParamCaptureEClass;
	}

	public EReference getFunParamCapture_Variable() {
		return (EReference) funParamCaptureEClass.getEStructuralFeatures().get(0);
	}

	public EClass getContext() {
		return contextEClass;
	}

	public EReference getContext_Values() {
		return (EReference) contextEClass.getEStructuralFeatures().get(0);
	}

	public EClass getStringToValueBindingMap() {
		return stringToValueBindingMapEClass;
	}

	public EAttribute getStringToValueBindingMap_Key() {
		return (EAttribute) stringToValueBindingMapEClass.getEStructuralFeatures().get(0);
	}

	public EReference getStringToValueBindingMap_Value() {
		return (EReference) stringToValueBindingMapEClass.getEStructuralFeatures().get(1);
	}

	public EClass getValue() {
		return valueEClass;
	}

	public EClass getIntValue() {
		return intValueEClass;
	}

	public EAttribute getIntValue_Value() {
		return (EAttribute) intValueEClass.getEStructuralFeatures().get(0);
	}

	public EClass getBoolValue() {
		return boolValueEClass;
	}

	public EAttribute getBoolValue_Value() {
		return (EAttribute) boolValueEClass.getEStructuralFeatures().get(0);
	}

	public EClass getStringValue() {
		return stringValueEClass;
	}

	public EAttribute getStringValue_Value() {
		return (EAttribute) stringValueEClass.getEStructuralFeatures().get(0);
	}

	public ExpressionsFactory getExpressionsFactory() {
		return (ExpressionsFactory) getEFactoryInstance();
	}

	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		expressionsModelEClass = createEClass(EXPRESSIONS_MODEL);
		createEReference(expressionsModelEClass, EXPRESSIONS_MODEL__STATEMENTS);

		statementsEClass = createEClass(STATEMENTS);
		createEReference(statementsEClass, STATEMENTS__ELEMENTS);

		abstractElementEClass = createEClass(ABSTRACT_ELEMENT);

		loopEClass = createEClass(LOOP);
		createEReference(loopEClass, LOOP__EXPRESSION);
		createEReference(loopEClass, LOOP__BODY);

		conditionEClass = createEClass(CONDITION);
		createEReference(conditionEClass, CONDITION__EXPRESSION);
		createEReference(conditionEClass, CONDITION__IFZ);
		createEReference(conditionEClass, CONDITION__ELSEZ);

		blockEClass = createEClass(BLOCK);
		createEReference(blockEClass, BLOCK__STATEMENTS);

		funDefinitionEClass = createEClass(FUN_DEFINITION);
		createEReference(funDefinitionEClass, FUN_DEFINITION__VAR_NAMES);
		createEAttribute(funDefinitionEClass, FUN_DEFINITION__NAME);

		inlineFunctionEClass = createEClass(INLINE_FUNCTION);
		createEReference(inlineFunctionEClass, INLINE_FUNCTION__EXPRESSION);

		complexFunctionEClass = createEClass(COMPLEX_FUNCTION);
		createEReference(complexFunctionEClass, COMPLEX_FUNCTION__BODY);

		varOrParamEClass = createEClass(VAR_OR_PARAM);
		createEAttribute(varOrParamEClass, VAR_OR_PARAM__NAME);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__TYPE);

		variableEClass = createEClass(VARIABLE);
		createEReference(variableEClass, VARIABLE__EXPRESSION);

		evalExpressionEClass = createEClass(EVAL_EXPRESSION);
		createEReference(evalExpressionEClass, EVAL_EXPRESSION__EXPRESSION);

		expressionEClass = createEClass(EXPRESSION);

		funParamEClass = createEClass(FUN_PARAM);

		funCallEClass = createEClass(FUN_CALL);
		createEReference(funCallEClass, FUN_CALL__FUNCTION);
		createEReference(funCallEClass, FUN_CALL__PARAMS);

		orEClass = createEClass(OR);
		createEReference(orEClass, OR__LEFT);
		createEReference(orEClass, OR__RIGHT);

		andEClass = createEClass(AND);
		createEReference(andEClass, AND__LEFT);
		createEReference(andEClass, AND__RIGHT);

		equalityEClass = createEClass(EQUALITY);
		createEReference(equalityEClass, EQUALITY__LEFT);
		createEAttribute(equalityEClass, EQUALITY__OP);
		createEReference(equalityEClass, EQUALITY__RIGHT);

		comparisonEClass = createEClass(COMPARISON);
		createEReference(comparisonEClass, COMPARISON__LEFT);
		createEAttribute(comparisonEClass, COMPARISON__OP);
		createEReference(comparisonEClass, COMPARISON__RIGHT);

		plusEClass = createEClass(PLUS);
		createEReference(plusEClass, PLUS__LEFT);
		createEReference(plusEClass, PLUS__RIGHT);

		minusEClass = createEClass(MINUS);
		createEReference(minusEClass, MINUS__LEFT);
		createEReference(minusEClass, MINUS__RIGHT);

		mulOrDivEClass = createEClass(MUL_OR_DIV);
		createEReference(mulOrDivEClass, MUL_OR_DIV__LEFT);
		createEAttribute(mulOrDivEClass, MUL_OR_DIV__OP);
		createEReference(mulOrDivEClass, MUL_OR_DIV__RIGHT);

		notEClass = createEClass(NOT);
		createEReference(notEClass, NOT__EXPRESSION);

		intConstantEClass = createEClass(INT_CONSTANT);
		createEAttribute(intConstantEClass, INT_CONSTANT__VALUE);

		stringConstantEClass = createEClass(STRING_CONSTANT);
		createEAttribute(stringConstantEClass, STRING_CONSTANT__VALUE);

		boolConstantEClass = createEClass(BOOL_CONSTANT);
		createEAttribute(boolConstantEClass, BOOL_CONSTANT__VALUE);

		varOrParamRefEClass = createEClass(VAR_OR_PARAM_REF);
		createEReference(varOrParamRefEClass, VAR_OR_PARAM_REF__VARIABLE);

		funParamExpEClass = createEClass(FUN_PARAM_EXP);
		createEReference(funParamExpEClass, FUN_PARAM_EXP__EXPR);

		funParamCaptureEClass = createEClass(FUN_PARAM_CAPTURE);
		createEReference(funParamCaptureEClass, FUN_PARAM_CAPTURE__VARIABLE);

		contextEClass = createEClass(CONTEXT);
		createEReference(contextEClass, CONTEXT__VALUES);

		stringToValueBindingMapEClass = createEClass(STRING_TO_VALUE_BINDING_MAP);
		createEAttribute(stringToValueBindingMapEClass, STRING_TO_VALUE_BINDING_MAP__KEY);
		createEReference(stringToValueBindingMapEClass, STRING_TO_VALUE_BINDING_MAP__VALUE);

		valueEClass = createEClass(VALUE);

		intValueEClass = createEClass(INT_VALUE);
		createEAttribute(intValueEClass, INT_VALUE__VALUE);

		boolValueEClass = createEClass(BOOL_VALUE);
		createEAttribute(boolValueEClass, BOOL_VALUE__VALUE);

		stringValueEClass = createEClass(STRING_VALUE);
		createEAttribute(stringValueEClass, STRING_VALUE__VALUE);
	}

	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		loopEClass.getESuperTypes().add(this.getAbstractElement());
		conditionEClass.getESuperTypes().add(this.getAbstractElement());
		funDefinitionEClass.getESuperTypes().add(this.getAbstractElement());
		inlineFunctionEClass.getESuperTypes().add(this.getFunDefinition());
		complexFunctionEClass.getESuperTypes().add(this.getFunDefinition());
		parameterEClass.getESuperTypes().add(this.getVarOrParam());
		variableEClass.getESuperTypes().add(this.getAbstractElement());
		variableEClass.getESuperTypes().add(this.getVarOrParam());
		evalExpressionEClass.getESuperTypes().add(this.getAbstractElement());
		funCallEClass.getESuperTypes().add(this.getExpression());
		orEClass.getESuperTypes().add(this.getExpression());
		andEClass.getESuperTypes().add(this.getExpression());
		equalityEClass.getESuperTypes().add(this.getExpression());
		comparisonEClass.getESuperTypes().add(this.getExpression());
		plusEClass.getESuperTypes().add(this.getExpression());
		minusEClass.getESuperTypes().add(this.getExpression());
		mulOrDivEClass.getESuperTypes().add(this.getExpression());
		notEClass.getESuperTypes().add(this.getExpression());
		intConstantEClass.getESuperTypes().add(this.getExpression());
		stringConstantEClass.getESuperTypes().add(this.getExpression());
		boolConstantEClass.getESuperTypes().add(this.getExpression());
		varOrParamRefEClass.getESuperTypes().add(this.getExpression());
		funParamExpEClass.getESuperTypes().add(this.getFunParam());
		funParamCaptureEClass.getESuperTypes().add(this.getFunParam());
		intValueEClass.getESuperTypes().add(this.getValue());
		boolValueEClass.getESuperTypes().add(this.getValue());
		stringValueEClass.getESuperTypes().add(this.getValue());

		// Initialize classes, features, and operations; add parameters
		initEClass(expressionsModelEClass, ExpressionsModel.class, "ExpressionsModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpressionsModel_Statements(), this.getStatements(), null, "statements", null, 0, 1, ExpressionsModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statementsEClass, Statements.class, "Statements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStatements_Elements(), this.getAbstractElement(), null, "elements", null, 0, -1, Statements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractElementEClass, AbstractElement.class, "AbstractElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(loopEClass, Loop.class, "Loop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLoop_Expression(), this.getExpression(), null, "expression", null, 0, 1, Loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLoop_Body(), this.getBlock(), null, "body", null, 0, 1, Loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCondition_Expression(), this.getExpression(), null, "expression", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCondition_Ifz(), this.getBlock(), null, "ifz", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCondition_Elsez(), this.getBlock(), null, "elsez", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlock_Statements(), this.getStatements(), null, "statements", null, 0, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(funDefinitionEClass, FunDefinition.class, "FunDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunDefinition_VarNames(), this.getParameter(), null, "varNames", null, 0, -1, FunDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, FunDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inlineFunctionEClass, InlineFunction.class, "InlineFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInlineFunction_Expression(), this.getExpression(), null, "expression", null, 0, 1, InlineFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complexFunctionEClass, ComplexFunction.class, "ComplexFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComplexFunction_Body(), this.getBlock(), null, "body", null, 0, 1, ComplexFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(varOrParamEClass, VarOrParam.class, "VarOrParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVarOrParam_Name(), ecorePackage.getEString(), "name", null, 0, 1, VarOrParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Type(), ecorePackage.getEString(), "type", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariable_Expression(), this.getExpression(), null, "expression", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evalExpressionEClass, EvalExpression.class, "EvalExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvalExpression_Expression(), this.getExpression(), null, "expression", null, 0, 1, EvalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(funParamEClass, FunParam.class, "FunParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(funCallEClass, FunCall.class, "FunCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunCall_Function(), this.getFunDefinition(), null, "function", null, 0, 1, FunCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunCall_Params(), this.getFunParam(), null, "params", null, 0, -1, FunCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orEClass, Or.class, "Or", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOr_Left(), this.getExpression(), null, "left", null, 0, 1, Or.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOr_Right(), this.getExpression(), null, "right", null, 0, 1, Or.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(andEClass, And.class, "And", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnd_Left(), this.getExpression(), null, "left", null, 0, 1, And.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnd_Right(), this.getExpression(), null, "right", null, 0, 1, And.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(equalityEClass, Equality.class, "Equality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEquality_Left(), this.getExpression(), null, "left", null, 0, 1, Equality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEquality_Op(), ecorePackage.getEString(), "op", null, 0, 1, Equality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEquality_Right(), this.getExpression(), null, "right", null, 0, 1, Equality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comparisonEClass, Comparison.class, "Comparison", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComparison_Left(), this.getExpression(), null, "left", null, 0, 1, Comparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComparison_Op(), ecorePackage.getEString(), "op", null, 0, 1, Comparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComparison_Right(), this.getExpression(), null, "right", null, 0, 1, Comparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(plusEClass, Plus.class, "Plus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlus_Left(), this.getExpression(), null, "left", null, 0, 1, Plus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlus_Right(), this.getExpression(), null, "right", null, 0, 1, Plus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(minusEClass, Minus.class, "Minus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMinus_Left(), this.getExpression(), null, "left", null, 0, 1, Minus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMinus_Right(), this.getExpression(), null, "right", null, 0, 1, Minus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mulOrDivEClass, MulOrDiv.class, "MulOrDiv", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMulOrDiv_Left(), this.getExpression(), null, "left", null, 0, 1, MulOrDiv.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMulOrDiv_Op(), ecorePackage.getEString(), "op", null, 0, 1, MulOrDiv.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMulOrDiv_Right(), this.getExpression(), null, "right", null, 0, 1, MulOrDiv.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notEClass, Not.class, "Not", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNot_Expression(), this.getExpression(), null, "expression", null, 0, 1, Not.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intConstantEClass, IntConstant.class, "IntConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntConstant_Value(), ecorePackage.getEInt(), "value", null, 0, 1, IntConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringConstantEClass, StringConstant.class, "StringConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringConstant_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boolConstantEClass, BoolConstant.class, "BoolConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoolConstant_Value(), ecorePackage.getEString(), "value", null, 0, 1, BoolConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(varOrParamRefEClass, VarOrParamRef.class, "VarOrParamRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVarOrParamRef_Variable(), this.getVarOrParam(), null, "variable", null, 0, 1, VarOrParamRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(funParamExpEClass, FunParamExp.class, "FunParamExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunParamExp_Expr(), this.getExpression(), null, "expr", null, 0, 1, FunParamExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(funParamCaptureEClass, FunParamCapture.class, "FunParamCapture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunParamCapture_Variable(), this.getVarOrParam(), null, "variable", null, 0, 1, FunParamCapture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextEClass, Context.class, "Context", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContext_Values(), this.getStringToValueBindingMap(), null, "values", null, 0, -1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringToValueBindingMapEClass, Entry.class, "StringToValueBindingMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringToValueBindingMap_Key(), ecorePackage.getEString(), "key", null, 0, 1, Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStringToValueBindingMap_Value(), this.getValue(), null, "value", null, 1, 1, Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueEClass, Value.class, "Value", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(intValueEClass, IntValue.class, "IntValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntValue_Value(), ecorePackage.getEInt(), "value", null, 0, 1, IntValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boolValueEClass, BoolValue.class, "BoolValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoolValue_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, BoolValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringValueEClass, StringValue.class, "StringValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}
}
