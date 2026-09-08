package strings;
import java.util.Scanner;
public class Stringintchar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         String str = "abc";
         str += "def";
         str += 'r';
         str += 10;
        System.out.println(str);
    }
}
