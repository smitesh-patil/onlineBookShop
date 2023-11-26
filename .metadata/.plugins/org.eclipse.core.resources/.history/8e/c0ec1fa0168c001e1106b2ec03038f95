package com.app.bookshop.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.app.bookshop.dto.AddBookDetails;
import com.app.bookshop.dto.ApiResponse;
import com.app.bookshop.dto.FindByImageNull;
import com.app.bookshop.pojos.Books;
import com.app.bookshop.service.BookService;
import com.app.bookshop.service.ImageHandelingService;

@RestController
@RequestMapping("/admin")
@CrossOrigin(origins = "http://localhost:3000")
public class AdminBookController 
{
	
	@Autowired
	private BookService bookService;
	
	@Autowired
	private ImageHandelingService imageService;

	public AdminBookController() {
		System.out.println("inside admin book controller");
	}

	@PostMapping("/addbook")
	public ResponseEntity<?> addBook(@RequestBody AddBookDetails requestDto)
	{
		System.out.println("in the add book control"+requestDto);
		return ResponseEntity.status(HttpStatus.OK).body(bookService.addBook(requestDto));
	}
	
	@DeleteMapping("/deletebook/{bookId}")
	public ApiResponse deleteBook(@PathVariable Long bookId)
	{
		System.out.println("inside delete book ctrl");
		return new ApiResponse(bookService.deleteBook(bookId));
	}
	 
	
	@PostMapping(value="/uploadimage/{bookId}",consumes = "multipart/form-data")
	public ResponseEntity<?> uploadEmpImage(@PathVariable Long bookId,@RequestParam MultipartFile imageFile) throws IOException
	{
		System.out.println("in img upload "+bookId);
		//invoke image service method
		return ResponseEntity.status(HttpStatus.OK).body(imageService.uploadImage(bookId, imageFile));
	}
	
	@GetMapping("/nullimages")
	public List<Books> findByImageNull()
	{
		System.out.println("inside findby image null");
		List<Books> book=bookService.findByImageNull();
		return (List<Books>) book;
	}

}
