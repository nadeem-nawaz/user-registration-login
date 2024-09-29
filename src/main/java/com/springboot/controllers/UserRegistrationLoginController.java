package com.springboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.models.UserDetails;
import com.springboot.services.UserDetailsService;

@RestController
@RequestMapping(value = "/api/userRegistration")
public class UserRegistrationLoginController {
	
	@Autowired
	private UserDetailsService userDetailsService;

	@PostMapping(value = "/save")
	public ResponseEntity<UserDetails> saveUserDetails(@RequestBody UserDetails userDetails) {
		final UserDetails userDetailsResponse = userDetailsService.saveUserDetails(userDetails);
		return ResponseEntity.ok().body(userDetailsResponse);
	}
}
