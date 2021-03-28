package com.ayzeys.microservices.bmivalidatorservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BmiValidatorController {
	
	@Autowired
	private BmiValidatorProxy proxy;
	
	@GetMapping("/bmi-validator/height/{height}/weight/{weight}/{name}")
	public BmiValidator generateBmiValidator(@PathVariable double height,
			@PathVariable double weight,
			@PathVariable String name) {
		
		BmiValidator bmiVal = proxy.retrieveBmiValue(height, weight);
		
		GenerateBmiRange bmiRange = new GenerateBmiRange(bmiVal.getBmi(), name);
		bmiRange.computeRange();
		
		return new BmiValidator(bmiVal.getId(), height, weight, bmiVal.getBmi(), bmiRange.getRange(), bmiRange.getDescription(), bmiVal.getEnvironment());
	}
	
	
}
