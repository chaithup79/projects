package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Contact {

	@Id
	@GeneratedValue
	private int id;
	private String number;
	private String name;
	@JsonBackReference
	@ManyToOne(fetch= FetchType.EAGER)
	@JoinColumn(name="user_id", referencedColumnName = "id")
	private user user;

	public user getUser() {
		return user;
	}
	public void setUser(user user) {
		this.user = user;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Contact(int id, String number, String name) {
		super();
		this.id = id;
		this.number = number;
		this.name = name;
	}
	public Contact(int id, String number, String name, user user) {
		super();
		this.id = id;
		this.number = number;
		this.name = name;
		this.user = user;
	}
	public Contact() {

	}
	
}
