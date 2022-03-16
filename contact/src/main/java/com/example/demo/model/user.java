package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class user {

	@Id
	@GeneratedValue
	private int id;
	private String username;
	@OneToMany
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	List<Contact> contact = new ArrayList<>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public List<Contact> getContact() {
		return contact;
	}
	public void setContact(List<Contact> contact) {
		this.contact = contact;
	}
	public user(int id, String username, List<Contact> contact) {
		super();
		this.id = id;
		this.username = username;
		this.contact = contact;
	}
	public user() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
