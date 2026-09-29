import java.util.*;
class Intersection {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Array Size of nums1: ");
        int x = sc.nextInt();
        int[] nums1 = new int[x];
        System.out.print("Enter the Array Element:");
        for (int i = 0; i < x; i++) {
            nums1[i] = sc.nextInt();
        }

        System.out.print("Enter the Array Size of nums2: ");
        int v = sc.nextInt();
        int[] nums2 = new int[v];
        System.out.print("Enter the Array Element:");
        for (int i = 0; i < v; i++) {
            nums2[i] = sc.nextInt();
        }

        int n = nums1.length;
        int m = nums2.length;

        int i = 0;
        int j = 0;

        int[] ans = new int[Math.min(n, m)];
        int k = 0;

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        while (i < n && j < m) {

            if (nums1[i] == nums2[j]) {
                ans[k] = nums1[i];
                k++;
                i++;
                j++;
            }
            else if (nums1[i] < nums2[j]) {
                i++;
            }
            else {
                j++;
            }
        }

        System.out.println(Arrays.toString(Arrays.copyOf(ans, k)));
    }
}
