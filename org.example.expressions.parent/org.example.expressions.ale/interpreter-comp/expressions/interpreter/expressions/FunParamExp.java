package expressions.interpreter.expressions;

import org.eclipse.emf.ecore.EObject;

public interface FunParamExp extends EObject, FunParam {
	Expression getExpr();

	void setExpr(Expression value);

	Value interpret(Context context);
}
