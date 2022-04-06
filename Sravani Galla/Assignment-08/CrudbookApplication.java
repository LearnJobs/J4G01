package com.example.demo;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CruDbookApplication implements CommandLineRunner {
	@Autowired
	BookRepository bookRepository;
	public static void main(String[] args) {
		SpringApplication.run(CruDbookApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			int counter = 100 + i;
			Book book = new Book(counter, "JAVA" + i, "James Gosling");
			bookRepository.save(book);
		}

		List<Book> bookList = bookRepository.findAll();
		for (Book book : bookList)
			System.out.println(book);

		Optional<Boook_class> book = bookRepository.findById(410);
		if (book.isPresent())
			System.out.println(book);
		else
			System.out.println("Book not found!!");

	}

}

public class CrudbookApplication {

}
