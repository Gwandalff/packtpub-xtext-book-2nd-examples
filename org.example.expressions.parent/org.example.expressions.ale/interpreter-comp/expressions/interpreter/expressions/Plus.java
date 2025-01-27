package expressions.interpreter.expressions;

import org.eclipse.emf.ecore.EObject;

public interface Plus extends EObject, Expression {
	Expression getLeft();

	void setLeft(Expression value);

	Expression getRight();

	void setRight(Expression value);

	Value interpret(Context context);
}
