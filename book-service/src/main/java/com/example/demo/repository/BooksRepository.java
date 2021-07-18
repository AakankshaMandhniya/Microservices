package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Book;

@Repository
public interface BooksRepository extends JpaRepository<Book,Long>{
	
   Book findByBookId(Long bookId);
}
