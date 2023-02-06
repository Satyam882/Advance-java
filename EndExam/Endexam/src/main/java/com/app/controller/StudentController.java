package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Student;
import com.app.services.StudentService;

@RestController
@RequestMapping("/Student")
public class StudentController {
	@Autowired
	private StudentService stu;
	public StudentController() {
		System.out.println("In student Controller");
	}
	@GetMapping
	public List<Student> getStudents(){
		return stu.getStudentsDetails();
	}

}
