package com.sravyaClass.DMS.repository;

import java.util.List;


import org.springframework.data.repository.CrudRepository;

import com.sravyaClass.DMS.Models.Dog;

/**
 * @author S564547
 */
public interface DogRepository extends CrudRepository<Dog,Integer>{
	List<Dog> findByName(String name);
	

}
