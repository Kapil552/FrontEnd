package com.crud.controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.daoimpl.StudentDao;
import com.crud.model.Student;

@RestController
@RequestMapping(value="/")
public class StudentController {
	
	@Autowired
	private StudentDao studentDao;
	
	@PostMapping("create")
	public List<Student> createStudents(@RequestBody List<Student> students) {
		List<Student> list=new ArrayList<Student>();
		for(Student st:students) {
			list.add(st);
		}
		
		return  studentDao.createStudents(list);
	}
	
	@GetMapping("getData")
	public List<Student> getAllStudent(){
		return studentDao.getAllStudent();
	}
	
	@PutMapping("update/{id}")
	public Student updateStudent(@RequestBody Student student, @PathVariable int id) {
		return studentDao.update(student, id);
	}

	@DeleteMapping("delete/{id}")
	public void delete(@PathVariable int id) {
		studentDao.deleteStudentById(id);
	}
	
	@GetMapping("get/{id}")
	public Optional<Student> getStudentById(@PathVariable int id) {
		return studentDao.getStudentById(id);
	}
}
