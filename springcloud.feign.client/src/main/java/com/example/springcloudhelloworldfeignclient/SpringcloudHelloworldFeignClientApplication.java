package com.example.springcloudhelloworldfeignclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class SpringcloudHelloworldFeignClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudHelloworldFeignClientApplication.class, args);
	}
}
