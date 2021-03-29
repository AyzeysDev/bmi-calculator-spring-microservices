package com.ayzeys.microservices.bmivalidatorservice;

public class GenerateBmiRange {
	  private String range;
	  private double bmi;
	  private String name;
	  
	  public GenerateBmiRange(double bmi, String name) {
		  this.bmi = bmi;
		  this.name = name;
	  }

	public String getRange() {
		return range;
	}

	public void setRange(String range) {
		this.range = range;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return "Hey " + this.name + " based on your BMI you're " +  this.range ;
	}

	
	public void computeRange() {
		if (bmi < 18.5) {
			this.range = "UNDERWEIGHT";
		} else if (bmi < 25) {
			this.range = "HEALTHY";
		} else {
			this.range = "OVERWEIGHT";
		}
	  
	}	   
}
