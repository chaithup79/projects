package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.responseDto;
import com.example.demo.model.Department;
import com.example.demo.model.student;
import com.example.demo.services.studentService;

@RestController
@RequestMapping("cc")
public class studentController {

	@Autowired
	private studentService service;
	
	@PostMapping("/addstudent")
	public student addStudent(@RequestBody student st) 
	{
		return service.addStudent(st);
	}
	
	@PostMapping("/adddepartment")
	public Department addDepartment(@RequestBody Department de)
	{
		return service.addDepartment(de);
	}
	
	@GetMapping("/getStudent/{id}")
    public student getStudentById(@PathVariable("id") int id)
    {
    	return service.getStudentById(id);
    }
	
	@GetMapping("/getDepartment/{id}")
	public Department getDepartmentById(@PathVariable("id") int id)
	{
		return service.getDepartmentById(id);
	}
	
	@GetMapping("/getStudents")
	public List<student> getStudents()
	{
		return service.getStudents();
	}
	
	@GetMapping("/getDepartments")
	public List<Department> getDepartments()
	{
		return service.getDepartments();
	}
	
	@GetMapping("/getDepartmentName/{id}")
	public List<student> getStudentByDepartmentName(@PathVariable("id") Department id)
	{
		return service.getStudentByDepartmentName(id);
	}
	
	@GetMapping("/getDepartmentByName")
	public responseDto getDepartmentByName(@RequestParam String name)
	{
	return service.getDepartmentByName(name);
	}
}
