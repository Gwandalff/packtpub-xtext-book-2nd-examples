package expressions.interpreter.expressions;

import java.lang.String;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

public interface Context extends EObject {
	EMap<String, Value> getValues();
}
