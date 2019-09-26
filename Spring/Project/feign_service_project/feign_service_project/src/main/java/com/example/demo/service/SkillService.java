package com.example.demo.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entity.Admin;
import com.example.demo.model.RequestModel;
import com.example.demo.model.ResponseModel;



@FeignClient(name="admin-service")
public interface SkillService {
	
	 @RequestMapping(value = "/skills", method = RequestMethod.POST)
	 public ResponseEntity<ResponseModel> create(@RequestBody RequestModel skillDetail);
	 
	 @RequestMapping(value = "/skills", method = RequestMethod.GET)
	 public List<ResponseEntity<ResponseModel>> getAllSkills();

	 @RequestMapping(value = "/skills/{id}", method = RequestMethod.GET)
	 public ResponseEntity<ResponseModel> findSkill(@PathVariable("id") String userID);
	 
	 @RequestMapping(value = "/skillsName/{name}", method = RequestMethod.GET)
	 public ResponseEntity<ResponseModel> findSkillByName(@PathVariable("name") String skillName);
	 
	 @RequestMapping(value = "/skills/{id}", method = RequestMethod.DELETE)
	 public ResponseEntity<ResponseModel> deleteSkill(@PathVariable("id") String userID);
	 
	 @RequestMapping(value = "/skills/{id}", method = RequestMethod.POST)
	 public ResponseEntity<ResponseModel> updateSkill(@RequestBody RequestModel userDetail,@PathVariable("id") String userID);
	 
	 @RequestMapping(value = "/admin/update", method = RequestMethod.PUT)
	 public Admin updateAdmin(@RequestBody Admin a);
	 
	 @RequestMapping(value = "/admin/view", method = RequestMethod.GET)
	 public Admin getAdmin();
}
