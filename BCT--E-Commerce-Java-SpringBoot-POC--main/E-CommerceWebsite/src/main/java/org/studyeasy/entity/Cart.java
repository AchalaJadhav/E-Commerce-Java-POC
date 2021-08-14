package org.studyeasy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="cart")
public class Cart {
	
	@Id
	@Column(name = "cart_id")
	int cart_id;
	
	@NotNull
	@Column(name = "cart_no")
	int cart_no;
	
	@NotNull
	@Column(name = "customer_id")
	int customer_id;

	@NotNull
	@Column(name = "product_id")
	int product_id;
	
	@NotNull
	@Column(name = "product_name")
	String product_name;
	
	@NotNull
	@Column(name = "sku")
	String sku;
	
	@NotNull
	@Column(name = "price")
	Long price;
	
	@NotNull
	@Column(name = "quantity")
	int quantity;
	
	

	public Cart() {
		
	}



	public Cart(int cart_id, int cart_no, int customer_id, int product_id, String product_name, String sku, Long price,
			int quantity) {
		super();
		this.cart_id = cart_id;
		this.cart_no = cart_no;
		this.customer_id = customer_id;
		this.product_id = product_id;
		this.product_name = product_name;
		this.sku = sku;
		this.price = price;
		this.quantity = quantity;
	}



	public int getCart_id() {
		return cart_id;
	}



	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}



	public int getCart_no() {
		return cart_no;
	}



	public void setCart_no(int cart_no) {
		this.cart_no = cart_no;
	}



	public int getCustomer_id() {
		return customer_id;
	}



	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}



	public int getProduct_id() {
		return product_id;
	}



	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}



	public String getProduct_name() {
		return product_name;
	}



	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}



	public String getSku() {
		return sku;
	}



	public void setSku(String sku) {
		this.sku = sku;
	}



	public Long getPrice() {
		return price;
	}



	public void setPrice(Long price) {
		this.price = price;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	@Override
	public String toString() {
		return "Cart [cart_id=" + cart_id + ", cart_no=" + cart_no + ", customer_id=" + customer_id + ", product_id="
				+ product_id + ", product_name=" + product_name + ", sku=" + sku + ", price=" + price + ", quantity="
				+ quantity + "]";
	}

	
	

	
}