import java.util.Scanner;

public class Test0918 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a hex number: ");
    String index = input.nextLine();
    input.close();
    
    System.out.println(hexToDecimal(index));
  }
  
  public static int hexToDecimal(String hex) {
    int decimalValue = 0;
    for (int i = 0; i < hex.length(); i++) {
      char hexChar = hex.charAt(i);
      decimalValue = decimalValue + hexCharToDecimal(hexChar);
    }
    return decimalValue;
  }

  public static int hexCharToDecimal(char ch) {
    if (ch >= 'A' && ch <= 'F')
      return 10 + ch - 'A';
    else 
      return ch - '0';
  }
}
