/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package klaper.probability.provider;


import java.util.Collection;
import java.util.List;

import klaper.core.CoreFactory;

import klaper.expr.ExprFactory;

import klaper.probability.Exponential;
import klaper.probability.ProbabilityPackage;

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
 * This is the item provider adapter for a {@link klaper.probability.Exponential} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExponentialItemProvider
	extends ProbabilityDistributionFunctionItemProvider
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
	public ExponentialItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(ProbabilityPackage.Literals.EXPONENTIAL__MEAN);
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
	 * This returns Exponential.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Exponential"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Exponential_type");
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

		switch (notification.getFeatureID(Exponential.class)) {
			case ProbabilityPackage.EXPONENTIAL__MEAN:
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
				(ProbabilityPackage.Literals.EXPONENTIAL__MEAN,
				 CoreFactory.eINSTANCE.createParamVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ProbabilityPackage.Literals.EXPONENTIAL__MEAN,
				 ExprFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ProbabilityPackage.Literals.EXPONENTIAL__MEAN,
				 ExprFactory.eINSTANCE.createAtom()));

		newChildDescriptors.add
			(createChildParameter
				(ProbabilityPackage.Literals.EXPONENTIAL__MEAN,
				 ExprFactory.eINSTANCE.createNumber()));

		newChildDescriptors.add
			(createChildParameter
				(ProbabilityPackage.Literals.EXPONENTIAL__MEAN,
				 ExprFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ProbabilityPackage.Literals.EXPONENTIAL__MEAN,
				 ExprFactory.eINSTANCE.createInteger()));

		newChildDescriptors.add
			(createChildParameter
				(ProbabilityPackage.Literals.EXPONENTIAL__MEAN,
				 ExprFactory.eINSTANCE.createDouble()));

		newChildDescriptors.add
			(createChildParameter
				(ProbabilityPackage.Literals.EXPONENTIAL__MEAN,
				 ExprFactory.eINSTANCE.createUnary()));

		newChildDescriptors.add
			(createChildParameter
				(ProbabilityPackage.Literals.EXPONENTIAL__MEAN,
				 ExprFactory.eINSTANCE.createBinary()));
	}

}
