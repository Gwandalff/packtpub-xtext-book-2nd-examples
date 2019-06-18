package expressions.interpreter.expressions;

import java.lang.String;
import org.eclipse.emf.ecore.EObject;

public interface Comparison extends EObject, Expression {
	String getOp();

	void setOp(String value);

	Expression getLeft();

	void setLeft(Expression value);

	Expression getRight();

	void setRight(Expression value);

	Value interpret(Context context);
}
