package org.studyeasy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;

import com.sun.istack.NotNull;


@Entity
@Table(name ="product")
public class Product {
	
	@Id
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
	Long  price;
	
	@Column(name = "product_description")
	String product_description;
	
	@Column(name = "image ")
	String image ;
	
	@NotNull
	@Column(name = "stock")
	int stock;

	public Product() {
		
	}

	public Product(int product_id, String product_name, String sku, Long price, String product_description,
			String image, int stock) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.sku = sku;
		this.price = price;
		this.product_description = product_description;
		this.image = image;
		this.stock = stock;
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

	public String getProduct_description() {
		return product_description;
	}

	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Product [product_id=" + product_id + ", product_name=" + product_name + ", sku=" + sku + ", price="
				+ price + ", product_description=" + product_description + ", image=" + image + ", stock=" + stock
				+ "]";
	}

	
	
}
