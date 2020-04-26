package com.example.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class RibbonExampleWithEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(RibbonExampleWithEurekaClientApplication.class, args);
	}

}
