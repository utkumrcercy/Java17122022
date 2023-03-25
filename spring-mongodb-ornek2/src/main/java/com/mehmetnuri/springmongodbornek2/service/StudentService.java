package com.mehmetnuri.springmongodbornek2.service;

import com.mehmetnuri.springmongodbornek2.document.Student;
import com.mehmetnuri.springmongodbornek2.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    public Student getStudentById(String id) {
        return studentRepository.findById(id).orElse(null);
    }

    public void deleteStudent(String id) {
        studentRepository.deleteById(id);
    }

    public Student updateStudent(String id, Student student) {
        Student student1 = studentRepository.findById(id).orElse(null);
        if (student1 != null) {
            student1.setName(student.getName());
            student1.setLastName(student.getLastName());
            return studentRepository.save(student1);
        } else {
            return null;
        }
    }
}
