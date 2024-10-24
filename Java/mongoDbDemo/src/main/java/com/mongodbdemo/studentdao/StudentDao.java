package com.mongodbdemo.studentdao;

import java.util.List;

import com.mongodbdemo.model.Student;

public interface StudentDao {

	public List<Student> getStudents();

	public String addStudent(Student student);
	
	public String updateStudent(Student student);
	
	public String deleteStudent(Student student);
}
