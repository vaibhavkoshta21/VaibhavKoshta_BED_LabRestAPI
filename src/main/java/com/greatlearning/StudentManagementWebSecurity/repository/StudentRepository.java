package com.greatlearning.StudentManagementWebSecurity.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.StudentManagementWebSecurity.entity.Student;


public interface StudentRepository extends JpaRepository<Student, Integer> {

}
