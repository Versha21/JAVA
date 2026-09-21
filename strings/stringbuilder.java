import java.util.Scanner;
public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(2));

        //set char at index 0
        sb.setCharAt(0 , 'p');
        System.out.println(sb);

        sb.insert(0,'S');
        System.out.println(sb);

        //delete the extra n
        sb.delete(2,4);
        System.out.println(sb);
    }
}
