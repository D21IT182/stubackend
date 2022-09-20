package com.example.studentbackend.controllers;


import com.example.studentbackend.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.studentbackend.models.Student;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class MyController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/students")
    public List<Student> getListOfStudents() {
        return studentRepository.findAll();
    }

    @PostMapping("/student")
    public String addStudent(@RequestBody Student student) {
        boolean studentExists = studentRepository.existsById(student.getId());
        if (!studentExists) {
            studentRepository.save(student);
            return " Record Saved Successfully";
        } else {
            return "Student already exists!!!";
        }
    }

    @DeleteMapping("/student/{id}")
    public String deleteStudent(@PathVariable Integer id) {
        boolean studentExists = studentRepository.existsById(id);
        if (studentExists) {
            studentRepository.deleteById(id);
            return "Record deleted successfully";
        } else {
            return "Record does not exist";
        }
    }
}
