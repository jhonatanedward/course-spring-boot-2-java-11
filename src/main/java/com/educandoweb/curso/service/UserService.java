package com.educandoweb.curso.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.curso.entities.User;
import com.educandoweb.curso.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return this.repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> opUser = repository.findById(id);
		return opUser.get();
	}
}
