package com.housefinder;

import com.housefinder.entity.House;
import com.housefinder.entity.User;
import com.housefinder.repository.HouseRepository;
import com.housefinder.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class HouseFinderApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(HouseFinderApplication.class, args);
    }
}
