/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package klaper.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link klaper.core.Service#getName <em>Name</em>}</li>
 *   <li>{@link klaper.core.Service#getSpeedAttr <em>Speed Attr</em>}</li>
 *   <li>{@link klaper.core.Service#getFailAttr <em>Fail Attr</em>}</li>
 *   <li>{@link klaper.core.Service#getDescription <em>Description</em>}</li>
 *   <li>{@link klaper.core.Service#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link klaper.core.Service#getFormalParams <em>Formal Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see klaper.core.CorePackage#getService()
 * @model
 * @generated
 */
public interface Service extends EObject {
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
	 * @see klaper.core.CorePackage#getService_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link klaper.core.Service#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Speed Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speed Attr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed Attr</em>' attribute.
	 * @see #setSpeedAttr(double)
	 * @see klaper.core.CorePackage#getService_SpeedAttr()
	 * @model
	 * @generated
	 */
	double getSpeedAttr();

	/**
	 * Sets the value of the '{@link klaper.core.Service#getSpeedAttr <em>Speed Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed Attr</em>' attribute.
	 * @see #getSpeedAttr()
	 * @generated
	 */
	void setSpeedAttr(double value);

	/**
	 * Returns the value of the '<em><b>Fail Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fail Attr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fail Attr</em>' attribute.
	 * @see #setFailAttr(double)
	 * @see klaper.core.CorePackage#getService_FailAttr()
	 * @model
	 * @generated
	 */
	double getFailAttr();

	/**
	 * Sets the value of the '{@link klaper.core.Service#getFailAttr <em>Fail Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fail Attr</em>' attribute.
	 * @see #getFailAttr()
	 * @generated
	 */
	void setFailAttr(double value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see klaper.core.CorePackage#getService_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link klaper.core.Service#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavior</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior</em>' containment reference.
	 * @see #setBehavior(Behavior)
	 * @see klaper.core.CorePackage#getService_Behavior()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Behavior getBehavior();

	/**
	 * Sets the value of the '{@link klaper.core.Service#getBehavior <em>Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior</em>' containment reference.
	 * @see #getBehavior()
	 * @generated
	 */
	void setBehavior(Behavior value);

	/**
	 * Returns the value of the '<em><b>Formal Params</b></em>' containment reference list.
	 * The list contents are of type {@link klaper.core.FormalParam}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formal Params</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formal Params</em>' containment reference list.
	 * @see klaper.core.CorePackage#getService_FormalParams()
	 * @model containment="true"
	 * @generated
	 */
	EList<FormalParam> getFormalParams();

} // Service
