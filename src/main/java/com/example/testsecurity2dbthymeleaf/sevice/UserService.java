package com.example.testsecurity2dbthymeleaf.sevice;

import com.example.testsecurity2dbthymeleaf.dto.UserDto;
import com.example.testsecurity2dbthymeleaf.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);
    User findUserByEmail(String email);
    List<Object> findAllUsers();
}
