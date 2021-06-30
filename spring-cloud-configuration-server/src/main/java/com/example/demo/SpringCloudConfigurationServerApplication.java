package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer //this micro will run as a spring cloud server everything already downloaded and will work as server
public class SpringCloudConfigurationServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigurationServerApplication.class, args);
	}

}
