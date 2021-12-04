
/**
 * Program that checks whether or not a String is a palindrome.
 * 
 * @author Roy Bachar
 * @version 0.0.1
 */

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        boolean isPalindrome = true;

        Scanner scan = new Scanner(System.in);
        String s1 = scan.next();
        scan.close();

        for (int i = 0; i < s1.length() / 2 && isPalindrome == true; i++) {
            isPalindrome = s1.charAt(i) == s1.charAt(s1.length() - i - 1);
        }

        System.out.println(isPalindrome + "\n\r");

    }
}
