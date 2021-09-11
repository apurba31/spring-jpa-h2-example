package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.UserModel;
import com.example.demo.repository.UserRepository;

@RestController()
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserRepository userRepo;
	
	@GetMapping("/users")
	public List<UserModel> getUsers()
	{
		return userRepo.findAll();
	}
	
	@GetMapping("/users/{id}")
	public UserModel get(@PathVariable("id") long id) {
		return userRepo.getOne(id);
	} 
	
	@PostMapping()
	@ResponseStatus(HttpStatus.OK)
	public UserModel user(@RequestBody UserModel user)
	{
		return userRepo.save(user);
	}
	
	@DeleteMapping()
	public @ResponseBody ResponseEntity<String> delete()
	{
		return new ResponseEntity<>("Delete Response", HttpStatus.OK);
	}

}
