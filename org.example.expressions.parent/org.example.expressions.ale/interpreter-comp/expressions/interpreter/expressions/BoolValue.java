package expressions.interpreter.expressions;

import java.lang.String;
import org.eclipse.emf.ecore.EObject;

public interface BoolValue extends EObject, Value {
	boolean isValue();

	void setValue(boolean value);

	String toString();
}
