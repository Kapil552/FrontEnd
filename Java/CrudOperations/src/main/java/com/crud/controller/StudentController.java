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

import com.crud.daoimpl.Message;
import com.crud.daoimpl.StudentDao;
import com.crud.model.Student;

@RestController
@RequestMapping(value = "/")
public class StudentController {

	@Autowired
	private StudentDao studentDao;

	@PostMapping("create")
	public List<Message> createStudents(@RequestBody List<Student> students) {


		List<Message> list1 = new ArrayList<Message>();
		List<Student> list = new ArrayList<Student>();
		
		for (Student st : students) {
			Message message = new Message();

			Integer rollNo = st.getRollno();

			Student student = studentDao.findByRollNo(rollNo);

			if (student != null) {

				message.addMessage("rollno " + rollNo + " already exist");
				
			} else {

				list.add(st);
				studentDao.createStudents(list);
				message.addMessage(rollNo + " added succesfully");
			}
			 	list1.add(message); 	
		}
		return list1;
	}

	@GetMapping("getData")
	public List<Student> getAllStudent() {
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
