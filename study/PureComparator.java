import java.util.*;
import java.util.Map.Entry;
public class PureComparator {
  // staticメンバ
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    int loopCount = Integer.parseInt(scanner.nextLine());
    Map<Integer, String> inputUser = new HashMap<Integer, String>();
    for(int i = 0; i < loopCount; i++) {
      inputUser.put(i, scanner.nextLine());
    }
    sortUser(inputUser, loopCount);
  }
  public static void sortUser(Map<Integer, String> inputUser, int loopCount) {
    int[] userIdList = new int[loopCount];
    // List<String> list = new ArrayList<String>(Arrays.asList(inputUser));
    List<Entry<Integer, String>> list = new ArrayList<Entry<Integer, String>>(inputUser.entrySet());
    Collections.sort(list, (o1, o2) -> {
      return Integer.parseInt(o1.getValue().replaceAll("[^0-9]", "")) > Integer.parseInt(o2.getValue().replaceAll("[^0-9]", "")) ? 1 : -1;
    });
    for(Entry<Integer, String> data : list) {
      System.out.println(data.getValue());
    }
  }
}
    
