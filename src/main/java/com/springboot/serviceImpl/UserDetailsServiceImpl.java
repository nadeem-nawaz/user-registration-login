package com.springboot.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.springboot.models.UserDetails;
import com.springboot.repository.UserDetailsRepository;
import com.springboot.services.UserDetailsService;

public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserDetailsRepository userDetailsRepo;

	@Override
	public void saveUserDetails(UserDetails userDetails) {
		userDetailsRepo.save(userDetails);
	}
}
