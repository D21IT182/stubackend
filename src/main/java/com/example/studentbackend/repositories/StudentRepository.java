package com.example.studentbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.studentbackend.models.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
