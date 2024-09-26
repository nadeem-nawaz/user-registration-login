package com.springboot.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.springboot.models.UserDetails;

public interface UserDetailsRepository extends MongoRepository<UserDetails, String> {
}
