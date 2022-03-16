package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.City;
import com.example.demo.model.Country;
import com.example.demo.repository.cityRepository;
import com.example.demo.repository.countryRepository;

@Service
public class service {

	@Autowired
	private cityRepository ciRepository;
	
	@Autowired
	private countryRepository coRepository;
	
	public Iterable<Country> getAllCountry()
	{
		return coRepository.findAll();
	}
	
	public Country addCountry(Country country)
	{
		return coRepository.save(country);
	}
	
	public City addCity(City city)
	{
		return ciRepository.save(city);
	}
	
	public Iterable<City> getAllCity()
	{
		return ciRepository.findAll();
	}
}
