package com.housefinder.service;

import com.housefinder.dto.HouseDto;
import com.housefinder.entity.House;

import java.util.List;

public interface HouseService {
    House getHouseById(Long id);
    List<House> getActiveHouses();
}
