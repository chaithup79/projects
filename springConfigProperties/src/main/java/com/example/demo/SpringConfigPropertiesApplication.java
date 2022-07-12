package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.example.demo.configuration.configProperties;

@SpringBootApplication
public class SpringConfigPropertiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringConfigPropertiesApplication.class, args);
	}

}
