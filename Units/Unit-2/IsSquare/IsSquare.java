/**
 * This program takes 4 side lengths of a rectangle and checks if it's a square or not.
 * @author (Roy Bachar)
 * @version (0.0.1)
 */

import java.util.Scanner;

public class IsSquare {
    public static void main(String[] args) {
        final int SIDES_IN_RECTANGLE = 4;
        boolean isSquare = true;
        int sideNumber = 0;
        double sideLength;
        Scanner scanner = new Scanner(System.in);

        guideUser(sideNumber++);
        sideLength = scanner.nextDouble();

        while (sideNumber < SIDES_IN_RECTANGLE) {    
            guideUser(sideNumber++);
            if (scanner.nextDouble() != sideLength) {
                isSquare = false;
                break;
            }
        }

        scanner.close();
        System.out.println(isSquare ? "Square!" : "Not square!");
    }

    private static void guideUser(int sideNumber) {
        System.out.println("Enter the length of side number " +  
        ++sideNumber + ":");
    }
}
