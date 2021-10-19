
/**
 * This program takes a 3-digit number and prints ou each digit starts from the units,
 * in a seperate line.
 * @author (Roy Bachar)
 * @version (0.0.1)
 */

import java.util.Scanner;

public class ThreeDigit {
    public static void main(String[] args) {

        int num;

        // Initializing a new Scanner instance
        Scanner scan = new Scanner(System.in);
        System.out.println("Given a 3 digit number,This program prints each digit starts from the units, in a seperate line.");
        System.out.println("Please enter a three-digit number: ");
        num = scan.nextInt();

        int units = num % 10;
        num /= 10;
        int tens = num % 10;
        num /= 10;
        int hundreds = num;

        System.out.println(units);
        System.out.println(tens);
        System.out.println(hundreds);

        scan.close();

    }
}
