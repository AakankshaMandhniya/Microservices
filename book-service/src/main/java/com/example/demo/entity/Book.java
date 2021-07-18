package com.example.demo.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private Long bookId;
private String bookName;
private String bookAuthor;
private String availableCopies;
private String totalCopies;

/*
 * public Long getBookId() { return bookId; } public void setBookId(Long bookId)
 * { this.bookId = bookId; } public String getBookName() { return bookName; }
 * public void setBookName(String bookName) { this.bookName = bookName; } public
 * String getBookAuthor() { return bookAuthor; } public void
 * setBookAuthor(String bookAuthor) { this.bookAuthor = bookAuthor; } public
 * String getAvailableCopies() { return availableCopies; } public void
 * setAvailableCopies(String availableCopies) { this.availableCopies =
 * availableCopies; } public String getTotalCopies() { return totalCopies; }
 * public void setTotalCopies(String totalCopies) { this.totalCopies =
 * totalCopies; }
 */

  public Long getBookId() { return bookId; } public void setBookId(Long bookId)
  { this.bookId = bookId; } public String getBookName() { return bookName; }
  public void setBookName(String bookName) { this.bookName = bookName; } public
  String getBookAuthor() { return bookAuthor; } public void
  setBookAuthor(String bookAuthor) { this.bookAuthor = bookAuthor; } public
  String getAvailableCopies() { return availableCopies; } public void
  setAvailableCopies(String availableCopies) { this.availableCopies =
  availableCopies; } public String getTotalCopies() { return totalCopies; }
  public void setTotalCopies(String totalCopies) { this.totalCopies =
  totalCopies; }
  
  @Override public int hashCode() { return Objects.hash(availableCopies,
  bookAuthor, bookId, bookName, totalCopies); }
  
  @Override public boolean equals(Object obj) { if (this == obj) return true;
  if (obj == null) return false; if (getClass() != obj.getClass()) return
  false; Book other = (Book) obj; return Objects.equals(availableCopies,
  other.availableCopies) && Objects.equals(bookAuthor, other.bookAuthor) &&
  Objects.equals(bookId, other.bookId) && Objects.equals(bookName,
  other.bookName) && Objects.equals(totalCopies, other.totalCopies); }
  
  @Override public String toString() {
	  return "Book [bookId=" + bookId +
  ", bookName=" + bookName + ", bookAuthor=" + bookAuthor +
  ", availableCopies=" + availableCopies + ", totalCopies=" + totalCopies +
  "]"; }
 

	
}
