import java.util.*;
public class GCB {
    private static void printGCB(int n) {
        for (int i=1;i<=n;i++){
            if(n%i==0) {
                System.out.print(i+" ");
            }
        }
        return;
    }
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number:");
            int n= sc.nextInt();

            printGCB(n);
    }

}



