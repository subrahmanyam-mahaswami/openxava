
// File generated by OpenXava: Thu Jun 13 13:15:39 CEST 2019
// Archivo generado por OpenXava: Thu Jun 13 13:15:39 CEST 2019

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Customer		Entity/Entidad

package org.openxava.test.model;

import java.util.*;
import java.math.*;
import java.rmi.RemoteException;
import org.openxava.component.MetaComponent;
import org.openxava.model.meta.MetaModel;
import org.openxava.util.*;

/**
 * 
 * @author MCarmen Gimeno
 */
public class Customer implements java.io.Serializable, org.openxava.test.model.ICustomer {	

	// Constructor
	public Customer() {
		initMembers();
	} 

	private void initMembers() { 
		setNumber(0); 
		setName(null); 
		setType(0); 
		setPhoto(null); 
		setTelephone(null); 
		setEmail(null); 
		setAdditionalEmails(null); 
		setWebsite(null); 
		setRemarks(null); 
		setRelationWithSeller(null); 	
	} 
	
	// Properties/Propiedades 
	private int number;
	public int getNumber() {
		return number;
	}
	public void setNumber(int newNumber) {
		this.number = newNumber;
	} 
	private static org.openxava.converters.IConverter websiteConverter;
	private org.openxava.converters.IConverter getWebsiteConverter() {
		if (websiteConverter == null) {
			try {
				websiteConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("website");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "website"));
			}
			
		}	
		return websiteConverter;
	} 
	private java.lang.String website;
	private java.lang.String get_Website() {
		return website;
	}
	private void set_Website(java.lang.String newWebsite) {
		this.website = newWebsite;
	} 	
	
	/**
	 * 
	 * 
	 */
	public String getWebsite() {
		try {
			return (String) getWebsiteConverter().toJava(get_Website());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Website", "Customer", "String"));
		}
	}
	
	/**
	 * 
	 */
	public void setWebsite(String newWebsite) {
		try { 
			set_Website((java.lang.String) getWebsiteConverter().toDB(newWebsite));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Website", "Customer", "String"));
		}		
	} 	
	/**
	 * 
	 * 
	 */
	public String getCity() { 		
		try {			
			org.openxava.calculators.ConcatCalculator cityCalculator= (org.openxava.calculators.ConcatCalculator)
				getMetaModel().getMetaProperty("city").getMetaCalculator().createCalculator();  	
			
			cityCalculator.setInt1(getAddress().getZipCode());  	
			
			cityCalculator.setString2(getAddress().getCity()); 
			return (String) cityCalculator.calculate();
		}
		catch (NullPointerException ex) {
			// Usually for multilevel property access with null references 
			return null; 			
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.calculate_value_error", "City", "Customer", ex.getLocalizedMessage()));
		} 		
	}
	public void setCity(String newCity) {
		// for it is in value object
		// para que aparezca en los value objects
	} 
	private static org.openxava.converters.IConverter nameConverter;
	private org.openxava.converters.IConverter getNameConverter() {
		if (nameConverter == null) {
			try {
				nameConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("name");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "name"));
			}
			
		}	
		return nameConverter;
	} 
	private java.lang.String name;
	private java.lang.String get_Name() {
		return name;
	}
	private void set_Name(java.lang.String newName) {
		this.name = newName;
	} 	
	
	/**
	 * 
	 * 
	 */
	public String getName() {
		try {
			return (String) getNameConverter().toJava(get_Name());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Name", "Customer", "String"));
		}
	}
	
	/**
	 * 
	 */
	public void setName(String newName) {
		try { 
			set_Name((java.lang.String) getNameConverter().toDB(newName));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Name", "Customer", "String"));
		}		
	} 
	private static org.openxava.converters.IConverter additionalEmailsConverter;
	private org.openxava.converters.IConverter getAdditionalEmailsConverter() {
		if (additionalEmailsConverter == null) {
			try {
				additionalEmailsConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("additionalEmails");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "additionalEmails"));
			}
			
		}	
		return additionalEmailsConverter;
	} 
	private java.lang.String additionalEmails;
	private java.lang.String get_AdditionalEmails() {
		return additionalEmails;
	}
	private void set_AdditionalEmails(java.lang.String newAdditionalEmails) {
		this.additionalEmails = newAdditionalEmails;
	} 	
	
	/**
	 * 
	 * 
	 */
	public String getAdditionalEmails() {
		try {
			return (String) getAdditionalEmailsConverter().toJava(get_AdditionalEmails());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "AdditionalEmails", "Customer", "String"));
		}
	}
	
	/**
	 * 
	 */
	public void setAdditionalEmails(String newAdditionalEmails) {
		try { 
			set_AdditionalEmails((java.lang.String) getAdditionalEmailsConverter().toDB(newAdditionalEmails));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "AdditionalEmails", "Customer", "String"));
		}		
	} 
	private static org.openxava.converters.IConverter photoConverter;
	private org.openxava.converters.IConverter getPhotoConverter() {
		if (photoConverter == null) {
			try {
				photoConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("photo");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "photo"));
			}
			
		}	
		return photoConverter;
	} 
	private byte[] photo;
	private byte[] get_Photo() {
		return photo;
	}
	private void set_Photo(byte[] newPhoto) {
		this.photo = newPhoto;
	} 	
	
	/**
	 * 
	 * 
	 */
	public byte[] getPhoto() {
		try {
			return (byte[]) getPhotoConverter().toJava(get_Photo());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Photo", "Customer", "byte[]"));
		}
	}
	
	/**
	 * 
	 */
	public void setPhoto(byte[] newPhoto) {
		try { 
			set_Photo((byte[]) getPhotoConverter().toDB(newPhoto));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Photo", "Customer", "byte[]"));
		}		
	} 
	private static org.openxava.converters.IConverter telephoneConverter;
	private org.openxava.converters.IConverter getTelephoneConverter() {
		if (telephoneConverter == null) {
			try {
				telephoneConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("telephone");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "telephone"));
			}
			
		}	
		return telephoneConverter;
	} 
	private java.lang.String telephone;
	private java.lang.String get_Telephone() {
		return telephone;
	}
	private void set_Telephone(java.lang.String newTelephone) {
		this.telephone = newTelephone;
	} 	
	
	/**
	 * 
	 * 
	 */
	public String getTelephone() {
		try {
			return (String) getTelephoneConverter().toJava(get_Telephone());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Telephone", "Customer", "String"));
		}
	}
	
	/**
	 * 
	 */
	public void setTelephone(String newTelephone) {
		try { 
			set_Telephone((java.lang.String) getTelephoneConverter().toDB(newTelephone));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Telephone", "Customer", "String"));
		}		
	} 
	private static org.openxava.converters.IConverter typeConverter;
	private org.openxava.converters.IConverter getTypeConverter() {
		if (typeConverter == null) {
			try {
				typeConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("type");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "type"));
			}
			
		}	
		return typeConverter;
	} 
	private java.lang.Integer type;
	private java.lang.Integer get_Type() {
		return type;
	}
	private void set_Type(java.lang.Integer newType) {
		this.type = newType;
	} 	
	
	/**
	 * 
	 * 
	 */
	public int getType() {
		try {
			return ((Integer) getTypeConverter().toJava(get_Type())).intValue();
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Type", "Customer", "int"));
		}
	}
	
	/**
	 * 
	 */
	public void setType(int newType) {
		try { 
			set_Type((java.lang.Integer) getTypeConverter().toDB(new Integer(newType)));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Type", "Customer", "int"));
		}		
	} 
	private static org.openxava.converters.IConverter relationWithSellerConverter;
	private org.openxava.converters.IConverter getRelationWithSellerConverter() {
		if (relationWithSellerConverter == null) {
			try {
				relationWithSellerConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("relationWithSeller");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "relationWithSeller"));
			}
			
		}	
		return relationWithSellerConverter;
	} 
	private java.lang.String relationWithSeller;
	private java.lang.String get_RelationWithSeller() {
		return relationWithSeller;
	}
	private void set_RelationWithSeller(java.lang.String newRelationWithSeller) {
		this.relationWithSeller = newRelationWithSeller;
	} 	
	
	/**
	 * 
	 * 
	 */
	public String getRelationWithSeller() {
		try {
			return (String) getRelationWithSellerConverter().toJava(get_RelationWithSeller());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "RelationWithSeller", "Customer", "String"));
		}
	}
	
	/**
	 * 
	 */
	public void setRelationWithSeller(String newRelationWithSeller) {
		try { 
			set_RelationWithSeller((java.lang.String) getRelationWithSellerConverter().toDB(newRelationWithSeller));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "RelationWithSeller", "Customer", "String"));
		}		
	} 
	private static org.openxava.converters.IConverter emailConverter;
	private org.openxava.converters.IConverter getEmailConverter() {
		if (emailConverter == null) {
			try {
				emailConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("email");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "email"));
			}
			
		}	
		return emailConverter;
	} 
	private java.lang.String email;
	private java.lang.String get_Email() {
		return email;
	}
	private void set_Email(java.lang.String newEmail) {
		this.email = newEmail;
	} 	
	
	/**
	 * 
	 * 
	 */
	public String getEmail() {
		try {
			return (String) getEmailConverter().toJava(get_Email());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Email", "Customer", "String"));
		}
	}
	
	/**
	 * 
	 */
	public void setEmail(String newEmail) {
		try { 
			set_Email((java.lang.String) getEmailConverter().toDB(newEmail));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Email", "Customer", "String"));
		}		
	} 
	private static org.openxava.converters.IConverter remarksConverter;
	private org.openxava.converters.IConverter getRemarksConverter() {
		if (remarksConverter == null) {
			try {
				remarksConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("remarks");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "remarks"));
			}
			
		}	
		return remarksConverter;
	} 
	private java.lang.String remarks;
	private java.lang.String get_Remarks() {
		return remarks;
	}
	private void set_Remarks(java.lang.String newRemarks) {
		this.remarks = newRemarks;
	} 	
	
	/**
	 * 
	 * 
	 */
	public java.lang.String getRemarks() {
		try {
			return (java.lang.String) getRemarksConverter().toJava(get_Remarks());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Remarks", "Customer", "java.lang.String"));
		}
	}
	
	/**
	 * 
	 */
	public void setRemarks(java.lang.String newRemarks) {
		try { 
			set_Remarks((java.lang.String) getRemarksConverter().toDB(newRemarks));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Remarks", "Customer", "java.lang.String"));
		}		
	} 	
	/**
	 * 
	 * 
	 */
	public boolean isLocal() { 		
		try {			
			org.openxava.test.calculators.IsLocalCustomerCalculator localCalculator= (org.openxava.test.calculators.IsLocalCustomerCalculator)
				getMetaModel().getMetaProperty("local").getMetaCalculator().createCalculator();  	
			
			localCalculator.setStateId(getAddress().getState().getId());  	
			
			localCalculator.setStateName(getAddress().getState().getName()); 
			return ((Boolean) localCalculator.calculate()).booleanValue();
		}
		catch (NullPointerException ex) {
			// Usually for multilevel property access with null references
			return false; 			
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.calculate_value_error", "Local", "Customer", ex.getLocalizedMessage()));
		} 		
	}
	public void setLocal(boolean newLocal) {
		// for it is in value object
		// para que aparezca en los value objects
	} 

	// References/Referencias 

	private org.openxava.test.model.ISeller seller; 	
	public org.openxava.test.model.ISeller getSeller() {
		if (seller != null) {
			// Because not-found='ignore' annul lazy initialization, we simulate it
			try {
				seller.toString();
			}
			catch (Exception ex) {
				return null;
			}
		}	
		return seller;
	}
	public void setSeller(org.openxava.test.model.ISeller newSeller) {
		if (newSeller != null && !(newSeller instanceof org.openxava.test.model.Seller)) {
			throw new IllegalArgumentException(XavaResources.getString("ejb_to_pojo_illegal")); 
		}
		this.seller = newSeller; 
	}  	
	// Address : Aggregate/Agregado 
	public org.openxava.test.model.Address getAddress() {
		org.openxava.test.model.Address r = new org.openxava.test.model.Address();		
		r.setZipCode(getAddress_zipCode());		
		r.setCity(getAddress_city());		
		r.setStreet(getAddress_street());		
		r.setAsString(getAddress_asString()); 
		r.setState(getAddress_state());		
		return r;
	}	
	public void setAddress(org.openxava.test.model.Address newAddress) throws java.rmi.RemoteException { 
		if (newAddress == null) newAddress = new org.openxava.test.model.Address();		
		setAddress_zipCode(newAddress.getZipCode());		
		setAddress_city(newAddress.getCity());		
		setAddress_street(newAddress.getStreet());		
		setAddress_asString(newAddress.getAsString());		
		setAddress_state(newAddress.getState());			
	}
	
	// For acceding to properties of this from calculators inside aggregates
	private Customer getAddress_customer() {
		return this;
	} 
	private static org.openxava.converters.IConverter address_zipCodeConverter;
	private org.openxava.converters.IConverter getAddress_zipCodeConverter() {
		if (address_zipCodeConverter == null) {
			try {
				address_zipCodeConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("address_zipCode");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "address_zipCode"));
			}
			
		}	
		return address_zipCodeConverter;
	} 
	private java.lang.String address_zipCode;
	private java.lang.String get_Address_zipCode() {
		return address_zipCode;
	}
	private void set_Address_zipCode(java.lang.String newAddress_zipCode) {
		this.address_zipCode = newAddress_zipCode;
	} 	
	
	/**
	 * 
	 * 
	 */
	private int getAddress_zipCode() {
		try {
			return ((Integer) getAddress_zipCodeConverter().toJava(get_Address_zipCode())).intValue();
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Address_zipCode", "Address", "int"));
		}
	}
	
	/**
	 * 
	 */
	private void setAddress_zipCode(int newAddress_zipCode) {
		try { 
			set_Address_zipCode((java.lang.String) getAddress_zipCodeConverter().toDB(new Integer(newAddress_zipCode)));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Address_zipCode", "Address", "int"));
		}		
	} 
	private static org.openxava.converters.IConverter address_cityConverter;
	private org.openxava.converters.IConverter getAddress_cityConverter() {
		if (address_cityConverter == null) {
			try {
				address_cityConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("address_city");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "address_city"));
			}
			
		}	
		return address_cityConverter;
	} 
	private java.lang.String address_city;
	private java.lang.String get_Address_city() {
		return address_city;
	}
	private void set_Address_city(java.lang.String newAddress_city) {
		this.address_city = newAddress_city;
	} 	
	
	/**
	 * 
	 * 
	 */
	private String getAddress_city() {
		try {
			return (String) getAddress_cityConverter().toJava(get_Address_city());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Address_city", "Address", "String"));
		}
	}
	
	/**
	 * 
	 */
	private void setAddress_city(String newAddress_city) {
		try { 
			set_Address_city((java.lang.String) getAddress_cityConverter().toDB(newAddress_city));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Address_city", "Address", "String"));
		}		
	} 
	private static org.openxava.converters.IConverter address_streetConverter;
	private org.openxava.converters.IConverter getAddress_streetConverter() {
		if (address_streetConverter == null) {
			try {
				address_streetConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("address_street");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "address_street"));
			}
			
		}	
		return address_streetConverter;
	} 
	private java.lang.String address_street;
	private java.lang.String get_Address_street() {
		return address_street;
	}
	private void set_Address_street(java.lang.String newAddress_street) {
		this.address_street = newAddress_street;
	} 	
	
	/**
	 * 
	 * 
	 */
	private String getAddress_street() {
		try {
			return (String) getAddress_streetConverter().toJava(get_Address_street());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Address_street", "Address", "String"));
		}
	}
	
	/**
	 * 
	 */
	private void setAddress_street(String newAddress_street) {
		try { 
			set_Address_street((java.lang.String) getAddress_streetConverter().toDB(newAddress_street));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Address_street", "Address", "String"));
		}		
	} 	
	/**
	 * 
	 * 
	 */
	public String getAddress_asString() { 		
		try {			
			org.openxava.calculators.ConcatCalculator address_asStringCalculator= (org.openxava.calculators.ConcatCalculator)
				getMetaModel().getMetaProperty("address.asString").getMetaCalculator().createCalculator();  	
			
			address_asStringCalculator.setString1(getAddress_street());  	
			
			address_asStringCalculator.setInt2(getAddress_zipCode());  	
			
			address_asStringCalculator.setString3(getAddress_city());  	
			
			address_asStringCalculator.setString4(getAddress_state().getName());  	
			
			address_asStringCalculator.setInt5(getAddress_customer().getNumber()); 
			return (String) address_asStringCalculator.calculate();
		}
		catch (NullPointerException ex) {
			// Usually for multilevel property access with null references 
			return null; 			
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.calculate_value_error", "Address_asString", "Address", ex.getLocalizedMessage()));
		} 		
	}
	public void setAddress_asString(String newAddress_asString) {
		// for it is in value object
		// para que aparezca en los value objects
	} 

	private org.openxava.test.model.IState address_state; 	
	public org.openxava.test.model.IState getAddress_state() {
		if (address_state != null) {
			// Because not-found='ignore' annul lazy initialization, we simulate it
			try {
				address_state.toString();
			}
			catch (Exception ex) {
				return null;
			}
		}	
		return address_state;
	}
	public void setAddress_state(org.openxava.test.model.IState newState) {
		if (newState != null && !(newState instanceof org.openxava.test.model.State)) {
			throw new IllegalArgumentException(XavaResources.getString("ejb_to_pojo_illegal")); 
		}
		this.address_state = newState; 
	} 

	private org.openxava.test.model.ISeller alternateSeller; 	
	public org.openxava.test.model.ISeller getAlternateSeller() {
		if (alternateSeller != null) {
			// Because not-found='ignore' annul lazy initialization, we simulate it
			try {
				alternateSeller.toString();
			}
			catch (Exception ex) {
				return null;
			}
		}	
		return alternateSeller;
	}
	public void setAlternateSeller(org.openxava.test.model.ISeller newSeller) {
		if (newSeller != null && !(newSeller instanceof org.openxava.test.model.Seller)) {
			throw new IllegalArgumentException(XavaResources.getString("ejb_to_pojo_illegal")); 
		}
		this.alternateSeller = newSeller; 
	} 

	private org.openxava.test.model.ICustomerGroup group; 	
	public org.openxava.test.model.ICustomerGroup getGroup() {
		if (group != null) {
			// Because not-found='ignore' annul lazy initialization, we simulate it
			try {
				group.toString();
			}
			catch (Exception ex) {
				return null;
			}
		}	
		return group;
	}
	public void setGroup(org.openxava.test.model.ICustomerGroup newCustomerGroup) {
		if (newCustomerGroup != null && !(newCustomerGroup instanceof org.openxava.test.model.CustomerGroup)) {
			throw new IllegalArgumentException(XavaResources.getString("ejb_to_pojo_illegal")); 
		}
		this.group = newCustomerGroup; 
	} 

	// Colecciones/Collections 
	private java.util.Collection deliveryPlaces;
	public java.util.Collection getDeliveryPlaces() {
		return deliveryPlaces;
	}
	public void setDeliveryPlaces(java.util.Collection deliveryPlaces) {
		this.deliveryPlaces = deliveryPlaces;
	} 
	private java.util.Collection states;
	public java.util.Collection getStates() {
		return states;
	}
	public void setStates(java.util.Collection states) {
		this.states = states;
	} 

	// Methods/Metodos 
	/**
	 * @ejb:interface-method
	 */
	public void calculateShippingAndHandling()  { 		
		try {			
			org.openxava.test.calculators.ShippingAndHandlingCalculator calculateShippingAndHandlingCalculator = (org.openxava.test.calculators.ShippingAndHandlingCalculator)
				getMetaModel().getMetaMethod("calculateShippingAndHandling").getMetaCalculator().createCalculator();  	
			calculateShippingAndHandlingCalculator.setStateId(getAddress().getState().getId());  	
			calculateShippingAndHandlingCalculator.setStateName(getAddress().getState().getName()); 
			calculateShippingAndHandlingCalculator.calculate(); 
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("method_execution_error", "calculateShippingAndHandling", "Customer"));
		} 
		
	} 	

	// User defined finders/Buscadores definidos por el usuario 	
 	public static Customer findByNumber(int number) throws javax.ejb.ObjectNotFoundException {
		org.hibernate.Query query = org.openxava.hibernate.XHibernate.getSession().createQuery("from Customer as o where o.number = :arg0"); 
		query.setParameter("arg0", new Integer(number)); 
		Customer r = (Customer) query.uniqueResult();
		if (r == null) {
			throw new javax.ejb.ObjectNotFoundException(XavaResources.getString("object_not_found", "Customer"));
		}
		return r; 
 	} 	
 	public static Collection findByNameLike(java.lang.String name)  {
		org.hibernate.Query query = org.openxava.hibernate.XHibernate.getSession().createQuery("from Customer as o where o.name like :arg0 order by o.name desc"); 
 			org.hibernate.Query sizeQuery = org.openxava.hibernate.XHibernate.getSession().createQuery("select count(*) from Customer as o where o.name like :arg0"); 
		query.setParameter("arg0", name); 
		sizeQuery.setParameter("arg0", name); 
 			return new org.openxava.hibernate.impl.FastSizeList(query, sizeQuery); 
 	} 	
 	public static Collection findByNameLikeAndrelationWithSeller(java.lang.String name, java.lang.String relationWithSeller)  {
		org.hibernate.Query query = org.openxava.hibernate.XHibernate.getSession().createQuery("from Customer as o where o.name like :arg0 and relationWithSeller = :arg1 order by o.name desc"); 
 			org.hibernate.Query sizeQuery = org.openxava.hibernate.XHibernate.getSession().createQuery("select count(*) from Customer as o where o.name like :arg0 and relationWithSeller = :arg1"); 
		query.setParameter("arg0", name); 
		sizeQuery.setParameter("arg0", name); 
		query.setParameter("arg1", relationWithSeller); 
		sizeQuery.setParameter("arg1", relationWithSeller); 
 			return new org.openxava.hibernate.impl.FastSizeList(query, sizeQuery); 
 	} 	
 	public static Collection findNormalOnes()  {
		org.hibernate.Query query = org.openxava.hibernate.XHibernate.getSession().createQuery("from Customer as o where o.type = 0"); 
 			org.hibernate.Query sizeQuery = org.openxava.hibernate.XHibernate.getSession().createQuery("select count(*) from Customer as o where o.type = 0"); 
 			return new org.openxava.hibernate.impl.FastSizeList(query, sizeQuery); 
 	} 	
 	public static Collection findSteadyOnes()  {
		org.hibernate.Query query = org.openxava.hibernate.XHibernate.getSession().createQuery("from Customer as o where o.type = 1"); 
 			org.hibernate.Query sizeQuery = org.openxava.hibernate.XHibernate.getSession().createQuery("select count(*) from Customer as o where o.type = 1"); 
 			return new org.openxava.hibernate.impl.FastSizeList(query, sizeQuery); 
 	} 	
 	public static Collection findByStreet(java.lang.String street)  {
		org.hibernate.Query query = org.openxava.hibernate.XHibernate.getSession().createQuery("from Customer as o where o.address_street = :arg0"); 
 			org.hibernate.Query sizeQuery = org.openxava.hibernate.XHibernate.getSession().createQuery("select count(*) from Customer as o where o.address_street = :arg0"); 
		query.setParameter("arg0", street); 
		sizeQuery.setParameter("arg0", street); 
 			return new org.openxava.hibernate.impl.FastSizeList(query, sizeQuery); 
 	} 	
 	public static Collection findOrderedByState()  {
		org.hibernate.Query query = org.openxava.hibernate.XHibernate.getSession().createQuery("from Customer as o order by o.address_state.name"); 
 			org.hibernate.Query sizeQuery = org.openxava.hibernate.XHibernate.getSession().createQuery("select count(*) from Customer as o"); 
 			return new org.openxava.hibernate.impl.FastSizeList(query, sizeQuery); 
 	} 	
 	public static Collection findAll()  {
		org.hibernate.Query query = org.openxava.hibernate.XHibernate.getSession().createQuery("from Customer as o"); 
 			org.hibernate.Query sizeQuery = org.openxava.hibernate.XHibernate.getSession().createQuery("select count(*) from Customer as o"); 
 			return new org.openxava.hibernate.impl.FastSizeList(query, sizeQuery); 
 	} 


	private static MetaModel metaModel;
	public MetaModel getMetaModel() throws XavaException {
		if (metaModel == null) {
			metaModel = MetaComponent.get("Customer").getMetaEntity(); 	
		}
		return metaModel;
	}
	
	public String toString() {		
		try {
			return getMetaModel().toString(this);
		}
		catch (XavaException ex) {
			System.err.println(XavaResources.getString("toString_warning", "Customer"));
			return super.toString();
		}		
	}

	public boolean equals(Object other) {		
		if (other == null) return false;
		return toString().equals(other.toString());
	}
	
	public int hashCode() {		
		return toString().hashCode();
	}
	
}