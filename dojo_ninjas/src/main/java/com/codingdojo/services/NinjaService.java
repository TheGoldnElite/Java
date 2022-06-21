package com.codingdojo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.models.Ninja;
import com.codingdojo.repositories.NinjaRepository;

@Service
public class NinjaService {
	
	
	@Autowired
	private NinjaRepository ninjaRepository;
	
	//insert into ninja(first,last,age) values(ninja.getName()
	public void create(Ninja ninja) {
		ninjaRepository.save(ninja);
	}
	
	public ArrayList<Ninja> findAll(){
		//select * from ninja;
		return (ArrayList<Ninja>)ninjaRepository.findAll();
	}
	
	//select * from ninja where ninja.id=?
	public Ninja findById(Long id) {
		return ninjaRepository.findById(id).orElse(null);
	}
	
	
	public void update(Ninja ninja) {
		ninjaRepository.save(ninja);
	}
	
	
	//delete from ninja where id=?
	public void deleteById(Long id) {
		ninjaRepository.deleteById(id);
	}
};
