package com.example.demo1;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CruDbookApplication implements CommandLineRunner
{
	
	public void run(String... args) throws Exception 
	{
		
	@Autowired
	BookRepository bookRepository;
	public static void main(String[] args)
	{
		SpringApplication.run(CruDbookApplication.class, args);
	}

		for (int i = 1; i <= 5; i++) 
		{
			int counter = 100 + i;
			Boook_class book = new Boook_class(counter, "JAVA" + i, "James Gosling");
			bookRepository.save(book);
		}

		List<Boook_class> bookList = bookRepository.findAll();
		for (Boook_class book : bookList)
			System.out.println(book);

		Optional<Boook_class> book = bookRepository.findById(103);
		if (book.isPresent())
			System.out.println(book);
		else
			System.out.println("Book not found!!");

	}

}