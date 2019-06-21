package expressions.interpreter.expressions.impl;

import expressions.interpreter.expressions.ExpressionsPackage;
import expressions.interpreter.expressions.Value;
import java.lang.Override;
import java.lang.String;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

public abstract class ValueImpl extends MinimalEObjectImpl.Container implements Value {
	protected ValueImpl() {
		super();
	}

	@Override
	protected EClass eStaticClass() {
		return ExpressionsPackage.Literals.VALUE;
	}

	public String toString() {
		String result;
		result = (String) (null) ;
		return result;
	}
}
