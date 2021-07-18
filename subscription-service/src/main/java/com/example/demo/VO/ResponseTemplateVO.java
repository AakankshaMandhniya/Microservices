package com.example.demo.VO;

import com.example.demo.entity.Subscription;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {

	private Subscription scubscription;
	private Book books;
	
	public Subscription getScubscription() {
		return scubscription;
	}
	public void setScubscription(Subscription scubscription) {
		this.scubscription = scubscription;
	}
	public Book getBooks() {
		return books;
	}
	public void setBooks(Book books) {
		this.books = books;
	}

}
