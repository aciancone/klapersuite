/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dtmc;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dtmc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dtmc.Dtmc#getModules <em>Modules</em>}</li>
 * </ul>
 * </p>
 *
 * @see dtmc.DtmcPackage#getDtmc()
 * @model
 * @generated
 */
public interface Dtmc extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Modules</b></em>' containment reference list.
	 * The list contents are of type {@link dtmc.Module}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules</em>' containment reference list.
	 * @see dtmc.DtmcPackage#getDtmc_Modules()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Module> getModules();

} // Dtmc
