package com.example.demo.service;
import java.util.List;

import java.util.Optimal;
import com.example.demo.entity.Student;

public interface StudentService{
    Student insertStudent(Student st);
    List<Student> getAllStudents();
    Optimal<Student> getOneStudent(Long id);
    void deleteStudent(Long id);
}