package com.example.demo.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Contact;
import com.example.demo.model.user;
import com.example.demo.repository.contactRepository;
import com.example.demo.repository.userRepository;

@Service
public class userService {

	@Autowired
	private contactRepository conrepository;
	@Autowired
	private userRepository userrepository;
	
	public void addUser(user user)
	{
		userrepository.save(user);
	}
	
	public List<user> getAllUser()
	{
		return userrepository.findAll();
	}
	
	public void addContact(Contact contact)
	{
		conrepository.save(contact);
	}
	
	public user getUser(int id)
	{
		return null;
	}
	
	
}
