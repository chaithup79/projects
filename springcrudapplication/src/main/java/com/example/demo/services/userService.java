package com.example.demo.services;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.models.user;
import com.example.demo.models.userDTO;
import com.example.demo.repository.userRepository;

@Service
public class userService {

	@Autowired
	private userRepository repository;

	public Iterable<user> getAllUser() {
		return repository.findAll();
	}

	public Optional<user> getUSer(int id) {
		return repository.findById(id);
	}

	public String saveUser(user user) {
		repository.save(user);
		return "saved into database";
	}

	public user updateUser(int id, userDTO userDTO) {
		if(repository.findById(id).isPresent())
		{
		user user = repository.findById(id).get();
//		System.out.println(userName);
		user.setUserName(userDTO.getUserName());
		user user6=repository.save(user);
		return user6;
		}
		else
		{
			return null;
		}
	}
	
	public List<user> getUSerByUsername()
	{
		List<user> users=repository.findAll();
		List<user> sortedusers=users.stream().sorted(Comparator.comparing(user::getUserName)).collect(Collectors.toList());
		return sortedusers;
	
		
	}
}
