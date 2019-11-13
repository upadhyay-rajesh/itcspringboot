package com.rajesh.entity;

/**
 * Customer entity object containing the user details. Represents an Customer domain
 * Object.
 */
public class Customer {
	
	private String firstName;
	private String lastName;
	private int gender; //(1 - male, 2 - female)
	private String address;
	private String city;
	private String country;
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getGender() {
		return gender;
	}
	public String getAddress() {
		return address;
	}
	public String getCity() {
		return city;
	}
	public String getCountry() {
		return country;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setCountry(String country) {
		this.country = country;
	}

}
