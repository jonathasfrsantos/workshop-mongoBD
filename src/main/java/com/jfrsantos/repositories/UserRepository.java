package com.jfrsantos.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.jfrsantos.domain.User;

public interface UserRepository extends MongoRepository<User, String>{

	

}
