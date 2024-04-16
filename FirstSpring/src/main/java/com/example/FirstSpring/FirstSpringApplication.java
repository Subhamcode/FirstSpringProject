package com.example.FirstSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringApplication {

	public static void main(String[] args) {
		System.out.println("hello spring boot");
		SpringApplication.run(FirstSpringApplication.class, args);
	}

}
