package com.app.bookshop.dto;

import java.time.LocalDate;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CartIteamsDto {
//public Long id;
	private String title;
	private String author;
	private String category;	
	private String language;	
	private LocalDate publishDate;
	private double price;
	private String description;
	private int qty;

}
