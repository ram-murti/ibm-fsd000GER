package com.example.demo.service;

import java.util.List;

import com.example.demo.UserDto;

public interface UserServiceInterface {
public UserDto createUser(UserDto userDto);
public UserDto findById(Long id );
//public List<UserDto> deleteById(Long id);
}