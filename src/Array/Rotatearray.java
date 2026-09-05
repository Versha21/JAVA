import java.util.Scanner;

public class Rotatearray {
    static void main(String[] args) {
     int [] arr={12,15,14,2,6,8,4};
     int n = arr.length;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rotation count: ");
        int d = sc.nextInt();
        d %= n;
     reverse(arr,0,d-1);
     reverse(arr,d,d-1);
     reverse(arr , 0,n-1);
        System.out.print("Rotated array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
    static void reverse(int []arr,int i,int j) {
        while(i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
