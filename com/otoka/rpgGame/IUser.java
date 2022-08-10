package com.otoka.rpgGame;

public interface IUser {
  String name = "";
  int hp = 0;
  
  public void attack();
  public void sleep();
  public void sit(int sec);
  public void slip();
  public void run();
}