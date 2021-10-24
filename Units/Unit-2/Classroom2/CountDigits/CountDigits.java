
/**
 * This program checks how many digits a number has, 
 * then prints each by order.
 * @author Roy Bachar
 * @version 0.0.1
 */

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        final byte ONE_DIG = 1;
        final short THREE_DIGITS = 999;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        short num = scan.nextShort();
        scan.close();
        
        short units = (short)(num % 10);
        short tens = (short)(num / 10);
        short hundreds = (short)(num / 100);

        if (num > THREE_DIGITS) {
            System.out.println("illegal number");

        } else if (hundreds > ONE_DIG) {
            System.out.println("Three Digits " + units + " " + tens % 10 + " " + hundreds);

        } else if (tens > ONE_DIG) {
            System.out.println("Two Digits " + units + " " + tens % 10);

        } else {
            System.out.println("One Digit " + num);
        }

    }
}
