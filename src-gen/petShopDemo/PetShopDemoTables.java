/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /PetShopDemo/model/petShopDemo.ecore
 * using:
 *   /PetShopDemo/model/petShopDemo.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package petShopDemo;

import java.lang.String;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TuplePartId;
import org.eclipse.ocl.pivot.ids.TupleTypeId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
// import petShopDemo.PetShopDemoPackage;
// import petShopDemo.PetShopDemoTables;

/**
 * PetShopDemoTables provides the dispatch tables for the petShopDemo for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class PetShopDemoTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(PetShopDemoPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_petShopDemo = IdManager.getNsURIPackageId("http://petShopDemo", null, PetShopDemoPackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2003_s_XMLType = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2003/XMLType", null, XMLTypePackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Class = PetShopDemoTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Company = PetShopDemoTables.PACKid_http_c_s_s_petShopDemo.getClassId("Company", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Offer = PetShopDemoTables.PACKid_http_c_s_s_petShopDemo.getClassId("Offer", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Principal = PetShopDemoTables.PACKid_http_c_s_s_petShopDemo.getClassId("Principal", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Product = PetShopDemoTables.PACKid_http_c_s_s_petShopDemo.getClassId("Product", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Shop = PetShopDemoTables.PACKid_http_c_s_s_petShopDemo.getClassId("Shop", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_Double = PetShopDemoTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2003_s_XMLType.getDataTypeId("Double", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EDate = PetShopDemoTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EDate", 0);
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ TuplePartId PARTid_ = IdManager.getTuplePartId(0, "message", TypeId.STRING);
	public static final /*@NonInvalid*/ TuplePartId PARTid__0 = IdManager.getTuplePartId(1, "status", TypeId.BOOLEAN);
	public static final /*@NonInvalid*/ String STR_Customer_32_name_32_is_32_unique = "Customer name is unique";
	public static final /*@NonInvalid*/ String STR_Employe_32_name_32_is_32_unique = "Employe name is unique";
	public static final /*@NonInvalid*/ String STR_Offer_32_name_32_is_32_unique = "Offer name is unique";
	public static final /*@NonInvalid*/ String STR_Shop_32_name_32_is_32_unique = "Shop name is unique";
	public static final /*@NonInvalid*/ String STR_Tommo = "Tommo";
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Company = TypeId.BAG.getSpecializedId(PetShopDemoTables.CLSSid_Company);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Offer = TypeId.BAG.getSpecializedId(PetShopDemoTables.CLSSid_Offer);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Shop = TypeId.BAG.getSpecializedId(PetShopDemoTables.CLSSid_Shop);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Offer = TypeId.ORDERED_SET.getSpecializedId(PetShopDemoTables.CLSSid_Offer);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Principal = TypeId.ORDERED_SET.getSpecializedId(PetShopDemoTables.CLSSid_Principal);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Product = TypeId.ORDERED_SET.getSpecializedId(PetShopDemoTables.CLSSid_Product);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Shop = TypeId.ORDERED_SET.getSpecializedId(PetShopDemoTables.CLSSid_Shop);
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_CLSSid_Company = TypeId.SEQUENCE.getSpecializedId(PetShopDemoTables.CLSSid_Company);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Company = TypeId.SET.getSpecializedId(PetShopDemoTables.CLSSid_Company);
	public static final /*@NonInvalid*/ TupleTypeId TUPLid_ = IdManager.getTupleTypeId("Tuple", PetShopDemoTables.PARTid_, PetShopDemoTables.PARTid__0);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			PetShopDemoTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PetShopDemoTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Company = new EcoreExecutorType(PetShopDemoPackage.Literals.COMPANY, PACKAGE, 0);
		public static final EcoreExecutorType _NamedElement = new EcoreExecutorType(PetShopDemoPackage.Literals.NAMED_ELEMENT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Offer = new EcoreExecutorType(PetShopDemoPackage.Literals.OFFER, PACKAGE, 0);
		public static final EcoreExecutorType _Principal = new EcoreExecutorType(PetShopDemoPackage.Literals.PRINCIPAL, PACKAGE, 0);
		public static final EcoreExecutorType _Product = new EcoreExecutorType(PetShopDemoPackage.Literals.PRODUCT, PACKAGE, 0);
		public static final EcoreExecutorType _Shop = new EcoreExecutorType(PetShopDemoPackage.Literals.SHOP, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Company,
			_NamedElement,
			_Offer,
			_Principal,
			_Product,
			_Shop
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PetShopDemoTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Company__Company = new ExecutorFragment(Types._Company, PetShopDemoTables.Types._Company);
		private static final ExecutorFragment _Company__NamedElement = new ExecutorFragment(Types._Company, PetShopDemoTables.Types._NamedElement);
		private static final ExecutorFragment _Company__OclAny = new ExecutorFragment(Types._Company, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Company__OclElement = new ExecutorFragment(Types._Company, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _NamedElement__NamedElement = new ExecutorFragment(Types._NamedElement, PetShopDemoTables.Types._NamedElement);
		private static final ExecutorFragment _NamedElement__OclAny = new ExecutorFragment(Types._NamedElement, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _NamedElement__OclElement = new ExecutorFragment(Types._NamedElement, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Offer__NamedElement = new ExecutorFragment(Types._Offer, PetShopDemoTables.Types._NamedElement);
		private static final ExecutorFragment _Offer__OclAny = new ExecutorFragment(Types._Offer, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Offer__OclElement = new ExecutorFragment(Types._Offer, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Offer__Offer = new ExecutorFragment(Types._Offer, PetShopDemoTables.Types._Offer);

		private static final ExecutorFragment _Principal__NamedElement = new ExecutorFragment(Types._Principal, PetShopDemoTables.Types._NamedElement);
		private static final ExecutorFragment _Principal__OclAny = new ExecutorFragment(Types._Principal, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Principal__OclElement = new ExecutorFragment(Types._Principal, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Principal__Principal = new ExecutorFragment(Types._Principal, PetShopDemoTables.Types._Principal);

		private static final ExecutorFragment _Product__NamedElement = new ExecutorFragment(Types._Product, PetShopDemoTables.Types._NamedElement);
		private static final ExecutorFragment _Product__OclAny = new ExecutorFragment(Types._Product, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Product__OclElement = new ExecutorFragment(Types._Product, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Product__Product = new ExecutorFragment(Types._Product, PetShopDemoTables.Types._Product);

		private static final ExecutorFragment _Shop__NamedElement = new ExecutorFragment(Types._Shop, PetShopDemoTables.Types._NamedElement);
		private static final ExecutorFragment _Shop__OclAny = new ExecutorFragment(Types._Shop, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Shop__OclElement = new ExecutorFragment(Types._Shop, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Shop__Shop = new ExecutorFragment(Types._Shop, PetShopDemoTables.Types._Shop);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PetShopDemoTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PetShopDemoTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PetShopDemoTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Company__customers = new EcoreExecutorProperty(PetShopDemoPackage.Literals.COMPANY__CUSTOMERS, Types._Company, 0);
		public static final ExecutorProperty _Company__employees = new EcoreExecutorProperty(PetShopDemoPackage.Literals.COMPANY__EMPLOYEES, Types._Company, 1);
		public static final ExecutorProperty _Company__offers = new EcoreExecutorProperty(PetShopDemoPackage.Literals.COMPANY__OFFERS, Types._Company, 2);
		public static final ExecutorProperty _Company__owner = new EcoreExecutorProperty(PetShopDemoPackage.Literals.COMPANY__OWNER, Types._Company, 3);
		public static final ExecutorProperty _Company__products = new EcoreExecutorProperty(PetShopDemoPackage.Literals.COMPANY__PRODUCTS, Types._Company, 4);
		public static final ExecutorProperty _Company__shops = new EcoreExecutorProperty(PetShopDemoPackage.Literals.COMPANY__SHOPS, Types._Company, 5);

		public static final ExecutorProperty _NamedElement__name = new EcoreExecutorProperty(PetShopDemoPackage.Literals.NAMED_ELEMENT__NAME, Types._NamedElement, 0);

		public static final ExecutorProperty _Offer__from = new EcoreExecutorProperty(PetShopDemoPackage.Literals.OFFER__FROM, Types._Offer, 0);
		public static final ExecutorProperty _Offer__isActive = new EcoreExecutorProperty(PetShopDemoPackage.Literals.OFFER__IS_ACTIVE, Types._Offer, 1);
		public static final ExecutorProperty _Offer__isMembersOnly = new EcoreExecutorProperty(PetShopDemoPackage.Literals.OFFER__IS_MEMBERS_ONLY, Types._Offer, 2);
		public static final ExecutorProperty _Offer__price = new EcoreExecutorProperty(PetShopDemoPackage.Literals.OFFER__PRICE, Types._Offer, 3);
		public static final ExecutorProperty _Offer__products = new EcoreExecutorProperty(PetShopDemoPackage.Literals.OFFER__PRODUCTS, Types._Offer, 4);
		public static final ExecutorProperty _Offer__to = new EcoreExecutorProperty(PetShopDemoPackage.Literals.OFFER__TO, Types._Offer, 5);
		public static final ExecutorProperty _Offer__Company__offers = new ExecutorPropertyWithImplementation("Company", Types._Offer, 6, new EcoreLibraryOppositeProperty(PetShopDemoPackage.Literals.COMPANY__OFFERS));
		public static final ExecutorProperty _Offer__Shop__activeOffers = new ExecutorPropertyWithImplementation("Shop", Types._Offer, 7, new EcoreLibraryOppositeProperty(PetShopDemoPackage.Literals.SHOP__ACTIVE_OFFERS));

		public static final ExecutorProperty _Principal__approval = new EcoreExecutorProperty(PetShopDemoPackage.Literals.PRINCIPAL__APPROVAL, Types._Principal, 0);
		public static final ExecutorProperty _Principal__birtday = new EcoreExecutorProperty(PetShopDemoPackage.Literals.PRINCIPAL__BIRTDAY, Types._Principal, 1);
		public static final ExecutorProperty _Principal__date = new EcoreExecutorProperty(PetShopDemoPackage.Literals.PRINCIPAL__DATE, Types._Principal, 2);
		public static final ExecutorProperty _Principal__email = new EcoreExecutorProperty(PetShopDemoPackage.Literals.PRINCIPAL__EMAIL, Types._Principal, 3);
		public static final ExecutorProperty _Principal__location = new EcoreExecutorProperty(PetShopDemoPackage.Literals.PRINCIPAL__LOCATION, Types._Principal, 4);
		public static final ExecutorProperty _Principal__number = new EcoreExecutorProperty(PetShopDemoPackage.Literals.PRINCIPAL__NUMBER, Types._Principal, 5);
		public static final ExecutorProperty _Principal__Company__customers = new ExecutorPropertyWithImplementation("Company", Types._Principal, 6, new EcoreLibraryOppositeProperty(PetShopDemoPackage.Literals.COMPANY__CUSTOMERS));
		public static final ExecutorProperty _Principal__Company__employees = new ExecutorPropertyWithImplementation("Company", Types._Principal, 7, new EcoreLibraryOppositeProperty(PetShopDemoPackage.Literals.COMPANY__EMPLOYEES));
		public static final ExecutorProperty _Principal__Company__owner = new ExecutorPropertyWithImplementation("Company", Types._Principal, 8, new EcoreLibraryOppositeProperty(PetShopDemoPackage.Literals.COMPANY__OWNER));

		public static final ExecutorProperty _Product__description = new EcoreExecutorProperty(PetShopDemoPackage.Literals.PRODUCT__DESCRIPTION, Types._Product, 0);
		public static final ExecutorProperty _Product__Company__products = new ExecutorPropertyWithImplementation("Company", Types._Product, 1, new EcoreLibraryOppositeProperty(PetShopDemoPackage.Literals.COMPANY__PRODUCTS));
		public static final ExecutorProperty _Product__Offer__products = new ExecutorPropertyWithImplementation("Offer", Types._Product, 2, new EcoreLibraryOppositeProperty(PetShopDemoPackage.Literals.OFFER__PRODUCTS));

		public static final ExecutorProperty _Shop__activeOffers = new EcoreExecutorProperty(PetShopDemoPackage.Literals.SHOP__ACTIVE_OFFERS, Types._Shop, 0);
		public static final ExecutorProperty _Shop__location = new EcoreExecutorProperty(PetShopDemoPackage.Literals.SHOP__LOCATION, Types._Shop, 1);
		public static final ExecutorProperty _Shop__Company__shops = new ExecutorPropertyWithImplementation("Company", Types._Shop, 2, new EcoreLibraryOppositeProperty(PetShopDemoPackage.Literals.COMPANY__SHOPS));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PetShopDemoTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Company =
			{
				Fragments._Company__OclAny /* 0 */,
				Fragments._Company__OclElement /* 1 */,
				Fragments._Company__NamedElement /* 2 */,
				Fragments._Company__Company /* 3 */
			};
		private static final int /*@NonNull*/ [] __Company = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _NamedElement =
			{
				Fragments._NamedElement__OclAny /* 0 */,
				Fragments._NamedElement__OclElement /* 1 */,
				Fragments._NamedElement__NamedElement /* 2 */
			};
		private static final int /*@NonNull*/ [] __NamedElement = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Offer =
			{
				Fragments._Offer__OclAny /* 0 */,
				Fragments._Offer__OclElement /* 1 */,
				Fragments._Offer__NamedElement /* 2 */,
				Fragments._Offer__Offer /* 3 */
			};
		private static final int /*@NonNull*/ [] __Offer = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Principal =
			{
				Fragments._Principal__OclAny /* 0 */,
				Fragments._Principal__OclElement /* 1 */,
				Fragments._Principal__NamedElement /* 2 */,
				Fragments._Principal__Principal /* 3 */
			};
		private static final int /*@NonNull*/ [] __Principal = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Product =
			{
				Fragments._Product__OclAny /* 0 */,
				Fragments._Product__OclElement /* 1 */,
				Fragments._Product__NamedElement /* 2 */,
				Fragments._Product__Product /* 3 */
			};
		private static final int /*@NonNull*/ [] __Product = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Shop =
			{
				Fragments._Shop__OclAny /* 0 */,
				Fragments._Shop__OclElement /* 1 */,
				Fragments._Shop__NamedElement /* 2 */,
				Fragments._Shop__Shop /* 3 */
			};
		private static final int /*@NonNull*/ [] __Shop = { 1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Company.initFragments(_Company, __Company);
			Types._NamedElement.initFragments(_NamedElement, __NamedElement);
			Types._Offer.initFragments(_Offer, __Offer);
			Types._Principal.initFragments(_Principal, __Principal);
			Types._Product.initFragments(_Product, __Product);
			Types._Shop.initFragments(_Shop, __Shop);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PetShopDemoTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Company__Company = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Company__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Company__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Company__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _NamedElement__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NamedElement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NamedElement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Offer__Offer = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Offer__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Offer__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Offer__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Principal__Principal = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Principal__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Principal__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Principal__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Product__Product = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Product__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Product__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Product__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Shop__Shop = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Shop__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Shop__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Shop__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Company__Company.initOperations(_Company__Company);
			Fragments._Company__NamedElement.initOperations(_Company__NamedElement);
			Fragments._Company__OclAny.initOperations(_Company__OclAny);
			Fragments._Company__OclElement.initOperations(_Company__OclElement);

			Fragments._NamedElement__NamedElement.initOperations(_NamedElement__NamedElement);
			Fragments._NamedElement__OclAny.initOperations(_NamedElement__OclAny);
			Fragments._NamedElement__OclElement.initOperations(_NamedElement__OclElement);

			Fragments._Offer__NamedElement.initOperations(_Offer__NamedElement);
			Fragments._Offer__OclAny.initOperations(_Offer__OclAny);
			Fragments._Offer__OclElement.initOperations(_Offer__OclElement);
			Fragments._Offer__Offer.initOperations(_Offer__Offer);

			Fragments._Principal__NamedElement.initOperations(_Principal__NamedElement);
			Fragments._Principal__OclAny.initOperations(_Principal__OclAny);
			Fragments._Principal__OclElement.initOperations(_Principal__OclElement);
			Fragments._Principal__Principal.initOperations(_Principal__Principal);

			Fragments._Product__NamedElement.initOperations(_Product__NamedElement);
			Fragments._Product__OclAny.initOperations(_Product__OclAny);
			Fragments._Product__OclElement.initOperations(_Product__OclElement);
			Fragments._Product__Product.initOperations(_Product__Product);

			Fragments._Shop__NamedElement.initOperations(_Shop__NamedElement);
			Fragments._Shop__OclAny.initOperations(_Shop__OclAny);
			Fragments._Shop__OclElement.initOperations(_Shop__OclElement);
			Fragments._Shop__Shop.initOperations(_Shop__Shop);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PetShopDemoTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Company = {
			PetShopDemoTables.Properties._Company__customers,
			PetShopDemoTables.Properties._Company__employees,
			PetShopDemoTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PetShopDemoTables.Properties._Company__offers,
			PetShopDemoTables.Properties._Company__owner,
			PetShopDemoTables.Properties._Company__products,
			PetShopDemoTables.Properties._Company__shops
		};

		private static final ExecutorProperty /*@NonNull*/ [] _NamedElement = {
			PetShopDemoTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Offer = {
			PetShopDemoTables.Properties._Offer__from,
			PetShopDemoTables.Properties._Offer__isActive,
			PetShopDemoTables.Properties._Offer__isMembersOnly,
			PetShopDemoTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PetShopDemoTables.Properties._Offer__price,
			PetShopDemoTables.Properties._Offer__products,
			PetShopDemoTables.Properties._Offer__to
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Principal = {
			PetShopDemoTables.Properties._Principal__approval,
			PetShopDemoTables.Properties._Principal__birtday,
			PetShopDemoTables.Properties._Principal__date,
			PetShopDemoTables.Properties._Principal__email,
			PetShopDemoTables.Properties._Principal__location,
			PetShopDemoTables.Properties._NamedElement__name,
			PetShopDemoTables.Properties._Principal__number,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Product = {
			PetShopDemoTables.Properties._Product__description,
			PetShopDemoTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Shop = {
			PetShopDemoTables.Properties._Shop__activeOffers,
			PetShopDemoTables.Properties._Shop__location,
			PetShopDemoTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Company__Company.initProperties(_Company);
			Fragments._NamedElement__NamedElement.initProperties(_NamedElement);
			Fragments._Offer__Offer.initProperties(_Offer);
			Fragments._Principal__Principal.initProperties(_Principal);
			Fragments._Product__Product.initProperties(_Product);
			Fragments._Shop__Shop.initProperties(_Shop);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PetShopDemoTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PetShopDemoTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new PetShopDemoTables();
	}

	private PetShopDemoTables() {
		super(PetShopDemoPackage.eNS_URI);
	}

	/*
	 * The EClasses whose instances should be cached to support allInstances().
	 */
	private static final EClass allInstancesEClasses /*@NonNull*/ [] = {
		PetShopDemoPackage.Literals.COMPANY
	};

	@Override
	public EClass /*@NonNull*/ [] basicGetAllInstancesClasses() {
		return allInstancesEClasses;
	}
}
