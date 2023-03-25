package com.mehmetnuri.springmongodbornek1.controller;

import com.mehmetnuri.springmongodbornek1.document.Student;
import com.mehmetnuri.springmongodbornek1.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping(path = "/all")
    public List<Student> findAll() {
        return  this.studentRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Student findStudentById(@PathVariable String id) {
        return this.studentRepository.findById(id).orElse(null);
    }

    @DeleteMapping(path = "/delete/{id}")
    public void deleteStudentById(@PathVariable String id) {
        this.studentRepository.deleteById(id);
    }

    @PutMapping(path = "/update/{id}")
    public Student updateStudentById(@PathVariable String id, @RequestBody Student student) {
        Student studentToUpdate = this.studentRepository.findById(id).orElse(null);

        if (studentToUpdate != null) {
            studentToUpdate.setName(student.getName());
            studentToUpdate.setSurname(student.getSurname());
            return this.studentRepository.save(studentToUpdate);
        }
        return null;
    }

    @PostMapping(path = "/add")
    public Student addStudent(@RequestBody  Student student) {
        return this.studentRepository.save(student);
    }

}
