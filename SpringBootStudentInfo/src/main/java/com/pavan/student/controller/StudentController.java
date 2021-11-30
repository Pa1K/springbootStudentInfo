package com.pavan.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pavan.student.model.Student;
import com.pavan.student.repo.StudentRepository;

@RestController
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@PostMapping("/students")
	public String addStudent(@RequestBody Student student ) {
        
		
		Student stu = studentRepository.save(student);
		return "student "+stu.getName()+" added successfully";
	}
	
	@GetMapping
	public List<Student> getAllStudentInfo(){
		return null;
	}
	

	@GetMapping("/{id}")
	public Student getStudentInfo(@PathVariable int id){
		return null;
	}
	

}
