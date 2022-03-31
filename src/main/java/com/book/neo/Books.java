package com.book.neo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "books")
public class Books{

	@Id
	private String id;
	private String bookname;
	private String author;
	private double price;
	private String category;
	private int rating ;
	private int quantity;
	private String publisher;
	private String isbn;
	private String language;
	
}
