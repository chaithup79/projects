package com.example.demo.service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.Response.countryResponse;
import com.example.demo.dto.ResponseDTO;
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
	
	public ResponseDTO getCountryByID(int id)
	{
       Country country =  coRepository.findById(id).get();
//     System.out.println(country);
//     
     List<City> city=ciRepository.findAll().stream().filter(City -> City.getCountry().equals(country)).collect(Collectors.toList());
	
     return new ResponseDTO(country,city);     
	}
}
//	List<City> city = new LinkedList<>();
//	for(Country c : country)
//	{
//	city= ciRepository.findAll().stream().filter(City -> City.getCountry().equals(c.getId())).collect(Collectors.toList());
//	}
//	return countryResponse.customResponse(country, city);
//	}

