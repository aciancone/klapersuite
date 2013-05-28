/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package klaper.probability;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Histogram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link klaper.probability.Histogram#getSamples <em>Samples</em>}</li>
 * </ul>
 * </p>
 *
 * @see klaper.probability.ProbabilityPackage#getHistogram()
 * @model
 * @generated
 */
public interface Histogram extends ProbabilityDistributionFunction {
	/**
	 * Returns the value of the '<em><b>Samples</b></em>' containment reference list.
	 * The list contents are of type {@link klaper.probability.HistogramSample}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Samples</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Samples</em>' containment reference list.
	 * @see klaper.probability.ProbabilityPackage#getHistogram_Samples()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<HistogramSample> getSamples();

} // Histogram
