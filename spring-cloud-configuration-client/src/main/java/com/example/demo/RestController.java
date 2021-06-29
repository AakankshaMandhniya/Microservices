package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
String message="Welcome to FIS world";
String name="Aaks";
	@GetMapping("/greeting")
	public String greeting() {
		return message + "------>" +name;
	}
}
