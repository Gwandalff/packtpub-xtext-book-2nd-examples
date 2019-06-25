package org.example.expressions.interpreter

import com.google.inject.Inject
import expressions.AbstractElement
import expressions.And
import expressions.Block
import expressions.BoolConstant
import expressions.Comparison
import expressions.ComplexFunction
import expressions.Condition
import expressions.Equality
import expressions.EvalExpression
import expressions.Expression
import expressions.ExpressionsFactory
import expressions.ExpressionsModel
import expressions.FunCall
import expressions.FunDefinition
import expressions.FunParamExp
import expressions.InlineFunction
import expressions.IntConstant
import expressions.Loop
import expressions.Minus
import expressions.MulOrDiv
import expressions.Not
import expressions.Or
import expressions.Plus
import expressions.Statements
import expressions.StringConstant
import expressions.VarOrParamRef
import expressions.Variable
import java.util.ArrayList
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil
import org.example.expressions.typing.ExpressionsTypeComputer

class PartialEvaluator {

	@Inject extension ExpressionsTypeComputer
//	@Inject IResourceScopeCache cache

	// CONSTANT : Nothing to do
	def dispatch EObject partialEvaluation(IntConstant    e,List<AbstractElement> context) {e}
	def dispatch EObject partialEvaluation(BoolConstant   e,List<AbstractElement> context) {e}
	def dispatch EObject partialEvaluation(StringConstant e,List<AbstractElement> context) {e}
	
	// ARITHMETIC
	def dispatch EObject partialEvaluation(MulOrDiv e,List<AbstractElement> context) {
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
	def dispatch EObject partialEvaluation(Minus e,List<AbstractElement> context) {
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
		e
	}
	def dispatch EObject partialEvaluation(Plus e,List<AbstractElement> context) {
		e.left  = e.left.partialEvaluation(context) as Expression
		e.right = e.right.partialEvaluation(context) as Expression
		
		if(e.left instanceof IntConstant && e.right instanceof IntConstant){
			val out = ExpressionsFactory.eINSTANCE.createIntConstant
			val value = (e.left as IntConstant).value + (e.right as IntConstant).value
			out.value = value
			return out
		}
		e
	}
	
	// BOOLEAN
	def dispatch EObject partialEvaluation(Not e,List<AbstractElement> context) {
		e.expression = e.expression.partialEvaluation(context) as Expression

		if(e.expression instanceof Not){
			(e.expression as Not).expression
		}
		e
	}
	def dispatch EObject partialEvaluation(And e,List<AbstractElement> context) {
		e.left = e.left.partialEvaluation(context) as Expression
		e.right = e.right.partialEvaluation(context) as Expression
		if((e.left instanceof BoolConstant && !Boolean::parseBoolean((e.left as BoolConstant).value)) ||
			(e.right instanceof BoolConstant && !Boolean::parseBoolean((e.right as BoolConstant).value))
		){
			val out = ExpressionsFactory.eINSTANCE.createBoolConstant
			val value = 'false'
			out.value = value
			return out
		}
		e
	}
	def dispatch EObject partialEvaluation(Or e,List<AbstractElement> context) {
		e.left = e.left.partialEvaluation(context) as Expression
		e.right = e.right.partialEvaluation(context) as Expression
		if((e.left instanceof BoolConstant && Boolean::parseBoolean((e.left as BoolConstant).value)) ||
			(e.right instanceof BoolConstant && Boolean::parseBoolean((e.right as BoolConstant).value))
		){
			val out = ExpressionsFactory.eINSTANCE.createBoolConstant
			val value = 'true'
			out.value = value
			return out
		}
		e
	}
	
	// COMPARISON
	def dispatch EObject partialEvaluation(Equality e,List<AbstractElement> context) {
		e.left = e.left.partialEvaluation(context) as Expression
		e.right = e.right.partialEvaluation(context) as Expression
		e
	}
	def dispatch EObject partialEvaluation(Comparison e,List<AbstractElement> context) {
		e.left = e.left.partialEvaluation(context) as Expression
		e.right = e.right.partialEvaluation(context) as Expression
		e
	}
	
	// VARIABLE AND FUNCTION
	def dispatch EObject partialEvaluation(VarOrParamRef e,List<AbstractElement> context) {
		e
	}
	
	def dispatch EObject partialEvaluation(FunCall e,List<AbstractElement> context) {
		val function = e.function
		
		// create the new context with param
		for(var i = 0; i<function.varNames.length; i++){
			val param = e.params.get(i)
			if(param instanceof FunParamExp){
				val line = ExpressionsFactory.eINSTANCE.createVariable
				line.name = function.varNames.get(i).name
				line.expression = param.expr.partialEvaluation(context) as Expression
				context.add(line)
			}
		}
		
		// partialEvaluation
		if(function instanceof InlineFunction){
			function.expression
		}
		if(function instanceof ComplexFunction){
			val block = function.body
			context.addAll(block.statements.elements.subList(0,block.statements.elements.length-1))
			if(block.statements.elements.last instanceof EvalExpression){
				(block.statements.elements.last as EvalExpression).expression
			}
			if(block.statements.elements.last instanceof Variable){
				(block.statements.elements.last as Variable).expression
			}
		}
	}
	
	def dispatch EObject partialEvaluation(Block e, List<AbstractElement> context) {
		val evalStatements = ExpressionsFactory.eINSTANCE.createStatements()
		for(var i = 0; i < e.statements.elements.length; i++){
			val newContext = new ArrayList<AbstractElement>()
			val partialEvaluated = e.statements.elements.get(i).partialEvaluation(newContext) as AbstractElement
			evalStatements.elements.addAll(newContext)
			if(partialEvaluated !== null) evalStatements.elements.add(partialEvaluated)
		}
		e.statements = evalStatements
		e
	}
	
	def dispatch EObject partialEvaluation(Expression e,List<AbstractElement> context) {
		throw new Exception("AST Node not dispatched")
	}
	
	def dispatch EObject partialEvaluation(ExpressionsModel e, List<AbstractElement> context) {
		val evalStatements = ExpressionsFactory.eINSTANCE.createStatements()
		for(var i = 0; i < e.statements.elements.length; i++){
			val newContext = new ArrayList<AbstractElement>()
			val partialEvaluated = e.statements.elements.get(i).partialEvaluation(newContext) as AbstractElement
			evalStatements.elements.addAll(newContext)
			if(partialEvaluated !== null) evalStatements.elements.add(partialEvaluated)
		}
		e.statements = evalStatements
		e
	}
	
	def int findInitValue(Loop e, String varname){
		var initFind = false
		var before = true
		var init = 0
		
		for (element : (e.eContainer as Statements).elements) {
			if(element == e) before = false
			if(before && element instanceof Variable && (element as Variable).name == varname){
				val variable = (element as Variable)
				if(variable.expression instanceof IntConstant){
					init = (variable.expression as IntConstant).value
					initFind = true
				}
			}
		}
		if(!initFind){
			throw new Exception()
		}
		init
	}
	
	def int findStepValue(Loop e, String varname){
		var step = 0
		for(element : e.body.statements.elements){
			if(element instanceof Variable && (element as Variable).name == varname){
				val exp = (element as Variable).expression
				
				if(exp instanceof Plus){
					val plus = exp as Plus
					
					if(plus.left  instanceof IntConstant && 
						plus.right instanceof VarOrParamRef && 
						(plus.right as VarOrParamRef).variable.name == varname
					){
						step += (plus.left as IntConstant).value
					}
					if(plus.right  instanceof IntConstant && 
						plus.left instanceof VarOrParamRef && 
						(plus.left as VarOrParamRef).variable.name == varname
					){
						step += (plus.right as IntConstant).value
					}
				}
				if(exp instanceof Minus){
					val minus = exp as Minus
					
					if(minus.right  instanceof IntConstant && 
						minus.left instanceof VarOrParamRef && 
						(minus.left as VarOrParamRef).variable.name == varname
					){
						step += -(minus.right as IntConstant).value
					}
				}
			}
		}
		if(step == 0) throw new Exception
		
		step
	}
	
	def dispatch EObject partialEvaluation(Loop e, List<AbstractElement> context) {
		e.expression = e.expression.partialEvaluation(context) as Expression
		
		// if always false -> never used
		if(e.expression instanceof BoolConstant && !Boolean::parseBoolean((e.expression as BoolConstant).value)){
			return null
		}
		
		e.body.partialEvaluation(context)
		
		if(e.expression instanceof Comparison){
			val comp = e.expression as Comparison
			
			var varname = ""
			var threshold = 0
			var op = ""
			
			// if the var is compared to an int constant we try to find the number of loop
			// else we can't so no optimization
			if(comp.left instanceof IntConstant && comp.right instanceof VarOrParamRef){
				varname = (comp.right as VarOrParamRef).variable.name
				threshold = (comp.left as IntConstant).value
				if(comp.op == "<") {
				 	op = ">"	
				}
				if(comp.op == "<=") {
					op = ">="	
				}
				if(comp.op == ">") {
					op = "<"
				}
				if(comp.op == ">=") {
					op = "<="
				}
			} else if(comp.left instanceof VarOrParamRef && comp.right instanceof IntConstant){
				varname = (comp.left as VarOrParamRef).variable.name
				threshold = (comp.right as IntConstant).value
				op = comp.op
			} else {
				return e
			}
			
			try{
				var init = findInitValue(e, varname)
				var step = findStepValue(e, varname)
				val max = 10
				var n = max
				if(comp.op == "<") {
					while(n*step >= threshold-init){n--}
				}
				if(comp.op == "<=") {
					while(n*step >  threshold-init){n--}
				}
				if(comp.op == ">") {
					while(n*step <= threshold-init){n--}
				}
				if(comp.op == ">=") {
					while(n*step <  threshold-init){n--}
				}
				n++
				
				if(n<1 || n>max) return null
				
				val copier = new EcoreUtil.Copier()
				for(var i = 0; i < n; i++){
					val tempBlock = copier.copy(e.body)
					val varValue = ExpressionsFactory.eINSTANCE.createIntConstant()
					varValue.value = init + (i*step)
					tempBlock.replace(varname, varValue)
				}
				
			} catch (Exception ex){
				return e
			}
			return null
		}
		e
	}
	
	def dispatch EObject partialEvaluation(Condition e, List<AbstractElement> context) {
		e.expression = e.expression.partialEvaluation(context) as Expression
		if(e.expression instanceof BoolConstant){
			if(Boolean::parseBoolean((e.expression as BoolConstant).value)){
				context.addAll((e.ifz.partialEvaluation(context) as Block).statements.elements)
				return null
			} else {
				if(e.elsez !== null)context.addAll((e.elsez.partialEvaluation(context) as Block).statements.elements)
				return null
			}
		}
		e.ifz.partialEvaluation(context)
		if(e.elsez !== null){
			e.elsez.partialEvaluation(context)
		}
		e
	}
	
	def dispatch EObject partialEvaluation(EvalExpression e, List<AbstractElement> context) {
		e.expression = e.expression.partialEvaluation(context) as Expression
		e
	}
	
	def dispatch EObject partialEvaluation(InlineFunction e, List<AbstractElement> context) {
		e.expression = e.expression.partialEvaluation(context) as Expression
		e
	}
	
	def dispatch EObject partialEvaluation(ComplexFunction e, List<AbstractElement> context) {
		val block = e.body.partialEvaluation(context) as Block
		context.addAll(block.statements.elements.subList(0,block.statements.elements.length-1))
		if(block.statements.elements.last instanceof EvalExpression){
			(block.statements.elements.last as EvalExpression).expression
		}
		if(block.statements.elements.last instanceof Variable){
			(block.statements.elements.last as Variable).expression
		}
		e
	}
	
	def dispatch EObject partialEvaluation(Variable e, List<AbstractElement> context) {
		e.expression = e.expression.partialEvaluation(context) as Expression
		e
	}
	
	// Dispatch for the variable replacement
	
	def dispatch Expression replace(MulOrDiv e, String varname, Expression replacement) {
		var left = e.left.replace(varname,replacement)
		var right = e.right.replace(varname,replacement)
		if(left  !== null) e.left  = left
		if(right !== null) e.right = right
		return null
	}
	def dispatch Expression replace(Minus e, String varname, Expression replacement) {
		var left = e.left.replace(varname,replacement)
		var right = e.right.replace(varname,replacement)
		if(left  !== null) e.left  = left
		if(right !== null) e.right = right
		return null
	}
	def dispatch Expression replace(Plus e, String varname, Expression replacement) {
		var left = e.left.replace(varname,replacement)
		var right = e.right.replace(varname,replacement)
		if(left  !== null) e.left  = left
		if(right !== null) e.right = right
		return null
	}
	
	// BOOLEAN
	def dispatch Expression replace(Not e, String varname, Expression replacement) {
		var exp = e.expression.replace(varname,replacement)
		if(exp  !== null) e.expression  = exp
		return null
	}
	def dispatch Expression replace(And e, String varname, Expression replacement) {
		var left = e.left.replace(varname,replacement)
		var right = e.right.replace(varname,replacement)
		if(left  !== null) e.left  = left
		if(right !== null) e.right = right
		return null
	}
	def dispatch Expression replace(Or e, String varname, Expression replacement) {
		var left = e.left.replace(varname,replacement)
		var right = e.right.replace(varname,replacement)
		if(left  !== null) e.left  = left
		if(right !== null) e.right = right
		return null
	}
	
	// COMPARISON
	def dispatch Expression replace(Equality e, String varname, Expression replacement) {
		var left = e.left.replace(varname,replacement)
		var right = e.right.replace(varname,replacement)
		if(left  !== null) e.left  = left
		if(right !== null) e.right = right
		return null
	}
	def dispatch Expression replace(Comparison e, String varname, Expression replacement) {
		var left = e.left.replace(varname,replacement)
		var right = e.right.replace(varname,replacement)
		if(left  !== null) e.left  = left
		if(right !== null) e.right = right
		return null
	}
	
	// VARIABLE AND FUNCTION
	def dispatch Expression replace(VarOrParamRef e, String varname, Expression replacement) {
		if(e.variable.name == varname)return replacement
		return null
	}
	
	def dispatch Expression replace(FunCall e, String varname, Expression replacement) {
		for(param : e.params){
			if(param instanceof FunParamExp){
				param.expr.replace(varname, replacement)
			}
		}
		return null
	}
	
	def dispatch Expression replace(Block e, String varname, Expression replacement) {
		for (element : e.statements.elements) {
			element.replace(varname, replacement)	
		}
		return null
	}
	
	def dispatch Expression replace(Expression e, String varname, Expression replacement) {
		throw new Exception("AST Node not dispatched")
	}
	
	def dispatch Expression replace(ExpressionsModel e, String varname, Expression replacement) {
		for (element : e.statements.elements) {
			element.replace(varname, replacement)	
		}
		return null
	}
	
	def dispatch Expression replace(Loop e, String varname, Expression replacement) {
		e.expression.replace(varname, replacement)
		e.body.replace(varname, replacement)
		return null
	}
	
	def dispatch Expression replace(Condition e, String varname, Expression replacement) {
		e.expression.replace(varname, replacement)
		e.ifz.replace(varname, replacement)
		if(e.elsez !== null) e.elsez.replace(varname, replacement)
		return null
	}
	
	def dispatch Expression replace(EvalExpression e, String varname, Expression replacement) {
		e.expression.replace(varname, replacement)
		return null
	}
	
	def dispatch Expression replace(FunDefinition e, String varname, Expression replacement) {
		return null
	}
	
	def dispatch Expression replace(Variable e, String varname, Expression replacement) {
		e.expression.replace(varname, replacement)
		return null
	}
}
