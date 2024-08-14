package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SwebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwebApplication.class, args);
		
		System.out.println("Your project is running");
	}

}
