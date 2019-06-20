/**
 */
package expressions;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link expressions.Context#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see expressions.ExpressionsPackage#getContext()
 * @model
 * @generated
 */
public interface Context extends EObject {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link expressions.Value},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' map.
	 * @see expressions.ExpressionsPackage#getContext_Values()
	 * @model mapType="expressions.StringToValueBindingMap&lt;org.eclipse.emf.ecore.EString, expressions.Value&gt;"
	 * @generated
	 */
	EMap<String, Value> getValues();

} // Context
