/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package klaper.expr.provider;


import java.util.Collection;
import java.util.List;

import klaper.core.CoreFactory;

import klaper.expr.ExprFactory;
import klaper.expr.ExprPackage;
import klaper.expr.Unary;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link klaper.expr.Unary} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UnaryItemProvider
	extends ExpressionItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ExprPackage.Literals.UNARY__OPERATOR);
			childrenFeatures.add(ExprPackage.Literals.UNARY__ELEMENT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Unary.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Unary"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Unary_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Unary.class)) {
			case ExprPackage.UNARY__OPERATOR:
			case ExprPackage.UNARY__ELEMENT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ExprPackage.Literals.UNARY__OPERATOR,
				 ExprFactory.eINSTANCE.createMinus()));

		newChildDescriptors.add
			(createChildParameter
				(ExprPackage.Literals.UNARY__ELEMENT,
				 ExprFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExprPackage.Literals.UNARY__ELEMENT,
				 ExprFactory.eINSTANCE.createAtom()));

		newChildDescriptors.add
			(createChildParameter
				(ExprPackage.Literals.UNARY__ELEMENT,
				 ExprFactory.eINSTANCE.createNumber()));

		newChildDescriptors.add
			(createChildParameter
				(ExprPackage.Literals.UNARY__ELEMENT,
				 ExprFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ExprPackage.Literals.UNARY__ELEMENT,
				 ExprFactory.eINSTANCE.createInteger()));

		newChildDescriptors.add
			(createChildParameter
				(ExprPackage.Literals.UNARY__ELEMENT,
				 ExprFactory.eINSTANCE.createDouble()));

		newChildDescriptors.add
			(createChildParameter
				(ExprPackage.Literals.UNARY__ELEMENT,
				 ExprFactory.eINSTANCE.createUnary()));

		newChildDescriptors.add
			(createChildParameter
				(ExprPackage.Literals.UNARY__ELEMENT,
				 ExprFactory.eINSTANCE.createBinary()));

		newChildDescriptors.add
			(createChildParameter
				(ExprPackage.Literals.UNARY__ELEMENT,
				 CoreFactory.eINSTANCE.createParamVariable()));
	}

}
