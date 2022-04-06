package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
	public class Bookapplication implements CommandLineRunner {
	    
		@Autowired
		  BookRepository bookRepository;
		  
		public static void main(String[] args) {
			SpringApplication.run(Bookapplication.class, args);
		}

		@Override
		public void run(String... args) throws Exception {
			// TODO Auto-generated method stub
			for(int i=1; i<=5; i++) {
				 int counter=100+i;
				 Book_class Book1=new Book_class(101, "ABC", "Ram");
			
			 bookRepository.save(Book1);
			// System.out.println("Book_class saved !!");
		}
			
		List<Book_class> bookList = (bookRepository).findAll();
		
		for (Book_class book1 : bookList)
			System.out.println(book1);

		Optional<Book_class> book = bookRepository.findById(103);
		if (book.isPresent())
			System.out.println(book);
		else
			System.out.println("Book not found!!");

		}
}
