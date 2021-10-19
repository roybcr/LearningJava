
/**
 * This program takes a 3-digit number and prints out each digit starts from the units,
 * in a seperate line.
 * @author (Roy Bachar)
 * @version (0.0.1)
 */

import java.util.Scanner;

public class ThreeDigit {
    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);

        System.out.println("Given a 3 digit number,This program prints each digit starts from the units, in a seperate line.");
        
        System.out.println("Please enter a three-digit number: ");
        num = scan.nextInt();
        
        scan.close();

        System.out.println(num % 10); // Units
        System.out.println(num / 10 % 10); // Tens
        System.out.println(num / 100); // Hundreds

    }
}
