package com.endava.backendFrontchallenge.repository;

import com.endava.backendFrontchallenge.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}