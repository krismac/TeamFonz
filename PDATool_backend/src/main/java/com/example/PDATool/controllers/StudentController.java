package com.example.PDATool.controllers;

import com.example.PDATool.models.Student;
import com.example.PDATool.repository.students.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

//    @PutMapping(value="/")

    public List<Student> getAllStudents(){
        
        return studentRepository.findAll();
    }
}
