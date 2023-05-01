package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

// 1
@RestController
public class StudentController {
	
	// 2
	@Autowired
	private StudentRepository StRepo;
	//3
	// create method for add student
	//public (Entity class name) addStudent((entity class name) (object name)) 
	// add student
	@PostMapping("/addstudent")
	public Student addStudent(@RequestBody Student st) {
		return StRepo.save(st);
	}
	
	// add multiple student
	@PostMapping("/saveallstudent")
	public List<Student> addMultipleStudent(@RequestBody List<Student> st){
		return StRepo.saveAll(st);
	}
	
	//find all student
	
	//find student using id
	
	//update student
	
	//delete student
	
	

}
