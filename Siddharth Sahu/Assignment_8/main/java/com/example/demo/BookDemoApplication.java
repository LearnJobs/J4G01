package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookDemoApplication implements CommandLineRunner{

	@Autowired
	BookRepository bookRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(BookDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//System.out.println("Table is created");
		
		
			for(int i=1;i<=5;i++) {
				int counter=100+i;
				Books book1=new Books(counter,"Java"+i,"GFG");
				bookRepository.save(book1);
			}
		
		
		List<Books> bookList = bookRepository.findAll();
		for(Books book:bookList)
			System.out.println(book);
		
		Optional<Books> book = bookRepository.findById(104);
		if(book.isPresent())
				System.out.println(book);
		else
			System.out.println("book not found");
		
		System.out.println("Total books :"+bookRepository.count());
	}

}
