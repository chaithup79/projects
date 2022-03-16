package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.user;

import com.example.demo.repository.userRepository;

@Service
public class userService {

	@Autowired
	private userRepository userrepository;
	

	
	public user addUser(user user)
	{
		return userrepository.save(user);
	}
	
	public List<user> getUser()
	{
		return userrepository.findAll();
	}
	
	public user getUserById(int id)
	{
		return userrepository.findById(id).get();
	}
}
