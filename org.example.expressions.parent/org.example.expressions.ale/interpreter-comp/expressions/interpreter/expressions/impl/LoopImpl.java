package expressions.interpreter.expressions.impl;

import expressions.interpreter.expressions.Block;
import expressions.interpreter.expressions.BoolValue;
import expressions.interpreter.expressions.Expression;
import expressions.interpreter.expressions.ExpressionsPackage;
import expressions.interpreter.expressions.Loop;
import expressions.interpreter.expressions.Value;
import java.lang.Object;
import java.lang.Override;
import org.eclipse.acceleo.query.runtime.impl.Nothing;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

public class LoopImpl extends AbstractElementImpl implements Loop {
	protected Expression expression;

	protected Block body;

	protected LoopImpl() {
		super();
	}

	@Override
	protected EClass eStaticClass() {
		return ExpressionsPackage.Literals.LOOP;
	}

	public Expression getExpression() {
		return expression;
	}

	public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs) {
		Expression oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionsPackage.LOOP__EXPRESSION, oldExpression, newExpression);
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
				msgs = ((InternalEObject) expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.LOOP__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject) newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.LOOP__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.LOOP__EXPRESSION, newExpression, newExpression));
	}

	public Block getBody() {
		return body;
	}

	public NotificationChain basicSetBody(Block newBody, NotificationChain msgs) {
		Block oldBody = body;
		body = newBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionsPackage.LOOP__BODY, oldBody, newBody);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	public void setBody(Block newBody) {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject) body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.LOOP__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject) newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.LOOP__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.LOOP__BODY, newBody, newBody));
	}

	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID,
			NotificationChain msgs) {
		switch (featureID) {
			case ExpressionsPackage.LOOP__EXPRESSION :
				return basicSetExpression(null, msgs);
			case ExpressionsPackage.LOOP__BODY :
				return basicSetBody(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExpressionsPackage.LOOP__EXPRESSION :
				return getExpression();
			case ExpressionsPackage.LOOP__BODY :
				return getBody();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExpressionsPackage.LOOP__EXPRESSION :
				setExpression((Expression) newValue);
				return;
			case ExpressionsPackage.LOOP__BODY :
				setBody((Block) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ExpressionsPackage.LOOP__EXPRESSION :
				setExpression((Expression) null);
				return;
			case ExpressionsPackage.LOOP__BODY :
				setBody((Block) null);
				return;
		}
		super.eUnset(featureID);
	}

	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ExpressionsPackage.LOOP__EXPRESSION :
				return expression != null;
			case ExpressionsPackage.LOOP__BODY :
				return body != null;
		}
		return super.eIsSet(featureID);
	}

	public Value interpret() {
		Value result;
		while (((BoolValue) (((Expression) (this.getExpression())).interpret((Nothing) (context)))).isValue()) {
			((Block) (this.getBody())).interpret((Nothing) (context));
		}
		result = (Value) (null) ;
		return result;
	}
}
