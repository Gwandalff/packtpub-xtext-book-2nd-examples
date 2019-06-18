package expressions.interpreter.expressions;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

public interface FunCall extends EObject, Expression {
	FunDefinition getFunction();

	void setFunction(FunDefinition value);

	EList<FunParam> getParams();

	Value interpret(Context context);
}
