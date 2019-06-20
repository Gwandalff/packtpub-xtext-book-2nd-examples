/**
 */
package expressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fun Param Capture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link expressions.FunParamCapture#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see expressions.ExpressionsPackage#getFunParamCapture()
 * @model
 * @generated
 */
public interface FunParamCapture extends FunParam {
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
	 * @see expressions.ExpressionsPackage#getFunParamCapture_Variable()
	 * @model
	 * @generated
	 */
	VarOrParam getVariable();

	/**
	 * Sets the value of the '{@link expressions.FunParamCapture#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(VarOrParam value);

} // FunParamCapture
