package com.example.student.repository;

import com.example.student.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}


//This interface extends JpaRepository, which provides built-in methods like findAll(), findById(), save(), and delete().