package com.example.demo;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.demo.BookNotFoundException;

@ControllerAdvice
@RestController
public class Bookexception extends ResponseEntityExceptionHandler {
	//@ExceptionHandler(Booknotfoundexception.class)
	public final ResponseEntity<Exception> handleException(BookNotFoundException exception,
			WebRequest request) {
		Exception exceptionResponse = new Exception(new Date(), exception.getMessage(),
				request.getDescription(false));

		return new ResponseEntity<Exception>(exceptionResponse, HttpStatus.NOT_FOUND);
	}
}