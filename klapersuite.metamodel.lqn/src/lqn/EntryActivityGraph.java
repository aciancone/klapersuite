/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lqn;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry Activity Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lqn.EntryActivityGraph#getReplyActivity <em>Reply Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @see lqn.LqnPackage#getEntryActivityGraph()
 * @model
 * @generated
 */
public interface EntryActivityGraph extends ActivityGraph {
	/**
	 * Returns the value of the '<em><b>Reply Activity</b></em>' containment reference list.
	 * The list contents are of type {@link lqn.ReplyActivity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reply Activity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reply Activity</em>' containment reference list.
	 * @see lqn.LqnPackage#getEntryActivityGraph_ReplyActivity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ReplyActivity> getReplyActivity();

} // EntryActivityGraph
