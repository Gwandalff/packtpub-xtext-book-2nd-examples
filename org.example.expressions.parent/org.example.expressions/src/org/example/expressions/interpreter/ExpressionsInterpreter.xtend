package org.example.expressions.interpreter

import com.google.inject.Inject
import org.eclipse.xtext.util.IResourceScopeCache
import expressions.AbstractElement
import expressions.And
import expressions.BoolConstant
import expressions.Comparison
import expressions.Equality
import expressions.Expression
import expressions.IntConstant
import expressions.Minus
import expressions.MulOrDiv
import expressions.Not
import expressions.Or
import expressions.Plus
import expressions.StringConstant
import org.example.expressions.typing.ExpressionsTypeComputer
import java.util.Map
import expressions.VarOrParamRef
import expressions.FunCall
import java.util.HashMap
import expressions.Variable
import expressions.FunDefinition
import expressions.ExpressionsModel
import org.example.expressions.typing.StringType
import org.example.expressions.typing.BoolType
import org.example.expressions.typing.IntType
import expressions.EvalExpression
import expressions.Condition
import expressions.Loop
import expressions.InlineFunction
import expressions.ComplexFunction
import expressions.Block
import expressions.FunParamCapture
import expressions.FunParamExp

class ExpressionsInterpreter {

	@Inject extension ExpressionsTypeComputer
	@Inject IResourceScopeCache cache

	// CONSTANT
	def dispatch Object interpret(IntConstant e,Map<String, Object> context) {
		e.value
	}
	def dispatch Object interpret(BoolConstant e,Map<String, Object> context) {
		Boolean::parseBoolean(e.value)
	}
	def dispatch Object interpret(StringConstant e,Map<String, Object> context) {
		e.value
	}
	
	// ARITHMETIC
	def dispatch Object interpret(MulOrDiv e,Map<String, Object> context) {
		val left = e.left.interpret(context) as Integer
		val right = e.right.interpret(context) as Integer
		if (e.op == '*')
			left * right
		else
			left / right
	}
	def dispatch Object interpret(Minus e,Map<String, Object> context) {
		(e.left.interpret(context) as Integer) - (e.right.interpret(context) as Integer)
	}
	def dispatch Object interpret(Plus e,Map<String, Object> context) {
		if (e.left.typeFor.isStringType || e.right.typeFor.isStringType)
			e.left.interpret(context).toString + e.right.interpret(context).toString
		else
			(e.left.interpret(context) as Integer) + (e.right.interpret(context) as Integer)
	}
	
	// BOOLEAN
	def dispatch Object interpret(Not e,Map<String, Object> context) {
		!(e.expression.interpret(context) as Boolean)
	}
	def dispatch Object interpret(And e,Map<String, Object> context) {
		(e.left.interpret(context) as Boolean) && (e.right.interpret(context) as Boolean)
	}
	def dispatch Object interpret(Or e,Map<String, Object> context) {
		(e.left.interpret(context) as Boolean) || (e.right.interpret(context) as Boolean)
	}
	
	// COMPARISON
	def dispatch Object interpret(Equality e,Map<String, Object> context) {
		if (e.op == '==')
			e.left.interpret(context) == e.right.interpret(context)
		else
			e.left.interpret(context) != e.right.interpret(context)
	}
	def dispatch Object interpret(Comparison e,Map<String, Object> context) {
		if (e.left.typeFor.isStringType) {
			val left = e.left.interpret(context) as String
			val right = e.right.interpret(context) as String
			
			switch (e.op) {
				case '<': left < right
				case '>': left > right 
				case '>=': left >= right
				case '<=': left <= right
				default: false
			}
		} else {
			val left = e.left.interpret(context) as Integer
			val right = e.right.interpret(context) as Integer
			
			switch (e.op) {
				case '<': left < right
				case '>': left > right 
				case '>=': left >= right
				case '<=': left <= right
				default: false
			}
		}
	}
	
	// VARIABLE AND FUNCTION
	def dispatch Object interpret(VarOrParamRef e,Map<String, Object> context) {
		if(e.variable.typeFor instanceof StringType) return context.get(e.variable.name) as String
		if(e.variable.typeFor instanceof IntType) return context.get(e.variable.name) as Integer
		if(e.variable.typeFor instanceof BoolType) return context.get(e.variable.name) as Boolean
		context.get(e.variable.name)
	}
	
	def dispatch Object interpret(FunCall e,Map<String, Object> context) {
		val newContext = new HashMap<String,Object>()
		val function = e.function
		
		// create the new context with param
		for(var i = 0; i<function.varNames.length; i++){
			newContext.put(function.varNames.get(i).name,e.params.get(i).interpret(context))
		}
		
		// interpret
		var res = null as Object
		if(function instanceof InlineFunction){
			res = function.expression.interpret(newContext)
		}
		if(function instanceof ComplexFunction){
			res = function.body.interpret(newContext)
		}
		
		// update captured value in the caller context
		for(var i = 0; i<e.params.length; i++){
			val param = e.params.get(i)
			if(param instanceof FunParamCapture){
				context.put(param.variable.name,newContext.get(function.varNames.get(i).name))	
			}
		}
		
		return res
	}
	
	def dispatch Object interpret(FunParamCapture e,Map<String, Object> context) {
		context.get(e.variable.name)
	}
	
	def dispatch Object interpret(FunParamExp e,Map<String, Object> context) {
		e.expr.interpret(context)
	}
	
	def dispatch Object interpret(Block e, Map<String, Object> context) {
		var res = null as Object
		for(var i = 0; i < e.statements.elements.length; i++){
			res = interpret(e.statements.elements.get(i),context)
		}
		return res
	}
	
	def dispatch Object interpret(Expression e,Map<String, Object> context) {
		throw new Exception("AST Node not dispatched")
	}

	def dispatch Object interpret(AbstractElement e, Map<String, Object> context) {
		if(e instanceof Variable){
			val value = (e as Variable).expression.interpret(context)
			context.put((e as Variable).name, value)
			return value
		}
		if(e instanceof FunDefinition){
			return null
		}
		if(e instanceof EvalExpression){
			return e.expression.interpret(context)
		}
		if(e instanceof Condition){
			var cond = e.expression.interpret(context) as Boolean
			if(cond){
				e.ifz.interpret(context)
			}else if(e.elsez !== null){
				e.elsez.interpret(context)
			}
			return null
		}
		if(e instanceof Loop){
			while(e.expression.interpret(context) as Boolean){
				e.body.interpret(context)
			}
			return null
		}
	}
	
	def dispatch Object interpret(ExpressionsModel e, Map<String, Object> context) {
		var res = null as Object
		for(var i = 0; i < e.statements.elements.length; i++){
			res = interpret(e.statements.elements.get(i),context)
		}
		return res
	}
}
