package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.City;
import com.example.demo.model.Country;
import com.example.demo.repository.cityRepository;
import com.example.demo.service.service;

@RestController
@RequestMapping("api/")
public class CityController {

	@Autowired
	private service service;
	
	@GetMapping("/getAllCountry")
	public Iterable<Country> getAllCountry()
	{
		return service.getAllCountry();
	}
	
	@PostMapping("addCountry/")
    public Country addCountry(@RequestBody Country country)
    {
    	return service.addCountry(country);
    }
	
	@PostMapping("addCity/")
	public City addCity(@RequestBody City city)
	{
		return service.addCity(city);
	}
    
	@GetMapping("getAllCity/")
	public Iterable<City> getAllCity()
	{
		return service.getAllCity();
	}
	
	
}
