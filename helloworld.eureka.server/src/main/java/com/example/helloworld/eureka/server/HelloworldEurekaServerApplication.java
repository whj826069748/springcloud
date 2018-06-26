package com.example.helloworld.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class HelloworldEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloworldEurekaServerApplication.class, args);
	}
}
