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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.SkillDto;
import com.example.demo.entity.Skill;
import com.example.demo.model.RequestModel;
import com.example.demo.model.ResponseModel;
import com.example.demo.service.SkillService;

@RestController
@RequestMapping("/")
public class HomeController {
	@Autowired
	private SkillService skillService;
	@PostMapping("/skills")
	public ResponseEntity<ResponseModel> create(@RequestBody RequestModel skillDetail){
		ModelMapper mapper=new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		SkillDto sDto=mapper.map(skillDetail, SkillDto.class);
		SkillDto sDtoResp=skillService.createSkill(sDto);
		ResponseModel respo=mapper.map(sDtoResp, ResponseModel.class);
		return ResponseEntity.status(HttpStatus.CREATED).body(respo);
	}
	@GetMapping("/skills")
	public List<ResponseEntity<ResponseModel>> getAllSkills(){
		List<Skill> skills=skillService.getAllSkills();
		List<ResponseEntity<ResponseModel>> list=new ArrayList<ResponseEntity<ResponseModel>>();
		ModelMapper mapper = new ModelMapper();
		for(Skill u : skills) {
			ResponseModel res = mapper.map(u,ResponseModel.class);
			list.add(ResponseEntity.status(HttpStatus.CREATED).body(res));
		}
		return list;
	}
	@GetMapping("/skills/{id}")
	public ResponseEntity<ResponseModel> findUser(@PathVariable("id") String userID){
		ModelMapper mapper = new ModelMapper();
		Skill user = skillService.findSkill(Integer.parseInt(userID));
		ResponseModel model = mapper.map(user,ResponseModel.class);
		return ResponseEntity.status(HttpStatus.CREATED).body(model);
		
	}
	
	@DeleteMapping("/skills/{id}")
	public ResponseEntity<ResponseModel> deleteUser(@PathVariable("id") String userID){
		ModelMapper mapper = new ModelMapper();
		Skill user = skillService.deleteSkill(Integer.parseInt(userID));
		ResponseModel model = mapper.map(user,ResponseModel.class);
		return ResponseEntity.status(HttpStatus.GONE).body(model);	
	} 
	
	@PostMapping("/skills/{id}")
	public ResponseEntity<ResponseModel> updateUser(@RequestBody RequestModel userDetail,@PathVariable("id") String userID){
		ModelMapper mapper = new ModelMapper();
		SkillDto dto = mapper.map(userDetail, SkillDto.class);
		System.out.println(dto.getSid());
		SkillDto dto1 = skillService.updateSkill(dto,Integer.parseInt(userID));
		ResponseModel user = mapper.map(dto1,ResponseModel.class);
		System.out.println(user.getSid());
		return ResponseEntity.status(HttpStatus.CREATED).body(user);
	
	}
}
