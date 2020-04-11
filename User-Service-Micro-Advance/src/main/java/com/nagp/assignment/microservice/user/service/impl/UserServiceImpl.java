package com.nagp.assignment.microservice.user.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nagp.assignment.microservice.user.model.User;
import com.nagp.assignment.microservice.user.repository.UserRepository;
import com.nagp.assignment.microservice.user.service.UserService;
import com.nagp.microservice.assignment.user.exception.InvalidUserReferenceException;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	@Override
	@Transactional(readOnly = true)
	public User getUserDetailById(Long userId) {
		Optional<User> user = userRepo.findById(userId);
		
		if (user.isPresent()) {
			return user.get();
		} 
		
		throw new InvalidUserReferenceException("Invalid User ID");
	}

}
