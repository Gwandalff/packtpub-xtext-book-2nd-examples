package expressions.interpreter.expressions.impl;

import expressions.interpreter.expressions.Context;
import expressions.interpreter.expressions.ExpressionsPackage;
import expressions.interpreter.expressions.FunParam;
import expressions.interpreter.expressions.Value;
import java.lang.Override;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

public class FunParamImpl extends MinimalEObjectImpl.Container implements FunParam {
	protected FunParamImpl() {
		super();
	}

	@Override
	protected EClass eStaticClass() {
		return ExpressionsPackage.Literals.FUN_PARAM;
	}

	public Value interpret(Context context) {
		Value result;
		result = (Value) (null) ;
		return result;
	}
}
