
public class Arraysome {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
/*    char[] chararr = {'a','b','c'};
    String s = new String(chararr);
    System.out.println(s);*/
    String[] str = {"abc", "bcd", "def"};
    StringBuffer sb = new StringBuffer();
    for(int i = 0; i < str.length; i++){
     sb. append(str[i]);
    }
    String s = sb.toString();
    System.out.println(s);
  } 
}
