package com.housefinder.service;

import com.housefinder.entity.User;
import com.housefinder.dto.UserDto;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findByEmail(String email);

    void forgotPassword(String email);

    List<UserDto> findAllUser();

}
