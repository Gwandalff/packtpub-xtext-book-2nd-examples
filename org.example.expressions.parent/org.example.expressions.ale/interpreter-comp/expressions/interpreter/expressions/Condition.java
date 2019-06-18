package expressions.interpreter.expressions;

import org.eclipse.emf.ecore.EObject;

public interface Condition extends EObject, AbstractElement {
	Expression getExpression();

	void setExpression(Expression value);

	Block getIfz();

	void setIfz(Block value);

	Block getElsez();

	void setElsez(Block value);

	Value interpret();
}
