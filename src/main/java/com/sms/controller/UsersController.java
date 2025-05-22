package com.sms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sms.model.Users;
import com.sms.services.UsersServiceImpl;

@RestController
public class UsersController {
	
	@Autowired
	private UsersServiceImpl userService;
	
	@PostMapping("/register")
	public ResponseEntity<Users> register(@RequestBody Users user) {
		return new ResponseEntity<>(userService.register(user)  , HttpStatus.CREATED);
	}
	
	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody Users user) {
		return new ResponseEntity<>(userService.verify(user) , HttpStatus.CREATED);
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<Users> getById(@PathVariable int id) {
		return new ResponseEntity<>(userService.getById(id)  , HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Users>> getAll(){
		return new ResponseEntity<>(userService.getAll()  , HttpStatus.OK);
	}

}
