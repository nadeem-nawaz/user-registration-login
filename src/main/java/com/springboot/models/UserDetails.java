package com.springboot.models;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "userDetails")
@Data
public class UserDetails {
	private Integer id;	
	private String username;
	private String emailId;
}
