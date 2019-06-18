package expressions.interpreter.expressions;

import org.eclipse.emf.ecore.EObject;

public interface Expression extends EObject {
	Value interpret(Context context);
}
