/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package q4bpmn;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see q4bpmn.Q4bpmnPackage
 * @generated
 */
public interface Q4bpmnFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Q4bpmnFactory eINSTANCE = q4bpmn.impl.Q4bpmnFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	Property createProperty();

	/**
	 * Returns a new object of class '<em>Named Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Entity</em>'.
	 * @generated
	 */
	NamedEntity createNamedEntity();

	/**
	 * Returns a new object of class '<em>Property Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Model</em>'.
	 * @generated
	 */
	PropertyModel createPropertyModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Q4bpmnPackage getQ4bpmnPackage();

} //Q4bpmnFactory
