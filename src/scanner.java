import java.io.*;
import java.util.*;
public class scanner {
  public static void main(String args[])
  {
      Scanner sc = new Scanner(System.in);
      /*int a, b;
      while(sc.hasNextInt())
      {
          a = sc.nextInt();
          b = sc.nextInt();
          System.out.println(a + b);
      }*/
      int[] arr = new int[5];
      for(int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
      }
      System.out.println(java.util.Arrays.toString(arr));
  }
}
