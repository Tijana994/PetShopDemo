/**
 */
package petShopDemo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petShopDemo.Shop#getLocation <em>Location</em>}</li>
 *   <li>{@link petShopDemo.Shop#getActiveOffers <em>Active Offers</em>}</li>
 * </ul>
 *
 * @see petShopDemo.PetShopDemoPackage#getShop()
 * @model
 * @generated
 */
public interface Shop extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see petShopDemo.PetShopDemoPackage#getShop_Location()
	 * @model required="true"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link petShopDemo.Shop#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Active Offers</b></em>' reference list.
	 * The list contents are of type {@link petShopDemo.Offer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active Offers</em>' reference list.
	 * @see petShopDemo.PetShopDemoPackage#getShop_ActiveOffers()
	 * @model
	 * @generated
	 */
	EList<Offer> getActiveOffers();

} // Shop
