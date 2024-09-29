package com.springboot.models;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

import lombok.Data;

@Document(collection = "userDetails")
@Data
public class UserDetails {

	@Id
	private Integer Id;
	
	private String username;
	private String emailId;
}
