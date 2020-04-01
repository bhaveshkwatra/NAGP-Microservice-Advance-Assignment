package com.nagp.assignment.microservice.user.service;

import com.nagp.assignment.microservice.user.model.User;

public interface UserService {
	
	User getUserDetailById(String userId);
}
