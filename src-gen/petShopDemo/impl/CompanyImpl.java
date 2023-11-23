/**
 */
package petShopDemo.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.StandardLibrary;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.internal.library.executor.ExecutorMultipleIterationManager;

import org.eclipse.ocl.pivot.library.AbstractSimpleOperation;

import org.eclipse.ocl.pivot.library.LibraryIteration.LibraryIterationExtension;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.TupleValue;

import petShopDemo.Company;
import petShopDemo.Offer;
import petShopDemo.PetShopDemoPackage;
import petShopDemo.PetShopDemoTables;
import petShopDemo.Principal;
import petShopDemo.Product;
import petShopDemo.Shop;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Company</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petShopDemo.impl.CompanyImpl#getShops <em>Shops</em>}</li>
 *   <li>{@link petShopDemo.impl.CompanyImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link petShopDemo.impl.CompanyImpl#getOffers <em>Offers</em>}</li>
 *   <li>{@link petShopDemo.impl.CompanyImpl#getCustomers <em>Customers</em>}</li>
 *   <li>{@link petShopDemo.impl.CompanyImpl#getEmployees <em>Employees</em>}</li>
 *   <li>{@link petShopDemo.impl.CompanyImpl#getProducts <em>Products</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompanyImpl extends NamedElementImpl implements Company {
	/**
	 * The cached value of the '{@link #getShops() <em>Shops</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShops()
	 * @generated
	 * @ordered
	 */
	protected EList<Shop> shops;

	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected Principal owner;

	/**
	 * The cached value of the '{@link #getOffers() <em>Offers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffers()
	 * @generated
	 * @ordered
	 */
	protected EList<Offer> offers;

	/**
	 * The cached value of the '{@link #getCustomers() <em>Customers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomers()
	 * @generated
	 * @ordered
	 */
	protected EList<Principal> customers;

	/**
	 * The cached value of the '{@link #getEmployees() <em>Employees</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployees()
	 * @generated
	 * @ordered
	 */
	protected EList<Principal> employees;

	/**
	 * The cached value of the '{@link #getProducts() <em>Products</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducts()
	 * @generated
	 * @ordered
	 */
	protected EList<Product> products;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompanyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetShopDemoPackage.Literals.COMPANY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Shop> getShops() {
		if (shops == null) {
			shops = new EObjectContainmentEList<Shop>(Shop.class, this, PetShopDemoPackage.COMPANY__SHOPS);
		}
		return shops;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Principal getOwner() {
		if (owner != null && owner.eIsProxy()) {
			InternalEObject oldOwner = (InternalEObject) owner;
			owner = (Principal) eResolveProxy(oldOwner);
			if (owner != oldOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PetShopDemoPackage.COMPANY__OWNER,
							oldOwner, owner));
			}
		}
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Principal basicGetOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwner(Principal newOwner) {
		Principal oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetShopDemoPackage.COMPANY__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Offer> getOffers() {
		if (offers == null) {
			offers = new EObjectContainmentEList<Offer>(Offer.class, this, PetShopDemoPackage.COMPANY__OFFERS);
		}
		return offers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Principal> getCustomers() {
		if (customers == null) {
			customers = new EObjectContainmentEList<Principal>(Principal.class, this,
					PetShopDemoPackage.COMPANY__CUSTOMERS);
		}
		return customers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Principal> getEmployees() {
		if (employees == null) {
			employees = new EObjectContainmentEList<Principal>(Principal.class, this,
					PetShopDemoPackage.COMPANY__EMPLOYEES);
		}
		return employees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Product> getProducts() {
		if (products == null) {
			products = new EObjectContainmentEList<Product>(Product.class, this, PetShopDemoPackage.COMPANY__PRODUCTS);
		}
		return products;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean UniqueCustomerName(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Company::UniqueCustomerName";
		try {
			/**
			 *
			 * inv UniqueCustomerName:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = self.customers->forAll(customer1, customer2 | customer1.name = customer2.name implies customer1 = customer2)
			 *         in
			 *           if status = true
			 *           then true
			 *           else Tuple{message = 'Customer name is unique', status = status}
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ StandardLibrary standardLibrary = idResolver.getStandardLibrary();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PetShopDemoPackage.Literals.COMPANY___UNIQUE_CUSTOMER_NAME__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PetShopDemoTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_6;
			if (le) {
				local_6 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_5;
				try {
					final /*@NonInvalid*/ List<Principal> customers = this.getCustomers();
					final /*@NonInvalid*/ OrderedSetValue BOXED_customers = idResolver
							.createOrderedSetOfAll(PetShopDemoTables.ORD_CLSSid_Principal, customers);
					final org.eclipse.ocl.pivot.Class TYPE_status_0 = executor.getStaticTypeOfValue(null,
							BOXED_customers);
					final LibraryIterationExtension IMPL_status_0 = (LibraryIterationExtension) TYPE_status_0
							.lookupImplementation(standardLibrary, OCLstdlibTables.Operations._Collection__1_forAll);
					final /*@NonNull*/ Object ACC_status_0 = IMPL_status_0.createAccumulatorValue(executor,
							TypeId.BOOLEAN, TypeId.BOOLEAN);
					/**
					 * Implementation of the iterator body.
					 */
					final AbstractSimpleOperation BODY_status_0 = new AbstractSimpleOperation() {
						/**
						 * customer1.name = customer2.name implies customer1 = customer2
						 */
						@Override
						public /*@Nullable*/ Object evaluate(final Executor executor, final TypeId typeId,
								final /*@Nullable*/ Object /*@NonNull*/ [] sourceAndArgumentValues) {
							final /*@NonInvalid*/ OrderedSetValue BOXED_customers = (OrderedSetValue) sourceAndArgumentValues[0];
							final /*@NonInvalid*/ Object customer1 = sourceAndArgumentValues[1];
							final /*@NonInvalid*/ Object customer2 = sourceAndArgumentValues[2];
							/*@Caught*/ Object CAUGHT_implies;
							try {
								final /*@NonInvalid*/ Principal local_2 = (Principal) customer1;
								final /*@NonInvalid*/ Principal local_3 = (Principal) customer2;
								/*@Caught*/ Object CAUGHT_eq;
								try {
									if (local_2 == null) {
										throw new InvalidValueException(
												"Null source for \'\'http://petShopDemo\'::NamedElement::name\'");
									}
									final /*@Thrown*/ String name = local_2.getName();
									if (local_3 == null) {
										throw new InvalidValueException(
												"Null source for \'\'http://petShopDemo\'::NamedElement::name\'");
									}
									final /*@Thrown*/ String name_0 = local_3.getName();
									final /*@Thrown*/ boolean eq = name.equals(name_0);
									CAUGHT_eq = eq;
								} catch (Exception e) {
									CAUGHT_eq = ValueUtil.createInvalidValue(e);
								}
								final /*@Thrown*/ Boolean implies;
								if (CAUGHT_eq == ValueUtil.FALSE_VALUE) {
									implies = ValueUtil.TRUE_VALUE;
								} else {
									final /*@NonInvalid*/ boolean eq_0 = (local_2 != null) ? local_2.equals(local_3)
											: (local_3 == null);
									if (eq_0) {
										implies = ValueUtil.TRUE_VALUE;
									} else {
										if (CAUGHT_eq instanceof InvalidValueException) {
											throw (InvalidValueException) CAUGHT_eq;
										}
										implies = ValueUtil.FALSE_VALUE;
									}
								}
								CAUGHT_implies = implies;
							} catch (Exception e) {
								CAUGHT_implies = ValueUtil.createInvalidValue(e);
							}
							return CAUGHT_implies;
						}
					};
					final ExecutorMultipleIterationManager MGR_status_0 = new ExecutorMultipleIterationManager(executor,
							2, TypeId.BOOLEAN, BODY_status_0, BOXED_customers, ACC_status_0);
					final /*@Thrown*/ Boolean status = (Boolean) IMPL_status_0.evaluateIteration(MGR_status_0);
					final /*@Thrown*/ boolean eq_1 = status == Boolean.TRUE;
					/*@Thrown*/ Object local_5;
					if (eq_1) {
						local_5 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@Thrown*/ TupleValue local_4 = ValueUtil.createTupleOfEach(PetShopDemoTables.TUPLid_,
								PetShopDemoTables.STR_Customer_32_name_32_is_32_unique, status);
						local_5 = local_4;
					}
					CAUGHT_local_5 = local_5;
				} catch (Exception e) {
					CAUGHT_local_5 = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_local_5, PetShopDemoTables.INT_0)
						.booleanValue();
				local_6 = logDiagnostic;
			}
			return local_6;
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
	public boolean UniqueOfferName(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Company::UniqueOfferName";
		try {
			/**
			 *
			 * inv UniqueOfferName:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = self.offers->forAll(offer1, offer2 | offer1.name = offer2.name implies offer1 = offer2)
			 *         in
			 *           if status = true
			 *           then true
			 *           else Tuple{message = 'Offer name is unique', status = status}
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ StandardLibrary standardLibrary = idResolver.getStandardLibrary();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PetShopDemoPackage.Literals.COMPANY___UNIQUE_OFFER_NAME__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PetShopDemoTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_6;
			if (le) {
				local_6 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_5;
				try {
					final /*@NonInvalid*/ List<Offer> offers = this.getOffers();
					final /*@NonInvalid*/ OrderedSetValue BOXED_offers = idResolver
							.createOrderedSetOfAll(PetShopDemoTables.ORD_CLSSid_Offer, offers);
					final org.eclipse.ocl.pivot.Class TYPE_status_0 = executor.getStaticTypeOfValue(null, BOXED_offers);
					final LibraryIterationExtension IMPL_status_0 = (LibraryIterationExtension) TYPE_status_0
							.lookupImplementation(standardLibrary, OCLstdlibTables.Operations._Collection__1_forAll);
					final /*@NonNull*/ Object ACC_status_0 = IMPL_status_0.createAccumulatorValue(executor,
							TypeId.BOOLEAN, TypeId.BOOLEAN);
					/**
					 * Implementation of the iterator body.
					 */
					final AbstractSimpleOperation BODY_status_0 = new AbstractSimpleOperation() {
						/**
						 * offer1.name = offer2.name implies offer1 = offer2
						 */
						@Override
						public /*@Nullable*/ Object evaluate(final Executor executor, final TypeId typeId,
								final /*@Nullable*/ Object /*@NonNull*/ [] sourceAndArgumentValues) {
							final /*@NonInvalid*/ OrderedSetValue BOXED_offers = (OrderedSetValue) sourceAndArgumentValues[0];
							final /*@NonInvalid*/ Object offer1 = sourceAndArgumentValues[1];
							final /*@NonInvalid*/ Object offer2 = sourceAndArgumentValues[2];
							/*@Caught*/ Object CAUGHT_implies;
							try {
								final /*@NonInvalid*/ Offer local_2 = (Offer) offer1;
								final /*@NonInvalid*/ Offer local_3 = (Offer) offer2;
								/*@Caught*/ Object CAUGHT_eq;
								try {
									if (local_2 == null) {
										throw new InvalidValueException(
												"Null source for \'\'http://petShopDemo\'::NamedElement::name\'");
									}
									final /*@Thrown*/ String name = local_2.getName();
									if (local_3 == null) {
										throw new InvalidValueException(
												"Null source for \'\'http://petShopDemo\'::NamedElement::name\'");
									}
									final /*@Thrown*/ String name_0 = local_3.getName();
									final /*@Thrown*/ boolean eq = name.equals(name_0);
									CAUGHT_eq = eq;
								} catch (Exception e) {
									CAUGHT_eq = ValueUtil.createInvalidValue(e);
								}
								final /*@Thrown*/ Boolean implies;
								if (CAUGHT_eq == ValueUtil.FALSE_VALUE) {
									implies = ValueUtil.TRUE_VALUE;
								} else {
									final /*@NonInvalid*/ boolean eq_0 = (local_2 != null) ? local_2.equals(local_3)
											: (local_3 == null);
									if (eq_0) {
										implies = ValueUtil.TRUE_VALUE;
									} else {
										if (CAUGHT_eq instanceof InvalidValueException) {
											throw (InvalidValueException) CAUGHT_eq;
										}
										implies = ValueUtil.FALSE_VALUE;
									}
								}
								CAUGHT_implies = implies;
							} catch (Exception e) {
								CAUGHT_implies = ValueUtil.createInvalidValue(e);
							}
							return CAUGHT_implies;
						}
					};
					final ExecutorMultipleIterationManager MGR_status_0 = new ExecutorMultipleIterationManager(executor,
							2, TypeId.BOOLEAN, BODY_status_0, BOXED_offers, ACC_status_0);
					final /*@Thrown*/ Boolean status = (Boolean) IMPL_status_0.evaluateIteration(MGR_status_0);
					final /*@Thrown*/ boolean eq_1 = status == Boolean.TRUE;
					/*@Thrown*/ Object local_5;
					if (eq_1) {
						local_5 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@Thrown*/ TupleValue local_4 = ValueUtil.createTupleOfEach(PetShopDemoTables.TUPLid_,
								PetShopDemoTables.STR_Offer_32_name_32_is_32_unique, status);
						local_5 = local_4;
					}
					CAUGHT_local_5 = local_5;
				} catch (Exception e) {
					CAUGHT_local_5 = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_local_5, PetShopDemoTables.INT_0)
						.booleanValue();
				local_6 = logDiagnostic;
			}
			return local_6;
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
	public boolean UniqueShopName(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Company::UniqueShopName";
		try {
			/**
			 *
			 * inv UniqueShopName:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = self.shops->forAll(shop1, shop2 | shop1.name = shop2.name implies shop1 = shop2)
			 *         in
			 *           if status = true
			 *           then true
			 *           else Tuple{message = 'Shop name is unique', status = status}
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ StandardLibrary standardLibrary = idResolver.getStandardLibrary();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PetShopDemoPackage.Literals.COMPANY___UNIQUE_SHOP_NAME__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PetShopDemoTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_6;
			if (le) {
				local_6 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_5;
				try {
					final /*@NonInvalid*/ List<Shop> shops = this.getShops();
					final /*@NonInvalid*/ OrderedSetValue BOXED_shops = idResolver
							.createOrderedSetOfAll(PetShopDemoTables.ORD_CLSSid_Shop, shops);
					final org.eclipse.ocl.pivot.Class TYPE_status_0 = executor.getStaticTypeOfValue(null, BOXED_shops);
					final LibraryIterationExtension IMPL_status_0 = (LibraryIterationExtension) TYPE_status_0
							.lookupImplementation(standardLibrary, OCLstdlibTables.Operations._Collection__1_forAll);
					final /*@NonNull*/ Object ACC_status_0 = IMPL_status_0.createAccumulatorValue(executor,
							TypeId.BOOLEAN, TypeId.BOOLEAN);
					/**
					 * Implementation of the iterator body.
					 */
					final AbstractSimpleOperation BODY_status_0 = new AbstractSimpleOperation() {
						/**
						 * shop1.name = shop2.name implies shop1 = shop2
						 */
						@Override
						public /*@Nullable*/ Object evaluate(final Executor executor, final TypeId typeId,
								final /*@Nullable*/ Object /*@NonNull*/ [] sourceAndArgumentValues) {
							final /*@NonInvalid*/ OrderedSetValue BOXED_shops = (OrderedSetValue) sourceAndArgumentValues[0];
							final /*@NonInvalid*/ Object shop1 = sourceAndArgumentValues[1];
							final /*@NonInvalid*/ Object shop2 = sourceAndArgumentValues[2];
							/*@Caught*/ Object CAUGHT_implies;
							try {
								final /*@NonInvalid*/ Shop local_2 = (Shop) shop1;
								final /*@NonInvalid*/ Shop local_3 = (Shop) shop2;
								/*@Caught*/ Object CAUGHT_eq;
								try {
									if (local_2 == null) {
										throw new InvalidValueException(
												"Null source for \'\'http://petShopDemo\'::NamedElement::name\'");
									}
									final /*@Thrown*/ String name = local_2.getName();
									if (local_3 == null) {
										throw new InvalidValueException(
												"Null source for \'\'http://petShopDemo\'::NamedElement::name\'");
									}
									final /*@Thrown*/ String name_0 = local_3.getName();
									final /*@Thrown*/ boolean eq = name.equals(name_0);
									CAUGHT_eq = eq;
								} catch (Exception e) {
									CAUGHT_eq = ValueUtil.createInvalidValue(e);
								}
								final /*@Thrown*/ Boolean implies;
								if (CAUGHT_eq == ValueUtil.FALSE_VALUE) {
									implies = ValueUtil.TRUE_VALUE;
								} else {
									final /*@NonInvalid*/ boolean eq_0 = (local_2 != null) ? local_2.equals(local_3)
											: (local_3 == null);
									if (eq_0) {
										implies = ValueUtil.TRUE_VALUE;
									} else {
										if (CAUGHT_eq instanceof InvalidValueException) {
											throw (InvalidValueException) CAUGHT_eq;
										}
										implies = ValueUtil.FALSE_VALUE;
									}
								}
								CAUGHT_implies = implies;
							} catch (Exception e) {
								CAUGHT_implies = ValueUtil.createInvalidValue(e);
							}
							return CAUGHT_implies;
						}
					};
					final ExecutorMultipleIterationManager MGR_status_0 = new ExecutorMultipleIterationManager(executor,
							2, TypeId.BOOLEAN, BODY_status_0, BOXED_shops, ACC_status_0);
					final /*@Thrown*/ Boolean status = (Boolean) IMPL_status_0.evaluateIteration(MGR_status_0);
					final /*@Thrown*/ boolean eq_1 = status == Boolean.TRUE;
					/*@Thrown*/ Object local_5;
					if (eq_1) {
						local_5 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@Thrown*/ TupleValue local_4 = ValueUtil.createTupleOfEach(PetShopDemoTables.TUPLid_,
								PetShopDemoTables.STR_Shop_32_name_32_is_32_unique, status);
						local_5 = local_4;
					}
					CAUGHT_local_5 = local_5;
				} catch (Exception e) {
					CAUGHT_local_5 = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_local_5, PetShopDemoTables.INT_0)
						.booleanValue();
				local_6 = logDiagnostic;
			}
			return local_6;
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
	public boolean UniqueEmployeesName(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Company::UniqueEmployeesName";
		try {
			/**
			 *
			 * inv UniqueEmployeesName:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = self.employees->forAll(employee1, employee2 | employee1.name = employee2.name implies employee1 = employee2)
			 *         in
			 *           if status = true
			 *           then true
			 *           else Tuple{message = 'Employe name is unique', status = status}
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ StandardLibrary standardLibrary = idResolver.getStandardLibrary();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PetShopDemoPackage.Literals.COMPANY___UNIQUE_EMPLOYEES_NAME__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PetShopDemoTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_6;
			if (le) {
				local_6 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_5;
				try {
					final /*@NonInvalid*/ List<Principal> employees = this.getEmployees();
					final /*@NonInvalid*/ OrderedSetValue BOXED_employees = idResolver
							.createOrderedSetOfAll(PetShopDemoTables.ORD_CLSSid_Principal, employees);
					final org.eclipse.ocl.pivot.Class TYPE_status_0 = executor.getStaticTypeOfValue(null,
							BOXED_employees);
					final LibraryIterationExtension IMPL_status_0 = (LibraryIterationExtension) TYPE_status_0
							.lookupImplementation(standardLibrary, OCLstdlibTables.Operations._Collection__1_forAll);
					final /*@NonNull*/ Object ACC_status_0 = IMPL_status_0.createAccumulatorValue(executor,
							TypeId.BOOLEAN, TypeId.BOOLEAN);
					/**
					 * Implementation of the iterator body.
					 */
					final AbstractSimpleOperation BODY_status_0 = new AbstractSimpleOperation() {
						/**
						 * employee1.name = employee2.name implies employee1 = employee2
						 */
						@Override
						public /*@Nullable*/ Object evaluate(final Executor executor, final TypeId typeId,
								final /*@Nullable*/ Object /*@NonNull*/ [] sourceAndArgumentValues) {
							final /*@NonInvalid*/ OrderedSetValue BOXED_employees = (OrderedSetValue) sourceAndArgumentValues[0];
							final /*@NonInvalid*/ Object employee1 = sourceAndArgumentValues[1];
							final /*@NonInvalid*/ Object employee2 = sourceAndArgumentValues[2];
							/*@Caught*/ Object CAUGHT_implies;
							try {
								final /*@NonInvalid*/ Principal local_2 = (Principal) employee1;
								final /*@NonInvalid*/ Principal local_3 = (Principal) employee2;
								/*@Caught*/ Object CAUGHT_eq;
								try {
									if (local_2 == null) {
										throw new InvalidValueException(
												"Null source for \'\'http://petShopDemo\'::NamedElement::name\'");
									}
									final /*@Thrown*/ String name = local_2.getName();
									if (local_3 == null) {
										throw new InvalidValueException(
												"Null source for \'\'http://petShopDemo\'::NamedElement::name\'");
									}
									final /*@Thrown*/ String name_0 = local_3.getName();
									final /*@Thrown*/ boolean eq = name.equals(name_0);
									CAUGHT_eq = eq;
								} catch (Exception e) {
									CAUGHT_eq = ValueUtil.createInvalidValue(e);
								}
								final /*@Thrown*/ Boolean implies;
								if (CAUGHT_eq == ValueUtil.FALSE_VALUE) {
									implies = ValueUtil.TRUE_VALUE;
								} else {
									final /*@NonInvalid*/ boolean eq_0 = (local_2 != null) ? local_2.equals(local_3)
											: (local_3 == null);
									if (eq_0) {
										implies = ValueUtil.TRUE_VALUE;
									} else {
										if (CAUGHT_eq instanceof InvalidValueException) {
											throw (InvalidValueException) CAUGHT_eq;
										}
										implies = ValueUtil.FALSE_VALUE;
									}
								}
								CAUGHT_implies = implies;
							} catch (Exception e) {
								CAUGHT_implies = ValueUtil.createInvalidValue(e);
							}
							return CAUGHT_implies;
						}
					};
					final ExecutorMultipleIterationManager MGR_status_0 = new ExecutorMultipleIterationManager(executor,
							2, TypeId.BOOLEAN, BODY_status_0, BOXED_employees, ACC_status_0);
					final /*@Thrown*/ Boolean status = (Boolean) IMPL_status_0.evaluateIteration(MGR_status_0);
					final /*@Thrown*/ boolean eq_1 = status == Boolean.TRUE;
					/*@Thrown*/ Object local_5;
					if (eq_1) {
						local_5 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@Thrown*/ TupleValue local_4 = ValueUtil.createTupleOfEach(PetShopDemoTables.TUPLid_,
								PetShopDemoTables.STR_Employe_32_name_32_is_32_unique, status);
						local_5 = local_4;
					}
					CAUGHT_local_5 = local_5;
				} catch (Exception e) {
					CAUGHT_local_5 = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_local_5, PetShopDemoTables.INT_0)
						.booleanValue();
				local_6 = logDiagnostic;
			}
			return local_6;
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PetShopDemoPackage.COMPANY__SHOPS:
			return ((InternalEList<?>) getShops()).basicRemove(otherEnd, msgs);
		case PetShopDemoPackage.COMPANY__OFFERS:
			return ((InternalEList<?>) getOffers()).basicRemove(otherEnd, msgs);
		case PetShopDemoPackage.COMPANY__CUSTOMERS:
			return ((InternalEList<?>) getCustomers()).basicRemove(otherEnd, msgs);
		case PetShopDemoPackage.COMPANY__EMPLOYEES:
			return ((InternalEList<?>) getEmployees()).basicRemove(otherEnd, msgs);
		case PetShopDemoPackage.COMPANY__PRODUCTS:
			return ((InternalEList<?>) getProducts()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PetShopDemoPackage.COMPANY__SHOPS:
			return getShops();
		case PetShopDemoPackage.COMPANY__OWNER:
			if (resolve)
				return getOwner();
			return basicGetOwner();
		case PetShopDemoPackage.COMPANY__OFFERS:
			return getOffers();
		case PetShopDemoPackage.COMPANY__CUSTOMERS:
			return getCustomers();
		case PetShopDemoPackage.COMPANY__EMPLOYEES:
			return getEmployees();
		case PetShopDemoPackage.COMPANY__PRODUCTS:
			return getProducts();
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
		case PetShopDemoPackage.COMPANY__SHOPS:
			getShops().clear();
			getShops().addAll((Collection<? extends Shop>) newValue);
			return;
		case PetShopDemoPackage.COMPANY__OWNER:
			setOwner((Principal) newValue);
			return;
		case PetShopDemoPackage.COMPANY__OFFERS:
			getOffers().clear();
			getOffers().addAll((Collection<? extends Offer>) newValue);
			return;
		case PetShopDemoPackage.COMPANY__CUSTOMERS:
			getCustomers().clear();
			getCustomers().addAll((Collection<? extends Principal>) newValue);
			return;
		case PetShopDemoPackage.COMPANY__EMPLOYEES:
			getEmployees().clear();
			getEmployees().addAll((Collection<? extends Principal>) newValue);
			return;
		case PetShopDemoPackage.COMPANY__PRODUCTS:
			getProducts().clear();
			getProducts().addAll((Collection<? extends Product>) newValue);
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
		case PetShopDemoPackage.COMPANY__SHOPS:
			getShops().clear();
			return;
		case PetShopDemoPackage.COMPANY__OWNER:
			setOwner((Principal) null);
			return;
		case PetShopDemoPackage.COMPANY__OFFERS:
			getOffers().clear();
			return;
		case PetShopDemoPackage.COMPANY__CUSTOMERS:
			getCustomers().clear();
			return;
		case PetShopDemoPackage.COMPANY__EMPLOYEES:
			getEmployees().clear();
			return;
		case PetShopDemoPackage.COMPANY__PRODUCTS:
			getProducts().clear();
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
		case PetShopDemoPackage.COMPANY__SHOPS:
			return shops != null && !shops.isEmpty();
		case PetShopDemoPackage.COMPANY__OWNER:
			return owner != null;
		case PetShopDemoPackage.COMPANY__OFFERS:
			return offers != null && !offers.isEmpty();
		case PetShopDemoPackage.COMPANY__CUSTOMERS:
			return customers != null && !customers.isEmpty();
		case PetShopDemoPackage.COMPANY__EMPLOYEES:
			return employees != null && !employees.isEmpty();
		case PetShopDemoPackage.COMPANY__PRODUCTS:
			return products != null && !products.isEmpty();
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
		case PetShopDemoPackage.COMPANY___UNIQUE_CUSTOMER_NAME__DIAGNOSTICCHAIN_MAP:
			return UniqueCustomerName((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case PetShopDemoPackage.COMPANY___UNIQUE_OFFER_NAME__DIAGNOSTICCHAIN_MAP:
			return UniqueOfferName((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case PetShopDemoPackage.COMPANY___UNIQUE_SHOP_NAME__DIAGNOSTICCHAIN_MAP:
			return UniqueShopName((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case PetShopDemoPackage.COMPANY___UNIQUE_EMPLOYEES_NAME__DIAGNOSTICCHAIN_MAP:
			return UniqueEmployeesName((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CompanyImpl
