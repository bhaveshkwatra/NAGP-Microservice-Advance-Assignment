package com.nagp.assignment.microservice.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nagp.assignment.microservice.user.service.MockDataService;

@SpringBootApplication
public class UserServiceMicroAdvanceApplication {
	
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(UserServiceMicroAdvanceApplication.class, args);
		MockDataService mockData = context.getBean(MockDataService.class);
		// load the data 
		mockData.loadData();
	}

}
