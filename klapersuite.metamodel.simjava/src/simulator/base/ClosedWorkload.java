/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simulator.base;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Closed Workload</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link simulator.base.ClosedWorkload#getPopulation <em>Population</em>}</li>
 * </ul>
 * </p>
 *
 * @see simulator.base.BasePackage#getClosedWorkload()
 * @model
 * @generated
 */
public interface ClosedWorkload extends Workload {
	/**
	 * Returns the value of the '<em><b>Population</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Population</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Population</em>' attribute.
	 * @see #setPopulation(int)
	 * @see simulator.base.BasePackage#getClosedWorkload_Population()
	 * @model required="true"
	 * @generated
	 */
	int getPopulation();

	/**
	 * Sets the value of the '{@link simulator.base.ClosedWorkload#getPopulation <em>Population</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Population</em>' attribute.
	 * @see #getPopulation()
	 * @generated
	 */
	void setPopulation(int value);

} // ClosedWorkload
