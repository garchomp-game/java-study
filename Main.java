import java.util.*;
import java.util.Map.Entry;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.text.*;
import java.io.*;
import java.util.function.*;

public class Main {
  public static void main(String[] args) throws Exception {
    MyConsumer<String, Integer, String> func = Main::showName;
    System.out.println(func.process("otoka", 1));
  }
  public static String showName(String name, Integer number) {
    return name + " + " + number;
  }
}
@FunctionalInterface
interface MyConsumer<E, E2, R> {
  public abstract R process(E e, E2 e2);
}