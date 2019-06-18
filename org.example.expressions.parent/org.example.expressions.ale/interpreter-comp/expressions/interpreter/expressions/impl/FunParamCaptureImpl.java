package expressions.interpreter.expressions.impl;

import expressions.interpreter.expressions.Context;
import expressions.interpreter.expressions.ExpressionsPackage;
import expressions.interpreter.expressions.FunParamCapture;
import expressions.interpreter.expressions.Value;
import expressions.interpreter.expressions.Variable;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

public class FunParamCaptureImpl extends FunParamImpl implements FunParamCapture {
	protected Variable variable;

	protected FunParamCaptureImpl() {
		super();
	}

	@Override
	protected EClass eStaticClass() {
		return ExpressionsPackage.Literals.FUN_PARAM_CAPTURE;
	}

	public Variable getVariable() {
		if (variable != null && variable.eIsProxy()) {
			InternalEObject oldVariable = (InternalEObject) variable;
			variable = (Variable) eResolveProxy(oldVariable);
			if (variable != oldVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionsPackage.FUN_PARAM_CAPTURE__VARIABLE, oldVariable, variable));
			}
		}
		return variable;
	}

	public Variable basicGetVariable() {
		return variable;
	}

	public void setVariable(Variable newVariable) {
		Variable oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.FUN_PARAM_CAPTURE__VARIABLE, oldVariable, variable));
	}

	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExpressionsPackage.FUN_PARAM_CAPTURE__VARIABLE :
				if (resolve)
					return getVariable();
				return basicGetVariable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExpressionsPackage.FUN_PARAM_CAPTURE__VARIABLE :
				setVariable((Variable) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ExpressionsPackage.FUN_PARAM_CAPTURE__VARIABLE :
				setVariable((Variable) null);
				return;
		}
		super.eUnset(featureID);
	}

	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ExpressionsPackage.FUN_PARAM_CAPTURE__VARIABLE :
				return variable != null;
		}
		return super.eIsSet(featureID);
	}

	public Value interpret(Context context) {
		Value result;
		result = (Value) (context.getValues().get((String) (this.getVariable().getName()))) ;
		return result;
	}
}
