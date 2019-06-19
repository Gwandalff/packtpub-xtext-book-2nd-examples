package expressions.interpreter.expressions.impl;

import expressions.interpreter.expressions.Block;
import expressions.interpreter.expressions.BoolValue;
import expressions.interpreter.expressions.Condition;
import expressions.interpreter.expressions.Context;
import expressions.interpreter.expressions.Expression;
import expressions.interpreter.expressions.ExpressionsPackage;
import expressions.interpreter.expressions.Value;
import java.lang.Object;
import java.lang.Override;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

public class ConditionImpl extends AbstractElementImpl implements Condition {
	protected Expression expression;

	protected Block ifz;

	protected Block elsez;

	protected ConditionImpl() {
		super();
	}

	@Override
	protected EClass eStaticClass() {
		return ExpressionsPackage.Literals.CONDITION;
	}

	public Expression getExpression() {
		return expression;
	}

	public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs) {
		Expression oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionsPackage.CONDITION__EXPRESSION, oldExpression, newExpression);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	public void setExpression(Expression newExpression) {
		if (newExpression != expression) {
			NotificationChain msgs = null;
			if (expression != null)
				msgs = ((InternalEObject) expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.CONDITION__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject) newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.CONDITION__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.CONDITION__EXPRESSION, newExpression, newExpression));
	}

	public Block getIfz() {
		return ifz;
	}

	public NotificationChain basicSetIfz(Block newIfz, NotificationChain msgs) {
		Block oldIfz = ifz;
		ifz = newIfz;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionsPackage.CONDITION__IFZ, oldIfz, newIfz);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	public void setIfz(Block newIfz) {
		if (newIfz != ifz) {
			NotificationChain msgs = null;
			if (ifz != null)
				msgs = ((InternalEObject) ifz).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.CONDITION__IFZ, null, msgs);
			if (newIfz != null)
				msgs = ((InternalEObject) newIfz).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.CONDITION__IFZ, null, msgs);
			msgs = basicSetIfz(newIfz, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.CONDITION__IFZ, newIfz, newIfz));
	}

	public Block getElsez() {
		return elsez;
	}

	public NotificationChain basicSetElsez(Block newElsez, NotificationChain msgs) {
		Block oldElsez = elsez;
		elsez = newElsez;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionsPackage.CONDITION__ELSEZ, oldElsez, newElsez);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	public void setElsez(Block newElsez) {
		if (newElsez != elsez) {
			NotificationChain msgs = null;
			if (elsez != null)
				msgs = ((InternalEObject) elsez).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.CONDITION__ELSEZ, null, msgs);
			if (newElsez != null)
				msgs = ((InternalEObject) newElsez).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.CONDITION__ELSEZ, null, msgs);
			msgs = basicSetElsez(newElsez, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.CONDITION__ELSEZ, newElsez, newElsez));
	}

	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID,
			NotificationChain msgs) {
		switch (featureID) {
			case ExpressionsPackage.CONDITION__EXPRESSION :
				return basicSetExpression(null, msgs);
			case ExpressionsPackage.CONDITION__IFZ :
				return basicSetIfz(null, msgs);
			case ExpressionsPackage.CONDITION__ELSEZ :
				return basicSetElsez(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExpressionsPackage.CONDITION__EXPRESSION :
				return getExpression();
			case ExpressionsPackage.CONDITION__IFZ :
				return getIfz();
			case ExpressionsPackage.CONDITION__ELSEZ :
				return getElsez();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExpressionsPackage.CONDITION__EXPRESSION :
				setExpression((Expression) newValue);
				return;
			case ExpressionsPackage.CONDITION__IFZ :
				setIfz((Block) newValue);
				return;
			case ExpressionsPackage.CONDITION__ELSEZ :
				setElsez((Block) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ExpressionsPackage.CONDITION__EXPRESSION :
				setExpression((Expression) null);
				return;
			case ExpressionsPackage.CONDITION__IFZ :
				setIfz((Block) null);
				return;
			case ExpressionsPackage.CONDITION__ELSEZ :
				setElsez((Block) null);
				return;
		}
		super.eUnset(featureID);
	}

	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ExpressionsPackage.CONDITION__EXPRESSION :
				return expression != null;
			case ExpressionsPackage.CONDITION__IFZ :
				return ifz != null;
			case ExpressionsPackage.CONDITION__ELSEZ :
				return elsez != null;
		}
		return super.eIsSet(featureID);
	}

	public Value interpret(Context context) {
		Value result;
		BoolValue cond = ((BoolValue) (((Expression) (this.getExpression())).interpret((Context) (context))));
		if (cond.isValue()) {
			((Block) (this.getIfz())).interpret((Context) (context));
		}
		else {
			if (this.getElsez() instanceof Block) {
				((Block) (this.getElsez())).interpret((Context) (context));
			}
		}
		result = (Value) (null) ;
		return result;
	}
}
