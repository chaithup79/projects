package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class user {

	@Id
	@GeneratedValue
	private int id;

	private String userName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public user() {
		super();
		// TODO Auto-generated constructor stub
	}

	public user(int id, String userName) {
		super();
		this.id = id;
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "user [id=" + id + ", userName=" + userName + "]";
	}

}
