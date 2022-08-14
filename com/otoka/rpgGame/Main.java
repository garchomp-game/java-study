package com.otoka.rpgGame;
import com.otoka.rpgGame.*;
import com.otoka.rpgGame.Monster.*;
import com.otoka.rpgGame.User.*;

public class Main {
  public static void main(String[] args) {
    SuperHero h1 = new SuperHero("ミナト");
    PoisonMatango m1 = new PoisonMatango('A');
    m1.attack(h1);
  }
}