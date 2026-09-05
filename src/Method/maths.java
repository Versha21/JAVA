import java.util.*;

import static java.lang.Math.*;

public class maths {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a=");
        int a= sc.nextInt();
        System.out.print("b=");
        int b= sc.nextInt();
        System.out.println("power:"+Math.pow(a,b));
        System.out.println("maximum number:"+max(a,b));
        System.out.println("Square Root :"+Math.sqrt(3.1415));
        System.out.println("Square Root :"+Math.cbrt(3.1415));
        //or so many math function are there.
    }
}
