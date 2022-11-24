package com.example.demo2.service;

import com.example.demo2.entity.Student;

import java.util.List;

public interface StudentService{
    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentById(Long id);

    Student updateStudent (Student Student);

    void  deleteStudentById (Long id);
}
