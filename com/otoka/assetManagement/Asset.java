package com.otoka.assetManagement;

public abstract class Asset {
  protected String name;
  protected int price;
  protected String color;
  
  public Asset(String name, int price, String color) {
    this.name = name;
    this.price = price;
    this.color = color;
  }
  
  public abstract String getName();
  public abstract int getPrice();
  public abstract String getColor();
}