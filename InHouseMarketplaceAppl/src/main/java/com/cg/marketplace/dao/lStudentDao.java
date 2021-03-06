package com.cg.marketplace.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cg.marketplace.entities.Student;

public interface lStudentDao extends JpaRepository<Student, Integer>{
	List<Student> findByFirstName(String name);
	List<Student> findByLastName(String name);
	@Query("from Student where firstName=:fname and lastName=:lname")
    List<Student>findByFullName(@Param("fname") String firstName, @Param("lname") String lastName);
    List<Student>findByFirstNameAndLastName( @Param("firstName") String firstName, @Param("lastName") String lastName);
	
}

