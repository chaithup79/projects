package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homeController {

	
	@Autowired
	private cityService ciService;
	
	@Autowired
	private cityRepository ciRepository;
	
	
	@GetMapping("/")
	public String home()
	{
		return "Hello World!";
	}
	
	@GetMapping("/city")
	public List<city> getCity()
	{
	return (List<city>) ciRepository.findAll();
	}
	
	@PostMapping("/city")
	public city addCity(@RequestBody city ci)
	{
		return ciRepository.save(ci);
		
	}
	
	@GetMapping("/city/{id}")
	public Optional<city> getCityById(@PathVariable("id") int id) {
		return ciRepository.findById(id);
	}
}
