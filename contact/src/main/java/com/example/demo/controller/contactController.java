package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Contact;
import com.example.demo.model.user;
import com.example.demo.service.contactService;

@RestController
@RequestMapping("api/")
public class contactController {

	@Autowired
	private contactService contactservice;
	
	@PostMapping("addContact/")
	public Contact addContact(@RequestBody Contact contact)
	{
		return contactservice.addContact(contact);
	}
	
	@GetMapping("getContact/")
	public List<Contact> getContact()
	{
		return contactservice.getContact();
	}
	
	@GetMapping("getContactForThatUser/{id}")
	public List<Contact> getContactForThatUser(@PathVariable int id)
	{
		return contactservice.getContactForThatUser(id);
	}
}
