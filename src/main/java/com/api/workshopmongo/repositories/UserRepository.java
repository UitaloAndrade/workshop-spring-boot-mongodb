package com.api.workshopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.api.workshopmongo.domain.User;

public interface UserRepository extends MongoRepository<User, String> {

}
