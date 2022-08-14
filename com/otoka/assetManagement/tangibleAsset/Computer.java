package com.otoka.assetManagement.tangibleAsset;
import com.otoka.assetManagement.TangibleAsset;
import com.otoka.assetManagement.IThing;

public class Computer extends TangibleAsset implements IThing {
  private String makerName;
  public Computer(String name, int price, String color, String makerName) {
    super(name, price, color);
    this.makerName = makerName;
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
  
  public String getMakerName() {
    return this.makerName;
  }
}