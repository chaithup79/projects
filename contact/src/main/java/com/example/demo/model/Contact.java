package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Contact {

	@Id
	@GeneratedValue
	private int id;
	private String contactname;
	@ManyToOne
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JsonIgnore
	private user userId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContactname() {
		return contactname;
	}
	public void setContactname(String contactname) {
		this.contactname = contactname;
	}
	public Contact(int id, String contactname) {
		super();
		this.id = id;
		this.contactname = contactname;
	}
	public user getUserId() {
		return userId;
	}
	public void setUserId(user userId) {
		this.userId = userId;
	}
	public Contact(int id, String contactname, user userId) {
		super();
		this.id = id;
		this.contactname = contactname;
		this.userId = userId;
	}
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
