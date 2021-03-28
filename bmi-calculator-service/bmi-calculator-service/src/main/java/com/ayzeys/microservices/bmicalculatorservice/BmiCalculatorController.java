package com.ayzeys.microservices.bmicalculatorservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BmiCalculatorController {
	
	@Autowired
	private BmiCalculatorRepository repository;
	
	@Autowired
	private Environment environment;
	
	@GetMapping("/bmi-calculator/height/{height}/weight/{weight}")
	public BmiData retrieveBmiValue(
			@PathVariable double height,
			@PathVariable double weight) {
		BmiCalculator bmiCal = new BmiCalculator(height, weight);
		double bmiValue = bmiCal.bmiCalculator(height, weight);
		BmiData bmiData = new BmiData(height, weight, bmiValue);
		bmiData = repository.save(bmiData);
		
		String port = environment.getProperty("local.server.port");
		bmiData.setEnvironment(port);

		return bmiData;
	}
}
