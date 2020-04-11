package com.nagp.assignment.microservice.user.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nagp.assignment.microservice.user.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
