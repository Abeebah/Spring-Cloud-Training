STEPS IN SETTING UP SPRING CLOUD CONFIG SERVER

STEP 1: ADD THESE DEPENDENCIES

	<dependency>			<groupId>org.springframework.cloud</groupId>
	<artifactId>spring-cloud-config-server</artifactId>
	</dependency>


		<dependency>			<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-actuator</artifactId>
		</dependency>


STEP2: Enable the config server with this annotation @EnableConfigServer

STEP3: Create a GitRepo (Online or Remote)

GITHUB COMMANDS in creating a Remote GitRepo 
$ cd $HOME
$ mkdir config-repo
$ cd config-repo
$ git init .
$ echo info.foo: bar > application.properties
$ git add -A .
$ git commit -m "Add application.properties"


STEP 4: In your Properties File, point to the GitRepo
spring.cloud.config.server.git.uri=C:\\spring-cloud-config\\configRepo
server.port=8888


##########################################################



###########################################################
STEPS IN SETTING UP SPRING CLOUD CONFIG CLIENT

STEP 1: ADD THESE DEPENDENCIES

<dependency>			<groupId>org.springframework.cloud</groupId>
	<artifactId>spring-cloud-config-client</artifactId>
	</dependency>


		<dependency>			<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-actuator</artifactId>
		</dependency>



STEP 2: Enable the config server with this annotation @EnableConfigClient


STEP 3: Enable Refresh Option @RefreshScope

STEP 4:From the application properties, point to the gateway server

spring.cloud.config.uri=http://localhost:8888/spring-cloud-config-client/default
spring.application.name=spring-cloud-config-client