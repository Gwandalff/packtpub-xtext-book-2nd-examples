package expressions.interpreter.expressions.impl;

import expressions.interpreter.expressions.AbstractElement;
import expressions.interpreter.expressions.Context;
import expressions.interpreter.expressions.ExpressionsPackage;
import expressions.interpreter.expressions.Value;
import java.lang.Override;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

public class AbstractElementImpl extends MinimalEObjectImpl.Container implements AbstractElement {
	protected AbstractElementImpl() {
		super();
	}

	@Override
	protected EClass eStaticClass() {
		return ExpressionsPackage.Literals.ABSTRACT_ELEMENT;
	}

	public Value interpret(Context context) {
		Value result;
		result = (Value) (null) ;
		return result;
	}
}
