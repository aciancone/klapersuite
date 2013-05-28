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
 * A representation of the model object '<em><b>Precedence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lqn.Precedence#getPre <em>Pre</em>}</li>
 *   <li>{@link lqn.Precedence#getPost <em>Post</em>}</li>
 *   <li>{@link lqn.Precedence#getPreAND <em>Pre AND</em>}</li>
 *   <li>{@link lqn.Precedence#getPostAND <em>Post AND</em>}</li>
 *   <li>{@link lqn.Precedence#getPreOR <em>Pre OR</em>}</li>
 *   <li>{@link lqn.Precedence#getPostOR <em>Post OR</em>}</li>
 *   <li>{@link lqn.Precedence#getPostLOOP <em>Post LOOP</em>}</li>
 * </ul>
 * </p>
 *
 * @see lqn.LqnPackage#getPrecedence()
 * @model
 * @generated
 */
public interface Precedence extends EObject {
	/**
	 * Returns the value of the '<em><b>Pre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre</em>' containment reference.
	 * @see #setPre(SingleActivityList)
	 * @see lqn.LqnPackage#getPrecedence_Pre()
	 * @model containment="true"
	 * @generated
	 */
	SingleActivityList getPre();

	/**
	 * Sets the value of the '{@link lqn.Precedence#getPre <em>Pre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre</em>' containment reference.
	 * @see #getPre()
	 * @generated
	 */
	void setPre(SingleActivityList value);

	/**
	 * Returns the value of the '<em><b>Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post</em>' containment reference.
	 * @see #setPost(SingleActivityList)
	 * @see lqn.LqnPackage#getPrecedence_Post()
	 * @model containment="true"
	 * @generated
	 */
	SingleActivityList getPost();

	/**
	 * Sets the value of the '{@link lqn.Precedence#getPost <em>Post</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post</em>' containment reference.
	 * @see #getPost()
	 * @generated
	 */
	void setPost(SingleActivityList value);

	/**
	 * Returns the value of the '<em><b>Pre AND</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre AND</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre AND</em>' containment reference.
	 * @see #setPreAND(AndJoinList)
	 * @see lqn.LqnPackage#getPrecedence_PreAND()
	 * @model containment="true"
	 * @generated
	 */
	AndJoinList getPreAND();

	/**
	 * Sets the value of the '{@link lqn.Precedence#getPreAND <em>Pre AND</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre AND</em>' containment reference.
	 * @see #getPreAND()
	 * @generated
	 */
	void setPreAND(AndJoinList value);

	/**
	 * Returns the value of the '<em><b>Post AND</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post AND</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post AND</em>' containment reference.
	 * @see #setPostAND(ActivityList)
	 * @see lqn.LqnPackage#getPrecedence_PostAND()
	 * @model containment="true"
	 * @generated
	 */
	ActivityList getPostAND();

	/**
	 * Sets the value of the '{@link lqn.Precedence#getPostAND <em>Post AND</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post AND</em>' containment reference.
	 * @see #getPostAND()
	 * @generated
	 */
	void setPostAND(ActivityList value);

	/**
	 * Returns the value of the '<em><b>Pre OR</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre OR</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre OR</em>' containment reference.
	 * @see #setPreOR(ActivityList)
	 * @see lqn.LqnPackage#getPrecedence_PreOR()
	 * @model containment="true"
	 * @generated
	 */
	ActivityList getPreOR();

	/**
	 * Sets the value of the '{@link lqn.Precedence#getPreOR <em>Pre OR</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre OR</em>' containment reference.
	 * @see #getPreOR()
	 * @generated
	 */
	void setPreOR(ActivityList value);

	/**
	 * Returns the value of the '<em><b>Post OR</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post OR</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post OR</em>' containment reference.
	 * @see #setPostOR(OrList)
	 * @see lqn.LqnPackage#getPrecedence_PostOR()
	 * @model containment="true"
	 * @generated
	 */
	OrList getPostOR();

	/**
	 * Sets the value of the '{@link lqn.Precedence#getPostOR <em>Post OR</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post OR</em>' containment reference.
	 * @see #getPostOR()
	 * @generated
	 */
	void setPostOR(OrList value);

	/**
	 * Returns the value of the '<em><b>Post LOOP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post LOOP</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post LOOP</em>' containment reference.
	 * @see #setPostLOOP(ActivityLoopList)
	 * @see lqn.LqnPackage#getPrecedence_PostLOOP()
	 * @model containment="true"
	 * @generated
	 */
	ActivityLoopList getPostLOOP();

	/**
	 * Sets the value of the '{@link lqn.Precedence#getPostLOOP <em>Post LOOP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post LOOP</em>' containment reference.
	 * @see #getPostLOOP()
	 * @generated
	 */
	void setPostLOOP(ActivityLoopList value);

} // Precedence
