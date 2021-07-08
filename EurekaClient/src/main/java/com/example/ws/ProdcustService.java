package com.example.ws;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdcustService {

@Value ("${spring.application.name}")	
String appName;	

@Value ("${server.port}")	
String portNumber;		

@GetMapping ("Product/get/{id}")	
public String getProduct(@PathVariable String id) {			

	StringBuilder message = new StringBuilder();	
	message.append("AppName: " + appName + ", \n");		
	message.append("portNumber: " + portNumber + ", \n");	
	message.append("Product: " + id + ", \n");	
			
	return message.toString();	
}	

}