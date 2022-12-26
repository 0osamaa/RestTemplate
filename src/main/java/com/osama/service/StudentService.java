package com.osama.service;


import com.osama.model.Student;
import com.osama.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    //Autowired the repo which is interface having JPA built-in methods
    @Autowired
    private StudentRepo studentRepo;



    //Implementation of get all student in a list using JPA findAll method
    public List<Student> getAllStudent() {
        List<Student> students = studentRepo.findAll();
        return students;
    }

    //Implementation of adding single student using JPA save method
    public Student addStudent(Student student) {
        Student students = studentRepo.save(student);
        return students;
    }

    //Implementation of get student by student_id using JPA findById method
    public Student getById(int id) {
        Optional<Student> student = studentRepo.findById(id);
        if (student.isPresent()) {
            return student.get();
        } else {
            throw new RuntimeException("Student not found");
        }
    }

    //Implementation of delete student by student_id using JPA deleteById method
    public String studentDeleteById(int id) {
        studentRepo.deleteById(id);
        return "Student Removed Successfully";
    }

    //Implementation of update existing student by student_id using JPA save method
    public Student updateStudentById(int id, Student student) {
        studentRepo.findById(id).get();
        Student students = studentRepo.save(student);
        return students;
    }
}
