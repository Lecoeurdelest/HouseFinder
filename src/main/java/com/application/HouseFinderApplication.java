package com.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HouseFinderApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(HouseFinderApplication.class, args);

	}

}
