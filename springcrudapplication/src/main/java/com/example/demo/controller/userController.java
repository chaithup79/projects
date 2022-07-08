package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.user;
import com.example.demo.models.userDTO;
import com.example.demo.services.userService;

@RestController
@RequestMapping("/api")
public class userController {

	@Autowired
	private userService service;

	@GetMapping("/user")
	public Iterable<user> getAllUser() {
		return service.getAllUser();
	}

	@GetMapping("/user/{id}")
	public Optional<user> getUserById(@PathVariable("id") int id) {
		return service.getUSer(id);
	}

	@PostMapping("/user")
	public String saveUser(@RequestBody user user) {
		return service.saveUser(user);

	}

	@PutMapping("/user/{id}")
	public user updateUser(@PathVariable("id") int id, @RequestBody userDTO userDTO) {
		return service.updateUser(id, userDTO);
	}

	@GetMapping("/user/username")
	public List<user> getUserByUsername() {
		return service.getUSerByUsername();
	}
}
