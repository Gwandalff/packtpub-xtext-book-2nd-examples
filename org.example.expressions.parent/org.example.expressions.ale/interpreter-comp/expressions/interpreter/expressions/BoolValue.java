package expressions.interpreter.expressions;

import org.eclipse.emf.ecore.EObject;

public interface BoolValue extends EObject, Value {
	boolean isValue();

	void setValue(boolean value);
}
