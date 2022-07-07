package com.example.demo.models;

public class userDTO {

	
	private String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public userDTO(String userName) {
		super();
		this.userName = userName;
	}

	public userDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "userDTO [userName=" + userName + "]";
	}
	
}
