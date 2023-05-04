package me.ledovec.studentattendance.controllers;

import me.ledovec.studentattendance.entities.Student;
import me.ledovec.studentattendance.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping
    public Student getStudent(@RequestParam long id) {
        return studentRepository.findById(id).orElse(null);
    }

}
