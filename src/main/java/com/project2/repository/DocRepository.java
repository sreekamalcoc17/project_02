package com.project2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project2.entity.Doc;



public interface DocRepository  extends JpaRepository<Doc,Integer>{

}