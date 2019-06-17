package expressions.interpreter.expressions.impl;

import expressions.interpreter.expressions.ExpressionsPackage;
import expressions.interpreter.expressions.VarOrParam;
import expressions.interpreter.expressions.VarOrParamRef;
import java.lang.Object;
import java.lang.Override;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

public class VarOrParamRefImpl extends ExpressionImpl implements VarOrParamRef {
	protected VarOrParam variable;

	protected VarOrParamRefImpl() {
		super();
	}

	@Override
	protected EClass eStaticClass() {
		return ExpressionsPackage.Literals.VAR_OR_PARAM_REF;
	}

	public VarOrParam getVariable() {
		if (variable != null && variable.eIsProxy()) {
			InternalEObject oldVariable = (InternalEObject) variable;
			variable = (VarOrParam) eResolveProxy(oldVariable);
			if (variable != oldVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionsPackage.VAR_OR_PARAM_REF__VARIABLE, oldVariable, variable));
			}
		}
		return variable;
	}

	public VarOrParam basicGetVariable() {
		return variable;
	}

	public void setVariable(VarOrParam newVariable) {
		VarOrParam oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.VAR_OR_PARAM_REF__VARIABLE, oldVariable, variable));
	}

	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExpressionsPackage.VAR_OR_PARAM_REF__VARIABLE :
				if (resolve)
					return getVariable();
				return basicGetVariable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExpressionsPackage.VAR_OR_PARAM_REF__VARIABLE :
				setVariable((VarOrParam) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ExpressionsPackage.VAR_OR_PARAM_REF__VARIABLE :
				setVariable((VarOrParam) null);
				return;
		}
		super.eUnset(featureID);
	}

	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ExpressionsPackage.VAR_OR_PARAM_REF__VARIABLE :
				return variable != null;
		}
		return super.eIsSet(featureID);
	}
}
