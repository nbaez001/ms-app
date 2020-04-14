package com.empresa.proyecto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MsProductsServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsProductsServicesApplication.class, args);
	}

}
