package com.otoka.assetManagement.tangibleAsset;
import com.otoka.assetManagement.TangibleAsset;
import com.otoka.assetManagement.IThing;

public class Book extends TangibleAsset implements IThing {
  private String isbn;
  public Book(String name, int price, String color, String isbn) {
    super(name, price, color);
    this.isbn = isbn;
  }
  
  @Override
  public String getName() {
    return this.name;
  }
  @Override
  public int getPrice() {
    return this.price;
  }
  @Override
  public String getColor() {
    return this.color;
  }
  
  public String getIsbn() {
    return this.isbn;
  }
}