package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.client.AssociateClient;
import com.example.demo.model.CreateUserRequestModel;
import com.example.demo.model.CreateUserResponseModel;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
@Service
public class AssociateService {
@Autowired AssociateClient associateClient;
@HystrixCommand(fallbackMethod="getFallbackDetailcreateUser")

	public ResponseEntity<?> createUser(@RequestBody CreateUserRequestModel associateDetail){
		return associateClient.createUser(associateDetail);	
	}
	@HystrixCommand(fallbackMethod="getFallbackDetailByfirstname")
	public ResponseEntity<?> findAssociateDetailByFirstName(@PathVariable("firstname") String fname){
		return associateClient.findAssociateDetailByFirstName(fname);
		
	}
	@HystrixCommand(fallbackMethod="getFallbackDetailBylastname")
	public ResponseEntity<?> findAssociateDetailByLastName(@PathVariable("lastname") String lname){
		return associateClient.findAssociateDetailByLastName(lname);
		
	}
	@HystrixCommand(fallbackMethod="getFallbackDetailByfAndlname")
	public ResponseEntity<?> findAssociateDetailByLastNameAndLastName(@PathVariable("lastname") String lname,@PathVariable("firstname") String fname){
		return associateClient.findAssociateDetailByLastNameAndLastName(lname, fname);
		
	}	@HystrixCommand(fallbackMethod="getFallbackDetailByEmail")
	public ResponseEntity<?> findAssociateDetailByEmail(@PathVariable("email") String email){
		return associateClient.findAssociateDetailByEmail(email);
		
	}
	@HystrixCommand(fallbackMethod="getFallbackDetailByNumber")
	public ResponseEntity<?> findAssociateDetailByNumber(@PathVariable("number") String number1){
		return associateClient.findAssociateDetailByNumber(number1);
		
	}
	@HystrixCommand(fallbackMethod="getFallbackDetailById")
	public ResponseEntity<?> findAssociateDetailById(@PathVariable("id") String id1){
		return associateClient.findAssociateDetailById(id1);
		
	}
	@HystrixCommand(fallbackMethod="getFallbackupdate")
	public ResponseEntity<?> updateUser(@RequestBody CreateUserResponseModel associateDetail
			){
				return associateClient.updateUser(associateDetail);
		
	}
	@HystrixCommand(fallbackMethod="getFallbackdelete")
	public ResponseEntity<?> deleteById(@PathVariable("id") String id1){
		return associateClient.deleteById(id1);
		
	}
	@HystrixCommand(fallbackMethod="getFallbackfind")
	public ResponseEntity<?> findAll() {
		return associateClient.findAll();
		
	}

	
	public CreateUserResponseModel findByAssociateId(String id){
		System.out.println(id);
		return associateClient.findByAssociateId(id);
		
	}
	public ResponseEntity<?> getFallbackfind() {
		return ResponseEntity.ok("find m dikkat hai");
	}
	public ResponseEntity<?> getFallbackdelete(@PathVariable("id") String id1) {
		return ResponseEntity.ok("delete m dikkat hai");
	}
	public ResponseEntity<?> getFallbackupdate(@RequestBody CreateUserResponseModel associateDetail) {
		return ResponseEntity.ok("update m dikkat hai");
	}
	public ResponseEntity<?> getFallbackDetailById(@PathVariable("id") String id) {
		return ResponseEntity.ok("findId m dikkat hai");
	}
	public ResponseEntity<?> getFallbackDetailByNumber(@PathVariable("number") String number1) {
		return ResponseEntity.ok("findNumber m dikkat hai");
	}
	public ResponseEntity<?> getFallbackDetailByEmail(@PathVariable("email") String email) {
		return ResponseEntity.ok("findEmail m dikkat hai");
	}
	public ResponseEntity<?> getFallbackDetailByfAndlname(@PathVariable("lastname") String lname,@PathVariable("firstname") String fname) {
		return ResponseEntity.ok("findfandl m dikkat hai");
	}
	public ResponseEntity<?> getFallbackDetailBylastname(@PathVariable("lastname") String lname) {
		return ResponseEntity.ok("findlastname m dikkat hai");
	}
	public ResponseEntity<?> getFallbackDetailByfirstname(@PathVariable("firstname")String fname) {
		return ResponseEntity.ok("findfirstname m dikkat hai");
	}
	public ResponseEntity<?> getFallbackDetailcreateUser(@RequestBody CreateUserRequestModel associateDetail) {
		return ResponseEntity.ok("findfirstname m");
	}
}
