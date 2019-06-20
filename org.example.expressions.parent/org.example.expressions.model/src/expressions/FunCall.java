/**
 */
package expressions;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fun Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link expressions.FunCall#getFunction <em>Function</em>}</li>
 *   <li>{@link expressions.FunCall#getParams <em>Params</em>}</li>
 * </ul>
 *
 * @see expressions.ExpressionsPackage#getFunCall()
 * @model
 * @generated
 */
public interface FunCall extends Expression {
	/**
	 * Returns the value of the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' reference.
	 * @see #setFunction(FunDefinition)
	 * @see expressions.ExpressionsPackage#getFunCall_Function()
	 * @model
	 * @generated
	 */
	FunDefinition getFunction();

	/**
	 * Sets the value of the '{@link expressions.FunCall#getFunction <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(FunDefinition value);

	/**
	 * Returns the value of the '<em><b>Params</b></em>' containment reference list.
	 * The list contents are of type {@link expressions.FunParam}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params</em>' containment reference list.
	 * @see expressions.ExpressionsPackage#getFunCall_Params()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunParam> getParams();

} // FunCall
