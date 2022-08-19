package com.otoka.exercises.resson2_3;
import java.util.function.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    int number = 3;
    IntPredicate isOdd = x -> x % 2 == 1;
    BiFunction<Integer, String, String> passCheck = (point, name) -> {
      return name + "さんは" + (point > 65 ? "合格" : "不合格");
    };
    System.out.println(isOdd.test(number));
    System.out.println(passCheck.apply(80, "otoka"));
    
    List<String> nameList = new ArrayList<>();
    nameList.add("otoka");
    nameList.add("rex");
    nameList.add("Raptor");
    nameList.add("棘竜");
    
    nameList.stream()
    .filter(name -> name.length() <= 4)
    .map(name -> name + "さん")
    .forEach(System.out::println);
  }
}

