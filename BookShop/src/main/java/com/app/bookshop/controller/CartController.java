package com.app.bookshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.bookshop.dto.ApiResponse;
import com.app.bookshop.service.ShoppingCartService;

@RestController
@RequestMapping("/shoppingCart")
public class CartController {
	@Autowired
	public ShoppingCartService cartService;
	
	@PostMapping("/add")
	public String addToCart(@RequestParam Long bookId,@RequestParam Long userId,@RequestParam int quantity)
	{
		return cartService.addBookToCart(bookId, userId,quantity);
	}
	
	@GetMapping("/show_cart")
	public ResponseEntity<?> showCartContents(@RequestParam Long userId) {
		return  ResponseEntity.status(HttpStatus.OK).body(cartService.getCartDetails(userId)
				);
	}
	
	@DeleteMapping("/delete/{userId}")
	public ApiResponse removeFromCart(@PathVariable Long userId)
	{
		return new ApiResponse(cartService.deleteCartContents(userId));
	}
}
