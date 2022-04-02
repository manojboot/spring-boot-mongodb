package com.book.neo.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.book.neo.model.Books;

@Repository
public interface BookRepository extends MongoRepository<Books, String>{
	
		public Optional<Books> getBooksByBookname(String bookName);
		
}
