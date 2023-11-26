package com.app.bookshop.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.bookshop.custom_exceptions.ResourceNotFoundException;
import com.app.bookshop.dao.BookDao;
import com.app.bookshop.dao.CartIteamDao;
import com.app.bookshop.dao.ShoppingCartDao;
import com.app.bookshop.dao.UserDao;
import com.app.bookshop.dto.CartIteamsDto;
import com.app.bookshop.pojos.Books;
import com.app.bookshop.pojos.CartIteam;
import com.app.bookshop.pojos.ShoppingCart;
import com.app.bookshop.pojos.User;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ShoppingCartServiceImpl implements ShoppingCartService {

	@Autowired
	CartIteamDao cartIteamDao;
	@Autowired
	BookDao booksDao;
	@Autowired
	UserDao userDao;
	@Autowired
	ShoppingCartDao shoppingDao;
	@Autowired
	UserService userService;
	@Autowired
	ModelMapper mapper;
	@Override
	public String addBookToCart(Long bookId, Long userId) {
		// TODO Auto-generated method stub
		User user=userService.getUserDetails(userId);
		if(user.getMyCart()==null)
		{
			ShoppingCart newCart=new ShoppingCart();
			user.addCart(newCart);
		}
		
		ShoppingCart cart=shoppingDao.findByCartOwnerId(userId)
				.orElseThrow(() -> new ResourceNotFoundException("Invalid User ID !!!!!"));
		
		Books book=booksDao.findById(bookId)
				.orElseThrow(() -> new ResourceNotFoundException("Invalid book ID !!!!!"));
		
		CartIteam newIteam=new CartIteam(cart,book);
		System.out.println(cart.getCartItems().contains(book.getId()));
		System.out.println(cart.getCartOwner().getId()==userId);
		
		CartIteam persCart=cartIteamDao.save(newIteam);
		return "book added in the BookingCart successfully";
	}
	@Override
	public List<CartIteamsDto> getCartDetails(Long userId) {
		// TODO Auto-generated method stub
		User user=userService.getUserDetails(userId);
		ShoppingCart cart=shoppingDao.findByCartOwnerId(userId)
				.orElseThrow(() -> new ResourceNotFoundException("Invalid User ID !!!!!"));
		List<CartIteam> per= cartIteamDao.findByMyCartId(cart.getId());
		List<Books> b=new ArrayList<Books>();
		for(CartIteam c:per)
		{
			Books n=new Books(c.getBooks().getTitle(),
					c.getBooks().getAuthor(),
					c.getBooks().getCategory(),
					c.getBooks().getLanguage(),
					c.getBooks().getPublishDate(),
					c.getBooks().getPrice(),
					c.getBooks().getDescription(),
					c.getBooks().getQty()
					);
			b.add(n);
		}
		CartIteamsDto nc;
		List<CartIteamsDto> cdto=new ArrayList<CartIteamsDto>();
		for(Books bb:b)
		{
		nc=new CartIteamsDto(  //bb.getId(),
				bb.getTitle(),
		bb.getAuthor(),
		bb.getCategory(),
        bb.getLanguage(),
	    bb.getPublishDate(),
	    bb.getPrice(),
		bb.getDescription(),
	    bb.getQty()
	    );
		cdto.add(nc);
		}
		
		return cdto ;
	}

}
