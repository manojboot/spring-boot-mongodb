package com.book.neo.exception;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.book.neo.model.ErrorResponse;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler{

		@ExceptionHandler(RecordNotFoundException.class)
		public ResponseEntity<Object> handleRecordNotFoundException(RecordNotFoundException ex,WebRequest request){
			
			List<String> list = new ArrayList<String>();
			list.add(ex.getLocalizedMessage());
			ErrorResponse response = new ErrorResponse("Book Record Doesn't Exist",list);
			return new ResponseEntity<Object>(response, HttpStatus.BAD_REQUEST);
		}
}
