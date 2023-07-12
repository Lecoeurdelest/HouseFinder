package com.housefinder.service;

import com.housefinder.entity.House;
import org.springframework.data.domain.Page;

import java.util.List;

public interface HouseService {
    House getHouseById(Long id);
    List<House> getActiveHouses(String currentSearch);

    Page<House> getHouse(int pageNumber);
}
