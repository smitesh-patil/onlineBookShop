package com.app.bookshop.service;

import java.util.List;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.bookshop.custom_exceptions.ResourceNotFoundException;
import com.app.bookshop.dao.BookDao;
import com.app.bookshop.dto.AddBookDetails;
import com.app.bookshop.dto.AddBookResponse;
import com.app.bookshop.dto.FindByImageNull;
import com.app.bookshop.dto.FindByTitle;

import com.app.bookshop.pojos.Books;
@Service
@Transactional
public class BookServiceImpl implements BookService {
@Autowired
private BookDao bookDao;

@Autowired
private ModelMapper mapper;

	@Override
	public AddBookResponse addBook(AddBookDetails book) {
		System.out.println("book"+book);
		Books persistentBook=bookDao.save(mapper.map(book,Books.class));
		return mapper.map(persistentBook, AddBookResponse.class);
	}
	@Override
	public List<Books> getBooks() {
		return bookDao.findAll();
	}
	@Override
	public String deleteBook(Long bookID) {
		Books foundBook=bookDao.findById(bookID)
				.orElseThrow(()->new ResourceNotFoundException("invalid book id"));
		bookDao.deleteById(bookID);
		return "deleted book successfully!!";
	}
	@Override
	public FindByTitle findByTitle(String title) {
		Books book=bookDao.findByTitle(title)
				.orElseThrow(()->new ResourceNotFoundException("there is no such book"));
		return mapper.map(book, FindByTitle.class);
	}
	@Override
	public List<Books> findByImageNull() {
		List<Books> book=bookDao.findByImagePathIsNull();
		return bookDao.findByImagePathIsNull();
	}

}
