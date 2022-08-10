package com.otoka.myapp;

import java.util.*;
import com.otoka.myapp.model.*;

public class MyApp {
  public static void main(String[] args) {
    User tom = new User("tom");
    System.out.println(tom.getName());
    tom.sayHi();
    
    AdminUser bob = new AdminUser("bob");
    System.out.println(bob.getName());
    bob.sayHi();
    bob.sayHello();
  }
}