/*
 * generated by Xtext 2.10.0
 */
package org.example.expressions.ui.contentassist

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import org.example.expressions.ExpressionsModelUtil
import org.example.expressions.model.expressions.Expression

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
class ExpressionsProposalProvider extends AbstractExpressionsProposalProvider {
	@Inject extension ExpressionsModelUtil

	override completeAtomic_Variable(EObject elem, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		if (elem instanceof Expression)
			elem.variablesDefinedBefore.forEach[
				variable |
				acceptor.accept(
					createCompletionProposal(
						variable.name, variable.name + " - Variable", null, context
					)
				)
			]
	}
}
