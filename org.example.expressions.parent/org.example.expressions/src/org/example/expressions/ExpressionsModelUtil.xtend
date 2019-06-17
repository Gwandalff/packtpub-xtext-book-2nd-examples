package org.example.expressions

import org.example.expressions.model.expressions.AbstractElement
import org.example.expressions.model.expressions.Expression
import org.example.expressions.model.expressions.ExpressionsModel

import static extension org.eclipse.xtext.EcoreUtil2.*
import com.google.inject.Inject
import org.eclipse.xtext.util.IResourceScopeCache
import org.example.expressions.model.expressions.VarOrParam
import org.example.expressions.model.expressions.VarOrParamRef
import org.example.expressions.model.expressions.FunDefinition
import org.example.expressions.model.expressions.InlineFunction
import org.example.expressions.model.expressions.ComplexFunction
import org.example.expressions.model.expressions.Statements
import org.example.expressions.model.expressions.Block

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
				val set = e.getContainerOfType(AbstractElement).variablesDefinedBefore
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
}
