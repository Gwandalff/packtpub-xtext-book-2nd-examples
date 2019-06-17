package expressions.interpreter.expressions;

import java.lang.String;
import org.eclipse.emf.ecore.EObject;

public interface VarOrParam extends EObject {
	String getName();

	void setName(String value);
}
