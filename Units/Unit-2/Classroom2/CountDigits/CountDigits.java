
/**
 * This program checks how many digits a number has, 
 * then prints each by order.
 * @author Roy Bachar
 * @version 0.0.1
 */

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        final byte TWO_DIGITS = 10, ONE_DIG = 1;
        final short THREE_DIGITS = 999;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = scan.nextInt();
        scan.close();

        // Check if a number has more than 3 digits
        if (num / 100 > THREE_DIGITS) {
            System.out.println("illegal number");
        } else if (num / 10 > TWO_DIGITS) {
            System.out.println("Three Digits " + num % 10 + " " + (num / 10) % 10 + " " + num / 100);

        } else if (num / 10 > ONE_DIG) {

            System.out.println("Two Digits " + num % 10 + " " + (num / 10) % 10);

        } else {
            System.out.println("One Digit " + num);
        }

    }
}
