STEPS IN CONFIGURING  HYSTRIX TO A MICROSERVICE

STEP 1: Add Hystrix dependency to your pom.xml

	<dependency>
	<groupId>org.springframework.cloud</groupId>
	<artifactId>spring-cloud-starter-netflix-hystrix</artifactId>
	</dependency>



STEP 2: Activate and Assign a fallback method in your controller class

E.g: 	 @RequestMapping(value = "/")
	   @HystrixCommand(fallbackMethod = "fallback_hello", commandProperties = {
	      @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1000")
	   })