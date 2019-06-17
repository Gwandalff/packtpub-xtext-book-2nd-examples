package expressions.interpreter.expressions;

import java.lang.String;
import org.eclipse.emf.ecore.EObject;

public interface Parameter extends EObject, VarOrParam {
	String getType();

	void setType(String value);
}
