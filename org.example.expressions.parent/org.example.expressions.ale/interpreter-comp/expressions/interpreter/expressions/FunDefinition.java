package expressions.interpreter.expressions;

import java.lang.String;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

public interface FunDefinition extends EObject, AbstractElement {
	String getName();

	void setName(String value);

	EList<Parameter> getVarNames();

	Value interpret(Context context);

	Value call(Context context);
}
