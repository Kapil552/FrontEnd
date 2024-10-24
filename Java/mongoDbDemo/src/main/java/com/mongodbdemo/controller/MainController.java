package com.mongodbdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mongodbdemo.model.Student;
import com.mongodbdemo.studentdao.StudentDao;

@RestController
public class MainController {

	@Autowired
	StudentDao studentDao;
	
	@PostMapping("/addStudent")
	public String addStudent(@RequestBody Student student) {
		return studentDao.addStudent(student);
	}
	
	@GetMapping("/getStudent")
	public List<Student> getStudent() {	
		return studentDao.getStudents();
	}
	
	@PutMapping("/updateStudent")
	public String updateStudent(@RequestBody Student student) {
		return studentDao.updateStudent(student);
	}
	
	@DeleteMapping("/deleteStudent")
	public String deleteStudent(@RequestBody Student student) {
		return studentDao.deleteStudent(student);
	}
}
