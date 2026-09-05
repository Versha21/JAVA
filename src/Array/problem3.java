import java.util.*;
public class problem3{
    static void main(String[] args) {
        int[] arr = {11, 25, 36, 24, 328, 84, 87, 56, 95, 45, 56};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int x = sc.nextInt();
        int count=0;
        for (int i=0;i<=arr.length;i++)
            if (arr[i] > x) {
                count++;
                System.out.print(arr[i]+"  ");
            }
    }
}
