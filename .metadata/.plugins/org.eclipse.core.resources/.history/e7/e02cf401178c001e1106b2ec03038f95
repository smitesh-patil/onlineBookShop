package com.app.bookshop.service;

import java.io.File;
import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.app.bookshop.custom_exceptions.ResourceNotFoundException;
import com.app.bookshop.dao.BookDao;
import com.app.bookshop.dto.ApiResponse;
import com.app.bookshop.pojos.Books;

@Transactional
@Service
public class ImageHandelingServiceImpl implements ImageHandelingService {

	@Autowired
	private BookDao bookDao;
	@Value("${upload.location}")
	private String folderLocation;
	
	
	@PostConstruct
	public void init()
	{
		System.out.println("in init "+folderLocation);
		//chk if folder exists
		File folder=new File(folderLocation);
		if(folder.exists())
			System.out.println("folder alrdy exists !");
		else {
			folder.mkdir(); //creates a new folder 
			System.out.println("created a new folder...");
		}
		
	}
	
	
	@Override
	public ApiResponse uploadImage(Long bookId, MultipartFile file) throws IOException {
		
		Books book=bookDao.findById(bookId).
				orElseThrow(() -> new ResourceNotFoundException("Invalid book id !!!!!"));
				//emp : persistent
		//save uploaded file contents in server side folder.
		//create the path to store the file
		String path=folderLocation.concat(file.getOriginalFilename());
		System.out.println("path "+path);
		//FileUtils class : to read byte[] from multpart file ---> server side folder
		//API : public void writeByteArrayToFile(File file, byte[] data) throws IOException
		FileUtils.writeByteArrayToFile(new File(path), file.getBytes());
		//file saved successfully !
		//set image path in db
	book.setImagePath(path);
		return new ApiResponse("File uploaded n stored in server side folder");
	}


	@Override
	public byte[] downloadImage(Long empId) throws IOException {
		Books book=bookDao.findById(empId).orElseThrow(() -> new ResourceNotFoundException("Invalid book id !!!!!"));
		if (book.getImagePath() != null) {
			// img exists , read file contents in to byte[]
			return FileUtils.readFileToByteArray(new File(book.getImagePath()));
		}
		throw new ResourceNotFoundException("Image not yet assigned!!!!");
	}

}
