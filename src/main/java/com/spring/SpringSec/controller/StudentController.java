package com.spring.SpringSec.controller;

import com.spring.SpringSec.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    List<Student> students = new ArrayList<Student>(List.of(
            new Student(1, "Sath", 92),
            new Student(2, "OK", 28)
    ));

    @GetMapping("/students")
    public List<Student> getStudents(){
        return students;
    }

    @PostMapping("/students")
    public Student postStudent(@RequestBody Student student){
        students.add(student);
        return student;
    }
}
