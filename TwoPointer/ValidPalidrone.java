package strings;

import java.util.Scanner;

public class ValidPalidrone{
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int n = s.length();
        int i = 0;
        int j = n-1;
        while(i<j){
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }

            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) j--;

            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.println(isPalindrome(s));
    }
}



