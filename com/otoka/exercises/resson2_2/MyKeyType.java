package com.otoka.exercises.resson2_2;

public enum MyKeyType {
  // 引数の数字を入れるためには↓
  PADLOCK(1024),
  BUTTON(10000),
  DIAL(30000),
  FINGER(1000000);
  // ここで引数の情報を設定、例：PADLOCK(int count);
  private int count;
  // これはJVMがよしなにやってくれるために必要な関数。コレによってPADLOCKの1024が入る。
  private MyKeyType(int count) {
    this.count = count;
  }
  // この関数はユーザーが自由に呼び出せる。カウント取得したいときに。
  public int getCount() {
    return count;
  }
}

