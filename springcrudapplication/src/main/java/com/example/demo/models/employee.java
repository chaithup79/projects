package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class employee {

	@Id
	@GeneratedValue
	private int employeeId;
	private int salary;
	private String emploeename;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getEmploeename() {
		return emploeename;
	}
	public void setEmploeename(String emploeename) {
		this.emploeename = emploeename;
	}
	public employee(int employeeId, int salary, String emploeename) {
		super();
		this.employeeId = employeeId;
		this.salary = salary;
		this.emploeename = emploeename;
	}
	public employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "employee [employeeId=" + employeeId + ", salary=" + salary + ", emploeename=" + emploeename + "]";
	}
	
	
}
