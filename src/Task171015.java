import java.util.Scanner;

public class Task171015 {

  public static void main(String[] args) {
    fun1();
  }
  
  public static void fun1() {
    System.out.println("Enter two int numbers: ");
    Scanner input = new Scanner(System.in);
    int n1 = input.nextInt();
    int n2 = input.nextInt();
    input.close();
    int g = 1;
    int k = 2;
    
    while (k <= n1 && k <= n2) {
      if (n1 % k ==0 && n2 % k ==0)
        g = k;
      k++;
    }
    System.out.println(g);
  } 
}
