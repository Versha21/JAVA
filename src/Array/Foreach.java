import java.util.*;
public class Foreach {
    static void main(String[] args) {
    int[] arr={5,6,4,9,2,7,};
    for (int i = 0 ; i< arr.length;i++){
        arr[i] *= 2;
    }
    for (int ele : arr){
        System.out.print(ele + " ");
    }
    }
}
