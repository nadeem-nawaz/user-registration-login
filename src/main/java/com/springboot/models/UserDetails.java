package com.springboot.models;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class UserDetails {
	private String username;
	private String emailId;
}
