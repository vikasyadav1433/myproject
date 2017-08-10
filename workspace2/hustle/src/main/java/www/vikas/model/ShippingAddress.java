package www.vikas.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class ShippingAddress {
	@Id
	private String shippingaddressid;
	private String houseno;
	private String street;
	private String area;
	private String city;
	private String state;
	private String country;
	private String pincode;
	
	@OneToOne(mappedBy="shippingAddress")
	private Customer customer;
	
	public String getShippingaddressid() {
		return shippingaddressid;
	}
	public void setShippingaddressid(String shippingaddressid) {
		this.shippingaddressid = shippingaddressid;
	}
	public String getHouseno() {
		return houseno;
	}
	public void setHouseno(String houseno) {
		this.houseno = houseno;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	

}