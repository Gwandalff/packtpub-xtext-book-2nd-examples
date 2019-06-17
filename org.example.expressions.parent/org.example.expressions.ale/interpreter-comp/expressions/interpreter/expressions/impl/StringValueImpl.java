package expressions.interpreter.expressions.impl;

import expressions.interpreter.expressions.ExpressionsPackage;
import expressions.interpreter.expressions.StringValue;
import java.lang.Override;
import org.eclipse.emf.ecore.EClass;

public class StringValueImpl extends ValueImpl implements StringValue {
	protected StringValueImpl() {
		super();
	}

	@Override
	protected EClass eStaticClass() {
		return ExpressionsPackage.Literals.STRING_VALUE;
	}
}
