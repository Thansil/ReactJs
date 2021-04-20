package com.projectbackendh2.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectbackendh2.Service.StudentsService;
import com.projectbackendh2.model.Student;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class StudentController {
	
	@Autowired
	StudentsService studentsService;
	@GetMapping("/students")
	public List<Student> getAllStudent()
	{
			return studentsService.getAllStudent();
	}
	
}
