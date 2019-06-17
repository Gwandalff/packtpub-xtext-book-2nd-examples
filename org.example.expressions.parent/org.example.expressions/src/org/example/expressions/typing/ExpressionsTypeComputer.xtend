package org.example.expressions.typing

import com.google.inject.Inject
import org.eclipse.xtext.util.IResourceScopeCache
import org.example.expressions.ExpressionsModelUtil
import org.example.expressions.model.expressions.And
import org.example.expressions.model.expressions.BoolConstant
import org.example.expressions.model.expressions.Comparison
import org.example.expressions.model.expressions.Equality
import org.example.expressions.model.expressions.Expression
import org.example.expressions.model.expressions.IntConstant
import org.example.expressions.model.expressions.Minus
import org.example.expressions.model.expressions.MulOrDiv
import org.example.expressions.model.expressions.Not
import org.example.expressions.model.expressions.Or
import org.example.expressions.model.expressions.Plus
import org.example.expressions.model.expressions.StringConstant
import org.example.expressions.model.expressions.VarOrParamRef
import org.example.expressions.model.expressions.VarOrParam
import org.example.expressions.model.expressions.Variable
import org.example.expressions.model.expressions.Parameter

class ExpressionsTypeComputer {
	public static val STRING_TYPE = new StringType
	public static val INT_TYPE = new IntType
	public static val BOOL_TYPE = new BoolType

	@Inject extension ExpressionsModelUtil

	@Inject IResourceScopeCache cache

	def isStringType(ExpressionsType type) {
		type === STRING_TYPE
	}

	def isIntType(ExpressionsType type) {
		type === INT_TYPE
	}

	def isBoolType(ExpressionsType type) {
		type === BOOL_TYPE
	}

	def dispatch ExpressionsType typeFor(Expression e) {
		switch (e) {
			StringConstant: STRING_TYPE
			IntConstant: INT_TYPE
			BoolConstant: BOOL_TYPE
			Not: BOOL_TYPE
			MulOrDiv: INT_TYPE
			Minus: INT_TYPE
			Comparison: BOOL_TYPE
			Equality: BOOL_TYPE
			And: BOOL_TYPE
			Or: BOOL_TYPE
		}
	}

	def dispatch ExpressionsType typeFor(Plus e) {
		val leftType = e.left.typeFor
		val rightType = e.right?.typeFor
		if (leftType.isStringType || rightType.isStringType)
			STRING_TYPE
		else
			INT_TYPE
	}

	def dispatch ExpressionsType typeFor(VarOrParamRef varRef) {
		if (varRef.variable == null || 
				!(varRef.variablesDefinedBefore.contains(varRef.variable)))
			return null
		else
			return varRef.variable.typeFor
	}
	
	def dispatch ExpressionsType typeFor(VarOrParam varOrParam) {
		switch(varOrParam){
			Variable: (varOrParam as Variable).typeFor
			Parameter: (varOrParam as Parameter).typeFor
		}
	}
	
	def dispatch ExpressionsType typeFor(Variable variable) {
		variable?.expression?.typeFor
	}
	
	def dispatch ExpressionsType typeFor(Parameter parameter) {
		if(parameter.type == "String") return STRING_TYPE
		if(parameter.type == "bool") return BOOL_TYPE
		if(parameter.type == "int") return INT_TYPE
		return null
	}
}
