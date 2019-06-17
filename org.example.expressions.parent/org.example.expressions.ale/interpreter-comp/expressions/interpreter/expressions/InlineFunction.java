package expressions.interpreter.expressions;

import org.eclipse.emf.ecore.EObject;

public interface InlineFunction extends EObject, FunDefinition {
	Expression getExpression();

	void setExpression(Expression value);
}
