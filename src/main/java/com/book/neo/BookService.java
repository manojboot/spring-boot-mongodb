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
		
		public Books getBooksByBookName(String bookname){
			
			return bookRepository.getBooksByBookname(bookname);
		}
		
		public Books addBook(Books book){
			
			return bookRepository.save(book);
		}
}
