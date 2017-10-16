import java.io.FileNotFoundException;

public class Task171017 {
  
  public static void main(String[] args)  throws Exception {
    func2();
  }    
  
  public static void func1() throws FileNotFoundException {
    java.io.File file = new java.io.File("qwe.txt");
    try( java.io.PrintWriter output = new java.io.PrintWriter(file)) {
      output.print("lalala");
    }
  }
    
  public static void func2() throws Exception {
    java.io.File file = new java.io.File("qwe.txt");
    java.util.Scanner input = new java.util.Scanner(file);
    String line1 = input.nextLine();
    System.out.println(line1);
    input.close();
    }

}
