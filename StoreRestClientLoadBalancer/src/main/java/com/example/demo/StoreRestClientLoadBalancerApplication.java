package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan("com.example.ws")
@SpringBootApplication
public class StoreRestClientLoadBalancerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreRestClientLoadBalancerApplication.class, args);
	}

}
