package com.nagp.assignment.microservice.user.data;

import java.util.HashMap;
import java.util.Map;

import com.nagp.assignment.microservice.user.model.User;

public class MockData {
	
	private static final MockData INSTANCE = new MockData();
	
	private final Map<String, User> userData = new HashMap<>();
	
	private MockData() {
		loadData();
	}
	
	public static MockData getInstance() {
		return INSTANCE;
	}
	
	private void loadData() {
		// User 1
		User user = new User();
		user.setUserId("1");
		user.setName("Bhavesh Kwatra");
		user.setAge(26);
		user.setEmailId("bhavesh.kwatra@nagarro.com");
		
		// insert the user in map
		userData.put(user.getUserId(), user);
		
		// User 2
		
		user = new User();
		user.setUserId("2");
		user.setName("Sahil");
		user.setAge(22);
		user.setEmailId("sahil.test@gmail.com");
		
		// insert the user in map
		userData.put(user.getUserId(), user);
		
		
		// User 3
		
		user = new User();
		user.setUserId("3");
		user.setName("Rishabh");
		user.setAge(24);
		user.setEmailId("rishabh.test@gmail.com");
				
		// insert the user in map
		userData.put(user.getUserId(), user);
		
	}
	
	public User getUserDataByUserId(String userId) {
		return userData.getOrDefault(userId, new User());
	}
}
