package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloFis {

	@GetMapping("/hello")
	public String helloFis() {
		return "Hello Fis India LTD!";
	}
}
