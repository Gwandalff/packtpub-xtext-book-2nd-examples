/**
 */
package expressions;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link expressions.Statements#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see expressions.ExpressionsPackage#getStatements()
 * @model
 * @generated
 */
public interface Statements extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link expressions.AbstractElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see expressions.ExpressionsPackage#getStatements_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractElement> getElements();

} // Statements
