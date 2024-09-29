package com.springboot.services;

import com.springboot.models.UserDetails;

public interface UserDetailsService {
	public UserDetails saveUserDetails(UserDetails userDetails);
}
