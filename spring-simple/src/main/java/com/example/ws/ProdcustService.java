package com.example.ws;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
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


@KafkaListener(topics = "ProductTopic", groupId="Group1")

public void messageListner (ConsumerRecord<String, String> cr) throws Exception {

    String message = cr.value();

    System.out.println("###################Message Received Listner 1: " + message);
}

}