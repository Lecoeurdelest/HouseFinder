package com.housefinder.service.implement;

import com.housefinder.entity.House;
import com.housefinder.repository.HouseRepository;
import com.housefinder.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HouseServiceImpl implements HouseService {
@Autowired
    private HouseRepository houseRepository;
    @Override
    public House getHouseById(Long id) {
        return houseRepository.findById(id).get();
    }

    @Override
    public List<House> getActiveHouses(String currentSearch) {
        List<House> houses = houseRepository.findAll();
        return houses.stream()
                .filter(house -> house.getStatus().equalsIgnoreCase("active"))
                .filter(house -> house.getAddress().toLowerCase().contains(currentSearch.toLowerCase())).collect(Collectors.toList());
    }

    public Page<House> getHouse(int pageNumber){
        int pageSize = 6;
        Pageable pageable = PageRequest.of(pageNumber, pageSize);
        return houseRepository.findAll(pageable);
    }
}
