package com.example;

import com.example.entity.User;
import com.example.entity.Utility;
import com.example.repository.UserRepository;
import com.example.repository.UtilityRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HouseFinderApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(HouseFinderApplication.class, args);
		UserRepository userRepo = context.getBean(UserRepository.class);
		UtilityRepository utilityRepo = context.getBean(UtilityRepository.class);

	}
	public void adđData(UserRepository userRepo, UtilityRepository utilityRepo){
		addUsers(userRepo);

	}
	private static void addUsers(UserRepository userRepo){
		User tenant = new User("quy","123","tenant","quy@gmail.com","123456789","male");
		User landlord = new User("vu","123","landlord","vu@gmail.com","123456789","male");
		User admin = new User("ngoc","123","admin","ngoc@gmail.com","123456789","female");

		userRepo.save(tenant);
		userRepo.save(landlord);
		userRepo.save(admin);
	}
	private static void addUtilities(UtilityRepository utilityRepo){
		Utility airConditioner = new Utility("Air conditioner","air conditioner icon");
		Utility TV = new Utility("TV","tv icon");

		utilityRepo.save(airConditioner);
		utilityRepo.save(TV);
	}
	// Comment
}
