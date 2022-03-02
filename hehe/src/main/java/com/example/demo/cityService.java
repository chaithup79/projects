package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.ServerEndpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class cityService {
 
	@Autowired
	private cityRepository ciRepository;



	public List<city> getCity() {
		// TODO Auto-generated method stub
		return (List<city>) ciRepository.findAll();
	}
	
	public city addCity(city ci)
	{
		return ciRepository.save(ci);
	}
}
