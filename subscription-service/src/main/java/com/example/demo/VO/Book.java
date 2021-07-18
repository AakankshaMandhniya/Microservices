package com.example.demo.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
	private Long bookId;
	private String bookName;
	private String bookAuthor;
	private String availableCopies;
	private String totalCopies;
	
	public Long getBookId() {
		return bookId;
	}
	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getAvailableCopies() {
		return availableCopies;
	}
	public void setAvailableCopies(String availableCopies) {
		this.availableCopies = availableCopies;
	}
	public String getTotalCopies() {
		return totalCopies;
	}
	public void setTotalCopies(String totalCopies) {
		this.totalCopies = totalCopies;
	}
	
}
