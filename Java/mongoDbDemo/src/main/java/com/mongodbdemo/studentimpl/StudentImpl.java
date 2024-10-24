package com.mongodbdemo.studentimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.mongodbdemo.model.Student;
import com.mongodbdemo.repository.StudentRepo;
import com.mongodbdemo.studentdao.StudentDao;

@Service
public class StudentImpl implements StudentDao {

	@Autowired
	StudentRepo studentRepo;

	@Override
	public String addStudent(@RequestBody Student student) {
		studentRepo.insert(student);
		return "Student Added Successfully";
	}

	@Override
	public List<Student> getStudents() {
		return studentRepo.findAll();
	}

	@Override
	public String updateStudent(Student student) {
		if (studentRepo.existsById(student.getId())) {
			studentRepo.save(student);
			return "Student updated successfully";
		} else {
			return "student not found";
		}
	}

	@Override
	public String deleteStudent(Student student) {
		if (studentRepo.existsById(student.getId())) {
			System.out.println(student.getName());
			studentRepo.deleteById(student.getId());
			return "Student deleted successfully";
		} else {
			return "Student not found";
		}
	}
}
