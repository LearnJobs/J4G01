package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
	BookService bookservice;

	@GetMapping("/books")
	public List<Book_class> getAllBooks() {
		return bookRepository.findAll();
	}

	@GetMapping("/books/{bookid}")
	public Optional<Book_class> getBook(@PathVariable("bookid") int bookid) throws BookNotFoundException {
		Optional<Book_class> b = bookRepository.findById(bookid);
		if (!b.isPresent()) {
			throw new BookNotFoundException("Book Id :" + bookid + ", is not available!!");
		}
		return b;

	}
	@PostMapping("/books")
	public ResponseEntity<Book_class> postBook(@RequestBody Book_class book){
		Book_class book1 = null;
		try {
			book1 = bookservice.postBook(book);
		}catch(Exception e) {
			e.getMessage();
		}
		return new ResponseEntity<Book_class>(book1,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{bookid}")
	public ResponseEntity<Book_class> deleteBook(@PathVariable("id") int bookid){
		Book_class book1 = null;
		try {
			book1 = bookservice.deleteBook(bookid);
		}catch(Exception e) {
			e.getMessage();
		}
		return new ResponseEntity<Book_class>(book1,HttpStatus.OK);
	}
	

}

