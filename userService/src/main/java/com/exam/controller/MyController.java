package com.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.ValueObject.ResponseTemplateVO;
import com.exam.entity.User;
import com.exam.service.UserService;

@RestController
@RequestMapping("/users")
public class MyController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/")
	public User saveUser(@RequestBody User user) {
		return userService.saveUser(user);
		
	}
	@GetMapping("/{id}")
	public ResponseTemplateVO getUserWithToDo(@PathVariable("id") Long userId) {
		return userService.getUserWithToDo(userId, null);
	}
	
	@DeleteMapping("/{id}")
	public void deleteUserById(@PathVariable ("id") Long userId) {
		userService.deleteUserById(userId);
	}
	@PutMapping("/edit")
	public void editUser(@RequestBody User user) {
		userService.saveUser(user);
	}
	
}
