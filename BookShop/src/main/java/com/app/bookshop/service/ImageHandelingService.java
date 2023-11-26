package com.app.bookshop.service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;
import com.app.bookshop.dto.ApiResponse;

public interface ImageHandelingService {
	ApiResponse uploadImage(Long bookId,MultipartFile file) throws IOException;
	
	byte[] downloadImage(Long bookId) throws IOException;
}
