package expressions.interpreter.expressions;

import org.eclipse.emf.ecore.EObject;

public interface ExpressionsModel extends EObject {
	Statements getStatements();

	void setStatements(Statements value);

	void main();

	Value interpret();
}
