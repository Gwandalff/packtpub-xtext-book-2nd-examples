/**
 */
package expressions;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fun Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link expressions.FunDefinition#getVarNames <em>Var Names</em>}</li>
 *   <li>{@link expressions.FunDefinition#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see expressions.ExpressionsPackage#getFunDefinition()
 * @model
 * @generated
 */
public interface FunDefinition extends AbstractElement {
	/**
	 * Returns the value of the '<em><b>Var Names</b></em>' containment reference list.
	 * The list contents are of type {@link expressions.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var Names</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Names</em>' containment reference list.
	 * @see expressions.ExpressionsPackage#getFunDefinition_VarNames()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getVarNames();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see expressions.ExpressionsPackage#getFunDefinition_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link expressions.FunDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // FunDefinition
