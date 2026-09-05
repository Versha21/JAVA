import java.util.*;
public class problem2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array Size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the Array Element:");
        for(int i = 0;i < n ; i++) {
            arr[i] = sc.nextInt();
        }
            int sum = 0;
            for(int i = 0;i < n ; i++){
                sum += arr[i];
        }
        System.out.println("Sum of Arrays: "+sum);
    }
}
