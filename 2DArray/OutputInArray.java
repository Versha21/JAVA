import java.util.*;
public class OutputInArray {
    public static void main(String[] args) {
        int [][] arr = {{1,2,5,4,7},{5,4,78,98,8},{1,2,5,4,8}};
        System.out.println(arr.length +" " +arr[0].length);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
