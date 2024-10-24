package com.mongodbdemo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongodbdemo.model.Student;

public interface StudentRepo extends MongoRepository<Student, Integer>{

}
