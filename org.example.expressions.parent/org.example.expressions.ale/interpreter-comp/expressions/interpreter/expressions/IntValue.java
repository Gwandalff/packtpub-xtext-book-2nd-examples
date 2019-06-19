package expressions.interpreter.expressions;

import java.lang.String;
import org.eclipse.emf.ecore.EObject;

public interface IntValue extends EObject, Value {
	int getValue();

	void setValue(int value);

	String toString();
}
