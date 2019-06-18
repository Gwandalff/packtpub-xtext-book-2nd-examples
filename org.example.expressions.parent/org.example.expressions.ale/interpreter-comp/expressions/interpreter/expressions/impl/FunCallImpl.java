package expressions.interpreter.expressions.impl;

import expressions.interpreter.expressions.Block;
import expressions.interpreter.expressions.ComplexFunction;
import expressions.interpreter.expressions.Context;
import expressions.interpreter.expressions.Expression;
import expressions.interpreter.expressions.ExpressionsFactory;
import expressions.interpreter.expressions.ExpressionsPackage;
import expressions.interpreter.expressions.FunCall;
import expressions.interpreter.expressions.FunDefinition;
import expressions.interpreter.expressions.FunParam;
import expressions.interpreter.expressions.FunParamCapture;
import expressions.interpreter.expressions.InlineFunction;
import expressions.interpreter.expressions.Value;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecoretools.ale.compiler.lib.CollectionService;
import org.example.expressions.services.MapService;

public class FunCallImpl extends ExpressionImpl implements FunCall {
	protected FunDefinition function;

	protected EList<FunParam> params;

	protected FunCallImpl() {
		super();
	}

	@Override
	protected EClass eStaticClass() {
		return ExpressionsPackage.Literals.FUN_CALL;
	}

	public FunDefinition getFunction() {
		if (function != null && function.eIsProxy()) {
			InternalEObject oldFunction = (InternalEObject) function;
			function = (FunDefinition) eResolveProxy(oldFunction);
			if (function != oldFunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionsPackage.FUN_CALL__FUNCTION, oldFunction, function));
			}
		}
		return function;
	}

	public FunDefinition basicGetFunction() {
		return function;
	}

	public void setFunction(FunDefinition newFunction) {
		FunDefinition oldFunction = function;
		function = newFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.FUN_CALL__FUNCTION, oldFunction, function));
	}

	public EList<FunParam> getParams() {
		if (params == null) {
			params = new EObjectContainmentEList<FunParam>(FunParam.class, this, ExpressionsPackage.FUN_CALL__PARAMS);
		}
		return params;
	}

	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID,
			NotificationChain msgs) {
		switch (featureID) {
			case ExpressionsPackage.FUN_CALL__PARAMS :
				return ((InternalEList<?>) getParams()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExpressionsPackage.FUN_CALL__FUNCTION :
				if (resolve)
					return getFunction();
				return basicGetFunction();
			case ExpressionsPackage.FUN_CALL__PARAMS :
				return getParams();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExpressionsPackage.FUN_CALL__FUNCTION :
				setFunction((FunDefinition) newValue);
				return;
			case ExpressionsPackage.FUN_CALL__PARAMS :
				getParams().clear();
				getParams().addAll((Collection<? extends FunParam>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ExpressionsPackage.FUN_CALL__FUNCTION :
				setFunction((FunDefinition) null);
				return;
			case ExpressionsPackage.FUN_CALL__PARAMS :
				getParams().clear();
				return;
		}
		super.eUnset(featureID);
	}

	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ExpressionsPackage.FUN_CALL__FUNCTION :
				return function != null;
			case ExpressionsPackage.FUN_CALL__PARAMS :
				return params != null && !params.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	public Value interpret(Context context) {
		Value result;
		Context funContext = ((Context) (ExpressionsFactory.eINSTANCE.createContext()));
		int i = ((int) (0));
		while ((i) < (CollectionService.size(this.getFunction().getVarNames()))) {
			MapService.put((EMap) (funContext.getValues()), (this.getFunction().getVarNames().get((Integer) (i)).getName()), (this.getParams().get((Integer) (i)).interpret((Context) (context))));
			i = (i) + (1);
		}
		if (this.getFunction() instanceof InlineFunction) {
			InlineFunction f = ((InlineFunction) (null));
			this.getFunction();
			result = (Value) (((Expression) (f.getExpression())).interpret((Context) (funContext))) ;
		}
		if (this.getFunction() instanceof ComplexFunction) {
			ComplexFunction f = ((ComplexFunction) (null));
			this.getFunction();
			result = (Value) (((Block) (f.getBody())).interpret((Context) (funContext))) ;
		}
		i = 0;
		while ((i) < (CollectionService.size(this.getParams()))) {
			FunParam param = ((FunParam) (this.getParams().get((Integer) (i))));
			if (param instanceof FunParamCapture) {
				FunParamCapture capture = ((FunParamCapture) (((FunParamCapture) (param))));
				MapService.put((EMap) (context.getValues()), (capture.getVariable().getName()), (funContext.getValues().get((this.getFunction().getVarNames().get((Integer) (i)).getName()))));
			}
			i = (i) + (1);
		}
		return result;
	}
}
