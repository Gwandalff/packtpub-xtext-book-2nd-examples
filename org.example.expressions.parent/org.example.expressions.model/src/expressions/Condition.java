/**
 */
package expressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link expressions.Condition#getExpression <em>Expression</em>}</li>
 *   <li>{@link expressions.Condition#getIfz <em>Ifz</em>}</li>
 *   <li>{@link expressions.Condition#getElsez <em>Elsez</em>}</li>
 * </ul>
 *
 * @see expressions.ExpressionsPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends AbstractElement {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see expressions.ExpressionsPackage#getCondition_Expression()
	 * @model containment="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link expressions.Condition#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Ifz</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifz</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifz</em>' containment reference.
	 * @see #setIfz(Block)
	 * @see expressions.ExpressionsPackage#getCondition_Ifz()
	 * @model containment="true"
	 * @generated
	 */
	Block getIfz();

	/**
	 * Sets the value of the '{@link expressions.Condition#getIfz <em>Ifz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifz</em>' containment reference.
	 * @see #getIfz()
	 * @generated
	 */
	void setIfz(Block value);

	/**
	 * Returns the value of the '<em><b>Elsez</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elsez</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elsez</em>' containment reference.
	 * @see #setElsez(Block)
	 * @see expressions.ExpressionsPackage#getCondition_Elsez()
	 * @model containment="true"
	 * @generated
	 */
	Block getElsez();

	/**
	 * Sets the value of the '{@link expressions.Condition#getElsez <em>Elsez</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elsez</em>' containment reference.
	 * @see #getElsez()
	 * @generated
	 */
	void setElsez(Block value);

} // Condition
