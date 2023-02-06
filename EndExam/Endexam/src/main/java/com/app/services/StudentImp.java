package com.app.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.pojos.Student;
import com.app.repo.Studentrepo;

@Service
@Transactional
public class StudentImp implements StudentService{
	@Autowired
	private Studentrepo stu;

	@Override
	public List<Student> getStudentsDetails() {
		// TODO Auto-generated method stub
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		return stu.findAll();
	}
	

}
