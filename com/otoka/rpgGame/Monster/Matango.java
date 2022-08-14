package com.otoka.rpgGame.Monster;
import com.otoka.rpgGame.AMonster;
import com.otoka.rpgGame.AUser;
public class Matango extends AMonster {
  protected int hp;
  protected char suffix;
  
  public Matango() {
    super(10, 20);
  }
  public Matango(char suffix) {
    super(10, 20);
    this.suffix = suffix;
  }
  
  public Matango(int LEVEL, int AGE) {
    super(LEVEL, AGE);
  }
    public Matango(int LEVEL, int AGE, char suffix) {
    super(LEVEL, AGE);
    this.suffix = suffix;
  }
  
  public void setHp(int hp) {
    this.hp = hp;
  }
  public int getHp() {
    return this.hp;
  }
  
  public void setSuffix(char suffix) {
    this.suffix = suffix;
  }
  public char getSuffix() {
    return this.suffix;
  }
  public void getLevel() {
    System.out.println(this.LEVEL);
  }
  
  public void attack(AUser h) {
    int heroLife = h.getHp();
    heroLife -= 10;
    h.setHp(heroLife);
    System.out.println("キノコ" + this.suffix + "の攻撃");
    System.out.println("10のダメージ");
  }
  public void run() {
    System.out.println("お化けキノコ" + this.suffix + "は逃げ出した！");
  }
}