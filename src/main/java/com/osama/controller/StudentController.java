package com.osama.controller;

import com.osama.model.Student;
import com.osama.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Make it restController to get response as well
@RestController
public class StudentController {

    //Autowired the StudentService Class object here to use methods from there.
    @Autowired
    private StudentService studentService;

    // Getting list of student present in database
    @GetMapping("/all")
    public List<Student> getAllStudent() { return studentService.getAllStudent();}

    // Add new Student in database using request Body
    @PostMapping("/student")
    public Student addStudent(@RequestBody Student student)
    {
        return studentService.addStudent(student);
    }

    // Getting single student using student_id
    @GetMapping("/stu/{id}")
    public Student getId(@PathVariable int id){
        return studentService.getById(id);
    }

    // Deleting single student using student_id
    @DeleteMapping("/stu/{id}")
    public void deleteStudent(@PathVariable int id) { studentService.studentDeleteById(id);}

    // Updating existing Student using student_id through request body
    @PutMapping("/stu/{id}")
    public Student updateStudent(@PathVariable int id,@RequestBody Student student) { return studentService.updateStudentById(id,student);}

}
