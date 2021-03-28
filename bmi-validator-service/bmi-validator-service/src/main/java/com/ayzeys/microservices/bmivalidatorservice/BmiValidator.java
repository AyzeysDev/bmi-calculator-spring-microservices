package com.ayzeys.microservices.bmivalidatorservice;

public class BmiValidator {
//	{
//	   "id":10001,
//	   "height": 175,
//	   "weight": 70,
//	   "bmiValue":25.00,
//	   "bmiRange": "Healthy",
//	   "description": "Hey ayzeys, you are Healthy",
//	   "environment": "8000 instance-id"
//	}
	private Long id;
	private double height;
	private double weight;
	private double bmi;
	private String bmiRange;
	private String description;
	private String environment;
	
	public BmiValidator(Long id, double height, double weight, double bmi, String bmiRange, String description,
			String environment) {
		super();
		this.id = id;
		this.height = height;
		this.weight = weight;
		this.bmi = bmi;
		this.bmiRange = bmiRange;
		this.description = description;
		this.environment = environment;
	}

	public BmiValidator() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getBmi() {
		return bmi;
	}

	public void setBmiValue(double bmiValue) {
		this.bmi = bmiValue;
	}

	public String getBmiRange() {
		return bmiRange;
	}

	public void setBmiRange(String bmiRange) {
		this.bmiRange = bmiRange;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	
	
	
	
}
