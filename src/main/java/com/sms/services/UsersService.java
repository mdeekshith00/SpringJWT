package com.sms.services;

import java.util.List;

import com.sms.model.Users;

public interface UsersService {
	
	Users register(Users user);
	Users getById(int id);
	List<Users> getAll();

}
