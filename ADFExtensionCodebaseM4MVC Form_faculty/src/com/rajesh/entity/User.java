package com.rajesh.entity;

/**
 * User entity object containing the user details. Represents an User domain
 * Object.
 */

public class User {

	private String userName;

	private String password;
	
	private String country;

	public String getPassword() {
		return this.password;
	}

	/**
	 * This method set the password.
	 * 
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * This method get the user name.
	 * 
	 * @return user name.
	 */

	public String getUserName() {
		return userName;
	}

	/**
	 * This method set the user name.
	 * 
	 * @param userName
	 *            user name
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
