package com.app.bookshop.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.bookshop.dao.UserDao;
import com.app.bookshop.dto.AuthRequest;
import com.app.bookshop.dto.AuthResponse;
import com.app.bookshop.dto.SignUpRequest;
import com.app.bookshop.dto.SignUpResponse;
import com.app.bookshop.pojos.User;

public interface UserService
{
	
 SignUpResponse addUser(SignUpRequest user);
 
 User updteUser(User user);
 
 AuthResponse singInUser(AuthRequest request);
 
 User getUserDetails(Long userId);
}
