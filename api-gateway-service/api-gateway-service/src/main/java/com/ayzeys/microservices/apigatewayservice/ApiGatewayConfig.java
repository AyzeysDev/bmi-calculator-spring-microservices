package com.ayzeys.microservices.apigatewayservice;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayConfig {
	
	@Bean
	public RouteLocator gatewayRouter(RouteLocatorBuilder builder) {
		return builder.routes()
				.route(p -> p.path("/get")
					  .filters(f -> f.addRequestHeader("MyHeader", "MyURI"))
					  .uri("http://httpbin.org:80"))
				.route(p -> p.path("/bmi-calculator/**")
						.uri("lb://bmi-calculator"))
				.route(p -> p.path("/bmi-validator/**")
						.uri("lb://bmi-validator"))
				.route(p -> p.path("/bmi-validator-v1/**")
						.filters(f -> f.rewritePath("/bmi-validator-v1/(?<segment>.*)", "/bmi-validator/${segment}"))
						.uri("lb://bmi-validator"))
				.build();
	}
}
