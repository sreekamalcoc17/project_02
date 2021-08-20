package com.project2.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.project2.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{
	Student findByEmail(String email);

}
