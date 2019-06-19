package expressions.interpreter.expressions;

import org.eclipse.emf.ecore.EObject;

public interface FunParam extends EObject {
	Value interpret(Context context);
}
