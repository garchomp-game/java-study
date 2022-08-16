package com.otoka.rpgGame.Wepon;
import com.otoka.rpgGame.AWepon;

public class Sword extends AWepon implements Cloneable {
  /**
   * コンストラクタ
   * @param String name
   * @param int damage
   */
  public Sword(String name, int damage) {
    super(name, damage);
  }
  
  @Override
  public Sword clone() {
    return new Sword(this.name, this.damage);
  }
  @Override
  public String getName() {
    return this.name;
  }
  @Override
  public int getDamage() {
    return this.damage;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setDamage(int damage) {
    this.damage = damage;
  }
}