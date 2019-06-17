package expressions.interpreter.expressions.impl;

import expressions.interpreter.expressions.ExpressionsPackage;
import expressions.interpreter.expressions.Value;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

public class StringToValueBindingMapImpl extends MinimalEObjectImpl.Container implements BasicEMap.Entry<String, Value> {
	protected static final String KEY_EDEFAULT = null;

	protected String key = KEY_EDEFAULT;

	protected Value value;

	protected int hash = -1;

	protected StringToValueBindingMapImpl() {
		super();
	}

	@Override
	protected EClass eStaticClass() {
		return ExpressionsPackage.Literals.STRING_TO_VALUE_BINDING_MAP;
	}

	public String getTypedKey() {
		return key;
	}

	public void setTypedKey(String newKey) {
		String oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.STRING_TO_VALUE_BINDING_MAP__KEY, oldKey, key));
	}

	public Value getTypedValue() {
		if (value != null && value.eIsProxy()) {
			InternalEObject oldValue = (InternalEObject) value;
			value = (Value) eResolveProxy(oldValue);
			if (value != oldValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionsPackage.STRING_TO_VALUE_BINDING_MAP__VALUE, oldValue, value));
			}
		}
		return value;
	}

	public Value basicGetTypedValue() {
		return value;
	}

	public void setTypedValue(Value newValue) {
		Value oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.STRING_TO_VALUE_BINDING_MAP__VALUE, oldValue, value));
	}

	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExpressionsPackage.STRING_TO_VALUE_BINDING_MAP__KEY :
				return getTypedKey();
			case ExpressionsPackage.STRING_TO_VALUE_BINDING_MAP__VALUE :
				if (resolve)
					return getTypedValue();
				return basicGetTypedValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExpressionsPackage.STRING_TO_VALUE_BINDING_MAP__KEY :
				setTypedKey((String) newValue);
				return;
			case ExpressionsPackage.STRING_TO_VALUE_BINDING_MAP__VALUE :
				setTypedValue((Value) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ExpressionsPackage.STRING_TO_VALUE_BINDING_MAP__KEY :
				setTypedKey(KEY_EDEFAULT);
				return;
			case ExpressionsPackage.STRING_TO_VALUE_BINDING_MAP__VALUE :
				setTypedValue((Value) null);
				return;
		}
		super.eUnset(featureID);
	}

	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ExpressionsPackage.STRING_TO_VALUE_BINDING_MAP__KEY :
				return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
			case ExpressionsPackage.STRING_TO_VALUE_BINDING_MAP__VALUE :
				return value != null;
		}
		return super.eIsSet(featureID);
	}

	public int getHash() {
		if (hash == -1) {
			Object theKey = getKey();
			hash = (theKey == null ? 0 : theKey.hashCode());
		}
		return hash;
	}

	public void setHash(int hash) {
		this.hash = hash;
	}

	public String getKey() {
		return getTypedKey();
	}

	public void setKey(String key) {
		setTypedKey(key);
	}

	public Value getValue() {
		return getTypedValue();
	}

	public Value setValue(Value value) {
		Value oldValue = getValue();
		setTypedValue(value);
		return oldValue;
	}

	public EMap<String, Value> getEMap() {
		EObject container = eContainer();
		return container == null ? null : (EMap<String, Value>)container.eGet(eContainmentFeature());
	}
}
