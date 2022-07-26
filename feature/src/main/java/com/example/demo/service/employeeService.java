package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.employee;
import com.example.demo.repository.employeeRepository;

@Service
public class employeeService {

	@Autowired
	private employeeRepository repository;

	public List<employee> getEmployees() {
		return repository.findAll();
	}

	public Optional<employee> getEmployee(int id) {
		return repository.findById(id);
	}

	public employee saveEmployee(employee emp)
	{
		return repository.save(emp);
	}
}
