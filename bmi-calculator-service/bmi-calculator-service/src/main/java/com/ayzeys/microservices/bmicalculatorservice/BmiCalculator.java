package com.ayzeys.microservices.bmicalculatorservice;

public class BmiCalculator {

	private double height;
	private double weight;
	private double bmiValue;
	
	public BmiCalculator(double height, double weight) {
		this.height = height;
		this.weight = weight;
	}
	
	public double bmiCalculator(double height, double weight) {
		double bmiValue = (weight * 10000) / (height * height);
		return bmiValue;
	}
}
