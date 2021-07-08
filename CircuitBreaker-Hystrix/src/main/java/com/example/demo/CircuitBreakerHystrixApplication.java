package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.example.ws")
@EnableHystrix
@EnableCircuitBreaker
@EnableEurekaClient
@SpringBootApplication
public class CircuitBreakerHystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(CircuitBreakerHystrixApplication.class, args);
	}
	

}
