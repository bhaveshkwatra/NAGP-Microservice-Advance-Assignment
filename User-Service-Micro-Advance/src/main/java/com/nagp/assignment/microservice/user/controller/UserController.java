package com.nagp.assignment.microservice.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagp.assignment.microservice.user.model.User;
import com.nagp.assignment.microservice.user.service.UserService;

@RestController
@RequestMapping(value="/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/{userid}")
	public User readUserDetails(@PathVariable final String userid) {
		return userService.getUserDetailById(userid);
	}

}
