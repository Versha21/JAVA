package strings;
import java.util.Scanner;
public class II {
    public static void main(String[] args) {
        String str = "String funtion II";
        System.out.println(str.contains("ing")); // contain any words of string
        System.out.println(str.startsWith("Str"));
        System.out.println(str.endsWith("II"));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        String s1 = "abc";
        String s2 = "def";
        System.out.println(s1.concat(s2));
    }
}
