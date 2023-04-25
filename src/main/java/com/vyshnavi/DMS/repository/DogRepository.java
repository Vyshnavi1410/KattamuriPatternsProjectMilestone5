package com.vyshnavi.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.vyshnavi.DMS.Models.Dog;

/**
 * 
 * @author S554978
 *
 */
public interface DogRepository extends CrudRepository<Dog,Integer> {
	List<Dog> findByName(String name);
}
