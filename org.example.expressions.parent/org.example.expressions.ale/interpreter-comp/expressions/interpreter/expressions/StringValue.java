package expressions.interpreter.expressions;

import java.lang.String;
import org.eclipse.emf.ecore.EObject;

public interface StringValue extends EObject, Value {
	String getValue();

	void setValue(String value);

	String toString();
}
