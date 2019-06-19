package expressions.interpreter.expressions.impl;

import expressions.interpreter.expressions.Context;
import expressions.interpreter.expressions.ExpressionsPackage;
import expressions.interpreter.expressions.FunDefinition;
import expressions.interpreter.expressions.Parameter;
import expressions.interpreter.expressions.Value;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

public class FunDefinitionImpl extends AbstractElementImpl implements FunDefinition {
	protected static final String NAME_EDEFAULT = null;

	protected String name = NAME_EDEFAULT;

	protected EList<Parameter> varNames;

	protected FunDefinitionImpl() {
		super();
	}

	@Override
	protected EClass eStaticClass() {
		return ExpressionsPackage.Literals.FUN_DEFINITION;
	}

	public EList<Parameter> getVarNames() {
		if (varNames == null) {
			varNames = new EObjectContainmentEList<Parameter>(Parameter.class, this, ExpressionsPackage.FUN_DEFINITION__VAR_NAMES);
		}
		return varNames;
	}

	public String getName() {
		return name;
	}

	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.FUN_DEFINITION__NAME, oldName, name));
	}

	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID,
			NotificationChain msgs) {
		switch (featureID) {
			case ExpressionsPackage.FUN_DEFINITION__VAR_NAMES :
				return ((InternalEList<?>) getVarNames()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExpressionsPackage.FUN_DEFINITION__VAR_NAMES :
				return getVarNames();
			case ExpressionsPackage.FUN_DEFINITION__NAME :
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExpressionsPackage.FUN_DEFINITION__VAR_NAMES :
				getVarNames().clear();
				getVarNames().addAll((Collection<? extends Parameter>) newValue);
				return;
			case ExpressionsPackage.FUN_DEFINITION__NAME :
				setName((String) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ExpressionsPackage.FUN_DEFINITION__VAR_NAMES :
				getVarNames().clear();
				return;
			case ExpressionsPackage.FUN_DEFINITION__NAME :
				setName(NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ExpressionsPackage.FUN_DEFINITION__VAR_NAMES :
				return varNames != null && !varNames.isEmpty();
			case ExpressionsPackage.FUN_DEFINITION__NAME :
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	public Value interpret(Context context) {
		Value result;
		result = (Value) (null) ;
		return result;
	}
}
