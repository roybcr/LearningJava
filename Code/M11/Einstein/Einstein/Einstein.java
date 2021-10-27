
/**
 * This class simulates the Einstein Magic Game.
 * @author Roy Bachar
 * @version 0.0.1
 */

import java.util.Scanner;

public class Einstein {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Einstein magic game.");
        System.out.println("Please enter a 3 digit positive whose first and last digit are different: ");
        
        short input = scan.nextShort();
        scan.close();

        if (input / 100 < 0 || input / 100 > 9) {
            System.out.println("The number you entered is not a 3 digit positive number");
            

        } else if (input / 100 == input % 10) {
            System.out.println("The first and the last digits of the number should be different");

        } else {
            System.out.println("User number is: " + input);

        }

    }
}
