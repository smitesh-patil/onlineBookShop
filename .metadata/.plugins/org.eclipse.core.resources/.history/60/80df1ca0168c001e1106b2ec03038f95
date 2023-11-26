package com.app.bookshop.controller;

import java.io.IOException;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.app.bookshop.dto.FindByTitle;

import com.app.bookshop.pojos.Books;
import com.app.bookshop.service.BookService;
import com.app.bookshop.service.ImageHandelingService;
import static org.springframework.http.MediaType.*;

@RestController
@RequestMapping("/books")
@CrossOrigin(origins = "http://localhost:3000")
public class BooksController {

	@Autowired
	private BookService bookService;
	
	@Autowired
	private ImageHandelingService imageService;

	public BooksController() {
		System.out.println("inside the book controler");
	}
	
	@GetMapping
	public List<Books> getBooks()
	{
		System.out.println("in list books");
	    return bookService.getBooks();
	}
	
	@GetMapping("/title")
	public ResponseEntity<?> findByTitle(@RequestParam String title)
	{
		System.out.println("title"+title);
		FindByTitle book=bookService.findByTitle(title);
		return ResponseEntity.ok(book);
	}
	
	@GetMapping(value = "/{bookId}",produces = {IMAGE_GIF_VALUE,IMAGE_JPEG_VALUE,IMAGE_PNG_VALUE})
	public ResponseEntity<?> downloadEmpImage(@PathVariable Long bookId) throws IOException {
		System.out.println("in img download " + bookId);
		return ResponseEntity.ok(imageService.downloadImage(bookId));
	}
	
	
}
