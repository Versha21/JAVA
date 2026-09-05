import java.util.*;
public class SolidRectangle {
    public static void main(String[] args) {
        int n = 3;
        int m = 5;
        for (int i = 0; i < n ; i++) {
            //i = row
            for (int j = 0; j < m; j++) {
                //j = column
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
