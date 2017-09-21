import java.util.*;

public class TestIP {

  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    System.out.print("Please input the IP: ");
    String str = input.nextLine();
    input.close();
    
    String[] arr = new String[4];
    arr = str.split("\\.");
    int[] arr1 = new int[4];
    for (int i = 0; i < 4; i++) {
      arr1[i] = Integer.parseInt(arr[i]);
      // System.out.println(arr1[i]);
      if (arr1[i] > 0 && arr1[i] < 256) 
        continue;
      else 
        System.out.println("This IP is wrong");
        break;
    }
  }

}
