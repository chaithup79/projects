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

import com.example.demo.entity.employee;
import com.example.demo.service.employeeService;

@RestController
@RequestMapping("/api")
public class employeeController {

	@Autowired
	private employeeService service;

	@GetMapping("/employee")
	public List<employee> getEmployees() {
		return service.getEmployees();
	}

	@GetMapping("/employee/{id}")
	public Optional<employee> getEmployee(@PathVariable("id") int id) {
		return service.getEmployee(id);
	}
	
	@PostMapping("/employee")
	public employee saveEmployee(@RequestBody employee emp)
	{
		return service.saveEmployee(emp);
	}

	
}
