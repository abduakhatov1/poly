package com.example.demo2.service.impl;

import com.example.demo2.entity.Student;
import com.example.demo2.repo.StudentRepository;
import com.example.demo2.service.StudentService;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository ;

    public StudentServiceImpl(com.example.demo2.repo.StudentRepository studentRepository) {
        super();
        this.studentRepository  = studentRepository;
    }

    @Override
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }
    @Override
    public  Student saveStudent (Student student){
        return studentRepository.save(student);
    }
    @Override
    public Student getStudentById(Long id){
        return studentRepository.findById(id).get();
    }
    @Override
    public  Student updateStudent (Student student){
        return studentRepository.save(student);
    }
    @Override
    public void deleteStudentById(Long id){
        studentRepository.deleteById(id);
    }
}
