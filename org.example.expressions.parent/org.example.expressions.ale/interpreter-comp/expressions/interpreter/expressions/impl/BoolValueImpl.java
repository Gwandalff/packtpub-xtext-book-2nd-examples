package expressions.interpreter.expressions.impl;

import expressions.interpreter.expressions.BoolValue;
import expressions.interpreter.expressions.ExpressionsPackage;
import java.lang.Override;
import org.eclipse.emf.ecore.EClass;

public class BoolValueImpl extends ValueImpl implements BoolValue {
	protected BoolValueImpl() {
		super();
	}

	@Override
	protected EClass eStaticClass() {
		return ExpressionsPackage.Literals.BOOL_VALUE;
	}
}
