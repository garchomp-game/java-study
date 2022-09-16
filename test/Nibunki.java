import java.util.*;

public class Nibunki {
  public static int[] LeftPointer = {-1, -1, 3, 1, -1, -1, 5};
  public static int[] RightPointer = {-1, -1, 6, 4, -1, -1, 0};
  public static void main(String[] args) throws Exception {
    StringBuilder sb = new StringBuilder();
    int[] Pointer = new int[7];
    Arrays.fill(Pointer, -1);
    for(int i = 0; i < Pointer.length; i++) {
      if(LeftPointer[i] != -1)
        Pointer[LeftPointer[i]] = i;
      if(RightPointer[i] != -1)
        Pointer[RightPointer[i]] = i;
      String br = System.getProperty("line.separator");
      sb.append("i: ");
      sb.append(i);
      sb.append(" left: ");
      sb.append(LeftPointer[i]);
      sb.append(" right: ");
      sb.append(RightPointer[i]);
      sb.append("  ");
      sb.append(br);
      sb.append(Arrays.toString(Pointer));
      sb.append(br);
      sb.append(br);
    }
    System.out.println(sb.toString());
  }
}