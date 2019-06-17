package expressions.interpreter.expressions;

import expressions.interpreter.expressions.impl.ExpressionsPackageImpl;
import java.lang.String;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

public interface ExpressionsPackage extends EPackage {
	String eNAME = "expressions";

	String eNS_URI = "http://expressions.expressions.expressions/";

	String eNS_PREFIX = "expressions";

	ExpressionsPackage eINSTANCE = ExpressionsPackageImpl.init();

	int EXPRESSIONS_MODEL = 0;

	int EXPRESSIONS_MODEL__STATEMENTS = 0;

	int EXPRESSIONS_MODEL_FEATURE_COUNT = 1;

	int EXPRESSIONS_MODEL_OPERATION_COUNT = 0;

	int STATEMENTS = 1;

	int STATEMENTS__ELEMENTS = 0;

	int STATEMENTS_FEATURE_COUNT = 1;

	int STATEMENTS_OPERATION_COUNT = 0;

	int ABSTRACT_ELEMENT = 2;

	int ABSTRACT_ELEMENT_FEATURE_COUNT = 0;

	int ABSTRACT_ELEMENT_OPERATION_COUNT = 0;

	int LOOP = 3;

	int LOOP__EXPRESSION = 0;

	int LOOP__BODY = 1;

	int LOOP_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 2;

	int LOOP_OPERATION_COUNT = ABSTRACT_ELEMENT_OPERATION_COUNT + 0;

	int CONDITION = 4;

	int CONDITION__EXPRESSION = 0;

	int CONDITION__IFZ = 1;

	int CONDITION__ELSEZ = 2;

	int CONDITION_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 3;

	int CONDITION_OPERATION_COUNT = ABSTRACT_ELEMENT_OPERATION_COUNT + 0;

	int BLOCK = 5;

	int BLOCK__STATEMENTS = 0;

	int BLOCK_FEATURE_COUNT = 1;

	int BLOCK_OPERATION_COUNT = 0;

	int FUN_DEFINITION = 6;

	int FUN_DEFINITION__VAR_NAMES = 0;

	int FUN_DEFINITION__NAME = 1;

	int FUN_DEFINITION_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 2;

	int FUN_DEFINITION_OPERATION_COUNT = ABSTRACT_ELEMENT_OPERATION_COUNT + 0;

	int INLINE_FUNCTION = 7;

	int INLINE_FUNCTION__VAR_NAMES = FUN_DEFINITION__VAR_NAMES;

	int INLINE_FUNCTION__NAME = FUN_DEFINITION__NAME;

	int INLINE_FUNCTION__EXPRESSION = 2;

	int INLINE_FUNCTION_FEATURE_COUNT = FUN_DEFINITION_FEATURE_COUNT + 1;

	int INLINE_FUNCTION_OPERATION_COUNT = FUN_DEFINITION_OPERATION_COUNT + 0;

	int COMPLEX_FUNCTION = 8;

	int COMPLEX_FUNCTION__VAR_NAMES = FUN_DEFINITION__VAR_NAMES;

	int COMPLEX_FUNCTION__NAME = FUN_DEFINITION__NAME;

	int COMPLEX_FUNCTION__BODY = 2;

	int COMPLEX_FUNCTION_FEATURE_COUNT = FUN_DEFINITION_FEATURE_COUNT + 1;

	int COMPLEX_FUNCTION_OPERATION_COUNT = FUN_DEFINITION_OPERATION_COUNT + 0;

	int VAR_OR_PARAM = 9;

	int VAR_OR_PARAM__NAME = 0;

	int VAR_OR_PARAM_FEATURE_COUNT = 1;

	int VAR_OR_PARAM_OPERATION_COUNT = 0;

	int PARAMETER = 10;

	int PARAMETER__NAME = VAR_OR_PARAM__NAME;

	int PARAMETER__TYPE = 1;

	int PARAMETER_FEATURE_COUNT = VAR_OR_PARAM_FEATURE_COUNT + 1;

	int PARAMETER_OPERATION_COUNT = VAR_OR_PARAM_OPERATION_COUNT + 0;

	int VARIABLE = 11;

	int VARIABLE__NAME = VAR_OR_PARAM__NAME;

	int VARIABLE__EXPRESSION = 1;

	int VARIABLE_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

	int VARIABLE_OPERATION_COUNT = ABSTRACT_ELEMENT_OPERATION_COUNT + 0;

	int EVAL_EXPRESSION = 12;

	int EVAL_EXPRESSION__EXPRESSION = 0;

	int EVAL_EXPRESSION_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

	int EVAL_EXPRESSION_OPERATION_COUNT = ABSTRACT_ELEMENT_OPERATION_COUNT + 0;

	int EXPRESSION = 13;

	int EXPRESSION_FEATURE_COUNT = 0;

	int EXPRESSION_OPERATION_COUNT = 0;

	int FUN_PARAM = 14;

	int FUN_PARAM_FEATURE_COUNT = 0;

	int FUN_PARAM_OPERATION_COUNT = 0;

	int FUN_CALL = 15;

	int FUN_CALL__FUNCTION = 0;

	int FUN_CALL__PARAMS = 1;

	int FUN_CALL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	int FUN_CALL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	int OR = 16;

	int OR__LEFT = 0;

	int OR__RIGHT = 1;

	int OR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	int OR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	int AND = 17;

	int AND__LEFT = 0;

	int AND__RIGHT = 1;

	int AND_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	int AND_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	int EQUALITY = 18;

	int EQUALITY__LEFT = 0;

	int EQUALITY__OP = 1;

	int EQUALITY__RIGHT = 2;

	int EQUALITY_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	int EQUALITY_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	int COMPARISON = 19;

	int COMPARISON__LEFT = 0;

	int COMPARISON__OP = 1;

	int COMPARISON__RIGHT = 2;

	int COMPARISON_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	int COMPARISON_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	int PLUS = 20;

	int PLUS__LEFT = 0;

	int PLUS__RIGHT = 1;

	int PLUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	int PLUS_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	int MINUS = 21;

	int MINUS__LEFT = 0;

	int MINUS__RIGHT = 1;

	int MINUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	int MINUS_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	int MUL_OR_DIV = 22;

	int MUL_OR_DIV__LEFT = 0;

	int MUL_OR_DIV__OP = 1;

	int MUL_OR_DIV__RIGHT = 2;

	int MUL_OR_DIV_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	int MUL_OR_DIV_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	int NOT = 23;

	int NOT__EXPRESSION = 0;

	int NOT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	int NOT_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	int INT_CONSTANT = 24;

	int INT_CONSTANT__VALUE = 0;

	int INT_CONSTANT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	int INT_CONSTANT_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	int STRING_CONSTANT = 25;

	int STRING_CONSTANT__VALUE = 0;

	int STRING_CONSTANT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	int STRING_CONSTANT_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	int BOOL_CONSTANT = 26;

	int BOOL_CONSTANT__VALUE = 0;

	int BOOL_CONSTANT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	int BOOL_CONSTANT_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	int VAR_OR_PARAM_REF = 27;

	int VAR_OR_PARAM_REF__VARIABLE = 0;

	int VAR_OR_PARAM_REF_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	int VAR_OR_PARAM_REF_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	int FUN_PARAM_EXP = 28;

	int FUN_PARAM_EXP__EXPR = 0;

	int FUN_PARAM_EXP_FEATURE_COUNT = FUN_PARAM_FEATURE_COUNT + 1;

	int FUN_PARAM_EXP_OPERATION_COUNT = FUN_PARAM_OPERATION_COUNT + 0;

	int FUN_PARAM_CAPTURE = 29;

	int FUN_PARAM_CAPTURE__VARIABLE = 0;

	int FUN_PARAM_CAPTURE_FEATURE_COUNT = FUN_PARAM_FEATURE_COUNT + 1;

	int FUN_PARAM_CAPTURE_OPERATION_COUNT = FUN_PARAM_OPERATION_COUNT + 0;

	int CONTEXT = 30;

	int CONTEXT__VALUES = 0;

	int CONTEXT_FEATURE_COUNT = 1;

	int CONTEXT_OPERATION_COUNT = 0;

	int STRING_TO_VALUE_BINDING_MAP = 31;

	int STRING_TO_VALUE_BINDING_MAP__KEY = 0;

	int STRING_TO_VALUE_BINDING_MAP__VALUE = 1;

	int STRING_TO_VALUE_BINDING_MAP_FEATURE_COUNT = 2;

	int STRING_TO_VALUE_BINDING_MAP_OPERATION_COUNT = 0;

	int VALUE = 32;

	int VALUE_FEATURE_COUNT = 0;

	int VALUE_OPERATION_COUNT = 0;

	int INT_VALUE = 33;

	int INT_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 0;

	int INT_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	int BOOL_VALUE = 34;

	int BOOL_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 0;

	int BOOL_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	int STRING_VALUE = 35;

	int STRING_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 0;

	int STRING_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	EClass getExpressionsModel();

	EReference getExpressionsModel_Statements();

	EClass getStatements();

	EReference getStatements_Elements();

	EClass getAbstractElement();

	EClass getLoop();

	EReference getLoop_Expression();

	EReference getLoop_Body();

	EClass getCondition();

	EReference getCondition_Expression();

	EReference getCondition_Ifz();

	EReference getCondition_Elsez();

	EClass getBlock();

	EReference getBlock_Statements();

	EClass getFunDefinition();

	EReference getFunDefinition_VarNames();

	EAttribute getFunDefinition_Name();

	EClass getInlineFunction();

	EReference getInlineFunction_Expression();

	EClass getComplexFunction();

	EReference getComplexFunction_Body();

	EClass getVarOrParam();

	EAttribute getVarOrParam_Name();

	EClass getParameter();

	EAttribute getParameter_Type();

	EClass getVariable();

	EReference getVariable_Expression();

	EClass getEvalExpression();

	EReference getEvalExpression_Expression();

	EClass getExpression();

	EClass getFunParam();

	EClass getFunCall();

	EReference getFunCall_Function();

	EReference getFunCall_Params();

	EClass getOr();

	EReference getOr_Left();

	EReference getOr_Right();

	EClass getAnd();

	EReference getAnd_Left();

	EReference getAnd_Right();

	EClass getEquality();

	EReference getEquality_Left();

	EAttribute getEquality_Op();

	EReference getEquality_Right();

	EClass getComparison();

	EReference getComparison_Left();

	EAttribute getComparison_Op();

	EReference getComparison_Right();

	EClass getPlus();

	EReference getPlus_Left();

	EReference getPlus_Right();

	EClass getMinus();

	EReference getMinus_Left();

	EReference getMinus_Right();

	EClass getMulOrDiv();

	EReference getMulOrDiv_Left();

	EAttribute getMulOrDiv_Op();

	EReference getMulOrDiv_Right();

	EClass getNot();

	EReference getNot_Expression();

	EClass getIntConstant();

	EAttribute getIntConstant_Value();

	EClass getStringConstant();

	EAttribute getStringConstant_Value();

	EClass getBoolConstant();

	EAttribute getBoolConstant_Value();

	EClass getVarOrParamRef();

	EReference getVarOrParamRef_Variable();

	EClass getFunParamExp();

	EReference getFunParamExp_Expr();

	EClass getFunParamCapture();

	EReference getFunParamCapture_Variable();

	EClass getContext();

	EReference getContext_Values();

	EClass getStringToValueBindingMap();

	EAttribute getStringToValueBindingMap_Key();

	EReference getStringToValueBindingMap_Value();

	EClass getValue();

	EClass getIntValue();

	EClass getBoolValue();

	EClass getStringValue();

	ExpressionsFactory getExpressionsFactory();

	interface Literals {
		EClass EXPRESSIONS_MODEL = eINSTANCE.getExpressionsModel();

		EReference EXPRESSIONS_MODEL__STATEMENTS = eINSTANCE.getExpressionsModel_Statements();

		EClass STATEMENTS = eINSTANCE.getStatements();

		EReference STATEMENTS__ELEMENTS = eINSTANCE.getStatements_Elements();

		EClass ABSTRACT_ELEMENT = eINSTANCE.getAbstractElement();

		EClass LOOP = eINSTANCE.getLoop();

		EReference LOOP__EXPRESSION = eINSTANCE.getLoop_Expression();

		EReference LOOP__BODY = eINSTANCE.getLoop_Body();

		EClass CONDITION = eINSTANCE.getCondition();

		EReference CONDITION__EXPRESSION = eINSTANCE.getCondition_Expression();

		EReference CONDITION__IFZ = eINSTANCE.getCondition_Ifz();

		EReference CONDITION__ELSEZ = eINSTANCE.getCondition_Elsez();

		EClass BLOCK = eINSTANCE.getBlock();

		EReference BLOCK__STATEMENTS = eINSTANCE.getBlock_Statements();

		EClass FUN_DEFINITION = eINSTANCE.getFunDefinition();

		EReference FUN_DEFINITION__VAR_NAMES = eINSTANCE.getFunDefinition_VarNames();

		EAttribute FUN_DEFINITION__NAME = eINSTANCE.getFunDefinition_Name();

		EClass INLINE_FUNCTION = eINSTANCE.getInlineFunction();

		EReference INLINE_FUNCTION__EXPRESSION = eINSTANCE.getInlineFunction_Expression();

		EClass COMPLEX_FUNCTION = eINSTANCE.getComplexFunction();

		EReference COMPLEX_FUNCTION__BODY = eINSTANCE.getComplexFunction_Body();

		EClass VAR_OR_PARAM = eINSTANCE.getVarOrParam();

		EAttribute VAR_OR_PARAM__NAME = eINSTANCE.getVarOrParam_Name();

		EClass PARAMETER = eINSTANCE.getParameter();

		EAttribute PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		EClass VARIABLE = eINSTANCE.getVariable();

		EReference VARIABLE__EXPRESSION = eINSTANCE.getVariable_Expression();

		EClass EVAL_EXPRESSION = eINSTANCE.getEvalExpression();

		EReference EVAL_EXPRESSION__EXPRESSION = eINSTANCE.getEvalExpression_Expression();

		EClass EXPRESSION = eINSTANCE.getExpression();

		EClass FUN_PARAM = eINSTANCE.getFunParam();

		EClass FUN_CALL = eINSTANCE.getFunCall();

		EReference FUN_CALL__FUNCTION = eINSTANCE.getFunCall_Function();

		EReference FUN_CALL__PARAMS = eINSTANCE.getFunCall_Params();

		EClass OR = eINSTANCE.getOr();

		EReference OR__LEFT = eINSTANCE.getOr_Left();

		EReference OR__RIGHT = eINSTANCE.getOr_Right();

		EClass AND = eINSTANCE.getAnd();

		EReference AND__LEFT = eINSTANCE.getAnd_Left();

		EReference AND__RIGHT = eINSTANCE.getAnd_Right();

		EClass EQUALITY = eINSTANCE.getEquality();

		EReference EQUALITY__LEFT = eINSTANCE.getEquality_Left();

		EAttribute EQUALITY__OP = eINSTANCE.getEquality_Op();

		EReference EQUALITY__RIGHT = eINSTANCE.getEquality_Right();

		EClass COMPARISON = eINSTANCE.getComparison();

		EReference COMPARISON__LEFT = eINSTANCE.getComparison_Left();

		EAttribute COMPARISON__OP = eINSTANCE.getComparison_Op();

		EReference COMPARISON__RIGHT = eINSTANCE.getComparison_Right();

		EClass PLUS = eINSTANCE.getPlus();

		EReference PLUS__LEFT = eINSTANCE.getPlus_Left();

		EReference PLUS__RIGHT = eINSTANCE.getPlus_Right();

		EClass MINUS = eINSTANCE.getMinus();

		EReference MINUS__LEFT = eINSTANCE.getMinus_Left();

		EReference MINUS__RIGHT = eINSTANCE.getMinus_Right();

		EClass MUL_OR_DIV = eINSTANCE.getMulOrDiv();

		EReference MUL_OR_DIV__LEFT = eINSTANCE.getMulOrDiv_Left();

		EAttribute MUL_OR_DIV__OP = eINSTANCE.getMulOrDiv_Op();

		EReference MUL_OR_DIV__RIGHT = eINSTANCE.getMulOrDiv_Right();

		EClass NOT = eINSTANCE.getNot();

		EReference NOT__EXPRESSION = eINSTANCE.getNot_Expression();

		EClass INT_CONSTANT = eINSTANCE.getIntConstant();

		EAttribute INT_CONSTANT__VALUE = eINSTANCE.getIntConstant_Value();

		EClass STRING_CONSTANT = eINSTANCE.getStringConstant();

		EAttribute STRING_CONSTANT__VALUE = eINSTANCE.getStringConstant_Value();

		EClass BOOL_CONSTANT = eINSTANCE.getBoolConstant();

		EAttribute BOOL_CONSTANT__VALUE = eINSTANCE.getBoolConstant_Value();

		EClass VAR_OR_PARAM_REF = eINSTANCE.getVarOrParamRef();

		EReference VAR_OR_PARAM_REF__VARIABLE = eINSTANCE.getVarOrParamRef_Variable();

		EClass FUN_PARAM_EXP = eINSTANCE.getFunParamExp();

		EReference FUN_PARAM_EXP__EXPR = eINSTANCE.getFunParamExp_Expr();

		EClass FUN_PARAM_CAPTURE = eINSTANCE.getFunParamCapture();

		EReference FUN_PARAM_CAPTURE__VARIABLE = eINSTANCE.getFunParamCapture_Variable();

		EClass CONTEXT = eINSTANCE.getContext();

		EReference CONTEXT__VALUES = eINSTANCE.getContext_Values();

		EClass STRING_TO_VALUE_BINDING_MAP = eINSTANCE.getStringToValueBindingMap();

		EAttribute STRING_TO_VALUE_BINDING_MAP__KEY = eINSTANCE.getStringToValueBindingMap_Key();

		EReference STRING_TO_VALUE_BINDING_MAP__VALUE = eINSTANCE.getStringToValueBindingMap_Value();

		EClass VALUE = eINSTANCE.getValue();

		EClass INT_VALUE = eINSTANCE.getIntValue();

		EClass BOOL_VALUE = eINSTANCE.getBoolValue();

		EClass STRING_VALUE = eINSTANCE.getStringValue();
	}
}
