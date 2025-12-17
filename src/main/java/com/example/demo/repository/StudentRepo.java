package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.sterotype.Respository;

import com.example.demo.entity.Student;
@Respository
public interface StudentRepo extends JpaRepository<Student,Long>{
    
}