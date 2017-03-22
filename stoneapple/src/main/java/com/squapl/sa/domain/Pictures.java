package com.squapl.sa.domain;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pictures {

	@Id
	@GeneratedValue
	private Long Picid;
	private String Picname;
	private String Picurl;
	private String Pictags;
	private String Piccategory;
	private Timestamp uploaded_date;
	private String Uploaded_by;
	public Long getPicid() {
		return Picid;
	}
	public void setPicid(Long picid) {
		Picid = picid;
	}
	public String getPicname() {
		return Picname;
	}
	public void setPicname(String picname) {
		Picname = picname;
	}
	public String getPicurl() {
		return Picurl;
	}
	public void setPicurl(String picurl) {
		Picurl = picurl;
	}
	public String getPictags() {
		return Pictags;
	}
	public void setPictags(String pictags) {
		Pictags = pictags;
	}
	public String getPiccategory() {
		return Piccategory;
	}
	public void setPiccategory(String piccategory) {
		Piccategory = piccategory;
	}
	public Timestamp getUploaded_date() {
		return uploaded_date;
	}
	public void setUploaded_date(Timestamp uploaded_date) {
		this.uploaded_date = uploaded_date;
	}
	public String getUploadedby() {
		return Uploaded_by;
	}
	public void setUploadedby(String uploadedby) {
		Uploaded_by = uploadedby;
	}
	public Pictures(Long picid, String picname, String picurl, String pictags, String piccategory,
			Timestamp uploaded_date, String uploadedby) {
		
		Picid = picid;
		Picname = picname;
		Picurl = picurl;
		Pictags = pictags;
		Piccategory = piccategory;
		uploaded_date = uploaded_date;
		Uploaded_by = uploadedby;
	}
	public Pictures() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Pictures [Picid=" + Picid + ", Picname=" + Picname + ", Picurl=" + Picurl + ", Pictags=" + Pictags
				+ ", Piccategory=" + Piccategory + ", uploaded_date=" + uploaded_date + ", Uploadedby=" + Uploaded_by
				+ "]";
	}
	
	
}
