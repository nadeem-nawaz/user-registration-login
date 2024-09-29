package com.springboot.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.models.UserDetails;
import com.springboot.repository.UserDetailsRepository;
import com.springboot.services.UserDetailsService;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserDetailsRepository userDetailsRepo;

	@Override
	public UserDetails saveUserDetails(UserDetails userDetails) {
		return userDetailsRepo.save(userDetails);
	}
}
