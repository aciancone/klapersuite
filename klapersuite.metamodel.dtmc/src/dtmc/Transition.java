/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dtmc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dtmc.Transition#getProbability <em>Probability</em>}</li>
 *   <li>{@link dtmc.Transition#get_from <em>from</em>}</li>
 *   <li>{@link dtmc.Transition#get_to <em>to</em>}</li>
 *   <li>{@link dtmc.Transition#getModule <em>Module</em>}</li>
 * </ul>
 * </p>
 *
 * @see dtmc.DtmcPackage#getTransition()
 * @model abstract="true"
 * @generated
 */
public interface Transition extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Probability</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Probability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability</em>' attribute.
	 * @see #setProbability(String)
	 * @see dtmc.DtmcPackage#getTransition_Probability()
	 * @model default="1" required="true"
	 * @generated
	 */
	String getProbability();

	/**
	 * Sets the value of the '{@link dtmc.Transition#getProbability <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probability</em>' attribute.
	 * @see #getProbability()
	 * @generated
	 */
	void setProbability(String value);

	/**
	 * Returns the value of the '<em><b>from</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link dtmc.Node#getOutTransitions <em>Out Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>from</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>from</em>' reference.
	 * @see #set_from(Node)
	 * @see dtmc.DtmcPackage#getTransition__from()
	 * @see dtmc.Node#getOutTransitions
	 * @model opposite="outTransitions"
	 * @generated
	 */
	Node get_from();

	/**
	 * Sets the value of the '{@link dtmc.Transition#get_from <em>from</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>from</em>' reference.
	 * @see #get_from()
	 * @generated
	 */
	void set_from(Node value);

	/**
	 * Returns the value of the '<em><b>to</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link dtmc.Node#getInTransitions <em>In Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>to</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>to</em>' reference.
	 * @see #set_to(Node)
	 * @see dtmc.DtmcPackage#getTransition__to()
	 * @see dtmc.Node#getInTransitions
	 * @model opposite="inTransitions"
	 * @generated
	 */
	Node get_to();

	/**
	 * Sets the value of the '{@link dtmc.Transition#get_to <em>to</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>to</em>' reference.
	 * @see #get_to()
	 * @generated
	 */
	void set_to(Node value);

	/**
	 * Returns the value of the '<em><b>Module</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link dtmc.Module#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' container reference.
	 * @see #setModule(Module)
	 * @see dtmc.DtmcPackage#getTransition_Module()
	 * @see dtmc.Module#getTransitions
	 * @model opposite="transitions" required="true" transient="false"
	 * @generated
	 */
	Module getModule();

	/**
	 * Sets the value of the '{@link dtmc.Transition#getModule <em>Module</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' container reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(Module value);

} // Transition
