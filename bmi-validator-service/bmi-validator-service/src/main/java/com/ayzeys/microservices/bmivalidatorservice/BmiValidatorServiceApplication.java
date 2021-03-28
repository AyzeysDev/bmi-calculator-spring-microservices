package com.ayzeys.microservices.bmivalidatorservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BmiValidatorServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BmiValidatorServiceApplication.class, args);
	}

}
