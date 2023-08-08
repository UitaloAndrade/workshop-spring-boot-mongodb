package com.api.workshopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.api.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String> {

}
