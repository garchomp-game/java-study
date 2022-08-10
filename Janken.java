import java.util.*;

public class Janken {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("最初はグー、じゃんけん………");
    System.out.println("グー：１，チョキ：２，パー：３");
    int janken = Integer.parseInt(scanner.nextLine()) - 1;
    Random rand = new Random();
    int result = rand.nextInt(3);
    String[] resultSet = {"グー", "チョキ", "パー"};
    System.out.println("プレイヤー：" + resultSet[janken]);
    System.out.println("コンピューター：" + resultSet[result]);
    
    if (janken == result) {
      System.out.println("あいこ！");
    } else if(WinnerSet(janken, result)) {
      System.out.println("勝ち！");
    } else {
      System.out.println("負け！");
    }
  }
  public static boolean WinnerSet(int janken, int result) {
    Map<Integer, Integer> map = new HashMap<>();
    map.put(0, 1);
    map.put(1, 2);
    map.put(2, 0);
    boolean flag = false;
    for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
      if(janken == entry.getKey() && result == entry.getValue()) {
        flag = true;
      }
    }
    return flag;
  }
}