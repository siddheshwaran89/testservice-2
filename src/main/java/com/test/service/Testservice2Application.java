package com.test.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Testservice2Application {

	public static void main(String[] args) {
		SpringApplication.run(Testservice2Application.class, args);
	}

}
