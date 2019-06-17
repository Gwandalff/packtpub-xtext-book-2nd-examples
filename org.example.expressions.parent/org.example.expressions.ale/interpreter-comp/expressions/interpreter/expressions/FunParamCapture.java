package expressions.interpreter.expressions;

import org.eclipse.emf.ecore.EObject;

public interface FunParamCapture extends EObject, FunParam {
	Variable getVariable();

	void setVariable(Variable value);
}
