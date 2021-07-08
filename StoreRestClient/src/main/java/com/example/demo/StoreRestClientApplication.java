package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.example.ws")
@SpringBootApplication
public class StoreRestClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreRestClientApplication.class, args);
	}

}
