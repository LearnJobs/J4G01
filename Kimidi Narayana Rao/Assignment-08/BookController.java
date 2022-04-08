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
	BookServicee bookservice;

	@GetMapping("/books")
	public List<BookMain> getAllBooks() {
		return bookRepository.findAll();
	}

	@GetMapping("/books/{bookid}")
	public Optional<BookMain> getBook(@PathVariable("bookid") int bookid) throws BooknotfoundException {
		Optional<BookMain> b = bookRepository.findById(bookid);
		if (!b.isPresent()) {
			throw new BooknotfoundException("Book Id :" + bookid + ", is not available!!");
		}
		return b;

	}
	@PostMapping("/books")
	 public BookMain postBook(BookMain book) {
		 return bookRepository.save(book);
	}
	
	
	@DeleteMapping("/delete/{bookid}")
	public BookMain deleteBook(@PathVariable("bookid") int bookid) throws Exception{
		BookMain deletebook = null;
		try {
			deletebook = bookRepository.findById(bookid).orElse(null);
			if (deletebook == null) {
				throw new Exception("bookid not avaiable");
			} else {
				bookRepository.deleteById(bookid);
			}
		}catch(Exception e) {
			throw e;
		}
		return deletebook;
	
	}
}