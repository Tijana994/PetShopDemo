/**
 */
package petShopDemo;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Company</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petShopDemo.Company#getShops <em>Shops</em>}</li>
 *   <li>{@link petShopDemo.Company#getOwner <em>Owner</em>}</li>
 *   <li>{@link petShopDemo.Company#getOffers <em>Offers</em>}</li>
 *   <li>{@link petShopDemo.Company#getCustomers <em>Customers</em>}</li>
 *   <li>{@link petShopDemo.Company#getEmployees <em>Employees</em>}</li>
 *   <li>{@link petShopDemo.Company#getProducts <em>Products</em>}</li>
 * </ul>
 *
 * @see petShopDemo.PetShopDemoPackage#getCompany()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueEmployeesName'"
 * @generated
 */
public interface Company extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Shops</b></em>' containment reference list.
	 * The list contents are of type {@link petShopDemo.Shop}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shops</em>' containment reference list.
	 * @see petShopDemo.PetShopDemoPackage#getCompany_Shops()
	 * @model containment="true"
	 * @generated
	 */
	EList<Shop> getShops();

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(Principal)
	 * @see petShopDemo.PetShopDemoPackage#getCompany_Owner()
	 * @model required="true"
	 * @generated
	 */
	Principal getOwner();

	/**
	 * Sets the value of the '{@link petShopDemo.Company#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Principal value);

	/**
	 * Returns the value of the '<em><b>Offers</b></em>' containment reference list.
	 * The list contents are of type {@link petShopDemo.Offer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offers</em>' containment reference list.
	 * @see petShopDemo.PetShopDemoPackage#getCompany_Offers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Offer> getOffers();

	/**
	 * Returns the value of the '<em><b>Customers</b></em>' containment reference list.
	 * The list contents are of type {@link petShopDemo.Principal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customers</em>' containment reference list.
	 * @see petShopDemo.PetShopDemoPackage#getCompany_Customers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Principal> getCustomers();

	/**
	 * Returns the value of the '<em><b>Employees</b></em>' containment reference list.
	 * The list contents are of type {@link petShopDemo.Principal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employees</em>' containment reference list.
	 * @see petShopDemo.PetShopDemoPackage#getCompany_Employees()
	 * @model containment="true"
	 * @generated
	 */
	EList<Principal> getEmployees();

	/**
	 * Returns the value of the '<em><b>Products</b></em>' containment reference list.
	 * The list contents are of type {@link petShopDemo.Product}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Products</em>' containment reference list.
	 * @see petShopDemo.PetShopDemoPackage#getCompany_Products()
	 * @model containment="true"
	 * @generated
	 */
	EList<Product> getProducts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Customer name is unique\',\n\tstatus : Boolean = \n\t\tself.customers-&gt;forAll(customer1:Principal,customer2:Principal| customer1.name = customer2.name implies customer1 = customer2)\n}.status'"
	 * @generated
	 */
	boolean UniqueCustomerName(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Offer name is unique\',\n\tstatus : Boolean = \n\t\tself.offers-&gt;forAll(offer1:Offer,offer2:Offer| offer1.name = offer2.name implies offer1 = offer2)\n}.status'"
	 * @generated
	 */
	boolean UniqueOfferName(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Shop name is unique\',\n\tstatus : Boolean = \n\t\tself.shops-&gt;forAll(shop1:Shop,shop2:Shop| shop1.name = shop2.name implies shop1 = shop2)\n}.status'"
	 * @generated
	 */
	boolean UniqueShopName(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Employe name is unique\',\n\tstatus : Boolean = \n\t\tself.employees-&gt;forAll(employee1:Principal,employee2:Principal| employee1.name = employee2.name implies employee1 = employee2)\n}.status'"
	 * @generated
	 */
	boolean UniqueEmployeesName(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Company
