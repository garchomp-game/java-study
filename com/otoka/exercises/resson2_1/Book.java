package com.otoka.exercises.resson2_1;
import com.otoka.exercises.resson2_1.*;
import java.util.*;

public class Book implements Comparable<Book>, Cloneable {
  private String title;
  private Date publishDate;
  private String comment;
  public Book(String title, Date publishDate, String comment) {
    this.title = title;
    this.publishDate = publishDate;
    this.comment = comment;
  }
  
  public int hashCode() {
    return Objects.hash(this.title, this.publishDate, this.comment);
  }
  public boolean equals(Object obj) {
    if(obj == this) return true;
    if(obj == null) return false;
    if(!(obj instanceof Book)) return false;
    Book book = (Book)obj;
    if(this.publishDate.equals(book.publishDate) && this.comment == book.comment) return true;
    return false;
  }
  @Override
  public int compareTo(Book book) {
    return this.publishDate.compareTo(book.publishDate);
  }
  @Override
  public Book clone() {
    Book book = new Book(this.title, this.publishDate, this.comment);
    return book;
  }
  
  public void setTitle(String title) {
    this.title = title;
  }
  public String getTitle() {
    return this.title;
  }
  public void setPublishDate(Date date) {
    this.publishDate = date;
  }
  public Date getPublishDate() {
    return this.publishDate;
  }
  public void setComment(String comment) {
    this.comment = comment;
  }
  public String getComment() {
    return this.comment;
  }
}