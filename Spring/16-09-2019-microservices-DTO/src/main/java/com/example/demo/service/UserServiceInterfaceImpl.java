package com.example.demo.service;

import java.util.Optional;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


import com.example.demo.UserDto;
import com.example.demo.entity.UserEntity;
import com.example.demo.repository.UserRepo;

@Service
public class UserServiceInterfaceImpl implements UserServiceInterface {

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public UserDto createUser(UserDto userDto) {

		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
//		userDto.setPassword(bCryptPasswordEncoder.encode(userDto.getPassword()));
		UserEntity userEntity = mapper.map(userDto, UserEntity.class);
		userEntity.setUser_id(UUID.randomUUID().toString());

		userRepo.save(userEntity);
		UserDto tempDto = mapper.map(userEntity, UserDto.class);

		return tempDto;
	}

	@Override
	public UserDto findById(Long id) {
		// TODO Auto-generated method stub
		Optional<UserEntity> userEntity=userRepo.findById(id);
		UserEntity user =userEntity.get();
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		UserDto tempDto = mapper.map(user, UserDto.class);

		return tempDto;
	}

}