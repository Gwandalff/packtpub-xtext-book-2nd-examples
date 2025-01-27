package expressions.interpreter.expressions;

import org.eclipse.emf.ecore.EObject;

public interface Not extends EObject, Expression {
	Expression getExpression();

	void setExpression(Expression value);

	Value interpret(Context context);
}
