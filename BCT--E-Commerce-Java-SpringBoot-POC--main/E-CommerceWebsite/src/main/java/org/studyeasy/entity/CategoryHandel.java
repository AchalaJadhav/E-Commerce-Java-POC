package org.studyeasy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name ="category_handel")
public class CategoryHandel {
	@Id
	@Column(name = "category_id")
	int category_id;


	@Column(name = "parent_id")
	int parent_id;


	public CategoryHandel() {
		
	}


	public CategoryHandel(int category_id, int parent_id) {
		super();
		this.category_id = category_id;
		this.parent_id = parent_id;
	}


	public int getCategory_id() {
		return category_id;
	}


	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}


	public int getParent_id() {
		return parent_id;
	}


	public void setParent_id(int parent_id) {
		this.parent_id = parent_id;
	}


	@Override
	public String toString() {
		return "CategoryHandel [category_id=" + category_id + ", parent_id=" + parent_id + "]";
	}

	
	
		
     
	
}
