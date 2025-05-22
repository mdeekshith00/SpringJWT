package com.sms.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.model.Users;

public interface UsersRepositary extends JpaRepository<Users, Integer>{
	
	Users findByName(String name);

}
