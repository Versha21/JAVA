import java.util.*;
public class LinearSearch {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the Elements:");
        for(int i = 0;i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        int x=34;
        boolean flag = false;
        for (int i = 0; i<= arr.length;i++) {
            if (arr[i] == x) {
                flag = true;
                break;
            }
        }
              if(flag==false)
                  System.out.println("Nhi Mila");
              else
                  System.out.println("Mil Gaya");
    }
}
