package com.codingdojo.repositiories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.models.SafeTravels;


@Repository
public interface SafeTravelsRepository extends CrudRepository <SafeTravels,Long>{

	
	
};
