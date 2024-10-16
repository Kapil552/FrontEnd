package com.crud.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crud.model.Student;

@Repository
public interface StudentRepo extends CrudRepository<Student, Integer> {
	
	@Override
	public <S extends Student> Iterable<S> saveAll(Iterable<S> entities);
	
	@Override
	public void deleteById(Integer id);
	
	@Override
	public Iterable<Student> findAll();
	
	@Override
	public Optional<Student> findById(Integer id);
	
	
}
