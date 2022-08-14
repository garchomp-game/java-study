package com.otoka.rpgGame.Wepon;
import com.otoka.rpgGame.AWepon;

public class Sword extends AWepon {
  private String name = "炎の剣";
  private int damage = 10;
  
  @Override
  public String getName() {
    return this.name;
  }
  @Override
  public int getDamage() {
    return this.damage;
  }
}