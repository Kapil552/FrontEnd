package com.crud.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.crud.model.Student;

@Repository
public interface StudentRepo extends MongoRepository<Student, Integer> {

	
}
