/**
 */
package petShopDemo;

import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Offer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petShopDemo.Offer#getProducts <em>Products</em>}</li>
 *   <li>{@link petShopDemo.Offer#isIsMembersOnly <em>Is Members Only</em>}</li>
 *   <li>{@link petShopDemo.Offer#getPrice <em>Price</em>}</li>
 *   <li>{@link petShopDemo.Offer#getFrom <em>From</em>}</li>
 *   <li>{@link petShopDemo.Offer#getTo <em>To</em>}</li>
 *   <li>{@link petShopDemo.Offer#isIsActive <em>Is Active</em>}</li>
 * </ul>
 *
 * @see petShopDemo.PetShopDemoPackage#getOffer()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NeedApprovalForNotification'"
 * @generated
 */
public interface Offer extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Products</b></em>' reference list.
	 * The list contents are of type {@link petShopDemo.Product}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Products</em>' reference list.
	 * @see petShopDemo.PetShopDemoPackage#getOffer_Products()
	 * @model
	 * @generated
	 */
	EList<Product> getProducts();

	/**
	 * Returns the value of the '<em><b>Is Members Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Members Only</em>' attribute.
	 * @see #setIsMembersOnly(boolean)
	 * @see petShopDemo.PetShopDemoPackage#getOffer_IsMembersOnly()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsMembersOnly();

	/**
	 * Sets the value of the '{@link petShopDemo.Offer#isIsMembersOnly <em>Is Members Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Members Only</em>' attribute.
	 * @see #isIsMembersOnly()
	 * @generated
	 */
	void setIsMembersOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(double)
	 * @see petShopDemo.PetShopDemoPackage#getOffer_Price()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 * @generated
	 */
	double getPrice();

	/**
	 * Sets the value of the '{@link petShopDemo.Offer#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(double value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' attribute.
	 * @see #setFrom(Date)
	 * @see petShopDemo.PetShopDemoPackage#getOffer_From()
	 * @model required="true"
	 * @generated
	 */
	Date getFrom();

	/**
	 * Sets the value of the '{@link petShopDemo.Offer#getFrom <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' attribute.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Date value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' attribute.
	 * @see #setTo(Date)
	 * @see petShopDemo.PetShopDemoPackage#getOffer_To()
	 * @model required="true"
	 * @generated
	 */
	Date getTo();

	/**
	 * Sets the value of the '{@link petShopDemo.Offer#getTo <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' attribute.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Date value);

	/**
	 * Returns the value of the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Active</em>' attribute.
	 * @see #setIsActive(boolean)
	 * @see petShopDemo.PetShopDemoPackage#getOffer_IsActive()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsActive();

	/**
	 * Sets the value of the '{@link petShopDemo.Offer#isIsActive <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Active</em>' attribute.
	 * @see #isIsActive()
	 * @generated
	 */
	void setIsActive(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tif(self.from = null) then\n\t\t\t\tfalse\n\t\t\telse\n\t\t\tlet company : Company = Company.allInstances()-&gt;asSequence()-&gt;first() in\n\t\t\tcompany.customers-&gt;exists(customer|customer.name= \'Tommo\' and customer.approval)\n\t\t\tendif'"
	 * @generated
	 */
	boolean NeedApprovalForNotification(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Offer
