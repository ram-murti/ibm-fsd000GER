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
		System.out.println("here");
		AssociateDto temp=associateService.createAssociate(assodto);
		CreateUserResponseModel model = mapper.map(temp, CreateUserResponseModel.class);
		return new ResponseEntity<CreateUserResponseModel>(model, HttpStatus.CREATED);

	}
	@GetMapping("/fname/{firstname}")
	public ResponseEntity<List<CreateUserResponseModel>> findAssociateDetailByFirstName(@PathVariable("firstname") String fname) {
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		List<AssociateDto> temp=associateService.findByFirstName(fname);
		
		List<CreateUserResponseModel> model =new ArrayList<CreateUserResponseModel>();
		for(AssociateDto dto:temp) {
			CreateUserResponseModel model1=mapper.map(dto,CreateUserResponseModel.class);
			model.add(model1);
		}
		return new ResponseEntity<List<CreateUserResponseModel>>(model, HttpStatus.CREATED);


	}
	@GetMapping("/lname/{lastname}")
	public ResponseEntity<List<CreateUserResponseModel>> findAssociateDetailByLastName(@PathVariable("lastname") String lname) {
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		List<AssociateDto> temp=associateService.findByLastName(lname);
		
		List<CreateUserResponseModel> model =new ArrayList<CreateUserResponseModel>();
		for(AssociateDto dto:temp) {
			CreateUserResponseModel model1=mapper.map(dto,CreateUserResponseModel.class);
			model.add(model1);
		}
		return new ResponseEntity<List<CreateUserResponseModel>>(model, HttpStatus.CREATED);

	}
	@GetMapping("/fname/lname/{firstname}/{lastname}")
	public ResponseEntity<CreateUserResponseModel> findAssociateDetailByLastNameAndLastName(@PathVariable("lastname") String lname,@PathVariable("firstname") String fname) {
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

		AssociateDto dto=associateService.findByFirstNameAndLastName(fname, lname);
		CreateUserResponseModel model = mapper.map(dto, CreateUserResponseModel.class);
		return new ResponseEntity<CreateUserResponseModel>(model, HttpStatus.CREATED);

	}
	@GetMapping("/email/{email}")
	public ResponseEntity<CreateUserResponseModel> findAssociateDetailByEmail(@PathVariable("email") String email) {
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

		AssociateDto dto=associateService.findByEmail(email);
		CreateUserResponseModel model = mapper.map(dto, CreateUserResponseModel.class);
		return new ResponseEntity<CreateUserResponseModel>(model, HttpStatus.CREATED);
	}
	@GetMapping("/number/{number}")
	public ResponseEntity<CreateUserResponseModel> findAssociateDetailByNumber(@PathVariable("number") String number1) {
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
         long number=(long) Integer.parseInt(number1);
         System.out.println(number);
		AssociateDto dto=associateService.findBymobileNumber(number);
		CreateUserResponseModel model = mapper.map(dto, CreateUserResponseModel.class);
		return new ResponseEntity<CreateUserResponseModel>(model, HttpStatus.CREATED);
	}
	@GetMapping("/id/{id}")
	public ResponseEntity<CreateUserResponseModel> findAssociateDetailById(@PathVariable("id") String id1) {
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
         Long id=(long) Integer.parseInt(id1);
		AssociateDto dto=associateService.findById(id);
		CreateUserResponseModel model = mapper.map(dto, CreateUserResponseModel.class);
		return new ResponseEntity<CreateUserResponseModel>(model, HttpStatus.CREATED);
	}
	@PutMapping("/update")
	public ResponseEntity<List<CreateUserResponseModel>> updateUser(@RequestBody CreateUserResponseModel associateDetail) {
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		AssociateDetail assodetail=mapper.map(associateDetail,AssociateDetail.class);
		AssociateDto assodto=mapper.map(assodetail,AssociateDto.class);
		List<AssociateDto> temp=associateService.updateById(assodto);
		List<CreateUserResponseModel> model =new ArrayList<CreateUserResponseModel>();
		for(AssociateDto dto:temp) {
			CreateUserResponseModel model1=mapper.map(dto,CreateUserResponseModel.class);
			model.add(model1);
		}
		return new ResponseEntity<List<CreateUserResponseModel>>(model, HttpStatus.CREATED);
	}
	@PostMapping("/delete/{id}")
	public ResponseEntity<List<CreateUserResponseModel>> deleteById(@PathVariable("id") String id1) {
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		List<AssociateDto> temp=associateService.deleteByAssociateId(id1);
		List<CreateUserResponseModel> model =new ArrayList<CreateUserResponseModel>();
		for(AssociateDto dto:temp) {
			CreateUserResponseModel model1=mapper.map(dto,CreateUserResponseModel.class);
			model.add(model1);
		}
		return new ResponseEntity<List<CreateUserResponseModel>>(model, HttpStatus.CREATED);
	}
	@GetMapping("/viewAll")
	public ResponseEntity<List<CreateUserResponseModel>> findAll() {
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		List<AssociateDto> dto=associateService.viewAll();
		List<CreateUserResponseModel> model =new ArrayList<CreateUserResponseModel>();
		for(AssociateDto dto1:dto) {
			CreateUserResponseModel model1=mapper.map(dto1,CreateUserResponseModel.class);
			model.add(model1);
		}
		return new ResponseEntity<List<CreateUserResponseModel>>(model, HttpStatus.CREATED);
	}
	@GetMapping("/asso/{id}")
	public CreateUserResponseModel findByAssociateId(@PathVariable("id") String id) {
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        System.out.println(id);
		AssociateDto dto=associateService.findByAssociateId(id);
		CreateUserResponseModel model = mapper.map(dto, CreateUserResponseModel.class);
		return model;
	}
}