package com.book.neo.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.book.neo.model.BookResponse;
import com.book.neo.model.Books;
import com.book.neo.service.BookService;

@RestController
@RequestMapping("/api/v1/bookstore")
public class BookController {
	
	private BookService bookService;

	public BookController(BookService bookService) {
		super();
		this.bookService = bookService;
	}
	
	@GetMapping("/books")
	public ResponseEntity<BookResponse> getAllBookDetails(){
		BookResponse books = bookService.getAllBookDetails();
		return ResponseEntity.ok(books);
	}
	
	@GetMapping("/{bookname}")
	public ResponseEntity<Books> getBookData(@PathVariable String bookname){
		Books books = bookService.getBooksByBookName(bookname);
		return ResponseEntity.ok(books);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Books> addBook(@RequestBody Books book){
		Books books = bookService.addBook(book);
		return ResponseEntity.ok(books);
	}
}
