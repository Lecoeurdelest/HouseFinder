package com.housefinder;

import com.housefinder.entity.House;
import com.housefinder.entity.Image;
import com.housefinder.entity.User;
import com.housefinder.entity.Utility;
import com.housefinder.repository.HouseRepository;
import com.housefinder.repository.ImageRepository;
import com.housefinder.repository.UserRepository;
import com.housefinder.repository.UtilityRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HouseFinderApplication {
	public static void main(String[] args) {
		//Chu be Ngoc hoc git
		ApplicationContext context = SpringApplication.run(HouseFinderApplication.class, args);
		UserRepository userRepo = context.getBean(UserRepository.class);
		UtilityRepository utilityRepo = context.getBean(UtilityRepository.class);
		ImageRepository imageRepo = context.getBean(ImageRepository.class);
		HouseRepository houseRepo = context.getBean(HouseRepository.class);
	}
    public void addData(UserRepository userRepo, UtilityRepository utilityRepo) {
	}
	public static void addData(UserRepository userRepo, UtilityRepository utilityRepo, ImageRepository imageRepo, HouseRepository houseRepo){
		addUser(userRepo);
		addUtility(utilityRepo);
		addImage(imageRepo);
		addHouse(userRepo, utilityRepo, imageRepo, houseRepo);
	}
	private static void addUser(UserRepository userRepo){
	}
	private static void addUtility(UtilityRepository utilityRepo){
		utilityRepo.save(new Utility("AirConditioner",""));
		utilityRepo.save(new Utility("Television", ""));
		utilityRepo.save(new Utility("Desk", ""));
		utilityRepo.save(new Utility("Sofa", ""));
		utilityRepo.save(new Utility("Cupboard", ""));
		utilityRepo.save(new Utility("WaterHeater", ""));
		utilityRepo.save(new Utility("Fridge", ""));
		utilityRepo.save(new Utility("Bed", ""));
		utilityRepo.save(new Utility("Fingerprint Lock", ""));
		utilityRepo.save(new Utility("Sink", ""));
		utilityRepo.save(new Utility("Basin", ""));
		utilityRepo.save(new Utility("Induction cooker", ""));
		utilityRepo.save(new Utility("Wardrobe", ""));
        utilityRepo.save(new Utility("Garage", ""));
	}
	private static void addImage(ImageRepository imageRepo){
		String imagePath = "/images/house/";
		//bac Khương
        Image i1h1 = new Image(imagePath + "1/img1.png",true);
		Image i2h1 = new Image(imagePath + "1/img2.png",false);
		Image i3h1 = new Image(imagePath + "1/img3.png",false);
		Image i4h1 = new Image(imagePath + "1/img4.png",false);

		imageRepo.save(i1h1);
		imageRepo.save(i2h1);
		imageRepo.save(i3h1);
		imageRepo.save(i4h1);
		//Phenika
		Image i1h2 = new Image(imagePath + "2/img1.png",true);
		Image i2h2 = new Image(imagePath + "2/img2.png",false);
		Image i3h2 = new Image(imagePath + "2/img3.png",false);
		Image i4h2 = new Image(imagePath + "2/img4.png",false);
		Image i5h2 = new Image(imagePath + "2/img5.png",false);
		Image i6h2 = new Image(imagePath + "2/img6.png",false);
		imageRepo.save(i1h2);
		imageRepo.save(i2h2);
		imageRepo.save(i3h2);
		imageRepo.save(i4h2);
		imageRepo.save(i5h2);
		imageRepo.save(i6h2);
		//SV HOME
		Image i1h3 = new Image(imagePath + "3/img1.png", true);
		Image i2h3 = new Image(imagePath + "3/img2.png", false);
		Image i3h3 = new Image(imagePath + "3/img3.png", false);
		Image i4h3 = new Image(imagePath + "3/img4.png", false);
		Image i5h3 = new Image(imagePath + "3/img5.png", false);
		Image i6h3 = new Image(imagePath + "3/img6.png", false);
		imageRepo.save(i1h3);
		imageRepo.save(i2h3);
		imageRepo.save(i3h3);
		imageRepo.save(i4h3);
		imageRepo.save(i5h3);
		imageRepo.save(i6h3);
		//Hoàng Như
		Image i1h4 = new Image(imagePath + "4/img1.png", true);
		Image i2h4 = new Image(imagePath + "4/img2.png", false);
		Image i3h4 = new Image(imagePath + "4/img3.png", false);
		Image i4h4 = new Image(imagePath + "4/img4.png", false);
		Image i5h4 = new Image(imagePath + "4/img5.png", false);
		imageRepo.save(i1h4);
		imageRepo.save(i2h4);
		imageRepo.save(i3h4);
		imageRepo.save(i4h4);
		imageRepo.save(i5h4);
		//Chí Thanh
		Image i1h5 = new Image(imagePath + "5/img1.png", true);
		Image i2h5 = new Image(imagePath + "5/img2.png", false);
		Image i3h5 = new Image(imagePath + "5/img3.png", false);
		Image i4h5 = new Image(imagePath + "5/img4.png", false);
		imageRepo.save(i1h5);
		imageRepo.save(i2h5);
		imageRepo.save(i3h5);
		imageRepo.save(i4h5);
		//Cốm Saximi
		Image i1h6 = new Image(imagePath + "6/img1.png", true);
		Image i2h6 = new Image(imagePath + "6/img2.png", false);
		Image i3h6 = new Image(imagePath + "6/img3.png", false);
		Image i4h6 = new Image(imagePath + "6/img4.png", false);
		Image i5h6 = new Image(imagePath + "6/img5.png", false);
		imageRepo.save(i1h6);
		imageRepo.save(i2h6);
		imageRepo.save(i3h6);
		imageRepo.save(i4h6);
		imageRepo.save(i5h6);
		//Thành Thính
		Image i1h7 = new Image(imagePath + "7/img1.png", true);
		Image i2h7 = new Image(imagePath + "7/img2.png", false);
		Image i3h7 = new Image(imagePath + "7/img3.png", false);
		Image i4h7 = new Image(imagePath + "7/img4.png", false);
		Image i5h7 = new Image(imagePath + "7/img5.png", false);
		Image i6h7 = new Image(imagePath + "7/img6.png", false);
		imageRepo.save(i1h7);
		imageRepo.save(i2h7);
		imageRepo.save(i3h7);
		imageRepo.save(i4h7);
		imageRepo.save(i5h7);
		imageRepo.save(i6h7);
		//Thùy Dương House
		Image i1h8 = new Image(imagePath + "8/img1.png", true);
		Image i2h8 = new Image(imagePath + "8/img2.png", false);
		Image i3h8 = new Image(imagePath + "8/img3.png", false);
		Image i4h8 = new Image(imagePath + "8/img4.png", false);
		imageRepo.save(i1h8);
		imageRepo.save(i2h8);
		imageRepo.save(i3h8);
		imageRepo.save(i4h8);
		//Hải Đăng
		Image i1h9 = new Image(imagePath + "9/img1.png", true);
		Image i2h9 = new Image(imagePath + "9/img2.png", false);
		Image i3h9 = new Image(imagePath + "9/img3.png", false);
		Image i4h9 = new Image(imagePath + "9/img4.png", false);
		imageRepo.save(i1h9);
		imageRepo.save(i2h9);
		imageRepo.save(i3h9);
		imageRepo.save(i4h9);
		//Gốc Mít
		Image i1h10 = new Image(imagePath + "10/img1.png", true);
		Image i2h10 = new Image(imagePath + "10/img2.png", false);
		Image i3h10 = new Image(imagePath + "10/img3.png", false);
		Image i4h10 = new Image(imagePath + "10/img4.png", false);
		Image i5h10 = new Image(imagePath + "10/img5.png", false);
		imageRepo.save(i1h10);
		imageRepo.save(i2h10);
		imageRepo.save(i3h10);
		imageRepo.save(i4h10);
		imageRepo.save(i5h10);
		//Thái Dũng
		Image i1h11 = new Image(imagePath + "11/img1.png", true);
		Image i2h11 = new Image(imagePath + "11/img2.png", false);
		Image i3h11 = new Image(imagePath + "11/img3.png", false);
		Image i4h11 = new Image(imagePath + "11/img4.png", false);
		imageRepo.save(i1h11);
		imageRepo.save(i2h11);
		imageRepo.save(i3h11);
		imageRepo.save(i4h11);
		//Sun Home
		Image i1h12 = new Image(imagePath + "12/img1.png", true);
		Image i2h12 = new Image(imagePath + "12/img2.png", false);
		Image i3h12 = new Image(imagePath + "12/img3.png", false);
		Image i4h12 = new Image(imagePath + "12/img4.png", false);
		Image i5h12 = new Image(imagePath + "12/img5.png", false);
		Image i6h12 = new Image(imagePath + "12/img6.png", false);
		imageRepo.save(i1h12);
		imageRepo.save(i2h12);
		imageRepo.save(i3h12);
		imageRepo.save(i4h12);
		imageRepo.save(i5h12);
		imageRepo.save(i6h12);
	}
		public static void addHouse(UserRepository userRepo, UtilityRepository utilityRepo, ImageRepository imageRepo, HouseRepository houseRepo){
		//user
		User landlord = userRepo.findById(1L).get();
		//utility
		Utility AirConditioner = utilityRepo.findById(1L).get();
		Utility Television = utilityRepo.findById(2L).get();
		Utility Desk = utilityRepo.findById(3L).get();
		Utility Sofa = utilityRepo.findById(4L).get();
		Utility Cupboard = utilityRepo.findById(5L).get();
		Utility WaterHeater = utilityRepo.findById(6L).get();
		Utility Fridge = utilityRepo.findById(7L).get();
		Utility Bed = utilityRepo.findById(8L).get();
		Utility FingerprintLock = utilityRepo.findById(9L).get();
		Utility Sink = utilityRepo.findById(10L).get();
		Utility Basin = utilityRepo.findById(11L).get();
		Utility InductionCooker = utilityRepo.findById(12L).get();
		Utility Wardrobe = utilityRepo.findById(13L).get();
		Utility Garage = utilityRepo.findById(14L).get();
		//image
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

		Image i1h3 = imageRepo.findById(11L).get();
		Image i2h3 = imageRepo.findById(12L).get();
		Image i3h3 = imageRepo.findById(13L).get();
		Image i4h3 = imageRepo.findById(14L).get();
		Image i5h3 = imageRepo.findById(15L).get();
		Image i6h3 = imageRepo.findById(16L).get();

		Image i1h4 = imageRepo.findById(17L).get();
		Image i2h4 = imageRepo.findById(18L).get();
		Image i3h4 = imageRepo.findById(19L).get();
		Image i4h4 = imageRepo.findById(20L).get();
		Image i5h4 = imageRepo.findById(21L).get();

		Image i1h5 = imageRepo.findById(22L).get();
		Image i2h5 = imageRepo.findById(23L).get();
		Image i3h5 = imageRepo.findById(24L).get();
		Image i4h5 = imageRepo.findById(25L).get();

		Image i1h6 = imageRepo.findById(26L).get();
		Image i2h6 = imageRepo.findById(27L).get();
		Image i3h6 = imageRepo.findById(28L).get();
		Image i4h6 = imageRepo.findById(29L).get();
		Image i5h6 = imageRepo.findById(30L).get();

		Image i1h7 = imageRepo.findById(31L).get();
		Image i2h7 = imageRepo.findById(32L).get();
		Image i3h7 = imageRepo.findById(33L).get();
		Image i4h7 = imageRepo.findById(34L).get();
		Image i5h7 = imageRepo.findById(35L).get();
		Image i6h7 = imageRepo.findById(36L).get();

		Image i1h8 = imageRepo.findById(37L).get();
		Image i2h8 = imageRepo.findById(38L).get();
		Image i3h8 = imageRepo.findById(39L).get();
		Image i4h8 = imageRepo.findById(40L).get();

		Image i1h9 = imageRepo.findById(41L).get();
		Image i2h9 = imageRepo.findById(42L).get();
		Image i3h9 = imageRepo.findById(43L).get();
		Image i4h9 = imageRepo.findById(44L).get();

		Image i1h10 = imageRepo.findById(45L).get();
		Image i2h10 = imageRepo.findById(46L).get();
		Image i3h10 = imageRepo.findById(47L).get();
		Image i4h10 = imageRepo.findById(48L).get();
		Image i5h10 = imageRepo.findById(49L).get();

		Image i1h11 = imageRepo.findById(50L).get();
		Image i2h11 = imageRepo.findById(51L).get();
		Image i3h11 = imageRepo.findById(52L).get();
		Image i4h11 = imageRepo.findById(53L).get();

		Image i1h12 = imageRepo.findById(54L).get();
		Image i2h12 = imageRepo.findById(55L).get();
		Image i3h12 = imageRepo.findById(56L).get();
		Image i4h12 = imageRepo.findById(57L).get();
		Image i5h12 = imageRepo.findById(58L).get();
		Image i6h12 = imageRepo.findById(59L).get();

		//house 1
		House BacKhuong = new House("Tro Bac Khương", "Apartment", 20, "Thôn 4, Thạch Hòa, Thạch Thất, Hà Nội", landlord, 2000000, 2000000, 3000, 50000,100000, 2, "Male/Female");
		BacKhuong.add(AirConditioner);
		BacKhuong.add(Desk);
		BacKhuong.add(WaterHeater);
		BacKhuong.add(Bed);
		BacKhuong.add(Basin);
		BacKhuong.add(Wardrobe);
		BacKhuong.add(Garage);
		BacKhuong.add(i1h1);
		BacKhuong.add(i2h1);
		BacKhuong.add(i3h1);
		BacKhuong.add(i4h1);
		houseRepo.save(BacKhuong);
		//house 2
		House Phenika = new House("Phenika","apartment",70,"Thôn 1, Thạch Hòa, Thạch Thất, Hà Nội", landlord, 15000000, 15000000, 3000, 50000, 100000, 4, "Male/Female");
		Phenika.add(AirConditioner);
		Phenika.add(Television);
		Phenika.add(Desk);
		Phenika.add(Sofa);
		Phenika.add(Cupboard);
		Phenika.add(WaterHeater);
		Phenika.add(Fridge);
		Phenika.add(Bed);
		Phenika.add(FingerprintLock);
		Phenika.add(Sink);
		Phenika.add(Basin);
		Phenika.add(InductionCooker);
		Phenika.add(Wardrobe);
		Phenika.add(Garage);
		Phenika.add(i1h2);
		Phenika.add(i2h2);
		Phenika.add(i3h2);
		Phenika.add(i4h2);
		Phenika.add(i5h2);
		Phenika.add(i6h2);
		houseRepo.save(Phenika);
		//house 3
		House SVHome = new House("SVHome","apartment",20,"Thôn 2, Thạch Hòa, Thạch Thất, Hà Nội", landlord, 2800000, 2800000, 3000, 50000, 100000, 3, "Male/Female");
		SVHome.add(AirConditioner);
		SVHome.add(Desk);
		SVHome.add(Cupboard);
		SVHome.add(WaterHeater);
		SVHome.add(Fridge);
		SVHome.add(Bed);
		SVHome.add(FingerprintLock);
		SVHome.add(Sink);
		SVHome.add(Basin);
		SVHome.add(Wardrobe);
		SVHome.add(Garage);
		SVHome.add(i1h3);
		SVHome.add(i2h3);
		SVHome.add(i3h3);
		SVHome.add(i4h3);
		SVHome.add(i5h3);
		SVHome.add(i6h3);
		houseRepo.save(SVHome);
			//house 4
		House HoangNhu = new House("Hoàng Như","Building",25,"Thôn 4, Thạch Hòa, Thạch Thất, Hà Nội", landlord, 3200000, 3200000, 3000, 50000, 100000, 4, "Male/Female");
		HoangNhu.add(AirConditioner);
		HoangNhu.add(Desk);
		HoangNhu.add(Sofa);
		HoangNhu.add(Cupboard);
		HoangNhu.add(WaterHeater);
		HoangNhu.add(Fridge);
		HoangNhu.add(Bed);
		HoangNhu.add(FingerprintLock);
		HoangNhu.add(Sink);
		HoangNhu.add(Basin);
		HoangNhu.add(InductionCooker);
		HoangNhu.add(Garage);
		HoangNhu.add(i1h4);
		HoangNhu.add(i2h4);
		HoangNhu.add(i3h4);
		HoangNhu.add(i4h4);
		HoangNhu.add(i5h4);
		houseRepo.save(HoangNhu);
		//house 5
	    House ChiThanh = new House("Chí Thanh","Bungalow",18,"Thôn 1, Thạch Hòa, Thạch Thất, Hà Nội", landlord, 1700000, 1700000, 3000, 50000, 100000, 2, "Male/Female");
		ChiThanh.add(AirConditioner);
		ChiThanh.add(Desk);
		ChiThanh.add(WaterHeater);
		ChiThanh.add(Bed);
		ChiThanh.add(Sink);
		ChiThanh.add(Basin);
		ChiThanh.add(Wardrobe);
		ChiThanh.add(Garage);
		ChiThanh.add(i1h5);
		ChiThanh.add(i2h5);
		ChiThanh.add(i3h5);
		ChiThanh.add(i4h5);
		houseRepo.save(ChiThanh);
		//house 6
		House ComSaximi = new House("Cốm Saximi","Apartment",15,"Tân Xã, Hà Nội", landlord, 2100000, 2100000, 3000, 40000, 100000, 2, "Male/Female");
		ComSaximi.add(AirConditioner);
		ComSaximi.add(Desk);
		ComSaximi.add(Sofa);
		ComSaximi.add(Cupboard);
		ComSaximi.add(WaterHeater);
		ComSaximi.add(Fridge);
		ComSaximi.add(Bed);
		ComSaximi.add(FingerprintLock);
		ComSaximi.add(Sink);
		ComSaximi.add(Basin);
		ComSaximi.add(InductionCooker);
		ComSaximi.add(Wardrobe);
		ComSaximi.add(Garage);
		ComSaximi.add(i1h6);
		ComSaximi.add(i2h6);
		ComSaximi.add(i3h6);
		ComSaximi.add(i4h6);
		ComSaximi.add(i5h6);
		houseRepo.save(ComSaximi);
		//house 7
		House ThanhThinh = new House("Thành Thính","Apartment",22,"Thôn 5, Thạch Hòa, Thạch Thất, Hà Nội", landlord, 2000000, 2000000, 2800, 50000, 100000, 2, "Male/Female");
		ThanhThinh.add(AirConditioner);
		ThanhThinh.add(Desk);
		ThanhThinh.add(Cupboard);
		ThanhThinh.add(WaterHeater);
		ThanhThinh.add(Fridge);
		ThanhThinh.add(FingerprintLock);
		ThanhThinh.add(Sink);
		ThanhThinh.add(Basin);
		ThanhThinh.add(Wardrobe);
		ThanhThinh.add(Garage);
		ThanhThinh.add(i1h7);
		ThanhThinh.add(i2h7);
		ThanhThinh.add(i3h7);
		ThanhThinh.add(i4h7);
		ThanhThinh.add(i5h7);
		ThanhThinh.add(i6h7);
		houseRepo.save(ThanhThinh);
		//house 8
		House ThuyDuong = new House("Thùy Duơng","House",25,"Thôn 2, Thạch Hòa, Thạch Thất, Hà Nội", landlord, 3000000, 3000000, 3000, 50000, 100000, 4, "Male/Female");
		ThuyDuong.add(AirConditioner);
		ThuyDuong.add(Desk);
		ThuyDuong.add(Cupboard);
		ThuyDuong.add(WaterHeater);
		ThuyDuong.add(Bed);
		ThuyDuong.add(FingerprintLock);
		ThuyDuong.add(Sink);
		ThuyDuong.add(Basin);
		ThuyDuong.add(Wardrobe);
		ThuyDuong.add(Garage);
		ThuyDuong.add(i1h8);
		ThuyDuong.add(i2h8);
		ThuyDuong.add(i3h8);
		ThuyDuong.add(i4h8);
		houseRepo.save(ThuyDuong);
		//house 9
		House HaiDang = new House("Hải Đăng","Building",35,"Thôn 3, Thạch Hòa, Thạch Thất, Hà Nội", landlord, 3500000, 3500000, 3000, 50000, 100000, 4, "Male/Female");
		HaiDang.add(AirConditioner);
		HaiDang.add(Desk);
		HaiDang.add(Cupboard);
		HaiDang.add(WaterHeater);
		HaiDang.add(Bed);
		HaiDang.add(FingerprintLock);
		HaiDang.add(Sink);
		HaiDang.add(Basin);
		HaiDang.add(Wardrobe);
		HaiDang.add(Garage);
		HaiDang.add(i1h9);
		HaiDang.add(i2h9);
		HaiDang.add(i3h9);
		HaiDang.add(i4h9);
		houseRepo.save(HaiDang);
		//house 10
		House GocMit = new House("Gốc Mít","Building",20,"Thôn 5, Thạch Hòa, Thạch Thất, Hà Nội", landlord, 2000000, 2000000, 3000, 50000, 100000, 2, "Male/Female");
		GocMit.add(AirConditioner);
		GocMit.add(Desk);
		GocMit.add(WaterHeater);
		GocMit.add(Bed);
		GocMit.add(Sink);
		GocMit.add(Basin);
		GocMit.add(Garage);
		GocMit.add(i1h10);
		GocMit.add(i2h10);
		GocMit.add(i3h10);
		GocMit.add(i4h10);
		GocMit.add(i5h10);
		houseRepo.save(GocMit);
		//house 11
		House ThaiDung = new House("Thái Dũng","Building",18,"Thôn 5, Thạch Hòa, Thạch Thất, Hà Nội", landlord, 1500000, 1500000, 3000, 50000, 100000, 2, "Male/Female");
		ThaiDung.add(AirConditioner);
		ThaiDung.add(Desk);
		ThaiDung.add(Cupboard);
		ThaiDung.add(WaterHeater);
		ThaiDung.add(Bed);
		ThaiDung.add(FingerprintLock);
		ThaiDung.add(Sink);
		ThaiDung.add(Basin);
		ThaiDung.add(Garage);
		ThaiDung.add(i1h11);
		ThaiDung.add(i2h11);
		ThaiDung.add(i3h11);
		ThaiDung.add(i4h11);
		houseRepo.save(ThaiDung);
		//house 12
		House SunHome = new House("SunHome","Apartment",35,"Thôn 3, Thạch Hòa, Thạch Thất, Hà Nội", landlord, 3500000, 3500000, 3500, 50000, 100000, 3, "Male/Female");
		SunHome.add(AirConditioner);
		SunHome.add(Desk);
		SunHome.add(Sofa);
		SunHome.add(Cupboard);
		SunHome.add(WaterHeater);
		SunHome.add(Fridge);
		SunHome.add(Bed);
		SunHome.add(FingerprintLock);
		SunHome.add(Sink);
		SunHome.add(Basin);
		SunHome.add(InductionCooker);
		SunHome.add(Wardrobe);
		SunHome.add(Garage);
		SunHome.add(i1h12);
		SunHome.add(i2h12);
		SunHome.add(i3h12);
		SunHome.add(i4h12);
		SunHome.add(i5h12);
		SunHome.add(i6h12);
		houseRepo.save(SunHome);
		}
}
