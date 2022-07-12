package com.example.demo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.configuration.configProperties;

@RestController
@RequestMapping("/config")
public class configController {


	@Autowired
	private configProperties config;




	@GetMapping
	public Map<String, String> getConfig()
	{
		return Map.of("username",config.getUsername().toString(),
				"password",config.getPassword().toString(),
				"database",config.getDatabase().toString());
	}
}
