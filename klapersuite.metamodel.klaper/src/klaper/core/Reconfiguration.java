/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package klaper.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reconfiguration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link klaper.core.Reconfiguration#getSourceStep <em>Source Step</em>}</li>
 *   <li>{@link klaper.core.Reconfiguration#getTargetService <em>Target Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see klaper.core.CorePackage#getReconfiguration()
 * @model
 * @generated
 */
public interface Reconfiguration extends Activity {
	/**
	 * Returns the value of the '<em><b>Source Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Step</em>' attribute.
	 * @see #setSourceStep(String)
	 * @see klaper.core.CorePackage#getReconfiguration_SourceStep()
	 * @model
	 * @generated
	 */
	String getSourceStep();

	/**
	 * Sets the value of the '{@link klaper.core.Reconfiguration#getSourceStep <em>Source Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Step</em>' attribute.
	 * @see #getSourceStep()
	 * @generated
	 */
	void setSourceStep(String value);

	/**
	 * Returns the value of the '<em><b>Target Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Service</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Service</em>' attribute.
	 * @see #setTargetService(String)
	 * @see klaper.core.CorePackage#getReconfiguration_TargetService()
	 * @model
	 * @generated
	 */
	String getTargetService();

	/**
	 * Sets the value of the '{@link klaper.core.Reconfiguration#getTargetService <em>Target Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Service</em>' attribute.
	 * @see #getTargetService()
	 * @generated
	 */
	void setTargetService(String value);

} // Reconfiguration
