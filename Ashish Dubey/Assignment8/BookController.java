package com.Book.Controller;

import java.util.Optional;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Book.Repository.BookRepository;
import com.Book.model.Book;


@RestController
public class BookController 
{
	@Autowired
	BookRepository bookRepository;
	
	@PostMapping("/multipleBookSave")
	public String insertBook(@RequestBody List book) {
		bookRepository.saveAll(book);
		return " Record is saved successfully !! " ;
	}
	@GetMapping("/getAllBook")
	public List getBook() {
		return (List) bookRepository.findAll(); 
	}
	@GetMapping("/getByBookName/{name}")
	public List getBookByName(@PathVariable("name")String bookName){
		return (List) bookRepository.findBybookName(bookName) ;
	}
	@GetMapping("/getByBookId/{bookId}")
	public Optional<Book> getBookById(@PathVariable("bookId")Long id){
		return bookRepository.findById(id) ;
	}
}
