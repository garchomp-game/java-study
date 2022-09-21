package com.otoka.exercises.resson2_3;

@FunctionalInterface
public interface Func2<E1, E2, R> {
  public abstract R run(E1 e1, E2 e2);
}