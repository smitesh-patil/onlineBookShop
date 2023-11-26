package com.app.bookshop.dto;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class FindByImageNull 
{
	private Long id;
	private String author;
	private String category;
	private String title;
	private double price;
}
