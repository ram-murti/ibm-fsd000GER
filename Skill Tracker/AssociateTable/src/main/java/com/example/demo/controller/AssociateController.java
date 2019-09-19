package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.AssociateDto;
import com.example.demo.model.AssociateDetail;
import com.example.demo.model.CreateUserRequestModel;
import com.example.demo.model.CreateUserResponseModel;
import com.example.demo.service.AssociateService;

@RestController
public class AssociateController {
     @Autowired
	private AssociateService associateService;
	@PostMapping("/")
	public ResponseEntity<CreateUserResponseModel> createUser(@RequestBody CreateUserRequestModel associateDetail) {
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		AssociateDetail assodetail=mapper.map(associateDetail,AssociateDetail.class);
		AssociateDto assodto=mapper.map(assodetail,AssociateDto.class);
		AssociateDto temp=associateService.createAssociate(assodto);
		CreateUserResponseModel model = mapper.map(temp, CreateUserResponseModel.class);
		return new ResponseEntity<CreateUserResponseModel>(model, HttpStatus.CREATED);

	}
	@GetMapping("/firstname/{firstname}")
	public List<CreateUserResponseModel> findAssociateDetailByFirstName(@PathVariable("firstname") String fname) {
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		List<AssociateDto> temp=associateService.findByFirstName(fname);
		
		List<CreateUserResponseModel> model =new ArrayList<CreateUserResponseModel>();
		for(AssociateDto dto:temp) {
			CreateUserResponseModel model1=mapper.map(dto,CreateUserResponseModel.class);
			model.add(model1);
		}
		return model;

	}
	@GetMapping("/lastname/{lastname}")
	public List<CreateUserResponseModel> findAssociateDetailByLastName(@PathVariable("lastname") String lname) {
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		List<AssociateDto> temp=associateService.findByLastName(lname);
		
		List<CreateUserResponseModel> model =new ArrayList<CreateUserResponseModel>();
		for(AssociateDto dto:temp) {
			CreateUserResponseModel model1=mapper.map(dto,CreateUserResponseModel.class);
			model.add(model1);
		}
		return model;

	}
	@GetMapping("/first/lastname/{firstname}/{lastname}")
	public CreateUserResponseModel findAssociateDetailByLastNameAndLastName(@PathVariable("lastname") String lname,@PathVariable("firstname") String fname) {
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

		AssociateDto dto=associateService.findByFirstNameAndLastName(fname, lname);
		CreateUserResponseModel model = mapper.map(dto, CreateUserResponseModel.class);
   return model;
	}
	@GetMapping("/email/{email}")
	public CreateUserResponseModel findAssociateDetailByEmail(@PathVariable("email") String email) {
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

		AssociateDto dto=associateService.findByEmail(email);
		CreateUserResponseModel model = mapper.map(dto, CreateUserResponseModel.class);
   return model;
	}
	@GetMapping("/mobilenumber/{number}")
	public CreateUserResponseModel findAssociateDetailByNumber(@PathVariable("number") String number1) {
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
         long number=(long) Integer.parseInt(number1);
         System.out.println(number);
		AssociateDto dto=associateService.findBymobileNumber(number);
		CreateUserResponseModel model = mapper.map(dto, CreateUserResponseModel.class);
   return model;
	}
	@GetMapping("/id/{id}")
	public CreateUserResponseModel findAssociateDetailById(@PathVariable("id") String id1) {
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
         Long id=(long) Integer.parseInt(id1);
		AssociateDto dto=associateService.findById(id);
		CreateUserResponseModel model = mapper.map(dto, CreateUserResponseModel.class);
   return model;
	}
	@PutMapping("/update/{id}")
	public List<CreateUserResponseModel> updateUser(@RequestBody CreateUserRequestModel associateDetail,@PathVariable("id") String id1) {
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		AssociateDetail assodetail=mapper.map(associateDetail,AssociateDetail.class);
		AssociateDto assodto=mapper.map(assodetail,AssociateDto.class);
        Long id=(long) Integer.parseInt(id1);
		List<AssociateDto> temp=associateService.updateById(assodto,id);
		List<CreateUserResponseModel> model =new ArrayList<CreateUserResponseModel>();
		for(AssociateDto dto:temp) {
			CreateUserResponseModel model1=mapper.map(dto,CreateUserResponseModel.class);
			model.add(model1);
		}
		return model;
	}
	@DeleteMapping("/delete/{id}")
	public List<CreateUserResponseModel> deleteById(@PathVariable("id") String id1) {
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        Long id=(long) Integer.parseInt(id1);
		List<AssociateDto> temp=associateService.deleteById(id);
		List<CreateUserResponseModel> model =new ArrayList<CreateUserResponseModel>();
		for(AssociateDto dto:temp) {
			CreateUserResponseModel model1=mapper.map(dto,CreateUserResponseModel.class);
			model.add(model1);
		}
		return model;
	}
}