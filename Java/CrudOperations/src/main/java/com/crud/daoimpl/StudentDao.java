package com.crud.daoimpl;

import java.util.List;
import java.util.Optional;

import com.crud.model.Student;

public interface StudentDao {

	public List<Student> createStudents(List<Student> students);
	
	public void deleteStudentById(int id);
	
	public Student update(Student student, int id);
	
	public Optional<Student> getStudentById(int id);
	
	public List<Student> getAllStudent();

	

	
	
}
