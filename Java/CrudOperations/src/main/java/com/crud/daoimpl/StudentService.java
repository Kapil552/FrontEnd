package com.crud.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.model.Student;
import com.crud.repository.StudentRepo;

@Service
public class StudentService implements StudentDao {

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public List<Student> createStudents(List<Student> students) {        
        return (List<Student>) studentRepo.saveAll(students);
    }

    @Override
    public void deleteStudentById(Integer id) {
        studentRepo.deleteById(id);; // Use the repository method for deletion
    }

    @Override
    public Message update(Student student) {
        Message message = new Message();
        if (studentRepo.existsById(student.getId())) {
            studentRepo.save(student); // Use save to update
            message.addMessage("Student Updated Successfully");
        } else {
            message.addMessage("Student not found");
        }
        return message;
    }

    @Override
    public Optional<Student> getStudentById(Integer id) {
        return studentRepo.findById(id);
    }

    @Override
    public List<Student> getAllStudent() {
        return (List<Student>) studentRepo.findAll();
    }

//    @Override
//    public Student findByRollNo(int rollNo) {
//        return studentRepo.findByRollNo(rollNo); // Assume you have a method in the repository
//    }
}
