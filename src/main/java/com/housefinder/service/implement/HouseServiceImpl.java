package com.housefinder.service.implement;

import com.housefinder.dto.HouseDto;
import com.housefinder.entity.House;
import com.housefinder.repository.HouseRepository;
import com.housefinder.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class HouseServiceImpl implements HouseService {
@Autowired
    private HouseRepository houseRepository;
    @Override
    public List<HouseDto> getAllHouse() {
        List<House> houses = houseRepository.findAll();
        return houses.stream().map(
                this::mapToHouseDto).
                collect(Collectors.toList());
    }

    @Override
    public HouseDto getHouseById(Long id) {
        House house = houseRepository.getReferenceById(id);
        return mapToHouseDto(house);
    }

    @Override
    public List<House> getActiveHouses() {
        List<House> houses = houseRepository.findAll();
        return houses.stream().filter(house -> house.getStatus().equalsIgnoreCase("active")).collect(Collectors.toList());
    }

    private HouseDto mapToHouseDto(House house) {
        HouseDto houseDto = new HouseDto();
        houseDto.setId(house.getId());
        houseDto.setName(house.getName());
        houseDto.setType(house.getType());
        houseDto.setArea(house.getArea());
        houseDto.setAddress(house.getAddress());
        houseDto.setStatus(house.getStatus());
        houseDto.setOwner(house.getOwner());
        houseDto.setBasePrice(house.getBasePrice());
        houseDto.setDeposit(house.getDeposit());
        houseDto.setElectricPrice(house.getElectricPrice());
        houseDto.setWaterPrice(house.getWaterPrice());
        houseDto.setWifiPrice(house.getWifiPrice());
        houseDto.setUtilities(new HashSet<>(house.getUtilities()));
        houseDto.setImages(new HashSet<>(house.getImages()));
        return houseDto;
    }


    @Override
    public Page<House> getHouse(int pageNumber){
        int pageSize = 6;
        Pageable pageable = PageRequest.of(pageNumber, pageSize);
        return houseRepository.findAll(pageable);
    }
}
