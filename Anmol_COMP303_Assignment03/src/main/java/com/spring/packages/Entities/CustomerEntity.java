//Anmol Singh 301145362
package com.spring.packages.Entities;

import org.springframework.stereotype.Component;

@Component
//Entity class for Customer
public class CustomerEntity {
	private int customerId;
	private String userName;
	private String password;
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String postalCode;
	private String phone;
	private String emailId;
	
	public CustomerEntity() {
		super();
		// TODO Auto-generated constructor stub
	}	
	public CustomerEntity(int customerId, String userName, String password, String firstName, String lastName,
			String address, String city, String postalCode, String phone, String emailId) {
		super();
		this.customerId = customerId;
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.postalCode = postalCode;
		this.phone = phone;
		this.emailId = emailId;
	}


	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
}
