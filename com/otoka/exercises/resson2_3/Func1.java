package com.otoka.exercises.resson2_3;

@FunctionalInterface
public interface Func1<E, R> {
  public abstract R run(E e);
}