package com.otoka.rpgGame;

public abstract class AWepon {
  protected String name;
  protected int damage;
  public AWepon(String name, int damage) {
    this.name = name;
    this.damage = damage;
  }
  public abstract void setName(String name);
  public abstract String getName();
  public abstract void setDamage(int damage);
  public abstract int getDamage();
}