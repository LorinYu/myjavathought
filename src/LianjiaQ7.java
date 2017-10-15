
public class LianjiaQ7 {

  public static void main(String[] args) {
    charSort();
  }

  
  public static void fun1() {
    String s1 = "this is";
    String s2 = "message";
    String s3 = s1.concat(s2);
    System.out.println(s3);
    System.out.println(s1 + s2);
    System.out.println(s2.toUpperCase().toLowerCase());
  }
  
  public static boolean stringEqual() {
    String s1 = "this is";
    //String s2 = "message";
    String s3 = "this is";
    boolean b = s3.equals(s1);
    return b;
  }
  
  public static boolean stringstartwith() {
    String s1 = "this is";
    String s2 = "thi";
    boolean b = s1.startsWith(s2);
    return b;
  }
  public static void tochar() {
    String ss = "mike lalal";
    char[] ch1 = ss.toCharArray();
    for (char e: ch1) System.out.println(e);
  }
  public static void charSort() {
    String s4 = "wangzheng and fengshaowen";
    char[] arr1 = s4.toCharArray();
    char temp = ' ';
    int length = arr1.length;
    for (int i = 0; i < length -1; i++) {
      for (int j = 0; j <length - 1 - i; j++) {
        if (arr1[j] > arr1[j+1]) {
          temp = arr1[j];
          arr1[j] = arr1[j+1];
          arr1[j+1] = temp;
        }
      }
    }
    for (char e: arr1) System.out.print(e);
  }
}
