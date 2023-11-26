package com.app.bookshop.dto;

import com.app.bookshop.pojos.Role;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SignUpResponse 
{
	private String firstName;
	private String lastName;
	private String email;
	private Role role;
}
