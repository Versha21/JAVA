import java.util.*;
public class fibonacci {
    private static void PrintFibonacciSeries(int n) {
        int a = 0;
        int b = 1;
        int sum = 0;
        System.out.print(a+" ");
            System.out.print(b + " ");
for (int i=1;i<=n-2;i++){
        sum = a + b;
        System.out.print(sum + " ");
        a = b;
        b = sum;
    }
        return;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n= sc.nextInt();
        PrintFibonacciSeries(n);
    }
}
