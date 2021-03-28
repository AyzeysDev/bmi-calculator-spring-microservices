package com.ayzeys.microservices.bmivalidatorservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name="bmi-calculator", url="localhost:8000")
public interface BmiValidatorProxy {
	@GetMapping("/bmi-calculator/height/{height}/weight/{weight}")
	public BmiValidator retrieveBmiValue(
			@PathVariable double height,
			@PathVariable double weight); 
	
}
