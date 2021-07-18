package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Book;
import com.example.demo.repository.BooksRepository;

@Service
public class BooksService {
	
	
	@Autowired
	private BooksRepository booksRepository;
   

    public Book saveBook(Book book) {
    	//com.sun.tools.sjavac.Log.info("Inside saveDepartment of DepartmentService");
        return booksRepository.save(book);
    }

    public Book findBookById(Long bookId) {
    //	com.sun.tools.sjavac.Log.info("Inside saveDepartment of DepartmentService");
        return booksRepository.findByBookId(bookId);
    }
}
