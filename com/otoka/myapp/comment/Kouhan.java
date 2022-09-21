package com.otoka.myapp.comment;
import com.otoka.myapp.comment.Zenhan;

public class Kouhan {
  public void callDeae() {
    System.out.println("えぇい、こしゃくな。くせ者だ、であえい！");
  }
  public void showMondokoro() throws Exception {
    System.out.println("飛車さん、角さん、もういいでしょう。");
    System.out.println("この紋章が目に入らぬか！");
    Thread.sleep(3000); //3秒
    Zenhan zenhan = new Zenhan();
    zenhan.doTogame();
  }
}