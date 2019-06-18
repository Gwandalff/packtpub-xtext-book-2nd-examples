package expressions.interpreter.expressions.impl;

import expressions.interpreter.expressions.Context;
import expressions.interpreter.expressions.Expression;
import expressions.interpreter.expressions.ExpressionsFactory;
import expressions.interpreter.expressions.ExpressionsPackage;
import expressions.interpreter.expressions.IntValue;
import expressions.interpreter.expressions.MulOrDiv;
import expressions.interpreter.expressions.Value;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecoretools.ale.compiler.lib.EqualService;

public class MulOrDivImpl extends ExpressionImpl implements MulOrDiv {
	protected static final String OP_EDEFAULT = null;

	protected String op = OP_EDEFAULT;

	protected Expression left;

	protected Expression right;

	protected MulOrDivImpl() {
		super();
	}

	@Override
	protected EClass eStaticClass() {
		return ExpressionsPackage.Literals.MUL_OR_DIV;
	}

	public Expression getLeft() {
		return left;
	}

	public NotificationChain basicSetLeft(Expression newLeft, NotificationChain msgs) {
		Expression oldLeft = left;
		left = newLeft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionsPackage.MUL_OR_DIV__LEFT, oldLeft, newLeft);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	public void setLeft(Expression newLeft) {
		if (newLeft != left) {
			NotificationChain msgs = null;
			if (left != null)
				msgs = ((InternalEObject) left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.MUL_OR_DIV__LEFT, null, msgs);
			if (newLeft != null)
				msgs = ((InternalEObject) newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.MUL_OR_DIV__LEFT, null, msgs);
			msgs = basicSetLeft(newLeft, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.MUL_OR_DIV__LEFT, newLeft, newLeft));
	}

	public String getOp() {
		return op;
	}

	public void setOp(String newOp) {
		String oldOp = op;
		op = newOp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.MUL_OR_DIV__OP, oldOp, op));
	}

	public Expression getRight() {
		return right;
	}

	public NotificationChain basicSetRight(Expression newRight, NotificationChain msgs) {
		Expression oldRight = right;
		right = newRight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionsPackage.MUL_OR_DIV__RIGHT, oldRight, newRight);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	public void setRight(Expression newRight) {
		if (newRight != right) {
			NotificationChain msgs = null;
			if (right != null)
				msgs = ((InternalEObject) right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.MUL_OR_DIV__RIGHT, null, msgs);
			if (newRight != null)
				msgs = ((InternalEObject) newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.MUL_OR_DIV__RIGHT, null, msgs);
			msgs = basicSetRight(newRight, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.MUL_OR_DIV__RIGHT, newRight, newRight));
	}

	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID,
			NotificationChain msgs) {
		switch (featureID) {
			case ExpressionsPackage.MUL_OR_DIV__LEFT :
				return basicSetLeft(null, msgs);
			case ExpressionsPackage.MUL_OR_DIV__RIGHT :
				return basicSetRight(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExpressionsPackage.MUL_OR_DIV__LEFT :
				return getLeft();
			case ExpressionsPackage.MUL_OR_DIV__OP :
				return getOp();
			case ExpressionsPackage.MUL_OR_DIV__RIGHT :
				return getRight();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExpressionsPackage.MUL_OR_DIV__LEFT :
				setLeft((Expression) newValue);
				return;
			case ExpressionsPackage.MUL_OR_DIV__OP :
				setOp((String) newValue);
				return;
			case ExpressionsPackage.MUL_OR_DIV__RIGHT :
				setRight((Expression) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ExpressionsPackage.MUL_OR_DIV__LEFT :
				setLeft((Expression) null);
				return;
			case ExpressionsPackage.MUL_OR_DIV__OP :
				setOp(OP_EDEFAULT);
				return;
			case ExpressionsPackage.MUL_OR_DIV__RIGHT :
				setRight((Expression) null);
				return;
		}
		super.eUnset(featureID);
	}

	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ExpressionsPackage.MUL_OR_DIV__LEFT :
				return left != null;
			case ExpressionsPackage.MUL_OR_DIV__OP :
				return OP_EDEFAULT == null ? op != null : !OP_EDEFAULT.equals(op);
			case ExpressionsPackage.MUL_OR_DIV__RIGHT :
				return right != null;
		}
		return super.eIsSet(featureID);
	}

	public Value interpret(Context context) {
		Value result;
		IntValue ret = ((IntValue) (ExpressionsFactory.eINSTANCE.createIntValue()));
		IntValue left = ((IntValue) (((Expression) (this.getLeft())).interpret((Context) (context))));
		IntValue right = ((IntValue) (((Expression) (this.getRight())).interpret((Context) (context))));
		if (EqualService.equals((this.op), ("*"))) {
			ret.setValue((left.getValue()) * (right.getValue()));
		}
		else {
			ret.setValue((left.getValue()) / (right.getValue()));
		}
		result = (Value) (ret) ;
		return result;
	}
}
