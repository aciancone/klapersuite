/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lqn;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Def Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lqn.ActivityDefBase#getName <em>Name</em>}</li>
 *   <li>{@link lqn.ActivityDefBase#getHostDemandMean <em>Host Demand Mean</em>}</li>
 *   <li>{@link lqn.ActivityDefBase#getHostDemandCvsq <em>Host Demand Cvsq</em>}</li>
 *   <li>{@link lqn.ActivityDefBase#getThinkTime <em>Think Time</em>}</li>
 *   <li>{@link lqn.ActivityDefBase#getMaxServiceTime <em>Max Service Time</em>}</li>
 *   <li>{@link lqn.ActivityDefBase#getCallOrder <em>Call Order</em>}</li>
 * </ul>
 * </p>
 *
 * @see lqn.LqnPackage#getActivityDefBase()
 * @model
 * @generated
 */
public interface ActivityDefBase extends EObject {
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
	 * @see lqn.LqnPackage#getActivityDefBase_Name()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link lqn.ActivityDefBase#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Host Demand Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Demand Mean</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Demand Mean</em>' attribute.
	 * @see #setHostDemandMean(double)
	 * @see lqn.LqnPackage#getActivityDefBase_HostDemandMean()
	 * @model unique="false" required="true"
	 * @generated
	 */
	double getHostDemandMean();

	/**
	 * Sets the value of the '{@link lqn.ActivityDefBase#getHostDemandMean <em>Host Demand Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Demand Mean</em>' attribute.
	 * @see #getHostDemandMean()
	 * @generated
	 */
	void setHostDemandMean(double value);

	/**
	 * Returns the value of the '<em><b>Host Demand Cvsq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Demand Cvsq</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Demand Cvsq</em>' attribute.
	 * @see #setHostDemandCvsq(double)
	 * @see lqn.LqnPackage#getActivityDefBase_HostDemandCvsq()
	 * @model unique="false"
	 * @generated
	 */
	double getHostDemandCvsq();

	/**
	 * Sets the value of the '{@link lqn.ActivityDefBase#getHostDemandCvsq <em>Host Demand Cvsq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Demand Cvsq</em>' attribute.
	 * @see #getHostDemandCvsq()
	 * @generated
	 */
	void setHostDemandCvsq(double value);

	/**
	 * Returns the value of the '<em><b>Think Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Think Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Think Time</em>' attribute.
	 * @see #setThinkTime(double)
	 * @see lqn.LqnPackage#getActivityDefBase_ThinkTime()
	 * @model unique="false"
	 * @generated
	 */
	double getThinkTime();

	/**
	 * Sets the value of the '{@link lqn.ActivityDefBase#getThinkTime <em>Think Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Think Time</em>' attribute.
	 * @see #getThinkTime()
	 * @generated
	 */
	void setThinkTime(double value);

	/**
	 * Returns the value of the '<em><b>Max Service Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Service Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Service Time</em>' attribute.
	 * @see #setMaxServiceTime(double)
	 * @see lqn.LqnPackage#getActivityDefBase_MaxServiceTime()
	 * @model unique="false"
	 * @generated
	 */
	double getMaxServiceTime();

	/**
	 * Sets the value of the '{@link lqn.ActivityDefBase#getMaxServiceTime <em>Max Service Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Service Time</em>' attribute.
	 * @see #getMaxServiceTime()
	 * @generated
	 */
	void setMaxServiceTime(double value);

	/**
	 * Returns the value of the '<em><b>Call Order</b></em>' attribute.
	 * The literals are from the enumeration {@link lqn.CallOrder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Order</em>' attribute.
	 * @see lqn.CallOrder
	 * @see #setCallOrder(CallOrder)
	 * @see lqn.LqnPackage#getActivityDefBase_CallOrder()
	 * @model unique="false"
	 * @generated
	 */
	CallOrder getCallOrder();

	/**
	 * Sets the value of the '{@link lqn.ActivityDefBase#getCallOrder <em>Call Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Call Order</em>' attribute.
	 * @see lqn.CallOrder
	 * @see #getCallOrder()
	 * @generated
	 */
	void setCallOrder(CallOrder value);

} // ActivityDefBase
