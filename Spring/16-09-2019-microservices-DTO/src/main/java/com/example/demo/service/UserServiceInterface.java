package com.example.demo.service;

import com.example.demo.UserDto;

public interface UserServiceInterface {
public UserDto createUser(UserDto userDto);
public UserDto findById(Long id );
}