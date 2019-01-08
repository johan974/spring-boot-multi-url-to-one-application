package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
 * Basic Spring Boot demo:
 *   - Both Static Html + Forwarding via REST
 *   - Adding security: allow 2 URL's and forwoard to 2 versions of the same Angular/Html app
 *      - http://localhost:8080/urlone --> shows indexRoleA.html
 *      - http://localhost:8080/urltwo --> shows indexRoleB.html
 *      - AND ... other URL's are not allowed
 *
 */
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

