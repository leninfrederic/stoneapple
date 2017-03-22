package com.squapl.sa.domain;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Category {

	
	@Id
	@GeneratedValue
	private long idcategory;
	private String category_value;
	private Timestamp updated_date;
	private String updated_by;
	
	public long getIdcategory() {
		return idcategory;
	}
	public void setIdcategory(int idcategory) {
		this.idcategory = idcategory;
	}
	public String getCategory_value() {
		return category_value;
	}
	public void setCategory_value(String category_value) {
		this.category_value = category_value;
	}
	public Timestamp getUpdated_date() {
		return updated_date;
	}
	public void setUpdated_date(Timestamp updated_date) {
		this.updated_date = updated_date;
	}
	public String getUpdated_by() {
		return updated_by;
	}
	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}
	public Category(int idcategory, String category_value, Timestamp updated_date, String updated_by) {
		
		this.idcategory = idcategory;
		this.category_value = category_value;
		this.updated_date = updated_date;
		this.updated_by = updated_by;
	}
	
	
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "category [idcategory=" + idcategory + ", category_value=" + category_value + ", updated_date="
				+ updated_date + ", updated_by=" + updated_by + "]";
	}
	
	
}
