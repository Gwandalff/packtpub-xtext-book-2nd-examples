package expressions.interpreter.expressions;

import org.eclipse.emf.ecore.EObject;

public interface ComplexFunction extends EObject, FunDefinition {
	Block getBody();

	void setBody(Block value);

	Value call(Context context);
}
