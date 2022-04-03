package com.Book.Repository;

import org.hibernate.mapping.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.Book.model.Book;


@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

	public List findBybookName(String name);

	public void saveAll(List book);
}
