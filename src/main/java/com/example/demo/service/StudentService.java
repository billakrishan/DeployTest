package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService implements StudentServiceInterface{

	@Autowired
	private StudentRepository studentRepo;
	
	@Override
	public Student findById(int id) {
		return this.studentRepo.findById(id).get();
	}
	
	@Override
	public Student save(Student s) {
		return this.studentRepo.save(s);
	}
	
	
}
