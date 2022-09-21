package com.otoka.assetManagement;
import com.otoka.assetManagement.tangibleAsset.*;
import com.otoka.assetManagement.intangibleAsset.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Book book = new Book("java Study", 1000, "red", "ISBN123-4-56-7789012-3");
    Computer computer = new Computer("linux", 10000, "blue", "ISBN123-4-56-7789012-3");
    Painting painting = new Painting("garchomp", 1000, "blue", "ISBN123-4-56-7789012-3");
    
    System.out.println(book.getName());
    System.out.println(book.getPrice());
    System.out.println(book.getColor());
    System.out.println(book.getIsbn());
    
    System.out.println(computer.getName());
    System.out.println(computer.getPrice());
    System.out.println(computer.getColor());
    System.out.println(computer.getMakerName());
    
    System.out.println(painting.getName());
    System.out.println(painting.getPrice());
    System.out.println(painting.getColor());
    System.out.println(painting.getPatent());
  }
}