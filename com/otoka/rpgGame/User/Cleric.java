package com.otoka.rpgGame;
import com.otoka.rpgGame.AUser;
import java.util.Random;

class Cleric extends AUser {
  private int mp = 10;
  private final MAXHP = 50;
  private final MAXMP = 10;
  public Cleric(String name, int age) {
    super(name, age);
  }
  
  @Override
  public void setName(String name) {
    this.name = name;
  }
  @Override
  public String getHp() {
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
  
  
  public void selfAid() {
    if(this.mp >= 5) {
      this.mp -= 5;
      this.hp = this.MAXHP;
    }
    public int pray(int time) {
      Random random = new Random();
      int result = random.nextInt(3) + time;
      this.mp = this.MAXMP < result ? this.MAXMP : result;
      return result;
    }
  }
  
}