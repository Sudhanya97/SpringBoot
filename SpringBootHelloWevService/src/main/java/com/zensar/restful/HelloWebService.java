package com.zensar.restful;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWebService {

	@GetMapping("/Hello")
	public String sayHello() {
		
		return "Welcome to Zensar Restful service";
	}
	
}
