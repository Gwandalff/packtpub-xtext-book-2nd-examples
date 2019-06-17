package expressions.interpreter.expressions.impl;

import expressions.interpreter.expressions.AbstractElement;
import expressions.interpreter.expressions.ExpressionsPackage;
import expressions.interpreter.expressions.Statements;
import java.lang.Object;
import java.lang.Override;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

public class StatementsImpl extends MinimalEObjectImpl.Container implements Statements {
	protected EList<AbstractElement> elements;

	protected StatementsImpl() {
		super();
	}

	@Override
	protected EClass eStaticClass() {
		return ExpressionsPackage.Literals.STATEMENTS;
	}

	public EList<AbstractElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<AbstractElement>(AbstractElement.class, this, ExpressionsPackage.STATEMENTS__ELEMENTS);
		}
		return elements;
	}

	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID,
			NotificationChain msgs) {
		switch (featureID) {
			case ExpressionsPackage.STATEMENTS__ELEMENTS :
				return ((InternalEList<?>) getElements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExpressionsPackage.STATEMENTS__ELEMENTS :
				return getElements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExpressionsPackage.STATEMENTS__ELEMENTS :
				getElements().clear();
				getElements().addAll((Collection<? extends AbstractElement>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ExpressionsPackage.STATEMENTS__ELEMENTS :
				getElements().clear();
				return;
		}
		super.eUnset(featureID);
	}

	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ExpressionsPackage.STATEMENTS__ELEMENTS :
				return elements != null && !elements.isEmpty();
		}
		return super.eIsSet(featureID);
	}
}
