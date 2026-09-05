import java .util.*;
public class Swap {
   public static void swap(int a,int b) {
       a = a+b;
       b = a-b;
       a = a-b;
       System.out.println(a+" "+b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int a = sc.nextInt();
        System.out.print("Enter the second number:");
        int b = sc.nextInt();
        System.out.println(a+" "+b);
        swap(a,b);

    }
}
