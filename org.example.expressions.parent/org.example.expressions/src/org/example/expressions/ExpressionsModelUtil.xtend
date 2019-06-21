package org.example.expressions

import com.google.inject.Inject
import expressions.AbstractElement
import expressions.Block
import expressions.ComplexFunction
import expressions.Expression
import expressions.FunDefinition
import expressions.InlineFunction
import expressions.Statements
import expressions.VarOrParam
import expressions.VarOrParamRef
import org.eclipse.xtext.util.IResourceScopeCache

import static extension org.eclipse.xtext.EcoreUtil2.*
import java.util.HashSet
import java.util.Set

class ExpressionsModelUtil {

	@Inject IResourceScopeCache cache

	def isVariableDefinedBefore(VarOrParamRef varRef) {
		varRef.variablesDefinedBefore.contains(varRef.variable)
	}

	def variablesDefinedBefore(Expression e) {
		val fd = e.getContainerOfType(FunDefinition) as FunDefinition
		if (fd !== null){
			if(fd instanceof InlineFunction)
				return fd.varNames
			if(fd instanceof ComplexFunction){
				val set = e.getContainerOfType(AbstractElement).variablesDefinedInFunction
				set.addAll(fd.varNames)
				return set
			}
		} else {
			val blk = e.getContainerOfType(Block) as Block
			if(blk !== null){
				blk.getContainerOfType(AbstractElement).getContainerOfType(AbstractElement).variablesDefinedBefore
			} else {
				e.getContainerOfType(AbstractElement).variablesDefinedBefore	
			}
		}
			
	}

	def variablesDefinedBefore(AbstractElement containingElement) {
		cache.get(containingElement, containingElement.eResource) [
			val allElements = (containingElement.eContainer as Statements).elements

			allElements.subList(
				0,
				allElements.indexOf(containingElement)
			).typeSelect(VarOrParam).toSet
		]
	}
	
	def variablesDefinedInFunction(AbstractElement containingElement) {
		cache.get(containingElement, containingElement.eResource) [
			val allElements = (containingElement.eContainer as Statements).elements
			val statementsContainer = containingElement.eContainer.eContainer.eContainer as AbstractElement
			var topContext = new HashSet<VarOrParam>
			if(statementsContainer !== null && !(statementsContainer instanceof ComplexFunction)){
				topContext = statementsContainer.variablesDefinedInFunction as HashSet<VarOrParam>
			}

			topContext.addAll(allElements.subList(
				0,
				allElements.indexOf(containingElement)
			).typeSelect(VarOrParam).toSet)
			topContext
		]
	}
}
