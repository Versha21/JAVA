import java.util.Scanner;
public class concatenation {
    public static void main(String[] args) {
        String firstname = "versha";
        String lastname = "dewangan";
        String fullname = firstname + lastname + "@" + "gmail.com";
        System.out.println(fullname);
        System.out.println(fullname.length());

        //charAt
        for(int i = 0 ;  i < fullname.length(); i++){
            System.out.println(fullname.charAt(i));
        }
    }
}
