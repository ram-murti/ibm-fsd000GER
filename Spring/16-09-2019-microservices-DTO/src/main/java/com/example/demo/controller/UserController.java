package com.example.demo.controller;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.UserDto;
import com.example.demo.entity.UserEntity;
import com.example.demo.model.CreateUserRequestModel;
import com.example.demo.model.CreateUserResponseModel;
import com.example.demo.service.UserServiceInterface;


@RestController
public class UserController {
	@Autowired
	private UserServiceInterface userService;
	

	@PostMapping("/")
	public ResponseEntity<CreateUserResponseModel> createUser(@RequestBody CreateUserRequestModel userDetail) {
		
//		userDetail.setPassword(bCryptPasswordEncoder.encode(userDetail.getPassword()));
		System.out.println(userDetail.getEmail());
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		UserEntity userEntity=mapper.map(userDetail, UserEntity.class);
		System.out.println(userEntity.getFname());
		UserDto userDto = mapper.map(userEntity, UserDto.class);
		
		UserDto temp = userService.createUser(userDto);
		CreateUserResponseModel model = mapper.map(temp, CreateUserResponseModel.class);
		return new ResponseEntity<CreateUserResponseModel>(model, HttpStatus.CREATED);
	}
	@GetMapping("/{id}")
	public ResponseEntity<CreateUserResponseModel> createUser(@PathVariable("id") Long id) {
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		UserDto temp = userService.findById(id);
		CreateUserResponseModel model = mapper.map(temp, CreateUserResponseModel.class);
		return new ResponseEntity<CreateUserResponseModel>(model, HttpStatus.CREATED);

	}

}