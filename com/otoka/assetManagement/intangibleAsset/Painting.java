package com.otoka.assetManagement.intangibleAsset;
import com.otoka.assetManagement.IntangibleAsset;

public class Painting extends IntangibleAsset {
  public Painting(String name, int price, String color, String patent) {
    super(name, price, color, patent);
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
  @Override
  public String getPatent() {
    return this.patent;
  }
  
}