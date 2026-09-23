import java.util.*;
public class declaration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        //input
        //row
        int [][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            //columns
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        //output
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
