package com.otoka.rpgGame.User;
import com.otoka.rpgGame.IUser;

public class Hero implements IUser {
  private String name;
  private int hp;
  
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
  
  public void attack() {
    
  }
  public void sleep() {
    this.hp = 100;
    System.out.println(this.name + "は、眠って回復した!");
  }
  public void sit(int sec) {
    this.hp += sec;
    System.out.println(this.name + "は、" + sec + "秒座った！");
    System.out.println("HPが" + sec + "ポイント回復した");
  }
  public void slip() {
    this.hp -= 5;
    System.out.println(this.name + "は、ころんだ！");
    System.out.println("5のダメージ!");
  }
  public void run() {
    System.out.println(this.name + "は、逃げ出した！");
    System.out.println("GAMEOVER");
    System.out.println("最終HPは" + this.hp + "でした");
  }
}