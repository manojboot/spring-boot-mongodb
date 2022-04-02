package com.book.neo.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookResponse extends CommonResponse{

	private List<Books> books;
}
