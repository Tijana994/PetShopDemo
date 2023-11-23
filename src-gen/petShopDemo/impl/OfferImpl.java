/**
 */
package petShopDemo.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;

import org.eclipse.ocl.pivot.library.collection.CollectionAsSequenceOperation;
import org.eclipse.ocl.pivot.library.collection.OrderedCollectionFirstOperation;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.messages.PivotMessages;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SequenceValue;
import org.eclipse.ocl.pivot.values.SetValue;

import petShopDemo.Company;
import petShopDemo.Offer;
import petShopDemo.PetShopDemoPackage;
import petShopDemo.PetShopDemoTables;
import petShopDemo.Principal;
import petShopDemo.Product;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Offer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petShopDemo.impl.OfferImpl#getProducts <em>Products</em>}</li>
 *   <li>{@link petShopDemo.impl.OfferImpl#isIsMembersOnly <em>Is Members Only</em>}</li>
 *   <li>{@link petShopDemo.impl.OfferImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link petShopDemo.impl.OfferImpl#getFrom <em>From</em>}</li>
 *   <li>{@link petShopDemo.impl.OfferImpl#getTo <em>To</em>}</li>
 *   <li>{@link petShopDemo.impl.OfferImpl#isIsActive <em>Is Active</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OfferImpl extends NamedElementImpl implements Offer {
	/**
	 * The cached value of the '{@link #getProducts() <em>Products</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducts()
	 * @generated
	 * @ordered
	 */
	protected EList<Product> products;

	/**
	 * The default value of the '{@link #isIsMembersOnly() <em>Is Members Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMembersOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MEMBERS_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMembersOnly() <em>Is Members Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMembersOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean isMembersOnly = IS_MEMBERS_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final double PRICE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected double price = PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected static final Date FROM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected Date from = FROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected static final Date TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected Date to = TO_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsActive() <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ACTIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsActive() <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsActive()
	 * @generated
	 * @ordered
	 */
	protected boolean isActive = IS_ACTIVE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OfferImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetShopDemoPackage.Literals.OFFER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Product> getProducts() {
		if (products == null) {
			products = new EObjectResolvingEList<Product>(Product.class, this, PetShopDemoPackage.OFFER__PRODUCTS);
		}
		return products;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsMembersOnly() {
		return isMembersOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsMembersOnly(boolean newIsMembersOnly) {
		boolean oldIsMembersOnly = isMembersOnly;
		isMembersOnly = newIsMembersOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetShopDemoPackage.OFFER__IS_MEMBERS_ONLY,
					oldIsMembersOnly, isMembersOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrice(double newPrice) {
		double oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetShopDemoPackage.OFFER__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFrom(Date newFrom) {
		Date oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetShopDemoPackage.OFFER__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTo(Date newTo) {
		Date oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetShopDemoPackage.OFFER__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsActive() {
		return isActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsActive(boolean newIsActive) {
		boolean oldIsActive = isActive;
		isActive = newIsActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetShopDemoPackage.OFFER__IS_ACTIVE, oldIsActive,
					isActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean NeedApprovalForNotification(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Offer::NeedApprovalForNotification";
		try {
			/**
			 *
			 * inv NeedApprovalForNotification:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = if self.from = null
			 *         then false
			 *         else
			 *           let
			 *             company : Company[1] = Company.allInstances()
			 *             ->asSequence()
			 *             ->first()
			 *           in
			 *             company.customers->exists(customer | customer.name = 'Tommo' and customer.approval)
			 *         endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PetShopDemoPackage.Literals.OFFER___NEED_APPROVAL_FOR_NOTIFICATION__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PetShopDemoTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				/*@Caught*/ Object CAUGHT_exists;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_petShopDemo_c_c_Company = idResolver
							.getClass(PetShopDemoTables.CLSSid_Company, null);
					final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE
							.evaluate(executor, PetShopDemoTables.SET_CLSSid_Company, TYP_petShopDemo_c_c_Company);
					final /*@NonInvalid*/ SequenceValue asSequence = CollectionAsSequenceOperation.INSTANCE
							.evaluate(allInstances);
					final /*@Thrown*/ Company company = (Company) OrderedCollectionFirstOperation.INSTANCE
							.evaluate(asSequence);
					if (company == null) {
						throw new InvalidValueException(
								"Null source for \'\'http://petShopDemo\'::Company::customers\'");
					}
					final /*@Thrown*/ List<Principal> customers = company.getCustomers();
					final /*@Thrown*/ OrderedSetValue BOXED_customers = idResolver
							.createOrderedSetOfAll(PetShopDemoTables.ORD_CLSSid_Principal, customers);
					/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
					Iterator<Object> ITERATOR_customer = BOXED_customers.iterator();
					/*@Thrown*/ Boolean exists;
					while (true) {
						if (!ITERATOR_customer.hasNext()) {
							if (accumulator == null) {
								exists = null;
							} else if (accumulator == ValueUtil.FALSE_VALUE) {
								exists = ValueUtil.FALSE_VALUE;
							} else {
								throw (InvalidValueException) accumulator;
							}
							break;
						}
						/*@NonInvalid*/ Principal customer = (Principal) ITERATOR_customer.next();
						/**
						 * customer.name = 'Tommo' and customer.approval
						 */
						final /*@NonInvalid*/ String name = customer.getName();
						final /*@NonInvalid*/ boolean eq = name.equals(PetShopDemoTables.STR_Tommo);
						final /*@NonInvalid*/ Boolean and;
						if (!eq) {
							and = ValueUtil.FALSE_VALUE;
						} else {
							final /*@NonInvalid*/ boolean approval = customer.isApproval();
							if (!approval) {
								and = ValueUtil.FALSE_VALUE;
							} else {
								and = ValueUtil.TRUE_VALUE;
							}
						}
						//
						if (and == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
							exists = ValueUtil.TRUE_VALUE;
							break; // Stop immediately
						} else if (and == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
							; // Carry on
						} else if (and == null) { // Abnormal null body evaluation result
							if (accumulator == ValueUtil.FALSE_VALUE) {
								accumulator = null; // Cache a null failure
							}
						} else { // Impossible badly typed result
							accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
						}
					}
					CAUGHT_exists = exists;
				} catch (Exception e) {
					CAUGHT_exists = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_exists, PetShopDemoTables.INT_0)
						.booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PetShopDemoPackage.OFFER__PRODUCTS:
			return getProducts();
		case PetShopDemoPackage.OFFER__IS_MEMBERS_ONLY:
			return isIsMembersOnly();
		case PetShopDemoPackage.OFFER__PRICE:
			return getPrice();
		case PetShopDemoPackage.OFFER__FROM:
			return getFrom();
		case PetShopDemoPackage.OFFER__TO:
			return getTo();
		case PetShopDemoPackage.OFFER__IS_ACTIVE:
			return isIsActive();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PetShopDemoPackage.OFFER__PRODUCTS:
			getProducts().clear();
			getProducts().addAll((Collection<? extends Product>) newValue);
			return;
		case PetShopDemoPackage.OFFER__IS_MEMBERS_ONLY:
			setIsMembersOnly((Boolean) newValue);
			return;
		case PetShopDemoPackage.OFFER__PRICE:
			setPrice((Double) newValue);
			return;
		case PetShopDemoPackage.OFFER__FROM:
			setFrom((Date) newValue);
			return;
		case PetShopDemoPackage.OFFER__TO:
			setTo((Date) newValue);
			return;
		case PetShopDemoPackage.OFFER__IS_ACTIVE:
			setIsActive((Boolean) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case PetShopDemoPackage.OFFER__PRODUCTS:
			getProducts().clear();
			return;
		case PetShopDemoPackage.OFFER__IS_MEMBERS_ONLY:
			setIsMembersOnly(IS_MEMBERS_ONLY_EDEFAULT);
			return;
		case PetShopDemoPackage.OFFER__PRICE:
			setPrice(PRICE_EDEFAULT);
			return;
		case PetShopDemoPackage.OFFER__FROM:
			setFrom(FROM_EDEFAULT);
			return;
		case PetShopDemoPackage.OFFER__TO:
			setTo(TO_EDEFAULT);
			return;
		case PetShopDemoPackage.OFFER__IS_ACTIVE:
			setIsActive(IS_ACTIVE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case PetShopDemoPackage.OFFER__PRODUCTS:
			return products != null && !products.isEmpty();
		case PetShopDemoPackage.OFFER__IS_MEMBERS_ONLY:
			return isMembersOnly != IS_MEMBERS_ONLY_EDEFAULT;
		case PetShopDemoPackage.OFFER__PRICE:
			return price != PRICE_EDEFAULT;
		case PetShopDemoPackage.OFFER__FROM:
			return FROM_EDEFAULT == null ? from != null : !FROM_EDEFAULT.equals(from);
		case PetShopDemoPackage.OFFER__TO:
			return TO_EDEFAULT == null ? to != null : !TO_EDEFAULT.equals(to);
		case PetShopDemoPackage.OFFER__IS_ACTIVE:
			return isActive != IS_ACTIVE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case PetShopDemoPackage.OFFER___NEED_APPROVAL_FOR_NOTIFICATION__DIAGNOSTICCHAIN_MAP:
			return NeedApprovalForNotification((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (isMembersOnly: ");
		result.append(isMembersOnly);
		result.append(", price: ");
		result.append(price);
		result.append(", from: ");
		result.append(from);
		result.append(", to: ");
		result.append(to);
		result.append(", isActive: ");
		result.append(isActive);
		result.append(')');
		return result.toString();
	}

} //OfferImpl
