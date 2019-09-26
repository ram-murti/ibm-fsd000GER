package com.example.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.CreateUserRequestModel;
import com.example.demo.model.CreateUserResponseModel;

@FeignClient(name = "Associate", url="http://localhost:8010")

public interface AssociateClient {
	@RequestMapping(value = "/", method = RequestMethod.POST)

	public ResponseEntity<?> createUser(@RequestBody CreateUserRequestModel associateDetail);

	@RequestMapping(value = "/fname/{firstname}", method = RequestMethod.GET)

	public ResponseEntity<?> findAssociateDetailByFirstName(@PathVariable("firstname") String fname);

	@RequestMapping(value = "/lname/{lastname}", method = RequestMethod.GET)

	public ResponseEntity<?> findAssociateDetailByLastName(@PathVariable("lastname") String lname);

	@RequestMapping(value = "/fname/lname/{firstname}/{lastname}", method = RequestMethod.GET)

	public ResponseEntity<?> findAssociateDetailByLastNameAndLastName(@PathVariable("lastname") String lname,@PathVariable("firstname") String fname);

	@RequestMapping(value = "/email/{email}", method = RequestMethod.GET)

	public ResponseEntity<?> findAssociateDetailByEmail(@PathVariable("email") String email);

	@RequestMapping(value = "/number/{number}", method = RequestMethod.GET)

	public ResponseEntity<?> findAssociateDetailByNumber(@PathVariable("number") String number1);

	@RequestMapping(value = "/id//{id}", method = RequestMethod.GET)

	public ResponseEntity<?> findAssociateDetailById(@PathVariable("id") String id1);

	@RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)

	public ResponseEntity<?> updateUser(@RequestBody CreateUserResponseModel associateDetail
			);
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)

	public ResponseEntity<?> deleteById(@PathVariable("id") String id1);
	
	@RequestMapping(value = "/viewAll", method = RequestMethod.GET)
	
	public ResponseEntity<?> findAll();
	
	@RequestMapping(value = "/asso/{id}", method = RequestMethod.GET)
	public CreateUserResponseModel findByAssociateId(@PathVariable("id") String id) ;

}
