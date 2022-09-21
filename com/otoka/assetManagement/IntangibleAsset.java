package com.otoka.assetManagement;

public abstract class IntangibleAsset extends Asset {
  protected String patent;
  public IntangibleAsset(String name, int price, String color, String patent) {
    super(name, price, color);
    this.patent = patent;
  }
  
  public abstract String getPatent();
}