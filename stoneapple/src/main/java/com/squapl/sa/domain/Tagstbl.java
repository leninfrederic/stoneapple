package com.squapl.sa.domain;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Tagstbl {
	
	@Id
	@GeneratedValue
	private Long idtags;
	private String tag_category;
	private String tag_value;
	private Timestamp updated_date;
	private String updated_by;
	
	public Long getIdtags() {
		return idtags;
	}
	public void setIdtags(Long idtags) {
		this.idtags = idtags;
	}
	public String getTag_category() {
		return tag_category;
	}
	public void setTag_category(String tag_category) {
		this.tag_category = tag_category;
	}
	public String getTag_value() {
		return tag_value;
	}
	public void setTag_value(String tag_value) {
		this.tag_value = tag_value;
	}
	public Timestamp getUpdate_date() {
		return updated_date;
	}
	public void setUpdate_date(Timestamp update_date) {
		this.updated_date = update_date;
	}
	public String getUpdated_by() {
		return updated_by;
	}
	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}
	public Tagstbl(Long idtags, String tag_category, String tag_value, Timestamp update_date, String updated_by) {
		
		this.idtags = idtags;
		this.tag_category = tag_category;
		this.tag_value = tag_value;
		this.updated_date = update_date;
		this.updated_by = updated_by;
	}
	public Tagstbl() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Tagstbl [idtags=" + idtags + ", tag_category=" + tag_category + ", tag_value=" + tag_value
				+ ", update_date=" + updated_date + ", updated_by=" + updated_by + "]";
	}

	
	
}
