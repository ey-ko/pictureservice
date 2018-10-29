package org.sp.pictureservice.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
public class Event {

	private long id;
	private String title;
	private Date date;
	private Map<Long, Picture> pictures = new HashMap<>();
	
	public Event(){}
	
	public Event (long id, String title, Date date){
		this.id = id;
		this.title = title;
		this.date = date;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@XmlTransient
	public Map<Long, Picture> getPictures() {
		return pictures;
	}

	public void setPictures(Map<Long, Picture> pictures) {
		this.pictures = pictures;
	}
	
}
