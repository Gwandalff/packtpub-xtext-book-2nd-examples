package org.example.expressions.interpreter

import com.google.inject.Inject
import org.eclipse.xtext.util.IResourceScopeCache
import expressions.*
import expressions.impl.*
import java.util.Map
import org.example.expressions.typing.ExpressionsTypeComputer
import java.util.HashMap

class PartialEvaluator {

	@Inject extension ExpressionsTypeComputer
	@Inject IResourceScopeCache cache

	// CONSTANT : Nothing to do
	def dispatch Object partialEvaluation(IntConstant    e,Map<String, Object> context) {e}
	def dispatch Object partialEvaluation(BoolConstant   e,Map<String, Object> context) {e}
	def dispatch Object partialEvaluation(StringConstant e,Map<String, Object> context) {e}
	
	// ARITHMETIC
	def dispatch Object partialEvaluation(MulOrDiv e,Map<String, Object> context) {
		e.left  = e.left.partialEvaluation(context) as Expression
		e.right = e.right.partialEvaluation(context) as Expression
		
		if(e.left instanceof IntConstant && (e.left as IntConstant).value == 0){
			val zero = ExpressionsFactory.eINSTANCE.createIntConstant
			return zero
		}
		
		if(e.op == "*"){
			if((e.left instanceof IntConstant && (e.left as IntConstant).value == 1)
				|| e.right instanceof IntConstant && (e.right as IntConstant).value == 1
			){
				val one = ExpressionsFactory.eINSTANCE.createIntConstant
				one.value = 1
				return one
			}
			if(e.left instanceof IntConstant && e.right instanceof IntConstant){
				val out = ExpressionsFactory.eINSTANCE.createIntConstant
				val value = (e.left as IntConstant).value * (e.right as IntConstant).value
				out.value = value
				return out
			}
		} else {
			if(e.left instanceof IntConstant && e.right instanceof IntConstant){
				val out = ExpressionsFactory.eINSTANCE.createIntConstant
				val value = (e.left as IntConstant).value / (e.right as IntConstant).value
				out.value = value
				return out
			}
		}
		e
	}
	def dispatch Object partialEvaluation(Minus e,Map<String, Object> context) {
		e.left  = e.left.partialEvaluation(context) as Expression
		e.right = e.right.partialEvaluation(context) as Expression
		
		if(e.right instanceof IntConstant && (e.right as IntConstant).value == 0){
			return e.left
		}
		if(e.left instanceof IntConstant && e.right instanceof IntConstant){
			val out = ExpressionsFactory.eINSTANCE.createIntConstant
			val value = (e.left as IntConstant).value - (e.right as IntConstant).value
			out.value = value
			return out
		}
		
	}
	def dispatch Object partialEvaluation(Plus e,Map<String, Object> context) {
		e.left  = e.left.partialEvaluation(context) as Expression
		e.right = e.right.partialEvaluation(context) as Expression
		
		if(e.left instanceof IntConstant && e.right instanceof IntConstant){
			val out = ExpressionsFactory.eINSTANCE.createIntConstant
			val value = (e.left as IntConstant).value - (e.right as IntConstant).value
			out.value = value
			return out
		}
	}
	
	// BOOLEAN
	def dispatch Object partialEvaluation(Not e,Map<String, Object> context) {
		
	}
	def dispatch Object partialEvaluation(And e,Map<String, Object> context) {
		
	}
	def dispatch Object partialEvaluation(Or e,Map<String, Object> context) {
		
	}
	
	// COMPARISON
	def dispatch Object partialEvaluation(Equality e,Map<String, Object> context) {
	
	}
	def dispatch Object partialEvaluation(Comparison e,Map<String, Object> context) {
		
	}
	
	// VARIABLE AND FUNCTION
	def dispatch Object partialEvaluation(VarOrParamRef e,Map<String, Object> context) {
		
	}
	
	def dispatch Object partialEvaluation(FunCall e,Map<String, Object> context) {
		val newContext = new HashMap<String,Object>()
		val function = e.function
		
		// create the new context with param
		for(var i = 0; i<function.varNames.length; i++){
			newContext.put(function.varNames.get(i).name,e.params.get(i).partialEvaluation(context))
		}
		
		// partialEvaluation
		if(function instanceof InlineFunction){
			function.expression.partialEvaluation(newContext)
		}
		if(function instanceof ComplexFunction){
			function.body.partialEvaluation(newContext)
		}
		
		// update captured value in the caller context
		for(var i = 0; i<e.params.length; i++){
			val param = e.params.get(i)
			if(param instanceof FunParamCapture){
				context.put(param.variable.name,newContext.get(function.varNames.get(i).name))	
			}
		}
	}
	
	def dispatch Object partialEvaluation(FunParamCapture e,Map<String, Object> context) {
		
	}
	
	def dispatch Object partialEvaluation(FunParamExp e,Map<String, Object> context) {
		
	}
	
	def dispatch Object partialEvaluation(Block e, Map<String, Object> context) {

	}
	
	def dispatch Object partialEvaluation(Expression e,Map<String, Object> context) {
		throw new Exception("AST Node not dispatched")
	}
	
	def dispatch Object partialEvaluation(ExpressionsModel e, Map<String, Object> context) {
		val evalStatements = ExpressionsFactory.eINSTANCE.createStatements()
		for(var i = 0; i < e.statements.elements.length; i++){
			evalStatements.elements.add(i,partialEvaluation(e.statements.elements.get(i),context) as AbstractElement)
		}
		e.statements = evalStatements
		e
	}
	
	def dispatch Object partialEvaluation(Loop e, Map<String, Object> context) {
		
	}
	
	def dispatch Object partialEvaluation(Condition e, Map<String, Object> context) {
		
	}
	def dispatch Object partialEvaluation(EvalExpression e, Map<String, Object> context) {
		
	}
	def dispatch Object partialEvaluation(FunDefinition e, Map<String, Object> context) {

	}
	
	def dispatch Object partialEvaluation(Variable e, Map<String, Object> context) {
		
	}
}
