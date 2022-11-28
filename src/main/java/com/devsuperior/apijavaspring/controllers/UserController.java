package com.devsuperior.apijavaspring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.apijavaspring.entities.User;
import com.devsuperior.apijavaspring.repositories.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	@Autowired
	private UserRepository repository;

	@GetMapping
	public List<User> getAllUsers() {
		List<User> result = repository.findAll();
		return result;
	}

	@GetMapping(value = "/{id}")
	public User getUser(@PathVariable Long id) {
		User result = repository.findById(id).get();
		return result;
	}

	@PostMapping
	public User insertUser(@RequestBody User user) {
		User result = repository.save(user);
		return result;
	}

	@DeleteMapping(value = "/user")	
	public void deleteUser(@RequestBody User user){
		repository.delete(user);
	}
	
	@PutMapping(value = "/user")
	public User editUser(@RequestBody User user){
		User result = repository.save(user);
		return result;
	}
	
}
