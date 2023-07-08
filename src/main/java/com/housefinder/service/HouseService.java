package com.housefinder.service;

import com.housefinder.dto.HouseDto;

import java.util.List;

public interface HouseService {
    List<HouseDto> getAllHouse();
    HouseDto getHouseById(Long id);
}
