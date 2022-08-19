package com.otoka.exercises.resson2_2;
import static com.otoka.exercises.resson2_2.MyKeyType.*;

public class Main {
  public static void main(String[] args) throws Exception {
    StrongBox<String> strongbox = new StrongBox<>(PADLOCK);
    strongbox.put("success");
    StrongBox<String> strongbox2 = new StrongBox<>(PADLOCK);
    strongbox2.put("success");
    System.out.println(strongbox.equals(strongbox2));
    for(int i = 0; i < PADLOCK.getCount(); i++) {
      strongbox.get();
    }
    System.out.println(strongbox);
    System.out.println(strongbox.get().orElseThrow(NullPointerException::new));
  }
}