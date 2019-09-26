package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.AssociateDto;
import com.example.demo.model.AssociateDetail;
import com.example.demo.repository.AssociateRepository;
@Service
public class AssociateServiceImpl implements AssociateService {
    @Autowired
	private AssociateRepository associateRepository;
    
	
	@Override
	public List<AssociateDto> findByFirstName(String fname) {
		// TODO Auto-generated method stub
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		List<AssociateDetail> assodetail=associateRepository.findByAssociateFirstName(fname);
		List<AssociateDto> tempdto=new ArrayList<AssociateDto>();
		for(AssociateDetail s:assodetail) {
			AssociateDto assodto=mapper.map(s,AssociateDto.class);
                 tempdto.add(assodto);
		}
		return tempdto;	}

	@Override
	public List<AssociateDto> findByLastName(String lname) {
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		List<AssociateDetail> assodetail=associateRepository.findByAssociateLastName(lname);
		// TODO Auto-generated method stub
		List<AssociateDto> tempdto=new ArrayList<AssociateDto>();
		for(AssociateDetail s:assodetail) {
			AssociateDto assodto=mapper.map(s,AssociateDto.class);
                 tempdto.add(assodto);
		}
		return tempdto;
	}

	@Override
	public AssociateDto findByFirstNameAndLastName(String fname, String lname) {
		// TODO Auto-generated method stub
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		AssociateDetail assodetail=associateRepository.findByAssociateFirstNameAndAssociateLastName(fname, lname);
				AssociateDto assodto=mapper.map(assodetail,AssociateDto.class);
				return assodto;
	}

	@Override
	public AssociateDto findByEmail(String email) {
		// TODO Auto-generated method stub
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		AssociateDetail assodetail=associateRepository.findByEmail(email);
				AssociateDto assodto=mapper.map(assodetail,AssociateDto.class);
		return assodto;
	}

	@Override
	public AssociateDto findBymobileNumber(long number) {
		// TODO Auto-generated method stub
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		AssociateDetail assodetail=associateRepository.findByAssociateMobilenumber(number);
		
				AssociateDto assodto=mapper.map(assodetail,AssociateDto.class);
				System.out.println(assodto.getAssociateFirstName());
		return assodto;
	}

	@Override
	public AssociateDto createAssociate(AssociateDto tempDto) {
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		AssociateDetail assodetail=mapper.map(tempDto,AssociateDetail.class);
		assodetail.setAssociateId(UUID.randomUUID().toString());
		associateRepository.save(assodetail);
		AssociateDto assodto=mapper.map(assodetail,AssociateDto.class);
		return assodto;
	}

	@Override
	public AssociateDto findById(Long id) {
		// TODO Auto-generated method stub
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		Optional<AssociateDetail> assodetail=associateRepository.findById(id);
		AssociateDetail temp=assodetail.get();
				AssociateDto assodto=mapper.map(temp,AssociateDto.class);
				return assodto;	
	}

	@Override
	public List<AssociateDto> deleteById(long id) {
		// TODO Auto-generated method stub
		Optional<AssociateDetail> assodetail=associateRepository.findById(id);
		AssociateDetail temp=assodetail.get();
		associateRepository.delete(temp);
		return  viewAll();
	}

	@Override
	public List<AssociateDto> viewAll() {
		// TODO Auto-generated method stub
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		List<AssociateDetail> assodetail=associateRepository.findAll();
		List<AssociateDto> tempdto=new ArrayList<AssociateDto>();
		for(AssociateDetail s:assodetail) {
			AssociateDto assodto=mapper.map(s,AssociateDto.class);
                 tempdto.add(assodto);
		}
		return tempdto;
	}

	@Override
	public List<AssociateDto> updateById(AssociateDto tempDto) {
		// TODO Auto-generated method stub
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		String id=tempDto.getAssociateId();
		AssociateDetail temp=associateRepository.findByAssociateId(id);
            temp.setAssociateFirstName(tempDto.getAssociateFirstName());
            temp.setAssociateLastName(tempDto.getAssociateLastName());
            temp.setEmail(tempDto.getEmail());
            temp.setAssociateMobilenumber(tempDto.getAssociateMobilenumber());
    		associateRepository.save(temp);

		return viewAll();
	}

	@Override
	public List<AssociateDto> deleteByAssociateId(String id) {
		// TODO Auto-generated method stub
	AssociateDetail asso= associateRepository.findByAssociateId(id);
		associateRepository.delete(asso);
		System.out.println("deleted");
		return viewAll();
	}

	@Override
	public AssociateDto findByAssociateId(String id) {
		// TODO Auto-generated method stub
		AssociateDetail asso=associateRepository.findByAssociateId(id);
		System.out.println("here");
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		AssociateDto assodto=mapper.map(asso,AssociateDto.class);
System.out.println("hey");
		return assodto;
	}

	
	
}
