package com.sms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sms.model.Student;
import com.sms.services.Studentservice;
import com.sms.services.Studentserviceimp;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private Studentserviceimp service;
	
	@PostMapping("/add")
	public ResponseEntity<String> saveStudent(@RequestBody Student s) {
		service.saveStudent(s);
		return new ResponseEntity<>("inserted", HttpStatus.CREATED);
	}
	@GetMapping
	public ResponseEntity<List<Student>> getallstudents() {
		return new ResponseEntity<>(service.getallstudents(), HttpStatus.OK);
		
	}@GetMapping("/{sid}")
	public ResponseEntity<Student> getStudentbyId(@PathVariable int sid) {
		Student sr1 = service.getStudentbyId(sid);
		return new ResponseEntity<>(sr1, HttpStatus.OK);
	}
	@PutMapping("/update/{sid}")
	public ResponseEntity<String> updateStudent(@RequestBody Student s,@PathVariable int sid) {
		service.updateStudent(s, sid);
		return new ResponseEntity<>("updated", HttpStatus.OK);
	}
	@DeleteMapping("/deleted/{sid}")
	public ResponseEntity<String> deleteStudent(@PathVariable int sid) {	
		service.deleteStudent(sid);
		return new ResponseEntity<>("deleted", HttpStatus.OK);
	}
    @GetMapping("/csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request) {
    	 return (CsrfToken) request.getAttribute("_csrf");
    }

}
