package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class BookAssignmentApplication implements CommandLineRunner {
    
	@Autowired
	  BookRepository bookRepository;
	  
	public static void main(String[] args) {
		SpringApplication.run(BookAssignmentApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		for(int i=1; i<=5; i++) {
			 int counter=200+i;
			 BookMain Book1=new BookMain(201, "Java", "James Gosling");
		
		 bookRepository.save(Book1);
		// System.out.println("Book_class saved !!");
	}
		
	List<BookMain> bookList = bookRepository.findAll();
	
	for (BookMain b : bookList)
		System.out.println(b);

	Optional<BookMain> bo = bookRepository.findById(103);
	if (bo.isPresent())
		System.out.println(bo);
	else
		System.out.println("Book not found!!");

	}
}