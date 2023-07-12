package com.housefinder.dto;

import com.housefinder.entity.Image;
import com.housefinder.entity.User;
import com.housefinder.entity.Utility;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class HouseDto {
    private Long id;
    private String name;
    private String type;
    private double area;
    private String address;
    private String status;
    private User owner;
    private double basePrice;
    private double deposit;
    private double electricPrice;
    private double waterPrice;
    private double wifiPrice;
    Set<Utility> utilities;
    private Set<Image> images;
}
