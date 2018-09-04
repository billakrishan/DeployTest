package com.example.demo.service;

import com.example.demo.entity.Student;

public interface StudentServiceInterface {

	Student findById(int id);

	Student save(Student s);

}
