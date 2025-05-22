package com.sms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.sms.exception.StudentNotFound;
import com.sms.model.Users;
import com.sms.repositary.UsersRepositary;

@Service
public class UsersServiceImpl implements UserDetailsService  , UsersService{
	
	@Autowired
	private UsersRepositary userRepositary;
	@Autowired
	private JWTService jservice;
	@Autowired
	AuthenticationManager authManager;
	
	private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return userRepositary.findByName(username);
	}

	@Override
	public Users register(Users user) {
		// TODO Auto-generated method stub
		user.setPassword(encoder.encode(user.getPassword()));
		return userRepositary.save(user);
	}

	@Override
	public Users getById(int id) {
		// TODO Auto-generated method stub
		Users  u=  userRepositary.findById(id).orElseThrow(() -> new StudentNotFound("Student details not Found on this " + id));
	    return u;
	}

	@Override
	public List<Users> getAll() {
		// TODO Auto-generated method stub
		return userRepositary.findAll();
	}

	public String verify(Users user) {
		// TODO Auto-generated method stub
		Authentication authentication  = 
				authManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));
		if(authentication.isAuthenticated())

		return jservice.generateToken(user.getUsername());
		
		return "fail";
	}

}
