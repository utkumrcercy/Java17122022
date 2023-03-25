package com.mehmetnuri.springmongodbornek2.resource;

import com.mehmetnuri.springmongodbornek2.document.Student;
import com.mehmetnuri.springmongodbornek2.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentResource {

    private final StudentService service;

    public StudentResource(StudentService service) {
        this.service = service;
    }

    @GetMapping(path = "/all")
    public List<Student> findAll() {
        return this.service.getAllStudent();
    }

    @GetMapping(path = "/{id}")
    public Student findById(@PathVariable String id) {
        return this.service.getStudentById(id);
    }

    @GetMapping(path = "/delete/{id}")
    public void deleteById(@PathVariable String id) {
        this.service.deleteStudent(id);
    }

    @PutMapping(path = "/update/{id}")
    public Student updateById(@PathVariable String id, @RequestBody Student student) {
        return this.service.updateStudent(id, student);
    }
}
