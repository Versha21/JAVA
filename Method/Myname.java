
import java.util.Scanner;
public class Myname {
    public static void printmyname(String name) {
        System.out.println(name);
        return;
    }

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        printmyname("Your name is :"+ name);
    }
}
