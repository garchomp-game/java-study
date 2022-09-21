import java.util.*;
import static java.lang.System.*;
public class BfSearch {
  public static String[] Node = {"B", "D", "F", "A", "C", "E"};
  public static int[] Left = {-1, 2, -1, 0, 1, -1};
  public static int[] Right= {-1, -1, -1, 4, 5, -1};
  public static String[] Round = new String[6];
  public static int[] Pointer = new int[7];
  public static void main(String[] args) throws Exception {
    int Root = 3;
    int i = 0;
    Pointer[0] = Root;
    Round[0] = Node[Root];
    int j = 1;
    while(i < j) {
      if(Left[Pointer[i]] != -1) {
        Pointer[j] = Left[Pointer[i]];
        Round[j] = Node[Pointer[j]];
        j++;
      }
      if(Right[Pointer[i]] != -1) {
        Pointer[j] = Right[Pointer[i]];
        Round[j] = Node[Pointer[j]];
        j++;
      }
      i++;
      out.print("i: " + i);
      out.print(" j: " + j);
      out.print(" Pointer: " + Pointer[i]);
      out.println(" " + Arrays.toString(Round));
      out.println();
    }
    out.println(Arrays.toString(Pointer));
  }
}