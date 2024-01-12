package com.example.demo.SpringApplication.repositories;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.SpringApplication.entities.Users;

public interface UsersRepository extends JpaRepository<Users, Integer>{
	public Users findByEmail(String email);

	public void save(User user);

}
