import java.util.*;
import java.util.Map.Entry;
public class Main {
  // staticメンバ
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    System.out.println("数当てゲーム");
    Random random = new Random();
    int ans = random.nextInt(9);
    for(int i = 0; i < 5; i++) {
      System.out.println("0~9の数字を入力してください。");
      int num = Integer.parseInt(scanner.nextLine());
      if(num == ans) {
        System.out.println("アタリ！");
        break;
      } else {
        System.out.println("違います");
      }
    }
    System.out.println("ゲームを終了します。");
  }
}

