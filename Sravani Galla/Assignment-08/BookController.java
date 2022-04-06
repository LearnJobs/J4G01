package com.example.demo;import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController

public class BookController {

	@Autowired
	BookRepository bookRepository;
	BookService bookservice;

	@GetMapping("/books")
	public List<Boook_class> getAllBooks() {
		return bookRepository.findAll();
	}

	@GetMapping("/books/{bookid}")
	public Optional<Boook_class> getBook(@PathVariable("bookid") int bookid) throws BookNotFoundException {
		Optional<Boook_class> b = bookRepository.findById(bookid);
		if (!b.isPresent()) {
			throw new BookNotFoundException("Book Id :" + bookid + ", is not available!!");
		}
		return b;

	}

	@PostMapping("/books")
	public Boook_class postBook(Boook_class book) {
		return bookRepository.save(book);
	}

	@DeleteMapping("/books/{bookid}")
	public Boook_class deletebook(@PathVariable("bookid")int bookid) throws Exception {
		Boook_class deletebook = null;
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

