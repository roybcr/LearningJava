/**
 * This class simulates the Einstein Magic Game.
 * @author Roy Bachar
 * @version 0.0.1
 */

import java.util.Scanner;

public class Einstein {

    public static void main(String[] args) {
        boolean VALID_INPUT_FLAG = false;
        final byte HUNDREDS = 100, TENS = 10, MINIMUM_DIFF = 99;
        final short TARGET = 1089;
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Einstein magic game.");
        System.out.println("Please enter a 3 digit positive number whose first and last digits are different:");
        
        short input = scan.nextShort();
        scan.close();
        
        // First digit assuming the input is valid.
        int firstDigit = input / HUNDREDS; 

        // Middle digit assuming the input is valid.
        int middleDigit = input / TENS % TENS; 
        int lastDigit = input % TENS;

        // Checking if the input is a valid 3 digit positive number
        if (firstDigit == 0 || firstDigit > 9) {
            System.out.println("The number you entered is not a 3 digit positive number");
            VALID_INPUT_FLAG = false;
        }

        // Checking if the first and last digits are different
        else if (firstDigit == lastDigit) {
            System.out.println("The first and the last digits of the number should be different");
            VALID_INPUT_FLAG = false;
        } 
        
        else {
            System.out.println("User number is: " + input);
            VALID_INPUT_FLAG = true;
        }

         // Only if the input is valid should the game continue! 
        if (VALID_INPUT_FLAG) {

            /* Whenever the last digit is greater than the first digit by 1, the difference
             * must be 99, so it's pretty reasonable to skip any extra calculations. */
            if (lastDigit - firstDigit == 1) {

                int difference = MINIMUM_DIFF; // 99;
                int reversedDiff = difference * TENS; // 990;
            
                System.out.println("Difference: " + difference);
                System.out.println("Reversed difference: " + reversedDiff);
            
                System.out.println("SUCCEEDED"); // Always 1089
            
            } else {

                /* Calculating the reversed input, then printing the absolute difference 
                 * between the two. */

                int reversedInput = (lastDigit * HUNDREDS) + (middleDigit * TENS) + firstDigit;
                int difference = Math.abs(input - reversedInput);
                
                // Again, checking if the diff is 99
                if (difference == MINIMUM_DIFF) {

                    int reversedDiff = difference * TENS; // 990;

                    System.out.println("Difference: " + difference);
                    System.out.println("Reversed difference: " + reversedDiff);
                    
                    System.out.println("SUCCEEDED");

                } else {

                    int diffFirstDigit = difference / HUNDREDS;
                    int diffMiddleDigit = difference / TENS % TENS;
                    int diffLastDigit = difference % TENS;
                    int reversedDiff = (diffLastDigit * HUNDREDS) + (diffMiddleDigit * TENS) + diffFirstDigit;

                    System.out.println("Difference: " + difference);
                    System.out.println("Reversed difference: " + reversedDiff);
                    
                    System.out.println(difference + reversedDiff == TARGET ? "SUCCEEDED" : "FAILED");

                }

            }

        }

    }
}