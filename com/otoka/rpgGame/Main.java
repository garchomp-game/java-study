package com.otoka.rpgGame;
import com.otoka.rpgGame.*;
import com.otoka.rpgGame.Monster.*;
import com.otoka.rpgGame.User.*;

public class Main {
  public static void main(String[] args) {
    Hero hero = new Hero();
    hero.setName("ミナト");
    hero.setHp(100);
    System.out.println("勇者" + hero.getName() + "を生み出しました!");
    
    Matango m1 = new Matango();
    m1.setHp(50);
    m1.setSuffix('A');
    
    Matango m2 = new Matango();
    m2.setHp(48);
    m2.setSuffix('B');
    
    hero.slip();
    m1.run();
    m2.run();
    hero.run();
  }
}