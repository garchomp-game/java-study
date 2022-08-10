package com.otoka.myapp.model;


public class User {
  protected String name;
  
  public User(String name) {
    this.name = name;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void sayHi() {
    System.out.println("hi!" + this.name);
  }
}