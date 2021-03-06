package com.cg.marketplace.controller;

import java.util.Enumeration;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cg.marketplace.dto.CreateStudentRequest;
import com.cg.marketplace.dto.StudentDetails;
import com.cg.marketplace.dto.UserDetails;
import com.cg.marketplace.entities.Course;
import com.cg.marketplace.entities.Student;
import com.cg.marketplace.exception.NotLoggedInException;
import com.cg.marketplace.service.IStudentService;
import com.cg.marketplace.util.MarketPlaceUtil;

@RestController
@RequestMapping("/students")
@Validated // this is for validating data of the entity
public class MarketPlaceController {
	@Autowired
	private IStudentService service;

	@Autowired
	private MarketPlaceUtil studentUtil;
	@GetMapping("/by/name/{name}")
	public List<StudentDetails> fetchStudentByName(@PathVariable("name") String name,HttpServletRequest request) {
		System.out.println("cntrlr fetch name: " + name);
		List<Student> students = service.findByName(name);
		List<StudentDetails> response = studentUtil.toDetails(students);
		System.out.println("by name details: " + response);
		return response;
	}
	
	@GetMapping("/by/name/{fname}/{lname}")
	public List<StudentDetails> fetchStudentByFullName(@PathVariable("fname") String fname,
			@PathVariable("lname") String lname,HttpServletRequest request) {
		System.out.println("cntrlr fetch name: " + fname + " " + lname);
		// List<Student> students = service.findByFullName(fname,lname);
		List<Student> students = service.findByFirstNameAndLastName(fname, lname);
		List<StudentDetails> response = studentUtil.toDetails(students);
		System.out.println("by name details: " + response);
		return response;
	}

	@GetMapping("/by/id/{id}")
	public StudentDetails fetchStudent(@PathVariable("id") Integer id,HttpServletRequest request) {
		System.out.println("cntrlr fetch id: " + id);
		Student student = service.findById(id);
		// new Student(1234, "Ashok", "Gupta", 23);
		StudentDetails details = studentUtil.toDetails(student);
		System.out.println("details: " + details);
		return details;
	}
	@GetMapping("/students")
	public List<StudentDetails> fetchAll(HttpServletRequest request) {
		String userName = (String) request.getSession().getAttribute("user");
		System.out.println(userName);
		if(userName==null) {
			throw new NotLoggedInException("You have not logged in");
		}
		List<Student> students = service.findAll();
		// System.out.println(students);
		List<StudentDetails> response = studentUtil.toDetails(students);
		return response;
	}
	

	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("/add")
	public StudentDetails add(@RequestBody @Valid CreateStudentRequest requestData) {
		System.out.println("req data: " + requestData);
		Student student = new Student(requestData.getFirstName(), requestData.getLastName(), requestData.getAge());
		Set<Course> coursSet = requestData.getCourses();
		if (coursSet != null) {
			for (Course course : coursSet) {
				student.addCourse(course);
			}
		}
		System.out.println("stud came: " + student);
		student = service.register(student);
		StudentDetails details = studentUtil.toDetails(student);
		return details;
	}
	
	@ResponseStatus(HttpStatus.ACCEPTED)
	@PostMapping("/login")
	public String login(@RequestBody UserDetails userDetails, HttpServletRequest request) {
		HttpSession session = request.getSession();
		System.out.println(session);
		String role = service.login(userDetails);
		session.setAttribute("user", userDetails.getUsername());
		session.setAttribute("role", userDetails.getUserRole());
		return "You have successfully logged in as : "+role;
	}
	@ResponseStatus(HttpStatus.ACCEPTED)
	@PostMapping("/logout")
	public String logout(@RequestBody UserDetails userDetails, HttpServletRequest request) {
		HttpSession session = request.getSession();
		System.out.println(session);
		Enumeration<String> attrNames = session.getAttributeNames();
		while (attrNames.hasMoreElements()) {
			String name = (String) attrNames.nextElement();
			System.out.println(name);
			String uName = (String) session.getAttribute(name);
			System.out.println(uName);
			if(uName.equals(userDetails.getUsername())) {
				System.out.println("invalidating session..."+uName);
				session.invalidate();
			}
		}
		return "You have successfully logged out "+userDetails.getUsername();
	}

}



