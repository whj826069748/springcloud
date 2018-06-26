package com.example.helloworldeurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class HelloworldEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloworldEurekaClientApplication.class, args);
	}
}
