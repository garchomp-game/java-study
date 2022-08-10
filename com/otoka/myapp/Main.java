package com.otoka.myapp;
import com.otoka.myapp.comment.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Zenhan zenhan = new Zenhan();
    Kouhan kouhan = new Kouhan();
    
    zenhan.doWarusa();
    zenhan.doTogame();
    kouhan.callDeae();
    kouhan.showMondokoro();
  }
}