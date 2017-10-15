import java.util.Scanner;
public class Task171014 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    fun7();
  }

  public static void fun1() {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter an integer: ");
    int number  = input.nextInt();
    if (number % 5 == 0)
      System.out.println("HiFive");
    if (number % 2 == 0)
      System.out.println("HiEven");
    input.close();
  }
  
  public static void fun2() {
    int num1 = (int)(Math.random() * 10);
    int num2 = (int)(Math.random() * 10);
    int num3 = num1 - num2;
    System.out.println(num3);
  }
  
  public static void fun3() {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter an integer: ");
    int number  = input.nextInt();
    switch (number) {
      case 1: System.out.println("i'm 1."); break;
      case 2: System.out.println("i'm 2."); break;
    }
    input.close();
  }
  
  public static void fun4() {
    System.out.println(Math.exp(1));
    System.out.println(Math.log(2.7182818));
    System.out.println(Math.pow(3,3));
    System.out.println(Math.sqrt(81));
  }
  
  public static void fun5() {
    System.out.println(Math.ceil(1.8));
    System.out.println(Math.floor(1.8));
    System.out.println(Math.rint(1.8));
  }
  
  public static void fun6() {
    //char a = '\u6B22';
    //char b = '\u8FCE';
    char c = 'c';
    char d = 'd';
    System.out.print(c); 
    System.out.print(d); 
  }
  
  public static void fun7() {
    System.out.println("normal");
    System.out.println("\tnormal");
  }
}
