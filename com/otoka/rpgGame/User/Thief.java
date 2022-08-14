package com.otoka.rpgGame.User;
import com.otoka.rpgGame.AUser;

public class Thief extends AUser {
  private String name;
  private int hp;
  private int mp;
  
  public Thief(String name, int hp, int mp) {
    super(name, hp);
    this.mp = mp;
  }
  public Thief(String name, int hp) {
    this(name, hp, 5);
  }
  public Thief(String name) {
    this(name, 40, 5);
  }
  @Override
  public void setName(String name) {
    this.name = name;
  }
  @Override
  public String getName() {
    return this.name;
  }
  @Override
  public void setHp(int hp) {
    this.hp = hp;
  }
  @Override
  public int getHp() {
    return this.hp;
  }
}
