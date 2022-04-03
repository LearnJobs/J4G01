package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface BookRepository extends JpaRepository<Boook_class, Integer> {

	Boook_class postBook(Boook_class book);

	Boook_class deleteBook(int bookid);
	

}
