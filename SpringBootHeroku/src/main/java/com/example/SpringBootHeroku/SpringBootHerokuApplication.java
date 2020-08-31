package com.example.SpringBootHeroku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringBootHerokuApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHerokuApplication.class, args);
	}



@RestController
public class HelloController {

		@GetMapping("/")
		String hello() {

			return "Hello Ons : Test Heroku Deployment";
		}}


}
