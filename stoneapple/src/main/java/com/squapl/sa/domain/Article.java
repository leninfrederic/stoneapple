package com.squapl.sa.domain;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;


@Entity
public class Article {

	@Id
	@GeneratedValue
	private Long idarticle;
	private String art_title_en;
	private String art_title_rl;
	private int createdby;
	private Timestamp published_timestamp;

	public Long getIdarticle() {
		return idarticle;
	}

	public void setIdarticle(Long idarticle) {
		this.idarticle = idarticle;
	}

	
	public String getArt_title_en() {
		return art_title_en;
	}
	
	public void setArt_title_en(String art_title_en) {
		this.art_title_en = art_title_en;
	}
	
	public String getArt_title_rl() {
		return art_title_rl;
	}
	
	public void setArt_title_rl(String art_title_rl) {
		this.art_title_rl = art_title_rl;
	}
	
	public int getCreatedby() {
		return createdby;
	}

	public void setCreatedby(int createdby) {
		this.createdby = createdby;
	}

	public Timestamp getPublished_timestamp() {
		return published_timestamp;
	}

	public void setPublished_timestamp(Timestamp published_timestamp) {
		this.published_timestamp = published_timestamp;
	}	
	
	 @Override
    public String toString() {
        return "Article{" + "idarticle='" + idarticle + '\'' + ", art_title_en='" + art_title_en + '\'' + '}';
    }
	 
}
