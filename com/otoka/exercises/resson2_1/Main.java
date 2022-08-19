package com.otoka.exercises.resson2_1;
import com.otoka.exercises.resson2_1.*;
import java.util.*;
import java.text.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Date date = new Date();
    Book book = new Book("test title", date, "test comment");
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(date);
    calendar.add(Calendar.DAY_OF_MONTH, 100);
    date = calendar.getTime();
    Book book2 = new Book("test title 2", date, "test comment");
    
    // ~~~ ここから検証~~~
    System.out.println(book.equals(book2));
    List<Book> list = new ArrayList<Book>();
    list.add(book);
    list.add(book2);
    TitleComparator titleComparator = new TitleComparator();
    Collections.sort(list, titleComparator);
    Iterator<Book> it = list.iterator();
    while(it.hasNext()) {
      System.out.println(it.next().getTitle());
    }
    Book book3 = book.clone();
    System.out.println(book.equals(book3));
    Set<Book> set = new HashSet<>();
    set.add(book);
    Date time = book.getPublishDate();
    book = new Book("test title", date, "test comment");
    book.setPublishDate(time);
    set.remove(book);
    System.out.println(set.size());
    SimpleDateFormat f = new SimpleDateFormat("yyyy/mm/dd");
    Date date1 = f.parse("2011/10/07");
    Date date2 = f.parse("2019/06/11");
    Date date3 = f.parse("2018/06/21");
    Book bookTest1 = new Book("Java 入門", date1 , "スッキリわかる");
    Book bookTest2 = new Book("Python 入門", date2, "カレーが食べたくなる");
    Book bookTest3 = new Book("C 入門", date3, "ポインタも自由自在");
    List<Book> bookTestList = new ArrayList<>();
    bookTestList.add(bookTest1);
    bookTestList.add(bookTest2);
    bookTestList.add(bookTest3);
    Collections.sort(bookTestList, titleComparator);
    Iterator<Book> it2 = bookTestList.iterator();
    StringBuilder sb = new StringBuilder();
    while(it2.hasNext()) {
      Book data = it2.next();
      sb.append(data.getTitle());
      sb.append(" + ");
      sb.append(data.getPublishDate());
      sb.append(" + ");
      sb.append(data.getComment());
      sb.append(System.getProperty("line.separator"));
    }
    System.out.println(sb);
  }
}