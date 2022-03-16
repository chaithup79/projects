package com.example.demo.dto;

import com.example.demo.model.Country;

import java.util.List;

import com.example.demo.model.City;


public class ResponseDTO {

	private Country country;
	private List<City> city;
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public List<City> getCity() {
		return city;
	}
	public void setCity(List<City> city) {
		this.city = city;
	}
	public ResponseDTO(Country country, List<City> city) {
		super();
		this.country = country;
		this.city = city;
	}
	public ResponseDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
//		return "ResponseDTO [country=" + country + ", city=" + city + "]";
		return "ResponseDTO [country=" + country +" " + city +"]";
	}
	
}
