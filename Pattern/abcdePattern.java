public class abcdePattern {
    static void main(String[] args) {
        int n = 5;
        for (int i  = 1 ; i <= n ; i++){
            for (int j  = 1 ; j <= i ; j++){
               int a = n - j;
               int b = 'A';
               int  ans =  a+b;
               char finalAnswer = (char)ans;
                System.out.print(finalAnswer+" ");
            }
            System.out.println();
        }
    }
}
