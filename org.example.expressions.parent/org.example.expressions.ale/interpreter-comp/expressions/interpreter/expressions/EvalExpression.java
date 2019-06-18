package expressions.interpreter.expressions;

import org.eclipse.emf.ecore.EObject;

public interface EvalExpression extends EObject, AbstractElement {
	Expression getExpression();

	void setExpression(Expression value);

	Value interpret();
}
