package com.otoka.rpgGame.User;
import com.otoka.rpgGame.AUser;
import com.otoka.rpgGame.User.Hero;

public class Wizard extends AUser {
  
  public Wizard(String name) {
    super(name, 50);
  }
  
  @Override
  public void setName(String name) {
    this.name = name;
  }
  public String getName() {
    return this.name;
  }
  public void setHp(int hp) {
    this.hp = hp;
  }
  public int getHp() {
    return this.hp;
  }
  public void heal(AUser h) {
    int hp = h.getHp();
    hp += 10;
    h.setHp(hp);
    System.out.println(h.getName() + "のHPを10回復した！");
  }
}