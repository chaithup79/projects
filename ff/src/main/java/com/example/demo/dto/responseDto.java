package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class responseDto {

private int id;
@JsonIgnore
private String name;
private String departname;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public responseDto(int id, String departname) {
	super();
	this.id = id;
	this.departname = departname;
}
public void setName(String name) {
	this.name = name;
}
public String getDepartname() {
	return departname;
}
public void setDepartname(String departname) {
	this.departname = departname;
}
public responseDto(int id, String name, String departname) {
	super();
	this.id = id;
	this.name = name;
	this.departname = departname;
}
public responseDto() {
	super();
	// TODO Auto-generated constructor stub
}

}
