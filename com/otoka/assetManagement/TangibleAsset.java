package com.otoka.assetManagement;
import com.otoka.assetManagement.IThing;

public abstract class TangibleAsset extends Asset {
  public TangibleAsset(String name, int price, String color) {
    super(name, price, color);
  }
}