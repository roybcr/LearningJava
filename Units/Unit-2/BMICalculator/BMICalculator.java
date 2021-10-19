
/**
 * BMICalculator Class 
 * A program that calculates the Body Mass Index (BMI) of a person.
 * @author (Roy Bachar) 
 * @version (0.0.1)
 */

import java.util.Scanner;

public class BMICalculator {
  public static void main(String[] args) {
    double weight;
    double height;

    Scanner scan = new Scanner(System.in);
    System.out.println("This program calculates the Body Mass Index (BMI) of a person.");

    // Getting data from the user

    System.out.println("Please enter your weight: ");
    weight = scan.nextDouble();

    System.out.println("Please enter your height: ");
    height = scan.nextDouble();

    scan.close();

    // Calculation section
    double calculatedIndex = weight / Math.pow(height, 2);
    System.out.println("The BMI is: " + calculatedIndex);
  }
}
