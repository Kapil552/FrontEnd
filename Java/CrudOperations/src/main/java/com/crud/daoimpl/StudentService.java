package com.crud.daoimpl;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.model.Student;
import com.crud.repository.StudentRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceContext;

@Service
public class StudentService implements StudentDao {

	@Autowired
	private StudentRepo studentRepo;
	
	@PersistenceContext
	public EntityManager entityManager;
	
	@Override
	public List<Student> createStudents(List<Student> students) {		
		return (List<Student>) studentRepo.saveAll(students);
	}
	
	@Override
	public void deleteStudentById(int id) {
		studentRepo.deleteById(id);
		
	}

	@Override
	public Student update(Student student, int id) {
		
		Student std = studentRepo.findById(id).get();
	 
		if (Objects.nonNull(student.getName())
	            && !"".equalsIgnoreCase(
	            		student.getName())) {
				std.setName(
	            		student.getName());
	        }
	 
	        if (Objects.nonNull(
	        		student.getBranch())
	            && !"".equalsIgnoreCase(
	            		student.getBranch())) {
	        	std.setBranch(
	            		student.getBranch());
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

	@Override
	public Student findByRollNo(int rollNo) {
		try {
			String jpql = "SELECT u FROM Student u WHERE u.rollno = :rollno"; // Using UserDTO here
			return (Student) entityManager.createQuery(jpql, Student.class) // Specify UserDTO.class for type safety
					.setParameter("rollno", rollNo).getSingleResult();
		} catch (NoResultException e) {
			// Handle the case where no result is found
			return null; // or throw your custom exception
		}
	}



	
}
