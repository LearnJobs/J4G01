package com.example.demo1;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class BookNotFoundException extends Exception {
	//String data;
	public BookNotFoundException(String data) {
		super(data);
	}

}