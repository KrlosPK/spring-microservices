package com.microservice.chamber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviceChamberApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceChamberApplication.class, args);
	}

}
