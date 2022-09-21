package com.otoka.rpgGame.User;
import com.otoka.rpgGame.AUser;
import com.otoka.rpgGame.Wepon.Sword;
import com.otoka.rpgGame.AMonster;
import java.util.*;

public class Hero extends AUser implements Cloneable {
  private Sword sword;
  public Hero(String name) {
    super(name, 100);
  }
  public Hero(String name, int hp) {
    super(name, hp);
  }
  
  public Hero() {
    this("ダミー");;
  }
  public boolean equals(Object h) {
    if(h == this) return true;
    if(h == null) return false;
    if(!(h instanceof Hero)) return false;
    Hero hero = (Hero)h;
    if(this.name == hero.name) return true;
    return false;
  }
  public int hashCode() {
    return Objects.hash(this.name, this.hp);
  }
  @Override
  public Hero clone() {
    Hero result = new Hero(this.name, this.hp);
    result.setSword(this.sword.clone());
    return result;
  }
  @Override
  public void setName(String name) {
    this.name = name;
  }
  @Override
  public String getName() {
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
  
  public void setSword(Sword s) {
    this.sword = s;
  }
  public Sword getSword() {
    return this.sword;
  }
  public void attack(AMonster monster) {
    int enemyLife = monster.getHp();
    enemyLife -= sword.getDamage();
    monster.setHp(enemyLife);
    System.out.println(this.name + "は、" + sword.getName() + "で攻撃した！");
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