package com.nagp.assignment.microservice.user.service.impl;

import org.springframework.stereotype.Service;

import com.nagp.assignment.microservice.user.data.MockData;
import com.nagp.assignment.microservice.user.model.User;
import com.nagp.assignment.microservice.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Override
	public User getUserDetailById(String userId) {
		return MockData.getInstance().getUserDataByUserId(userId);
	}

}
