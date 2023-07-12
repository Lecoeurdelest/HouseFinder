package com.housefinder.service;

import com.housefinder.entity.User;
import com.housefinder.dto.UserReqDto;

import java.util.List;

public interface UserService {
    void saveUser(UserReqDto userReqDto);

    User findByEmail(String email);

    void forgotPassword(String email);

    List<UserReqDto> findAllUser();

}
