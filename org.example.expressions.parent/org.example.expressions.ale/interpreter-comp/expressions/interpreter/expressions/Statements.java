package expressions.interpreter.expressions;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

public interface Statements extends EObject {
	EList<AbstractElement> getElements();
}
