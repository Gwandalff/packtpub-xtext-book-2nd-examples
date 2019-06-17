package expressions.interpreter.expressions;

import org.eclipse.emf.ecore.EObject;

public interface Loop extends EObject, AbstractElement {
	Expression getExpression();

	void setExpression(Expression value);

	Block getBody();

	void setBody(Block value);
}
