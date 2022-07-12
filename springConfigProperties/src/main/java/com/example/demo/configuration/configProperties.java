package com.example.demo.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
public class configProperties {

	@Value("${spring.application.username}")
	private String username;
	
	@Value("${spring.application.password}")
	private String password;
	
	@Value("${spring.application.name}")
	private String database;
	
	
	
	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getDatabase() {
		return database;
	}



	public void setDatabase(String database) {
		this.database = database;
	}

	


	public configProperties() {
		
		// TODO Auto-generated constructor stub
	}



	public configProperties(String username, String password, String database) {
		super();
		this.username = username;
		this.password = password;
		this.database = database;
	}
	
     
	
}
