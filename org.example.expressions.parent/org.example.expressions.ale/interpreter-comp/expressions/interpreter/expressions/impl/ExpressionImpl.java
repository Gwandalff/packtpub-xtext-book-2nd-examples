package expressions.interpreter.expressions.impl;

import expressions.interpreter.expressions.Context;
import expressions.interpreter.expressions.Expression;
import expressions.interpreter.expressions.ExpressionsPackage;
import expressions.interpreter.expressions.Value;
import java.lang.Override;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

public class ExpressionImpl extends MinimalEObjectImpl.Container implements Expression {
	protected ExpressionImpl() {
		super();
	}

	@Override
	protected EClass eStaticClass() {
		return ExpressionsPackage.Literals.EXPRESSION;
	}

	public Value interpret(Context context) {
		Value result;
		result = (Value) (null) ;
		return result;
	}
}
