package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class City {

	@Id
	@GeneratedValue
	private int id;
	private String cityname;
	@ManyToOne
	private Country country;
	public City(int id, String cityname, Country country) {
		super();
		this.id = id;
		this.cityname = cityname;
		this.country = country;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public City(int id, String cityname) {
		super();
		this.id = id;
		this.cityname = cityname;
	}
	public City() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
