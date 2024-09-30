package com.springboot.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springboot.models.UserDetails;

@Repository
public interface UserDetailsRepository extends MongoRepository<UserDetails, Integer> {
}
