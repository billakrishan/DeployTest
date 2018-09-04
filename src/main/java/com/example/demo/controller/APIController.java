package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
public class APIController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping(value="/student/{id}")
	public Student getById(@PathVariable int id) {
		return this.studentService.findById(id);
	}
	
	@PostMapping(value="/student")
	public Student save(@RequestBody Student s) {
		return this.studentService.save(s);
	}
}
