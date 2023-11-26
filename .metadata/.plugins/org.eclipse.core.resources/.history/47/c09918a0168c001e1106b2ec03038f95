package com.app.bookshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.bookshop.dto.AuthRequest;
import com.app.bookshop.dto.AuthResponse;
import com.app.bookshop.dto.SignUpRequest;
import com.app.bookshop.pojos.User;
import com.app.bookshop.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:3000")
public class USerController {

	@Autowired
	private UserService userService;

	public USerController() {
		System.out.println("inside the user controller");
	}
	
	@PostMapping("/signup")
	public ResponseEntity<?> addUser(@RequestBody SignUpRequest request)
	{
		System.out.println("in add new user " + request);
		return ResponseEntity.
				status(HttpStatus.CREATED).
				body(userService.addUser(request));
		
	}
	
	@PutMapping("/update")
	public User updateUSer(@RequestBody User user )
	{
		System.out.println("in update user " + user.getId());
		return userService.updteUser(user);
	}
	
	@PostMapping("/signin")
	public ResponseEntity<?> singInEmployee(@RequestBody AuthRequest request)
	{
		System.out.println("auth req " + request);
	    AuthResponse resp=userService.singInUser(request);
	    return ResponseEntity.ok(resp);
	}
	
	@GetMapping("/{userId}")
	public User getUserDetails(@PathVariable Long userId) {
		System.out.println("in get emp details " + userId);
		return userService.getUserDetails(userId);
	}
	
}
