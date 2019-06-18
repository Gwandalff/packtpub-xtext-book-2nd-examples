package expressions.interpreter.expressions.impl;

import expressions.interpreter.expressions.Context;
import expressions.interpreter.expressions.Expression;
import expressions.interpreter.expressions.ExpressionsPackage;
import expressions.interpreter.expressions.FunParamExp;
import expressions.interpreter.expressions.Value;
import java.lang.Object;
import java.lang.Override;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

public class FunParamExpImpl extends FunParamImpl implements FunParamExp {
	protected Expression expr;

	protected FunParamExpImpl() {
		super();
	}

	@Override
	protected EClass eStaticClass() {
		return ExpressionsPackage.Literals.FUN_PARAM_EXP;
	}

	public Expression getExpr() {
		return expr;
	}

	public NotificationChain basicSetExpr(Expression newExpr, NotificationChain msgs) {
		Expression oldExpr = expr;
		expr = newExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionsPackage.FUN_PARAM_EXP__EXPR, oldExpr, newExpr);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	public void setExpr(Expression newExpr) {
		if (newExpr != expr) {
			NotificationChain msgs = null;
			if (expr != null)
				msgs = ((InternalEObject) expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.FUN_PARAM_EXP__EXPR, null, msgs);
			if (newExpr != null)
				msgs = ((InternalEObject) newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.FUN_PARAM_EXP__EXPR, null, msgs);
			msgs = basicSetExpr(newExpr, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.FUN_PARAM_EXP__EXPR, newExpr, newExpr));
	}

	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID,
			NotificationChain msgs) {
		switch (featureID) {
			case ExpressionsPackage.FUN_PARAM_EXP__EXPR :
				return basicSetExpr(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExpressionsPackage.FUN_PARAM_EXP__EXPR :
				return getExpr();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExpressionsPackage.FUN_PARAM_EXP__EXPR :
				setExpr((Expression) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ExpressionsPackage.FUN_PARAM_EXP__EXPR :
				setExpr((Expression) null);
				return;
		}
		super.eUnset(featureID);
	}

	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ExpressionsPackage.FUN_PARAM_EXP__EXPR :
				return expr != null;
		}
		return super.eIsSet(featureID);
	}

	public Value interpret(Context context) {
		Value result;
		result = (Value) (((Expression) (this.getExpr())).interpret((Context) (context))) ;
		return result;
	}
}
