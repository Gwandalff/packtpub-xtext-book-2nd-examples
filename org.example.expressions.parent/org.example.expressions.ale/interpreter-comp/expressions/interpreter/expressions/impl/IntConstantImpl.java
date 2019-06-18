package expressions.interpreter.expressions.impl;

import expressions.interpreter.expressions.Context;
import expressions.interpreter.expressions.ExpressionsFactory;
import expressions.interpreter.expressions.ExpressionsPackage;
import expressions.interpreter.expressions.IntConstant;
import expressions.interpreter.expressions.IntValue;
import expressions.interpreter.expressions.Value;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

public class IntConstantImpl extends ExpressionImpl implements IntConstant {
	protected static final int VALUE_EDEFAULT = 0;

	protected int value = VALUE_EDEFAULT;

	protected IntConstantImpl() {
		super();
	}

	@Override
	protected EClass eStaticClass() {
		return ExpressionsPackage.Literals.INT_CONSTANT;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int newValue) {
		int oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.INT_CONSTANT__VALUE, oldValue, value));
	}

	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExpressionsPackage.INT_CONSTANT__VALUE :
				return getValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExpressionsPackage.INT_CONSTANT__VALUE :
				setValue((Integer) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ExpressionsPackage.INT_CONSTANT__VALUE :
				setValue(VALUE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ExpressionsPackage.INT_CONSTANT__VALUE :
				return value != VALUE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	public Value interpret(Context context) {
		Value result;
		IntValue ret = ((IntValue) (ExpressionsFactory.eINSTANCE.createIntValue()));
		ret.setValue(this.value);
		result = (Value) (ret) ;
		return result;
	}
}
