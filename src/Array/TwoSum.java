import java.util.*;
public class TwoSum {
    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int[] arr = {2, 7, 11, 15};
        int target =15 ;
        System.out.println(ts.twosum(arr, target)); // should print true
    }

    public boolean twosum(int[] arr, int target) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Two Sum");
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target)
                    return true;
            }
        }
        return false;
    }
}
