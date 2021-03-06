package com.empresa.proyecto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MsCategoriesServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsCategoriesServicesApplication.class, args);
	}

}
