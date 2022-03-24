package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Department {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	@OneToMany(mappedBy = "department")
	@JsonIgnore
	private List<student> student;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<student> getStudent() {
		return student;
	}

	public void setStudent(List<student> student) {
		this.student = student;
	}
	public Department(int id, String name, List<com.example.demo.model.student> student) {
		super();
		this.id = id;
		this.name = name;
		this.student = student;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
