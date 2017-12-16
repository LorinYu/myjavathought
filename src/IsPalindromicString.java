import java.util.Scanner;
public class IsPalindromicString {
    public static void main(String[] args) {
        String str = "";
        System.out.println("Please input a string: ");
        Scanner input = new Scanner(System.in);
        str = input.next();

        StringBuffer sb = new StringBuffer(str);
        sb.reverse();

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == sb.charAt(i)) {
                count++;
            }
        }

        if (count == str.length()) {
            System.out.println("The string is a palindromic string.");
        } else {
            System.out.println("The string is NOT a palindromic string.");
        }

    }
}
