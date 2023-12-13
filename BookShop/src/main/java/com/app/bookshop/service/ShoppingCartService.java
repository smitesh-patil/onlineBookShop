package com.app.bookshop.service;

import java.util.List;

import com.app.bookshop.dto.ApiResponse;
import com.app.bookshop.dto.CartIteamsDto;
import com.app.bookshop.pojos.Books;

public interface ShoppingCartService {
String addBookToCart(Long cartId,Long userId,int quantity);
List<CartIteamsDto> getCartDetails(Long userId);
public double getTotalCartPrice(Long userId);
public int getTotalCartItems(Long userId);
public String deleteCartContents(Long userId);
}
