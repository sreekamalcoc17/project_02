package com.project2.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project2.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{
	Student findByEmail(String email);
	List<Student> findAllByCourse(String course);
}
