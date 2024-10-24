package com.crud.daoimpl;

import java.util.List;
import java.util.Optional;

import com.crud.model.Student;

public interface StudentDao {

	public List<Student> createStudents(List<Student> students);
	
	public void deleteStudentById(Integer id);
	
	public Message update(Student student);
	
	public Optional<Student> getStudentById(Integer id);
	
	public List<Student> getAllStudent();

//	public Student findByRollNo(int rollNo);

}
