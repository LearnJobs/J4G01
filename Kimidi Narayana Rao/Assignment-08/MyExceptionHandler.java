package com.example.demo;



import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.demo.BooknotfoundException;

@ControllerAdvice
@RestController
public class MyExceptionHandler extends ResponseEntityExceptionHandler {
	@ExceptionHandler(BooknotfoundException.class)
	public final ResponseEntity<ResponseException> handleException(BooknotfoundException exception,
			WebRequest request) {
		ResponseException exceptionResponse = new ResponseException(new Date(), exception.getMessage(),
				request.getDescription(false));

		return new ResponseEntity<ResponseException>(exceptionResponse, HttpStatus.NOT_FOUND);
	}
}