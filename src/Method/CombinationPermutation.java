import java.util.Scanner;
public class CombinationPermutation{
    public static int fact(int x){
    int xfact = 1;
    for(int i=1;i<=x;i++){
        xfact *= i;
    }
    return xfact ;
}
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no(n):");
        int n = sc.nextInt();
        System.out.print("Enter the no(r):");
        int r = sc.nextInt();
        //for ncr
        int ncr = fact(n)/(fact(r)* fact(n-r));
        System.out.println("Combination: "+ncr);
        //for npr
       int npr = fact(n)/ fact(n-r);
        System.out.println("Permutation: "+npr);
    }

}
