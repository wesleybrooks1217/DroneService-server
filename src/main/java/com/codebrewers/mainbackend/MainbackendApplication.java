package com.codebrewers.mainbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MainbackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainbackendApplication.class, args);
	}

	@GetMapping
	public String hello() {
		return "Hello world";
	}
}
