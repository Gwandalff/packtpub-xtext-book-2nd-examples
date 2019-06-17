package expressions.interpreter.expressions.impl;

import expressions.interpreter.expressions.ExpressionsPackage;
import expressions.interpreter.expressions.IntValue;
import java.lang.Override;
import org.eclipse.emf.ecore.EClass;

public class IntValueImpl extends ValueImpl implements IntValue {
	protected IntValueImpl() {
		super();
	}

	@Override
	protected EClass eStaticClass() {
		return ExpressionsPackage.Literals.INT_VALUE;
	}
}
