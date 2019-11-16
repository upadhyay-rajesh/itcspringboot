package com.springmvcorm.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity //this annotation will indicate , table name will be class name FacebookEmployee
public class FacebookEmployee {
	@Id     //this annotation uses email as primary key
	private String email;
	private String address;
	private String name;
	private String password;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
