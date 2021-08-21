package com.project2.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "Course_Table")
public class Course {
	private String courses;
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private int courseId;
	
	@ManyToOne
	@JoinColumn(name = "stuId")
	private Student student;
	
	@OneToOne
	@JoinColumn(name = "teacherId")
	private Teacher teacher;
}





