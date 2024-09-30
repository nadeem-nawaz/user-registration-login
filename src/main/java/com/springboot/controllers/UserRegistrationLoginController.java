package com.springboot.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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

	@GetMapping(value = "/fetchAllUsers")
	public ResponseEntity<List<UserDetails>> getAllUsers() {
		List<UserDetails> userDetailList = userDetailsService.getAllUsers();
		return ResponseEntity.ok().body(userDetailList);
	}

	@GetMapping(value = "/getUsersById/{id}")
	public ResponseEntity<Optional<UserDetails>> agetUsersById(@PathVariable("id") Integer id) {
		final Optional<UserDetails> userDetailResponse = userDetailsService.getUserById(id);
		return ResponseEntity.ok().body(userDetailResponse);
	}
}
