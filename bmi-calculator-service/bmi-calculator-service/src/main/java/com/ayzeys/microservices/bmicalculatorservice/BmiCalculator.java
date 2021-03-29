package com.ayzeys.microservices.bmicalculatorservice;

public class BmiCalculator {

	private double bmiValue;
	
	public BmiCalculator() {
	}
	
	public double bmiCalculator(double height, double weight) {
		bmiValue = (weight * 10000) / (height * height);
		return bmiValue;
	}
}
