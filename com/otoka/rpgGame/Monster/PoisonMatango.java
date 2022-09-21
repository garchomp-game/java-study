package com.otoka.rpgGame.Monster;
import com.otoka.rpgGame.AMonster;
import com.otoka.rpgGame.AUser;
import com.otoka.rpgGame.Monster.Matango;


public class PoisonMatango extends Matango {
  int poisonCount = 5;
  
  public PoisonMatango() {
    super(30, 30);
  }
  
  public PoisonMatango(char suffix) {
    super(30, 30, suffix);
  }
  
  public void attack(AUser h) {
    super.attack(h);
    if(poisonCount > 0) {
      System.out.println("更に胞子をばらまいた！");
      int poisonDamage = h.getHp() / 5;
      h.setHp(poisonDamage);
      System.out.println(poisonDamage + "ポイントのダメージ！");
      this.suffix--;
    }
  }
}