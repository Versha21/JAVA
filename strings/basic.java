package strings;
import java.util.Scanner;
public class basic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //String str = "String problem";
        //System.out.println(str);
        //String s = sc.next();
        System.out.print("Enter your name : ");
        String s = sc.nextLine();
        System.out.print(" your name is : " + s);
    }
}
