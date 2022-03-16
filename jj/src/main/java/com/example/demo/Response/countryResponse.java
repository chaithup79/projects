package com.example.demo.Response;

import java.util.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.demo.model.City;
import com.example.demo.model.Country;

public class countryResponse {

	    public static ResponseEntity<Object> generateResponse(String message, HttpStatus status, Object responseObj) {
	        Map<String, Object> map = new HashMap<String, Object>();
	            map.put("message", message);
	            map.put("status", status.value());
	            map.put("data", responseObj);

	            return new ResponseEntity<Object>(map,status);
	    }
	    
	    



		public static ResponseEntity<Object> customResponse(List<Country> country, List<City> city) {
			// TODO Auto-generated method stub
	       return new ResponseEntity<Object>(country,null);
		}
	}
