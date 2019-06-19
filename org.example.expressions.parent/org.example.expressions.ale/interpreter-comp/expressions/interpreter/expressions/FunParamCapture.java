package expressions.interpreter.expressions;

import org.eclipse.emf.ecore.EObject;

public interface FunParamCapture extends EObject, FunParam {
	VarOrParam getVariable();

	void setVariable(VarOrParam value);

	Value interpret(Context context);
}
