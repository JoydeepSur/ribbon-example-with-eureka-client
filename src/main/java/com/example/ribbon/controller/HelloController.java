package com.example.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/ribbon/eureka/client")
public class HelloController {

	@Autowired
	RestTemplate restTemplate;

	@GetMapping
	public String hello() {
		String url = "http://ribbon-example-with-eureka-server/ribbon/eureka/server";
		return restTemplate.getForObject(url, String.class);
	}

}
