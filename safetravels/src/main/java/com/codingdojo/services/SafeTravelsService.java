package com.codingdojo.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.models.SafeTravels;
import com.codingdojo.repositiories.SafeTravelsRepository;

//service is like the middle layer between repository and controller
@Service
public class SafeTravelsService {
	
	@Autowired
	private SafeTravelsRepository safetravelsrepository;
	
	//or
//	public SafeTravelsService(SafeTravelsRepository safetravelsrepository) {
//		
//		this.safetravelsRespository=safetravelsRepository;
//	}
	
	//optional
	public void create(SafeTravels safetravels) {
		
		safetravelsrepository.save(safetravels);
	}
	

	public void update(SafeTravels safetravels) {
		
		safetravelsrepository.save(safetravels);
	}
		
	
	
	//select * from safetravels;
	public ArrayList <SafeTravels> findAll(){
		
		
		return (ArrayList<SafeTravels>) safetravelsrepository.findAll();
	}
	
	
	public SafeTravels findOne(Long id) {
		
		Optional<SafeTravels> safetravels=safetravelsrepository.findById(id);
		return safetravels.isPresent()?safetravels.get():null;
		//return safetravelsRepository.findById(id);
	}
	
	public void deleteOne(Long id) {
		safetravelsrepository.deleteById(id);
	}
};
