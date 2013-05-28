/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package klaper.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link klaper.core.ServiceControl#getResourceType <em>Resource Type</em>}</li>
 *   <li>{@link klaper.core.ServiceControl#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link klaper.core.ServiceControl#isIsSynch <em>Is Synch</em>}</li>
 *   <li>{@link klaper.core.ServiceControl#isDependsOn <em>Depends On</em>}</li>
 *   <li>{@link klaper.core.ServiceControl#getBinding <em>Binding</em>}</li>
 *   <li>{@link klaper.core.ServiceControl#getActualParam <em>Actual Param</em>}</li>
 * </ul>
 * </p>
 *
 * @see klaper.core.CorePackage#getServiceControl()
 * @model
 * @generated
 */
public interface ServiceControl extends Activity {
	/**
	 * Returns the value of the '<em><b>Resource Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Type</em>' attribute.
	 * @see #setResourceType(String)
	 * @see klaper.core.CorePackage#getServiceControl_ResourceType()
	 * @model
	 * @generated
	 */
	String getResourceType();

	/**
	 * Sets the value of the '{@link klaper.core.ServiceControl#getResourceType <em>Resource Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Type</em>' attribute.
	 * @see #getResourceType()
	 * @generated
	 */
	void setResourceType(String value);

	/**
	 * Returns the value of the '<em><b>Service Name</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Name</em>' attribute.
	 * @see #setServiceName(String)
	 * @see klaper.core.CorePackage#getServiceControl_ServiceName()
	 * @model default="false"
	 * @generated
	 */
	String getServiceName();

	/**
	 * Sets the value of the '{@link klaper.core.ServiceControl#getServiceName <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Name</em>' attribute.
	 * @see #getServiceName()
	 * @generated
	 */
	void setServiceName(String value);

	/**
	 * Returns the value of the '<em><b>Is Synch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Synch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Synch</em>' attribute.
	 * @see #setIsSynch(boolean)
	 * @see klaper.core.CorePackage#getServiceControl_IsSynch()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsSynch();

	/**
	 * Sets the value of the '{@link klaper.core.ServiceControl#isIsSynch <em>Is Synch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Synch</em>' attribute.
	 * @see #isIsSynch()
	 * @generated
	 */
	void setIsSynch(boolean value);

	/**
	 * Returns the value of the '<em><b>Depends On</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depends On</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depends On</em>' attribute.
	 * @see #setDependsOn(boolean)
	 * @see klaper.core.CorePackage#getServiceControl_DependsOn()
	 * @model default="false"
	 * @generated
	 */
	boolean isDependsOn();

	/**
	 * Sets the value of the '{@link klaper.core.ServiceControl#isDependsOn <em>Depends On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depends On</em>' attribute.
	 * @see #isDependsOn()
	 * @generated
	 */
	void setDependsOn(boolean value);

	/**
	 * Returns the value of the '<em><b>Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' containment reference.
	 * @see #setBinding(Binding)
	 * @see klaper.core.CorePackage#getServiceControl_Binding()
	 * @model containment="true"
	 * @generated
	 */
	Binding getBinding();

	/**
	 * Sets the value of the '{@link klaper.core.ServiceControl#getBinding <em>Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding</em>' containment reference.
	 * @see #getBinding()
	 * @generated
	 */
	void setBinding(Binding value);

	/**
	 * Returns the value of the '<em><b>Actual Param</b></em>' containment reference list.
	 * The list contents are of type {@link klaper.core.ActualParam}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Param</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Param</em>' containment reference list.
	 * @see klaper.core.CorePackage#getServiceControl_ActualParam()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActualParam> getActualParam();

} // ServiceControl
