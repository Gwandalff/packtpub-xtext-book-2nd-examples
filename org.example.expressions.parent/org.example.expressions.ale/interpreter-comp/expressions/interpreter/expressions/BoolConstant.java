package expressions.interpreter.expressions;

import java.lang.String;
import org.eclipse.emf.ecore.EObject;

public interface BoolConstant extends EObject, Expression {
	String getValue();

	void setValue(String value);

	Value interpret(Context context);
}
