
public class Method0917 {
  public static void main(String[] args) {
    int i = 5;
    int j = 10;
    //int k = max(i,j);
    int k = gcd(i,j);
    System.out.println(k);
  }   
  
    /*public static int max(int num1,int num2) {
      int result;
      
      if (num1 > num2) 
        result = num1;
      else
        result = num2;
      
      return result;
    }*/
  
    public static int gcd(int n1,int n2) {
      int gcd = 1;
      int k = 2;
      
      while (k <= n1 && k <= n2) {
        if (n1 % k ==0 && n2 % k ==0) {
          gcd = k;
          k++;
        }
      }
      
      return gcd;
    }
}

