package com.squapl.sa.domain;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Property {

	@Id
	@GeneratedValue
	private Long idproperty;
	private String prop_key;
	private String prop_value;
	private Timestamp updated_date;
	private String updated_by;
	
	public Long getIdproperty() {
		return idproperty;
	}
	public void setIdproperty(Long idproperty) {
		this.idproperty = idproperty;
	}
	public String getProp_key() {
		return prop_key;
	}
	public void setProp_key(String prop_key) {
		this.prop_key = prop_key;
	}
	public String getProp_value() {
		return prop_value;
	}
	public void setProp_value(String prop_value) {
		this.prop_value = prop_value;
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
	public Property(Long idproperty, String prop_key, String prop_value, Timestamp updated_date, String updated_by) {
	
		this.idproperty = idproperty;
		this.prop_key = prop_key;
		this.prop_value = prop_value;
		this.updated_date = updated_date;
		this.updated_by = updated_by;
	}
	public Property() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Property [idproperty=" + idproperty + ", prop_key=" + prop_key + ", prop_value=" + prop_value
				+ ", updated_date=" + updated_date + ", updated_by=" + updated_by + "]";
	}
	
	
	
	
	
	
}
