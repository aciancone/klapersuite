/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dtmc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see dtmc.DtmcPackage
 * @generated
 */
public interface DtmcFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DtmcFactory eINSTANCE = dtmc.impl.DtmcFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Dtmc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dtmc</em>'.
	 * @generated
	 */
	Dtmc createDtmc();

	/**
	 * Returns a new object of class '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node</em>'.
	 * @generated
	 */
	Node createNode();

	/**
	 * Returns a new object of class '<em>Synchronized Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Synchronized Transition</em>'.
	 * @generated
	 */
	SynchronizedTransition createSynchronizedTransition();

	/**
	 * Returns a new object of class '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module</em>'.
	 * @generated
	 */
	Module createModule();

	/**
	 * Returns a new object of class '<em>Call Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call Transition</em>'.
	 * @generated
	 */
	CallTransition createCallTransition();

	/**
	 * Returns a new object of class '<em>Invoked Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Invoked Transition</em>'.
	 * @generated
	 */
	InvokedTransition createInvokedTransition();

	/**
	 * Returns a new object of class '<em>Standard Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Standard Transition</em>'.
	 * @generated
	 */
	StandardTransition createStandardTransition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DtmcPackage getDtmcPackage();

} //DtmcFactory
