
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
        
        System.out.println("Please Enter the Width: ");
        width = scan.nextDouble();

        System.out.println("Please Enter the Height: ");
        height = scan.nextDouble();

        scan.close();

        // Calculation section
        perimeter = 2 * (width + height);
        area = width * height;

        System.out.println("The Perimeter is: " + perimeter);
        System.out.println("The Area is: " + area);

    }
}
