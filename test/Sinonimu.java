import java.util.*;

class Sinonimu {
  public static int[] key = new int[30];
  public static int[] ptr = new int[30];
  public static void main(String[] args) throws Exception {
    Arrays.fill(key, -2);
    Arrays.fill(ptr, -2);
    
    Scanner sc = new Scanner(System.in);
    int count = sc.nextInt();
    for(int i = 0; i < count; i++) {
      System.out.print(">> ");
      int num = sc.nextInt();
      setHash(num);
    }
	}
	public static void setHash(int num) {
    int hidx = num % 13;
    if(ptr[hidx] == -2) {
      key[hidx] = num;
      ptr[hidx] = -1;
    } else {
      int i = 13; // a
      while(ptr[i] != -2) i++;
      key[i] = num;
      ptr[i] = -1;
      int j = hidx; // b
      // System.out.println(j);
      while(ptr[j] >= 13) j = ptr[j];
      System.out.println(j);
      System.out.println(i);
      ptr[j] = i; // c
    }
    // 処理はここまで
    for(int i = 0; i < key.length; i++)
      if(ptr[i] != -2)
        System.out.println(i + ": " + key[i] + " => " + ptr[i]);
    System.out.println(System.getProperty("line.separator"));
	}
}
