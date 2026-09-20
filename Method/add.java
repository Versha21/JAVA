
import java.util.Scanner;
public class add {
    public static int calculatesum(int a,int b) {
        int sum = a+b ;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of a : ");
        int a = sc.nextInt();
        System.out.print("Enter number of b : ");
        int b = sc.nextInt();


        int sum = calculatesum(a,b);
        System.out.println("print the sum : " + sum);
    }
}
