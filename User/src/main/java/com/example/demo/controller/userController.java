package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.user;
import com.example.demo.service.userService;

@RestController
@RequestMapping("api/")
public class userController {

	@Autowired
	private userService userservice;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@PostMapping("addUser/")
	public user addUser(@RequestBody user user)
	{
	 return userservice.addUser(user);
	}
	
	@GetMapping("getUser/")
	public List<user> getUser()
	{
		return userservice.getUser();
	}
	
	@GetMapping("getUserById/{id}")
	public user getUserById(@PathVariable int id)
	{
		user user= userservice.getUserById(id);
		List contact= this.restTemplate.getForObject("http://localhost:8080/api/getContactForThatUser/"+id, List.class);
		user.setContact(contact);
		return user;
		
	}
}
