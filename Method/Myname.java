
import java.util.Scanner;
public class Myname {
    public static void printmyname(String name) {
        System.out.println(name);
        return;
    }

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        printmyname(name);
    }
}
