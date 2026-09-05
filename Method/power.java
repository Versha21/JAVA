import java.util.*;
public class power {
    private static void Printpower(int n,int x) {
        int result = 1;
        for (int i=1;i<=x;i++) {
            result = result * n;
        }
            System.out.println(n + " raised to the power " + x + " is: " + result);
        return;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n= sc.nextInt();
        System.out.print("Enter the power:");
        int x= sc.nextInt();
        Printpower(n,x);
    }
}
