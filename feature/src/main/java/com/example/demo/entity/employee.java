package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class employee {

	
	@Id
	@GeneratedValue
	private int id;
	private String EmployeeName;
	private String EmployeeDepartment;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public String getEmployeeDepartment() {
		return EmployeeDepartment;
	}
	public void setEmployeeDepartment(String employeeDepartment) {
		EmployeeDepartment = employeeDepartment;
	}
	public employee(int id, String employeeName, String employeeDepartment) {
		super();
		this.id = id;
		EmployeeName = employeeName;
		EmployeeDepartment = employeeDepartment;
	}
	public employee() {
		
	}
	@Override
	public String toString() {
		return "employee [id=" + id + ", EmployeeName=" + EmployeeName + ", EmployeeDepartment=" + EmployeeDepartment
				+ "]";
	}
	
}
