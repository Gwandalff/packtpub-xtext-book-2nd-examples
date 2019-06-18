package expressions.interpreter.expressions;

import org.eclipse.emf.ecore.EObject;

public interface VarOrParamRef extends EObject, Expression {
	VarOrParam getVariable();

	void setVariable(VarOrParam value);

	Value interpret(Context context);
}
