package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Contact;
import com.example.demo.model.user;
import com.example.demo.repository.contactRepository;
import com.example.demo.repository.userRepository;

@Service
public class contactService {

	@Autowired
	private contactRepository contactrepository;
	
	@Autowired
	private userRepository userrepository;
	
	public Contact addContact(Contact contact)
	{
	return contactrepository.save(contact);
	}
	
	public List<Contact> getContact()
	{
		return contactrepository.findAll();
	}
	
	public List<Contact> getContactForThatUser(int userId)
	{
		user user= userrepository.getById(userId);
		return contactrepository.findAll().stream().filter(Contact -> Contact.getUserId().equals(user)).collect(Collectors.toList());
	}
}
