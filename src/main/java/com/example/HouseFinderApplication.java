package com.example;

import com.example.entity.House;
import com.example.entity.Image;
import com.example.entity.User;
import com.example.entity.Utility;
import com.example.repository.HouseRepository;
import com.example.repository.ImageRepository;
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
		HouseRepository houseRepo = context.getBean(HouseRepository.class);
		ImageRepository imageRepo = context.getBean(ImageRepository.class);
//		addData(userRepo,utilityRepo,imageRepo,houseRepo);
	}
	public static void addData(UserRepository userRepo, UtilityRepository utilityRepo, ImageRepository imageRepo,HouseRepository houseRepo){
		addUsers(userRepo);
		addUtilities(utilityRepo);
		addImages(imageRepo);
		addHouses(userRepo, utilityRepo, imageRepo, houseRepo);

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

	private static void addImages(ImageRepository imageRepo){
		String imagePath = "/images/house/";
		Image i1h1 = new Image(imagePath + "1/img1.png",true);
		Image i2h1 = new Image(imagePath + "1/img2.png",false);
		Image i3h1 = new Image(imagePath + "1/img3.png",false);
		Image i4h1 = new Image(imagePath + "1/img4.png",false);

		Image i1h2 = new Image(imagePath + "2/img1.png",true);
		Image i2h2 = new Image(imagePath + "2/img2.png",false);
		Image i3h2 = new Image(imagePath + "2/img3.png",false);
		Image i4h2 = new Image(imagePath + "2/img4.png",false);
		Image i5h2 = new Image(imagePath + "2/img5.png",false);
		Image i6h2 = new Image(imagePath + "2/img6.png",false);

		imageRepo.save(i1h1);
		imageRepo.save(i2h1);
		imageRepo.save(i3h1);
		imageRepo.save(i4h1);

		imageRepo.save(i1h2);
		imageRepo.save(i2h2);
		imageRepo.save(i3h2);
		imageRepo.save(i4h2);
		imageRepo.save(i5h2);
		imageRepo.save(i6h2);
	}

	public static void addHouses(UserRepository userRepo, UtilityRepository utilityRepo, ImageRepository imageRepo, HouseRepository houseRepo){
		// owner
		User landlord = userRepo.findById(1L).get();

		// utility
		Utility airConditioner = utilityRepo.findById(1L).get();
		Utility TV = utilityRepo.findById(2L).get();

		// images
		Image i1h1 = imageRepo.findById(1L).get();
		Image i2h1 = imageRepo.findById(2L).get();
		Image i3h1 = imageRepo.findById(3L).get();
		Image i4h1 = imageRepo.findById(4L).get();

		Image i1h2 = imageRepo.findById(5L).get();
		Image i2h2 = imageRepo.findById(6L).get();
		Image i3h2 = imageRepo.findById(7L).get();
		Image i4h2 = imageRepo.findById(8L).get();
		Image i5h2 = imageRepo.findById(9L).get();
		Image i6h2 = imageRepo.findById(10L).get();

		// house 1
		House cheapApartment = new House("tro bac Khuong","apartment",20,"thon 4, thach hoa, thach that, ha noi",landlord, 2000000, 2000000, 3000, 50000,100000, 2, "Male/Female");
		cheapApartment.add(airConditioner);
		cheapApartment.add(i1h1);
		cheapApartment.add(i2h1);
		cheapApartment.add(i3h1);
		cheapApartment.add(i4h1);
		houseRepo.save(cheapApartment);

		// house 2
		House expensiveApartment = new House("Vinhomes","apartment",70,"cau giay, ha noi", landlord, 15000000, 15000000, 3000, 50000, 100000, 4, "Male/Female");
		expensiveApartment.add(airConditioner);
		expensiveApartment.add(TV);
		expensiveApartment.add(i1h2);
		expensiveApartment.add(i2h2);
		expensiveApartment.add(i3h2);
		expensiveApartment.add(i4h2);
		expensiveApartment.add(i5h2);
		expensiveApartment.add(i6h2);
		houseRepo.save(expensiveApartment);
	}
	// Comment
}
