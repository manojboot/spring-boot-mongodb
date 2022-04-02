package com.book.neo.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

import com.book.neo.exception.RecordNotFoundException;
import com.book.neo.model.BookResponse;
import com.book.neo.model.Books;
import com.book.neo.repository.BookRepository;

@Service
public class BookService {
	
		private BookRepository bookRepository;

		public BookService(BookRepository bookRepository) {
			super();
			this.bookRepository = bookRepository;
		}
		
		public BookResponse getAllBookDetails(){
			
			BookResponse response = new BookResponse();
			List<Books> books = bookRepository.findAll();
			response.setBooks(books);
			response.setStatusCode(200);
			response.setMessage("SUCCESS");
			return response;
		}
		
		public Books getBooksByBookName(String bookname){
			Optional<Books> book = bookRepository.getBooksByBookname(bookname);
			if(book.isEmpty()) {
				throw new RecordNotFoundException("Book Doesn't Exist or Avilable : " +bookname);
			}
			return book.get();
		}
		
		public Books addBook(Books book){
			
			return bookRepository.save(book);
		}
}
