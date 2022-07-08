package com.example.demo.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.employee;
import com.example.demo.services.emplyeeService;

@RestController
@RequestMapping("/api")
public class employeeController {

	@Autowired
	private emplyeeService service;

	@GetMapping("/employees")
	public List<employee> getAllEmployee() {
		return service.getAllEmployee();
	}

	@PostMapping("/employees")
	public String addEmployee(@RequestBody employee employee) {
		return service.addEmployee(employee);
	}

	@GetMapping("/employees/{id}")
	public employee nthEmployee(@PathVariable("id") int id)
	{
		return service.nthEmployee(id);
	}


}
