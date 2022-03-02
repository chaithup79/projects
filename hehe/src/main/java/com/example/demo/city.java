package com.example.demo;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
public class city {
    
	public city(int id, String city_name, String city_style) {
		super();
		this.id = id;
		this.city_name = city_name;
		this.city_style = city_style;
	}
	@Id
	@GeneratedValue
	private int id;
	private String city_name;
	private String city_style;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity_name() {
		return city_name;
	}
	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}
	public String getCity_style() {
		return city_style;
	}
	public city() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setCity_style(String city_style) {
		this.city_style = city_style;
	}

}
