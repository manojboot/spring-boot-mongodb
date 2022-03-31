package com.book.neo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.book.neo.Books;

@Repository
public interface BookRepository extends MongoRepository<Books, String>{
	
		public Books getBooksByBookname(String bookName);
		
}
