package expressions.interpreter.expressions;

import org.eclipse.emf.ecore.EObject;

public interface IntConstant extends EObject, Expression {
	int getValue();

	void setValue(int value);

	Value interpret(Context context);
}
