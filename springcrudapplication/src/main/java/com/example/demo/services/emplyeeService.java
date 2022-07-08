package com.example.demo.services;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.employee;
import com.example.demo.repository.employeeRepository;

@Service
public class emplyeeService {

	@Autowired
	private employeeRepository empRepository;
	
	
	
	public List<employee> getAllEmployee()
	{
		List<employee> employeeList=new LinkedList<>();
		empRepository.findAll().forEach(employeeList::add);
		return employeeList;
	}
	
	public String addEmployee(employee employee)
	{
		empRepository.save(employee);
		return "employee";
	}
	
	public employee nthEmployee(int n)
	{
		
		List<employee> empList=new LinkedList<>();
		empRepository.findAll().forEach(empList::add);
		employee emp = empList.stream().sorted(Comparator.comparing(employee::getSalary).reversed()).skip(n-1).findFirst().get();
		return emp;
	}
	
}
