package com.example.demo.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.responseDto;
import com.example.demo.model.Department;
import com.example.demo.model.student;
import com.example.demo.repository.departmentRepository;
import com.example.demo.repository.studentRepository;

@Service
public class studentService {
	
	@Autowired
	private studentRepository repository;
	
	@Autowired
	private departmentRepository repository2;
	
	public student addStudent(student st)
	{
	return repository.save(st);	
	}

	public Department addDepartment(Department de)
	{
		return repository2.save(de);
	}
	
	public student getStudentById(int id)
	{
		return repository.findById(id).get();
	}
	
	public Department getDepartmentById(int id)
	{
		return repository2.findById(id).get();
	}
	
	public List<student> getStudents()
	{
		return repository.findAll();
	}
	
	public List<Department> getDepartments()
	{
		return repository2.findAll();
	}
	
	public List<student> getStudentByDepartmentName(Department id)
	{
	    
		return repository.findAll().stream().filter(student -> student.getDepartment().equals(id)).collect(Collectors.toList());
	}
	
	public responseDto getDepartmentByName(String name)
	{
    responseDto response = new responseDto();
		
	Department department = repository2.findByName(name).get();
	response.setId(department.getId());
	response.setDepartname(department.getName());
	return response;
	}
}
