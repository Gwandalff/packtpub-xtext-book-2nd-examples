package expressions.interpreter.expressions.impl;

import expressions.interpreter.expressions.AbstractElement;
import expressions.interpreter.expressions.Block;
import expressions.interpreter.expressions.BoolValue;
import expressions.interpreter.expressions.Condition;
import expressions.interpreter.expressions.Context;
import expressions.interpreter.expressions.EvalExpression;
import expressions.interpreter.expressions.Expression;
import expressions.interpreter.expressions.ExpressionsPackage;
import expressions.interpreter.expressions.FunDefinition;
import expressions.interpreter.expressions.Loop;
import expressions.interpreter.expressions.Value;
import expressions.interpreter.expressions.Variable;
import java.lang.Override;
import java.lang.String;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.example.expressions.services.MapService;

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
		if (this instanceof Variable) {
			Variable var = ((Variable) (((Variable) (this))));
			result = (Value) (((Expression) (var.getExpression())).interpret((Context) (context))) ;
			MapService.put((EMap) (context.getValues()), (String) (var.getName()), (Value) (result));
		}
		if (this instanceof FunDefinition) {
			result = (Value) (null) ;
		}
		if (this instanceof EvalExpression) {
			EvalExpression eval = ((EvalExpression) (((EvalExpression) (this))));
			result = (Value) (((Expression) (eval.getExpression())).interpret((Context) (context))) ;
		}
		if (this instanceof Condition) {
			Condition condition = ((Condition) (((Condition) (this))));
			BoolValue cond = ((BoolValue) (((Expression) (condition.getExpression())).interpret((Context) (context))));
			if (cond.isValue()) {
				((Block) (condition.getIfz())).interpret((Context) (context));
			}
			else {
				if (condition.getElsez() instanceof Block) {
					((Block) (condition.getElsez())).interpret((Context) (context));
				}
			}
			result = (Value) (null) ;
		}
		if (this instanceof Loop) {
			Loop loop = ((Loop) (((Loop) (this))));
			while (((BoolValue) (((Expression) (loop.getExpression())).interpret((Context) (context)))).isValue()) {
				((Block) (loop.getBody())).interpret((Context) (context));
			}
			result = (Value) (null) ;
		}
		return result;
	}
}
