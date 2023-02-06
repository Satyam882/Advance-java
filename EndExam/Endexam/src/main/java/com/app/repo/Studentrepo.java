package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Student;

public interface Studentrepo extends JpaRepository<Student, Long>{
	

}
