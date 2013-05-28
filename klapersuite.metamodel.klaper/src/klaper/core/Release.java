/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package klaper.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Release</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link klaper.core.Release#getResourceUnit <em>Resource Unit</em>}</li>
 *   <li>{@link klaper.core.Release#getResource <em>Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see klaper.core.CorePackage#getRelease()
 * @model
 * @generated
 */
public interface Release extends Activity {
	/**
	 * Returns the value of the '<em><b>Resource Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Unit</em>' attribute.
	 * @see #setResourceUnit(int)
	 * @see klaper.core.CorePackage#getRelease_ResourceUnit()
	 * @model required="true"
	 * @generated
	 */
	int getResourceUnit();

	/**
	 * Sets the value of the '{@link klaper.core.Release#getResourceUnit <em>Resource Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Unit</em>' attribute.
	 * @see #getResourceUnit()
	 * @generated
	 */
	void setResourceUnit(int value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' reference.
	 * @see #setResource(Resource)
	 * @see klaper.core.CorePackage#getRelease_Resource()
	 * @model
	 * @generated
	 */
	Resource getResource();

	/**
	 * Sets the value of the '{@link klaper.core.Release#getResource <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(Resource value);

} // Release
