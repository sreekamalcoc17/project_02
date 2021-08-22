package com.project2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project2.entity.Course;

public interface CourseRepository extends JpaRepository<Course,Integer>{

}
