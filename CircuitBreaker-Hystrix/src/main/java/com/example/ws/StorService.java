package com.example.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@RestController
public class StorService {
	@Value ("${spring.application.name}")	
	String appName;	

	@Value ("${server.port}")	
	String portNumber;		
	
	@Autowired
    RestTemplate restTemplate;

	@GetMapping("Store/get/{id}")

	@HystrixCommand(fallbackMethod = "fallbackProducts", commandProperties = {			
			@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1000"),
			@HystrixProperty(name ="circuitBreaker.requestVolumeThreshold", value="3"),
			@HystrixProperty(name ="circuitBreaker.sleepWindowInMilliseconds", value="10000"),
			@HystrixProperty(name ="circuitBreaker.errorThresholdPercentage", value="50"),
			@HystrixProperty(name ="metrics.rollingStats.timeInMilliseconds", value="10000")
			})	


	public String getStore(@PathVariable String id) {
		StringBuilder message = new StringBuilder();
		message.append("AppName: " + appName + ", \n");
		message.append("portNumber: " + portNumber + ", \n");
		message.append("Store: " + id + ", \n");
		message.append("Product: " + callWithServiceDiscovery(id) + ", \n");

		return message.toString();
	}
	/*
	 * @Value("${product.service.path}") String servicePath;
	 */
	
	private String callWithServiceDiscovery(String id) {
		String uri = "http://ProductService/Product/get/{id}";
		String upc = restTemplate.exchange(uri, HttpMethod.GET, null, new 	ParameterizedTypeReference<String>() {},id).getBody();
		return upc;
	}
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
	         HttpComponentsClientHttpRequestFactory httpRequestFactory = new HttpComponentsClientHttpRequestFactory();
	        httpRequestFactory.setConnectionRequestTimeout(30000);
	        httpRequestFactory.setConnectTimeout(30000);
	        httpRequestFactory.setReadTimeout(30000);
	        
	return new RestTemplate(httpRequestFactory);
	}
	private String fallbackProducts (String  id) {
		return "Service is not available: id - " + id;
	}

	/*
	 * private String httpClient(String id) {
	 * 
	 * HttpHeaders headers = new HttpHeaders(); HttpEntity <String> entity = new
	 * HttpEntity<String>(headers);
	 * 
	 * String uri = servicePath + "/Product/get/" + id;
	 * 
	 * System.out.println("URI:" + uri);
	 * 
	 * String upc = restTemplate().exchange(uri, HttpMethod.GET, entity,
	 * String.class).getBody(); return upc; } public RestTemplate restTemplate() {
	 * 
	 * HttpComponentsClientHttpRequestFactory httpRequestFactory = new
	 * HttpComponentsClientHttpRequestFactory();
	 * 
	 * return new RestTemplate(httpRequestFactory);
	 * 
	 * }
	 */

}
