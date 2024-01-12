package com.example.demo.SpringApplication.services;



import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

import com.example.demo.SpringApplication.entities.Users;

public interface UsersService {

	public String addUser(Users user);
	public boolean emailExists(String email);
	public boolean validateUser(String email,String password);
	public String getRole(String email);
	
    public Users getUser(String email);
 
	public void updateUser(Users user);
	

	
	
}
