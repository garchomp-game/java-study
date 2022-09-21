package com.otoka.rpgGame;

public abstract class AUser {
  protected String name;
  protected int hp;
  
  public AUser(String name, int hp) {
    this.name = name;
    this.hp = hp;
  }
  public abstract void setName(String name);
  public abstract String getName();
  public abstract void setHp(int hp);
  public abstract int getHp();
}