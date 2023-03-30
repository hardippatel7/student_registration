package com.assignment2.repository;

import com.assignment2.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    public Student findByUsername(String username);

}
