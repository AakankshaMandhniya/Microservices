package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	String message = "Welcome to Fis";
	String name = "Aaks";
	@GetMapping("/greetings")
	public String greetings()
	{
		return message +" ----->" + name;
		
	}
}
