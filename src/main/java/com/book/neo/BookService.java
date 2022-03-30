package com.book.neo;

import java.util.List;

import org.springframework.stereotype.Service;

import com.book.neo.repository.BookRepository;

@Service
public class BookService {
	
		private BookRepository bookRepository;

		public BookService(BookRepository bookRepository) {
			super();
			this.bookRepository = bookRepository;
		}
		
		public List<Books> getAllBookDetails(){
			
			return bookRepository.findAll();
		}
}
