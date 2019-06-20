/**
 */
package expressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Or Param Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link expressions.VarOrParamRef#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see expressions.ExpressionsPackage#getVarOrParamRef()
 * @model
 * @generated
 */
public interface VarOrParamRef extends Expression {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(VarOrParam)
	 * @see expressions.ExpressionsPackage#getVarOrParamRef_Variable()
	 * @model
	 * @generated
	 */
	VarOrParam getVariable();

	/**
	 * Sets the value of the '{@link expressions.VarOrParamRef#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(VarOrParam value);

} // VarOrParamRef
