package com.otoka.rpgGame;
import com.otoka.rpgGame.*;
import com.otoka.rpgGame.Monster.*;
import com.otoka.rpgGame.User.*;
import com.otoka.rpgGame.Wepon.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Hero otoka = new Hero("otoka");
    Sword s = new Sword("鋼の剣", 30);
    otoka.setSword(s);
    System.out.println(otoka.getSword().getName());
    
    Hero otoka2 = otoka.clone();
    otoka2.getSword().setName("ひのきの棒");
    System.out.println(otoka.getSword().getName());
    System.out.println(otoka2.getSword().getName());
  }
}

/*
eval `ssh-agent`
ssh-add ~/.ssh/id_rsa
明日の朝コレについての勉強をする
*/
