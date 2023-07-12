package com.housefinder.service;

import com.housefinder.dto.HouseDto;
import com.housefinder.entity.House;
import org.springframework.data.domain.Page;

import java.util.List;

public interface HouseService {
    House getHouseById(Long id);
    List<House> getActiveHouses();

    Page<House> getHouse(int pageNumber);
}
