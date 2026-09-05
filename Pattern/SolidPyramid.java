public class SolidPyramid {
    static void main(String[] args) {
        int n = 5;
        for (int i  = 1 ; i <= n ; i++){
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }
           /* for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            for (int m = 2; m <= i  ; m++){
                System.out.print("* ");
            }*/
            // OR OR OR OR //
            for (int k = 1; k <= 2*i-1; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

