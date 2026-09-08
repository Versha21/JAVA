package strings;
import java.util.Scanner;
public class StringFunc1 {
    public static void main(String[] args) {
        String str = "java function";
        System.out.println(str.length());
        char ch = str.charAt(5);
        System.out.println(ch);
        int idx = str.indexOf('f');
        System.out.println(idx);
        String gtr = "string "; // output is -9 bcoz str is greater than str and 9 bcoz s is 9 letter after j (like - k l m n o p q r s)
        System.out.println(str.compareTo(gtr));
    }
}
