package expressions.interpreter.expressions;

import org.eclipse.emf.ecore.EObject;

public interface Variable extends EObject, AbstractElement, VarOrParam {
	Expression getExpression();

	void setExpression(Expression value);
}
