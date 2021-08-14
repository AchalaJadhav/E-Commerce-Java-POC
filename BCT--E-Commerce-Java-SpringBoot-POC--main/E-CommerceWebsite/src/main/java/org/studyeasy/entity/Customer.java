package org.studyeasy.entity;


import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;


import javax.validation.constraints.NotBlank;


@Entity
@Table(name="customer")
public class Customer {
	
	@Id
	@Column(name = "customer_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int customer_id;
	
	@NotBlank
	private String username;
	
	@NotNull
	@Column(name = "email")
	String email;
	
	@NotNull
	@Column(name = "name")
	String name;
	
	@NotNull
	@Column(name = "phone_number")
	String phone_number;
	
	@NotNull
	@Column(name = "billing_address")
	String billing_address;
	
	@NotNull
	@Column(name = "default_address")
	String default_address;
	
	@NotNull
	@Column(name = "country")
	String country;
	
	@NotNull
	@Column(name = "user_password")
    String UserPassword;

	public Customer() {
		
	}

	public Customer(int customer_id, String email, String name, String phone_number, String billing_address,
			String default_address, String country, String userPassword) {
		super();
		this.customer_id = customer_id;
		this.email = email;
		this.name = name;
		this.phone_number = phone_number;
		this.billing_address = billing_address;
		this.default_address = default_address;
		this.country = country;
		UserPassword = userPassword;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getBilling_address() {
		return billing_address;
	}

	public void setBilling_address(String billing_address) {
		this.billing_address = billing_address;
	}

	public String getDefault_address() {
		return default_address;
	}

	public void setDefault_address(String default_address) {
		this.default_address = default_address;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getUserPassword() {
		return UserPassword;
	}

	public void setUserPassword(String userPassword) {
		UserPassword = userPassword;
	}

	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", email=" + email + ", name=" + name + ", phone_number="
				+ phone_number + ", billing_address=" + billing_address + ", default_address=" + default_address
				+ ", country=" + country + ", UserPassword=" + UserPassword + "]";
	}
	
	

	
}