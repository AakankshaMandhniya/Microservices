package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@ComponentScan("com.example.ws")
@SpringBootApplication
public class SpringSimpleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSimpleApplication.class, args);
	}

}
