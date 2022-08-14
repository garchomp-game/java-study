package com.otoka.rpgGame.User;
import com.otoka.rpgGame.AUser;
import com.otoka.rpgGame.Wepon.Sword;
import com.otoka.rpgGame.AMonster;

public class Hero extends AUser {
  public Hero(String name) {
    super(name, 100);
  }
  
  public Hero() {
    this("ダミー");;
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
  
  public void attack(AMonster monster) {
    Sword sword = new Sword();
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