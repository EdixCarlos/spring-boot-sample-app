package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaAppApplication {

	public static void main(String[] args) {
		System.out.println("isrunning");
		SpringApplication.run(JavaAppApplication.class, args);
	}

}
