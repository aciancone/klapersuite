/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lqn;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lqn.LqnModel#getName <em>Name</em>}</li>
 *   <li>{@link lqn.LqnModel#getDescription <em>Description</em>}</li>
 *   <li>{@link lqn.LqnModel#getLqnSchemaVersion <em>Lqn Schema Version</em>}</li>
 *   <li>{@link lqn.LqnModel#getLqncoreSchemaVersion <em>Lqncore Schema Version</em>}</li>
 *   <li>{@link lqn.LqnModel#getProcessor <em>Processor</em>}</li>
 * </ul>
 * </p>
 *
 * @see lqn.LqnPackage#getLqnModel()
 * @model
 * @generated
 */
public interface LqnModel extends EObject {
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
	 * @see lqn.LqnPackage#getLqnModel_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link lqn.LqnModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see lqn.LqnPackage#getLqnModel_Description()
	 * @model unique="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link lqn.LqnModel#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Lqn Schema Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lqn Schema Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lqn Schema Version</em>' attribute.
	 * @see #setLqnSchemaVersion(String)
	 * @see lqn.LqnPackage#getLqnModel_LqnSchemaVersion()
	 * @model unique="false"
	 * @generated
	 */
	String getLqnSchemaVersion();

	/**
	 * Sets the value of the '{@link lqn.LqnModel#getLqnSchemaVersion <em>Lqn Schema Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lqn Schema Version</em>' attribute.
	 * @see #getLqnSchemaVersion()
	 * @generated
	 */
	void setLqnSchemaVersion(String value);

	/**
	 * Returns the value of the '<em><b>Lqncore Schema Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lqncore Schema Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lqncore Schema Version</em>' attribute.
	 * @see #setLqncoreSchemaVersion(String)
	 * @see lqn.LqnPackage#getLqnModel_LqncoreSchemaVersion()
	 * @model unique="false"
	 * @generated
	 */
	String getLqncoreSchemaVersion();

	/**
	 * Sets the value of the '{@link lqn.LqnModel#getLqncoreSchemaVersion <em>Lqncore Schema Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lqncore Schema Version</em>' attribute.
	 * @see #getLqncoreSchemaVersion()
	 * @generated
	 */
	void setLqncoreSchemaVersion(String value);

	/**
	 * Returns the value of the '<em><b>Processor</b></em>' containment reference list.
	 * The list contents are of type {@link lqn.Processor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processor</em>' containment reference list.
	 * @see lqn.LqnPackage#getLqnModel_Processor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Processor> getProcessor();

} // LqnModel
