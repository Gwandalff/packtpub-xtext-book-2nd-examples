package expressions.interpreter.expressions;

import org.eclipse.emf.ecore.EObject;

public interface Block extends EObject {
	Statements getStatements();

	void setStatements(Statements value);

	Value interpret(Context context);
}
