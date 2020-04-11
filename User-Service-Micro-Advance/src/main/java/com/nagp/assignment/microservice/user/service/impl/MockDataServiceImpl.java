package com.nagp.assignment.microservice.user.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nagp.assignment.microservice.user.model.User;
import com.nagp.assignment.microservice.user.repository.UserRepository;
import com.nagp.assignment.microservice.user.service.MockDataService;

@Service
public class MockDataServiceImpl implements MockDataService {
	
	@Autowired
	private UserRepository userRepo;
	

	@Override
	@Transactional
	public void loadData() {
		// User 1
		User user = new User();
		user.setName("Bhavesh Kwatra");
		user.setAge(26);
		user.setEmailId("bhavesh.kwatra@nagarro.com");
		
		//save user 1
		userRepo.save(user);
		
		// User 2
		user = new User();
		user.setName("Sahil");
		user.setAge(22);
		user.setEmailId("sahil.test@gmail.com");
		
		// save user 2
		userRepo.save(user);
		
		
		// User 3
		user = new User();
		user.setName("Rishabh");
		user.setAge(24);
		user.setEmailId("rishabh.test@gmail.com");

		//save user 3
		userRepo.save(user);
		
	}
	
}
