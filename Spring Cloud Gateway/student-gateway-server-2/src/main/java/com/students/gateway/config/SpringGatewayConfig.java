package com.students.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringGatewayConfig {

	   @Bean
	    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
	        return builder.routes()
	                .route(r -> r.path("/males/**")
	                        .uri("http://localhost:2020/")
	                        .id("malesModule"))

	                .route(r -> r.path("/females/**")
	                        .uri("http://localhost:2021/")
	                        .id("femalesModule"))
	                .build();
	    }
}
