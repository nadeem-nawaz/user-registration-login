package com.springboot.services;

import com.springboot.models.UserDetails;

public interface UserDetailsService {
	public void saveUserDetails(UserDetails userDetails);
}
