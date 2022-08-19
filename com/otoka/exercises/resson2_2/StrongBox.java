package com.otoka.exercises.resson2_2;
import java.util.*;

public class StrongBox<T> {
  private T generic;
  private MyKeyType key;
  private int count = 0;
  
  public String toString() {
    return String.valueOf(this.key.getCount());
  }
  public int hashCode() {
    return Objects.hash(this.generic, this,key);
  }
  @SuppressWarnings("unchecked")
  public boolean equals(Object o) {
    if(o == this) return true;
    if(o == null) return false;
    if(!(o.getClass() == this.getClass())) return false;
    StrongBox<T> s = (StrongBox<T>)o;
    if(s.generic == this.generic
    && s.key == this.key
    && s.count == this.count) {
      return true;
    }
    return false;
  }
  
  public StrongBox(MyKeyType key) {
    this.key = key;
  }
  
  public void put(T t) {
    this.generic = t;
  }
  public Optional<T> get() {
    this.count++;
    T result = this.count > this.key.getCount() ? this.generic : null;
    return Optional.ofNullable(result);
  }
}
