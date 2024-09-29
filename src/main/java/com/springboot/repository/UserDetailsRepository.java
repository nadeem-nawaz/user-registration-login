package com.springboot.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.springboot.models.UserDetails;

@Repository
public interface UserDetailsRepository extends MongoRepository<UserDetails, Integer> {
	@Query("{'_id' : ?0}")
	public UserDetails findByUserId(Integer id);
}
