package com.ayzeys.microservices.bmicalculatorservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BmiCalculatorRepository extends JpaRepository<BmiData, Long> {
	
}
