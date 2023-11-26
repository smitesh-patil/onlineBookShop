package com.app.bookshop.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class FindByTitle {
	private String author;
	private String category;

	private String description;

	private String language;

	private double price;

	private LocalDate publishDate;
	
	private int qty;
	
	private String title;
	
	private String imagePath;
}
