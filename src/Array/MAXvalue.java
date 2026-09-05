import java.util.*;
public class MAXvalue {
    static void main(String[] args) {
        int[] arr = {10,10,10,10,10};
        int max = Integer.MIN_VALUE;
        for(int i = 0;i < arr.length ; i++) {
            if (max < arr[i])max=arr[i] ;
        }
        int smax = Integer.MIN_VALUE;
        for(int i = 0;i < arr.length ; i++) {
            if (smax < arr[i] && max!=arr[i])smax=arr[i] ;
        }
        if (smax ==Integer.MIN_VALUE){
            System.out.println("-1");
        }
        System.out.println("Max:"+max);
        System.out.println("Smallest max:"+smax);

    }
}
