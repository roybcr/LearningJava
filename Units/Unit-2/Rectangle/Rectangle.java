
/**
 * Rectangle Class
 * This class represents a Rectangle object that has width, height, perimeter and area.
 * @author (Roy Bachar)
 * @version (0.0.1)
 */

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        double width, height, perimeter, area;
        Scanner scan = new Scanner(System.in);

        System.out.println("This program calculates the perimeter and area of a rectangle.");

        // Getting data from the user
        System.out.println("Please enter the width: ");
        width = scan.nextDouble();

        System.out.println("Please enter the height: ");
        height = scan.nextDouble();

        scan.close();

        // Calculation section
        perimeter = 2 * (width + height);
        area = width * height;

        System.out.println("The Perimeter is: " + perimeter);
        System.out.println("The Area is: " + area);

    }
}
