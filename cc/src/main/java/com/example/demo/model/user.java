package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class user {

	@Id
	@GeneratedValue
	private int id;
	private String username;
	private String userDescription;
//	@OneToMany(targetEntity=Dept.class, cascade = CascadeType.ALL)
//	@JoinColumn(name="hehe",referencedColumnName = "id")
//	@OneToMany(targetEntity=Contact.class, cascade=CascadeType.ALL)
//	@JoinColumn(name="user_contact",referencedColumnName = "id")
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	private List<Contact> contact;
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
	public String getUserDescription() {
		return userDescription;
	}
	public void setUserDescription(String userDescription) {
		this.userDescription = userDescription;
	}

	public List<Contact> getContact() {
		return contact;
	}
	public void setContact(List<Contact> contact) {
		this.contact = contact;
	}
	public user(int id, String username, String userDescription, List<Contact> contact) {
		super();
		this.id = id;
		this.username = username;
		this.userDescription = userDescription;
		this.contact = contact;
	}
	public user() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
