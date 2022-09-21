package com.otoka.rpgGame.User;
import com.otoka.rpgGame.User.Hero;
import com.otoka.rpgGame.AMonster;
public class SuperHero extends Hero {
  boolean flying;
  
  public SuperHero(String name) {
    super(name);
  }
  public SuperHero() {
    super();
  }
  
  @Override
  public void run() {
    System.out.println(this.name + "は撤退した！");
  }
  
  @Override
  public void attack(AMonster m) {
    super.attack(m);
    if(this.flying) {
      super.attack(m);
    }
  }
  
  public void fly() {
    this.flying = true;
    System.out.println("飛び上がった！");
  }
  public void land() {
    this.flying = false;
    System.out.println("着地した！");
  }
}