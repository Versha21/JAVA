public class abcdPyramid {
    static void main(String[] args) {
        int n = 4;
        for (int i = 1; i<=n;i++){
            for (int j = 1;j <=n - i;j++){
                System.out.print("  ");
            }
            for (int j = 1;j <= i;j++){
                int a = j;
                int b = 'A'-1;
                int answer = a+b;
                char finalAnswer = (char)answer;
                System.out.print(finalAnswer+" ");
            }
            for (int j = 1; j<= i-1 ; j++){
                int a = j;
                int b = 'A';
                int answer = a+b;
                char finalAnswer = (char)answer;
                System.out.print(finalAnswer+" ");
            }

            System.out.println();
        }
    }
}
