package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
@RefreshScope
public class RestController {
	
	@Value("${greeting.message}")
	 String message;
	@Value("${greeting.name}")
	String name;
	/*
	 * String message = "Welcome to Fis"; String name = "Aaks";
	 */
	@GetMapping("/greeting")
	public String greeting()
	{
		return message +" ----->" + name;
		
	}
	
}
