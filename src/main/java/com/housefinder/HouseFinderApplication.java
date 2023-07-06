package com.housefinder;

import com.housefinder.repository.HouseRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HouseFinderApplication {
	public static void main(String[] args) {
		//Chu be Ngoc hoc git
		ApplicationContext context = SpringApplication.run(HouseFinderApplication.class, args);
	}

}
