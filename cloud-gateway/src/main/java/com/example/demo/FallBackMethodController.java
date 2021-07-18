package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {
	
	@GetMapping("/subscriptionServiceFallBack")
	public String subscriptionServiceFallBackMethod() {
		return "Subscription Service is taking longer time" + "Please try again Later";
	}

	@GetMapping("/bookServiceFallBack")
	public String bookServiceFallBackMethod() {
		return "Book Service is taking longer time" + "Please try again Later";
	}

}
