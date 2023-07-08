package com.housefinder.service.implement;

import com.housefinder.dto.HouseDto;
import com.housefinder.entity.House;
import com.housefinder.repository.HouseRepository;
import com.housefinder.service.HouseService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HouseServiceImpl implements HouseService {

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

    private HouseDto mapToHouseDto(House house){
        HouseDto houseDto = new HouseDto();
        return houseDto;
    }

    public Page<House> getHouse(int pageNumber){
        int pageSize = 6;
        Pageable pageable = PageRequest.of(pageNumber, pageSize);
        return houseRepository.findAll(pageable);
    }
}
