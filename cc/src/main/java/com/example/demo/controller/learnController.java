package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Contact;
import com.example.demo.model.user;
import com.example.demo.repository.userRepository;
import com.example.demo.service.userService;

@RestController
@RequestMapping("/api")
public class learnController {

	@Autowired
	private userService userservice;
	
	@PostMapping("/addUser")
	public void addUser(@RequestBody user user)
	{
		userservice.addUser(user);
	}
	
	@GetMapping("/getAllUser")
	public List<user> getAllUser()
	{
		return userservice.getAllUser();
	}
	
	@PostMapping("/addContact")
	public void addContact(@RequestBody Contact contact)
	{
		userservice.addContact(contact);
	}
	
	@GetMapping("/getUser/{id}")
	public user getUser(@PathVariable int id)
	{
		
		return userservice.getUser(id);
	}
}
