package org.example;

import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    // Simple GET
    @GetMapping("/hello")
    public String hello() {
        return "Welcome to Spring REST";
    }

    // Return Bean (JSON)
    @GetMapping("/student")
    public Student getStudent() {
        return new Student(101, "Sesha");
    }

    // GET with Path Variable
    @GetMapping("/student/{id}")
    public String getStudent(@PathVariable int id) {
        return "Student Id : " + id;
    }

    // Return Array
    @GetMapping("/students")
    public Student[] getStudents() {

        Student s1 = new Student(101, "Sesha");
        Student s2 = new Student(102, "Anu");

        return new Student[]{s1, s2};
    }
}