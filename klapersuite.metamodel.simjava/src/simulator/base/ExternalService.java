/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simulator.base;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link simulator.base.ExternalService#getServiceCall <em>Service Call</em>}</li>
 *   <li>{@link simulator.base.ExternalService#getFailProb <em>Fail Prob</em>}</li>
 * </ul>
 * </p>
 *
 * @see simulator.base.BasePackage#getExternalService()
 * @model
 * @generated
 */
public interface ExternalService extends Step {
	/**
	 * Returns the value of the '<em><b>Service Call</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Call</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Call</em>' containment reference.
	 * @see #setServiceCall(ServiceCall)
	 * @see simulator.base.BasePackage#getExternalService_ServiceCall()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ServiceCall getServiceCall();

	/**
	 * Sets the value of the '{@link simulator.base.ExternalService#getServiceCall <em>Service Call</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Call</em>' containment reference.
	 * @see #getServiceCall()
	 * @generated
	 */
	void setServiceCall(ServiceCall value);

	/**
	 * Returns the value of the '<em><b>Fail Prob</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fail Prob</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fail Prob</em>' containment reference.
	 * @see #setFailProb(ContinuousFailMode)
	 * @see simulator.base.BasePackage#getExternalService_FailProb()
	 * @model containment="true"
	 * @generated
	 */
	ContinuousFailMode getFailProb();

	/**
	 * Sets the value of the '{@link simulator.base.ExternalService#getFailProb <em>Fail Prob</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fail Prob</em>' containment reference.
	 * @see #getFailProb()
	 * @generated
	 */
	void setFailProb(ContinuousFailMode value);

} // ExternalService
