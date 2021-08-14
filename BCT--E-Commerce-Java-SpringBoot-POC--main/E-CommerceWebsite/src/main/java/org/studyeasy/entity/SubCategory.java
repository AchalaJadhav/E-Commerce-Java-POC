package org.studyeasy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name ="subcategory")
public class SubCategory {
	
	@Id
	@Column(name = "category_id")
	int category_id;
	
	@NotNull
	@Column(name = "category_name")
	String category_name;
	
	
	@Column(name = "product_id")
	Integer product_id;


	public SubCategory() {
		
	}


	public SubCategory(int category_id, String category_name, int product_id) {
		super();
		this.category_id = category_id;
		this.category_name = category_name;
		this.product_id = product_id;
	}


	public int getCategory_id() {
		return category_id;
	}


	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}


	public String getCategory_name() {
		return category_name;
	}


	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}


	public int getProduct_id() {
		return product_id;
	}


	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}


	@Override
	public String toString() {
		return "SubCategory [category_id=" + category_id + ", category_name=" + category_name + ", product_id="
				+ product_id + "]";
	}
	
	

}
