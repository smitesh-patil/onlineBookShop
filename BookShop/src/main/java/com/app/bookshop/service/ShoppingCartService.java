package com.app.bookshop.service;

import java.util.List;

import com.app.bookshop.dto.CartIteamsDto;
import com.app.bookshop.pojos.Books;

public interface ShoppingCartService {
String addBookToCart(Long cartId,Long userId);
List<CartIteamsDto> getCartDetails(Long userId);
}
