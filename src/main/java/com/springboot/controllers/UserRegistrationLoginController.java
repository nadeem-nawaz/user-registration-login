package com.springboot.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRegistrationLoginController {
	@PostMapping
	public ResponseEntity<String> saveUserDetails(@PathVariable String username, @PathVariable String emailId) {
		
		return ResponseEntity.ok().body("done");
	}
}
