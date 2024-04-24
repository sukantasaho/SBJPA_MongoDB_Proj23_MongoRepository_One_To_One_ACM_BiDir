package com.main.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import com.main.document.Person;
 
 

public interface IPersonRepo  extends MongoRepository<Person, String>, CrudRepository<Person, String>
{ 
	
}
