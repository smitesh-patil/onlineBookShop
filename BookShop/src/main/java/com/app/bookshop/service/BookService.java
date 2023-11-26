package com.app.bookshop.service;

import java.util.List;

import com.app.bookshop.dto.AddBookDetails;
import com.app.bookshop.dto.AddBookResponse;
import com.app.bookshop.dto.FindByImageNull;
import com.app.bookshop.dto.FindByTitle;
import com.app.bookshop.pojos.Books;

public interface BookService 
{
List<Books> getBooks();

AddBookResponse addBook(AddBookDetails book);

String deleteBook(Long bookID);

 FindByTitle findByTitle(String title);
 
 List<Books> findByImageNull();
}
