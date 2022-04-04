package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	@Autowired
	BookRepository bookRepository;
	
	@GetMapping("/books")
	public List<Books> getAllBooks(){
		return bookRepository.findAll();
	}
	
	@GetMapping("/books/{bookid}")
	public Optional<Books> getBooks(@PathVariable("bookid") int bookid) throws BookNotFoundException {
		Optional<Books> b = bookRepository.findById(bookid);
		if(!b.isPresent()) {
			throw new BookNotFoundException("book id :"+bookid +" not found");
		}
		return b;
	}
	
	
	 @PostMapping("/books")
	  Books newBook(@RequestBody Books newBook) {
	    return bookRepository.save(newBook);
	  }
	 
	 @DeleteMapping("/books/{bookid}")
	  public Books deletebook(@PathVariable("bookid") int bookid) throws Exception {
	  Books deletebook = null;
	  try {
	  deletebook = bookRepository.findById(bookid).orElse(null);
		if (deletebook == null) {
			throw new Exception("bookid not available");
		} else {
			bookRepository.deleteById(bookid);
		}
		} catch (Exception e) {
		throw e;
		}
		return deletebook;
		}
	}

