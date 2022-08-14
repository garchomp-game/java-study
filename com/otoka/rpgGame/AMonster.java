package com.otoka.rpgGame;

public abstract class AMonster {
  private int hp;
  protected final int LEVEL;
  protected final int AGE;
  public AMonster(int LEVEL, int AGE) {
    this.LEVEL = LEVEL;
    this.AGE = AGE;
  }
  public abstract void setHp(int hp);
  public abstract int getHp();
}