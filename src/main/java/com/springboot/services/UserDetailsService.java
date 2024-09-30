package com.springboot.services;

import java.util.List;
import java.util.Optional;

import com.springboot.models.UserDetails;

public interface UserDetailsService {
	public UserDetails saveUserDetails(UserDetails userDetails);
	public List<UserDetails> getAllUsers();
	public Optional<UserDetails> getUserById(Integer id);
}
