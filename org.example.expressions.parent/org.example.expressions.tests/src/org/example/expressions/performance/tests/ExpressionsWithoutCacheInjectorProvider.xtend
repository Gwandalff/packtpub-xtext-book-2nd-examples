package org.example.expressions.performance.tests

import com.google.inject.Inject
import org.example.expressions.ExpressionsModelUtil
import org.example.expressions.ExpressionsRuntimeModule
import expressions.AbstractElement
import expressions.ExpressionsModel
import expressions.VarOrParam
import expressions.VarOrParamRef
import org.example.expressions.tests.ExpressionsInjectorProvider
import org.example.expressions.typing.ExpressionsType
import org.example.expressions.typing.ExpressionsTypeComputer

import static extension org.eclipse.xtext.EcoreUtil2.*
import expressions.Variable

/**
 * Injector provider for testing without cache.
 * 
 * @author Lorenzo Bettini
 */
class ExpressionsWithoutCacheInjectorProvider extends ExpressionsInjectorProvider {

	static class ExpressionsModelUtilWithoutCache extends ExpressionsModelUtil {

		override variablesDefinedBefore(AbstractElement containingElement) {
			val allElements = (containingElement.eContainer as ExpressionsModel).statements.elements

			allElements.subList(
				0,
				allElements.indexOf(containingElement)
			).typeSelect(VarOrParam).toSet
		}

	}

	static class ExpressionsTypeComputerWithoutCache extends ExpressionsTypeComputer {

		@Inject extension ExpressionsModelUtil

		override dispatch ExpressionsType typeFor(VarOrParamRef varRef) {
			if (!varRef.isVariableDefinedBefore)
				return null
			else {
				val v = varRef.variable
				if(v instanceof Variable)
					v.expression.typeFor
			}
		}
	}

	override protected createRuntimeModule() {
		new ExpressionsRuntimeModule() {
			def Class<? extends ExpressionsModelUtil> bindExpressionsModelUtil() {
				ExpressionsModelUtilWithoutCache
			}

			def Class<? extends ExpressionsTypeComputer> bindExpressionsTypeComputer() {
				ExpressionsTypeComputerWithoutCache
			}
		}
	}

}
