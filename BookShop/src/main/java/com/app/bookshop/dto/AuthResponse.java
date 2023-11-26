package com.app.bookshop.dto;

import com.app.bookshop.pojos.Role;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AuthResponse {
	private Long id;
	private String firstName;
	private String lastName;
	private Role role;
}
