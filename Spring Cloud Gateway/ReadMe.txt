STEPS IN SETTING UP GATEWAY SERVER Using Properties File

STEP 1: Add Gateway Dependency

			<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-gateway</artifactId>
			</dependency>


STEP 2: Convert your Properties file to a yml , then mapping the Endpoints to the gateway 

E.g : 
server:
  port: 8080

spring:
  cloud:
    gateway:
      routes:
      - id: malesModule
        uri: http://localhost:2020/
        predicates:
        - Path=/males/**
      - id: femalesModule
        uri: http://localhost:2021/
        predicates:
        - Path=/females/**


#############################################################################







###########################################################################

STEPS IN SETTING UP GATEWAY SERVER Programmatically

STEP 1: Add Gateway Dependency

			<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-gateway</artifactId>
			</dependency>

STEP 2: Create a Gateway Config class,then mapping the Endpoints to the gateway 

E.g 

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