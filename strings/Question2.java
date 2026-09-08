package strings;
import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        String s = "abcd";
        for (int i = 0; i <= s.length(); i++) {
            System.out.println(s.substring(0, i));
        }
        System.out.println();

    }
}
