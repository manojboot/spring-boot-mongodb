package com.book.neo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ResponseStatus(HttpStatus.NOT_FOUND)
public class RecordNotFoundException extends RuntimeException {
		
		private static final long serialVersionUID = 1023106683047196587L;
		private String message;
		public RecordNotFoundException(String message) {
			super(message);
			this.message = message;
		}
		
		public RecordNotFoundException() {
			
		}
}
