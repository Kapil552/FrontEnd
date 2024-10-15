package com.crud.daoimpl;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.dao.StudentRepo;
import com.crud.model.Student;

@Service
public class StudentService implements StudentDao {

	@Autowired
	private StudentRepo studentRepo;
	
	@Override
	public Student saveStudent(Student student) {
		
		return studentRepo.save(student);
	}

	@Override
	public void deleteStudentById(int id) {
		studentRepo.deleteById(id);
		
	}

	@Override
	public Student update(Student student, int id) {
		
		Student std = studentRepo.findById(id).get();
		 
        if (Objects.nonNull(student.getName()) && !"".equalsIgnoreCase(student.getName())) {
        	std.setName(student.getName());
        }
 
        if (Objects.nonNull(student.getBranch()) && !"".equalsIgnoreCase(student.getBranch())) {
        	std.setBranch(student.getBranch());
        }
 
		return studentRepo.save(std);
	}

	@Override
	public Optional<Student> getStudentById(int id) {
		return studentRepo.findById(id);
	}

	@Override
	public List<Student> getAllStudent() {
		return (List<Student>) studentRepo.findAll();
	}
	
	
	

	
	
}
