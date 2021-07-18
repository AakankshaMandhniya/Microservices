package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Book;
import com.example.demo.service.BooksService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/books")
@Slf4j
public class BooksController {
	
	@Autowired
	private BooksService booksService;
	
	  @PostMapping("/")
	    public Book saveBook(@RequestBody Book book) {		 
	     //   com.sun.tools.sjavac.Log.info("Inside saveDepartment method of DepartmentController");
		  System.out.println("book..."+book.getBookAuthor());
	        return  booksService.saveBook(book);
	    }

	    @GetMapping("/{id}")
	    public Book findDepartmentById(@PathVariable("id") Long bookId) {
	    	System.out.println("book id.."+bookId);
	    	//.sun.tools.sjavac.Log.info("Inside findDepartmentById method of DepartmentController");
	        return booksService.findBookById(bookId);
	    }
}
