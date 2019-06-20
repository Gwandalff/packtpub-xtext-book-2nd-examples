/**
 */
package expressions;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link expressions.Block#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see expressions.ExpressionsPackage#getBlock()
 * @model
 * @generated
 */
public interface Block extends EObject {
	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statements</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference.
	 * @see #setStatements(Statements)
	 * @see expressions.ExpressionsPackage#getBlock_Statements()
	 * @model containment="true"
	 * @generated
	 */
	Statements getStatements();

	/**
	 * Sets the value of the '{@link expressions.Block#getStatements <em>Statements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statements</em>' containment reference.
	 * @see #getStatements()
	 * @generated
	 */
	void setStatements(Statements value);

} // Block
