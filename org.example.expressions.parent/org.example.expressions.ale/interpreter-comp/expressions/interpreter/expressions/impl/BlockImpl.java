package expressions.interpreter.expressions.impl;

import expressions.interpreter.expressions.AbstractElement;
import expressions.interpreter.expressions.Block;
import expressions.interpreter.expressions.Context;
import expressions.interpreter.expressions.ExpressionsPackage;
import expressions.interpreter.expressions.Statements;
import expressions.interpreter.expressions.Value;
import java.lang.Object;
import java.lang.Override;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

public class BlockImpl extends MinimalEObjectImpl.Container implements Block {
	protected Statements statements;

	protected BlockImpl() {
		super();
	}

	@Override
	protected EClass eStaticClass() {
		return ExpressionsPackage.Literals.BLOCK;
	}

	public Statements getStatements() {
		return statements;
	}

	public NotificationChain basicSetStatements(Statements newStatements, NotificationChain msgs) {
		Statements oldStatements = statements;
		statements = newStatements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionsPackage.BLOCK__STATEMENTS, oldStatements, newStatements);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	public void setStatements(Statements newStatements) {
		if (newStatements != statements) {
			NotificationChain msgs = null;
			if (statements != null)
				msgs = ((InternalEObject) statements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.BLOCK__STATEMENTS, null, msgs);
			if (newStatements != null)
				msgs = ((InternalEObject) newStatements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.BLOCK__STATEMENTS, null, msgs);
			msgs = basicSetStatements(newStatements, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.BLOCK__STATEMENTS, newStatements, newStatements));
	}

	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID,
			NotificationChain msgs) {
		switch (featureID) {
			case ExpressionsPackage.BLOCK__STATEMENTS :
				return basicSetStatements(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExpressionsPackage.BLOCK__STATEMENTS :
				return getStatements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExpressionsPackage.BLOCK__STATEMENTS :
				setStatements((Statements) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ExpressionsPackage.BLOCK__STATEMENTS :
				setStatements((Statements) null);
				return;
		}
		super.eUnset(featureID);
	}

	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ExpressionsPackage.BLOCK__STATEMENTS :
				return statements != null;
		}
		return super.eIsSet(featureID);
	}

	public Value interpret(Context context) {
		Value result;
		result = (Value) (null) ;
		for (AbstractElement element : this.getStatements().getElements()) {
			result = (Value) (((AbstractElement) (element)).interpret((Context) (context))) ;
		}
		return result;
	}
}
