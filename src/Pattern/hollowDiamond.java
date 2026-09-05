public class hollowDiamond {
    static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <=n; i++){
                for (int j = 1; j<= n - i;j++){
                    System.out.print("  ");
                }
                if(i == 1) {
                    for (int j = 1; j <= 2 * i - 1; j++) {
                        System.out.print("* ");
                    }
                }else{
                System.out.print("* ");
                for (int k = 1; k <= 2*i-3;k++){
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n-1; i>=1;i--){
            for (int j = 1; j<= n - i;j++){
                System.out.print("  ");
            }
            if(i == 1) {
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("* ");
                }
            }else{
                System.out.print("* ");
                for (int k = 1; k <= 2*i-3;k++){
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
